package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntidinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntidinfoExample() {
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

        public Criteria andEntidtypeIsNull() {
            addCriterion("ENTIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntidtypeIsNotNull() {
            addCriterion("ENTIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntidtypeEqualTo(String value) {
            addCriterion("ENTIDTYPE =", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeNotEqualTo(String value) {
            addCriterion("ENTIDTYPE <>", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeGreaterThan(String value) {
            addCriterion("ENTIDTYPE >", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTIDTYPE >=", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeLessThan(String value) {
            addCriterion("ENTIDTYPE <", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeLessThanOrEqualTo(String value) {
            addCriterion("ENTIDTYPE <=", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeLike(String value) {
            addCriterion("ENTIDTYPE like", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeNotLike(String value) {
            addCriterion("ENTIDTYPE not like", value, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeIn(List<String> values) {
            addCriterion("ENTIDTYPE in", values, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeNotIn(List<String> values) {
            addCriterion("ENTIDTYPE not in", values, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeBetween(String value1, String value2) {
            addCriterion("ENTIDTYPE between", value1, value2, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidtypeNotBetween(String value1, String value2) {
            addCriterion("ENTIDTYPE not between", value1, value2, "entidtype");
            return (Criteria) this;
        }

        public Criteria andEntidnumberIsNull() {
            addCriterion("ENTIDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEntidnumberIsNotNull() {
            addCriterion("ENTIDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEntidnumberEqualTo(String value) {
            addCriterion("ENTIDNUMBER =", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberNotEqualTo(String value) {
            addCriterion("ENTIDNUMBER <>", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberGreaterThan(String value) {
            addCriterion("ENTIDNUMBER >", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ENTIDNUMBER >=", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberLessThan(String value) {
            addCriterion("ENTIDNUMBER <", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberLessThanOrEqualTo(String value) {
            addCriterion("ENTIDNUMBER <=", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberLike(String value) {
            addCriterion("ENTIDNUMBER like", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberNotLike(String value) {
            addCriterion("ENTIDNUMBER not like", value, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberIn(List<String> values) {
            addCriterion("ENTIDNUMBER in", values, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberNotIn(List<String> values) {
            addCriterion("ENTIDNUMBER not in", values, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberBetween(String value1, String value2) {
            addCriterion("ENTIDNUMBER between", value1, value2, "entidnumber");
            return (Criteria) this;
        }

        public Criteria andEntidnumberNotBetween(String value1, String value2) {
            addCriterion("ENTIDNUMBER not between", value1, value2, "entidnumber");
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