package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CUtilityexpsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CUtilityexpsExample() {
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

        public Criteria andUtilityaccountidIsNull() {
            addCriterion("UTILITYACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidIsNotNull() {
            addCriterion("UTILITYACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidEqualTo(String value) {
            addCriterion("UTILITYACCOUNTID =", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidNotEqualTo(String value) {
            addCriterion("UTILITYACCOUNTID <>", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidGreaterThan(String value) {
            addCriterion("UTILITYACCOUNTID >", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("UTILITYACCOUNTID >=", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidLessThan(String value) {
            addCriterion("UTILITYACCOUNTID <", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidLessThanOrEqualTo(String value) {
            addCriterion("UTILITYACCOUNTID <=", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidLike(String value) {
            addCriterion("UTILITYACCOUNTID like", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidNotLike(String value) {
            addCriterion("UTILITYACCOUNTID not like", value, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidIn(List<String> values) {
            addCriterion("UTILITYACCOUNTID in", values, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidNotIn(List<String> values) {
            addCriterion("UTILITYACCOUNTID not in", values, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidBetween(String value1, String value2) {
            addCriterion("UTILITYACCOUNTID between", value1, value2, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUtilityaccountidNotBetween(String value1, String value2) {
            addCriterion("UTILITYACCOUNTID not between", value1, value2, "utilityaccountid");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNull() {
            addCriterion("UNITNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnitnameIsNotNull() {
            addCriterion("UNITNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnameEqualTo(String value) {
            addCriterion("UNITNAME =", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotEqualTo(String value) {
            addCriterion("UNITNAME <>", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThan(String value) {
            addCriterion("UNITNAME >", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNITNAME >=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThan(String value) {
            addCriterion("UNITNAME <", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLessThanOrEqualTo(String value) {
            addCriterion("UNITNAME <=", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameLike(String value) {
            addCriterion("UNITNAME like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotLike(String value) {
            addCriterion("UNITNAME not like", value, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameIn(List<String> values) {
            addCriterion("UNITNAME in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotIn(List<String> values) {
            addCriterion("UNITNAME not in", values, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameBetween(String value1, String value2) {
            addCriterion("UNITNAME between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andUnitnameNotBetween(String value1, String value2) {
            addCriterion("UNITNAME not between", value1, value2, "unitname");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIsNull() {
            addCriterion("PAYMENTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIsNotNull() {
            addCriterion("PAYMENTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstateEqualTo(String value) {
            addCriterion("PAYMENTSTATE =", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotEqualTo(String value) {
            addCriterion("PAYMENTSTATE <>", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateGreaterThan(String value) {
            addCriterion("PAYMENTSTATE >", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTSTATE >=", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLessThan(String value) {
            addCriterion("PAYMENTSTATE <", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTSTATE <=", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateLike(String value) {
            addCriterion("PAYMENTSTATE like", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotLike(String value) {
            addCriterion("PAYMENTSTATE not like", value, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateIn(List<String> values) {
            addCriterion("PAYMENTSTATE in", values, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotIn(List<String> values) {
            addCriterion("PAYMENTSTATE not in", values, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateBetween(String value1, String value2) {
            addCriterion("PAYMENTSTATE between", value1, value2, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andPaymentstateNotBetween(String value1, String value2) {
            addCriterion("PAYMENTSTATE not between", value1, value2, "paymentstate");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsIsNull() {
            addCriterion("ACCUMULATIVEARREARS is null");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsIsNotNull() {
            addCriterion("ACCUMULATIVEARREARS is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsEqualTo(String value) {
            addCriterion("ACCUMULATIVEARREARS =", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsNotEqualTo(String value) {
            addCriterion("ACCUMULATIVEARREARS <>", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsGreaterThan(String value) {
            addCriterion("ACCUMULATIVEARREARS >", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsGreaterThanOrEqualTo(String value) {
            addCriterion("ACCUMULATIVEARREARS >=", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsLessThan(String value) {
            addCriterion("ACCUMULATIVEARREARS <", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsLessThanOrEqualTo(String value) {
            addCriterion("ACCUMULATIVEARREARS <=", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsLike(String value) {
            addCriterion("ACCUMULATIVEARREARS like", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsNotLike(String value) {
            addCriterion("ACCUMULATIVEARREARS not like", value, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsIn(List<String> values) {
            addCriterion("ACCUMULATIVEARREARS in", values, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsNotIn(List<String> values) {
            addCriterion("ACCUMULATIVEARREARS not in", values, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsBetween(String value1, String value2) {
            addCriterion("ACCUMULATIVEARREARS between", value1, value2, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andAccumulativearrearsNotBetween(String value1, String value2) {
            addCriterion("ACCUMULATIVEARREARS not between", value1, value2, "accumulativearrears");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearIsNull() {
            addCriterion("STATISTICALYEAR is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearIsNotNull() {
            addCriterion("STATISTICALYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearEqualTo(String value) {
            addCriterion("STATISTICALYEAR =", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotEqualTo(String value) {
            addCriterion("STATISTICALYEAR <>", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearGreaterThan(String value) {
            addCriterion("STATISTICALYEAR >", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearGreaterThanOrEqualTo(String value) {
            addCriterion("STATISTICALYEAR >=", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearLessThan(String value) {
            addCriterion("STATISTICALYEAR <", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearLessThanOrEqualTo(String value) {
            addCriterion("STATISTICALYEAR <=", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearLike(String value) {
            addCriterion("STATISTICALYEAR like", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotLike(String value) {
            addCriterion("STATISTICALYEAR not like", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearIn(List<String> values) {
            addCriterion("STATISTICALYEAR in", values, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotIn(List<String> values) {
            addCriterion("STATISTICALYEAR not in", values, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearBetween(String value1, String value2) {
            addCriterion("STATISTICALYEAR between", value1, value2, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotBetween(String value1, String value2) {
            addCriterion("STATISTICALYEAR not between", value1, value2, "statisticalyear");
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