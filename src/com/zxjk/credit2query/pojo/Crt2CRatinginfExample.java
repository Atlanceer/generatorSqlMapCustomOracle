package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CRatinginfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CRatinginfExample() {
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

        public Criteria andRatinginformationidIsNull() {
            addCriterion("RATINGINFORMATIONID is null");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidIsNotNull() {
            addCriterion("RATINGINFORMATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidEqualTo(String value) {
            addCriterion("RATINGINFORMATIONID =", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidNotEqualTo(String value) {
            addCriterion("RATINGINFORMATIONID <>", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidGreaterThan(String value) {
            addCriterion("RATINGINFORMATIONID >", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidGreaterThanOrEqualTo(String value) {
            addCriterion("RATINGINFORMATIONID >=", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidLessThan(String value) {
            addCriterion("RATINGINFORMATIONID <", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidLessThanOrEqualTo(String value) {
            addCriterion("RATINGINFORMATIONID <=", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidLike(String value) {
            addCriterion("RATINGINFORMATIONID like", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidNotLike(String value) {
            addCriterion("RATINGINFORMATIONID not like", value, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidIn(List<String> values) {
            addCriterion("RATINGINFORMATIONID in", values, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidNotIn(List<String> values) {
            addCriterion("RATINGINFORMATIONID not in", values, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidBetween(String value1, String value2) {
            addCriterion("RATINGINFORMATIONID between", value1, value2, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andRatinginformationidNotBetween(String value1, String value2) {
            addCriterion("RATINGINFORMATIONID not between", value1, value2, "ratinginformationid");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameIsNull() {
            addCriterion("ORAGANIZATIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameIsNotNull() {
            addCriterion("ORAGANIZATIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameEqualTo(String value) {
            addCriterion("ORAGANIZATIONNAME =", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameNotEqualTo(String value) {
            addCriterion("ORAGANIZATIONNAME <>", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameGreaterThan(String value) {
            addCriterion("ORAGANIZATIONNAME >", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORAGANIZATIONNAME >=", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameLessThan(String value) {
            addCriterion("ORAGANIZATIONNAME <", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameLessThanOrEqualTo(String value) {
            addCriterion("ORAGANIZATIONNAME <=", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameLike(String value) {
            addCriterion("ORAGANIZATIONNAME like", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameNotLike(String value) {
            addCriterion("ORAGANIZATIONNAME not like", value, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameIn(List<String> values) {
            addCriterion("ORAGANIZATIONNAME in", values, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameNotIn(List<String> values) {
            addCriterion("ORAGANIZATIONNAME not in", values, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameBetween(String value1, String value2) {
            addCriterion("ORAGANIZATIONNAME between", value1, value2, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andOraganizationnameNotBetween(String value1, String value2) {
            addCriterion("ORAGANIZATIONNAME not between", value1, value2, "oraganizationname");
            return (Criteria) this;
        }

        public Criteria andRatingdateIsNull() {
            addCriterion("RATINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andRatingdateIsNotNull() {
            addCriterion("RATINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRatingdateEqualTo(String value) {
            addCriterion("RATINGDATE =", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateNotEqualTo(String value) {
            addCriterion("RATINGDATE <>", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateGreaterThan(String value) {
            addCriterion("RATINGDATE >", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateGreaterThanOrEqualTo(String value) {
            addCriterion("RATINGDATE >=", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateLessThan(String value) {
            addCriterion("RATINGDATE <", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateLessThanOrEqualTo(String value) {
            addCriterion("RATINGDATE <=", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateLike(String value) {
            addCriterion("RATINGDATE like", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateNotLike(String value) {
            addCriterion("RATINGDATE not like", value, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateIn(List<String> values) {
            addCriterion("RATINGDATE in", values, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateNotIn(List<String> values) {
            addCriterion("RATINGDATE not in", values, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateBetween(String value1, String value2) {
            addCriterion("RATINGDATE between", value1, value2, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingdateNotBetween(String value1, String value2) {
            addCriterion("RATINGDATE not between", value1, value2, "ratingdate");
            return (Criteria) this;
        }

        public Criteria andRatingresultsIsNull() {
            addCriterion("RATINGRESULTS is null");
            return (Criteria) this;
        }

        public Criteria andRatingresultsIsNotNull() {
            addCriterion("RATINGRESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andRatingresultsEqualTo(String value) {
            addCriterion("RATINGRESULTS =", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsNotEqualTo(String value) {
            addCriterion("RATINGRESULTS <>", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsGreaterThan(String value) {
            addCriterion("RATINGRESULTS >", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsGreaterThanOrEqualTo(String value) {
            addCriterion("RATINGRESULTS >=", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsLessThan(String value) {
            addCriterion("RATINGRESULTS <", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsLessThanOrEqualTo(String value) {
            addCriterion("RATINGRESULTS <=", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsLike(String value) {
            addCriterion("RATINGRESULTS like", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsNotLike(String value) {
            addCriterion("RATINGRESULTS not like", value, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsIn(List<String> values) {
            addCriterion("RATINGRESULTS in", values, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsNotIn(List<String> values) {
            addCriterion("RATINGRESULTS not in", values, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsBetween(String value1, String value2) {
            addCriterion("RATINGRESULTS between", value1, value2, "ratingresults");
            return (Criteria) this;
        }

        public Criteria andRatingresultsNotBetween(String value1, String value2) {
            addCriterion("RATINGRESULTS not between", value1, value2, "ratingresults");
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