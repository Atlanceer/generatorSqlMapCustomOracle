package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CTaxinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CTaxinfoExample() {
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

        public Criteria andTaxarrearsidIsNull() {
            addCriterion("TAXARREARSID is null");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidIsNotNull() {
            addCriterion("TAXARREARSID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidEqualTo(String value) {
            addCriterion("TAXARREARSID =", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidNotEqualTo(String value) {
            addCriterion("TAXARREARSID <>", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidGreaterThan(String value) {
            addCriterion("TAXARREARSID >", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidGreaterThanOrEqualTo(String value) {
            addCriterion("TAXARREARSID >=", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidLessThan(String value) {
            addCriterion("TAXARREARSID <", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidLessThanOrEqualTo(String value) {
            addCriterion("TAXARREARSID <=", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidLike(String value) {
            addCriterion("TAXARREARSID like", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidNotLike(String value) {
            addCriterion("TAXARREARSID not like", value, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidIn(List<String> values) {
            addCriterion("TAXARREARSID in", values, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidNotIn(List<String> values) {
            addCriterion("TAXARREARSID not in", values, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidBetween(String value1, String value2) {
            addCriterion("TAXARREARSID between", value1, value2, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxarrearsidNotBetween(String value1, String value2) {
            addCriterion("TAXARREARSID not between", value1, value2, "taxarrearsid");
            return (Criteria) this;
        }

        public Criteria andTaxbureauIsNull() {
            addCriterion("TAXBUREAU is null");
            return (Criteria) this;
        }

        public Criteria andTaxbureauIsNotNull() {
            addCriterion("TAXBUREAU is not null");
            return (Criteria) this;
        }

        public Criteria andTaxbureauEqualTo(String value) {
            addCriterion("TAXBUREAU =", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauNotEqualTo(String value) {
            addCriterion("TAXBUREAU <>", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauGreaterThan(String value) {
            addCriterion("TAXBUREAU >", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauGreaterThanOrEqualTo(String value) {
            addCriterion("TAXBUREAU >=", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauLessThan(String value) {
            addCriterion("TAXBUREAU <", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauLessThanOrEqualTo(String value) {
            addCriterion("TAXBUREAU <=", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauLike(String value) {
            addCriterion("TAXBUREAU like", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauNotLike(String value) {
            addCriterion("TAXBUREAU not like", value, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauIn(List<String> values) {
            addCriterion("TAXBUREAU in", values, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauNotIn(List<String> values) {
            addCriterion("TAXBUREAU not in", values, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauBetween(String value1, String value2) {
            addCriterion("TAXBUREAU between", value1, value2, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andTaxbureauNotBetween(String value1, String value2) {
            addCriterion("TAXBUREAU not between", value1, value2, "taxbureau");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountIsNull() {
            addCriterion("OWEDTAXAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountIsNotNull() {
            addCriterion("OWEDTAXAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountEqualTo(String value) {
            addCriterion("OWEDTAXAMOUNT =", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountNotEqualTo(String value) {
            addCriterion("OWEDTAXAMOUNT <>", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountGreaterThan(String value) {
            addCriterion("OWEDTAXAMOUNT >", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountGreaterThanOrEqualTo(String value) {
            addCriterion("OWEDTAXAMOUNT >=", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountLessThan(String value) {
            addCriterion("OWEDTAXAMOUNT <", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountLessThanOrEqualTo(String value) {
            addCriterion("OWEDTAXAMOUNT <=", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountLike(String value) {
            addCriterion("OWEDTAXAMOUNT like", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountNotLike(String value) {
            addCriterion("OWEDTAXAMOUNT not like", value, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountIn(List<String> values) {
            addCriterion("OWEDTAXAMOUNT in", values, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountNotIn(List<String> values) {
            addCriterion("OWEDTAXAMOUNT not in", values, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountBetween(String value1, String value2) {
            addCriterion("OWEDTAXAMOUNT between", value1, value2, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxamountNotBetween(String value1, String value2) {
            addCriterion("OWEDTAXAMOUNT not between", value1, value2, "owedtaxamount");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateIsNull() {
            addCriterion("OWEDTAXDATE is null");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateIsNotNull() {
            addCriterion("OWEDTAXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateEqualTo(String value) {
            addCriterion("OWEDTAXDATE =", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateNotEqualTo(String value) {
            addCriterion("OWEDTAXDATE <>", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateGreaterThan(String value) {
            addCriterion("OWEDTAXDATE >", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateGreaterThanOrEqualTo(String value) {
            addCriterion("OWEDTAXDATE >=", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateLessThan(String value) {
            addCriterion("OWEDTAXDATE <", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateLessThanOrEqualTo(String value) {
            addCriterion("OWEDTAXDATE <=", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateLike(String value) {
            addCriterion("OWEDTAXDATE like", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateNotLike(String value) {
            addCriterion("OWEDTAXDATE not like", value, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateIn(List<String> values) {
            addCriterion("OWEDTAXDATE in", values, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateNotIn(List<String> values) {
            addCriterion("OWEDTAXDATE not in", values, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateBetween(String value1, String value2) {
            addCriterion("OWEDTAXDATE between", value1, value2, "owedtaxdate");
            return (Criteria) this;
        }

        public Criteria andOwedtaxdateNotBetween(String value1, String value2) {
            addCriterion("OWEDTAXDATE not between", value1, value2, "owedtaxdate");
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