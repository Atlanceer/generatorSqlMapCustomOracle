package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CGuaranteeacctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CGuaranteeacctExample() {
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

        public Criteria andFivelevelIsNull() {
            addCriterion("FIVELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFivelevelIsNotNull() {
            addCriterion("FIVELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFivelevelEqualTo(String value) {
            addCriterion("FIVELEVEL =", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotEqualTo(String value) {
            addCriterion("FIVELEVEL <>", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelGreaterThan(String value) {
            addCriterion("FIVELEVEL >", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelGreaterThanOrEqualTo(String value) {
            addCriterion("FIVELEVEL >=", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelLessThan(String value) {
            addCriterion("FIVELEVEL <", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelLessThanOrEqualTo(String value) {
            addCriterion("FIVELEVEL <=", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelLike(String value) {
            addCriterion("FIVELEVEL like", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotLike(String value) {
            addCriterion("FIVELEVEL not like", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelIn(List<String> values) {
            addCriterion("FIVELEVEL in", values, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotIn(List<String> values) {
            addCriterion("FIVELEVEL not in", values, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelBetween(String value1, String value2) {
            addCriterion("FIVELEVEL between", value1, value2, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotBetween(String value1, String value2) {
            addCriterion("FIVELEVEL not between", value1, value2, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsIsNull() {
            addCriterion("OUTSTANDINGACCOUNTS is null");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsIsNotNull() {
            addCriterion("OUTSTANDINGACCOUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsEqualTo(String value) {
            addCriterion("OUTSTANDINGACCOUNTS =", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsNotEqualTo(String value) {
            addCriterion("OUTSTANDINGACCOUNTS <>", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsGreaterThan(String value) {
            addCriterion("OUTSTANDINGACCOUNTS >", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsGreaterThanOrEqualTo(String value) {
            addCriterion("OUTSTANDINGACCOUNTS >=", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsLessThan(String value) {
            addCriterion("OUTSTANDINGACCOUNTS <", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsLessThanOrEqualTo(String value) {
            addCriterion("OUTSTANDINGACCOUNTS <=", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsLike(String value) {
            addCriterion("OUTSTANDINGACCOUNTS like", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsNotLike(String value) {
            addCriterion("OUTSTANDINGACCOUNTS not like", value, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsIn(List<String> values) {
            addCriterion("OUTSTANDINGACCOUNTS in", values, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsNotIn(List<String> values) {
            addCriterion("OUTSTANDINGACCOUNTS not in", values, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsBetween(String value1, String value2) {
            addCriterion("OUTSTANDINGACCOUNTS between", value1, value2, "outstandingaccounts");
            return (Criteria) this;
        }

        public Criteria andOutstandingaccountsNotBetween(String value1, String value2) {
            addCriterion("OUTSTANDINGACCOUNTS not between", value1, value2, "outstandingaccounts");
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

        public Criteria andThirtyinternalbalanceIsNull() {
            addCriterion("THIRTYINTERNALBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceIsNotNull() {
            addCriterion("THIRTYINTERNALBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceEqualTo(String value) {
            addCriterion("THIRTYINTERNALBALANCE =", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceNotEqualTo(String value) {
            addCriterion("THIRTYINTERNALBALANCE <>", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceGreaterThan(String value) {
            addCriterion("THIRTYINTERNALBALANCE >", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("THIRTYINTERNALBALANCE >=", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceLessThan(String value) {
            addCriterion("THIRTYINTERNALBALANCE <", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceLessThanOrEqualTo(String value) {
            addCriterion("THIRTYINTERNALBALANCE <=", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceLike(String value) {
            addCriterion("THIRTYINTERNALBALANCE like", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceNotLike(String value) {
            addCriterion("THIRTYINTERNALBALANCE not like", value, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceIn(List<String> values) {
            addCriterion("THIRTYINTERNALBALANCE in", values, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceNotIn(List<String> values) {
            addCriterion("THIRTYINTERNALBALANCE not in", values, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceBetween(String value1, String value2) {
            addCriterion("THIRTYINTERNALBALANCE between", value1, value2, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andThirtyinternalbalanceNotBetween(String value1, String value2) {
            addCriterion("THIRTYINTERNALBALANCE not between", value1, value2, "thirtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceIsNull() {
            addCriterion("SIXTYINTERNALBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceIsNotNull() {
            addCriterion("SIXTYINTERNALBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceEqualTo(String value) {
            addCriterion("SIXTYINTERNALBALANCE =", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceNotEqualTo(String value) {
            addCriterion("SIXTYINTERNALBALANCE <>", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceGreaterThan(String value) {
            addCriterion("SIXTYINTERNALBALANCE >", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("SIXTYINTERNALBALANCE >=", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceLessThan(String value) {
            addCriterion("SIXTYINTERNALBALANCE <", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceLessThanOrEqualTo(String value) {
            addCriterion("SIXTYINTERNALBALANCE <=", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceLike(String value) {
            addCriterion("SIXTYINTERNALBALANCE like", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceNotLike(String value) {
            addCriterion("SIXTYINTERNALBALANCE not like", value, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceIn(List<String> values) {
            addCriterion("SIXTYINTERNALBALANCE in", values, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceNotIn(List<String> values) {
            addCriterion("SIXTYINTERNALBALANCE not in", values, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceBetween(String value1, String value2) {
            addCriterion("SIXTYINTERNALBALANCE between", value1, value2, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andSixtyinternalbalanceNotBetween(String value1, String value2) {
            addCriterion("SIXTYINTERNALBALANCE not between", value1, value2, "sixtyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceIsNull() {
            addCriterion("NINETYINTERNALBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceIsNotNull() {
            addCriterion("NINETYINTERNALBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceEqualTo(String value) {
            addCriterion("NINETYINTERNALBALANCE =", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceNotEqualTo(String value) {
            addCriterion("NINETYINTERNALBALANCE <>", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceGreaterThan(String value) {
            addCriterion("NINETYINTERNALBALANCE >", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("NINETYINTERNALBALANCE >=", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceLessThan(String value) {
            addCriterion("NINETYINTERNALBALANCE <", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceLessThanOrEqualTo(String value) {
            addCriterion("NINETYINTERNALBALANCE <=", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceLike(String value) {
            addCriterion("NINETYINTERNALBALANCE like", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceNotLike(String value) {
            addCriterion("NINETYINTERNALBALANCE not like", value, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceIn(List<String> values) {
            addCriterion("NINETYINTERNALBALANCE in", values, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceNotIn(List<String> values) {
            addCriterion("NINETYINTERNALBALANCE not in", values, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceBetween(String value1, String value2) {
            addCriterion("NINETYINTERNALBALANCE between", value1, value2, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andNinetyinternalbalanceNotBetween(String value1, String value2) {
            addCriterion("NINETYINTERNALBALANCE not between", value1, value2, "ninetyinternalbalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceIsNull() {
            addCriterion("AFTERNINETYBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceIsNotNull() {
            addCriterion("AFTERNINETYBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceEqualTo(String value) {
            addCriterion("AFTERNINETYBALANCE =", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceNotEqualTo(String value) {
            addCriterion("AFTERNINETYBALANCE <>", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceGreaterThan(String value) {
            addCriterion("AFTERNINETYBALANCE >", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceGreaterThanOrEqualTo(String value) {
            addCriterion("AFTERNINETYBALANCE >=", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceLessThan(String value) {
            addCriterion("AFTERNINETYBALANCE <", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceLessThanOrEqualTo(String value) {
            addCriterion("AFTERNINETYBALANCE <=", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceLike(String value) {
            addCriterion("AFTERNINETYBALANCE like", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceNotLike(String value) {
            addCriterion("AFTERNINETYBALANCE not like", value, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceIn(List<String> values) {
            addCriterion("AFTERNINETYBALANCE in", values, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceNotIn(List<String> values) {
            addCriterion("AFTERNINETYBALANCE not in", values, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceBetween(String value1, String value2) {
            addCriterion("AFTERNINETYBALANCE between", value1, value2, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andAfterninetybalanceNotBetween(String value1, String value2) {
            addCriterion("AFTERNINETYBALANCE not between", value1, value2, "afterninetybalance");
            return (Criteria) this;
        }

        public Criteria andClosedaccountIsNull() {
            addCriterion("CLOSEDACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andClosedaccountIsNotNull() {
            addCriterion("CLOSEDACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andClosedaccountEqualTo(String value) {
            addCriterion("CLOSEDACCOUNT =", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountNotEqualTo(String value) {
            addCriterion("CLOSEDACCOUNT <>", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountGreaterThan(String value) {
            addCriterion("CLOSEDACCOUNT >", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSEDACCOUNT >=", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountLessThan(String value) {
            addCriterion("CLOSEDACCOUNT <", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountLessThanOrEqualTo(String value) {
            addCriterion("CLOSEDACCOUNT <=", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountLike(String value) {
            addCriterion("CLOSEDACCOUNT like", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountNotLike(String value) {
            addCriterion("CLOSEDACCOUNT not like", value, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountIn(List<String> values) {
            addCriterion("CLOSEDACCOUNT in", values, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountNotIn(List<String> values) {
            addCriterion("CLOSEDACCOUNT not in", values, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountBetween(String value1, String value2) {
            addCriterion("CLOSEDACCOUNT between", value1, value2, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andClosedaccountNotBetween(String value1, String value2) {
            addCriterion("CLOSEDACCOUNT not between", value1, value2, "closedaccount");
            return (Criteria) this;
        }

        public Criteria andCushionsignIsNull() {
            addCriterion("CUSHIONSIGN is null");
            return (Criteria) this;
        }

        public Criteria andCushionsignIsNotNull() {
            addCriterion("CUSHIONSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCushionsignEqualTo(String value) {
            addCriterion("CUSHIONSIGN =", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignNotEqualTo(String value) {
            addCriterion("CUSHIONSIGN <>", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignGreaterThan(String value) {
            addCriterion("CUSHIONSIGN >", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignGreaterThanOrEqualTo(String value) {
            addCriterion("CUSHIONSIGN >=", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignLessThan(String value) {
            addCriterion("CUSHIONSIGN <", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignLessThanOrEqualTo(String value) {
            addCriterion("CUSHIONSIGN <=", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignLike(String value) {
            addCriterion("CUSHIONSIGN like", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignNotLike(String value) {
            addCriterion("CUSHIONSIGN not like", value, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignIn(List<String> values) {
            addCriterion("CUSHIONSIGN in", values, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignNotIn(List<String> values) {
            addCriterion("CUSHIONSIGN not in", values, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignBetween(String value1, String value2) {
            addCriterion("CUSHIONSIGN between", value1, value2, "cushionsign");
            return (Criteria) this;
        }

        public Criteria andCushionsignNotBetween(String value1, String value2) {
            addCriterion("CUSHIONSIGN not between", value1, value2, "cushionsign");
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