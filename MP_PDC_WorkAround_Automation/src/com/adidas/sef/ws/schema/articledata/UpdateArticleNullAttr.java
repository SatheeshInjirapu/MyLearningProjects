
package com.adidas.sef.ws.schema.articledata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateArticleNullAttr.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateArticleNullAttr">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="mrktForecast"/>
 *     &lt;enumeration value="mrktProposedColor"/>
 *     &lt;enumeration value="rrp"/>
 *     &lt;enumeration value="rrpCurrencyCode"/>
 *     &lt;enumeration value="mrktDepartment"/>
 *     &lt;enumeration value="productManagerName"/>
 *     &lt;enumeration value="splUsage"/>
 *     &lt;enumeration value="leadColorway"/>
 *     &lt;enumeration value="physicalColorway"/>
 *     &lt;enumeration value="targetFOB"/>
 *     &lt;enumeration value="betterPlaceCode"/>
 *     &lt;enumeration value="targetFOBCurrencyCode"/>
 *     &lt;enumeration value="developmentTrackCode"/>
 *     &lt;enumeration value="transportLeadTimeCode"/>
 *     &lt;enumeration value="distributionChannels"/>
 *     &lt;enumeration value="ffmModelCode"/>
 *     &lt;enumeration value="businessModelCode"/>
 *     &lt;enumeration value="mrktClassificationCode"/>
 *     &lt;enumeration value="articleTypeCode"/>
 *     &lt;enumeration value="priceSegmentCode"/>
 *     &lt;enumeration value="targetConsumerCode"/>
 *     &lt;enumeration value="putOnHold"/>
 *     &lt;enumeration value="retailIntroDate"/>
 *     &lt;enumeration value="retailExitDate"/>
 *     &lt;enumeration value="sellingRegionCodes"/>
 *     &lt;enumeration value="specialUsageCode"/>
 *     &lt;enumeration value="dropFlag"/>
 *     &lt;enumeration value="replenishmentFlag"/>
 *     &lt;enumeration value="quarter"/>
 *     &lt;enumeration value="buyReadyStatusDescr"/>
 *     &lt;enumeration value="buyReadyValidationStatus"/>
 *     &lt;enumeration value="earliestBuyReadyDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateArticleNullAttr")
@XmlEnum
public enum UpdateArticleNullAttr {

    @XmlEnumValue("mrktForecast")
    MRKT_FORECAST("mrktForecast"),
    @XmlEnumValue("mrktProposedColor")
    MRKT_PROPOSED_COLOR("mrktProposedColor"),
    @XmlEnumValue("rrp")
    RRP("rrp"),
    @XmlEnumValue("rrpCurrencyCode")
    RRP_CURRENCY_CODE("rrpCurrencyCode"),
    @XmlEnumValue("mrktDepartment")
    MRKT_DEPARTMENT("mrktDepartment"),
    @XmlEnumValue("productManagerName")
    PRODUCT_MANAGER_NAME("productManagerName"),
    @XmlEnumValue("splUsage")
    SPL_USAGE("splUsage"),
    @XmlEnumValue("leadColorway")
    LEAD_COLORWAY("leadColorway"),
    @XmlEnumValue("physicalColorway")
    PHYSICAL_COLORWAY("physicalColorway"),
    @XmlEnumValue("targetFOB")
    TARGET_FOB("targetFOB"),
    @XmlEnumValue("betterPlaceCode")
    BETTER_PLACE_CODE("betterPlaceCode"),
    @XmlEnumValue("targetFOBCurrencyCode")
    TARGET_FOB_CURRENCY_CODE("targetFOBCurrencyCode"),
    @XmlEnumValue("developmentTrackCode")
    DEVELOPMENT_TRACK_CODE("developmentTrackCode"),
    @XmlEnumValue("transportLeadTimeCode")
    TRANSPORT_LEAD_TIME_CODE("transportLeadTimeCode"),
    @XmlEnumValue("distributionChannels")
    DISTRIBUTION_CHANNELS("distributionChannels"),
    @XmlEnumValue("ffmModelCode")
    FFM_MODEL_CODE("ffmModelCode"),
    @XmlEnumValue("businessModelCode")
    BUSINESS_MODEL_CODE("businessModelCode"),
    @XmlEnumValue("mrktClassificationCode")
    MRKT_CLASSIFICATION_CODE("mrktClassificationCode"),
    @XmlEnumValue("articleTypeCode")
    ARTICLE_TYPE_CODE("articleTypeCode"),
    @XmlEnumValue("priceSegmentCode")
    PRICE_SEGMENT_CODE("priceSegmentCode"),
    @XmlEnumValue("targetConsumerCode")
    TARGET_CONSUMER_CODE("targetConsumerCode"),
    @XmlEnumValue("putOnHold")
    PUT_ON_HOLD("putOnHold"),
    @XmlEnumValue("retailIntroDate")
    RETAIL_INTRO_DATE("retailIntroDate"),
    @XmlEnumValue("retailExitDate")
    RETAIL_EXIT_DATE("retailExitDate"),
    @XmlEnumValue("sellingRegionCodes")
    SELLING_REGION_CODES("sellingRegionCodes"),
    @XmlEnumValue("specialUsageCode")
    SPECIAL_USAGE_CODE("specialUsageCode"),
    @XmlEnumValue("dropFlag")
    DROP_FLAG("dropFlag"),
    @XmlEnumValue("replenishmentFlag")
    REPLENISHMENT_FLAG("replenishmentFlag"),
    @XmlEnumValue("quarter")
    QUARTER("quarter"),
    @XmlEnumValue("buyReadyStatusDescr")
    BUY_READY_STATUS_DESCR("buyReadyStatusDescr"),
    @XmlEnumValue("buyReadyValidationStatus")
    BUY_READY_VALIDATION_STATUS("buyReadyValidationStatus"),
    @XmlEnumValue("earliestBuyReadyDate")
    EARLIEST_BUY_READY_DATE("earliestBuyReadyDate");
    private final String value;

    UpdateArticleNullAttr(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateArticleNullAttr fromValue(String v) {
        for (UpdateArticleNullAttr c: UpdateArticleNullAttr.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
