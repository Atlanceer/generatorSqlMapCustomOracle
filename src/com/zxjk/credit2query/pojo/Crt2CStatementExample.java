package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CStatementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CStatementExample() {
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

        public Criteria andObjecttypeIsNull() {
            addCriterion("OBJECTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIsNotNull() {
            addCriterion("OBJECTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjecttypeEqualTo(String value) {
            addCriterion("OBJECTTYPE =", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotEqualTo(String value) {
            addCriterion("OBJECTTYPE <>", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeGreaterThan(String value) {
            addCriterion("OBJECTTYPE >", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTTYPE >=", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLessThan(String value) {
            addCriterion("OBJECTTYPE <", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECTTYPE <=", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeLike(String value) {
            addCriterion("OBJECTTYPE like", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotLike(String value) {
            addCriterion("OBJECTTYPE not like", value, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeIn(List<String> values) {
            addCriterion("OBJECTTYPE in", values, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotIn(List<String> values) {
            addCriterion("OBJECTTYPE not in", values, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeBetween(String value1, String value2) {
            addCriterion("OBJECTTYPE between", value1, value2, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjecttypeNotBetween(String value1, String value2) {
            addCriterion("OBJECTTYPE not between", value1, value2, "objecttype");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationIsNull() {
            addCriterion("OBJECTIDENTIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationIsNotNull() {
            addCriterion("OBJECTIDENTIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationEqualTo(String value) {
            addCriterion("OBJECTIDENTIFICATION =", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationNotEqualTo(String value) {
            addCriterion("OBJECTIDENTIFICATION <>", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationGreaterThan(String value) {
            addCriterion("OBJECTIDENTIFICATION >", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECTIDENTIFICATION >=", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationLessThan(String value) {
            addCriterion("OBJECTIDENTIFICATION <", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationLessThanOrEqualTo(String value) {
            addCriterion("OBJECTIDENTIFICATION <=", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationLike(String value) {
            addCriterion("OBJECTIDENTIFICATION like", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationNotLike(String value) {
            addCriterion("OBJECTIDENTIFICATION not like", value, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationIn(List<String> values) {
            addCriterion("OBJECTIDENTIFICATION in", values, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationNotIn(List<String> values) {
            addCriterion("OBJECTIDENTIFICATION not in", values, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationBetween(String value1, String value2) {
            addCriterion("OBJECTIDENTIFICATION between", value1, value2, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andObjectidentificationNotBetween(String value1, String value2) {
            addCriterion("OBJECTIDENTIFICATION not between", value1, value2, "objectidentification");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeIsNull() {
            addCriterion("DECALARATIONSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeIsNotNull() {
            addCriterion("DECALARATIONSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeEqualTo(String value) {
            addCriterion("DECALARATIONSTYPE =", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeNotEqualTo(String value) {
            addCriterion("DECALARATIONSTYPE <>", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeGreaterThan(String value) {
            addCriterion("DECALARATIONSTYPE >", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeGreaterThanOrEqualTo(String value) {
            addCriterion("DECALARATIONSTYPE >=", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeLessThan(String value) {
            addCriterion("DECALARATIONSTYPE <", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeLessThanOrEqualTo(String value) {
            addCriterion("DECALARATIONSTYPE <=", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeLike(String value) {
            addCriterion("DECALARATIONSTYPE like", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeNotLike(String value) {
            addCriterion("DECALARATIONSTYPE not like", value, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeIn(List<String> values) {
            addCriterion("DECALARATIONSTYPE in", values, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeNotIn(List<String> values) {
            addCriterion("DECALARATIONSTYPE not in", values, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeBetween(String value1, String value2) {
            addCriterion("DECALARATIONSTYPE between", value1, value2, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationstypeNotBetween(String value1, String value2) {
            addCriterion("DECALARATIONSTYPE not between", value1, value2, "decalarationstype");
            return (Criteria) this;
        }

        public Criteria andDecalarationsIsNull() {
            addCriterion("DECALARATIONS is null");
            return (Criteria) this;
        }

        public Criteria andDecalarationsIsNotNull() {
            addCriterion("DECALARATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andDecalarationsEqualTo(String value) {
            addCriterion("DECALARATIONS =", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsNotEqualTo(String value) {
            addCriterion("DECALARATIONS <>", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsGreaterThan(String value) {
            addCriterion("DECALARATIONS >", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsGreaterThanOrEqualTo(String value) {
            addCriterion("DECALARATIONS >=", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsLessThan(String value) {
            addCriterion("DECALARATIONS <", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsLessThanOrEqualTo(String value) {
            addCriterion("DECALARATIONS <=", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsLike(String value) {
            addCriterion("DECALARATIONS like", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsNotLike(String value) {
            addCriterion("DECALARATIONS not like", value, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsIn(List<String> values) {
            addCriterion("DECALARATIONS in", values, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsNotIn(List<String> values) {
            addCriterion("DECALARATIONS not in", values, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsBetween(String value1, String value2) {
            addCriterion("DECALARATIONS between", value1, value2, "decalarations");
            return (Criteria) this;
        }

        public Criteria andDecalarationsNotBetween(String value1, String value2) {
            addCriterion("DECALARATIONS not between", value1, value2, "decalarations");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNull() {
            addCriterion("ADDDATE is null");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNotNull() {
            addCriterion("ADDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAdddateEqualTo(String value) {
            addCriterion("ADDDATE =", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotEqualTo(String value) {
            addCriterion("ADDDATE <>", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThan(String value) {
            addCriterion("ADDDATE >", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThanOrEqualTo(String value) {
            addCriterion("ADDDATE >=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThan(String value) {
            addCriterion("ADDDATE <", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThanOrEqualTo(String value) {
            addCriterion("ADDDATE <=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLike(String value) {
            addCriterion("ADDDATE like", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotLike(String value) {
            addCriterion("ADDDATE not like", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateIn(List<String> values) {
            addCriterion("ADDDATE in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotIn(List<String> values) {
            addCriterion("ADDDATE not in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateBetween(String value1, String value2) {
            addCriterion("ADDDATE between", value1, value2, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotBetween(String value1, String value2) {
            addCriterion("ADDDATE not between", value1, value2, "adddate");
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