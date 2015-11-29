package com.adidas.sef.mp.pdc.datacorrection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.adidas.sef.mp.pdc.beans.ModelBean;
import com.adidas.sef.mp.pdc.util.POIXlsFile;

import org.apache.commons.lang.StringUtils;
/**
 * @author Satheesh_Injirapu
 * 
 */
public class ModelDataPopulator {

    static Logger LOG = Logger.getLogger(ModelDataPopulator.class);

    public List<ModelBean> modelDataByExcelFile(File inputFile) {

        int START_LINE_NUMBER = 1;
        POIXlsFile poiXlsFile = null;
        List<ModelBean> modelBeanList = null;
        ModelBean mdlData = null;
        int rowCount = 0;
        String userName=null;
        String domain=null;

        try {
            poiXlsFile = new POIXlsFile(inputFile);
            rowCount = poiXlsFile.getPhysicalRowCount(0);
            modelBeanList = new ArrayList<ModelBean>();
            for (int i = START_LINE_NUMBER; i < rowCount; i++) {
                mdlData = new ModelBean();
                userName=poiXlsFile.getCellContentValue(0, i, 0).trim();
                
                if (StringUtils.isNotBlank(userName) ){
                    
                    domain=userName.split("\\\\")[0];
                    userName=userName.split("\\\\")[1].toLowerCase();
                    mdlData.setUsername(domain+"\\"+userName);
                    mdlData.setSeasonCode(poiXlsFile.getCellContentValue(0, i, 1).trim());
                    mdlData.setModelRangeId(Long.parseLong(poiXlsFile.getCellContentValue(0, i, 2).trim()));
                    mdlData.setBrandCode(poiXlsFile.getCellContentValue(0, i, 3).trim());
                    mdlData.setBuyReadyStatusDescr(poiXlsFile.getCellContentValue(0, i, 4).trim());
                    modelBeanList.add(mdlData);
                    
                }
              
            }
            
            LOG.info("ModelBeanslIst size :"+modelBeanList.size());
            
           

        } catch (Exception e) {
            LOG.error("Error occured in ModelDataPopulator", e);

        }
        return modelBeanList;

    }
}
