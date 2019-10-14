package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CCreditagreesumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CCreditagreesumExample() {
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

        public Criteria andAcycliccreditlineIsNull() {
            addCriterion("ACYCLICCREDITLINE is null");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineIsNotNull() {
            addCriterion("ACYCLICCREDITLINE is not null");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineEqualTo(String value) {
            addCriterion("ACYCLICCREDITLINE =", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineNotEqualTo(String value) {
            addCriterion("ACYCLICCREDITLINE <>", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineGreaterThan(String value) {
            addCriterion("ACYCLICCREDITLINE >", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineGreaterThanOrEqualTo(String value) {
            addCriterion("ACYCLICCREDITLINE >=", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineLessThan(String value) {
            addCriterion("ACYCLICCREDITLINE <", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineLessThanOrEqualTo(String value) {
            addCriterion("ACYCLICCREDITLINE <=", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineLike(String value) {
            addCriterion("ACYCLICCREDITLINE like", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineNotLike(String value) {
            addCriterion("ACYCLICCREDITLINE not like", value, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineIn(List<String> values) {
            addCriterion("ACYCLICCREDITLINE in", values, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineNotIn(List<String> values) {
            addCriterion("ACYCLICCREDITLINE not in", values, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineBetween(String value1, String value2) {
            addCriterion("ACYCLICCREDITLINE between", value1, value2, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andAcycliccreditlineNotBetween(String value1, String value2) {
            addCriterion("ACYCLICCREDITLINE not between", value1, value2, "acycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineIsNull() {
            addCriterion("USEACYCLICCREDITLINE is null");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineIsNotNull() {
            addCriterion("USEACYCLICCREDITLINE is not null");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineEqualTo(String value) {
            addCriterion("USEACYCLICCREDITLINE =", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineNotEqualTo(String value) {
            addCriterion("USEACYCLICCREDITLINE <>", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineGreaterThan(String value) {
            addCriterion("USEACYCLICCREDITLINE >", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineGreaterThanOrEqualTo(String value) {
            addCriterion("USEACYCLICCREDITLINE >=", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineLessThan(String value) {
            addCriterion("USEACYCLICCREDITLINE <", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineLessThanOrEqualTo(String value) {
            addCriterion("USEACYCLICCREDITLINE <=", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineLike(String value) {
            addCriterion("USEACYCLICCREDITLINE like", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineNotLike(String value) {
            addCriterion("USEACYCLICCREDITLINE not like", value, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineIn(List<String> values) {
            addCriterion("USEACYCLICCREDITLINE in", values, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineNotIn(List<String> values) {
            addCriterion("USEACYCLICCREDITLINE not in", values, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineBetween(String value1, String value2) {
            addCriterion("USEACYCLICCREDITLINE between", value1, value2, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andUseacycliccreditlineNotBetween(String value1, String value2) {
            addCriterion("USEACYCLICCREDITLINE not between", value1, value2, "useacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineIsNull() {
            addCriterion("SURPLUSACYCLICCREDITLINE is null");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineIsNotNull() {
            addCriterion("SURPLUSACYCLICCREDITLINE is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineEqualTo(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE =", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineNotEqualTo(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE <>", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineGreaterThan(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE >", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineGreaterThanOrEqualTo(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE >=", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineLessThan(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE <", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineLessThanOrEqualTo(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE <=", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineLike(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE like", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineNotLike(String value) {
            addCriterion("SURPLUSACYCLICCREDITLINE not like", value, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineIn(List<String> values) {
            addCriterion("SURPLUSACYCLICCREDITLINE in", values, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineNotIn(List<String> values) {
            addCriterion("SURPLUSACYCLICCREDITLINE not in", values, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineBetween(String value1, String value2) {
            addCriterion("SURPLUSACYCLICCREDITLINE between", value1, value2, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andSurplusacycliccreditlineNotBetween(String value1, String value2) {
            addCriterion("SURPLUSACYCLICCREDITLINE not between", value1, value2, "surplusacycliccreditline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineIsNull() {
            addCriterion("CIRCULATIONLINE is null");
            return (Criteria) this;
        }

        public Criteria andCirculationlineIsNotNull() {
            addCriterion("CIRCULATIONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationlineEqualTo(String value) {
            addCriterion("CIRCULATIONLINE =", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineNotEqualTo(String value) {
            addCriterion("CIRCULATIONLINE <>", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineGreaterThan(String value) {
            addCriterion("CIRCULATIONLINE >", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineGreaterThanOrEqualTo(String value) {
            addCriterion("CIRCULATIONLINE >=", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineLessThan(String value) {
            addCriterion("CIRCULATIONLINE <", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineLessThanOrEqualTo(String value) {
            addCriterion("CIRCULATIONLINE <=", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineLike(String value) {
            addCriterion("CIRCULATIONLINE like", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineNotLike(String value) {
            addCriterion("CIRCULATIONLINE not like", value, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineIn(List<String> values) {
            addCriterion("CIRCULATIONLINE in", values, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineNotIn(List<String> values) {
            addCriterion("CIRCULATIONLINE not in", values, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineBetween(String value1, String value2) {
            addCriterion("CIRCULATIONLINE between", value1, value2, "circulationline");
            return (Criteria) this;
        }

        public Criteria andCirculationlineNotBetween(String value1, String value2) {
            addCriterion("CIRCULATIONLINE not between", value1, value2, "circulationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineIsNull() {
            addCriterion("USECIRCULATIONLINE is null");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineIsNotNull() {
            addCriterion("USECIRCULATIONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineEqualTo(String value) {
            addCriterion("USECIRCULATIONLINE =", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineNotEqualTo(String value) {
            addCriterion("USECIRCULATIONLINE <>", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineGreaterThan(String value) {
            addCriterion("USECIRCULATIONLINE >", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineGreaterThanOrEqualTo(String value) {
            addCriterion("USECIRCULATIONLINE >=", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineLessThan(String value) {
            addCriterion("USECIRCULATIONLINE <", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineLessThanOrEqualTo(String value) {
            addCriterion("USECIRCULATIONLINE <=", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineLike(String value) {
            addCriterion("USECIRCULATIONLINE like", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineNotLike(String value) {
            addCriterion("USECIRCULATIONLINE not like", value, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineIn(List<String> values) {
            addCriterion("USECIRCULATIONLINE in", values, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineNotIn(List<String> values) {
            addCriterion("USECIRCULATIONLINE not in", values, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineBetween(String value1, String value2) {
            addCriterion("USECIRCULATIONLINE between", value1, value2, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andUsecirculationlineNotBetween(String value1, String value2) {
            addCriterion("USECIRCULATIONLINE not between", value1, value2, "usecirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineIsNull() {
            addCriterion("SURPLUSCIRCULATIONLINE is null");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineIsNotNull() {
            addCriterion("SURPLUSCIRCULATIONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineEqualTo(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE =", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineNotEqualTo(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE <>", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineGreaterThan(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE >", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineGreaterThanOrEqualTo(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE >=", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineLessThan(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE <", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineLessThanOrEqualTo(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE <=", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineLike(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE like", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineNotLike(String value) {
            addCriterion("SURPLUSCIRCULATIONLINE not like", value, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineIn(List<String> values) {
            addCriterion("SURPLUSCIRCULATIONLINE in", values, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineNotIn(List<String> values) {
            addCriterion("SURPLUSCIRCULATIONLINE not in", values, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineBetween(String value1, String value2) {
            addCriterion("SURPLUSCIRCULATIONLINE between", value1, value2, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andSurpluscirculationlineNotBetween(String value1, String value2) {
            addCriterion("SURPLUSCIRCULATIONLINE not between", value1, value2, "surpluscirculationline");
            return (Criteria) this;
        }

        public Criteria andCreditlimitIsNull() {
            addCriterion("CREDITLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitIsNotNull() {
            addCriterion("CREDITLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitEqualTo(String value) {
            addCriterion("CREDITLIMIT =", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotEqualTo(String value) {
            addCriterion("CREDITLIMIT <>", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitGreaterThan(String value) {
            addCriterion("CREDITLIMIT >", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITLIMIT >=", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitLessThan(String value) {
            addCriterion("CREDITLIMIT <", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitLessThanOrEqualTo(String value) {
            addCriterion("CREDITLIMIT <=", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitLike(String value) {
            addCriterion("CREDITLIMIT like", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotLike(String value) {
            addCriterion("CREDITLIMIT not like", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitIn(List<String> values) {
            addCriterion("CREDITLIMIT in", values, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotIn(List<String> values) {
            addCriterion("CREDITLIMIT not in", values, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitBetween(String value1, String value2) {
            addCriterion("CREDITLIMIT between", value1, value2, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotBetween(String value1, String value2) {
            addCriterion("CREDITLIMIT not between", value1, value2, "creditlimit");
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