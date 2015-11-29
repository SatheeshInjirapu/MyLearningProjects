package com.adidas.sef.ws.model.impl;


import java.util.List;

import org.apache.log4j.Logger;

import com.adidas.sef.mp.pdc.beans.ModelBean;
import com.adidas.sef.ws.model.ModelWs;
import com.adidas.sef.ws.model.ModelWs_Service;
import com.adidas.sef.ws.schema.modeldata.UpdateModelRequest;
import com.adidas.sef.ws.schema.modeldata.UpdateModelRequests;
import com.adidas.sef.ws.schema.modeldata.UpdateModelResponse;

/**
 * @author Satheesh_Injirapu
 * 
 */
public class ModelServiceImpl {

    private static final Logger LOG = Logger.getLogger(ModelServiceImpl.class);

    private ModelWs_Service ss = new ModelWs_Service();
    private ModelWs port = ss.getModelPort();

    public void invokeUpdateModelService(List<ModelBean> mdlListBean) {

        UpdateModelRequest updateMdlReq = null;
        UpdateModelRequests updateMdlReqs = null;
        try {

            for (ModelBean mdlListData : mdlListBean) {
                updateMdlReq = new UpdateModelRequest();
                updateMdlReq.setSeasonCode(mdlListData.getSeasonCode());
                updateMdlReq.setModelRangeId(mdlListData.getModelRangeId());
                updateMdlReq.setBrandCode(mdlListData.getBrandCode());
                updateMdlReq.setBuyReadyStatusDescr(mdlListData.getBuyReadyStatusDescr());
                
                updateMdlReqs = new UpdateModelRequests();

                updateMdlReqs.setUserName(mdlListData.getUsername());
                updateMdlReqs.getUpdateModelRequest().add(updateMdlReq);

                UpdateModelResponse updatemdlRes = port.updateModels(updateMdlReqs);
                LOG.info("Update done for Model "+updateMdlReq.getModelRangeId()+" and updated model summery  is : " + updatemdlRes.getSummary().getSummaryMessage().toString());
            }

        } catch (Exception e) {
            LOG.error("Error Occured invokeUpdateModelService ", e);
        }
    }

}
