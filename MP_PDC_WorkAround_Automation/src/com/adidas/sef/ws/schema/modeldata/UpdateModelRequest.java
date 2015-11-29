
package com.adidas.sef.ws.schema.modeldata;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.adidas.sef.ws.schema.commondata.LocalUsageCodes;
import com.adidas.sef.ws.schema.commondata.SellingRegionCodes;
import com.adidas.sef.ws.schema.commondata.TechConceptCodes;
import com.adidas.sef.xmladapter.XmlDateAdapter;


/**
 * <p>Java class for updateModelRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateModelRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelRangeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="workingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNameShort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelNameLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceWorkingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="featuresAndBenefit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandAssetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constructionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manufacturingCapability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetTechnologyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="techConceptCodes" type="{http://www.adidas.com/sef/ws/schema/modeldata}techConceptCodes" minOccurs="0"/>
 *         &lt;element name="consumerBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="betterPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localUsageCodes" type="{http://www.adidas.com/sef/ws/schema/commondata}localUsageCodes" minOccurs="0"/>
 *         &lt;element name="rrp2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrp2CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportLeadTimeCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="developmentTrackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetConsumerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktProposedSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="putOnHold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeholderFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeHolderStyleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="targetFOB" type="{http://www.adidas.com/sef/ws/schema/commondata}floatTwoPrec" minOccurs="0"/>
 *         &lt;element name="targetFOBCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rrp" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rrpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrktForecast" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productManagerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporateMrktLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoryMrktLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ageGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sportsCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creationCenterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSourcingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetMaterialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retailIntroDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="retailExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sellingRegionCodes" type="{http://www.adidas.com/sef/ws/schema/commondata}sellingRegionCodes" minOccurs="0"/>
 *         &lt;element name="dropFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replenishmentFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicativeGIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productDivision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeLineCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transportationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developmentRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyStatusDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buyReadyValidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="earliestBuyReadyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="salesUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateModelNullAttrs" type="{http://www.adidas.com/sef/ws/schema/modeldata}updateModelNullAttrs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateModelRequest", propOrder = {
    "seasonCode",
    "modelRangeId",
    "workingNumber",
    "modelNameShort",
    "modelNameLong",
    "modelDescr",
    "referenceWorkingNumber",
    "businessUnitCode",
    "featuresAndBenefit",
    "priceSegmentCode",
    "subBrand",
    "brandAssetCode",
    "constructionTypeCode",
    "manufacturingCapability",
    "targetTechnologyCode",
    "techConceptCodes",
    "consumerBenefitCode",
    "betterPlaceCode",
    "localUsageCodes",
    "rrp2",
    "rrp2CurrencyCode",
    "transportLeadTimeCode",
    "developmentTrackCode",
    "targetConsumerCode",
    "mrktProposedSize",
    "putOnHold",
    "placeholderFlag",
    "placeHolderStyleCount",
    "targetFOB",
    "targetFOBCurrencyCode",
    "rrp",
    "rrpCurrencyCode",
    "mrktForecast",
    "productManagerName",
    "corporateMrktLineCode",
    "categoryMrktLineCode",
    "salesLineCode",
    "genderCode",
    "ageGroupCode",
    "sportsCategoryCode",
    "productTypeCode",
    "creationCenterCode",
    "targetSourcingCode",
    "targetMaterialCode",
    "quarter",
    "retailIntroDate",
    "retailExitDate",
    "sellingRegionCodes",
    "dropFlag",
    "replenishmentFlag",
    "indicativeGIM",
    "productDivision",
    "timeLineCode",
    "transportationType",
    "brandCode",
    "developmentRegion",
    "styleName",
    "modelStatus",
    "buyReadyStatusDescr",
    "buyReadyValidationStatus",
    "earliestBuyReadyDate",
    "salesUnitCode",
    "productClassCode",
    "updateModelNullAttrs"
})
public class UpdateModelRequest {

    @XmlElement(required = true)
    protected String seasonCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long modelRangeId;
    protected String workingNumber;
    protected String modelNameShort;
    protected String modelNameLong;
    protected String modelDescr;
    protected String referenceWorkingNumber;
    protected String businessUnitCode;
    protected String featuresAndBenefit;
    protected String priceSegmentCode;
    protected String subBrand;
    protected String brandAssetCode;
    protected String constructionTypeCode;
    protected String manufacturingCapability;
    protected String targetTechnologyCode;
    protected TechConceptCodes techConceptCodes;
    protected String consumerBenefitCode;
    protected String betterPlaceCode;
    protected LocalUsageCodes localUsageCodes;
    protected BigDecimal rrp2;
    protected String rrp2CurrencyCode;
    protected BigInteger transportLeadTimeCode;
    protected String developmentTrackCode;
    protected String targetConsumerCode;
    protected String mrktProposedSize;
    protected String putOnHold;
    protected String placeholderFlag;
    protected BigInteger placeHolderStyleCount;
    protected Float targetFOB;
    protected String targetFOBCurrencyCode;
    protected BigDecimal rrp;
    protected String rrpCurrencyCode;
    protected Long mrktForecast;
    protected String productManagerName;
    protected String corporateMrktLineCode;
    protected String categoryMrktLineCode;
    protected String salesLineCode;
    protected String genderCode;
    protected String ageGroupCode;
    protected String sportsCategoryCode;
    protected String productTypeCode;
    protected String creationCenterCode;
    protected String targetSourcingCode;
    protected String targetMaterialCode;
    protected String quarter;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date retailIntroDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date retailExitDate;
    protected SellingRegionCodes sellingRegionCodes;
    protected String dropFlag;
    protected String replenishmentFlag;
    protected String indicativeGIM;
    protected String productDivision;
    protected String timeLineCode;
    protected String transportationType;
    protected String brandCode;
    protected String developmentRegion;
    protected String styleName;
    protected String modelStatus;
    protected String buyReadyStatusDescr;
    protected String buyReadyValidationStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(XmlDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date earliestBuyReadyDate;
    protected String salesUnitCode;
    protected String productClassCode;
    protected UpdateModelNullAttrs updateModelNullAttrs;

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
     * Gets the value of the modelRangeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getModelRangeId() {
        return modelRangeId;
    }

    /**
     * Sets the value of the modelRangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setModelRangeId(Long value) {
        this.modelRangeId = value;
    }

    /**
     * Gets the value of the workingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingNumber() {
        return workingNumber;
    }

    /**
     * Sets the value of the workingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingNumber(String value) {
        this.workingNumber = value;
    }

    /**
     * Gets the value of the modelNameShort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNameShort() {
        return modelNameShort;
    }

    /**
     * Sets the value of the modelNameShort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNameShort(String value) {
        this.modelNameShort = value;
    }

    /**
     * Gets the value of the modelNameLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNameLong() {
        return modelNameLong;
    }

    /**
     * Sets the value of the modelNameLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNameLong(String value) {
        this.modelNameLong = value;
    }

    /**
     * Gets the value of the modelDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelDescr() {
        return modelDescr;
    }

    /**
     * Sets the value of the modelDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelDescr(String value) {
        this.modelDescr = value;
    }

    /**
     * Gets the value of the referenceWorkingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceWorkingNumber() {
        return referenceWorkingNumber;
    }

    /**
     * Sets the value of the referenceWorkingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceWorkingNumber(String value) {
        this.referenceWorkingNumber = value;
    }

    /**
     * Gets the value of the businessUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnitCode() {
        return businessUnitCode;
    }

    /**
     * Sets the value of the businessUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnitCode(String value) {
        this.businessUnitCode = value;
    }

    /**
     * Gets the value of the featuresAndBenefit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeaturesAndBenefit() {
        return featuresAndBenefit;
    }

    /**
     * Sets the value of the featuresAndBenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeaturesAndBenefit(String value) {
        this.featuresAndBenefit = value;
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
     * Gets the value of the subBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBrand() {
        return subBrand;
    }

    /**
     * Sets the value of the subBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubBrand(String value) {
        this.subBrand = value;
    }

    /**
     * Gets the value of the brandAssetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandAssetCode() {
        return brandAssetCode;
    }

    /**
     * Sets the value of the brandAssetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandAssetCode(String value) {
        this.brandAssetCode = value;
    }

    /**
     * Gets the value of the constructionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionTypeCode() {
        return constructionTypeCode;
    }

    /**
     * Sets the value of the constructionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionTypeCode(String value) {
        this.constructionTypeCode = value;
    }

    /**
     * Gets the value of the manufacturingCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingCapability() {
        return manufacturingCapability;
    }

    /**
     * Sets the value of the manufacturingCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingCapability(String value) {
        this.manufacturingCapability = value;
    }

    /**
     * Gets the value of the targetTechnologyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetTechnologyCode() {
        return targetTechnologyCode;
    }

    /**
     * Sets the value of the targetTechnologyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetTechnologyCode(String value) {
        this.targetTechnologyCode = value;
    }

    /**
     * Gets the value of the techConceptCodes property.
     * 
     * @return
     *     possible object is
     *     {@link TechConceptCodes }
     *     
     */
    public TechConceptCodes getTechConceptCodes() {
        return techConceptCodes;
    }

    /**
     * Sets the value of the techConceptCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechConceptCodes }
     *     
     */
    public void setTechConceptCodes(TechConceptCodes value) {
        this.techConceptCodes = value;
    }

    /**
     * Gets the value of the consumerBenefitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerBenefitCode() {
        return consumerBenefitCode;
    }

    /**
     * Sets the value of the consumerBenefitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerBenefitCode(String value) {
        this.consumerBenefitCode = value;
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
     * Gets the value of the localUsageCodes property.
     * 
     * @return
     *     possible object is
     *     {@link LocalUsageCodes }
     *     
     */
    public LocalUsageCodes getLocalUsageCodes() {
        return localUsageCodes;
    }

    /**
     * Sets the value of the localUsageCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalUsageCodes }
     *     
     */
    public void setLocalUsageCodes(LocalUsageCodes value) {
        this.localUsageCodes = value;
    }

    /**
     * Gets the value of the rrp2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRrp2() {
        return rrp2;
    }

    /**
     * Sets the value of the rrp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRrp2(BigDecimal value) {
        this.rrp2 = value;
    }

    /**
     * Gets the value of the rrp2CurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrp2CurrencyCode() {
        return rrp2CurrencyCode;
    }

    /**
     * Sets the value of the rrp2CurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrp2CurrencyCode(String value) {
        this.rrp2CurrencyCode = value;
    }

    /**
     * Gets the value of the transportLeadTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportLeadTimeCode() {
        return transportLeadTimeCode;
    }

    /**
     * Sets the value of the transportLeadTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportLeadTimeCode(BigInteger value) {
        this.transportLeadTimeCode = value;
    }

    /**
     * Gets the value of the developmentTrackCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevelopmentTrackCode() {
        return developmentTrackCode;
    }

    /**
     * Sets the value of the developmentTrackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevelopmentTrackCode(String value) {
        this.developmentTrackCode = value;
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
     * Gets the value of the mrktProposedSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrktProposedSize() {
        return mrktProposedSize;
    }

    /**
     * Sets the value of the mrktProposedSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrktProposedSize(String value) {
        this.mrktProposedSize = value;
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
     * Gets the value of the placeholderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceholderFlag() {
        return placeholderFlag;
    }

    /**
     * Sets the value of the placeholderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceholderFlag(String value) {
        this.placeholderFlag = value;
    }

    /**
     * Gets the value of the placeHolderStyleCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlaceHolderStyleCount() {
        return placeHolderStyleCount;
    }

    /**
     * Sets the value of the placeHolderStyleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlaceHolderStyleCount(BigInteger value) {
        this.placeHolderStyleCount = value;
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
     * Gets the value of the corporateMrktLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateMrktLineCode() {
        return corporateMrktLineCode;
    }

    /**
     * Sets the value of the corporateMrktLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateMrktLineCode(String value) {
        this.corporateMrktLineCode = value;
    }

    /**
     * Gets the value of the categoryMrktLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryMrktLineCode() {
        return categoryMrktLineCode;
    }

    /**
     * Sets the value of the categoryMrktLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryMrktLineCode(String value) {
        this.categoryMrktLineCode = value;
    }

    /**
     * Gets the value of the salesLineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesLineCode() {
        return salesLineCode;
    }

    /**
     * Sets the value of the salesLineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesLineCode(String value) {
        this.salesLineCode = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the ageGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgeGroupCode() {
        return ageGroupCode;
    }

    /**
     * Sets the value of the ageGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgeGroupCode(String value) {
        this.ageGroupCode = value;
    }

    /**
     * Gets the value of the sportsCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsCategoryCode() {
        return sportsCategoryCode;
    }

    /**
     * Sets the value of the sportsCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsCategoryCode(String value) {
        this.sportsCategoryCode = value;
    }

    /**
     * Gets the value of the productTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }

    /**
     * Sets the value of the productTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductTypeCode(String value) {
        this.productTypeCode = value;
    }

    /**
     * Gets the value of the creationCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationCenterCode() {
        return creationCenterCode;
    }

    /**
     * Sets the value of the creationCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationCenterCode(String value) {
        this.creationCenterCode = value;
    }

    /**
     * Gets the value of the targetSourcingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSourcingCode() {
        return targetSourcingCode;
    }

    /**
     * Sets the value of the targetSourcingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSourcingCode(String value) {
        this.targetSourcingCode = value;
    }

    /**
     * Gets the value of the targetMaterialCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetMaterialCode() {
        return targetMaterialCode;
    }

    /**
     * Sets the value of the targetMaterialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetMaterialCode(String value) {
        this.targetMaterialCode = value;
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
     * Gets the value of the indicativeGIM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicativeGIM() {
        return indicativeGIM;
    }

    /**
     * Sets the value of the indicativeGIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicativeGIM(String value) {
        this.indicativeGIM = value;
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

    /**
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

    /**
     * Gets the value of the modelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelStatus() {
        return modelStatus;
    }

    /**
     * Sets the value of the modelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelStatus(String value) {
        this.modelStatus = value;
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
     * Gets the value of the salesUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnitCode() {
        return salesUnitCode;
    }

    /**
     * Sets the value of the salesUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnitCode(String value) {
        this.salesUnitCode = value;
    }

    /**
     * Gets the value of the productClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassCode() {
        return productClassCode;
    }

    /**
     * Sets the value of the productClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassCode(String value) {
        this.productClassCode = value;
    }

    /**
     * Gets the value of the updateModelNullAttrs property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateModelNullAttrs }
     *     
     */
    public UpdateModelNullAttrs getUpdateModelNullAttrs() {
        return updateModelNullAttrs;
    }

    /**
     * Sets the value of the updateModelNullAttrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateModelNullAttrs }
     *     
     */
    public void setUpdateModelNullAttrs(UpdateModelNullAttrs value) {
        this.updateModelNullAttrs = value;
    }

}
