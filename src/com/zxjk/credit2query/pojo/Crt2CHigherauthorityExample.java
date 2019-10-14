package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CHigherauthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CHigherauthorityExample() {
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

        public Criteria andMechanismtypeIsNull() {
            addCriterion("MECHANISMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeIsNotNull() {
            addCriterion("MECHANISMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeEqualTo(String value) {
            addCriterion("MECHANISMTYPE =", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeNotEqualTo(String value) {
            addCriterion("MECHANISMTYPE <>", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeGreaterThan(String value) {
            addCriterion("MECHANISMTYPE >", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeGreaterThanOrEqualTo(String value) {
            addCriterion("MECHANISMTYPE >=", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeLessThan(String value) {
            addCriterion("MECHANISMTYPE <", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeLessThanOrEqualTo(String value) {
            addCriterion("MECHANISMTYPE <=", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeLike(String value) {
            addCriterion("MECHANISMTYPE like", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeNotLike(String value) {
            addCriterion("MECHANISMTYPE not like", value, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeIn(List<String> values) {
            addCriterion("MECHANISMTYPE in", values, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeNotIn(List<String> values) {
            addCriterion("MECHANISMTYPE not in", values, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeBetween(String value1, String value2) {
            addCriterion("MECHANISMTYPE between", value1, value2, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andMechanismtypeNotBetween(String value1, String value2) {
            addCriterion("MECHANISMTYPE not between", value1, value2, "mechanismtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNull() {
            addCriterion("ORGANIZATIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNotNull() {
            addCriterion("ORGANIZATIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME =", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME <>", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThan(String value) {
            addCriterion("ORGANIZATIONNAME >", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME >=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThan(String value) {
            addCriterion("ORGANIZATIONNAME <", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONNAME <=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLike(String value) {
            addCriterion("ORGANIZATIONNAME like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotLike(String value) {
            addCriterion("ORGANIZATIONNAME not like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIn(List<String> values) {
            addCriterion("ORGANIZATIONNAME in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotIn(List<String> values) {
            addCriterion("ORGANIZATIONNAME not in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONNAME between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONNAME not between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeIsNull() {
            addCriterion("MECHANISMIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeIsNotNull() {
            addCriterion("MECHANISMIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeEqualTo(String value) {
            addCriterion("MECHANISMIDTYPE =", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeNotEqualTo(String value) {
            addCriterion("MECHANISMIDTYPE <>", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeGreaterThan(String value) {
            addCriterion("MECHANISMIDTYPE >", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("MECHANISMIDTYPE >=", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeLessThan(String value) {
            addCriterion("MECHANISMIDTYPE <", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeLessThanOrEqualTo(String value) {
            addCriterion("MECHANISMIDTYPE <=", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeLike(String value) {
            addCriterion("MECHANISMIDTYPE like", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeNotLike(String value) {
            addCriterion("MECHANISMIDTYPE not like", value, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeIn(List<String> values) {
            addCriterion("MECHANISMIDTYPE in", values, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeNotIn(List<String> values) {
            addCriterion("MECHANISMIDTYPE not in", values, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeBetween(String value1, String value2) {
            addCriterion("MECHANISMIDTYPE between", value1, value2, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidtypeNotBetween(String value1, String value2) {
            addCriterion("MECHANISMIDTYPE not between", value1, value2, "mechanismidtype");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberIsNull() {
            addCriterion("MECHANISMIDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberIsNotNull() {
            addCriterion("MECHANISMIDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberEqualTo(String value) {
            addCriterion("MECHANISMIDNUMBER =", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberNotEqualTo(String value) {
            addCriterion("MECHANISMIDNUMBER <>", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberGreaterThan(String value) {
            addCriterion("MECHANISMIDNUMBER >", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberGreaterThanOrEqualTo(String value) {
            addCriterion("MECHANISMIDNUMBER >=", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberLessThan(String value) {
            addCriterion("MECHANISMIDNUMBER <", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberLessThanOrEqualTo(String value) {
            addCriterion("MECHANISMIDNUMBER <=", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberLike(String value) {
            addCriterion("MECHANISMIDNUMBER like", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberNotLike(String value) {
            addCriterion("MECHANISMIDNUMBER not like", value, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberIn(List<String> values) {
            addCriterion("MECHANISMIDNUMBER in", values, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberNotIn(List<String> values) {
            addCriterion("MECHANISMIDNUMBER not in", values, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberBetween(String value1, String value2) {
            addCriterion("MECHANISMIDNUMBER between", value1, value2, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andMechanismidnumberNotBetween(String value1, String value2) {
            addCriterion("MECHANISMIDNUMBER not between", value1, value2, "mechanismidnumber");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(String value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(String value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(String value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(String value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLike(String value) {
            addCriterion("UPDATEDATE like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotLike(String value) {
            addCriterion("UPDATEDATE not like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<String> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<String> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(String value1, String value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(String value1, String value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
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