package com.adidas.sef.mp.pdc.datacorrection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.adidas.sef.mp.pdc.beans.ArticleBean;
import com.adidas.sef.mp.pdc.util.POIXlsFile;
/**
 * @author Satheesh_Injirapu
 * 
 */
public class ArticleDataPopulator {

    static Logger LOG = Logger.getLogger(ArticleDataPopulator.class);

    public List<ArticleBean> articleDataByExcelFile(File inputFile) {

        int START_LINE_NUMBER = 1;
        POIXlsFile poiXlsFile = null;
        List<ArticleBean> artBeanList = null;
        ArticleBean artData = null;
        int rowCount = 0;
        String userName=null;
        String domain=null;

        try {
            poiXlsFile = new POIXlsFile(inputFile);
            rowCount = poiXlsFile.getPhysicalRowCount(0);
            artBeanList = new ArrayList<ArticleBean>();
            for (int i = START_LINE_NUMBER; i < rowCount; i++) {
                artData = new ArticleBean();
                userName=poiXlsFile.getCellContentValue(0, i, 0).trim();
                if(StringUtils.isNotBlank(userName)){
                    
                    domain=userName.split("\\\\")[0];
                    userName=userName.split("\\\\")[1].toLowerCase();
                    artData.setUsername(domain+"\\"+userName);
                    artData.setSeasonCode(poiXlsFile.getCellContentValue(0, i, 1).trim());
                    artData.setArticleRangeId(Long.parseLong(poiXlsFile.getCellContentValue(0, i, 2).trim()));
                    artData.setBrandCode(poiXlsFile.getCellContentValue(0, i, 3).trim());
                    artData.setBuyReadyStatusDescr(poiXlsFile.getCellContentValue(0, i, 4).trim());
                    artBeanList.add(artData); 
                }
               
            }

            LOG.info("ArticleBeanslIst size :" + artBeanList.size());


        } catch (Exception e) {
            LOG.error("Error occured in ModelDataPopulator", e);

        }
        return artBeanList;

    }

}
