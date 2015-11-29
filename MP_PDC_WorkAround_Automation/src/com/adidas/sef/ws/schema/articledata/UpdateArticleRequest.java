
package com.adidas.sef.ws.schema.articledata;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.adidas.sef.ws.schema.commondata.DistributionChannels;
import com.adidas.sef.ws.schema.commondata.SellingRegionCodes;
import com.adidas.sef.xmladapter.XmlDateAdapter;


/**
 * <p>Java class for updateArticleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateArticleRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="articleRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mrktProposedColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.adidas.com/sef/ws/schema/commondata}decimalTwoPrec" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktDepartment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="leadColorway" type="{http://www.adidas.com/sef/ws/schema/articledata}characterType" minOccurs="0"/>
 *         &lt;element name="physicalColorway" type="{http://www.adidas.com/sef/ws/schema/articledata}characterType" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.adidas.com/sef/ws/schema/commondata}floatTwoPrec" minOccurs="0"/>
 *         &lt;element name="betterPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentTrackCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transportLeadTimeCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="distributionChannels" type="{http://www.adidas.com/sef/ws/schema/articledata}distributionChannels" minOccurs="0"/>
 *         &lt;element name="ffmModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessModelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="articleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConsumerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="putOnHold" type="{http://www.adidas.com/sef/ws/schema/articledata}characterType" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sellingRegionCodes" type="{http://www.adidas.com/sef/ws/schema/articledata}sellingRegionCodes" minOccurs="0"/>
 *         &lt;element name="specialUsageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dropFlag" type="{http://www.adidas.com/sef/ws/schema/articledata}characterType" minOccurs="0"/>
 *         &lt;element name="replenishmentFlag" type="{http://www.adidas.com/sef/ws/schema/articledata}characterType" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="updateArticleNullAttrs" type="{http://www.adidas.com/sef/ws/schema/articledata}updateArticleNullAttrs" minOccurs="0"/>
 *         &lt;element name="groupArticleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeCycleStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateArticleRequest", propOrder = {
    "seasonCode",
    "articleRangeId",
    "mrktForecast",
    "mrktProposedColor",
    "rrp",
    "rrpCurrencyCode",
    "mrktDepartment",
    "productManagerName",
    "splUsage",
    "leadColorway",
    "physicalColorway",
    "targetFOB",
    "betterPlaceCode",
    "targetFOBCurrencyCode",
    "developmentTrackCode",
    "transportLeadTimeCode",
    "distributionChannels",
    "ffmModelCode",
    "businessModelCode",
    "mrktClassificationCode",
    "articleTypeCode",
    "priceSegmentCode",
    "targetConsumerCode",
    "putOnHold",
    "retailIntroDate",
    "retailExitDate",
    "sellingRegionCodes",
    "specialUsageCode",
    "dropFlag",
    "replenishmentFlag",
    "quarter",
    "buyReadyStatusDescr",
    "buyReadyValidationStatus",
    "earliestBuyReadyDate",
    "updateArticleNullAttrs",
    "groupArticleNumber",
    "modelNumber",
    "timeLineCode",
    "transportationType",
    "lifeCycleStatusCode",
    "productDivision",
    "brandCode",
    "developmentRegion"
})
public class UpdateArticleRequest {

    @XmlElement(required = true)
    protected String seasonCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long articleRangeId;
    protected Long mrktForecast;
    protected String mrktProposedColor;
    protected BigDecimal rrp;
    protected String rrpCurrencyCode;
    protected String mrktDepartment;
    protected String productManagerName;
    protected String splUsage;
    protected String leadColorway;
    protected String physicalColorway;
    protected Float targetFOB;
    protected String betterPlaceCode;
    protected String targetFOBCurrencyCode;
    protected Long developmentTrackCode;
    protected Long transportLeadTimeCode;
    protected DistributionChannels distributionChannels;
    protected String ffmModelCode;
    protected String businessModelCode;
    protected String mrktClassificationCode;
    protected String articleTypeCode;
    protected String priceSegmentCode;
    protected String targetConsumerCode;
    protected String putOnHold;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date retailIntroDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date retailExitDate;
    protected SellingRegionCodes sellingRegionCodes;
    protected String specialUsageCode;
    protected String dropFlag;
    protected String replenishmentFlag;
    protected String quarter;
    protected String buyReadyStatusDescr;
    protected String buyReadyValidationStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date earliestBuyReadyDate;
    protected UpdateArticleNullAttrs updateArticleNullAttrs;
    protected String groupArticleNumber;
    protected String modelNumber;
    protected String timeLineCode;
    protected String transportationType;
    protected String lifeCycleStatusCode;
    protected String productDivision;
    protected String brandCode;
    protected String developmentRegion;

    /**
     * Gets the value of the seasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeasonCode() {
        return seasonCode;
    }

    /**
     * Sets the value of the seasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeasonCode(String value) {
        this.seasonCode = value;
    }

    /**
     * Gets the value of the articleRangeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getArticleRangeId() {
        return articleRangeId;
    }

    /**
     * Sets the value of the articleRangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setArticleRangeId(Long value) {
        this.articleRangeId = value;
    }

    /**
     * Gets the value of the mrktForecast property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMrktForecast() {
        return mrktForecast;
    }

    /**
     * Sets the value of the mrktForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMrktForecast(Long value) {
        this.mrktForecast = value;
    }

    /**
     * Gets the value of the mrktProposedColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktProposedColor() {
        return mrktProposedColor;
    }

    /**
     * Sets the value of the mrktProposedColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktProposedColor(String value) {
        this.mrktProposedColor = value;
    }

    /**
     * Gets the value of the rrp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrp() {
        return rrp;
    }

    /**
     * Sets the value of the rrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrp(BigDecimal value) {
        this.rrp = value;
    }

    /**
     * Gets the value of the rrpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrpCurrencyCode() {
        return rrpCurrencyCode;
    }

    /**
     * Sets the value of the rrpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrpCurrencyCode(String value) {
        this.rrpCurrencyCode = value;
    }

    /**
     * Gets the value of the mrktDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktDepartment() {
        return mrktDepartment;
    }

    /**
     * Sets the value of the mrktDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktDepartment(String value) {
        this.mrktDepartment = value;
    }

    /**
     * Gets the value of the productManagerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductManagerName() {
        return productManagerName;
    }

    /**
     * Sets the value of the productManagerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductManagerName(String value) {
        this.productManagerName = value;
    }

    /**
     * Gets the value of the splUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplUsage() {
        return splUsage;
    }

    /**
     * Sets the value of the splUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplUsage(String value) {
        this.splUsage = value;
    }

    /**
     * Gets the value of the leadColorway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadColorway() {
        return leadColorway;
    }

    /**
     * Sets the value of the leadColorway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadColorway(String value) {
        this.leadColorway = value;
    }

    /**
     * Gets the value of the physicalColorway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalColorway() {
        return physicalColorway;
    }

    /**
     * Sets the value of the physicalColorway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalColorway(String value) {
        this.physicalColorway = value;
    }

    /**
     * Gets the value of the targetFOB property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTargetFOB() {
        return targetFOB;
    }

    /**
     * Sets the value of the targetFOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTargetFOB(Float value) {
        this.targetFOB = value;
    }

    /**
     * Gets the value of the betterPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetterPlaceCode() {
        return betterPlaceCode;
    }

    /**
     * Sets the value of the betterPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetterPlaceCode(String value) {
        this.betterPlaceCode = value;
    }

    /**
     * Gets the value of the targetFOBCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFOBCurrencyCode() {
        return targetFOBCurrencyCode;
    }

    /**
     * Sets the value of the targetFOBCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFOBCurrencyCode(String value) {
        this.targetFOBCurrencyCode = value;
    }

    /**
     * Gets the value of the developmentTrackCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDevelopmentTrackCode() {
        return developmentTrackCode;
    }

    /**
     * Sets the value of the developmentTrackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDevelopmentTrackCode(Long value) {
        this.developmentTrackCode = value;
    }

    /**
     * Gets the value of the transportLeadTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTransportLeadTimeCode() {
        return transportLeadTimeCode;
    }

    /**
     * Sets the value of the transportLeadTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTransportLeadTimeCode(Long value) {
        this.transportLeadTimeCode = value;
    }

    /**
     * Gets the value of the distributionChannels property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannels }
     *     
     */
    public DistributionChannels getDistributionChannels() {
        return distributionChannels;
    }

    /**
     * Sets the value of the distributionChannels property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannels }
     *     
     */
    public void setDistributionChannels(DistributionChannels value) {
        this.distributionChannels = value;
    }

    /**
     * Gets the value of the ffmModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFfmModelCode() {
        return ffmModelCode;
    }

    /**
     * Sets the value of the ffmModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFfmModelCode(String value) {
        this.ffmModelCode = value;
    }

    /**
     * Gets the value of the businessModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessModelCode() {
        return businessModelCode;
    }

    /**
     * Sets the value of the businessModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessModelCode(String value) {
        this.businessModelCode = value;
    }

    /**
     * Gets the value of the mrktClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktClassificationCode() {
        return mrktClassificationCode;
    }

    /**
     * Sets the value of the mrktClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktClassificationCode(String value) {
        this.mrktClassificationCode = value;
    }

    /**
     * Gets the value of the articleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArticleTypeCode() {
        return articleTypeCode;
    }

    /**
     * Sets the value of the articleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArticleTypeCode(String value) {
        this.articleTypeCode = value;
    }

    /**
     * Gets the value of the priceSegmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceSegmentCode() {
        return priceSegmentCode;
    }

    /**
     * Sets the value of the priceSegmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceSegmentCode(String value) {
        this.priceSegmentCode = value;
    }

    /**
     * Gets the value of the targetConsumerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetConsumerCode() {
        return targetConsumerCode;
    }

    /**
     * Sets the value of the targetConsumerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetConsumerCode(String value) {
        this.targetConsumerCode = value;
    }

    /**
     * Gets the value of the putOnHold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPutOnHold() {
        return putOnHold;
    }

    /**
     * Sets the value of the putOnHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPutOnHold(String value) {
        this.putOnHold = value;
    }

    /**
     * Gets the value of the retailIntroDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRetailIntroDate() {
        return retailIntroDate;
    }

    /**
     * Sets the value of the retailIntroDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailIntroDate(Date value) {
        this.retailIntroDate = value;
    }

    /**
     * Gets the value of the retailExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getRetailExitDate() {
        return retailExitDate;
    }

    /**
     * Sets the value of the retailExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailExitDate(Date value) {
        this.retailExitDate = value;
    }

    /**
     * Gets the value of the sellingRegionCodes property.
     * 
     * @return
     *     possible object is
     *     {@link SellingRegionCodes }
     *     
     */
    public SellingRegionCodes getSellingRegionCodes() {
        return sellingRegionCodes;
    }

    /**
     * Sets the value of the sellingRegionCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellingRegionCodes }
     *     
     */
    public void setSellingRegionCodes(SellingRegionCodes value) {
        this.sellingRegionCodes = value;
    }

    /**
     * Gets the value of the specialUsageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialUsageCode() {
        return specialUsageCode;
    }

    /**
     * Sets the value of the specialUsageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialUsageCode(String value) {
        this.specialUsageCode = value;
    }

    /**
     * Gets the value of the dropFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDropFlag() {
        return dropFlag;
    }

    /**
     * Sets the value of the dropFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDropFlag(String value) {
        this.dropFlag = value;
    }

    /**
     * Gets the value of the replenishmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplenishmentFlag() {
        return replenishmentFlag;
    }

    /**
     * Sets the value of the replenishmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplenishmentFlag(String value) {
        this.replenishmentFlag = value;
    }

    /**
     * Gets the value of the quarter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarter(String value) {
        this.quarter = value;
    }

    /**
     * Gets the value of the buyReadyStatusDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyReadyStatusDescr() {
        return buyReadyStatusDescr;
    }

    /**
     * Sets the value of the buyReadyStatusDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyReadyStatusDescr(String value) {
        this.buyReadyStatusDescr = value;
    }

    /**
     * Gets the value of the buyReadyValidationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyReadyValidationStatus() {
        return buyReadyValidationStatus;
    }

    /**
     * Sets the value of the buyReadyValidationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyReadyValidationStatus(String value) {
        this.buyReadyValidationStatus = value;
    }

    /**
     * Gets the value of the earliestBuyReadyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEarliestBuyReadyDate() {
        return earliestBuyReadyDate;
    }

    /**
     * Sets the value of the earliestBuyReadyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestBuyReadyDate(Date value) {
        this.earliestBuyReadyDate = value;
    }

    /**
     * Gets the value of the updateArticleNullAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateArticleNullAttrs }
     *     
     */
    public UpdateArticleNullAttrs getUpdateArticleNullAttrs() {
        return updateArticleNullAttrs;
    }

    /**
     * Sets the value of the updateArticleNullAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateArticleNullAttrs }
     *     
     */
    public void setUpdateArticleNullAttrs(UpdateArticleNullAttrs value) {
        this.updateArticleNullAttrs = value;
    }

    /**
     * Gets the value of the groupArticleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupArticleNumber() {
        return groupArticleNumber;
    }

    /**
     * Sets the value of the groupArticleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupArticleNumber(String value) {
        this.groupArticleNumber = value;
    }

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the timeLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLineCode() {
        return timeLineCode;
    }

    /**
     * Sets the value of the timeLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLineCode(String value) {
        this.timeLineCode = value;
    }

    /**
     * Gets the value of the transportationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportationType() {
        return transportationType;
    }

    /**
     * Sets the value of the transportationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportationType(String value) {
        this.transportationType = value;
    }

    /**
     * Gets the value of the lifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * Sets the value of the lifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the productDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDivision() {
        return productDivision;
    }

    /**
     * Sets the value of the productDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDivision(String value) {
        this.productDivision = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the developmentRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentRegion() {
        return developmentRegion;
    }

    /**
     * Sets the value of the developmentRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentRegion(String value) {
        this.developmentRegion = value;
    }

}
