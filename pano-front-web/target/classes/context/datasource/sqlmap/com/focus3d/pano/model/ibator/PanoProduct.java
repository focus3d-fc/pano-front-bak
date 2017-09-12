package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.math.BigDecimal;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_product", Class = PanoProduct.class)
public class PanoProduct<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.ID
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.BRAND
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String brand;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.PRICE
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private BigDecimal price;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.discount_price
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private BigDecimal discountPrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.STATUS
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Integer status;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.SUMMARY
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String summary;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.LEFT_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long leftImgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.DOWN_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long downImgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.FULL_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long fullImgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.BANNER_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long bannerImgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.TYPE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long typeSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.FUNC_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long funcSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.SPACE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long spaceSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.STYLE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long styleSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.LENGTH
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Integer length;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.WIDE
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Integer wide;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.HEIGHT
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Integer height;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.MATERIAL_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String materialName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.MATERIAL_COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String materialColor;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.MATERIAL_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long materialImgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.FABRIC_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String fabricName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.FABRIC_COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String fabricColor;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.FABRIC_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long fabricImgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String color;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.MODEL
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String model;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.CAPACITY
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String capacity;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.REMARK
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String remark;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.ADDER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.ADD_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.UPDATER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.UPDATER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.UPDATE_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.workmanship
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String workmanship;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.lr
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String lr;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.lr_round
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String lrRound;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.vendername
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String vendername;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.dimension
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String dimension;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.ADDER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_product.encryptSn
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.SN
     *
     * @return the value of pano_product.SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.SN
     *
     * @param sn the value for pano_product.SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.ID
     *
     * @return the value of pano_product.ID
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.ID
     *
     * @param id the value for pano_product.ID
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.NAME
     *
     * @return the value of pano_product.NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.NAME
     *
     * @param name the value for pano_product.NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.BRAND
     *
     * @return the value of pano_product.BRAND
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.BRAND
     *
     * @param brand the value for pano_product.BRAND
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.PRICE
     *
     * @return the value of pano_product.PRICE
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.PRICE
     *
     * @param price the value for pano_product.PRICE
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.discount_price
     *
     * @return the value of pano_product.discount_price
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.discount_price
     *
     * @param discountPrice the value for pano_product.discount_price
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.STATUS
     *
     * @return the value of pano_product.STATUS
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.STATUS
     *
     * @param status the value for pano_product.STATUS
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.SUMMARY
     *
     * @return the value of pano_product.SUMMARY
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.SUMMARY
     *
     * @param summary the value for pano_product.SUMMARY
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.LEFT_IMG_SN
     *
     * @return the value of pano_product.LEFT_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getLeftImgSn() {
        return leftImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.LEFT_IMG_SN
     *
     * @param leftImgSn the value for pano_product.LEFT_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setLeftImgSn(Long leftImgSn) {
        this.leftImgSn = leftImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.DOWN_IMG_SN
     *
     * @return the value of pano_product.DOWN_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getDownImgSn() {
        return downImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.DOWN_IMG_SN
     *
     * @param downImgSn the value for pano_product.DOWN_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setDownImgSn(Long downImgSn) {
        this.downImgSn = downImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.FULL_IMG_SN
     *
     * @return the value of pano_product.FULL_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getFullImgSn() {
        return fullImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.FULL_IMG_SN
     *
     * @param fullImgSn the value for pano_product.FULL_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setFullImgSn(Long fullImgSn) {
        this.fullImgSn = fullImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.BANNER_IMG_SN
     *
     * @return the value of pano_product.BANNER_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getBannerImgSn() {
        return bannerImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.BANNER_IMG_SN
     *
     * @param bannerImgSn the value for pano_product.BANNER_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setBannerImgSn(Long bannerImgSn) {
        this.bannerImgSn = bannerImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.TYPE_SN
     *
     * @return the value of pano_product.TYPE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getTypeSn() {
        return typeSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.TYPE_SN
     *
     * @param typeSn the value for pano_product.TYPE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setTypeSn(Long typeSn) {
        this.typeSn = typeSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.FUNC_SN
     *
     * @return the value of pano_product.FUNC_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getFuncSn() {
        return funcSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.FUNC_SN
     *
     * @param funcSn the value for pano_product.FUNC_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setFuncSn(Long funcSn) {
        this.funcSn = funcSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.SPACE_SN
     *
     * @return the value of pano_product.SPACE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getSpaceSn() {
        return spaceSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.SPACE_SN
     *
     * @param spaceSn the value for pano_product.SPACE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setSpaceSn(Long spaceSn) {
        this.spaceSn = spaceSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.STYLE_SN
     *
     * @return the value of pano_product.STYLE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getStyleSn() {
        return styleSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.STYLE_SN
     *
     * @param styleSn the value for pano_product.STYLE_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setStyleSn(Long styleSn) {
        this.styleSn = styleSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.LENGTH
     *
     * @return the value of pano_product.LENGTH
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Integer getLength() {
        return length;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.LENGTH
     *
     * @param length the value for pano_product.LENGTH
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.WIDE
     *
     * @return the value of pano_product.WIDE
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Integer getWide() {
        return wide;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.WIDE
     *
     * @param wide the value for pano_product.WIDE
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setWide(Integer wide) {
        this.wide = wide;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.HEIGHT
     *
     * @return the value of pano_product.HEIGHT
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.HEIGHT
     *
     * @param height the value for pano_product.HEIGHT
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.MATERIAL_NAME
     *
     * @return the value of pano_product.MATERIAL_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.MATERIAL_NAME
     *
     * @param materialName the value for pano_product.MATERIAL_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.MATERIAL_COLOR
     *
     * @return the value of pano_product.MATERIAL_COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getMaterialColor() {
        return materialColor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.MATERIAL_COLOR
     *
     * @param materialColor the value for pano_product.MATERIAL_COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setMaterialColor(String materialColor) {
        this.materialColor = materialColor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.MATERIAL_IMG_SN
     *
     * @return the value of pano_product.MATERIAL_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getMaterialImgSn() {
        return materialImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.MATERIAL_IMG_SN
     *
     * @param materialImgSn the value for pano_product.MATERIAL_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setMaterialImgSn(Long materialImgSn) {
        this.materialImgSn = materialImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.FABRIC_NAME
     *
     * @return the value of pano_product.FABRIC_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getFabricName() {
        return fabricName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.FABRIC_NAME
     *
     * @param fabricName the value for pano_product.FABRIC_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.FABRIC_COLOR
     *
     * @return the value of pano_product.FABRIC_COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getFabricColor() {
        return fabricColor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.FABRIC_COLOR
     *
     * @param fabricColor the value for pano_product.FABRIC_COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setFabricColor(String fabricColor) {
        this.fabricColor = fabricColor;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.FABRIC_IMG_SN
     *
     * @return the value of pano_product.FABRIC_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getFabricImgSn() {
        return fabricImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.FABRIC_IMG_SN
     *
     * @param fabricImgSn the value for pano_product.FABRIC_IMG_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setFabricImgSn(Long fabricImgSn) {
        this.fabricImgSn = fabricImgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.COLOR
     *
     * @return the value of pano_product.COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.COLOR
     *
     * @param color the value for pano_product.COLOR
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.MODEL
     *
     * @return the value of pano_product.MODEL
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.MODEL
     *
     * @param model the value for pano_product.MODEL
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.CAPACITY
     *
     * @return the value of pano_product.CAPACITY
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.CAPACITY
     *
     * @param capacity the value for pano_product.CAPACITY
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.REMARK
     *
     * @return the value of pano_product.REMARK
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.REMARK
     *
     * @param remark the value for pano_product.REMARK
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.ADDER_NAME
     *
     * @return the value of pano_product.ADDER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.ADDER_NAME
     *
     * @param adderName the value for pano_product.ADDER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.ADD_TIME
     *
     * @return the value of pano_product.ADD_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.ADD_TIME
     *
     * @param addTime the value for pano_product.ADD_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.UPDATER_SN
     *
     * @return the value of pano_product.UPDATER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.UPDATER_SN
     *
     * @param updaterSn the value for pano_product.UPDATER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.UPDATER_NAME
     *
     * @return the value of pano_product.UPDATER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.UPDATER_NAME
     *
     * @param updaterName the value for pano_product.UPDATER_NAME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.UPDATE_TIME
     *
     * @return the value of pano_product.UPDATE_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.UPDATE_TIME
     *
     * @param updateTime the value for pano_product.UPDATE_TIME
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.workmanship
     *
     * @return the value of pano_product.workmanship
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getWorkmanship() {
        return workmanship;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.workmanship
     *
     * @param workmanship the value for pano_product.workmanship
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setWorkmanship(String workmanship) {
        this.workmanship = workmanship;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.lr
     *
     * @return the value of pano_product.lr
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getLr() {
        return lr;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.lr
     *
     * @param lr the value for pano_product.lr
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setLr(String lr) {
        this.lr = lr;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.lr_round
     *
     * @return the value of pano_product.lr_round
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getLrRound() {
        return lrRound;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.lr_round
     *
     * @param lrRound the value for pano_product.lr_round
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setLrRound(String lrRound) {
        this.lrRound = lrRound;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.vendername
     *
     * @return the value of pano_product.vendername
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getVendername() {
        return vendername;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.vendername
     *
     * @param vendername the value for pano_product.vendername
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setVendername(String vendername) {
        this.vendername = vendername;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.dimension
     *
     * @return the value of pano_product.dimension
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getDimension() {
        return dimension;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.dimension
     *
     * @param dimension the value for pano_product.dimension
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.ADDER_SN
     *
     * @return the value of pano_product.ADDER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.ADDER_SN
     *
     * @param adderSn the value for pano_product.ADDER_SN
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_product.encryptSn
     *
     * @return the value of pano_product.encryptSn
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_product.encryptSn
     *
     * @param encryptSn the value for pano_product.encryptSn
     *
     * @ibatorgenerated Thu Aug 24 18:55:26 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}