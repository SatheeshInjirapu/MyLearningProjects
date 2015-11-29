package com.adidas.sef.mp.pdc.datacorrection;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.adidas.sef.mp.pdc.beans.ArticleBean;
import com.adidas.sef.mp.pdc.beans.ModelBean;
import com.adidas.sef.mp.pdc.util.POIXlsFile;
import com.adidas.sef.ws.article.impl.ArticleServiceImpl;
import com.adidas.sef.ws.model.impl.ModelServiceImpl;

/**
 * @author Satheesh_Injirapu
 * 
 */
public class MPPDCServiceTrigger {

    private static final Logger LOG = Logger.getLogger(MPPDCServiceTrigger.class);

    /**
     * @param args
     */
    public static void main(String[] args) {

        String artXlsxPath = "C:\\CMDB\\MP_PDC_WorkAround\\inputFiles\\Article";
        String mdlXlsxPath = "C:\\CMDB\\MP_PDC_WorkAround\\inputFiles\\Model";
       /* String mdlXlsxPath = "D:\\Satheesh\\Satheesh_SystemExcellence\\MP_PDC\\Model";
        String artXlsxPath = "D:\\Satheesh\\Satheesh_SystemExcellence\\MP_PDC\\Article";*/

       modelXlsxDataProcessor(mdlXlsxPath);
        articleXlsxDataProcessor(artXlsxPath);
     /*   try{
            
      
       String xlsFile ="D:\\Satheesh\\Satheesh_ACS\\Working\\ACSChangeReq\\TranslationAutomation\\Testing\\UAT\\TestData\\FW15EcomUAT_TestData - Copy.xlsx";
       POIXlsFile poiXlsFile = new POIXlsFile(new File(xlsFile));
       int rowCount = poiXlsFile.getPhysicalRowCount(0);
       LOG.info("Row count is :"+rowCount);
       
        }
        catch (Exception e){
            
        }
*/
    }

    private static void modelXlsxDataProcessor(String mdlXlsxPath) {

        File[] xlsxMdlFiles = null;
        ModelDataPopulator mdlDataPopulator = null;
        List<ModelBean> mdlBeanList = null;

        try {

            xlsxMdlFiles = new File(mdlXlsxPath).listFiles();
            LOG.info("Total no of files : " + xlsxMdlFiles.length);

            for (File xlsxFile : xlsxMdlFiles) {
                if (xlsxFile.isFile()) {
                    LOG.info("File name is  : " + xlsxFile.getName());
                    mdlDataPopulator = new ModelDataPopulator();
                    mdlBeanList = mdlDataPopulator.modelDataByExcelFile(xlsxFile);
                   splitRequestsByMaxLimit(mdlBeanList, mdlBeanList.size());

                   if (xlsxFile.exists()) {
                        xlsxFile.delete();
                  }

                }
            }
        } catch (Exception e) {

        }

    }

    private static void articleXlsxDataProcessor(String artXlsxPath) {

        File[] xlsxArtFiles = null;
        ArticleDataPopulator artDataPopulator = null;
        List<ArticleBean> artBeanList = null;

        try {

            xlsxArtFiles = new File(artXlsxPath).listFiles();

            for (File xlsxFile : xlsxArtFiles) {
                if (xlsxFile.isFile()) {
                    artDataPopulator = new ArticleDataPopulator();
                    artBeanList = artDataPopulator.articleDataByExcelFile(xlsxFile);
                    splitRequestsByMaxLimit(artBeanList, artBeanList.size());

                    if (xlsxFile.exists()) {
                        xlsxFile.delete();
                    }

                }
            }
        } catch (Exception e) {
            LOG.info("Error in articleXlsxDataProcessor ", e);
        }

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void splitRequestsByMaxLimit(List beanList, int recordRowCnt) {

        ArticleServiceImpl artServiceImpl = null;
        ModelServiceImpl mdlServiceImpl = null;

        try {

            LOG.info("Record count is :" + recordRowCnt);

            if (beanList.get(0) instanceof ModelBean) {
                mdlServiceImpl = new ModelServiceImpl();
                mdlServiceImpl.invokeUpdateModelService(beanList);
            } else {
                artServiceImpl = new ArticleServiceImpl();
                artServiceImpl.invokeUpdateArticleService(beanList);
            }

        }

        catch (Exception e) {
            LOG.info("Error in splitRequestsByMaxLimit", e);
        }

    }

}
