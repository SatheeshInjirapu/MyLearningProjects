package com.adidas.sef.mp.pdc.beans;

/**
 * @author Satheesh_Injirapu
 *
 */
public class ArticleBean {

    private Long articleRangeId;
    private String seasonCode;
    private String buyReadyStatusDescr;
    private String brandCode;
    private String username;
    
    
    public Long getArticleRangeId() {
        return articleRangeId;
    }
    public void setArticleRangeId(Long articleRangeId) {
        this.articleRangeId = articleRangeId;
    }
    public String getSeasonCode() {
        return seasonCode;
    }
    public void setSeasonCode(String seasonCode) {
        this.seasonCode = seasonCode;
    }
    public String getBuyReadyStatusDescr() {
        return buyReadyStatusDescr;
    }
    public void setBuyReadyStatusDescr(String buyReadyStatusDescr) {
        this.buyReadyStatusDescr = buyReadyStatusDescr;
    }
    public String getBrandCode() {
        return brandCode;
    }
    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
}
