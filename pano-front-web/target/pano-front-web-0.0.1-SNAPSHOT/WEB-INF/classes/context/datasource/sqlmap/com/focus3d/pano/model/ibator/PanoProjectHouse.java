package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.Column;
import com.focustech.cief.ibatis.annotation.PrimaryKey;
import com.focustech.cief.ibatis.annotation.SqlMap;
import com.focustech.cief.ibatis.annotation.Xss;
import java.math.BigDecimal;
import java.util.Date;

@Xss
@SqlMap(Name = "pano_project_house", Class = PanoProjectHouse.class)
public class PanoProjectHouse<T, U> {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @PrimaryKey
    @Column
    private Long sn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.ID
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.AREA
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private BigDecimal area;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.IMG_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long imgSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.ROOM_NUM
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Integer roomNum;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.HALL_NUM
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Integer hallNum;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.PROJECT_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long projectSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.order_num
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Integer orderNum;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.ADDER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long adderSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.ADDER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String adderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.ADD_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Date addTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.UPDATER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Long updaterSn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.UPDATER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String updaterName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.UPDATE_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private Date updateTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pano_project_house.encryptSn
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    @Column
    private String encryptSn;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.SN
     *
     * @return the value of pano_project_house.SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getSn() {
        return sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.SN
     *
     * @param sn the value for pano_project_house.SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setSn(Long sn) {
        this.sn = sn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.ID
     *
     * @return the value of pano_project_house.ID
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.ID
     *
     * @param id the value for pano_project_house.ID
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.NAME
     *
     * @return the value of pano_project_house.NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.NAME
     *
     * @param name the value for pano_project_house.NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.AREA
     *
     * @return the value of pano_project_house.AREA
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.AREA
     *
     * @param area the value for pano_project_house.AREA
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.IMG_SN
     *
     * @return the value of pano_project_house.IMG_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getImgSn() {
        return imgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.IMG_SN
     *
     * @param imgSn the value for pano_project_house.IMG_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setImgSn(Long imgSn) {
        this.imgSn = imgSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.ROOM_NUM
     *
     * @return the value of pano_project_house.ROOM_NUM
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Integer getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.ROOM_NUM
     *
     * @param roomNum the value for pano_project_house.ROOM_NUM
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.HALL_NUM
     *
     * @return the value of pano_project_house.HALL_NUM
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Integer getHallNum() {
        return hallNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.HALL_NUM
     *
     * @param hallNum the value for pano_project_house.HALL_NUM
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setHallNum(Integer hallNum) {
        this.hallNum = hallNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.PROJECT_SN
     *
     * @return the value of pano_project_house.PROJECT_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getProjectSn() {
        return projectSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.PROJECT_SN
     *
     * @param projectSn the value for pano_project_house.PROJECT_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setProjectSn(Long projectSn) {
        this.projectSn = projectSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.order_num
     *
     * @return the value of pano_project_house.order_num
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.order_num
     *
     * @param orderNum the value for pano_project_house.order_num
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.ADDER_SN
     *
     * @return the value of pano_project_house.ADDER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getAdderSn() {
        return adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.ADDER_SN
     *
     * @param adderSn the value for pano_project_house.ADDER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setAdderSn(Long adderSn) {
        this.adderSn = adderSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.ADDER_NAME
     *
     * @return the value of pano_project_house.ADDER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getAdderName() {
        return adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.ADDER_NAME
     *
     * @param adderName the value for pano_project_house.ADDER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setAdderName(String adderName) {
        this.adderName = adderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.ADD_TIME
     *
     * @return the value of pano_project_house.ADD_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.ADD_TIME
     *
     * @param addTime the value for pano_project_house.ADD_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.UPDATER_SN
     *
     * @return the value of pano_project_house.UPDATER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Long getUpdaterSn() {
        return updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.UPDATER_SN
     *
     * @param updaterSn the value for pano_project_house.UPDATER_SN
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setUpdaterSn(Long updaterSn) {
        this.updaterSn = updaterSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.UPDATER_NAME
     *
     * @return the value of pano_project_house.UPDATER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getUpdaterName() {
        return updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.UPDATER_NAME
     *
     * @param updaterName the value for pano_project_house.UPDATER_NAME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setUpdaterName(String updaterName) {
        this.updaterName = updaterName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.UPDATE_TIME
     *
     * @return the value of pano_project_house.UPDATE_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.UPDATE_TIME
     *
     * @param updateTime the value for pano_project_house.UPDATE_TIME
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pano_project_house.encryptSn
     *
     * @return the value of pano_project_house.encryptSn
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public String getEncryptSn() {
        return encryptSn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pano_project_house.encryptSn
     *
     * @param encryptSn the value for pano_project_house.encryptSn
     *
     * @ibatorgenerated Fri Aug 25 12:52:48 CST 2017
     */
    public void setEncryptSn(String encryptSn) {
        this.encryptSn = encryptSn;
    }
}