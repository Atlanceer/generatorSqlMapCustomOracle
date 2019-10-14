package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Crt2CReportparsefailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CReportparsefailExample() {
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

        public Criteria andFailtablenameIsNull() {
            addCriterion("FAILTABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andFailtablenameIsNotNull() {
            addCriterion("FAILTABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFailtablenameEqualTo(String value) {
            addCriterion("FAILTABLENAME =", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameNotEqualTo(String value) {
            addCriterion("FAILTABLENAME <>", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameGreaterThan(String value) {
            addCriterion("FAILTABLENAME >", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameGreaterThanOrEqualTo(String value) {
            addCriterion("FAILTABLENAME >=", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameLessThan(String value) {
            addCriterion("FAILTABLENAME <", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameLessThanOrEqualTo(String value) {
            addCriterion("FAILTABLENAME <=", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameLike(String value) {
            addCriterion("FAILTABLENAME like", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameNotLike(String value) {
            addCriterion("FAILTABLENAME not like", value, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameIn(List<String> values) {
            addCriterion("FAILTABLENAME in", values, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameNotIn(List<String> values) {
            addCriterion("FAILTABLENAME not in", values, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameBetween(String value1, String value2) {
            addCriterion("FAILTABLENAME between", value1, value2, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtablenameNotBetween(String value1, String value2) {
            addCriterion("FAILTABLENAME not between", value1, value2, "failtablename");
            return (Criteria) this;
        }

        public Criteria andFailtimeIsNull() {
            addCriterion("FAILTIME is null");
            return (Criteria) this;
        }

        public Criteria andFailtimeIsNotNull() {
            addCriterion("FAILTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFailtimeEqualTo(Date value) {
            addCriterion("FAILTIME =", value, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeNotEqualTo(Date value) {
            addCriterion("FAILTIME <>", value, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeGreaterThan(Date value) {
            addCriterion("FAILTIME >", value, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FAILTIME >=", value, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeLessThan(Date value) {
            addCriterion("FAILTIME <", value, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeLessThanOrEqualTo(Date value) {
            addCriterion("FAILTIME <=", value, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeIn(List<Date> values) {
            addCriterion("FAILTIME in", values, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeNotIn(List<Date> values) {
            addCriterion("FAILTIME not in", values, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeBetween(Date value1, Date value2) {
            addCriterion("FAILTIME between", value1, value2, "failtime");
            return (Criteria) this;
        }

        public Criteria andFailtimeNotBetween(Date value1, Date value2) {
            addCriterion("FAILTIME not between", value1, value2, "failtime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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