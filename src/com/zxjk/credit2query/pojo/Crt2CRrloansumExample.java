package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CRrloansumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CRrloansumExample() {
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

        public Criteria andRecoveredrepaymentIsNull() {
            addCriterion("RECOVEREDREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentIsNotNull() {
            addCriterion("RECOVEREDREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentEqualTo(String value) {
            addCriterion("RECOVEREDREPAYMENT =", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentNotEqualTo(String value) {
            addCriterion("RECOVEREDREPAYMENT <>", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentGreaterThan(String value) {
            addCriterion("RECOVEREDREPAYMENT >", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("RECOVEREDREPAYMENT >=", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentLessThan(String value) {
            addCriterion("RECOVEREDREPAYMENT <", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentLessThanOrEqualTo(String value) {
            addCriterion("RECOVEREDREPAYMENT <=", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentLike(String value) {
            addCriterion("RECOVEREDREPAYMENT like", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentNotLike(String value) {
            addCriterion("RECOVEREDREPAYMENT not like", value, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentIn(List<String> values) {
            addCriterion("RECOVEREDREPAYMENT in", values, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentNotIn(List<String> values) {
            addCriterion("RECOVEREDREPAYMENT not in", values, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentBetween(String value1, String value2) {
            addCriterion("RECOVEREDREPAYMENT between", value1, value2, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredrepaymentNotBetween(String value1, String value2) {
            addCriterion("RECOVEREDREPAYMENT not between", value1, value2, "recoveredrepayment");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountIsNull() {
            addCriterion("RECOVEREDACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountIsNotNull() {
            addCriterion("RECOVEREDACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountEqualTo(String value) {
            addCriterion("RECOVEREDACCOUNT =", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountNotEqualTo(String value) {
            addCriterion("RECOVEREDACCOUNT <>", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountGreaterThan(String value) {
            addCriterion("RECOVEREDACCOUNT >", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountGreaterThanOrEqualTo(String value) {
            addCriterion("RECOVEREDACCOUNT >=", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountLessThan(String value) {
            addCriterion("RECOVEREDACCOUNT <", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountLessThanOrEqualTo(String value) {
            addCriterion("RECOVEREDACCOUNT <=", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountLike(String value) {
            addCriterion("RECOVEREDACCOUNT like", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountNotLike(String value) {
            addCriterion("RECOVEREDACCOUNT not like", value, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountIn(List<String> values) {
            addCriterion("RECOVEREDACCOUNT in", values, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountNotIn(List<String> values) {
            addCriterion("RECOVEREDACCOUNT not in", values, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountBetween(String value1, String value2) {
            addCriterion("RECOVEREDACCOUNT between", value1, value2, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredaccountNotBetween(String value1, String value2) {
            addCriterion("RECOVEREDACCOUNT not between", value1, value2, "recoveredaccount");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceIsNull() {
            addCriterion("RECOVEREDBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceIsNotNull() {
            addCriterion("RECOVEREDBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceEqualTo(String value) {
            addCriterion("RECOVEREDBALANCE =", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceNotEqualTo(String value) {
            addCriterion("RECOVEREDBALANCE <>", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceGreaterThan(String value) {
            addCriterion("RECOVEREDBALANCE >", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("RECOVEREDBALANCE >=", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceLessThan(String value) {
            addCriterion("RECOVEREDBALANCE <", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceLessThanOrEqualTo(String value) {
            addCriterion("RECOVEREDBALANCE <=", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceLike(String value) {
            addCriterion("RECOVEREDBALANCE like", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceNotLike(String value) {
            addCriterion("RECOVEREDBALANCE not like", value, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceIn(List<String> values) {
            addCriterion("RECOVEREDBALANCE in", values, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceNotIn(List<String> values) {
            addCriterion("RECOVEREDBALANCE not in", values, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceBetween(String value1, String value2) {
            addCriterion("RECOVEREDBALANCE between", value1, value2, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andRecoveredbalanceNotBetween(String value1, String value2) {
            addCriterion("RECOVEREDBALANCE not between", value1, value2, "recoveredbalance");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentIsNull() {
            addCriterion("OTHERLOANREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentIsNotNull() {
            addCriterion("OTHERLOANREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentEqualTo(String value) {
            addCriterion("OTHERLOANREPAYMENT =", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentNotEqualTo(String value) {
            addCriterion("OTHERLOANREPAYMENT <>", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentGreaterThan(String value) {
            addCriterion("OTHERLOANREPAYMENT >", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERLOANREPAYMENT >=", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentLessThan(String value) {
            addCriterion("OTHERLOANREPAYMENT <", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentLessThanOrEqualTo(String value) {
            addCriterion("OTHERLOANREPAYMENT <=", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentLike(String value) {
            addCriterion("OTHERLOANREPAYMENT like", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentNotLike(String value) {
            addCriterion("OTHERLOANREPAYMENT not like", value, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentIn(List<String> values) {
            addCriterion("OTHERLOANREPAYMENT in", values, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentNotIn(List<String> values) {
            addCriterion("OTHERLOANREPAYMENT not in", values, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentBetween(String value1, String value2) {
            addCriterion("OTHERLOANREPAYMENT between", value1, value2, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanrepaymentNotBetween(String value1, String value2) {
            addCriterion("OTHERLOANREPAYMENT not between", value1, value2, "otherloanrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsIsNull() {
            addCriterion("OTHERLOANACCOUNTS is null");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsIsNotNull() {
            addCriterion("OTHERLOANACCOUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsEqualTo(String value) {
            addCriterion("OTHERLOANACCOUNTS =", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsNotEqualTo(String value) {
            addCriterion("OTHERLOANACCOUNTS <>", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsGreaterThan(String value) {
            addCriterion("OTHERLOANACCOUNTS >", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERLOANACCOUNTS >=", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsLessThan(String value) {
            addCriterion("OTHERLOANACCOUNTS <", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsLessThanOrEqualTo(String value) {
            addCriterion("OTHERLOANACCOUNTS <=", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsLike(String value) {
            addCriterion("OTHERLOANACCOUNTS like", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsNotLike(String value) {
            addCriterion("OTHERLOANACCOUNTS not like", value, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsIn(List<String> values) {
            addCriterion("OTHERLOANACCOUNTS in", values, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsNotIn(List<String> values) {
            addCriterion("OTHERLOANACCOUNTS not in", values, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsBetween(String value1, String value2) {
            addCriterion("OTHERLOANACCOUNTS between", value1, value2, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanaccountsNotBetween(String value1, String value2) {
            addCriterion("OTHERLOANACCOUNTS not between", value1, value2, "otherloanaccounts");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesIsNull() {
            addCriterion("OTHERLOANBALANCES is null");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesIsNotNull() {
            addCriterion("OTHERLOANBALANCES is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesEqualTo(String value) {
            addCriterion("OTHERLOANBALANCES =", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesNotEqualTo(String value) {
            addCriterion("OTHERLOANBALANCES <>", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesGreaterThan(String value) {
            addCriterion("OTHERLOANBALANCES >", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERLOANBALANCES >=", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesLessThan(String value) {
            addCriterion("OTHERLOANBALANCES <", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesLessThanOrEqualTo(String value) {
            addCriterion("OTHERLOANBALANCES <=", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesLike(String value) {
            addCriterion("OTHERLOANBALANCES like", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesNotLike(String value) {
            addCriterion("OTHERLOANBALANCES not like", value, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesIn(List<String> values) {
            addCriterion("OTHERLOANBALANCES in", values, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesNotIn(List<String> values) {
            addCriterion("OTHERLOANBALANCES not in", values, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesBetween(String value1, String value2) {
            addCriterion("OTHERLOANBALANCES between", value1, value2, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherloanbalancesNotBetween(String value1, String value2) {
            addCriterion("OTHERLOANBALANCES not between", value1, value2, "otherloanbalances");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsIsNull() {
            addCriterion("OTHERLENDINGCONCERNS is null");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsIsNotNull() {
            addCriterion("OTHERLENDINGCONCERNS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsEqualTo(String value) {
            addCriterion("OTHERLENDINGCONCERNS =", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsNotEqualTo(String value) {
            addCriterion("OTHERLENDINGCONCERNS <>", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsGreaterThan(String value) {
            addCriterion("OTHERLENDINGCONCERNS >", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERLENDINGCONCERNS >=", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsLessThan(String value) {
            addCriterion("OTHERLENDINGCONCERNS <", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsLessThanOrEqualTo(String value) {
            addCriterion("OTHERLENDINGCONCERNS <=", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsLike(String value) {
            addCriterion("OTHERLENDINGCONCERNS like", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsNotLike(String value) {
            addCriterion("OTHERLENDINGCONCERNS not like", value, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsIn(List<String> values) {
            addCriterion("OTHERLENDINGCONCERNS in", values, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsNotIn(List<String> values) {
            addCriterion("OTHERLENDINGCONCERNS not in", values, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsBetween(String value1, String value2) {
            addCriterion("OTHERLENDINGCONCERNS between", value1, value2, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherlendingconcernsNotBetween(String value1, String value2) {
            addCriterion("OTHERLENDINGCONCERNS not between", value1, value2, "otherlendingconcerns");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandIsNull() {
            addCriterion("OTHERBADLOAND is null");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandIsNotNull() {
            addCriterion("OTHERBADLOAND is not null");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandEqualTo(String value) {
            addCriterion("OTHERBADLOAND =", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandNotEqualTo(String value) {
            addCriterion("OTHERBADLOAND <>", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandGreaterThan(String value) {
            addCriterion("OTHERBADLOAND >", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERBADLOAND >=", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandLessThan(String value) {
            addCriterion("OTHERBADLOAND <", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandLessThanOrEqualTo(String value) {
            addCriterion("OTHERBADLOAND <=", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandLike(String value) {
            addCriterion("OTHERBADLOAND like", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandNotLike(String value) {
            addCriterion("OTHERBADLOAND not like", value, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandIn(List<String> values) {
            addCriterion("OTHERBADLOAND in", values, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandNotIn(List<String> values) {
            addCriterion("OTHERBADLOAND not in", values, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandBetween(String value1, String value2) {
            addCriterion("OTHERBADLOAND between", value1, value2, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andOtherbadloandNotBetween(String value1, String value2) {
            addCriterion("OTHERBADLOAND not between", value1, value2, "otherbadloand");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberIsNull() {
            addCriterion("RRLOANSUMNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberIsNotNull() {
            addCriterion("RRLOANSUMNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberEqualTo(String value) {
            addCriterion("RRLOANSUMNUMBER =", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberNotEqualTo(String value) {
            addCriterion("RRLOANSUMNUMBER <>", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberGreaterThan(String value) {
            addCriterion("RRLOANSUMNUMBER >", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberGreaterThanOrEqualTo(String value) {
            addCriterion("RRLOANSUMNUMBER >=", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberLessThan(String value) {
            addCriterion("RRLOANSUMNUMBER <", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberLessThanOrEqualTo(String value) {
            addCriterion("RRLOANSUMNUMBER <=", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberLike(String value) {
            addCriterion("RRLOANSUMNUMBER like", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberNotLike(String value) {
            addCriterion("RRLOANSUMNUMBER not like", value, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberIn(List<String> values) {
            addCriterion("RRLOANSUMNUMBER in", values, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberNotIn(List<String> values) {
            addCriterion("RRLOANSUMNUMBER not in", values, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberBetween(String value1, String value2) {
            addCriterion("RRLOANSUMNUMBER between", value1, value2, "rrloansumnumber");
            return (Criteria) this;
        }

        public Criteria andRrloansumnumberNotBetween(String value1, String value2) {
            addCriterion("RRLOANSUMNUMBER not between", value1, value2, "rrloansumnumber");
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