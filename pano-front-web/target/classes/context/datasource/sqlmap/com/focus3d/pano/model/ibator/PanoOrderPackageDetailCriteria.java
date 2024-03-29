package com.focus3d.pano.model.ibator;

import com.focustech.cief.ibatis.annotation.SqlMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SqlMap(Name = "pano_order_package_detail", Class = PanoOrderPackageDetail.class)
public class PanoOrderPackageDetailCriteria {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    protected List oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    protected Object record;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public PanoOrderPackageDetailCriteria() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public PanoOrderPackageDetailCriteria(PanoOrderPackageDetailCriteria example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public PanoOrderPackageDetailCriteria(Object record, PanoOrderPackageDetailCriteria example) {
        this.record = record;
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
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
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table pano_order_package_detail
     *
     * @ibatorgenerated Fri Aug 25 10:11:56 CST 2017
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

        public Criteria andOrderPackageSnIsNull() {
            addCriterion("ORDER_PACKAGE_SN is null");
            return this;
        }

        public Criteria andOrderPackageSnIsNotNull() {
            addCriterion("ORDER_PACKAGE_SN is not null");
            return this;
        }

        public Criteria andOrderPackageSnEqualTo(Long value) {
            addCriterion("ORDER_PACKAGE_SN =", value, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnNotEqualTo(Long value) {
            addCriterion("ORDER_PACKAGE_SN <>", value, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnGreaterThan(Long value) {
            addCriterion("ORDER_PACKAGE_SN >", value, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_PACKAGE_SN >=", value, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnLessThan(Long value) {
            addCriterion("ORDER_PACKAGE_SN <", value, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_PACKAGE_SN <=", value, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnIn(List values) {
            addCriterion("ORDER_PACKAGE_SN in", values, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnNotIn(List values) {
            addCriterion("ORDER_PACKAGE_SN not in", values, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnBetween(Long value1, Long value2) {
            addCriterion("ORDER_PACKAGE_SN between", value1, value2, "orderPackageSn");
            return this;
        }

        public Criteria andOrderPackageSnNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_PACKAGE_SN not between", value1, value2, "orderPackageSn");
            return this;
        }

        public Criteria andPackageTypeSnIsNull() {
            addCriterion("PACKAGE_TYPE_SN is null");
            return this;
        }

        public Criteria andPackageTypeSnIsNotNull() {
            addCriterion("PACKAGE_TYPE_SN is not null");
            return this;
        }

        public Criteria andPackageTypeSnEqualTo(Long value) {
            addCriterion("PACKAGE_TYPE_SN =", value, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnNotEqualTo(Long value) {
            addCriterion("PACKAGE_TYPE_SN <>", value, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnGreaterThan(Long value) {
            addCriterion("PACKAGE_TYPE_SN >", value, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnGreaterThanOrEqualTo(Long value) {
            addCriterion("PACKAGE_TYPE_SN >=", value, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnLessThan(Long value) {
            addCriterion("PACKAGE_TYPE_SN <", value, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnLessThanOrEqualTo(Long value) {
            addCriterion("PACKAGE_TYPE_SN <=", value, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnIn(List values) {
            addCriterion("PACKAGE_TYPE_SN in", values, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnNotIn(List values) {
            addCriterion("PACKAGE_TYPE_SN not in", values, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnBetween(Long value1, Long value2) {
            addCriterion("PACKAGE_TYPE_SN between", value1, value2, "packageTypeSn");
            return this;
        }

        public Criteria andPackageTypeSnNotBetween(Long value1, Long value2) {
            addCriterion("PACKAGE_TYPE_SN not between", value1, value2, "packageTypeSn");
            return this;
        }

        public Criteria andPackageProductSnIsNull() {
            addCriterion("PACKAGE_PRODUCT_SN is null");
            return this;
        }

        public Criteria andPackageProductSnIsNotNull() {
            addCriterion("PACKAGE_PRODUCT_SN is not null");
            return this;
        }

        public Criteria andPackageProductSnEqualTo(Long value) {
            addCriterion("PACKAGE_PRODUCT_SN =", value, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnNotEqualTo(Long value) {
            addCriterion("PACKAGE_PRODUCT_SN <>", value, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnGreaterThan(Long value) {
            addCriterion("PACKAGE_PRODUCT_SN >", value, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnGreaterThanOrEqualTo(Long value) {
            addCriterion("PACKAGE_PRODUCT_SN >=", value, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnLessThan(Long value) {
            addCriterion("PACKAGE_PRODUCT_SN <", value, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnLessThanOrEqualTo(Long value) {
            addCriterion("PACKAGE_PRODUCT_SN <=", value, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnIn(List values) {
            addCriterion("PACKAGE_PRODUCT_SN in", values, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnNotIn(List values) {
            addCriterion("PACKAGE_PRODUCT_SN not in", values, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnBetween(Long value1, Long value2) {
            addCriterion("PACKAGE_PRODUCT_SN between", value1, value2, "packageProductSn");
            return this;
        }

        public Criteria andPackageProductSnNotBetween(Long value1, Long value2) {
            addCriterion("PACKAGE_PRODUCT_SN not between", value1, value2, "packageProductSn");
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