
package com.adidas.sef.ws.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.adidas.sef.ws.schema.modeldata.UpdateModelRequests;
import com.adidas.sef.ws.schema.modeldata.UpdateModelResponse;



/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ModelWs", targetNamespace = "http://www.adidas.com/sef/ws/model")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.adidas.sef.ws.schema.modeldata.ObjectFactory.class,
    com.adidas.sef.ws.schema.modeldata.ObjectFactory.class
})
public interface ModelWs {



    /**
     * 
     * @param updateModelReqs
     * @return
     *     returns com.adidas.sef.ws.schema.modeldata.UpdateModelResponse
     * @throws SystemExcellenceFaultMessage
     */
    @WebMethod(action = "http://www.adidas.com/sef/ws/updateModels")
    @WebResult(name = "updateModelResponse", targetNamespace = "http://www.adidas.com/sef/ws/schema/modeldata", partName = "updateModelRes")
    public UpdateModelResponse updateModels(
        @WebParam(name = "updateModelRequests", targetNamespace = "http://www.adidas.com/sef/ws/schema/modeldata", partName = "updateModelReqs")
        UpdateModelRequests updateModelReqs)   throws SystemExcellenceFaultMessage
        ;
      
    ;

    

}
