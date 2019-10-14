package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CDebitinterestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CDebitinterestExample() {
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

        public Criteria andInterestinformationidIsNull() {
            addCriterion("INTERESTINFORMATIONID is null");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidIsNotNull() {
            addCriterion("INTERESTINFORMATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidEqualTo(String value) {
            addCriterion("INTERESTINFORMATIONID =", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidNotEqualTo(String value) {
            addCriterion("INTERESTINFORMATIONID <>", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidGreaterThan(String value) {
            addCriterion("INTERESTINFORMATIONID >", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidGreaterThanOrEqualTo(String value) {
            addCriterion("INTERESTINFORMATIONID >=", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidLessThan(String value) {
            addCriterion("INTERESTINFORMATIONID <", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidLessThanOrEqualTo(String value) {
            addCriterion("INTERESTINFORMATIONID <=", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidLike(String value) {
            addCriterion("INTERESTINFORMATIONID like", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidNotLike(String value) {
            addCriterion("INTERESTINFORMATIONID not like", value, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidIn(List<String> values) {
            addCriterion("INTERESTINFORMATIONID in", values, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidNotIn(List<String> values) {
            addCriterion("INTERESTINFORMATIONID not in", values, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidBetween(String value1, String value2) {
            addCriterion("INTERESTINFORMATIONID between", value1, value2, "interestinformationid");
            return (Criteria) this;
        }

        public Criteria andInterestinformationidNotBetween(String value1, String value2) {
            addCriterion("INTERESTINFORMATIONID not between", value1, value2, "interestinformationid");
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

        public Criteria andMechanismcodeIsNull() {
            addCriterion("MECHANISMCODE is null");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeIsNotNull() {
            addCriterion("MECHANISMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeEqualTo(String value) {
            addCriterion("MECHANISMCODE =", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeNotEqualTo(String value) {
            addCriterion("MECHANISMCODE <>", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeGreaterThan(String value) {
            addCriterion("MECHANISMCODE >", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MECHANISMCODE >=", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeLessThan(String value) {
            addCriterion("MECHANISMCODE <", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeLessThanOrEqualTo(String value) {
            addCriterion("MECHANISMCODE <=", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeLike(String value) {
            addCriterion("MECHANISMCODE like", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeNotLike(String value) {
            addCriterion("MECHANISMCODE not like", value, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeIn(List<String> values) {
            addCriterion("MECHANISMCODE in", values, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeNotIn(List<String> values) {
            addCriterion("MECHANISMCODE not in", values, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeBetween(String value1, String value2) {
            addCriterion("MECHANISMCODE between", value1, value2, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andMechanismcodeNotBetween(String value1, String value2) {
            addCriterion("MECHANISMCODE not between", value1, value2, "mechanismcode");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestIsNull() {
            addCriterion("BALANCEINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestIsNotNull() {
            addCriterion("BALANCEINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestEqualTo(String value) {
            addCriterion("BALANCEINTEREST =", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestNotEqualTo(String value) {
            addCriterion("BALANCEINTEREST <>", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestGreaterThan(String value) {
            addCriterion("BALANCEINTEREST >", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCEINTEREST >=", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestLessThan(String value) {
            addCriterion("BALANCEINTEREST <", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestLessThanOrEqualTo(String value) {
            addCriterion("BALANCEINTEREST <=", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestLike(String value) {
            addCriterion("BALANCEINTEREST like", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestNotLike(String value) {
            addCriterion("BALANCEINTEREST not like", value, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestIn(List<String> values) {
            addCriterion("BALANCEINTEREST in", values, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestNotIn(List<String> values) {
            addCriterion("BALANCEINTEREST not in", values, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestBetween(String value1, String value2) {
            addCriterion("BALANCEINTEREST between", value1, value2, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andBalanceinterestNotBetween(String value1, String value2) {
            addCriterion("BALANCEINTEREST not between", value1, value2, "balanceinterest");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNull() {
            addCriterion("CHANGEDATE is null");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNotNull() {
            addCriterion("CHANGEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andChangedateEqualTo(String value) {
            addCriterion("CHANGEDATE =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(String value) {
            addCriterion("CHANGEDATE <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(String value) {
            addCriterion("CHANGEDATE >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGEDATE >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(String value) {
            addCriterion("CHANGEDATE <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(String value) {
            addCriterion("CHANGEDATE <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLike(String value) {
            addCriterion("CHANGEDATE like", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotLike(String value) {
            addCriterion("CHANGEDATE not like", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<String> values) {
            addCriterion("CHANGEDATE in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<String> values) {
            addCriterion("CHANGEDATE not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(String value1, String value2) {
            addCriterion("CHANGEDATE between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(String value1, String value2) {
            addCriterion("CHANGEDATE not between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeIsNull() {
            addCriterion("DEBITINTERESTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeIsNotNull() {
            addCriterion("DEBITINTERESTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeEqualTo(String value) {
            addCriterion("DEBITINTERESTTYPE =", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeNotEqualTo(String value) {
            addCriterion("DEBITINTERESTTYPE <>", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeGreaterThan(String value) {
            addCriterion("DEBITINTERESTTYPE >", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEBITINTERESTTYPE >=", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeLessThan(String value) {
            addCriterion("DEBITINTERESTTYPE <", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeLessThanOrEqualTo(String value) {
            addCriterion("DEBITINTERESTTYPE <=", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeLike(String value) {
            addCriterion("DEBITINTERESTTYPE like", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeNotLike(String value) {
            addCriterion("DEBITINTERESTTYPE not like", value, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeIn(List<String> values) {
            addCriterion("DEBITINTERESTTYPE in", values, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeNotIn(List<String> values) {
            addCriterion("DEBITINTERESTTYPE not in", values, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeBetween(String value1, String value2) {
            addCriterion("DEBITINTERESTTYPE between", value1, value2, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDebitinteresttypeNotBetween(String value1, String value2) {
            addCriterion("DEBITINTERESTTYPE not between", value1, value2, "debitinteresttype");
            return (Criteria) this;
        }

        public Criteria andDatereportIsNull() {
            addCriterion("DATEREPORT is null");
            return (Criteria) this;
        }

        public Criteria andDatereportIsNotNull() {
            addCriterion("DATEREPORT is not null");
            return (Criteria) this;
        }

        public Criteria andDatereportEqualTo(String value) {
            addCriterion("DATEREPORT =", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotEqualTo(String value) {
            addCriterion("DATEREPORT <>", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportGreaterThan(String value) {
            addCriterion("DATEREPORT >", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportGreaterThanOrEqualTo(String value) {
            addCriterion("DATEREPORT >=", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportLessThan(String value) {
            addCriterion("DATEREPORT <", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportLessThanOrEqualTo(String value) {
            addCriterion("DATEREPORT <=", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportLike(String value) {
            addCriterion("DATEREPORT like", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotLike(String value) {
            addCriterion("DATEREPORT not like", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportIn(List<String> values) {
            addCriterion("DATEREPORT in", values, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotIn(List<String> values) {
            addCriterion("DATEREPORT not in", values, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportBetween(String value1, String value2) {
            addCriterion("DATEREPORT between", value1, value2, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotBetween(String value1, String value2) {
            addCriterion("DATEREPORT not between", value1, value2, "datereport");
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