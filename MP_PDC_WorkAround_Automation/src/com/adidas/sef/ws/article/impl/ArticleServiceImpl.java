package com.adidas.sef.ws.article.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.adidas.sef.mp.pdc.beans.ArticleBean;
import com.adidas.sef.ws.article.ArticleWs;
import com.adidas.sef.ws.article.ArticleWs_Service;
import com.adidas.sef.ws.schema.articledata.UpdateArticleRequest;
import com.adidas.sef.ws.schema.articledata.UpdateArticleRequests;
import com.adidas.sef.ws.schema.articledata.UpdateArticleResponse;
import com.adidas.sef.ws.schema.commondata.Errors;
import com.adidas.sef.ws.schema.modeldata.UpdateModelResponse;

/**
 * @author Satheesh_Injirapu
 * 
 */
public class ArticleServiceImpl {

    private static final Logger LOG = Logger.getLogger(ArticleServiceImpl.class);

    private ArticleWs_Service ss = new ArticleWs_Service();
    private ArticleWs port = ss.getArticlePort();

    public void invokeUpdateArticleService(List<ArticleBean> artListBean) {

        UpdateArticleRequests updateArtReqs = null;
        UpdateArticleRequest updateArtReq = null;
        try {

            for (ArticleBean artListData : artListBean) {
                updateArtReq = new UpdateArticleRequest();
                updateArtReq.setSeasonCode(artListData.getSeasonCode());
                updateArtReq.setArticleRangeId(artListData.getArticleRangeId());
                updateArtReq.setBrandCode(artListData.getBrandCode());
                updateArtReq.setBuyReadyStatusDescr(artListData.getBuyReadyStatusDescr());

                updateArtReqs = new UpdateArticleRequests();

                updateArtReqs.setUserName(artListData.getUsername());
                updateArtReqs.getUpdateArticleRequest().add(updateArtReq);

                UpdateArticleResponse updateArtRes = port.updateArticles(updateArtReqs);
                LOG.info(" update Done for Article RefID: "+updateArtReq.getArticleRangeId() +" and summery is: " + updateArtRes.getSummary().getSummaryMessage().toString());
                
            }

        } catch (Exception e) {
            LOG.error("Error Occured", e);
        }
    }

}
