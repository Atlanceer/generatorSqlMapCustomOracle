package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CLoanoutstandingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CLoanoutstandingExample() {
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

        public Criteria andAssetsaccountnumberIsNull() {
            addCriterion("ASSETSACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberIsNotNull() {
            addCriterion("ASSETSACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER =", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER <>", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberGreaterThan(String value) {
            addCriterion("ASSETSACCOUNTNUMBER >", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER >=", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberLessThan(String value) {
            addCriterion("ASSETSACCOUNTNUMBER <", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberLessThanOrEqualTo(String value) {
            addCriterion("ASSETSACCOUNTNUMBER <=", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberLike(String value) {
            addCriterion("ASSETSACCOUNTNUMBER like", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotLike(String value) {
            addCriterion("ASSETSACCOUNTNUMBER not like", value, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberIn(List<String> values) {
            addCriterion("ASSETSACCOUNTNUMBER in", values, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotIn(List<String> values) {
            addCriterion("ASSETSACCOUNTNUMBER not in", values, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberBetween(String value1, String value2) {
            addCriterion("ASSETSACCOUNTNUMBER between", value1, value2, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andAssetsaccountnumberNotBetween(String value1, String value2) {
            addCriterion("ASSETSACCOUNTNUMBER not between", value1, value2, "assetsaccountnumber");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsIsNull() {
            addCriterion("BALANCEASSETS is null");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsIsNotNull() {
            addCriterion("BALANCEASSETS is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsEqualTo(String value) {
            addCriterion("BALANCEASSETS =", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotEqualTo(String value) {
            addCriterion("BALANCEASSETS <>", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsGreaterThan(String value) {
            addCriterion("BALANCEASSETS >", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCEASSETS >=", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsLessThan(String value) {
            addCriterion("BALANCEASSETS <", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsLessThanOrEqualTo(String value) {
            addCriterion("BALANCEASSETS <=", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsLike(String value) {
            addCriterion("BALANCEASSETS like", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotLike(String value) {
            addCriterion("BALANCEASSETS not like", value, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsIn(List<String> values) {
            addCriterion("BALANCEASSETS in", values, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotIn(List<String> values) {
            addCriterion("BALANCEASSETS not in", values, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsBetween(String value1, String value2) {
            addCriterion("BALANCEASSETS between", value1, value2, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andBalanceassetsNotBetween(String value1, String value2) {
            addCriterion("BALANCEASSETS not between", value1, value2, "balanceassets");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("LASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("LASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(String value) {
            addCriterion("LASTDATE =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(String value) {
            addCriterion("LASTDATE <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(String value) {
            addCriterion("LASTDATE >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(String value) {
            addCriterion("LASTDATE >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(String value) {
            addCriterion("LASTDATE <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(String value) {
            addCriterion("LASTDATE <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLike(String value) {
            addCriterion("LASTDATE like", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotLike(String value) {
            addCriterion("LASTDATE not like", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<String> values) {
            addCriterion("LASTDATE in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<String> values) {
            addCriterion("LASTDATE not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(String value1, String value2) {
            addCriterion("LASTDATE between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(String value1, String value2) {
            addCriterion("LASTDATE not between", value1, value2, "lastdate");
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

        public Criteria andBalanadvancesIsNull() {
            addCriterion("BALANADVANCES is null");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesIsNotNull() {
            addCriterion("BALANADVANCES is not null");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesEqualTo(String value) {
            addCriterion("BALANADVANCES =", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesNotEqualTo(String value) {
            addCriterion("BALANADVANCES <>", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesGreaterThan(String value) {
            addCriterion("BALANADVANCES >", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesGreaterThanOrEqualTo(String value) {
            addCriterion("BALANADVANCES >=", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesLessThan(String value) {
            addCriterion("BALANADVANCES <", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesLessThanOrEqualTo(String value) {
            addCriterion("BALANADVANCES <=", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesLike(String value) {
            addCriterion("BALANADVANCES like", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesNotLike(String value) {
            addCriterion("BALANADVANCES not like", value, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesIn(List<String> values) {
            addCriterion("BALANADVANCES in", values, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesNotIn(List<String> values) {
            addCriterion("BALANADVANCES not in", values, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesBetween(String value1, String value2) {
            addCriterion("BALANADVANCES between", value1, value2, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andBalanadvancesNotBetween(String value1, String value2) {
            addCriterion("BALANADVANCES not between", value1, value2, "balanadvances");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateIsNull() {
            addCriterion("ADVANCESLASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateIsNotNull() {
            addCriterion("ADVANCESLASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateEqualTo(String value) {
            addCriterion("ADVANCESLASTDATE =", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateNotEqualTo(String value) {
            addCriterion("ADVANCESLASTDATE <>", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateGreaterThan(String value) {
            addCriterion("ADVANCESLASTDATE >", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateGreaterThanOrEqualTo(String value) {
            addCriterion("ADVANCESLASTDATE >=", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateLessThan(String value) {
            addCriterion("ADVANCESLASTDATE <", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateLessThanOrEqualTo(String value) {
            addCriterion("ADVANCESLASTDATE <=", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateLike(String value) {
            addCriterion("ADVANCESLASTDATE like", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateNotLike(String value) {
            addCriterion("ADVANCESLASTDATE not like", value, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateIn(List<String> values) {
            addCriterion("ADVANCESLASTDATE in", values, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateNotIn(List<String> values) {
            addCriterion("ADVANCESLASTDATE not in", values, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateBetween(String value1, String value2) {
            addCriterion("ADVANCESLASTDATE between", value1, value2, "advanceslastdate");
            return (Criteria) this;
        }

        public Criteria andAdvanceslastdateNotBetween(String value1, String value2) {
            addCriterion("ADVANCESLASTDATE not between", value1, value2, "advanceslastdate");
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

        public Criteria andOverdueinterestIsNull() {
            addCriterion("OVERDUEINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestIsNotNull() {
            addCriterion("OVERDUEINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestEqualTo(String value) {
            addCriterion("OVERDUEINTEREST =", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestNotEqualTo(String value) {
            addCriterion("OVERDUEINTEREST <>", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestGreaterThan(String value) {
            addCriterion("OVERDUEINTEREST >", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEINTEREST >=", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestLessThan(String value) {
            addCriterion("OVERDUEINTEREST <", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEINTEREST <=", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestLike(String value) {
            addCriterion("OVERDUEINTEREST like", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestNotLike(String value) {
            addCriterion("OVERDUEINTEREST not like", value, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestIn(List<String> values) {
            addCriterion("OVERDUEINTEREST in", values, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestNotIn(List<String> values) {
            addCriterion("OVERDUEINTEREST not in", values, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestBetween(String value1, String value2) {
            addCriterion("OVERDUEINTEREST between", value1, value2, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestNotBetween(String value1, String value2) {
            addCriterion("OVERDUEINTEREST not between", value1, value2, "overdueinterest");
            return (Criteria) this;
        }

        public Criteria andOtherloansIsNull() {
            addCriterion("OTHERLOANS is null");
            return (Criteria) this;
        }

        public Criteria andOtherloansIsNotNull() {
            addCriterion("OTHERLOANS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherloansEqualTo(String value) {
            addCriterion("OTHERLOANS =", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotEqualTo(String value) {
            addCriterion("OTHERLOANS <>", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansGreaterThan(String value) {
            addCriterion("OTHERLOANS >", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERLOANS >=", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansLessThan(String value) {
            addCriterion("OTHERLOANS <", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansLessThanOrEqualTo(String value) {
            addCriterion("OTHERLOANS <=", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansLike(String value) {
            addCriterion("OTHERLOANS like", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotLike(String value) {
            addCriterion("OTHERLOANS not like", value, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansIn(List<String> values) {
            addCriterion("OTHERLOANS in", values, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotIn(List<String> values) {
            addCriterion("OTHERLOANS not in", values, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansBetween(String value1, String value2) {
            addCriterion("OTHERLOANS between", value1, value2, "otherloans");
            return (Criteria) this;
        }

        public Criteria andOtherloansNotBetween(String value1, String value2) {
            addCriterion("OTHERLOANS not between", value1, value2, "otherloans");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(String value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(String value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(String value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLike(String value) {
            addCriterion("BUSINESSTYPE like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotLike(String value) {
            addCriterion("BUSINESSTYPE not like", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<String> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andAssetqualityIsNull() {
            addCriterion("ASSETQUALITY is null");
            return (Criteria) this;
        }

        public Criteria andAssetqualityIsNotNull() {
            addCriterion("ASSETQUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andAssetqualityEqualTo(String value) {
            addCriterion("ASSETQUALITY =", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityNotEqualTo(String value) {
            addCriterion("ASSETQUALITY <>", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityGreaterThan(String value) {
            addCriterion("ASSETQUALITY >", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETQUALITY >=", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityLessThan(String value) {
            addCriterion("ASSETQUALITY <", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityLessThanOrEqualTo(String value) {
            addCriterion("ASSETQUALITY <=", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityLike(String value) {
            addCriterion("ASSETQUALITY like", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityNotLike(String value) {
            addCriterion("ASSETQUALITY not like", value, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityIn(List<String> values) {
            addCriterion("ASSETQUALITY in", values, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityNotIn(List<String> values) {
            addCriterion("ASSETQUALITY not in", values, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityBetween(String value1, String value2) {
            addCriterion("ASSETQUALITY between", value1, value2, "assetquality");
            return (Criteria) this;
        }

        public Criteria andAssetqualityNotBetween(String value1, String value2) {
            addCriterion("ASSETQUALITY not between", value1, value2, "assetquality");
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