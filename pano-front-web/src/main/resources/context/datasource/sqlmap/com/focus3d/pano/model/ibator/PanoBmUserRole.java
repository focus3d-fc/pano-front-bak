package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_bm_user_role", Class = PanoBmUserRole.class)
public class PanoBmUserRole<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.USER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private Long userSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.ROLE_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private Long roleSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.ADDER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.ADDER_NAME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.ADD_TIME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.UPDATER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.UPDATER_NAME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.UPDATE_TIME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_bm_user_role.encryptSn
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.SN
     *
     * @return the value of pano_bm_user_role.SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.SN
     *
     * @param sn the value for pano_bm_user_role.SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.USER_SN
     *
     * @return the value of pano_bm_user_role.USER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Long getUserSn() {
        return userSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.USER_SN
     *
     * @param userSn the value for pano_bm_user_role.USER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setUserSn(Long userSn) {
        this.userSn = userSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.ROLE_SN
     *
     * @return the value of pano_bm_user_role.ROLE_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Long getRoleSn() {
        return roleSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.ROLE_SN
     *
     * @param roleSn the value for pano_bm_user_role.ROLE_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setRoleSn(Long roleSn) {
        this.roleSn = roleSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.ADDER_SN
     *
     * @return the value of pano_bm_user_role.ADDER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.ADDER_SN
     *
     * @param adderSn the value for pano_bm_user_role.ADDER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.ADDER_NAME
     *
     * @return the value of pano_bm_user_role.ADDER_NAME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.ADDER_NAME
     *
     * @param adderName the value for pano_bm_user_role.ADDER_NAME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.ADD_TIME
     *
     * @return the value of pano_bm_user_role.ADD_TIME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.ADD_TIME
     *
     * @param addTime the value for pano_bm_user_role.ADD_TIME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.UPDATER_SN
     *
     * @return the value of pano_bm_user_role.UPDATER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.UPDATER_SN
     *
     * @param updaterSn the value for pano_bm_user_role.UPDATER_SN
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.UPDATER_NAME
     *
     * @return the value of pano_bm_user_role.UPDATER_NAME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.UPDATER_NAME
     *
     * @param updaterName the value for pano_bm_user_role.UPDATER_NAME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.UPDATE_TIME
     *
     * @return the value of pano_bm_user_role.UPDATE_TIME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.UPDATE_TIME
     *
     * @param updateTime the value for pano_bm_user_role.UPDATE_TIME
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_bm_user_role.encryptSn
     *
     * @return the value of pano_bm_user_role.encryptSn
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_bm_user_role.encryptSn
     *
     * @param encryptSn the value for pano_bm_user_role.encryptSn
     *
     * @ibatorgenerated Sun Aug 20 21:55:48 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}