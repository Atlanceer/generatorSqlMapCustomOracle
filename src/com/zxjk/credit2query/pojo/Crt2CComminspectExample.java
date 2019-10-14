package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CComminspectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CComminspectExample() {
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

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andRuleofficeIsNull() {
            addCriterion("RULEOFFICE is null");
            return (Criteria) this;
        }

        public Criteria andRuleofficeIsNotNull() {
            addCriterion("RULEOFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andRuleofficeEqualTo(String value) {
            addCriterion("RULEOFFICE =", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeNotEqualTo(String value) {
            addCriterion("RULEOFFICE <>", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeGreaterThan(String value) {
            addCriterion("RULEOFFICE >", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeGreaterThanOrEqualTo(String value) {
            addCriterion("RULEOFFICE >=", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeLessThan(String value) {
            addCriterion("RULEOFFICE <", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeLessThanOrEqualTo(String value) {
            addCriterion("RULEOFFICE <=", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeLike(String value) {
            addCriterion("RULEOFFICE like", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeNotLike(String value) {
            addCriterion("RULEOFFICE not like", value, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeIn(List<String> values) {
            addCriterion("RULEOFFICE in", values, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeNotIn(List<String> values) {
            addCriterion("RULEOFFICE not in", values, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeBetween(String value1, String value2) {
            addCriterion("RULEOFFICE between", value1, value2, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andRuleofficeNotBetween(String value1, String value2) {
            addCriterion("RULEOFFICE not between", value1, value2, "ruleoffice");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelIsNull() {
            addCriterion("WARDSHIPLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelIsNotNull() {
            addCriterion("WARDSHIPLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelEqualTo(String value) {
            addCriterion("WARDSHIPLEVEL =", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelNotEqualTo(String value) {
            addCriterion("WARDSHIPLEVEL <>", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelGreaterThan(String value) {
            addCriterion("WARDSHIPLEVEL >", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelGreaterThanOrEqualTo(String value) {
            addCriterion("WARDSHIPLEVEL >=", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelLessThan(String value) {
            addCriterion("WARDSHIPLEVEL <", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelLessThanOrEqualTo(String value) {
            addCriterion("WARDSHIPLEVEL <=", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelLike(String value) {
            addCriterion("WARDSHIPLEVEL like", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelNotLike(String value) {
            addCriterion("WARDSHIPLEVEL not like", value, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelIn(List<String> values) {
            addCriterion("WARDSHIPLEVEL in", values, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelNotIn(List<String> values) {
            addCriterion("WARDSHIPLEVEL not in", values, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelBetween(String value1, String value2) {
            addCriterion("WARDSHIPLEVEL between", value1, value2, "wardshiplevel");
            return (Criteria) this;
        }

        public Criteria andWardshiplevelNotBetween(String value1, String value2) {
            addCriterion("WARDSHIPLEVEL not between", value1, value2, "wardshiplevel");
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

        public Criteria andValiditydateIsNull() {
            addCriterion("VALIDITYDATE is null");
            return (Criteria) this;
        }

        public Criteria andValiditydateIsNotNull() {
            addCriterion("VALIDITYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andValiditydateEqualTo(String value) {
            addCriterion("VALIDITYDATE =", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotEqualTo(String value) {
            addCriterion("VALIDITYDATE <>", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateGreaterThan(String value) {
            addCriterion("VALIDITYDATE >", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDITYDATE >=", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateLessThan(String value) {
            addCriterion("VALIDITYDATE <", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateLessThanOrEqualTo(String value) {
            addCriterion("VALIDITYDATE <=", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateLike(String value) {
            addCriterion("VALIDITYDATE like", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotLike(String value) {
            addCriterion("VALIDITYDATE not like", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateIn(List<String> values) {
            addCriterion("VALIDITYDATE in", values, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotIn(List<String> values) {
            addCriterion("VALIDITYDATE not in", values, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateBetween(String value1, String value2) {
            addCriterion("VALIDITYDATE between", value1, value2, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotBetween(String value1, String value2) {
            addCriterion("VALIDITYDATE not between", value1, value2, "validitydate");
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