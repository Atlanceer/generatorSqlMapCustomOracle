package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CActualcontrollerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CActualcontrollerExample() {
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

        public Criteria andActualcontrolnumberIsNull() {
            addCriterion("ACTUALCONTROLNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberIsNotNull() {
            addCriterion("ACTUALCONTROLNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberEqualTo(String value) {
            addCriterion("ACTUALCONTROLNUMBER =", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberNotEqualTo(String value) {
            addCriterion("ACTUALCONTROLNUMBER <>", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberGreaterThan(String value) {
            addCriterion("ACTUALCONTROLNUMBER >", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLNUMBER >=", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberLessThan(String value) {
            addCriterion("ACTUALCONTROLNUMBER <", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLNUMBER <=", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberLike(String value) {
            addCriterion("ACTUALCONTROLNUMBER like", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberNotLike(String value) {
            addCriterion("ACTUALCONTROLNUMBER not like", value, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberIn(List<String> values) {
            addCriterion("ACTUALCONTROLNUMBER in", values, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberNotIn(List<String> values) {
            addCriterion("ACTUALCONTROLNUMBER not in", values, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLNUMBER between", value1, value2, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolnumberNotBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLNUMBER not between", value1, value2, "actualcontrolnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeIsNull() {
            addCriterion("ACTUALCONTROLLERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeIsNotNull() {
            addCriterion("ACTUALCONTROLLERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERTYPE =", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeNotEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERTYPE <>", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeGreaterThan(String value) {
            addCriterion("ACTUALCONTROLLERTYPE >", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERTYPE >=", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeLessThan(String value) {
            addCriterion("ACTUALCONTROLLERTYPE <", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERTYPE <=", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeLike(String value) {
            addCriterion("ACTUALCONTROLLERTYPE like", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeNotLike(String value) {
            addCriterion("ACTUALCONTROLLERTYPE not like", value, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERTYPE in", values, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeNotIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERTYPE not in", values, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERTYPE between", value1, value2, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollertypeNotBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERTYPE not between", value1, value2, "actualcontrollertype");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameIsNull() {
            addCriterion("ACTUALCONTROLLERNAME is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameIsNotNull() {
            addCriterion("ACTUALCONTROLLERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERNAME =", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameNotEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERNAME <>", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameGreaterThan(String value) {
            addCriterion("ACTUALCONTROLLERNAME >", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERNAME >=", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameLessThan(String value) {
            addCriterion("ACTUALCONTROLLERNAME <", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERNAME <=", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameLike(String value) {
            addCriterion("ACTUALCONTROLLERNAME like", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameNotLike(String value) {
            addCriterion("ACTUALCONTROLLERNAME not like", value, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERNAME in", values, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameNotIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERNAME not in", values, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERNAME between", value1, value2, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrollernameNotBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERNAME not between", value1, value2, "actualcontrollername");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeIsNull() {
            addCriterion("ACTUALCONTROLLERIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeIsNotNull() {
            addCriterion("ACTUALCONTROLLERIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE =", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeNotEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE <>", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeGreaterThan(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE >", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE >=", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeLessThan(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE <", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE <=", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeLike(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE like", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeNotLike(String value) {
            addCriterion("ACTUALCONTROLLERIDTYPE not like", value, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERIDTYPE in", values, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeNotIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERIDTYPE not in", values, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERIDTYPE between", value1, value2, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridtypeNotBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERIDTYPE not between", value1, value2, "actualcontrolleridtype");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberIsNull() {
            addCriterion("ACTUALCONTROLLERIDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberIsNotNull() {
            addCriterion("ACTUALCONTROLLERIDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER =", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberNotEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER <>", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberGreaterThan(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER >", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER >=", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberLessThan(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER <", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER <=", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberLike(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER like", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberNotLike(String value) {
            addCriterion("ACTUALCONTROLLERIDNUMBER not like", value, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERIDNUMBER in", values, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberNotIn(List<String> values) {
            addCriterion("ACTUALCONTROLLERIDNUMBER not in", values, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERIDNUMBER between", value1, value2, "actualcontrolleridnumber");
            return (Criteria) this;
        }

        public Criteria andActualcontrolleridnumberNotBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLERIDNUMBER not between", value1, value2, "actualcontrolleridnumber");
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