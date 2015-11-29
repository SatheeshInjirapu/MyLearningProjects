
package com.adidas.sef.ws.schema.modeldata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateModelNullAttrs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateModelNullAttrs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateModelNullAttr" type="{http://www.adidas.com/sef/ws/schema/modeldata}updateModelNullAttr" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModelNullAttrs", propOrder = {
    "updateModelNullAttr"
})
public class UpdateModelNullAttrs {

    protected List<UpdateModelNullAttr> updateModelNullAttr;

    /**
     * Gets the value of the updateModelNullAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateModelNullAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateModelNullAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateModelNullAttr }
     * 
     * 
     */
    public List<UpdateModelNullAttr> getUpdateModelNullAttr() {
        if (updateModelNullAttr == null) {
            updateModelNullAttr = new ArrayList<UpdateModelNullAttr>();
        }
        return this.updateModelNullAttr;
    }

}
