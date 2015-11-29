
package com.adidas.sef.ws.schema.modeldata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateModelNullAttr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateModelNullAttr">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="workingNumber"/>
 *     &lt;enumeration value="modelNameLong"/>
 *     &lt;enumeration value="modelDescr"/>
 *     &lt;enumeration value="referenceWorkingNumber"/>
 *     &lt;enumeration value="businessUnitCode"/>
 *     &lt;enumeration value="featuresAndBenefit"/>
 *     &lt;enumeration value="priceSegmentCode"/>
 *     &lt;enumeration value="subBrand"/>
 *     &lt;enumeration value="brandAssetCode"/>
 *     &lt;enumeration value="constructionTypeCode"/>
 *     &lt;enumeration value="manufacturingCapability"/>
 *     &lt;enumeration value="targetTechnologyCode"/>
 *     &lt;enumeration value="techConceptCodes"/>
 *     &lt;enumeration value="consumerBenefitCode"/>
 *     &lt;enumeration value="betterPlaceCode"/>
 *     &lt;enumeration value="localUsageCodes"/>
 *     &lt;enumeration value="rrp2"/>
 *     &lt;enumeration value="rrp2CurrencyCode"/>
 *     &lt;enumeration value="transportLeadTimeCode"/>
 *     &lt;enumeration value="developmentTrackCode"/>
 *     &lt;enumeration value="targetConsumerCode"/>
 *     &lt;enumeration value="mrktProposedSize"/>
 *     &lt;enumeration value="putOnHold"/>
 *     &lt;enumeration value="placeholderFlag"/>
 *     &lt;enumeration value="placeHolderStyleCount"/>
 *     &lt;enumeration value="targetFOB"/>
 *     &lt;enumeration value="targetFOBCurrencyCode"/>
 *     &lt;enumeration value="rrp"/>
 *     &lt;enumeration value="rrpCurrencyCode"/>
 *     &lt;enumeration value="mrktForecast"/>
 *     &lt;enumeration value="productManagerName"/>
 *     &lt;enumeration value="corporateMrktLineCode"/>
 *     &lt;enumeration value="categoryMrktLineCode"/>
 *     &lt;enumeration value="salesLineCode"/>
 *     &lt;enumeration value="genderCode"/>
 *     &lt;enumeration value="ageGroupCode"/>
 *     &lt;enumeration value="sportsCategoryCode"/>
 *     &lt;enumeration value="productTypeCode"/>
 *     &lt;enumeration value="creationCenterCode"/>
 *     &lt;enumeration value="targetSourcingCode"/>
 *     &lt;enumeration value="targetMaterialCode"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="retailIntroDate"/>
 *     &lt;enumeration value="retailExitDate"/>
 *     &lt;enumeration value="sellingRegionCodes"/>
 *     &lt;enumeration value="dropFlag"/>
 *     &lt;enumeration value="replenishmentFlag"/>
 *     &lt;enumeration value="indicativeGIM"/>
 *     &lt;enumeration value="buyReadyStatusDescr"/>
 *     &lt;enumeration value="buyReadyValidationStatus"/>
 *     &lt;enumeration value="earliestBuyReadyDate"/>
 *     &lt;enumeration value="salesUnitCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateModelNullAttr")
@XmlEnum
public enum UpdateModelNullAttr {

    @XmlEnumValue("workingNumber")
    WORKING_NUMBER("workingNumber"),
    @XmlEnumValue("modelNameLong")
    MODEL_NAME_LONG("modelNameLong"),
    @XmlEnumValue("modelDescr")
    MODEL_DESCR("modelDescr"),
    @XmlEnumValue("referenceWorkingNumber")
    REFERENCE_WORKING_NUMBER("referenceWorkingNumber"),
    @XmlEnumValue("businessUnitCode")
    BUSINESS_UNIT_CODE("businessUnitCode"),
    @XmlEnumValue("featuresAndBenefit")
    FEATURES_AND_BENEFIT("featuresAndBenefit"),
    @XmlEnumValue("priceSegmentCode")
    PRICE_SEGMENT_CODE("priceSegmentCode"),
    @XmlEnumValue("subBrand")
    SUB_BRAND("subBrand"),
    @XmlEnumValue("brandAssetCode")
    BRAND_ASSET_CODE("brandAssetCode"),
    @XmlEnumValue("constructionTypeCode")
    CONSTRUCTION_TYPE_CODE("constructionTypeCode"),
    @XmlEnumValue("manufacturingCapability")
    MANUFACTURING_CAPABILITY("manufacturingCapability"),
    @XmlEnumValue("targetTechnologyCode")
    TARGET_TECHNOLOGY_CODE("targetTechnologyCode"),
    @XmlEnumValue("techConceptCodes")
    TECH_CONCEPT_CODES("techConceptCodes"),
    @XmlEnumValue("consumerBenefitCode")
    CONSUMER_BENEFIT_CODE("consumerBenefitCode"),
    @XmlEnumValue("betterPlaceCode")
    BETTER_PLACE_CODE("betterPlaceCode"),
    @XmlEnumValue("localUsageCodes")
    LOCAL_USAGE_CODES("localUsageCodes"),
    @XmlEnumValue("rrp2")
    RRP_2("rrp2"),
    @XmlEnumValue("rrp2CurrencyCode")
    RRP_2_CURRENCY_CODE("rrp2CurrencyCode"),
    @XmlEnumValue("transportLeadTimeCode")
    TRANSPORT_LEAD_TIME_CODE("transportLeadTimeCode"),
    @XmlEnumValue("developmentTrackCode")
    DEVELOPMENT_TRACK_CODE("developmentTrackCode"),
    @XmlEnumValue("targetConsumerCode")
    TARGET_CONSUMER_CODE("targetConsumerCode"),
    @XmlEnumValue("mrktProposedSize")
    MRKT_PROPOSED_SIZE("mrktProposedSize"),
    @XmlEnumValue("putOnHold")
    PUT_ON_HOLD("putOnHold"),
    @XmlEnumValue("placeholderFlag")
    PLACEHOLDER_FLAG("placeholderFlag"),
    @XmlEnumValue("placeHolderStyleCount")
    PLACE_HOLDER_STYLE_COUNT("placeHolderStyleCount"),
    @XmlEnumValue("targetFOB")
    TARGET_FOB("targetFOB"),
    @XmlEnumValue("targetFOBCurrencyCode")
    TARGET_FOB_CURRENCY_CODE("targetFOBCurrencyCode"),
    @XmlEnumValue("rrp")
    RRP("rrp"),
    @XmlEnumValue("rrpCurrencyCode")
    RRP_CURRENCY_CODE("rrpCurrencyCode"),
    @XmlEnumValue("mrktForecast")
    MRKT_FORECAST("mrktForecast"),
    @XmlEnumValue("productManagerName")
    PRODUCT_MANAGER_NAME("productManagerName"),
    @XmlEnumValue("corporateMrktLineCode")
    CORPORATE_MRKT_LINE_CODE("corporateMrktLineCode"),
    @XmlEnumValue("categoryMrktLineCode")
    CATEGORY_MRKT_LINE_CODE("categoryMrktLineCode"),
    @XmlEnumValue("salesLineCode")
    SALES_LINE_CODE("salesLineCode"),
    @XmlEnumValue("genderCode")
    GENDER_CODE("genderCode"),
    @XmlEnumValue("ageGroupCode")
    AGE_GROUP_CODE("ageGroupCode"),
    @XmlEnumValue("sportsCategoryCode")
    SPORTS_CATEGORY_CODE("sportsCategoryCode"),
    @XmlEnumValue("productTypeCode")
    PRODUCT_TYPE_CODE("productTypeCode"),
    @XmlEnumValue("creationCenterCode")
    CREATION_CENTER_CODE("creationCenterCode"),
    @XmlEnumValue("targetSourcingCode")
    TARGET_SOURCING_CODE("targetSourcingCode"),
    @XmlEnumValue("targetMaterialCode")
    TARGET_MATERIAL_CODE("targetMaterialCode"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("retailIntroDate")
    RETAIL_INTRO_DATE("retailIntroDate"),
    @XmlEnumValue("retailExitDate")
    RETAIL_EXIT_DATE("retailExitDate"),
    @XmlEnumValue("sellingRegionCodes")
    SELLING_REGION_CODES("sellingRegionCodes"),
    @XmlEnumValue("dropFlag")
    DROP_FLAG("dropFlag"),
    @XmlEnumValue("replenishmentFlag")
    REPLENISHMENT_FLAG("replenishmentFlag"),
    @XmlEnumValue("indicativeGIM")
    INDICATIVE_GIM("indicativeGIM"),
    @XmlEnumValue("buyReadyStatusDescr")
    BUY_READY_STATUS_DESCR("buyReadyStatusDescr"),
    @XmlEnumValue("buyReadyValidationStatus")
    BUY_READY_VALIDATION_STATUS("buyReadyValidationStatus"),
    @XmlEnumValue("earliestBuyReadyDate")
    EARLIEST_BUY_READY_DATE("earliestBuyReadyDate"),
    @XmlEnumValue("salesUnitCode")
    SALES_UNIT_CODE("salesUnitCode");
    private final String value;

    UpdateModelNullAttr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateModelNullAttr fromValue(String v) {
        for (UpdateModelNullAttr c: UpdateModelNullAttr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
