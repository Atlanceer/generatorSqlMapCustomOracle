package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CQuarantineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CQuarantineExample() {
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

        public Criteria andRatifydeptIsNull() {
            addCriterion("RATIFYDEPT is null");
            return (Criteria) this;
        }

        public Criteria andRatifydeptIsNotNull() {
            addCriterion("RATIFYDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andRatifydeptEqualTo(String value) {
            addCriterion("RATIFYDEPT =", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptNotEqualTo(String value) {
            addCriterion("RATIFYDEPT <>", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptGreaterThan(String value) {
            addCriterion("RATIFYDEPT >", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptGreaterThanOrEqualTo(String value) {
            addCriterion("RATIFYDEPT >=", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptLessThan(String value) {
            addCriterion("RATIFYDEPT <", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptLessThanOrEqualTo(String value) {
            addCriterion("RATIFYDEPT <=", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptLike(String value) {
            addCriterion("RATIFYDEPT like", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptNotLike(String value) {
            addCriterion("RATIFYDEPT not like", value, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptIn(List<String> values) {
            addCriterion("RATIFYDEPT in", values, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptNotIn(List<String> values) {
            addCriterion("RATIFYDEPT not in", values, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptBetween(String value1, String value2) {
            addCriterion("RATIFYDEPT between", value1, value2, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andRatifydeptNotBetween(String value1, String value2) {
            addCriterion("RATIFYDEPT not between", value1, value2, "ratifydept");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("PRODUCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("PRODUCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("PRODUCTNAME =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("PRODUCTNAME <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("PRODUCTNAME >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("PRODUCTNAME <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCTNAME <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("PRODUCTNAME like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("PRODUCTNAME not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("PRODUCTNAME in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("PRODUCTNAME not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("PRODUCTNAME not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andInuredateIsNull() {
            addCriterion("INUREDATE is null");
            return (Criteria) this;
        }

        public Criteria andInuredateIsNotNull() {
            addCriterion("INUREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInuredateEqualTo(String value) {
            addCriterion("INUREDATE =", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateNotEqualTo(String value) {
            addCriterion("INUREDATE <>", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateGreaterThan(String value) {
            addCriterion("INUREDATE >", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateGreaterThanOrEqualTo(String value) {
            addCriterion("INUREDATE >=", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateLessThan(String value) {
            addCriterion("INUREDATE <", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateLessThanOrEqualTo(String value) {
            addCriterion("INUREDATE <=", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateLike(String value) {
            addCriterion("INUREDATE like", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateNotLike(String value) {
            addCriterion("INUREDATE not like", value, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateIn(List<String> values) {
            addCriterion("INUREDATE in", values, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateNotIn(List<String> values) {
            addCriterion("INUREDATE not in", values, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateBetween(String value1, String value2) {
            addCriterion("INUREDATE between", value1, value2, "inuredate");
            return (Criteria) this;
        }

        public Criteria andInuredateNotBetween(String value1, String value2) {
            addCriterion("INUREDATE not between", value1, value2, "inuredate");
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