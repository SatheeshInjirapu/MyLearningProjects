
package com.adidas.sef.ws.schema.articledata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateArticleNullAttrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateArticleNullAttrs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateArticleNullAttr" type="{http://www.adidas.com/sef/ws/schema/articledata}updateArticleNullAttr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateArticleNullAttrs", propOrder = {
    "updateArticleNullAttr"
})
public class UpdateArticleNullAttrs {

    protected List<UpdateArticleNullAttr> updateArticleNullAttr;

    /**
     * Gets the value of the updateArticleNullAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateArticleNullAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateArticleNullAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateArticleNullAttr }
     * 
     * 
     */
    public List<UpdateArticleNullAttr> getUpdateArticleNullAttr() {
        if (updateArticleNullAttr == null) {
            updateArticleNullAttr = new ArrayList<UpdateArticleNullAttr>();
        }
        return this.updateArticleNullAttr;
    }

}
