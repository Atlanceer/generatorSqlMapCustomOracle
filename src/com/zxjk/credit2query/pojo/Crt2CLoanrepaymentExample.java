package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CLoanrepaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CLoanrepaymentExample() {
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

        public Criteria andNumberrepaymentsIsNull() {
            addCriterion("NUMBERREPAYMENTS is null");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsIsNotNull() {
            addCriterion("NUMBERREPAYMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsEqualTo(String value) {
            addCriterion("NUMBERREPAYMENTS =", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsNotEqualTo(String value) {
            addCriterion("NUMBERREPAYMENTS <>", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsGreaterThan(String value) {
            addCriterion("NUMBERREPAYMENTS >", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBERREPAYMENTS >=", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsLessThan(String value) {
            addCriterion("NUMBERREPAYMENTS <", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsLessThanOrEqualTo(String value) {
            addCriterion("NUMBERREPAYMENTS <=", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsLike(String value) {
            addCriterion("NUMBERREPAYMENTS like", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsNotLike(String value) {
            addCriterion("NUMBERREPAYMENTS not like", value, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsIn(List<String> values) {
            addCriterion("NUMBERREPAYMENTS in", values, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsNotIn(List<String> values) {
            addCriterion("NUMBERREPAYMENTS not in", values, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsBetween(String value1, String value2) {
            addCriterion("NUMBERREPAYMENTS between", value1, value2, "numberrepayments");
            return (Criteria) this;
        }

        public Criteria andNumberrepaymentsNotBetween(String value1, String value2) {
            addCriterion("NUMBERREPAYMENTS not between", value1, value2, "numberrepayments");
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

        public Criteria andChangedatebalanceIsNull() {
            addCriterion("CHANGEDATEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceIsNotNull() {
            addCriterion("CHANGEDATEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceEqualTo(String value) {
            addCriterion("CHANGEDATEBALANCE =", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceNotEqualTo(String value) {
            addCriterion("CHANGEDATEBALANCE <>", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceGreaterThan(String value) {
            addCriterion("CHANGEDATEBALANCE >", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGEDATEBALANCE >=", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceLessThan(String value) {
            addCriterion("CHANGEDATEBALANCE <", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceLessThanOrEqualTo(String value) {
            addCriterion("CHANGEDATEBALANCE <=", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceLike(String value) {
            addCriterion("CHANGEDATEBALANCE like", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceNotLike(String value) {
            addCriterion("CHANGEDATEBALANCE not like", value, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceIn(List<String> values) {
            addCriterion("CHANGEDATEBALANCE in", values, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceNotIn(List<String> values) {
            addCriterion("CHANGEDATEBALANCE not in", values, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceBetween(String value1, String value2) {
            addCriterion("CHANGEDATEBALANCE between", value1, value2, "changedatebalance");
            return (Criteria) this;
        }

        public Criteria andChangedatebalanceNotBetween(String value1, String value2) {
            addCriterion("CHANGEDATEBALANCE not between", value1, value2, "changedatebalance");
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

        public Criteria andFiveleveldateIsNull() {
            addCriterion("FIVELEVELDATE is null");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateIsNotNull() {
            addCriterion("FIVELEVELDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateEqualTo(String value) {
            addCriterion("FIVELEVELDATE =", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateNotEqualTo(String value) {
            addCriterion("FIVELEVELDATE <>", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateGreaterThan(String value) {
            addCriterion("FIVELEVELDATE >", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateGreaterThanOrEqualTo(String value) {
            addCriterion("FIVELEVELDATE >=", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateLessThan(String value) {
            addCriterion("FIVELEVELDATE <", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateLessThanOrEqualTo(String value) {
            addCriterion("FIVELEVELDATE <=", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateLike(String value) {
            addCriterion("FIVELEVELDATE like", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateNotLike(String value) {
            addCriterion("FIVELEVELDATE not like", value, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateIn(List<String> values) {
            addCriterion("FIVELEVELDATE in", values, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateNotIn(List<String> values) {
            addCriterion("FIVELEVELDATE not in", values, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateBetween(String value1, String value2) {
            addCriterion("FIVELEVELDATE between", value1, value2, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andFiveleveldateNotBetween(String value1, String value2) {
            addCriterion("FIVELEVELDATE not between", value1, value2, "fiveleveldate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateIsNull() {
            addCriterion("ACTUALREPAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateIsNotNull() {
            addCriterion("ACTUALREPAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateEqualTo(String value) {
            addCriterion("ACTUALREPAYMENTDATE =", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateNotEqualTo(String value) {
            addCriterion("ACTUALREPAYMENTDATE <>", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateGreaterThan(String value) {
            addCriterion("ACTUALREPAYMENTDATE >", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALREPAYMENTDATE >=", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateLessThan(String value) {
            addCriterion("ACTUALREPAYMENTDATE <", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateLessThanOrEqualTo(String value) {
            addCriterion("ACTUALREPAYMENTDATE <=", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateLike(String value) {
            addCriterion("ACTUALREPAYMENTDATE like", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateNotLike(String value) {
            addCriterion("ACTUALREPAYMENTDATE not like", value, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateIn(List<String> values) {
            addCriterion("ACTUALREPAYMENTDATE in", values, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateNotIn(List<String> values) {
            addCriterion("ACTUALREPAYMENTDATE not in", values, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateBetween(String value1, String value2) {
            addCriterion("ACTUALREPAYMENTDATE between", value1, value2, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andActualrepaymentdateNotBetween(String value1, String value2) {
            addCriterion("ACTUALREPAYMENTDATE not between", value1, value2, "actualrepaymentdate");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentIsNull() {
            addCriterion("TOTALACTUALREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentIsNotNull() {
            addCriterion("TOTALACTUALREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentEqualTo(String value) {
            addCriterion("TOTALACTUALREPAYMENT =", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentNotEqualTo(String value) {
            addCriterion("TOTALACTUALREPAYMENT <>", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentGreaterThan(String value) {
            addCriterion("TOTALACTUALREPAYMENT >", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALACTUALREPAYMENT >=", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentLessThan(String value) {
            addCriterion("TOTALACTUALREPAYMENT <", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentLessThanOrEqualTo(String value) {
            addCriterion("TOTALACTUALREPAYMENT <=", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentLike(String value) {
            addCriterion("TOTALACTUALREPAYMENT like", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentNotLike(String value) {
            addCriterion("TOTALACTUALREPAYMENT not like", value, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentIn(List<String> values) {
            addCriterion("TOTALACTUALREPAYMENT in", values, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentNotIn(List<String> values) {
            addCriterion("TOTALACTUALREPAYMENT not in", values, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentBetween(String value1, String value2) {
            addCriterion("TOTALACTUALREPAYMENT between", value1, value2, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalactualrepaymentNotBetween(String value1, String value2) {
            addCriterion("TOTALACTUALREPAYMENT not between", value1, value2, "totalactualrepayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentformIsNull() {
            addCriterion("REPAYMENTFORM is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentformIsNotNull() {
            addCriterion("REPAYMENTFORM is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentformEqualTo(String value) {
            addCriterion("REPAYMENTFORM =", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformNotEqualTo(String value) {
            addCriterion("REPAYMENTFORM <>", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformGreaterThan(String value) {
            addCriterion("REPAYMENTFORM >", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTFORM >=", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformLessThan(String value) {
            addCriterion("REPAYMENTFORM <", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTFORM <=", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformLike(String value) {
            addCriterion("REPAYMENTFORM like", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformNotLike(String value) {
            addCriterion("REPAYMENTFORM not like", value, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformIn(List<String> values) {
            addCriterion("REPAYMENTFORM in", values, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformNotIn(List<String> values) {
            addCriterion("REPAYMENTFORM not in", values, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformBetween(String value1, String value2) {
            addCriterion("REPAYMENTFORM between", value1, value2, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andRepaymentformNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTFORM not between", value1, value2, "repaymentform");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentIsNull() {
            addCriterion("CONTRACTREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentIsNotNull() {
            addCriterion("CONTRACTREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentEqualTo(String value) {
            addCriterion("CONTRACTREPAYMENT =", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentNotEqualTo(String value) {
            addCriterion("CONTRACTREPAYMENT <>", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentGreaterThan(String value) {
            addCriterion("CONTRACTREPAYMENT >", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTREPAYMENT >=", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentLessThan(String value) {
            addCriterion("CONTRACTREPAYMENT <", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTREPAYMENT <=", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentLike(String value) {
            addCriterion("CONTRACTREPAYMENT like", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentNotLike(String value) {
            addCriterion("CONTRACTREPAYMENT not like", value, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentIn(List<String> values) {
            addCriterion("CONTRACTREPAYMENT in", values, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentNotIn(List<String> values) {
            addCriterion("CONTRACTREPAYMENT not in", values, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentBetween(String value1, String value2) {
            addCriterion("CONTRACTREPAYMENT between", value1, value2, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andContractrepaymentNotBetween(String value1, String value2) {
            addCriterion("CONTRACTREPAYMENT not between", value1, value2, "contractrepayment");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("TOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(String value) {
            addCriterion("TOTALAMOUNT =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(String value) {
            addCriterion("TOTALAMOUNT <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(String value) {
            addCriterion("TOTALAMOUNT >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALAMOUNT >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(String value) {
            addCriterion("TOTALAMOUNT <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(String value) {
            addCriterion("TOTALAMOUNT <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLike(String value) {
            addCriterion("TOTALAMOUNT like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotLike(String value) {
            addCriterion("TOTALAMOUNT not like", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<String> values) {
            addCriterion("TOTALAMOUNT in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<String> values) {
            addCriterion("TOTALAMOUNT not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(String value1, String value2) {
            addCriterion("TOTALAMOUNT between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(String value1, String value2) {
            addCriterion("TOTALAMOUNT not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueIsNull() {
            addCriterion("TOTALOVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueIsNotNull() {
            addCriterion("TOTALOVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueEqualTo(String value) {
            addCriterion("TOTALOVERDUE =", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotEqualTo(String value) {
            addCriterion("TOTALOVERDUE <>", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueGreaterThan(String value) {
            addCriterion("TOTALOVERDUE >", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALOVERDUE >=", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueLessThan(String value) {
            addCriterion("TOTALOVERDUE <", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueLessThanOrEqualTo(String value) {
            addCriterion("TOTALOVERDUE <=", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueLike(String value) {
            addCriterion("TOTALOVERDUE like", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotLike(String value) {
            addCriterion("TOTALOVERDUE not like", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueIn(List<String> values) {
            addCriterion("TOTALOVERDUE in", values, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotIn(List<String> values) {
            addCriterion("TOTALOVERDUE not in", values, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueBetween(String value1, String value2) {
            addCriterion("TOTALOVERDUE between", value1, value2, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotBetween(String value1, String value2) {
            addCriterion("TOTALOVERDUE not between", value1, value2, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalIsNull() {
            addCriterion("OVERDUEPRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalIsNotNull() {
            addCriterion("OVERDUEPRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL =", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL <>", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalGreaterThan(String value) {
            addCriterion("OVERDUEPRINCIPAL >", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL >=", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalLessThan(String value) {
            addCriterion("OVERDUEPRINCIPAL <", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL <=", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalLike(String value) {
            addCriterion("OVERDUEPRINCIPAL like", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotLike(String value) {
            addCriterion("OVERDUEPRINCIPAL not like", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalIn(List<String> values) {
            addCriterion("OVERDUEPRINCIPAL in", values, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotIn(List<String> values) {
            addCriterion("OVERDUEPRINCIPAL not in", values, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalBetween(String value1, String value2) {
            addCriterion("OVERDUEPRINCIPAL between", value1, value2, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotBetween(String value1, String value2) {
            addCriterion("OVERDUEPRINCIPAL not between", value1, value2, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsIsNull() {
            addCriterion("OVERDUEMONTHS is null");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsIsNotNull() {
            addCriterion("OVERDUEMONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsEqualTo(String value) {
            addCriterion("OVERDUEMONTHS =", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotEqualTo(String value) {
            addCriterion("OVERDUEMONTHS <>", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsGreaterThan(String value) {
            addCriterion("OVERDUEMONTHS >", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEMONTHS >=", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsLessThan(String value) {
            addCriterion("OVERDUEMONTHS <", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEMONTHS <=", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsLike(String value) {
            addCriterion("OVERDUEMONTHS like", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotLike(String value) {
            addCriterion("OVERDUEMONTHS not like", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsIn(List<String> values) {
            addCriterion("OVERDUEMONTHS in", values, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotIn(List<String> values) {
            addCriterion("OVERDUEMONTHS not in", values, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsBetween(String value1, String value2) {
            addCriterion("OVERDUEMONTHS between", value1, value2, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotBetween(String value1, String value2) {
            addCriterion("OVERDUEMONTHS not between", value1, value2, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsIsNull() {
            addCriterion("REPAYMENTMONTHS is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsIsNotNull() {
            addCriterion("REPAYMENTMONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS =", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS <>", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsGreaterThan(String value) {
            addCriterion("REPAYMENTMONTHS >", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS >=", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsLessThan(String value) {
            addCriterion("REPAYMENTMONTHS <", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS <=", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsLike(String value) {
            addCriterion("REPAYMENTMONTHS like", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotLike(String value) {
            addCriterion("REPAYMENTMONTHS not like", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsIn(List<String> values) {
            addCriterion("REPAYMENTMONTHS in", values, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotIn(List<String> values) {
            addCriterion("REPAYMENTMONTHS not in", values, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsBetween(String value1, String value2) {
            addCriterion("REPAYMENTMONTHS between", value1, value2, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTMONTHS not between", value1, value2, "repaymentmonths");
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