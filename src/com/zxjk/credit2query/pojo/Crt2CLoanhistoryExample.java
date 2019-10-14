package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CLoanhistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CLoanhistoryExample() {
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

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("MONTH like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("MONTH not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("MONTH not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesIsNull() {
            addCriterion("TOTALACCOUNTLIABILITIES is null");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesIsNotNull() {
            addCriterion("TOTALACCOUNTLIABILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesEqualTo(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES =", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesNotEqualTo(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES <>", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesGreaterThan(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES >", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES >=", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesLessThan(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES <", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesLessThanOrEqualTo(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES <=", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesLike(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES like", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesNotLike(String value) {
            addCriterion("TOTALACCOUNTLIABILITIES not like", value, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesIn(List<String> values) {
            addCriterion("TOTALACCOUNTLIABILITIES in", values, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesNotIn(List<String> values) {
            addCriterion("TOTALACCOUNTLIABILITIES not in", values, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesBetween(String value1, String value2) {
            addCriterion("TOTALACCOUNTLIABILITIES between", value1, value2, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalaccountliabilitiesNotBetween(String value1, String value2) {
            addCriterion("TOTALACCOUNTLIABILITIES not between", value1, value2, "totalaccountliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceIsNull() {
            addCriterion("TOTALLIABILITIESBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceIsNotNull() {
            addCriterion("TOTALLIABILITIESBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceEqualTo(String value) {
            addCriterion("TOTALLIABILITIESBALANCE =", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceNotEqualTo(String value) {
            addCriterion("TOTALLIABILITIESBALANCE <>", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceGreaterThan(String value) {
            addCriterion("TOTALLIABILITIESBALANCE >", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALLIABILITIESBALANCE >=", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceLessThan(String value) {
            addCriterion("TOTALLIABILITIESBALANCE <", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceLessThanOrEqualTo(String value) {
            addCriterion("TOTALLIABILITIESBALANCE <=", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceLike(String value) {
            addCriterion("TOTALLIABILITIESBALANCE like", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceNotLike(String value) {
            addCriterion("TOTALLIABILITIESBALANCE not like", value, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceIn(List<String> values) {
            addCriterion("TOTALLIABILITIESBALANCE in", values, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceNotIn(List<String> values) {
            addCriterion("TOTALLIABILITIESBALANCE not in", values, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceBetween(String value1, String value2) {
            addCriterion("TOTALLIABILITIESBALANCE between", value1, value2, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesbalanceNotBetween(String value1, String value2) {
            addCriterion("TOTALLIABILITIESBALANCE not between", value1, value2, "totalliabilitiesbalance");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberIsNull() {
            addCriterion("ADVANCEACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberIsNotNull() {
            addCriterion("ADVANCEACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER =", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER <>", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberGreaterThan(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER >", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER >=", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberLessThan(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER <", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER <=", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberLike(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER like", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotLike(String value) {
            addCriterion("ADVANCEACCOUNTNUMBER not like", value, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberIn(List<String> values) {
            addCriterion("ADVANCEACCOUNTNUMBER in", values, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotIn(List<String> values) {
            addCriterion("ADVANCEACCOUNTNUMBER not in", values, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberBetween(String value1, String value2) {
            addCriterion("ADVANCEACCOUNTNUMBER between", value1, value2, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAdvanceaccountnumberNotBetween(String value1, String value2) {
            addCriterion("ADVANCEACCOUNTNUMBER not between", value1, value2, "advanceaccountnumber");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedIsNull() {
            addCriterion("NUMBERACCOUNTSCONCERNED is null");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedIsNotNull() {
            addCriterion("NUMBERACCOUNTSCONCERNED is not null");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedEqualTo(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED =", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedNotEqualTo(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED <>", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedGreaterThan(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED >", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedGreaterThanOrEqualTo(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED >=", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedLessThan(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED <", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedLessThanOrEqualTo(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED <=", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedLike(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED like", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedNotLike(String value) {
            addCriterion("NUMBERACCOUNTSCONCERNED not like", value, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedIn(List<String> values) {
            addCriterion("NUMBERACCOUNTSCONCERNED in", values, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedNotIn(List<String> values) {
            addCriterion("NUMBERACCOUNTSCONCERNED not in", values, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedBetween(String value1, String value2) {
            addCriterion("NUMBERACCOUNTSCONCERNED between", value1, value2, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andNumberaccountsconcernedNotBetween(String value1, String value2) {
            addCriterion("NUMBERACCOUNTSCONCERNED not between", value1, value2, "numberaccountsconcerned");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberIsNull() {
            addCriterion("BADACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberIsNotNull() {
            addCriterion("BADACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberEqualTo(String value) {
            addCriterion("BADACCOUNTNUMBER =", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberNotEqualTo(String value) {
            addCriterion("BADACCOUNTNUMBER <>", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberGreaterThan(String value) {
            addCriterion("BADACCOUNTNUMBER >", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BADACCOUNTNUMBER >=", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberLessThan(String value) {
            addCriterion("BADACCOUNTNUMBER <", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("BADACCOUNTNUMBER <=", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberLike(String value) {
            addCriterion("BADACCOUNTNUMBER like", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberNotLike(String value) {
            addCriterion("BADACCOUNTNUMBER not like", value, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberIn(List<String> values) {
            addCriterion("BADACCOUNTNUMBER in", values, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberNotIn(List<String> values) {
            addCriterion("BADACCOUNTNUMBER not in", values, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberBetween(String value1, String value2) {
            addCriterion("BADACCOUNTNUMBER between", value1, value2, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadaccountnumberNotBetween(String value1, String value2) {
            addCriterion("BADACCOUNTNUMBER not between", value1, value2, "badaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBadbalanceIsNull() {
            addCriterion("BADBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBadbalanceIsNotNull() {
            addCriterion("BADBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBadbalanceEqualTo(String value) {
            addCriterion("BADBALANCE =", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceNotEqualTo(String value) {
            addCriterion("BADBALANCE <>", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceGreaterThan(String value) {
            addCriterion("BADBALANCE >", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BADBALANCE >=", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceLessThan(String value) {
            addCriterion("BADBALANCE <", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceLessThanOrEqualTo(String value) {
            addCriterion("BADBALANCE <=", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceLike(String value) {
            addCriterion("BADBALANCE like", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceNotLike(String value) {
            addCriterion("BADBALANCE not like", value, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceIn(List<String> values) {
            addCriterion("BADBALANCE in", values, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceNotIn(List<String> values) {
            addCriterion("BADBALANCE not in", values, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceBetween(String value1, String value2) {
            addCriterion("BADBALANCE between", value1, value2, "badbalance");
            return (Criteria) this;
        }

        public Criteria andBadbalanceNotBetween(String value1, String value2) {
            addCriterion("BADBALANCE not between", value1, value2, "badbalance");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsIsNull() {
            addCriterion("OVERDUEACCOUNTS is null");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsIsNotNull() {
            addCriterion("OVERDUEACCOUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsEqualTo(String value) {
            addCriterion("OVERDUEACCOUNTS =", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsNotEqualTo(String value) {
            addCriterion("OVERDUEACCOUNTS <>", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsGreaterThan(String value) {
            addCriterion("OVERDUEACCOUNTS >", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEACCOUNTS >=", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsLessThan(String value) {
            addCriterion("OVERDUEACCOUNTS <", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEACCOUNTS <=", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsLike(String value) {
            addCriterion("OVERDUEACCOUNTS like", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsNotLike(String value) {
            addCriterion("OVERDUEACCOUNTS not like", value, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsIn(List<String> values) {
            addCriterion("OVERDUEACCOUNTS in", values, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsNotIn(List<String> values) {
            addCriterion("OVERDUEACCOUNTS not in", values, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsBetween(String value1, String value2) {
            addCriterion("OVERDUEACCOUNTS between", value1, value2, "overdueaccounts");
            return (Criteria) this;
        }

        public Criteria andOverdueaccountsNotBetween(String value1, String value2) {
            addCriterion("OVERDUEACCOUNTS not between", value1, value2, "overdueaccounts");
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

        public Criteria andOverdueprincipalaccountIsNull() {
            addCriterion("OVERDUEPRINCIPALACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountIsNotNull() {
            addCriterion("OVERDUEPRINCIPALACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT =", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountNotEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT <>", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountGreaterThan(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT >", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT >=", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountLessThan(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT <", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT <=", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountLike(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT like", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountNotLike(String value) {
            addCriterion("OVERDUEPRINCIPALACCOUNT not like", value, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountIn(List<String> values) {
            addCriterion("OVERDUEPRINCIPALACCOUNT in", values, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountNotIn(List<String> values) {
            addCriterion("OVERDUEPRINCIPALACCOUNT not in", values, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountBetween(String value1, String value2) {
            addCriterion("OVERDUEPRINCIPALACCOUNT between", value1, value2, "overdueprincipalaccount");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalaccountNotBetween(String value1, String value2) {
            addCriterion("OVERDUEPRINCIPALACCOUNT not between", value1, value2, "overdueprincipalaccount");
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

        public Criteria andLoanhistorymonthnumberIsNull() {
            addCriterion("LOANHISTORYMONTHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberIsNotNull() {
            addCriterion("LOANHISTORYMONTHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberEqualTo(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER =", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberNotEqualTo(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER <>", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberGreaterThan(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER >", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberGreaterThanOrEqualTo(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER >=", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberLessThan(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER <", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberLessThanOrEqualTo(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER <=", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberLike(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER like", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberNotLike(String value) {
            addCriterion("LOANHISTORYMONTHNUMBER not like", value, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberIn(List<String> values) {
            addCriterion("LOANHISTORYMONTHNUMBER in", values, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberNotIn(List<String> values) {
            addCriterion("LOANHISTORYMONTHNUMBER not in", values, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberBetween(String value1, String value2) {
            addCriterion("LOANHISTORYMONTHNUMBER between", value1, value2, "loanhistorymonthnumber");
            return (Criteria) this;
        }

        public Criteria andLoanhistorymonthnumberNotBetween(String value1, String value2) {
            addCriterion("LOANHISTORYMONTHNUMBER not between", value1, value2, "loanhistorymonthnumber");
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