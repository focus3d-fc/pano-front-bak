package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.SqlMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SqlMap(Name = "pano_project", Class = PanoProject.class)
public class PanoProjectCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    protected List oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    protected Object record;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public PanoProjectCriteria() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public PanoProjectCriteria(PanoProjectCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public PanoProjectCriteria(Object record, PanoProjectCriteria example) {
        this.record = record;
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table pano_project
     *
     * @ibatorgenerated Tue Aug 29 19:19:33 CST 2017
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andSnIsNull() {
            addCriterion("SN is null");
            return this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("SN is not null");
            return this;
        }

        public Criteria andSnEqualTo(Long value) {
            addCriterion("SN =", value, "sn");
            return this;
        }

        public Criteria andSnNotEqualTo(Long value) {
            addCriterion("SN <>", value, "sn");
            return this;
        }

        public Criteria andSnGreaterThan(Long value) {
            addCriterion("SN >", value, "sn");
            return this;
        }

        public Criteria andSnGreaterThanOrEqualTo(Long value) {
            addCriterion("SN >=", value, "sn");
            return this;
        }

        public Criteria andSnLessThan(Long value) {
            addCriterion("SN <", value, "sn");
            return this;
        }

        public Criteria andSnLessThanOrEqualTo(Long value) {
            addCriterion("SN <=", value, "sn");
            return this;
        }

        public Criteria andSnIn(List values) {
            addCriterion("SN in", values, "sn");
            return this;
        }

        public Criteria andSnNotIn(List values) {
            addCriterion("SN not in", values, "sn");
            return this;
        }

        public Criteria andSnBetween(Long value1, Long value2) {
            addCriterion("SN between", value1, value2, "sn");
            return this;
        }

        public Criteria andSnNotBetween(Long value1, Long value2) {
            addCriterion("SN not between", value1, value2, "sn");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List values) {
            addCriterion("NAME in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
            addCriterion("NAME not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return this;
        }

        public Criteria andProvinceIn(List values) {
            addCriterion("PROVINCE in", values, "province");
            return this;
        }

        public Criteria andProvinceNotIn(List values) {
            addCriterion("PROVINCE not in", values, "province");
            return this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return this;
        }

        public Criteria andCityIn(List values) {
            addCriterion("CITY in", values, "city");
            return this;
        }

        public Criteria andCityNotIn(List values) {
            addCriterion("CITY not in", values, "city");
            return this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return this;
        }

        public Criteria andAreaIn(List values) {
            addCriterion("AREA in", values, "area");
            return this;
        }

        public Criteria andAreaNotIn(List values) {
            addCriterion("AREA not in", values, "area");
            return this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return this;
        }

        public Criteria andAdderSnIsNull() {
            addCriterion("ADDER_SN is null");
            return this;
        }

        public Criteria andAdderSnIsNotNull() {
            addCriterion("ADDER_SN is not null");
            return this;
        }

        public Criteria andAdderSnEqualTo(Long value) {
            addCriterion("ADDER_SN =", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnNotEqualTo(Long value) {
            addCriterion("ADDER_SN <>", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnGreaterThan(Long value) {
            addCriterion("ADDER_SN >", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("ADDER_SN >=", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnLessThan(Long value) {
            addCriterion("ADDER_SN <", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnLessThanOrEqualTo(Long value) {
            addCriterion("ADDER_SN <=", value, "adderSn");
            return this;
        }

        public Criteria andAdderSnIn(List values) {
            addCriterion("ADDER_SN in", values, "adderSn");
            return this;
        }

        public Criteria andAdderSnNotIn(List values) {
            addCriterion("ADDER_SN not in", values, "adderSn");
            return this;
        }

        public Criteria andAdderSnBetween(Long value1, Long value2) {
            addCriterion("ADDER_SN between", value1, value2, "adderSn");
            return this;
        }

        public Criteria andAdderSnNotBetween(Long value1, Long value2) {
            addCriterion("ADDER_SN not between", value1, value2, "adderSn");
            return this;
        }

        public Criteria andAdderNameIsNull() {
            addCriterion("ADDER_NAME is null");
            return this;
        }

        public Criteria andAdderNameIsNotNull() {
            addCriterion("ADDER_NAME is not null");
            return this;
        }

        public Criteria andAdderNameEqualTo(String value) {
            addCriterion("ADDER_NAME =", value, "adderName");
            return this;
        }

        public Criteria andAdderNameNotEqualTo(String value) {
            addCriterion("ADDER_NAME <>", value, "adderName");
            return this;
        }

        public Criteria andAdderNameGreaterThan(String value) {
            addCriterion("ADDER_NAME >", value, "adderName");
            return this;
        }

        public Criteria andAdderNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADDER_NAME >=", value, "adderName");
            return this;
        }

        public Criteria andAdderNameLessThan(String value) {
            addCriterion("ADDER_NAME <", value, "adderName");
            return this;
        }

        public Criteria andAdderNameLessThanOrEqualTo(String value) {
            addCriterion("ADDER_NAME <=", value, "adderName");
            return this;
        }

        public Criteria andAdderNameLike(String value) {
            addCriterion("ADDER_NAME like", value, "adderName");
            return this;
        }

        public Criteria andAdderNameNotLike(String value) {
            addCriterion("ADDER_NAME not like", value, "adderName");
            return this;
        }

        public Criteria andAdderNameIn(List values) {
            addCriterion("ADDER_NAME in", values, "adderName");
            return this;
        }

        public Criteria andAdderNameNotIn(List values) {
            addCriterion("ADDER_NAME not in", values, "adderName");
            return this;
        }

        public Criteria andAdderNameBetween(String value1, String value2) {
            addCriterion("ADDER_NAME between", value1, value2, "adderName");
            return this;
        }

        public Criteria andAdderNameNotBetween(String value1, String value2) {
            addCriterion("ADDER_NAME not between", value1, value2, "adderName");
            return this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return this;
        }

        public Criteria andAddTimeIn(List values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return this;
        }

        public Criteria andAddTimeNotIn(List values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return this;
        }

        public Criteria andUpdaterSnIsNull() {
            addCriterion("UPDATER_SN is null");
            return this;
        }

        public Criteria andUpdaterSnIsNotNull() {
            addCriterion("UPDATER_SN is not null");
            return this;
        }

        public Criteria andUpdaterSnEqualTo(Long value) {
            addCriterion("UPDATER_SN =", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnNotEqualTo(Long value) {
            addCriterion("UPDATER_SN <>", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnGreaterThan(Long value) {
            addCriterion("UPDATER_SN >", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATER_SN >=", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnLessThan(Long value) {
            addCriterion("UPDATER_SN <", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnLessThanOrEqualTo(Long value) {
            addCriterion("UPDATER_SN <=", value, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnIn(List values) {
            addCriterion("UPDATER_SN in", values, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnNotIn(List values) {
            addCriterion("UPDATER_SN not in", values, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnBetween(Long value1, Long value2) {
            addCriterion("UPDATER_SN between", value1, value2, "updaterSn");
            return this;
        }

        public Criteria andUpdaterSnNotBetween(Long value1, Long value2) {
            addCriterion("UPDATER_SN not between", value1, value2, "updaterSn");
            return this;
        }

        public Criteria andUpdaterNameIsNull() {
            addCriterion("UPDATER_NAME is null");
            return this;
        }

        public Criteria andUpdaterNameIsNotNull() {
            addCriterion("UPDATER_NAME is not null");
            return this;
        }

        public Criteria andUpdaterNameEqualTo(String value) {
            addCriterion("UPDATER_NAME =", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotEqualTo(String value) {
            addCriterion("UPDATER_NAME <>", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameGreaterThan(String value) {
            addCriterion("UPDATER_NAME >", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATER_NAME >=", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameLessThan(String value) {
            addCriterion("UPDATER_NAME <", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATER_NAME <=", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameLike(String value) {
            addCriterion("UPDATER_NAME like", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotLike(String value) {
            addCriterion("UPDATER_NAME not like", value, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameIn(List values) {
            addCriterion("UPDATER_NAME in", values, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotIn(List values) {
            addCriterion("UPDATER_NAME not in", values, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameBetween(String value1, String value2) {
            addCriterion("UPDATER_NAME between", value1, value2, "updaterName");
            return this;
        }

        public Criteria andUpdaterNameNotBetween(String value1, String value2) {
            addCriterion("UPDATER_NAME not between", value1, value2, "updaterName");
            return this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeIn(List values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotIn(List values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return this;
        }
    }
}