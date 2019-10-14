package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CCertificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CCertificationExample() {
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

        public Criteria andAuthenticationidIsNull() {
            addCriterion("AUTHENTICATIONID is null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidIsNotNull() {
            addCriterion("AUTHENTICATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidEqualTo(String value) {
            addCriterion("AUTHENTICATIONID =", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidNotEqualTo(String value) {
            addCriterion("AUTHENTICATIONID <>", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidGreaterThan(String value) {
            addCriterion("AUTHENTICATIONID >", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATIONID >=", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidLessThan(String value) {
            addCriterion("AUTHENTICATIONID <", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidLessThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATIONID <=", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidLike(String value) {
            addCriterion("AUTHENTICATIONID like", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidNotLike(String value) {
            addCriterion("AUTHENTICATIONID not like", value, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidIn(List<String> values) {
            addCriterion("AUTHENTICATIONID in", values, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidNotIn(List<String> values) {
            addCriterion("AUTHENTICATIONID not in", values, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidBetween(String value1, String value2) {
            addCriterion("AUTHENTICATIONID between", value1, value2, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andAuthenticationidNotBetween(String value1, String value2) {
            addCriterion("AUTHENTICATIONID not between", value1, value2, "authenticationid");
            return (Criteria) this;
        }

        public Criteria andCertificateorgIsNull() {
            addCriterion("CERTIFICATEORG is null");
            return (Criteria) this;
        }

        public Criteria andCertificateorgIsNotNull() {
            addCriterion("CERTIFICATEORG is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateorgEqualTo(String value) {
            addCriterion("CERTIFICATEORG =", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgNotEqualTo(String value) {
            addCriterion("CERTIFICATEORG <>", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgGreaterThan(String value) {
            addCriterion("CERTIFICATEORG >", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATEORG >=", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgLessThan(String value) {
            addCriterion("CERTIFICATEORG <", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATEORG <=", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgLike(String value) {
            addCriterion("CERTIFICATEORG like", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgNotLike(String value) {
            addCriterion("CERTIFICATEORG not like", value, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgIn(List<String> values) {
            addCriterion("CERTIFICATEORG in", values, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgNotIn(List<String> values) {
            addCriterion("CERTIFICATEORG not in", values, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgBetween(String value1, String value2) {
            addCriterion("CERTIFICATEORG between", value1, value2, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificateorgNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATEORG not between", value1, value2, "certificateorg");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatedateIsNull() {
            addCriterion("CERTIFICATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatedateIsNotNull() {
            addCriterion("CERTIFICATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatedateEqualTo(String value) {
            addCriterion("CERTIFICATEDATE =", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateNotEqualTo(String value) {
            addCriterion("CERTIFICATEDATE <>", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateGreaterThan(String value) {
            addCriterion("CERTIFICATEDATE >", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATEDATE >=", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateLessThan(String value) {
            addCriterion("CERTIFICATEDATE <", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATEDATE <=", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateLike(String value) {
            addCriterion("CERTIFICATEDATE like", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateNotLike(String value) {
            addCriterion("CERTIFICATEDATE not like", value, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateIn(List<String> values) {
            addCriterion("CERTIFICATEDATE in", values, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateNotIn(List<String> values) {
            addCriterion("CERTIFICATEDATE not in", values, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateBetween(String value1, String value2) {
            addCriterion("CERTIFICATEDATE between", value1, value2, "certificatedate");
            return (Criteria) this;
        }

        public Criteria andCertificatedateNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATEDATE not between", value1, value2, "certificatedate");
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