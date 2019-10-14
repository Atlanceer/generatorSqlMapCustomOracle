package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CReportheaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CReportheaderExample() {
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

        public Criteria andQueryorgcodeIsNull() {
            addCriterion("QUERYORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeIsNotNull() {
            addCriterion("QUERYORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeEqualTo(String value) {
            addCriterion("QUERYORGCODE =", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeNotEqualTo(String value) {
            addCriterion("QUERYORGCODE <>", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeGreaterThan(String value) {
            addCriterion("QUERYORGCODE >", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYORGCODE >=", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeLessThan(String value) {
            addCriterion("QUERYORGCODE <", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeLessThanOrEqualTo(String value) {
            addCriterion("QUERYORGCODE <=", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeLike(String value) {
            addCriterion("QUERYORGCODE like", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeNotLike(String value) {
            addCriterion("QUERYORGCODE not like", value, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeIn(List<String> values) {
            addCriterion("QUERYORGCODE in", values, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeNotIn(List<String> values) {
            addCriterion("QUERYORGCODE not in", values, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeBetween(String value1, String value2) {
            addCriterion("QUERYORGCODE between", value1, value2, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryorgcodeNotBetween(String value1, String value2) {
            addCriterion("QUERYORGCODE not between", value1, value2, "queryorgcode");
            return (Criteria) this;
        }

        public Criteria andQueryreasonIsNull() {
            addCriterion("QUERYREASON is null");
            return (Criteria) this;
        }

        public Criteria andQueryreasonIsNotNull() {
            addCriterion("QUERYREASON is not null");
            return (Criteria) this;
        }

        public Criteria andQueryreasonEqualTo(String value) {
            addCriterion("QUERYREASON =", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotEqualTo(String value) {
            addCriterion("QUERYREASON <>", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonGreaterThan(String value) {
            addCriterion("QUERYREASON >", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYREASON >=", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonLessThan(String value) {
            addCriterion("QUERYREASON <", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonLessThanOrEqualTo(String value) {
            addCriterion("QUERYREASON <=", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonLike(String value) {
            addCriterion("QUERYREASON like", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotLike(String value) {
            addCriterion("QUERYREASON not like", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonIn(List<String> values) {
            addCriterion("QUERYREASON in", values, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotIn(List<String> values) {
            addCriterion("QUERYREASON not in", values, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonBetween(String value1, String value2) {
            addCriterion("QUERYREASON between", value1, value2, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotBetween(String value1, String value2) {
            addCriterion("QUERYREASON not between", value1, value2, "queryreason");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNull() {
            addCriterion("ENTERPRISENAME is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNotNull() {
            addCriterion("ENTERPRISENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameEqualTo(String value) {
            addCriterion("ENTERPRISENAME =", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotEqualTo(String value) {
            addCriterion("ENTERPRISENAME <>", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThan(String value) {
            addCriterion("ENTERPRISENAME >", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISENAME >=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThan(String value) {
            addCriterion("ENTERPRISENAME <", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISENAME <=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLike(String value) {
            addCriterion("ENTERPRISENAME like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotLike(String value) {
            addCriterion("ENTERPRISENAME not like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIn(List<String> values) {
            addCriterion("ENTERPRISENAME in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotIn(List<String> values) {
            addCriterion("ENTERPRISENAME not in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameBetween(String value1, String value2) {
            addCriterion("ENTERPRISENAME between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISENAME not between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumIsNull() {
            addCriterion("ENTERPRISEIDNUM is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumIsNotNull() {
            addCriterion("ENTERPRISEIDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUM =", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumNotEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUM <>", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumGreaterThan(String value) {
            addCriterion("ENTERPRISEIDNUM >", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUM >=", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumLessThan(String value) {
            addCriterion("ENTERPRISEIDNUM <", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUM <=", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumLike(String value) {
            addCriterion("ENTERPRISEIDNUM like", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumNotLike(String value) {
            addCriterion("ENTERPRISEIDNUM not like", value, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumIn(List<String> values) {
            addCriterion("ENTERPRISEIDNUM in", values, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumNotIn(List<String> values) {
            addCriterion("ENTERPRISEIDNUM not in", values, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumBetween(String value1, String value2) {
            addCriterion("ENTERPRISEIDNUM between", value1, value2, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISEIDNUM not between", value1, value2, "enterpriseidnum");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeIsNull() {
            addCriterion("ENTERPRISEIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeIsNotNull() {
            addCriterion("ENTERPRISEIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeEqualTo(String value) {
            addCriterion("ENTERPRISEIDTYPE =", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeNotEqualTo(String value) {
            addCriterion("ENTERPRISEIDTYPE <>", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeGreaterThan(String value) {
            addCriterion("ENTERPRISEIDTYPE >", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISEIDTYPE >=", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeLessThan(String value) {
            addCriterion("ENTERPRISEIDTYPE <", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISEIDTYPE <=", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeLike(String value) {
            addCriterion("ENTERPRISEIDTYPE like", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeNotLike(String value) {
            addCriterion("ENTERPRISEIDTYPE not like", value, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeIn(List<String> values) {
            addCriterion("ENTERPRISEIDTYPE in", values, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeNotIn(List<String> values) {
            addCriterion("ENTERPRISEIDTYPE not in", values, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeBetween(String value1, String value2) {
            addCriterion("ENTERPRISEIDTYPE between", value1, value2, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidtypeNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISEIDTYPE not between", value1, value2, "enterpriseidtype");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberIsNull() {
            addCriterion("ENTERPRISEIDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberIsNotNull() {
            addCriterion("ENTERPRISEIDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUMBER =", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberNotEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUMBER <>", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberGreaterThan(String value) {
            addCriterion("ENTERPRISEIDNUMBER >", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUMBER >=", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberLessThan(String value) {
            addCriterion("ENTERPRISEIDNUMBER <", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISEIDNUMBER <=", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberLike(String value) {
            addCriterion("ENTERPRISEIDNUMBER like", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberNotLike(String value) {
            addCriterion("ENTERPRISEIDNUMBER not like", value, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberIn(List<String> values) {
            addCriterion("ENTERPRISEIDNUMBER in", values, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberNotIn(List<String> values) {
            addCriterion("ENTERPRISEIDNUMBER not in", values, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberBetween(String value1, String value2) {
            addCriterion("ENTERPRISEIDNUMBER between", value1, value2, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseidnumberNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISEIDNUMBER not between", value1, value2, "enterpriseidnumber");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsIsNull() {
            addCriterion("NUMOBJECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsIsNotNull() {
            addCriterion("NUMOBJECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsEqualTo(String value) {
            addCriterion("NUMOBJECTIONS =", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsNotEqualTo(String value) {
            addCriterion("NUMOBJECTIONS <>", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsGreaterThan(String value) {
            addCriterion("NUMOBJECTIONS >", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsGreaterThanOrEqualTo(String value) {
            addCriterion("NUMOBJECTIONS >=", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsLessThan(String value) {
            addCriterion("NUMOBJECTIONS <", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsLessThanOrEqualTo(String value) {
            addCriterion("NUMOBJECTIONS <=", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsLike(String value) {
            addCriterion("NUMOBJECTIONS like", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsNotLike(String value) {
            addCriterion("NUMOBJECTIONS not like", value, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsIn(List<String> values) {
            addCriterion("NUMOBJECTIONS in", values, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsNotIn(List<String> values) {
            addCriterion("NUMOBJECTIONS not in", values, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsBetween(String value1, String value2) {
            addCriterion("NUMOBJECTIONS between", value1, value2, "numobjections");
            return (Criteria) this;
        }

        public Criteria andNumobjectionsNotBetween(String value1, String value2) {
            addCriterion("NUMOBJECTIONS not between", value1, value2, "numobjections");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("EXCHANGERATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("EXCHANGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(String value) {
            addCriterion("EXCHANGERATE =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(String value) {
            addCriterion("EXCHANGERATE <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(String value) {
            addCriterion("EXCHANGERATE >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGERATE >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(String value) {
            addCriterion("EXCHANGERATE <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGERATE <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLike(String value) {
            addCriterion("EXCHANGERATE like", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotLike(String value) {
            addCriterion("EXCHANGERATE not like", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<String> values) {
            addCriterion("EXCHANGERATE in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<String> values) {
            addCriterion("EXCHANGERATE not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(String value1, String value2) {
            addCriterion("EXCHANGERATE between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(String value1, String value2) {
            addCriterion("EXCHANGERATE not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateIsNull() {
            addCriterion("EXCHANGERATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateIsNotNull() {
            addCriterion("EXCHANGERATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateEqualTo(String value) {
            addCriterion("EXCHANGERATEDATE =", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateNotEqualTo(String value) {
            addCriterion("EXCHANGERATEDATE <>", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateGreaterThan(String value) {
            addCriterion("EXCHANGERATEDATE >", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGERATEDATE >=", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateLessThan(String value) {
            addCriterion("EXCHANGERATEDATE <", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGERATEDATE <=", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateLike(String value) {
            addCriterion("EXCHANGERATEDATE like", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateNotLike(String value) {
            addCriterion("EXCHANGERATEDATE not like", value, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateIn(List<String> values) {
            addCriterion("EXCHANGERATEDATE in", values, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateNotIn(List<String> values) {
            addCriterion("EXCHANGERATEDATE not in", values, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateBetween(String value1, String value2) {
            addCriterion("EXCHANGERATEDATE between", value1, value2, "exchangeratedate");
            return (Criteria) this;
        }

        public Criteria andExchangeratedateNotBetween(String value1, String value2) {
            addCriterion("EXCHANGERATEDATE not between", value1, value2, "exchangeratedate");
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