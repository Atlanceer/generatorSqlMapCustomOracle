package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CLoanclearedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CLoanclearedExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andReportidIsNull() {
            addCriterion("REPORTID is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("REPORTID is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(String value) {
            addCriterion("REPORTID =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(String value) {
            addCriterion("REPORTID <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(String value) {
            addCriterion("REPORTID >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTID >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(String value) {
            addCriterion("REPORTID <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(String value) {
            addCriterion("REPORTID <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLike(String value) {
            addCriterion("REPORTID like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotLike(String value) {
            addCriterion("REPORTID not like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<String> values) {
            addCriterion("REPORTID in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<String> values) {
            addCriterion("REPORTID not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(String value1, String value2) {
            addCriterion("REPORTID between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(String value1, String value2) {
            addCriterion("REPORTID not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberIsNull() {
            addCriterion("ASSETSACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberIsNotNull() {
            addCriterion("ASSETSACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER =", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER <>", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberGreaterThan(String value) {
            addCriterion("ASSETSACCOUNTNUMBER >", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER >=", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberLessThan(String value) {
            addCriterion("ASSETSACCOUNTNUMBER <", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER <=", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberLike(String value) {
            addCriterion("ASSETSACCOUNTNUMBER like", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotLike(String value) {
            addCriterion("ASSETSACCOUNTNUMBER not like", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberIn(List<String> values) {
            addCriterion("ASSETSACCOUNTNUMBER in", values, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotIn(List<String> values) {
            addCriterion("ASSETSACCOUNTNUMBER not in", values, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberBetween(String value1, String value2) {
            addCriterion("ASSETSACCOUNTNUMBER between", value1, value2, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotBetween(String value1, String value2) {
            addCriterion("ASSETSACCOUNTNUMBER not between", value1, value2, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsIsNull() {
            addCriterion("BALANCEASSETS is null");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsIsNotNull() {
            addCriterion("BALANCEASSETS is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsEqualTo(String value) {
            addCriterion("BALANCEASSETS =", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotEqualTo(String value) {
            addCriterion("BALANCEASSETS <>", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsGreaterThan(String value) {
            addCriterion("BALANCEASSETS >", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCEASSETS >=", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsLessThan(String value) {
            addCriterion("BALANCEASSETS <", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsLessThanOrEqualTo(String value) {
            addCriterion("BALANCEASSETS <=", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsLike(String value) {
            addCriterion("BALANCEASSETS like", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotLike(String value) {
            addCriterion("BALANCEASSETS not like", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsIn(List<String> values) {
            addCriterion("BALANCEASSETS in", values, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotIn(List<String> values) {
            addCriterion("BALANCEASSETS not in", values, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsBetween(String value1, String value2) {
            addCriterion("BALANCEASSETS between", value1, value2, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotBetween(String value1, String value2) {
            addCriterion("BALANCEASSETS not between", value1, value2, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIsNull() {
            addCriterion("COMPLETIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIsNotNull() {
            addCriterion("COMPLETIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompletiondateEqualTo(String value) {
            addCriterion("COMPLETIONDATE =", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotEqualTo(String value) {
            addCriterion("COMPLETIONDATE <>", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateGreaterThan(String value) {
            addCriterion("COMPLETIONDATE >", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETIONDATE >=", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLessThan(String value) {
            addCriterion("COMPLETIONDATE <", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLessThanOrEqualTo(String value) {
            addCriterion("COMPLETIONDATE <=", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateLike(String value) {
            addCriterion("COMPLETIONDATE like", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotLike(String value) {
            addCriterion("COMPLETIONDATE not like", value, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateIn(List<String> values) {
            addCriterion("COMPLETIONDATE in", values, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotIn(List<String> values) {
            addCriterion("COMPLETIONDATE not in", values, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateBetween(String value1, String value2) {
            addCriterion("COMPLETIONDATE between", value1, value2, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCompletiondateNotBetween(String value1, String value2) {
            addCriterion("COMPLETIONDATE not between", value1, value2, "completiondate");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNull() {
            addCriterion("CLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNotNull() {
            addCriterion("CLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCleardateEqualTo(String value) {
            addCriterion("CLEARDATE =", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotEqualTo(String value) {
            addCriterion("CLEARDATE <>", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThan(String value) {
            addCriterion("CLEARDATE >", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThanOrEqualTo(String value) {
            addCriterion("CLEARDATE >=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThan(String value) {
            addCriterion("CLEARDATE <", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThanOrEqualTo(String value) {
            addCriterion("CLEARDATE <=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLike(String value) {
            addCriterion("CLEARDATE like", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotLike(String value) {
            addCriterion("CLEARDATE not like", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateIn(List<String> values) {
            addCriterion("CLEARDATE in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotIn(List<String> values) {
            addCriterion("CLEARDATE not in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateBetween(String value1, String value2) {
            addCriterion("CLEARDATE between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotBetween(String value1, String value2) {
            addCriterion("CLEARDATE not between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberIsNull() {
            addCriterion("ADVANCEACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberIsNotNull() {
            addCriterion("ADVANCEACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER =", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER <>", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberGreaterThan(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER >", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER >=", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberLessThan(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER <", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER <=", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberLike(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER like", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotLike(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER not like", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberIn(List<String> values) {
            addCriterion("ADVANCEACCOUNTNUMBER in", values, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotIn(List<String> values) {
            addCriterion("ADVANCEACCOUNTNUMBER not in", values, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberBetween(String value1, String value2) {
            addCriterion("ADVANCEACCOUNTNUMBER between", value1, value2, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotBetween(String value1, String value2) {
            addCriterion("ADVANCEACCOUNTNUMBER not between", value1, value2, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andSummoneyIsNull() {
            addCriterion("SUMMONEY is null");
            return (Criteria) this;
        }

        public Criteria andSummoneyIsNotNull() {
            addCriterion("SUMMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSummoneyEqualTo(String value) {
            addCriterion("SUMMONEY =", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotEqualTo(String value) {
            addCriterion("SUMMONEY <>", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyGreaterThan(String value) {
            addCriterion("SUMMONEY >", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMONEY >=", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyLessThan(String value) {
            addCriterion("SUMMONEY <", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyLessThanOrEqualTo(String value) {
            addCriterion("SUMMONEY <=", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyLike(String value) {
            addCriterion("SUMMONEY like", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotLike(String value) {
            addCriterion("SUMMONEY not like", value, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyIn(List<String> values) {
            addCriterion("SUMMONEY in", values, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotIn(List<String> values) {
            addCriterion("SUMMONEY not in", values, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyBetween(String value1, String value2) {
            addCriterion("SUMMONEY between", value1, value2, "summoney");
            return (Criteria) this;
        }

        public Criteria andSummoneyNotBetween(String value1, String value2) {
            addCriterion("SUMMONEY not between", value1, value2, "summoney");
            return (Criteria) this;
        }

        public Criteria andOtherloansIsNull() {
            addCriterion("OTHERLOANS is null");
            return (Criteria) this;
        }

        public Criteria andOtherloansIsNotNull() {
            addCriterion("OTHERLOANS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloansEqualTo(String value) {
            addCriterion("OTHERLOANS =", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotEqualTo(String value) {
            addCriterion("OTHERLOANS <>", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansGreaterThan(String value) {
            addCriterion("OTHERLOANS >", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERLOANS >=", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansLessThan(String value) {
            addCriterion("OTHERLOANS <", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansLessThanOrEqualTo(String value) {
            addCriterion("OTHERLOANS <=", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansLike(String value) {
            addCriterion("OTHERLOANS like", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotLike(String value) {
            addCriterion("OTHERLOANS not like", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansIn(List<String> values) {
            addCriterion("OTHERLOANS in", values, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotIn(List<String> values) {
            addCriterion("OTHERLOANS not in", values, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansBetween(String value1, String value2) {
            addCriterion("OTHERLOANS between", value1, value2, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotBetween(String value1, String value2) {
            addCriterion("OTHERLOANS not between", value1, value2, "otherloans");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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