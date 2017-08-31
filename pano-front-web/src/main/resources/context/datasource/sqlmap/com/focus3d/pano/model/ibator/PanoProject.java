package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_project", Class = PanoProject.class)
public class PanoProject<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.PROVINCE
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String province;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.CITY
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String city;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.AREA
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String area;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.ADDER_SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.ADDER_NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.ADD_TIME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.UPDATER_SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.UPDATER_NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.UPDATE_TIME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project.encryptSn
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.SN
     *
     * @return the value of pano_project.SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.SN
     *
     * @param sn the value for pano_project.SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.NAME
     *
     * @return the value of pano_project.NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.NAME
     *
     * @param name the value for pano_project.NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.PROVINCE
     *
     * @return the value of pano_project.PROVINCE
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.PROVINCE
     *
     * @param province the value for pano_project.PROVINCE
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.CITY
     *
     * @return the value of pano_project.CITY
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.CITY
     *
     * @param city the value for pano_project.CITY
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.AREA
     *
     * @return the value of pano_project.AREA
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.AREA
     *
     * @param area the value for pano_project.AREA
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.ADDER_SN
     *
     * @return the value of pano_project.ADDER_SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.ADDER_SN
     *
     * @param adderSn the value for pano_project.ADDER_SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.ADDER_NAME
     *
     * @return the value of pano_project.ADDER_NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.ADDER_NAME
     *
     * @param adderName the value for pano_project.ADDER_NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.ADD_TIME
     *
     * @return the value of pano_project.ADD_TIME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.ADD_TIME
     *
     * @param addTime the value for pano_project.ADD_TIME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.UPDATER_SN
     *
     * @return the value of pano_project.UPDATER_SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.UPDATER_SN
     *
     * @param updaterSn the value for pano_project.UPDATER_SN
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.UPDATER_NAME
     *
     * @return the value of pano_project.UPDATER_NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.UPDATER_NAME
     *
     * @param updaterName the value for pano_project.UPDATER_NAME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.UPDATE_TIME
     *
     * @return the value of pano_project.UPDATE_TIME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.UPDATE_TIME
     *
     * @param updateTime the value for pano_project.UPDATE_TIME
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project.encryptSn
     *
     * @return the value of pano_project.encryptSn
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project.encryptSn
     *
     * @param encryptSn the value for pano_project.encryptSn
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}