package com.adidas.sef.mp.pdc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;




import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Satheesh_Injirapu
 * 
 */

public class POIXlsFile {

	private static final Logger log = Logger.getLogger(POIXlsFile.class.getName());
	private final static String BLANK_STRING="";

	private Workbook workbook;

	private HSSFWorkbook hssfWorkbook;
	private boolean isXlsxFile=false; 


	public POIXlsFile(File xlsFile) throws InvalidFormatException, IOException{
		readXlsFile(xlsFile);
	}

	private void readXlsFile(File xlsFile) throws InvalidFormatException, IOException{

		isXlsxFile = false;
		InputStream inputStream=new FileInputStream(xlsFile);

		if(xlsFile.getName().endsWith("xls")){
			setXlsxFile(false);
			hssfWorkbook = new HSSFWorkbook(inputStream);
		} else {
			setXlsxFile(true);
			workbook = new XSSFWorkbook(inputStream);
		}
		inputStream.close();
	}

	public Date getDateCellValue(int sheetNum,int rowNum,int cellNum){
		Date dateCellValue = null;


		if(isXlsxFile() && null != workbook){
			Cell cell=workbook.getSheetAt(sheetNum).getRow(rowNum).getCell(cellNum);
			dateCellValue = cell.getDateCellValue();
		}else if (!isXlsxFile() && null != hssfWorkbook) {
			HSSFCell hssfCell=hssfWorkbook.getSheetAt(sheetNum).getRow(rowNum).getCell((short) cellNum);
			dateCellValue = hssfCell.getDateCellValue();
		}

		return dateCellValue;
	}

	public String getCellContentValue(int sheetNum,int rowNum,int colNum){

		String cellValue = BLANK_STRING;

		try {
			if(isXlsxFile() && null != workbook){
				Cell cell=workbook.getSheetAt(sheetNum).getRow(rowNum).getCell(colNum);

				if(cell!=null && cell.getCellType()==Cell.CELL_TYPE_STRING && null!=cell.getStringCellValue() ){					
					cellValue = cell.getStringCellValue().trim();
				}else if(cell!=null && cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
					int indexOfDecimal=Double.toString(cell.getNumericCellValue()).indexOf(".");
					if(indexOfDecimal>0){
						cellValue = Double.toString(cell.getNumericCellValue()).substring(0,indexOfDecimal);
					}else{
						cellValue = Double.toString(cell.getNumericCellValue());
					}
				} else {
					if(cell!=null && cell.getStringCellValue()!=null ){
					cellValue = cell.getStringCellValue().trim();
					}
				}

			}else if (!isXlsxFile() && null != hssfWorkbook) {
				HSSFCell hssfCell=hssfWorkbook.getSheetAt(sheetNum).getRow(rowNum).getCell((short) colNum);
				if(hssfCell!=null && hssfCell.getCellType()==HSSFCell.CELL_TYPE_STRING && null!=hssfCell.getRichStringCellValue()){
					cellValue = hssfCell.getRichStringCellValue().getString().trim();
				}else if(hssfCell!=null && hssfCell.getCellType()==HSSFCell.CELL_TYPE_NUMERIC ){

					int indexOfDecimal=Double.toString(hssfCell.getNumericCellValue()).indexOf(".");
					if(indexOfDecimal>0){
						cellValue = Double.toString(hssfCell.getNumericCellValue()).substring(0,indexOfDecimal);
					}else{
						cellValue = Double.toString(hssfCell.getNumericCellValue());
					}

				} else {
					if(hssfCell!=null && hssfCell.getRichStringCellValue()!=null ){
					cellValue = hssfCell.getRichStringCellValue().getString().trim();
					}
				}
			}
		} catch(Exception exception) {
			log.info("Exception in getting Content at Sheet number:"+sheetNum+",Row number:"+rowNum+" and Cell number:"+colNum+". Exception Details: "+exception.getMessage());

		}

		return cellValue;
	}

	public int getPhysicalRowCount(int sheetNum){
		int count=0;


		try {
			if(isXlsxFile()){
				if (null != workbook) {
				    Sheet sheet=workbook.getSheetAt(sheetNum);
				    for (Row row : sheet) {
                        for (Cell cell : row) {
                            if (cell.getCellType() != Cell.CELL_TYPE_BLANK) {
                                if (cell.getCellType() != Cell.CELL_TYPE_STRING ||
                                    cell.getStringCellValue().length() > 0) {
                                    count++;
                                    break;
                                }
                            }
                        }
                    }
					//count = workbook.getSheetAt(sheetNum).getPhysicalNumberOfRows();
				}
			}
			else{
				if (null != hssfWorkbook) {
				   Sheet sheet=hssfWorkbook.getSheetAt(sheetNum);
				    for (Row row : sheet) {
				        for (Cell cell : row) {
				            if (cell.getCellType() != Cell.CELL_TYPE_BLANK) {
				                if (cell.getCellType() != Cell.CELL_TYPE_STRING ||
				                    cell.getStringCellValue().length() > 0) {
				                    count++;
				                    break;
				                }
				            }
				        }
				    }
					//count = hssfWorkbook.getSheetAt(sheetNum).getPhysicalNumberOfRows();
				}
			}
		} catch(Exception exception) {
			log.info("Exception in getting Row Count for Sheet Number:"+sheetNum+". Exception Details: "+exception.getMessage());
		}
		return count;
	}

	public int getPhysicalCellCount(int sheetNum,int rowNum){
		int count=0;


		try {
			if(isXlsxFile()){
				if (null != workbook) {
					count = workbook.getSheetAt(sheetNum).getRow(rowNum).getPhysicalNumberOfCells();

				}
			}
			else{
				if (null != hssfWorkbook) {
					count = hssfWorkbook.getSheetAt(sheetNum).getRow(rowNum).getPhysicalNumberOfCells();
				}
			}
		} catch(Exception exception) {
			log.info("Exception in getting Cell Count for Sheet Number:"+sheetNum+" and Row Number:"+rowNum+". Exception Details: "+exception.getMessage());
		}

		return count;
	}
	private boolean isXlsxFile() {
		return this.isXlsxFile;
	}

	private void setXlsxFile(boolean isXlsxFile) {
		this.isXlsxFile = isXlsxFile;
	}

}
