package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CCreaditpromptsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CCreaditpromptsExample() {
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

        public Criteria andFirstcredityearIsNull() {
            addCriterion("FIRSTCREDITYEAR is null");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearIsNotNull() {
            addCriterion("FIRSTCREDITYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearEqualTo(String value) {
            addCriterion("FIRSTCREDITYEAR =", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearNotEqualTo(String value) {
            addCriterion("FIRSTCREDITYEAR <>", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearGreaterThan(String value) {
            addCriterion("FIRSTCREDITYEAR >", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTCREDITYEAR >=", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearLessThan(String value) {
            addCriterion("FIRSTCREDITYEAR <", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearLessThanOrEqualTo(String value) {
            addCriterion("FIRSTCREDITYEAR <=", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearLike(String value) {
            addCriterion("FIRSTCREDITYEAR like", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearNotLike(String value) {
            addCriterion("FIRSTCREDITYEAR not like", value, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearIn(List<String> values) {
            addCriterion("FIRSTCREDITYEAR in", values, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearNotIn(List<String> values) {
            addCriterion("FIRSTCREDITYEAR not in", values, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearBetween(String value1, String value2) {
            addCriterion("FIRSTCREDITYEAR between", value1, value2, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andFirstcredityearNotBetween(String value1, String value2) {
            addCriterion("FIRSTCREDITYEAR not between", value1, value2, "firstcredityear");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationIsNull() {
            addCriterion("CREDITGENERATION is null");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationIsNotNull() {
            addCriterion("CREDITGENERATION is not null");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationEqualTo(String value) {
            addCriterion("CREDITGENERATION =", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationNotEqualTo(String value) {
            addCriterion("CREDITGENERATION <>", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationGreaterThan(String value) {
            addCriterion("CREDITGENERATION >", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITGENERATION >=", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationLessThan(String value) {
            addCriterion("CREDITGENERATION <", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationLessThanOrEqualTo(String value) {
            addCriterion("CREDITGENERATION <=", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationLike(String value) {
            addCriterion("CREDITGENERATION like", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationNotLike(String value) {
            addCriterion("CREDITGENERATION not like", value, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationIn(List<String> values) {
            addCriterion("CREDITGENERATION in", values, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationNotIn(List<String> values) {
            addCriterion("CREDITGENERATION not in", values, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationBetween(String value1, String value2) {
            addCriterion("CREDITGENERATION between", value1, value2, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andCreditgenerationNotBetween(String value1, String value2) {
            addCriterion("CREDITGENERATION not between", value1, value2, "creditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationIsNull() {
            addCriterion("UNCLEAREDCREDITGENERATION is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationIsNotNull() {
            addCriterion("UNCLEAREDCREDITGENERATION is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationEqualTo(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION =", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationNotEqualTo(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION <>", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationGreaterThan(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION >", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationGreaterThanOrEqualTo(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION >=", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationLessThan(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION <", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationLessThanOrEqualTo(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION <=", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationLike(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION like", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationNotLike(String value) {
            addCriterion("UNCLEAREDCREDITGENERATION not like", value, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationIn(List<String> values) {
            addCriterion("UNCLEAREDCREDITGENERATION in", values, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationNotIn(List<String> values) {
            addCriterion("UNCLEAREDCREDITGENERATION not in", values, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationBetween(String value1, String value2) {
            addCriterion("UNCLEAREDCREDITGENERATION between", value1, value2, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andUnclearedcreditgenerationNotBetween(String value1, String value2) {
            addCriterion("UNCLEAREDCREDITGENERATION not between", value1, value2, "unclearedcreditgeneration");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsIsNull() {
            addCriterion("BALANCELOANTRANSACTIONS is null");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsIsNotNull() {
            addCriterion("BALANCELOANTRANSACTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsEqualTo(String value) {
            addCriterion("BALANCELOANTRANSACTIONS =", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsNotEqualTo(String value) {
            addCriterion("BALANCELOANTRANSACTIONS <>", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsGreaterThan(String value) {
            addCriterion("BALANCELOANTRANSACTIONS >", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCELOANTRANSACTIONS >=", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsLessThan(String value) {
            addCriterion("BALANCELOANTRANSACTIONS <", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsLessThanOrEqualTo(String value) {
            addCriterion("BALANCELOANTRANSACTIONS <=", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsLike(String value) {
            addCriterion("BALANCELOANTRANSACTIONS like", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsNotLike(String value) {
            addCriterion("BALANCELOANTRANSACTIONS not like", value, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsIn(List<String> values) {
            addCriterion("BALANCELOANTRANSACTIONS in", values, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsNotIn(List<String> values) {
            addCriterion("BALANCELOANTRANSACTIONS not in", values, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsBetween(String value1, String value2) {
            addCriterion("BALANCELOANTRANSACTIONS between", value1, value2, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBalanceloantransactionsNotBetween(String value1, String value2) {
            addCriterion("BALANCELOANTRANSACTIONS not between", value1, value2, "balanceloantransactions");
            return (Criteria) this;
        }

        public Criteria andBerecourseIsNull() {
            addCriterion("BERECOURSE is null");
            return (Criteria) this;
        }

        public Criteria andBerecourseIsNotNull() {
            addCriterion("BERECOURSE is not null");
            return (Criteria) this;
        }

        public Criteria andBerecourseEqualTo(String value) {
            addCriterion("BERECOURSE =", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseNotEqualTo(String value) {
            addCriterion("BERECOURSE <>", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseGreaterThan(String value) {
            addCriterion("BERECOURSE >", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseGreaterThanOrEqualTo(String value) {
            addCriterion("BERECOURSE >=", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseLessThan(String value) {
            addCriterion("BERECOURSE <", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseLessThanOrEqualTo(String value) {
            addCriterion("BERECOURSE <=", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseLike(String value) {
            addCriterion("BERECOURSE like", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseNotLike(String value) {
            addCriterion("BERECOURSE not like", value, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseIn(List<String> values) {
            addCriterion("BERECOURSE in", values, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseNotIn(List<String> values) {
            addCriterion("BERECOURSE not in", values, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseBetween(String value1, String value2) {
            addCriterion("BERECOURSE between", value1, value2, "berecourse");
            return (Criteria) this;
        }

        public Criteria andBerecourseNotBetween(String value1, String value2) {
            addCriterion("BERECOURSE not between", value1, value2, "berecourse");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingIsNull() {
            addCriterion("CONCERNEDABOUTLENDING is null");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingIsNotNull() {
            addCriterion("CONCERNEDABOUTLENDING is not null");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingEqualTo(String value) {
            addCriterion("CONCERNEDABOUTLENDING =", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingNotEqualTo(String value) {
            addCriterion("CONCERNEDABOUTLENDING <>", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingGreaterThan(String value) {
            addCriterion("CONCERNEDABOUTLENDING >", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingGreaterThanOrEqualTo(String value) {
            addCriterion("CONCERNEDABOUTLENDING >=", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingLessThan(String value) {
            addCriterion("CONCERNEDABOUTLENDING <", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingLessThanOrEqualTo(String value) {
            addCriterion("CONCERNEDABOUTLENDING <=", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingLike(String value) {
            addCriterion("CONCERNEDABOUTLENDING like", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingNotLike(String value) {
            addCriterion("CONCERNEDABOUTLENDING not like", value, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingIn(List<String> values) {
            addCriterion("CONCERNEDABOUTLENDING in", values, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingNotIn(List<String> values) {
            addCriterion("CONCERNEDABOUTLENDING not in", values, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingBetween(String value1, String value2) {
            addCriterion("CONCERNEDABOUTLENDING between", value1, value2, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andConcernedaboutlendingNotBetween(String value1, String value2) {
            addCriterion("CONCERNEDABOUTLENDING not between", value1, value2, "concernedaboutlending");
            return (Criteria) this;
        }

        public Criteria andBadloansIsNull() {
            addCriterion("BADLOANS is null");
            return (Criteria) this;
        }

        public Criteria andBadloansIsNotNull() {
            addCriterion("BADLOANS is not null");
            return (Criteria) this;
        }

        public Criteria andBadloansEqualTo(String value) {
            addCriterion("BADLOANS =", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansNotEqualTo(String value) {
            addCriterion("BADLOANS <>", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansGreaterThan(String value) {
            addCriterion("BADLOANS >", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansGreaterThanOrEqualTo(String value) {
            addCriterion("BADLOANS >=", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansLessThan(String value) {
            addCriterion("BADLOANS <", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansLessThanOrEqualTo(String value) {
            addCriterion("BADLOANS <=", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansLike(String value) {
            addCriterion("BADLOANS like", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansNotLike(String value) {
            addCriterion("BADLOANS not like", value, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansIn(List<String> values) {
            addCriterion("BADLOANS in", values, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansNotIn(List<String> values) {
            addCriterion("BADLOANS not in", values, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansBetween(String value1, String value2) {
            addCriterion("BADLOANS between", value1, value2, "badloans");
            return (Criteria) this;
        }

        public Criteria andBadloansNotBetween(String value1, String value2) {
            addCriterion("BADLOANS not between", value1, value2, "badloans");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsIsNull() {
            addCriterion("SECUREDTRANSACTIONS is null");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsIsNotNull() {
            addCriterion("SECUREDTRANSACTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsEqualTo(String value) {
            addCriterion("SECUREDTRANSACTIONS =", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsNotEqualTo(String value) {
            addCriterion("SECUREDTRANSACTIONS <>", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsGreaterThan(String value) {
            addCriterion("SECUREDTRANSACTIONS >", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsGreaterThanOrEqualTo(String value) {
            addCriterion("SECUREDTRANSACTIONS >=", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsLessThan(String value) {
            addCriterion("SECUREDTRANSACTIONS <", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsLessThanOrEqualTo(String value) {
            addCriterion("SECUREDTRANSACTIONS <=", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsLike(String value) {
            addCriterion("SECUREDTRANSACTIONS like", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsNotLike(String value) {
            addCriterion("SECUREDTRANSACTIONS not like", value, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsIn(List<String> values) {
            addCriterion("SECUREDTRANSACTIONS in", values, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsNotIn(List<String> values) {
            addCriterion("SECUREDTRANSACTIONS not in", values, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsBetween(String value1, String value2) {
            addCriterion("SECUREDTRANSACTIONS between", value1, value2, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andSecuredtransactionsNotBetween(String value1, String value2) {
            addCriterion("SECUREDTRANSACTIONS not between", value1, value2, "securedtransactions");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeIsNull() {
            addCriterion("CLASSGUARANTEE is null");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeIsNotNull() {
            addCriterion("CLASSGUARANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeEqualTo(String value) {
            addCriterion("CLASSGUARANTEE =", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeNotEqualTo(String value) {
            addCriterion("CLASSGUARANTEE <>", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeGreaterThan(String value) {
            addCriterion("CLASSGUARANTEE >", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSGUARANTEE >=", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeLessThan(String value) {
            addCriterion("CLASSGUARANTEE <", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeLessThanOrEqualTo(String value) {
            addCriterion("CLASSGUARANTEE <=", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeLike(String value) {
            addCriterion("CLASSGUARANTEE like", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeNotLike(String value) {
            addCriterion("CLASSGUARANTEE not like", value, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeIn(List<String> values) {
            addCriterion("CLASSGUARANTEE in", values, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeNotIn(List<String> values) {
            addCriterion("CLASSGUARANTEE not in", values, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeBetween(String value1, String value2) {
            addCriterion("CLASSGUARANTEE between", value1, value2, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andClassguaranteeNotBetween(String value1, String value2) {
            addCriterion("CLASSGUARANTEE not between", value1, value2, "classguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeIsNull() {
            addCriterion("BADCLASSGUARANTEE is null");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeIsNotNull() {
            addCriterion("BADCLASSGUARANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeEqualTo(String value) {
            addCriterion("BADCLASSGUARANTEE =", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeNotEqualTo(String value) {
            addCriterion("BADCLASSGUARANTEE <>", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeGreaterThan(String value) {
            addCriterion("BADCLASSGUARANTEE >", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("BADCLASSGUARANTEE >=", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeLessThan(String value) {
            addCriterion("BADCLASSGUARANTEE <", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeLessThanOrEqualTo(String value) {
            addCriterion("BADCLASSGUARANTEE <=", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeLike(String value) {
            addCriterion("BADCLASSGUARANTEE like", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeNotLike(String value) {
            addCriterion("BADCLASSGUARANTEE not like", value, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeIn(List<String> values) {
            addCriterion("BADCLASSGUARANTEE in", values, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeNotIn(List<String> values) {
            addCriterion("BADCLASSGUARANTEE not in", values, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeBetween(String value1, String value2) {
            addCriterion("BADCLASSGUARANTEE between", value1, value2, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andBadclassguaranteeNotBetween(String value1, String value2) {
            addCriterion("BADCLASSGUARANTEE not between", value1, value2, "badclassguarantee");
            return (Criteria) this;
        }

        public Criteria andNoncreditIsNull() {
            addCriterion("NONCREDIT is null");
            return (Criteria) this;
        }

        public Criteria andNoncreditIsNotNull() {
            addCriterion("NONCREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andNoncreditEqualTo(String value) {
            addCriterion("NONCREDIT =", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditNotEqualTo(String value) {
            addCriterion("NONCREDIT <>", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditGreaterThan(String value) {
            addCriterion("NONCREDIT >", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditGreaterThanOrEqualTo(String value) {
            addCriterion("NONCREDIT >=", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditLessThan(String value) {
            addCriterion("NONCREDIT <", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditLessThanOrEqualTo(String value) {
            addCriterion("NONCREDIT <=", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditLike(String value) {
            addCriterion("NONCREDIT like", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditNotLike(String value) {
            addCriterion("NONCREDIT not like", value, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditIn(List<String> values) {
            addCriterion("NONCREDIT in", values, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditNotIn(List<String> values) {
            addCriterion("NONCREDIT not in", values, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditBetween(String value1, String value2) {
            addCriterion("NONCREDIT between", value1, value2, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNoncreditNotBetween(String value1, String value2) {
            addCriterion("NONCREDIT not between", value1, value2, "noncredit");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsIsNull() {
            addCriterion("NUMBERTAXARREARS is null");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsIsNotNull() {
            addCriterion("NUMBERTAXARREARS is not null");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsEqualTo(String value) {
            addCriterion("NUMBERTAXARREARS =", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsNotEqualTo(String value) {
            addCriterion("NUMBERTAXARREARS <>", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsGreaterThan(String value) {
            addCriterion("NUMBERTAXARREARS >", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBERTAXARREARS >=", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsLessThan(String value) {
            addCriterion("NUMBERTAXARREARS <", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsLessThanOrEqualTo(String value) {
            addCriterion("NUMBERTAXARREARS <=", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsLike(String value) {
            addCriterion("NUMBERTAXARREARS like", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsNotLike(String value) {
            addCriterion("NUMBERTAXARREARS not like", value, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsIn(List<String> values) {
            addCriterion("NUMBERTAXARREARS in", values, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsNotIn(List<String> values) {
            addCriterion("NUMBERTAXARREARS not in", values, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsBetween(String value1, String value2) {
            addCriterion("NUMBERTAXARREARS between", value1, value2, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andNumbertaxarrearsNotBetween(String value1, String value2) {
            addCriterion("NUMBERTAXARREARS not between", value1, value2, "numbertaxarrears");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentIsNull() {
            addCriterion("CIVILJUDGMENT is null");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentIsNotNull() {
            addCriterion("CIVILJUDGMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentEqualTo(String value) {
            addCriterion("CIVILJUDGMENT =", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentNotEqualTo(String value) {
            addCriterion("CIVILJUDGMENT <>", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentGreaterThan(String value) {
            addCriterion("CIVILJUDGMENT >", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentGreaterThanOrEqualTo(String value) {
            addCriterion("CIVILJUDGMENT >=", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentLessThan(String value) {
            addCriterion("CIVILJUDGMENT <", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentLessThanOrEqualTo(String value) {
            addCriterion("CIVILJUDGMENT <=", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentLike(String value) {
            addCriterion("CIVILJUDGMENT like", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentNotLike(String value) {
            addCriterion("CIVILJUDGMENT not like", value, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentIn(List<String> values) {
            addCriterion("CIVILJUDGMENT in", values, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentNotIn(List<String> values) {
            addCriterion("CIVILJUDGMENT not in", values, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentBetween(String value1, String value2) {
            addCriterion("CIVILJUDGMENT between", value1, value2, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentNotBetween(String value1, String value2) {
            addCriterion("CIVILJUDGMENT not between", value1, value2, "civiljudgment");
            return (Criteria) this;
        }

        public Criteria andEnforcementIsNull() {
            addCriterion("ENFORCEMENT is null");
            return (Criteria) this;
        }

        public Criteria andEnforcementIsNotNull() {
            addCriterion("ENFORCEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEnforcementEqualTo(String value) {
            addCriterion("ENFORCEMENT =", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementNotEqualTo(String value) {
            addCriterion("ENFORCEMENT <>", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementGreaterThan(String value) {
            addCriterion("ENFORCEMENT >", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementGreaterThanOrEqualTo(String value) {
            addCriterion("ENFORCEMENT >=", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementLessThan(String value) {
            addCriterion("ENFORCEMENT <", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementLessThanOrEqualTo(String value) {
            addCriterion("ENFORCEMENT <=", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementLike(String value) {
            addCriterion("ENFORCEMENT like", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementNotLike(String value) {
            addCriterion("ENFORCEMENT not like", value, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementIn(List<String> values) {
            addCriterion("ENFORCEMENT in", values, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementNotIn(List<String> values) {
            addCriterion("ENFORCEMENT not in", values, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementBetween(String value1, String value2) {
            addCriterion("ENFORCEMENT between", value1, value2, "enforcement");
            return (Criteria) this;
        }

        public Criteria andEnforcementNotBetween(String value1, String value2) {
            addCriterion("ENFORCEMENT not between", value1, value2, "enforcement");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionIsNull() {
            addCriterion("ADMINISTRATIVESANCTION is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionIsNotNull() {
            addCriterion("ADMINISTRATIVESANCTION is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionEqualTo(String value) {
            addCriterion("ADMINISTRATIVESANCTION =", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionNotEqualTo(String value) {
            addCriterion("ADMINISTRATIVESANCTION <>", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionGreaterThan(String value) {
            addCriterion("ADMINISTRATIVESANCTION >", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINISTRATIVESANCTION >=", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionLessThan(String value) {
            addCriterion("ADMINISTRATIVESANCTION <", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionLessThanOrEqualTo(String value) {
            addCriterion("ADMINISTRATIVESANCTION <=", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionLike(String value) {
            addCriterion("ADMINISTRATIVESANCTION like", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionNotLike(String value) {
            addCriterion("ADMINISTRATIVESANCTION not like", value, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionIn(List<String> values) {
            addCriterion("ADMINISTRATIVESANCTION in", values, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionNotIn(List<String> values) {
            addCriterion("ADMINISTRATIVESANCTION not in", values, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionBetween(String value1, String value2) {
            addCriterion("ADMINISTRATIVESANCTION between", value1, value2, "administrativesanction");
            return (Criteria) this;
        }

        public Criteria andAdministrativesanctionNotBetween(String value1, String value2) {
            addCriterion("ADMINISTRATIVESANCTION not between", value1, value2, "administrativesanction");
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