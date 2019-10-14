package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CFinancingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CFinancingExample() {
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

        public Criteria andInformationidIsNull() {
            addCriterion("INFORMATIONID is null");
            return (Criteria) this;
        }

        public Criteria andInformationidIsNotNull() {
            addCriterion("INFORMATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andInformationidEqualTo(String value) {
            addCriterion("INFORMATIONID =", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidNotEqualTo(String value) {
            addCriterion("INFORMATIONID <>", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidGreaterThan(String value) {
            addCriterion("INFORMATIONID >", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidGreaterThanOrEqualTo(String value) {
            addCriterion("INFORMATIONID >=", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidLessThan(String value) {
            addCriterion("INFORMATIONID <", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidLessThanOrEqualTo(String value) {
            addCriterion("INFORMATIONID <=", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidLike(String value) {
            addCriterion("INFORMATIONID like", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidNotLike(String value) {
            addCriterion("INFORMATIONID not like", value, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidIn(List<String> values) {
            addCriterion("INFORMATIONID in", values, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidNotIn(List<String> values) {
            addCriterion("INFORMATIONID not in", values, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidBetween(String value1, String value2) {
            addCriterion("INFORMATIONID between", value1, value2, "informationid");
            return (Criteria) this;
        }

        public Criteria andInformationidNotBetween(String value1, String value2) {
            addCriterion("INFORMATIONID not between", value1, value2, "informationid");
            return (Criteria) this;
        }

        public Criteria andAlistnamesIsNull() {
            addCriterion("ALISTNAMES is null");
            return (Criteria) this;
        }

        public Criteria andAlistnamesIsNotNull() {
            addCriterion("ALISTNAMES is not null");
            return (Criteria) this;
        }

        public Criteria andAlistnamesEqualTo(String value) {
            addCriterion("ALISTNAMES =", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesNotEqualTo(String value) {
            addCriterion("ALISTNAMES <>", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesGreaterThan(String value) {
            addCriterion("ALISTNAMES >", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesGreaterThanOrEqualTo(String value) {
            addCriterion("ALISTNAMES >=", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesLessThan(String value) {
            addCriterion("ALISTNAMES <", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesLessThanOrEqualTo(String value) {
            addCriterion("ALISTNAMES <=", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesLike(String value) {
            addCriterion("ALISTNAMES like", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesNotLike(String value) {
            addCriterion("ALISTNAMES not like", value, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesIn(List<String> values) {
            addCriterion("ALISTNAMES in", values, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesNotIn(List<String> values) {
            addCriterion("ALISTNAMES not in", values, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesBetween(String value1, String value2) {
            addCriterion("ALISTNAMES between", value1, value2, "alistnames");
            return (Criteria) this;
        }

        public Criteria andAlistnamesNotBetween(String value1, String value2) {
            addCriterion("ALISTNAMES not between", value1, value2, "alistnames");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeIsNull() {
            addCriterion("FINANCINGCONTROLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeIsNotNull() {
            addCriterion("FINANCINGCONTROLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeEqualTo(String value) {
            addCriterion("FINANCINGCONTROLTYPE =", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeNotEqualTo(String value) {
            addCriterion("FINANCINGCONTROLTYPE <>", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeGreaterThan(String value) {
            addCriterion("FINANCINGCONTROLTYPE >", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCINGCONTROLTYPE >=", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeLessThan(String value) {
            addCriterion("FINANCINGCONTROLTYPE <", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeLessThanOrEqualTo(String value) {
            addCriterion("FINANCINGCONTROLTYPE <=", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeLike(String value) {
            addCriterion("FINANCINGCONTROLTYPE like", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeNotLike(String value) {
            addCriterion("FINANCINGCONTROLTYPE not like", value, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeIn(List<String> values) {
            addCriterion("FINANCINGCONTROLTYPE in", values, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeNotIn(List<String> values) {
            addCriterion("FINANCINGCONTROLTYPE not in", values, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeBetween(String value1, String value2) {
            addCriterion("FINANCINGCONTROLTYPE between", value1, value2, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andFinancingcontroltypeNotBetween(String value1, String value2) {
            addCriterion("FINANCINGCONTROLTYPE not between", value1, value2, "financingcontroltype");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("SCALE is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(String value) {
            addCriterion("SCALE =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(String value) {
            addCriterion("SCALE <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(String value) {
            addCriterion("SCALE >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(String value) {
            addCriterion("SCALE >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(String value) {
            addCriterion("SCALE <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(String value) {
            addCriterion("SCALE <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLike(String value) {
            addCriterion("SCALE like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotLike(String value) {
            addCriterion("SCALE not like", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<String> values) {
            addCriterion("SCALE in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<String> values) {
            addCriterion("SCALE not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(String value1, String value2) {
            addCriterion("SCALE between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(String value1, String value2) {
            addCriterion("SCALE not between", value1, value2, "scale");
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