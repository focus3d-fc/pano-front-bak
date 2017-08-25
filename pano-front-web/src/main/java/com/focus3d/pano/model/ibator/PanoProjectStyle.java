package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.math.BigDecimal;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_project_style", Class = PanoProjectStyle.class)
public class PanoProjectStyle<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.PROJECT_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long projectSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.STYLE_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long styleSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.END_PRICE
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private BigDecimal endPrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.START_PRICE
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private BigDecimal startPrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.ADDER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.ADDER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.ADD_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.UPDATER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.UPDATER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.UPDATE_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_style.encryptSn
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.SN
     *
     * @return the value of pano_project_style.SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.SN
     *
     * @param sn the value for pano_project_style.SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.PROJECT_SN
     *
     * @return the value of pano_project_style.PROJECT_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getProjectSn() {
        return projectSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.PROJECT_SN
     *
     * @param projectSn the value for pano_project_style.PROJECT_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setProjectSn(Long projectSn) {
        this.projectSn = projectSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.STYLE_SN
     *
     * @return the value of pano_project_style.STYLE_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getStyleSn() {
        return styleSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.STYLE_SN
     *
     * @param styleSn the value for pano_project_style.STYLE_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setStyleSn(Long styleSn) {
        this.styleSn = styleSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.END_PRICE
     *
     * @return the value of pano_project_style.END_PRICE
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public BigDecimal getEndPrice() {
        return endPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.END_PRICE
     *
     * @param endPrice the value for pano_project_style.END_PRICE
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setEndPrice(BigDecimal endPrice) {
        this.endPrice = endPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.START_PRICE
     *
     * @return the value of pano_project_style.START_PRICE
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public BigDecimal getStartPrice() {
        return startPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.START_PRICE
     *
     * @param startPrice the value for pano_project_style.START_PRICE
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.ADDER_SN
     *
     * @return the value of pano_project_style.ADDER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.ADDER_SN
     *
     * @param adderSn the value for pano_project_style.ADDER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.ADDER_NAME
     *
     * @return the value of pano_project_style.ADDER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.ADDER_NAME
     *
     * @param adderName the value for pano_project_style.ADDER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.ADD_TIME
     *
     * @return the value of pano_project_style.ADD_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.ADD_TIME
     *
     * @param addTime the value for pano_project_style.ADD_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.UPDATER_SN
     *
     * @return the value of pano_project_style.UPDATER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.UPDATER_SN
     *
     * @param updaterSn the value for pano_project_style.UPDATER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.UPDATER_NAME
     *
     * @return the value of pano_project_style.UPDATER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.UPDATER_NAME
     *
     * @param updaterName the value for pano_project_style.UPDATER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.UPDATE_TIME
     *
     * @return the value of pano_project_style.UPDATE_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.UPDATE_TIME
     *
     * @param updateTime the value for pano_project_style.UPDATE_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_style.encryptSn
     *
     * @return the value of pano_project_style.encryptSn
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_style.encryptSn
     *
     * @param encryptSn the value for pano_project_style.encryptSn
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}