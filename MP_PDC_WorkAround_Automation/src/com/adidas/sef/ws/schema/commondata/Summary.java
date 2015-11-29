
package com.adidas.sef.ws.schema.commondata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for summary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="summary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summaryMessageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="summaryMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "summary", propOrder = {
    "summaryMessageCode",
    "summaryMessage"
})
public class Summary {

    @XmlElement(required = true)
    protected String summaryMessageCode;
    @XmlElement(required = true)
    protected String summaryMessage;

    /**
     * Gets the value of the summaryMessageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryMessageCode() {
        return summaryMessageCode;
    }

    /**
     * Sets the value of the summaryMessageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryMessageCode(String value) {
        this.summaryMessageCode = value;
    }

    /**
     * Gets the value of the summaryMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryMessage() {
        return summaryMessage;
    }

    /**
     * Sets the value of the summaryMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryMessage(String value) {
        this.summaryMessage = value;
    }

}
