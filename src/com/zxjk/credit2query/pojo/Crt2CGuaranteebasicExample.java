package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CGuaranteebasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CGuaranteebasicExample() {
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

        public Criteria andGuaranteeaccountidIsNull() {
            addCriterion("GUARANTEEACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidIsNotNull() {
            addCriterion("GUARANTEEACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTID =", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidNotEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTID <>", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidGreaterThan(String value) {
            addCriterion("GUARANTEEACCOUNTID >", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTID >=", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidLessThan(String value) {
            addCriterion("GUARANTEEACCOUNTID <", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTID <=", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidLike(String value) {
            addCriterion("GUARANTEEACCOUNTID like", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidNotLike(String value) {
            addCriterion("GUARANTEEACCOUNTID not like", value, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidIn(List<String> values) {
            addCriterion("GUARANTEEACCOUNTID in", values, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidNotIn(List<String> values) {
            addCriterion("GUARANTEEACCOUNTID not in", values, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidBetween(String value1, String value2) {
            addCriterion("GUARANTEEACCOUNTID between", value1, value2, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccountidNotBetween(String value1, String value2) {
            addCriterion("GUARANTEEACCOUNTID not between", value1, value2, "guaranteeaccountid");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeIsNull() {
            addCriterion("GUARANTEEACCOUNTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeIsNotNull() {
            addCriterion("GUARANTEEACCOUNTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE =", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeNotEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE <>", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeGreaterThan(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE >", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE >=", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeLessThan(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE <", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE <=", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeLike(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE like", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeNotLike(String value) {
            addCriterion("GUARANTEEACCOUNTTYPE not like", value, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeIn(List<String> values) {
            addCriterion("GUARANTEEACCOUNTTYPE in", values, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeNotIn(List<String> values) {
            addCriterion("GUARANTEEACCOUNTTYPE not in", values, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeBetween(String value1, String value2) {
            addCriterion("GUARANTEEACCOUNTTYPE between", value1, value2, "guaranteeaccounttype");
            return (Criteria) this;
        }

        public Criteria andGuaranteeaccounttypeNotBetween(String value1, String value2) {
            addCriterion("GUARANTEEACCOUNTTYPE not between", value1, value2, "guaranteeaccounttype");
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

        public Criteria andCreditagreementidIsNull() {
            addCriterion("CREDITAGREEMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidIsNotNull() {
            addCriterion("CREDITAGREEMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidEqualTo(String value) {
            addCriterion("CREDITAGREEMENTID =", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidNotEqualTo(String value) {
            addCriterion("CREDITAGREEMENTID <>", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidGreaterThan(String value) {
            addCriterion("CREDITAGREEMENTID >", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITAGREEMENTID >=", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidLessThan(String value) {
            addCriterion("CREDITAGREEMENTID <", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidLessThanOrEqualTo(String value) {
            addCriterion("CREDITAGREEMENTID <=", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidLike(String value) {
            addCriterion("CREDITAGREEMENTID like", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidNotLike(String value) {
            addCriterion("CREDITAGREEMENTID not like", value, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidIn(List<String> values) {
            addCriterion("CREDITAGREEMENTID in", values, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidNotIn(List<String> values) {
            addCriterion("CREDITAGREEMENTID not in", values, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidBetween(String value1, String value2) {
            addCriterion("CREDITAGREEMENTID between", value1, value2, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreditagreementidNotBetween(String value1, String value2) {
            addCriterion("CREDITAGREEMENTID not between", value1, value2, "creditagreementid");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionIsNull() {
            addCriterion("CATEGORYSUBDIVISION is null");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionIsNotNull() {
            addCriterion("CATEGORYSUBDIVISION is not null");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION =", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION <>", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionGreaterThan(String value) {
            addCriterion("CATEGORYSUBDIVISION >", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION >=", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionLessThan(String value) {
            addCriterion("CATEGORYSUBDIVISION <", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION <=", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionLike(String value) {
            addCriterion("CATEGORYSUBDIVISION like", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotLike(String value) {
            addCriterion("CATEGORYSUBDIVISION not like", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionIn(List<String> values) {
            addCriterion("CATEGORYSUBDIVISION in", values, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotIn(List<String> values) {
            addCriterion("CATEGORYSUBDIVISION not in", values, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionBetween(String value1, String value2) {
            addCriterion("CATEGORYSUBDIVISION between", value1, value2, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotBetween(String value1, String value2) {
            addCriterion("CATEGORYSUBDIVISION not between", value1, value2, "categorysubdivision");
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

        public Criteria andLssuancedateIsNull() {
            addCriterion("LSSUANCEDATE is null");
            return (Criteria) this;
        }

        public Criteria andLssuancedateIsNotNull() {
            addCriterion("LSSUANCEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLssuancedateEqualTo(String value) {
            addCriterion("LSSUANCEDATE =", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotEqualTo(String value) {
            addCriterion("LSSUANCEDATE <>", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateGreaterThan(String value) {
            addCriterion("LSSUANCEDATE >", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateGreaterThanOrEqualTo(String value) {
            addCriterion("LSSUANCEDATE >=", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateLessThan(String value) {
            addCriterion("LSSUANCEDATE <", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateLessThanOrEqualTo(String value) {
            addCriterion("LSSUANCEDATE <=", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateLike(String value) {
            addCriterion("LSSUANCEDATE like", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotLike(String value) {
            addCriterion("LSSUANCEDATE not like", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateIn(List<String> values) {
            addCriterion("LSSUANCEDATE in", values, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotIn(List<String> values) {
            addCriterion("LSSUANCEDATE not in", values, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateBetween(String value1, String value2) {
            addCriterion("LSSUANCEDATE between", value1, value2, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotBetween(String value1, String value2) {
            addCriterion("LSSUANCEDATE not between", value1, value2, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("MONEY =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("MONEY <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("MONEY >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MONEY >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("MONEY <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("MONEY <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("MONEY like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("MONEY not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("MONEY in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("MONEY not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("MONEY between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("MONEY not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andExpdateIsNull() {
            addCriterion("EXPDATE is null");
            return (Criteria) this;
        }

        public Criteria andExpdateIsNotNull() {
            addCriterion("EXPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpdateEqualTo(String value) {
            addCriterion("EXPDATE =", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotEqualTo(String value) {
            addCriterion("EXPDATE <>", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateGreaterThan(String value) {
            addCriterion("EXPDATE >", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateGreaterThanOrEqualTo(String value) {
            addCriterion("EXPDATE >=", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLessThan(String value) {
            addCriterion("EXPDATE <", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLessThanOrEqualTo(String value) {
            addCriterion("EXPDATE <=", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateLike(String value) {
            addCriterion("EXPDATE like", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotLike(String value) {
            addCriterion("EXPDATE not like", value, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateIn(List<String> values) {
            addCriterion("EXPDATE in", values, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotIn(List<String> values) {
            addCriterion("EXPDATE not in", values, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateBetween(String value1, String value2) {
            addCriterion("EXPDATE between", value1, value2, "expdate");
            return (Criteria) this;
        }

        public Criteria andExpdateNotBetween(String value1, String value2) {
            addCriterion("EXPDATE not between", value1, value2, "expdate");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeIsNull() {
            addCriterion("ANTIGUARANTEE is null");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeIsNotNull() {
            addCriterion("ANTIGUARANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeEqualTo(String value) {
            addCriterion("ANTIGUARANTEE =", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeNotEqualTo(String value) {
            addCriterion("ANTIGUARANTEE <>", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeGreaterThan(String value) {
            addCriterion("ANTIGUARANTEE >", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("ANTIGUARANTEE >=", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeLessThan(String value) {
            addCriterion("ANTIGUARANTEE <", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeLessThanOrEqualTo(String value) {
            addCriterion("ANTIGUARANTEE <=", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeLike(String value) {
            addCriterion("ANTIGUARANTEE like", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeNotLike(String value) {
            addCriterion("ANTIGUARANTEE not like", value, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeIn(List<String> values) {
            addCriterion("ANTIGUARANTEE in", values, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeNotIn(List<String> values) {
            addCriterion("ANTIGUARANTEE not in", values, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeBetween(String value1, String value2) {
            addCriterion("ANTIGUARANTEE between", value1, value2, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteeNotBetween(String value1, String value2) {
            addCriterion("ANTIGUARANTEE not between", value1, value2, "antiguarantee");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentIsNull() {
            addCriterion("OTHERREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentIsNotNull() {
            addCriterion("OTHERREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentEqualTo(String value) {
            addCriterion("OTHERREPAYMENT =", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotEqualTo(String value) {
            addCriterion("OTHERREPAYMENT <>", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentGreaterThan(String value) {
            addCriterion("OTHERREPAYMENT >", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERREPAYMENT >=", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentLessThan(String value) {
            addCriterion("OTHERREPAYMENT <", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentLessThanOrEqualTo(String value) {
            addCriterion("OTHERREPAYMENT <=", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentLike(String value) {
            addCriterion("OTHERREPAYMENT like", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotLike(String value) {
            addCriterion("OTHERREPAYMENT not like", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentIn(List<String> values) {
            addCriterion("OTHERREPAYMENT in", values, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotIn(List<String> values) {
            addCriterion("OTHERREPAYMENT not in", values, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentBetween(String value1, String value2) {
            addCriterion("OTHERREPAYMENT between", value1, value2, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotBetween(String value1, String value2) {
            addCriterion("OTHERREPAYMENT not between", value1, value2, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andMarginlevelIsNull() {
            addCriterion("MARGINLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMarginlevelIsNotNull() {
            addCriterion("MARGINLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMarginlevelEqualTo(String value) {
            addCriterion("MARGINLEVEL =", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelNotEqualTo(String value) {
            addCriterion("MARGINLEVEL <>", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelGreaterThan(String value) {
            addCriterion("MARGINLEVEL >", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelGreaterThanOrEqualTo(String value) {
            addCriterion("MARGINLEVEL >=", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelLessThan(String value) {
            addCriterion("MARGINLEVEL <", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelLessThanOrEqualTo(String value) {
            addCriterion("MARGINLEVEL <=", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelLike(String value) {
            addCriterion("MARGINLEVEL like", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelNotLike(String value) {
            addCriterion("MARGINLEVEL not like", value, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelIn(List<String> values) {
            addCriterion("MARGINLEVEL in", values, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelNotIn(List<String> values) {
            addCriterion("MARGINLEVEL not in", values, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelBetween(String value1, String value2) {
            addCriterion("MARGINLEVEL between", value1, value2, "marginlevel");
            return (Criteria) this;
        }

        public Criteria andMarginlevelNotBetween(String value1, String value2) {
            addCriterion("MARGINLEVEL not between", value1, value2, "marginlevel");
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