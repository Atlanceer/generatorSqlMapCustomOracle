package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CDiscountedacctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CDiscountedacctExample() {
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

        public Criteria andSpecifictransactionidIsNull() {
            addCriterion("SPECIFICTRANSACTIONID is null");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidIsNotNull() {
            addCriterion("SPECIFICTRANSACTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONID =", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidNotEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONID <>", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidGreaterThan(String value) {
            addCriterion("SPECIFICTRANSACTIONID >", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONID >=", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidLessThan(String value) {
            addCriterion("SPECIFICTRANSACTIONID <", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICTRANSACTIONID <=", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidLike(String value) {
            addCriterion("SPECIFICTRANSACTIONID like", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidNotLike(String value) {
            addCriterion("SPECIFICTRANSACTIONID not like", value, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidIn(List<String> values) {
            addCriterion("SPECIFICTRANSACTIONID in", values, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidNotIn(List<String> values) {
            addCriterion("SPECIFICTRANSACTIONID not in", values, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidBetween(String value1, String value2) {
            addCriterion("SPECIFICTRANSACTIONID between", value1, value2, "specifictransactionid");
            return (Criteria) this;
        }

        public Criteria andSpecifictransactionidNotBetween(String value1, String value2) {
            addCriterion("SPECIFICTRANSACTIONID not between", value1, value2, "specifictransactionid");
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

        public Criteria andBusinesstypesIsNull() {
            addCriterion("BUSINESSTYPES is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesIsNotNull() {
            addCriterion("BUSINESSTYPES is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesEqualTo(String value) {
            addCriterion("BUSINESSTYPES =", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesNotEqualTo(String value) {
            addCriterion("BUSINESSTYPES <>", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesGreaterThan(String value) {
            addCriterion("BUSINESSTYPES >", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPES >=", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesLessThan(String value) {
            addCriterion("BUSINESSTYPES <", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPES <=", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesLike(String value) {
            addCriterion("BUSINESSTYPES like", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesNotLike(String value) {
            addCriterion("BUSINESSTYPES not like", value, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesIn(List<String> values) {
            addCriterion("BUSINESSTYPES in", values, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesNotIn(List<String> values) {
            addCriterion("BUSINESSTYPES not in", values, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPES between", value1, value2, "businesstypes");
            return (Criteria) this;
        }

        public Criteria andBusinesstypesNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPES not between", value1, value2, "businesstypes");
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

        public Criteria andUnclearedIsNull() {
            addCriterion("UNCLEARED is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedIsNotNull() {
            addCriterion("UNCLEARED is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedEqualTo(String value) {
            addCriterion("UNCLEARED =", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedNotEqualTo(String value) {
            addCriterion("UNCLEARED <>", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedGreaterThan(String value) {
            addCriterion("UNCLEARED >", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedGreaterThanOrEqualTo(String value) {
            addCriterion("UNCLEARED >=", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedLessThan(String value) {
            addCriterion("UNCLEARED <", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedLessThanOrEqualTo(String value) {
            addCriterion("UNCLEARED <=", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedLike(String value) {
            addCriterion("UNCLEARED like", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedNotLike(String value) {
            addCriterion("UNCLEARED not like", value, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedIn(List<String> values) {
            addCriterion("UNCLEARED in", values, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedNotIn(List<String> values) {
            addCriterion("UNCLEARED not in", values, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedBetween(String value1, String value2) {
            addCriterion("UNCLEARED between", value1, value2, "uncleared");
            return (Criteria) this;
        }

        public Criteria andUnclearedNotBetween(String value1, String value2) {
            addCriterion("UNCLEARED not between", value1, value2, "uncleared");
            return (Criteria) this;
        }

        public Criteria andBalancetotalIsNull() {
            addCriterion("BALANCETOTAL is null");
            return (Criteria) this;
        }

        public Criteria andBalancetotalIsNotNull() {
            addCriterion("BALANCETOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andBalancetotalEqualTo(String value) {
            addCriterion("BALANCETOTAL =", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalNotEqualTo(String value) {
            addCriterion("BALANCETOTAL <>", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalGreaterThan(String value) {
            addCriterion("BALANCETOTAL >", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCETOTAL >=", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalLessThan(String value) {
            addCriterion("BALANCETOTAL <", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalLessThanOrEqualTo(String value) {
            addCriterion("BALANCETOTAL <=", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalLike(String value) {
            addCriterion("BALANCETOTAL like", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalNotLike(String value) {
            addCriterion("BALANCETOTAL not like", value, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalIn(List<String> values) {
            addCriterion("BALANCETOTAL in", values, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalNotIn(List<String> values) {
            addCriterion("BALANCETOTAL not in", values, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalBetween(String value1, String value2) {
            addCriterion("BALANCETOTAL between", value1, value2, "balancetotal");
            return (Criteria) this;
        }

        public Criteria andBalancetotalNotBetween(String value1, String value2) {
            addCriterion("BALANCETOTAL not between", value1, value2, "balancetotal");
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

        public Criteria andCloaedaccountIsNull() {
            addCriterion("CLOAEDACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountIsNotNull() {
            addCriterion("CLOAEDACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountEqualTo(String value) {
            addCriterion("CLOAEDACCOUNT =", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountNotEqualTo(String value) {
            addCriterion("CLOAEDACCOUNT <>", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountGreaterThan(String value) {
            addCriterion("CLOAEDACCOUNT >", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountGreaterThanOrEqualTo(String value) {
            addCriterion("CLOAEDACCOUNT >=", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountLessThan(String value) {
            addCriterion("CLOAEDACCOUNT <", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountLessThanOrEqualTo(String value) {
            addCriterion("CLOAEDACCOUNT <=", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountLike(String value) {
            addCriterion("CLOAEDACCOUNT like", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountNotLike(String value) {
            addCriterion("CLOAEDACCOUNT not like", value, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountIn(List<String> values) {
            addCriterion("CLOAEDACCOUNT in", values, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountNotIn(List<String> values) {
            addCriterion("CLOAEDACCOUNT not in", values, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountBetween(String value1, String value2) {
            addCriterion("CLOAEDACCOUNT between", value1, value2, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andCloaedaccountNotBetween(String value1, String value2) {
            addCriterion("CLOAEDACCOUNT not between", value1, value2, "cloaedaccount");
            return (Criteria) this;
        }

        public Criteria andClearedcashIsNull() {
            addCriterion("CLEAREDCASH is null");
            return (Criteria) this;
        }

        public Criteria andClearedcashIsNotNull() {
            addCriterion("CLEAREDCASH is not null");
            return (Criteria) this;
        }

        public Criteria andClearedcashEqualTo(String value) {
            addCriterion("CLEAREDCASH =", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashNotEqualTo(String value) {
            addCriterion("CLEAREDCASH <>", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashGreaterThan(String value) {
            addCriterion("CLEAREDCASH >", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashGreaterThanOrEqualTo(String value) {
            addCriterion("CLEAREDCASH >=", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashLessThan(String value) {
            addCriterion("CLEAREDCASH <", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashLessThanOrEqualTo(String value) {
            addCriterion("CLEAREDCASH <=", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashLike(String value) {
            addCriterion("CLEAREDCASH like", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashNotLike(String value) {
            addCriterion("CLEAREDCASH not like", value, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashIn(List<String> values) {
            addCriterion("CLEAREDCASH in", values, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashNotIn(List<String> values) {
            addCriterion("CLEAREDCASH not in", values, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashBetween(String value1, String value2) {
            addCriterion("CLEAREDCASH between", value1, value2, "clearedcash");
            return (Criteria) this;
        }

        public Criteria andClearedcashNotBetween(String value1, String value2) {
            addCriterion("CLEAREDCASH not between", value1, value2, "clearedcash");
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