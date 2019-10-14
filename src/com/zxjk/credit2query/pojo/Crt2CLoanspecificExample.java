package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CLoanspecificExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CLoanspecificExample() {
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

        public Criteria andSpecifictransactionnumberIsNull() {
            addCriterion("SPECIFICTRANSACTIONNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberIsNotNull() {
            addCriterion("SPECIFICTRANSACTIONNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER =", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberNotEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER <>", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberGreaterThan(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER >", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER >=", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberLessThan(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER <", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER <=", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberLike(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER like", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberNotLike(String value) {
            addCriterion("SPECIFICTRANSACTIONNUMBER not like", value, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberIn(List<String> values) {
            addCriterion("SPECIFICTRANSACTIONNUMBER in", values, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberNotIn(List<String> values) {
            addCriterion("SPECIFICTRANSACTIONNUMBER not in", values, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberBetween(String value1, String value2) {
            addCriterion("SPECIFICTRANSACTIONNUMBER between", value1, value2, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionnumberNotBetween(String value1, String value2) {
            addCriterion("SPECIFICTRANSACTIONNUMBER not between", value1, value2, "specifictransactionnumber");
            return (Criteria) this;
        }

        public Criteria andTypetransactionIsNull() {
            addCriterion("TYPETRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andTypetransactionIsNotNull() {
            addCriterion("TYPETRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andTypetransactionEqualTo(String value) {
            addCriterion("TYPETRANSACTION =", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionNotEqualTo(String value) {
            addCriterion("TYPETRANSACTION <>", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionGreaterThan(String value) {
            addCriterion("TYPETRANSACTION >", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionGreaterThanOrEqualTo(String value) {
            addCriterion("TYPETRANSACTION >=", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionLessThan(String value) {
            addCriterion("TYPETRANSACTION <", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionLessThanOrEqualTo(String value) {
            addCriterion("TYPETRANSACTION <=", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionLike(String value) {
            addCriterion("TYPETRANSACTION like", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionNotLike(String value) {
            addCriterion("TYPETRANSACTION not like", value, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionIn(List<String> values) {
            addCriterion("TYPETRANSACTION in", values, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionNotIn(List<String> values) {
            addCriterion("TYPETRANSACTION not in", values, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionBetween(String value1, String value2) {
            addCriterion("TYPETRANSACTION between", value1, value2, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andTypetransactionNotBetween(String value1, String value2) {
            addCriterion("TYPETRANSACTION not between", value1, value2, "typetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionIsNull() {
            addCriterion("DATETRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andDatetransactionIsNotNull() {
            addCriterion("DATETRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andDatetransactionEqualTo(String value) {
            addCriterion("DATETRANSACTION =", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionNotEqualTo(String value) {
            addCriterion("DATETRANSACTION <>", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionGreaterThan(String value) {
            addCriterion("DATETRANSACTION >", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionGreaterThanOrEqualTo(String value) {
            addCriterion("DATETRANSACTION >=", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionLessThan(String value) {
            addCriterion("DATETRANSACTION <", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionLessThanOrEqualTo(String value) {
            addCriterion("DATETRANSACTION <=", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionLike(String value) {
            addCriterion("DATETRANSACTION like", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionNotLike(String value) {
            addCriterion("DATETRANSACTION not like", value, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionIn(List<String> values) {
            addCriterion("DATETRANSACTION in", values, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionNotIn(List<String> values) {
            addCriterion("DATETRANSACTION not in", values, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionBetween(String value1, String value2) {
            addCriterion("DATETRANSACTION between", value1, value2, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andDatetransactionNotBetween(String value1, String value2) {
            addCriterion("DATETRANSACTION not between", value1, value2, "datetransaction");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIsNull() {
            addCriterion("TRANSACTIONAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIsNotNull() {
            addCriterion("TRANSACTIONAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionamountEqualTo(String value) {
            addCriterion("TRANSACTIONAMOUNT =", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotEqualTo(String value) {
            addCriterion("TRANSACTIONAMOUNT <>", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountGreaterThan(String value) {
            addCriterion("TRANSACTIONAMOUNT >", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONAMOUNT >=", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLessThan(String value) {
            addCriterion("TRANSACTIONAMOUNT <", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONAMOUNT <=", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLike(String value) {
            addCriterion("TRANSACTIONAMOUNT like", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotLike(String value) {
            addCriterion("TRANSACTIONAMOUNT not like", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIn(List<String> values) {
            addCriterion("TRANSACTIONAMOUNT in", values, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotIn(List<String> values) {
            addCriterion("TRANSACTIONAMOUNT not in", values, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountBetween(String value1, String value2) {
            addCriterion("TRANSACTIONAMOUNT between", value1, value2, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONAMOUNT not between", value1, value2, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andChangethemonthIsNull() {
            addCriterion("CHANGETHEMONTH is null");
            return (Criteria) this;
        }

        public Criteria andChangethemonthIsNotNull() {
            addCriterion("CHANGETHEMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andChangethemonthEqualTo(String value) {
            addCriterion("CHANGETHEMONTH =", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthNotEqualTo(String value) {
            addCriterion("CHANGETHEMONTH <>", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthGreaterThan(String value) {
            addCriterion("CHANGETHEMONTH >", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGETHEMONTH >=", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthLessThan(String value) {
            addCriterion("CHANGETHEMONTH <", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthLessThanOrEqualTo(String value) {
            addCriterion("CHANGETHEMONTH <=", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthLike(String value) {
            addCriterion("CHANGETHEMONTH like", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthNotLike(String value) {
            addCriterion("CHANGETHEMONTH not like", value, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthIn(List<String> values) {
            addCriterion("CHANGETHEMONTH in", values, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthNotIn(List<String> values) {
            addCriterion("CHANGETHEMONTH not in", values, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthBetween(String value1, String value2) {
            addCriterion("CHANGETHEMONTH between", value1, value2, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andChangethemonthNotBetween(String value1, String value2) {
            addCriterion("CHANGETHEMONTH not between", value1, value2, "changethemonth");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsIsNull() {
            addCriterion("TRANSACTIONDETAILS is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsIsNotNull() {
            addCriterion("TRANSACTIONDETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsEqualTo(String value) {
            addCriterion("TRANSACTIONDETAILS =", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsNotEqualTo(String value) {
            addCriterion("TRANSACTIONDETAILS <>", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsGreaterThan(String value) {
            addCriterion("TRANSACTIONDETAILS >", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONDETAILS >=", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsLessThan(String value) {
            addCriterion("TRANSACTIONDETAILS <", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTIONDETAILS <=", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsLike(String value) {
            addCriterion("TRANSACTIONDETAILS like", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsNotLike(String value) {
            addCriterion("TRANSACTIONDETAILS not like", value, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsIn(List<String> values) {
            addCriterion("TRANSACTIONDETAILS in", values, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsNotIn(List<String> values) {
            addCriterion("TRANSACTIONDETAILS not in", values, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsBetween(String value1, String value2) {
            addCriterion("TRANSACTIONDETAILS between", value1, value2, "transactiondetails");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsNotBetween(String value1, String value2) {
            addCriterion("TRANSACTIONDETAILS not between", value1, value2, "transactiondetails");
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