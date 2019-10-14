package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CGuaranteeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CGuaranteeExample() {
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

        public Criteria andReportdateIsNull() {
            addCriterion("REPORTDATE is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("REPORTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(String value) {
            addCriterion("REPORTDATE =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(String value) {
            addCriterion("REPORTDATE <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(String value) {
            addCriterion("REPORTDATE >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTDATE >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(String value) {
            addCriterion("REPORTDATE <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(String value) {
            addCriterion("REPORTDATE <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLike(String value) {
            addCriterion("REPORTDATE like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotLike(String value) {
            addCriterion("REPORTDATE not like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<String> values) {
            addCriterion("REPORTDATE in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<String> values) {
            addCriterion("REPORTDATE not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(String value1, String value2) {
            addCriterion("REPORTDATE between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(String value1, String value2) {
            addCriterion("REPORTDATE not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andAccountstateIsNull() {
            addCriterion("ACCOUNTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountstateIsNotNull() {
            addCriterion("ACCOUNTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountstateEqualTo(String value) {
            addCriterion("ACCOUNTSTATE =", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotEqualTo(String value) {
            addCriterion("ACCOUNTSTATE <>", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateGreaterThan(String value) {
            addCriterion("ACCOUNTSTATE >", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTATE >=", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateLessThan(String value) {
            addCriterion("ACCOUNTSTATE <", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTATE <=", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateLike(String value) {
            addCriterion("ACCOUNTSTATE like", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotLike(String value) {
            addCriterion("ACCOUNTSTATE not like", value, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateIn(List<String> values) {
            addCriterion("ACCOUNTSTATE in", values, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotIn(List<String> values) {
            addCriterion("ACCOUNTSTATE not in", values, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTATE between", value1, value2, "accountstate");
            return (Criteria) this;
        }

        public Criteria andAccountstateNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTATE not between", value1, value2, "accountstate");
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

        public Criteria andRiskexposureIsNull() {
            addCriterion("RISKEXPOSURE is null");
            return (Criteria) this;
        }

        public Criteria andRiskexposureIsNotNull() {
            addCriterion("RISKEXPOSURE is not null");
            return (Criteria) this;
        }

        public Criteria andRiskexposureEqualTo(String value) {
            addCriterion("RISKEXPOSURE =", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureNotEqualTo(String value) {
            addCriterion("RISKEXPOSURE <>", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureGreaterThan(String value) {
            addCriterion("RISKEXPOSURE >", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureGreaterThanOrEqualTo(String value) {
            addCriterion("RISKEXPOSURE >=", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureLessThan(String value) {
            addCriterion("RISKEXPOSURE <", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureLessThanOrEqualTo(String value) {
            addCriterion("RISKEXPOSURE <=", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureLike(String value) {
            addCriterion("RISKEXPOSURE like", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureNotLike(String value) {
            addCriterion("RISKEXPOSURE not like", value, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureIn(List<String> values) {
            addCriterion("RISKEXPOSURE in", values, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureNotIn(List<String> values) {
            addCriterion("RISKEXPOSURE not in", values, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureBetween(String value1, String value2) {
            addCriterion("RISKEXPOSURE between", value1, value2, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andRiskexposureNotBetween(String value1, String value2) {
            addCriterion("RISKEXPOSURE not between", value1, value2, "riskexposure");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignIsNull() {
            addCriterion("COMPENSATORYSIGN is null");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignIsNotNull() {
            addCriterion("COMPENSATORYSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignEqualTo(String value) {
            addCriterion("COMPENSATORYSIGN =", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignNotEqualTo(String value) {
            addCriterion("COMPENSATORYSIGN <>", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignGreaterThan(String value) {
            addCriterion("COMPENSATORYSIGN >", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignGreaterThanOrEqualTo(String value) {
            addCriterion("COMPENSATORYSIGN >=", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignLessThan(String value) {
            addCriterion("COMPENSATORYSIGN <", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignLessThanOrEqualTo(String value) {
            addCriterion("COMPENSATORYSIGN <=", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignLike(String value) {
            addCriterion("COMPENSATORYSIGN like", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignNotLike(String value) {
            addCriterion("COMPENSATORYSIGN not like", value, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignIn(List<String> values) {
            addCriterion("COMPENSATORYSIGN in", values, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignNotIn(List<String> values) {
            addCriterion("COMPENSATORYSIGN not in", values, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignBetween(String value1, String value2) {
            addCriterion("COMPENSATORYSIGN between", value1, value2, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCompensatorysignNotBetween(String value1, String value2) {
            addCriterion("COMPENSATORYSIGN not between", value1, value2, "compensatorysign");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierIsNull() {
            addCriterion("COMMONDEBTIDENTIFIER is null");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierIsNotNull() {
            addCriterion("COMMONDEBTIDENTIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierEqualTo(String value) {
            addCriterion("COMMONDEBTIDENTIFIER =", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierNotEqualTo(String value) {
            addCriterion("COMMONDEBTIDENTIFIER <>", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierGreaterThan(String value) {
            addCriterion("COMMONDEBTIDENTIFIER >", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierGreaterThanOrEqualTo(String value) {
            addCriterion("COMMONDEBTIDENTIFIER >=", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierLessThan(String value) {
            addCriterion("COMMONDEBTIDENTIFIER <", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierLessThanOrEqualTo(String value) {
            addCriterion("COMMONDEBTIDENTIFIER <=", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierLike(String value) {
            addCriterion("COMMONDEBTIDENTIFIER like", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierNotLike(String value) {
            addCriterion("COMMONDEBTIDENTIFIER not like", value, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierIn(List<String> values) {
            addCriterion("COMMONDEBTIDENTIFIER in", values, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierNotIn(List<String> values) {
            addCriterion("COMMONDEBTIDENTIFIER not in", values, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierBetween(String value1, String value2) {
            addCriterion("COMMONDEBTIDENTIFIER between", value1, value2, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andCommondebtidentifierNotBetween(String value1, String value2) {
            addCriterion("COMMONDEBTIDENTIFIER not between", value1, value2, "commondebtidentifier");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNull() {
            addCriterion("CLOSINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNotNull() {
            addCriterion("CLOSINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClosingdateEqualTo(String value) {
            addCriterion("CLOSINGDATE =", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotEqualTo(String value) {
            addCriterion("CLOSINGDATE <>", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThan(String value) {
            addCriterion("CLOSINGDATE >", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSINGDATE >=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThan(String value) {
            addCriterion("CLOSINGDATE <", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThanOrEqualTo(String value) {
            addCriterion("CLOSINGDATE <=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLike(String value) {
            addCriterion("CLOSINGDATE like", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotLike(String value) {
            addCriterion("CLOSINGDATE not like", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateIn(List<String> values) {
            addCriterion("CLOSINGDATE in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotIn(List<String> values) {
            addCriterion("CLOSINGDATE not in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateBetween(String value1, String value2) {
            addCriterion("CLOSINGDATE between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotBetween(String value1, String value2) {
            addCriterion("CLOSINGDATE not between", value1, value2, "closingdate");
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