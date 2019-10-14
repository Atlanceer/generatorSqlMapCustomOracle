package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CHousingfundhisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CHousingfundhisExample() {
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

        public Criteria andStatisticalyearIsNull() {
            addCriterion("STATISTICALYEAR is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearIsNotNull() {
            addCriterion("STATISTICALYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearEqualTo(String value) {
            addCriterion("STATISTICALYEAR =", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotEqualTo(String value) {
            addCriterion("STATISTICALYEAR <>", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearGreaterThan(String value) {
            addCriterion("STATISTICALYEAR >", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearGreaterThanOrEqualTo(String value) {
            addCriterion("STATISTICALYEAR >=", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearLessThan(String value) {
            addCriterion("STATISTICALYEAR <", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearLessThanOrEqualTo(String value) {
            addCriterion("STATISTICALYEAR <=", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearLike(String value) {
            addCriterion("STATISTICALYEAR like", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotLike(String value) {
            addCriterion("STATISTICALYEAR not like", value, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearIn(List<String> values) {
            addCriterion("STATISTICALYEAR in", values, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotIn(List<String> values) {
            addCriterion("STATISTICALYEAR not in", values, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearBetween(String value1, String value2) {
            addCriterion("STATISTICALYEAR between", value1, value2, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andStatisticalyearNotBetween(String value1, String value2) {
            addCriterion("STATISTICALYEAR not between", value1, value2, "statisticalyear");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIsNull() {
            addCriterion("ACCOUNTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIsNotNull() {
            addCriterion("ACCOUNTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAccountstatusEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS =", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS <>", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusGreaterThan(String value) {
            addCriterion("ACCOUNTSTATUS >", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS >=", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLessThan(String value) {
            addCriterion("ACCOUNTSTATUS <", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS <=", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLike(String value) {
            addCriterion("ACCOUNTSTATUS like", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotLike(String value) {
            addCriterion("ACCOUNTSTATUS not like", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIn(List<String> values) {
            addCriterion("ACCOUNTSTATUS in", values, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotIn(List<String> values) {
            addCriterion("ACCOUNTSTATUS not in", values, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTATUS between", value1, value2, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTATUS not between", value1, value2, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentIsNull() {
            addCriterion("AMOUNTPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentIsNotNull() {
            addCriterion("AMOUNTPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentEqualTo(String value) {
            addCriterion("AMOUNTPAYMENT =", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentNotEqualTo(String value) {
            addCriterion("AMOUNTPAYMENT <>", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentGreaterThan(String value) {
            addCriterion("AMOUNTPAYMENT >", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNTPAYMENT >=", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentLessThan(String value) {
            addCriterion("AMOUNTPAYMENT <", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentLessThanOrEqualTo(String value) {
            addCriterion("AMOUNTPAYMENT <=", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentLike(String value) {
            addCriterion("AMOUNTPAYMENT like", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentNotLike(String value) {
            addCriterion("AMOUNTPAYMENT not like", value, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentIn(List<String> values) {
            addCriterion("AMOUNTPAYMENT in", values, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentNotIn(List<String> values) {
            addCriterion("AMOUNTPAYMENT not in", values, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentBetween(String value1, String value2) {
            addCriterion("AMOUNTPAYMENT between", value1, value2, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andAmountpaymentNotBetween(String value1, String value2) {
            addCriterion("AMOUNTPAYMENT not between", value1, value2, "amountpayment");
            return (Criteria) this;
        }

        public Criteria andActualamountIsNull() {
            addCriterion("ACTUALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andActualamountIsNotNull() {
            addCriterion("ACTUALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andActualamountEqualTo(String value) {
            addCriterion("ACTUALAMOUNT =", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotEqualTo(String value) {
            addCriterion("ACTUALAMOUNT <>", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountGreaterThan(String value) {
            addCriterion("ACTUALAMOUNT >", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALAMOUNT >=", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLessThan(String value) {
            addCriterion("ACTUALAMOUNT <", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLessThanOrEqualTo(String value) {
            addCriterion("ACTUALAMOUNT <=", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLike(String value) {
            addCriterion("ACTUALAMOUNT like", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotLike(String value) {
            addCriterion("ACTUALAMOUNT not like", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountIn(List<String> values) {
            addCriterion("ACTUALAMOUNT in", values, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotIn(List<String> values) {
            addCriterion("ACTUALAMOUNT not in", values, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountBetween(String value1, String value2) {
            addCriterion("ACTUALAMOUNT between", value1, value2, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotBetween(String value1, String value2) {
            addCriterion("ACTUALAMOUNT not between", value1, value2, "actualamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountIsNull() {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountIsNotNull() {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT =", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT <>", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountGreaterThan(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT >", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT >=", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountLessThan(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT <", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountLessThanOrEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT <=", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountLike(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT like", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotLike(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT not like", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountIn(List<String> values) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT in", values, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotIn(List<String> values) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT not in", values, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountBetween(String value1, String value2) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT between", value1, value2, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotBetween(String value1, String value2) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT not between", value1, value2, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordIsNull() {
            addCriterion("PAYMENTRECORD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordIsNotNull() {
            addCriterion("PAYMENTRECORD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordEqualTo(String value) {
            addCriterion("PAYMENTRECORD =", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordNotEqualTo(String value) {
            addCriterion("PAYMENTRECORD <>", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordGreaterThan(String value) {
            addCriterion("PAYMENTRECORD >", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTRECORD >=", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordLessThan(String value) {
            addCriterion("PAYMENTRECORD <", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTRECORD <=", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordLike(String value) {
            addCriterion("PAYMENTRECORD like", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordNotLike(String value) {
            addCriterion("PAYMENTRECORD not like", value, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordIn(List<String> values) {
            addCriterion("PAYMENTRECORD in", values, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordNotIn(List<String> values) {
            addCriterion("PAYMENTRECORD not in", values, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordBetween(String value1, String value2) {
            addCriterion("PAYMENTRECORD between", value1, value2, "paymentrecord");
            return (Criteria) this;
        }

        public Criteria andPaymentrecordNotBetween(String value1, String value2) {
            addCriterion("PAYMENTRECORD not between", value1, value2, "paymentrecord");
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