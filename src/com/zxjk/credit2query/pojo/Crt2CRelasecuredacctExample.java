package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CRelasecuredacctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CRelasecuredacctExample() {
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

        public Criteria andRepaymenttypeIsNull() {
            addCriterion("REPAYMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIsNotNull() {
            addCriterion("REPAYMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeEqualTo(String value) {
            addCriterion("REPAYMENTTYPE =", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotEqualTo(String value) {
            addCriterion("REPAYMENTTYPE <>", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeGreaterThan(String value) {
            addCriterion("REPAYMENTTYPE >", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTTYPE >=", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLessThan(String value) {
            addCriterion("REPAYMENTTYPE <", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTTYPE <=", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLike(String value) {
            addCriterion("REPAYMENTTYPE like", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotLike(String value) {
            addCriterion("REPAYMENTTYPE not like", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIn(List<String> values) {
            addCriterion("REPAYMENTTYPE in", values, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotIn(List<String> values) {
            addCriterion("REPAYMENTTYPE not in", values, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeBetween(String value1, String value2) {
            addCriterion("REPAYMENTTYPE between", value1, value2, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTTYPE not between", value1, value2, "repaymenttype");
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

        public Criteria andBusinessegmentationIsNull() {
            addCriterion("BUSINESSEGMENTATION is null");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationIsNotNull() {
            addCriterion("BUSINESSEGMENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION =", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION <>", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationGreaterThan(String value) {
            addCriterion("BUSINESSEGMENTATION >", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION >=", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationLessThan(String value) {
            addCriterion("BUSINESSEGMENTATION <", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION <=", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationLike(String value) {
            addCriterion("BUSINESSEGMENTATION like", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotLike(String value) {
            addCriterion("BUSINESSEGMENTATION not like", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationIn(List<String> values) {
            addCriterion("BUSINESSEGMENTATION in", values, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotIn(List<String> values) {
            addCriterion("BUSINESSEGMENTATION not in", values, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationBetween(String value1, String value2) {
            addCriterion("BUSINESSEGMENTATION between", value1, value2, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotBetween(String value1, String value2) {
            addCriterion("BUSINESSEGMENTATION not between", value1, value2, "businessegmentation");
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

        public Criteria andRepaymentlimitIsNull() {
            addCriterion("REPAYMENTLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitIsNotNull() {
            addCriterion("REPAYMENTLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitEqualTo(String value) {
            addCriterion("REPAYMENTLIMIT =", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitNotEqualTo(String value) {
            addCriterion("REPAYMENTLIMIT <>", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitGreaterThan(String value) {
            addCriterion("REPAYMENTLIMIT >", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTLIMIT >=", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitLessThan(String value) {
            addCriterion("REPAYMENTLIMIT <", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTLIMIT <=", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitLike(String value) {
            addCriterion("REPAYMENTLIMIT like", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitNotLike(String value) {
            addCriterion("REPAYMENTLIMIT not like", value, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitIn(List<String> values) {
            addCriterion("REPAYMENTLIMIT in", values, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitNotIn(List<String> values) {
            addCriterion("REPAYMENTLIMIT not in", values, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitBetween(String value1, String value2) {
            addCriterion("REPAYMENTLIMIT between", value1, value2, "repaymentlimit");
            return (Criteria) this;
        }

        public Criteria andRepaymentlimitNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTLIMIT not between", value1, value2, "repaymentlimit");
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

        public Criteria andAmountguaranteeIsNull() {
            addCriterion("AMOUNTGUARANTEE is null");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeIsNotNull() {
            addCriterion("AMOUNTGUARANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeEqualTo(String value) {
            addCriterion("AMOUNTGUARANTEE =", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeNotEqualTo(String value) {
            addCriterion("AMOUNTGUARANTEE <>", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeGreaterThan(String value) {
            addCriterion("AMOUNTGUARANTEE >", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNTGUARANTEE >=", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeLessThan(String value) {
            addCriterion("AMOUNTGUARANTEE <", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeLessThanOrEqualTo(String value) {
            addCriterion("AMOUNTGUARANTEE <=", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeLike(String value) {
            addCriterion("AMOUNTGUARANTEE like", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeNotLike(String value) {
            addCriterion("AMOUNTGUARANTEE not like", value, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeIn(List<String> values) {
            addCriterion("AMOUNTGUARANTEE in", values, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeNotIn(List<String> values) {
            addCriterion("AMOUNTGUARANTEE not in", values, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeBetween(String value1, String value2) {
            addCriterion("AMOUNTGUARANTEE between", value1, value2, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andAmountguaranteeNotBetween(String value1, String value2) {
            addCriterion("AMOUNTGUARANTEE not between", value1, value2, "amountguarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberIsNull() {
            addCriterion("GUARANTEECONTRACTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberIsNotNull() {
            addCriterion("GUARANTEECONTRACTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER =", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER <>", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberGreaterThan(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER >", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER >=", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberLessThan(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER <", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER <=", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberLike(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER like", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotLike(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER not like", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberIn(List<String> values) {
            addCriterion("GUARANTEECONTRACTNUMBER in", values, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotIn(List<String> values) {
            addCriterion("GUARANTEECONTRACTNUMBER not in", values, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberBetween(String value1, String value2) {
            addCriterion("GUARANTEECONTRACTNUMBER between", value1, value2, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotBetween(String value1, String value2) {
            addCriterion("GUARANTEECONTRACTNUMBER not between", value1, value2, "guaranteecontractnumber");
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