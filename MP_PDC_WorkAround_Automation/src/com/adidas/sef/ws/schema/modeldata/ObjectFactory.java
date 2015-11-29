
package com.adidas.sef.ws.schema.modeldata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.adidas.sef.ws.schema.articledata.UpdateArticleRequests;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.adidas.sef.ws.schema.modeldata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    
    private final static QName _UpdateModelResponse_QNAME = new QName("http://www.adidas.com/sef/ws/schema/modeldata", "updateModelResponse");
   
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.adidas.sef.ws.schema.modeldata
     * 
     */
    public ObjectFactory() {
    }

   
   

    /**
     * Create an instance of {@link UpdateArticleRequests }
     * 
     */
    public UpdateArticleRequests createUpdateModelRequests() {
        return new UpdateArticleRequests();
    }

    /**
     * Create an instance of {@link UpdateModelRequest }
     * 
     */
    public UpdateModelRequest createUpdateModelRequest() {
        return new UpdateModelRequest();
    }

   

    /**
     * Create an instance of {@link UpdateModelResponse }
     * 
     */
    public UpdateModelResponse createUpdateModelResponse() {
        return new UpdateModelResponse();
    }

  
  

    /**
     * Create an instance of {@link UpdateModelNullAttrs }
     * 
     */
    public UpdateModelNullAttrs createUpdateModelNullAttrs() {
        return new UpdateModelNullAttrs();
    }

   
    

  
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/modeldata", name = "updateModelResponse")
    public JAXBElement<UpdateModelResponse> createUpdateModelResponse(UpdateModelResponse value) {
        return new JAXBElement<UpdateModelResponse>(_UpdateModelResponse_QNAME, UpdateModelResponse.class, null, value);
    }

   
}
