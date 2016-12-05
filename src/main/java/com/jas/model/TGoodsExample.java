package com.jas.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public TGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMerchIdIsNull() {
            addCriterion("merch_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchIdIsNotNull() {
            addCriterion("merch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchIdEqualTo(String value) {
            addCriterion("merch_id =", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotEqualTo(String value) {
            addCriterion("merch_id <>", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdGreaterThan(String value) {
            addCriterion("merch_id >", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdGreaterThanOrEqualTo(String value) {
            addCriterion("merch_id >=", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLessThan(String value) {
            addCriterion("merch_id <", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLessThanOrEqualTo(String value) {
            addCriterion("merch_id <=", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdLike(String value) {
            addCriterion("merch_id like", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotLike(String value) {
            addCriterion("merch_id not like", value, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdIn(List<String> values) {
            addCriterion("merch_id in", values, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotIn(List<String> values) {
            addCriterion("merch_id not in", values, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdBetween(String value1, String value2) {
            addCriterion("merch_id between", value1, value2, "merchId");
            return (Criteria) this;
        }

        public Criteria andMerchIdNotBetween(String value1, String value2) {
            addCriterion("merch_id not between", value1, value2, "merchId");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNull() {
            addCriterion("supp_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppIdIsNotNull() {
            addCriterion("supp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppIdEqualTo(String value) {
            addCriterion("supp_id =", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotEqualTo(String value) {
            addCriterion("supp_id <>", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThan(String value) {
            addCriterion("supp_id >", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdGreaterThanOrEqualTo(String value) {
            addCriterion("supp_id >=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThan(String value) {
            addCriterion("supp_id <", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLessThanOrEqualTo(String value) {
            addCriterion("supp_id <=", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdLike(String value) {
            addCriterion("supp_id like", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotLike(String value) {
            addCriterion("supp_id not like", value, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdIn(List<String> values) {
            addCriterion("supp_id in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotIn(List<String> values) {
            addCriterion("supp_id not in", values, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdBetween(String value1, String value2) {
            addCriterion("supp_id between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andSuppIdNotBetween(String value1, String value2) {
            addCriterion("supp_id not between", value1, value2, "suppId");
            return (Criteria) this;
        }

        public Criteria andMerchNameIsNull() {
            addCriterion("merch_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchNameIsNotNull() {
            addCriterion("merch_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchNameEqualTo(String value) {
            addCriterion("merch_name =", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotEqualTo(String value) {
            addCriterion("merch_name <>", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameGreaterThan(String value) {
            addCriterion("merch_name >", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameGreaterThanOrEqualTo(String value) {
            addCriterion("merch_name >=", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameLessThan(String value) {
            addCriterion("merch_name <", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameLessThanOrEqualTo(String value) {
            addCriterion("merch_name <=", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameLike(String value) {
            addCriterion("merch_name like", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotLike(String value) {
            addCriterion("merch_name not like", value, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameIn(List<String> values) {
            addCriterion("merch_name in", values, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotIn(List<String> values) {
            addCriterion("merch_name not in", values, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameBetween(String value1, String value2) {
            addCriterion("merch_name between", value1, value2, "merchName");
            return (Criteria) this;
        }

        public Criteria andMerchNameNotBetween(String value1, String value2) {
            addCriterion("merch_name not between", value1, value2, "merchName");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(String value) {
            addCriterion("kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(String value) {
            addCriterion("kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(String value) {
            addCriterion("kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(String value) {
            addCriterion("kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(String value) {
            addCriterion("kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(String value) {
            addCriterion("kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLike(String value) {
            addCriterion("kind like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotLike(String value) {
            addCriterion("kind not like", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<String> values) {
            addCriterion("kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<String> values) {
            addCriterion("kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(String value1, String value2) {
            addCriterion("kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(String value1, String value2) {
            addCriterion("kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNull() {
            addCriterion("unit_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("unit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(BigDecimal value) {
            addCriterion("unit_cost =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(BigDecimal value) {
            addCriterion("unit_cost <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(BigDecimal value) {
            addCriterion("unit_cost >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(BigDecimal value) {
            addCriterion("unit_cost <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<BigDecimal> values) {
            addCriterion("unit_cost in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<BigDecimal> values) {
            addCriterion("unit_cost not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost not between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andMerchAddrIsNull() {
            addCriterion("merch_addr is null");
            return (Criteria) this;
        }

        public Criteria andMerchAddrIsNotNull() {
            addCriterion("merch_addr is not null");
            return (Criteria) this;
        }

        public Criteria andMerchAddrEqualTo(String value) {
            addCriterion("merch_addr =", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrNotEqualTo(String value) {
            addCriterion("merch_addr <>", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrGreaterThan(String value) {
            addCriterion("merch_addr >", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrGreaterThanOrEqualTo(String value) {
            addCriterion("merch_addr >=", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrLessThan(String value) {
            addCriterion("merch_addr <", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrLessThanOrEqualTo(String value) {
            addCriterion("merch_addr <=", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrLike(String value) {
            addCriterion("merch_addr like", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrNotLike(String value) {
            addCriterion("merch_addr not like", value, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrIn(List<String> values) {
            addCriterion("merch_addr in", values, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrNotIn(List<String> values) {
            addCriterion("merch_addr not in", values, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrBetween(String value1, String value2) {
            addCriterion("merch_addr between", value1, value2, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andMerchAddrNotBetween(String value1, String value2) {
            addCriterion("merch_addr not between", value1, value2, "merchAddr");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_goods
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 11 18:54:20 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_goods
     *
     * @mbggenerated Fri Nov 11 18:54:20 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}