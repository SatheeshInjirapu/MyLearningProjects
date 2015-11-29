package com.adidas.sef.ws.schema.articledata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.adidas.sef.ws.schema.articledata package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateArticleRequest_QNAME = new QName(
            "http://www.adidas.com/sef/ws/schema/articledata", "updateArticleRequest");
    private final static QName _UpdateArticleResponse_QNAME = new QName(
            "http://www.adidas.com/sef/ws/schema/articledata", "updateArticleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.adidas.sef.ws.schema.articledata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateArticleRequests }
     * 
     */
    public UpdateArticleRequests createUpdateArticleRequests() {
        return new UpdateArticleRequests();
    }

    /**
     * Create an instance of {@link UpdateArticleResponse }
     * 
     */
    public UpdateArticleResponse createUpdateArticleResponse() {
        return new UpdateArticleResponse();
    }

    /**
     * Create an instance of {@link UpdateArticleNullAttrs }
     * 
     */
    public UpdateArticleNullAttrs createUpdateArticleNullAttrs() {
        return new UpdateArticleNullAttrs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticleRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/articledata", name = "updateArticleRequest")
    public JAXBElement<UpdateArticleRequest> createUpdateArticleRequest(UpdateArticleRequest value) {
        return new JAXBElement<UpdateArticleRequest>(_UpdateArticleRequest_QNAME, UpdateArticleRequest.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateArticleResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.adidas.com/sef/ws/schema/articledata", name = "updateArticleResponse")
    public JAXBElement<UpdateArticleResponse> createUpdateArticleResponse(UpdateArticleResponse value) {
        return new JAXBElement<UpdateArticleResponse>(_UpdateArticleResponse_QNAME, UpdateArticleResponse.class, null,
                value);
    }

}
