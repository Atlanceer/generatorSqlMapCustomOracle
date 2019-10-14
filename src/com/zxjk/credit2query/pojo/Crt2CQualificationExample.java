package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CQualificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CQualificationExample() {
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

        public Criteria andQualificationidIsNull() {
            addCriterion("QUALIFICATIONID is null");
            return (Criteria) this;
        }

        public Criteria andQualificationidIsNotNull() {
            addCriterion("QUALIFICATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationidEqualTo(String value) {
            addCriterion("QUALIFICATIONID =", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotEqualTo(String value) {
            addCriterion("QUALIFICATIONID <>", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidGreaterThan(String value) {
            addCriterion("QUALIFICATIONID >", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidGreaterThanOrEqualTo(String value) {
            addCriterion("QUALIFICATIONID >=", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidLessThan(String value) {
            addCriterion("QUALIFICATIONID <", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidLessThanOrEqualTo(String value) {
            addCriterion("QUALIFICATIONID <=", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidLike(String value) {
            addCriterion("QUALIFICATIONID like", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotLike(String value) {
            addCriterion("QUALIFICATIONID not like", value, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidIn(List<String> values) {
            addCriterion("QUALIFICATIONID in", values, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotIn(List<String> values) {
            addCriterion("QUALIFICATIONID not in", values, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidBetween(String value1, String value2) {
            addCriterion("QUALIFICATIONID between", value1, value2, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andQualificationidNotBetween(String value1, String value2) {
            addCriterion("QUALIFICATIONID not between", value1, value2, "qualificationid");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgIsNull() {
            addCriterion("IDENTIFYORG is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgIsNotNull() {
            addCriterion("IDENTIFYORG is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgEqualTo(String value) {
            addCriterion("IDENTIFYORG =", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgNotEqualTo(String value) {
            addCriterion("IDENTIFYORG <>", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgGreaterThan(String value) {
            addCriterion("IDENTIFYORG >", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFYORG >=", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgLessThan(String value) {
            addCriterion("IDENTIFYORG <", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFYORG <=", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgLike(String value) {
            addCriterion("IDENTIFYORG like", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgNotLike(String value) {
            addCriterion("IDENTIFYORG not like", value, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgIn(List<String> values) {
            addCriterion("IDENTIFYORG in", values, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgNotIn(List<String> values) {
            addCriterion("IDENTIFYORG not in", values, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgBetween(String value1, String value2) {
            addCriterion("IDENTIFYORG between", value1, value2, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andIdentifyorgNotBetween(String value1, String value2) {
            addCriterion("IDENTIFYORG not between", value1, value2, "identifyorg");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeIsNull() {
            addCriterion("QUALIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeIsNotNull() {
            addCriterion("QUALIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeEqualTo(String value) {
            addCriterion("QUALIFICATETYPE =", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeNotEqualTo(String value) {
            addCriterion("QUALIFICATETYPE <>", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeGreaterThan(String value) {
            addCriterion("QUALIFICATETYPE >", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUALIFICATETYPE >=", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeLessThan(String value) {
            addCriterion("QUALIFICATETYPE <", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeLessThanOrEqualTo(String value) {
            addCriterion("QUALIFICATETYPE <=", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeLike(String value) {
            addCriterion("QUALIFICATETYPE like", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeNotLike(String value) {
            addCriterion("QUALIFICATETYPE not like", value, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeIn(List<String> values) {
            addCriterion("QUALIFICATETYPE in", values, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeNotIn(List<String> values) {
            addCriterion("QUALIFICATETYPE not in", values, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeBetween(String value1, String value2) {
            addCriterion("QUALIFICATETYPE between", value1, value2, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andQualificatetypeNotBetween(String value1, String value2) {
            addCriterion("QUALIFICATETYPE not between", value1, value2, "qualificatetype");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNull() {
            addCriterion("APPROVALDATE is null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIsNotNull() {
            addCriterion("APPROVALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaldateEqualTo(String value) {
            addCriterion("APPROVALDATE =", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotEqualTo(String value) {
            addCriterion("APPROVALDATE <>", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThan(String value) {
            addCriterion("APPROVALDATE >", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVALDATE >=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThan(String value) {
            addCriterion("APPROVALDATE <", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLessThanOrEqualTo(String value) {
            addCriterion("APPROVALDATE <=", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateLike(String value) {
            addCriterion("APPROVALDATE like", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotLike(String value) {
            addCriterion("APPROVALDATE not like", value, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateIn(List<String> values) {
            addCriterion("APPROVALDATE in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotIn(List<String> values) {
            addCriterion("APPROVALDATE not in", values, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateBetween(String value1, String value2) {
            addCriterion("APPROVALDATE between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andApprovaldateNotBetween(String value1, String value2) {
            addCriterion("APPROVALDATE not between", value1, value2, "approvaldate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("ENDDATE like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("ENDDATE not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("CONTENT =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("CONTENT <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("CONTENT >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("CONTENT <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("CONTENT <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("CONTENT like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("CONTENT not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("CONTENT in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("CONTENT not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("CONTENT between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("CONTENT not between", value1, value2, "content");
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