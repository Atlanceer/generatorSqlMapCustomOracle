package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CRrguaranteesumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CRrguaranteesumExample() {
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

        public Criteria andTyperesponsibilityIsNull() {
            addCriterion("TYPERESPONSIBILITY is null");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityIsNotNull() {
            addCriterion("TYPERESPONSIBILITY is not null");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityEqualTo(String value) {
            addCriterion("TYPERESPONSIBILITY =", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityNotEqualTo(String value) {
            addCriterion("TYPERESPONSIBILITY <>", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityGreaterThan(String value) {
            addCriterion("TYPERESPONSIBILITY >", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("TYPERESPONSIBILITY >=", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityLessThan(String value) {
            addCriterion("TYPERESPONSIBILITY <", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityLessThanOrEqualTo(String value) {
            addCriterion("TYPERESPONSIBILITY <=", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityLike(String value) {
            addCriterion("TYPERESPONSIBILITY like", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityNotLike(String value) {
            addCriterion("TYPERESPONSIBILITY not like", value, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityIn(List<String> values) {
            addCriterion("TYPERESPONSIBILITY in", values, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityNotIn(List<String> values) {
            addCriterion("TYPERESPONSIBILITY not in", values, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityBetween(String value1, String value2) {
            addCriterion("TYPERESPONSIBILITY between", value1, value2, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andTyperesponsibilityNotBetween(String value1, String value2) {
            addCriterion("TYPERESPONSIBILITY not between", value1, value2, "typeresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityIsNull() {
            addCriterion("REPAYMENTRESPONSIBILITY is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityIsNotNull() {
            addCriterion("REPAYMENTRESPONSIBILITY is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityEqualTo(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY =", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityNotEqualTo(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY <>", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityGreaterThan(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY >", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY >=", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityLessThan(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY <", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY <=", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityLike(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY like", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityNotLike(String value) {
            addCriterion("REPAYMENTRESPONSIBILITY not like", value, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityIn(List<String> values) {
            addCriterion("REPAYMENTRESPONSIBILITY in", values, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityNotIn(List<String> values) {
            addCriterion("REPAYMENTRESPONSIBILITY not in", values, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityBetween(String value1, String value2) {
            addCriterion("REPAYMENTRESPONSIBILITY between", value1, value2, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andRepaymentresponsibilityNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTRESPONSIBILITY not between", value1, value2, "repaymentresponsibility");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNull() {
            addCriterion("ACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNotNull() {
            addCriterion("ACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberEqualTo(String value) {
            addCriterion("ACCOUNTNUMBER =", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotEqualTo(String value) {
            addCriterion("ACCOUNTNUMBER <>", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThan(String value) {
            addCriterion("ACCOUNTNUMBER >", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNUMBER >=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThan(String value) {
            addCriterion("ACCOUNTNUMBER <", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNUMBER <=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLike(String value) {
            addCriterion("ACCOUNTNUMBER like", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotLike(String value) {
            addCriterion("ACCOUNTNUMBER not like", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIn(List<String> values) {
            addCriterion("ACCOUNTNUMBER in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotIn(List<String> values) {
            addCriterion("ACCOUNTNUMBER not in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberBetween(String value1, String value2) {
            addCriterion("ACCOUNTNUMBER between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNUMBER not between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("BALANCE like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("BALANCE not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceIsNull() {
            addCriterion("CONCEMCLASSBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceIsNotNull() {
            addCriterion("CONCEMCLASSBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceEqualTo(String value) {
            addCriterion("CONCEMCLASSBALANCE =", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceNotEqualTo(String value) {
            addCriterion("CONCEMCLASSBALANCE <>", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceGreaterThan(String value) {
            addCriterion("CONCEMCLASSBALANCE >", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("CONCEMCLASSBALANCE >=", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceLessThan(String value) {
            addCriterion("CONCEMCLASSBALANCE <", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceLessThanOrEqualTo(String value) {
            addCriterion("CONCEMCLASSBALANCE <=", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceLike(String value) {
            addCriterion("CONCEMCLASSBALANCE like", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceNotLike(String value) {
            addCriterion("CONCEMCLASSBALANCE not like", value, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceIn(List<String> values) {
            addCriterion("CONCEMCLASSBALANCE in", values, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceNotIn(List<String> values) {
            addCriterion("CONCEMCLASSBALANCE not in", values, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceBetween(String value1, String value2) {
            addCriterion("CONCEMCLASSBALANCE between", value1, value2, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andConcemclassbalanceNotBetween(String value1, String value2) {
            addCriterion("CONCEMCLASSBALANCE not between", value1, value2, "concemclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceIsNull() {
            addCriterion("BADCLASSBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceIsNotNull() {
            addCriterion("BADCLASSBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceEqualTo(String value) {
            addCriterion("BADCLASSBALANCE =", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceNotEqualTo(String value) {
            addCriterion("BADCLASSBALANCE <>", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceGreaterThan(String value) {
            addCriterion("BADCLASSBALANCE >", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BADCLASSBALANCE >=", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceLessThan(String value) {
            addCriterion("BADCLASSBALANCE <", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceLessThanOrEqualTo(String value) {
            addCriterion("BADCLASSBALANCE <=", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceLike(String value) {
            addCriterion("BADCLASSBALANCE like", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceNotLike(String value) {
            addCriterion("BADCLASSBALANCE not like", value, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceIn(List<String> values) {
            addCriterion("BADCLASSBALANCE in", values, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceNotIn(List<String> values) {
            addCriterion("BADCLASSBALANCE not in", values, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceBetween(String value1, String value2) {
            addCriterion("BADCLASSBALANCE between", value1, value2, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andBadclassbalanceNotBetween(String value1, String value2) {
            addCriterion("BADCLASSBALANCE not between", value1, value2, "badclassbalance");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberIsNull() {
            addCriterion("RRGUARANTEESUMNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberIsNotNull() {
            addCriterion("RRGUARANTEESUMNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberEqualTo(String value) {
            addCriterion("RRGUARANTEESUMNUMBER =", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberNotEqualTo(String value) {
            addCriterion("RRGUARANTEESUMNUMBER <>", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberGreaterThan(String value) {
            addCriterion("RRGUARANTEESUMNUMBER >", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberGreaterThanOrEqualTo(String value) {
            addCriterion("RRGUARANTEESUMNUMBER >=", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberLessThan(String value) {
            addCriterion("RRGUARANTEESUMNUMBER <", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberLessThanOrEqualTo(String value) {
            addCriterion("RRGUARANTEESUMNUMBER <=", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberLike(String value) {
            addCriterion("RRGUARANTEESUMNUMBER like", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberNotLike(String value) {
            addCriterion("RRGUARANTEESUMNUMBER not like", value, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberIn(List<String> values) {
            addCriterion("RRGUARANTEESUMNUMBER in", values, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberNotIn(List<String> values) {
            addCriterion("RRGUARANTEESUMNUMBER not in", values, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberBetween(String value1, String value2) {
            addCriterion("RRGUARANTEESUMNUMBER between", value1, value2, "rrguaranteesumnumber");
            return (Criteria) this;
        }

        public Criteria andRrguaranteesumnumberNotBetween(String value1, String value2) {
            addCriterion("RRGUARANTEESUMNUMBER not between", value1, value2, "rrguaranteesumnumber");
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