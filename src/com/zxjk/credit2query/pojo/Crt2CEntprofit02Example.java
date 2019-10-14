package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntprofit02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntprofit02Example() {
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

        public Criteria andFinanceidIsNull() {
            addCriterion("FINANCEID is null");
            return (Criteria) this;
        }

        public Criteria andFinanceidIsNotNull() {
            addCriterion("FINANCEID is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceidEqualTo(String value) {
            addCriterion("FINANCEID =", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotEqualTo(String value) {
            addCriterion("FINANCEID <>", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidGreaterThan(String value) {
            addCriterion("FINANCEID >", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCEID >=", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidLessThan(String value) {
            addCriterion("FINANCEID <", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidLessThanOrEqualTo(String value) {
            addCriterion("FINANCEID <=", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidLike(String value) {
            addCriterion("FINANCEID like", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotLike(String value) {
            addCriterion("FINANCEID not like", value, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidIn(List<String> values) {
            addCriterion("FINANCEID in", values, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotIn(List<String> values) {
            addCriterion("FINANCEID not in", values, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidBetween(String value1, String value2) {
            addCriterion("FINANCEID between", value1, value2, "financeid");
            return (Criteria) this;
        }

        public Criteria andFinanceidNotBetween(String value1, String value2) {
            addCriterion("FINANCEID not between", value1, value2, "financeid");
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

        public Criteria andProfitinfodateIsNull() {
            addCriterion("PROFITINFODATE is null");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateIsNotNull() {
            addCriterion("PROFITINFODATE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateEqualTo(String value) {
            addCriterion("PROFITINFODATE =", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateNotEqualTo(String value) {
            addCriterion("PROFITINFODATE <>", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateGreaterThan(String value) {
            addCriterion("PROFITINFODATE >", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateGreaterThanOrEqualTo(String value) {
            addCriterion("PROFITINFODATE >=", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateLessThan(String value) {
            addCriterion("PROFITINFODATE <", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateLessThanOrEqualTo(String value) {
            addCriterion("PROFITINFODATE <=", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateLike(String value) {
            addCriterion("PROFITINFODATE like", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateNotLike(String value) {
            addCriterion("PROFITINFODATE not like", value, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateIn(List<String> values) {
            addCriterion("PROFITINFODATE in", values, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateNotIn(List<String> values) {
            addCriterion("PROFITINFODATE not in", values, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateBetween(String value1, String value2) {
            addCriterion("PROFITINFODATE between", value1, value2, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfodateNotBetween(String value1, String value2) {
            addCriterion("PROFITINFODATE not between", value1, value2, "profitinfodate");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeIsNull() {
            addCriterion("PROFITINFOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeIsNotNull() {
            addCriterion("PROFITINFOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeEqualTo(String value) {
            addCriterion("PROFITINFOTYPE =", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeNotEqualTo(String value) {
            addCriterion("PROFITINFOTYPE <>", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeGreaterThan(String value) {
            addCriterion("PROFITINFOTYPE >", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROFITINFOTYPE >=", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeLessThan(String value) {
            addCriterion("PROFITINFOTYPE <", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeLessThanOrEqualTo(String value) {
            addCriterion("PROFITINFOTYPE <=", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeLike(String value) {
            addCriterion("PROFITINFOTYPE like", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeNotLike(String value) {
            addCriterion("PROFITINFOTYPE not like", value, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeIn(List<String> values) {
            addCriterion("PROFITINFOTYPE in", values, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeNotIn(List<String> values) {
            addCriterion("PROFITINFOTYPE not in", values, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeBetween(String value1, String value2) {
            addCriterion("PROFITINFOTYPE between", value1, value2, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfotypeNotBetween(String value1, String value2) {
            addCriterion("PROFITINFOTYPE not between", value1, value2, "profitinfotype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeIsNull() {
            addCriterion("PROFITINFOSUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeIsNotNull() {
            addCriterion("PROFITINFOSUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeEqualTo(String value) {
            addCriterion("PROFITINFOSUBTYPE =", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeNotEqualTo(String value) {
            addCriterion("PROFITINFOSUBTYPE <>", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeGreaterThan(String value) {
            addCriterion("PROFITINFOSUBTYPE >", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROFITINFOSUBTYPE >=", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeLessThan(String value) {
            addCriterion("PROFITINFOSUBTYPE <", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeLessThanOrEqualTo(String value) {
            addCriterion("PROFITINFOSUBTYPE <=", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeLike(String value) {
            addCriterion("PROFITINFOSUBTYPE like", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeNotLike(String value) {
            addCriterion("PROFITINFOSUBTYPE not like", value, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeIn(List<String> values) {
            addCriterion("PROFITINFOSUBTYPE in", values, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeNotIn(List<String> values) {
            addCriterion("PROFITINFOSUBTYPE not in", values, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeBetween(String value1, String value2) {
            addCriterion("PROFITINFOSUBTYPE between", value1, value2, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andProfitinfosubtypeNotBetween(String value1, String value2) {
            addCriterion("PROFITINFOSUBTYPE not between", value1, value2, "profitinfosubtype");
            return (Criteria) this;
        }

        public Criteria andEg03bj01IsNull() {
            addCriterion("EG03BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj01IsNotNull() {
            addCriterion("EG03BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj01EqualTo(String value) {
            addCriterion("EG03BJ01 =", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01NotEqualTo(String value) {
            addCriterion("EG03BJ01 <>", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01GreaterThan(String value) {
            addCriterion("EG03BJ01 >", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ01 >=", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01LessThan(String value) {
            addCriterion("EG03BJ01 <", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ01 <=", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01Like(String value) {
            addCriterion("EG03BJ01 like", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01NotLike(String value) {
            addCriterion("EG03BJ01 not like", value, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01In(List<String> values) {
            addCriterion("EG03BJ01 in", values, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01NotIn(List<String> values) {
            addCriterion("EG03BJ01 not in", values, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01Between(String value1, String value2) {
            addCriterion("EG03BJ01 between", value1, value2, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj01NotBetween(String value1, String value2) {
            addCriterion("EG03BJ01 not between", value1, value2, "eg03bj01");
            return (Criteria) this;
        }

        public Criteria andEg03bj02IsNull() {
            addCriterion("EG03BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj02IsNotNull() {
            addCriterion("EG03BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj02EqualTo(String value) {
            addCriterion("EG03BJ02 =", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02NotEqualTo(String value) {
            addCriterion("EG03BJ02 <>", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02GreaterThan(String value) {
            addCriterion("EG03BJ02 >", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ02 >=", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02LessThan(String value) {
            addCriterion("EG03BJ02 <", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ02 <=", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02Like(String value) {
            addCriterion("EG03BJ02 like", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02NotLike(String value) {
            addCriterion("EG03BJ02 not like", value, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02In(List<String> values) {
            addCriterion("EG03BJ02 in", values, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02NotIn(List<String> values) {
            addCriterion("EG03BJ02 not in", values, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02Between(String value1, String value2) {
            addCriterion("EG03BJ02 between", value1, value2, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj02NotBetween(String value1, String value2) {
            addCriterion("EG03BJ02 not between", value1, value2, "eg03bj02");
            return (Criteria) this;
        }

        public Criteria andEg03bj03IsNull() {
            addCriterion("EG03BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj03IsNotNull() {
            addCriterion("EG03BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj03EqualTo(String value) {
            addCriterion("EG03BJ03 =", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03NotEqualTo(String value) {
            addCriterion("EG03BJ03 <>", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03GreaterThan(String value) {
            addCriterion("EG03BJ03 >", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ03 >=", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03LessThan(String value) {
            addCriterion("EG03BJ03 <", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ03 <=", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03Like(String value) {
            addCriterion("EG03BJ03 like", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03NotLike(String value) {
            addCriterion("EG03BJ03 not like", value, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03In(List<String> values) {
            addCriterion("EG03BJ03 in", values, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03NotIn(List<String> values) {
            addCriterion("EG03BJ03 not in", values, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03Between(String value1, String value2) {
            addCriterion("EG03BJ03 between", value1, value2, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj03NotBetween(String value1, String value2) {
            addCriterion("EG03BJ03 not between", value1, value2, "eg03bj03");
            return (Criteria) this;
        }

        public Criteria andEg03bj04IsNull() {
            addCriterion("EG03BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj04IsNotNull() {
            addCriterion("EG03BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj04EqualTo(String value) {
            addCriterion("EG03BJ04 =", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04NotEqualTo(String value) {
            addCriterion("EG03BJ04 <>", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04GreaterThan(String value) {
            addCriterion("EG03BJ04 >", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ04 >=", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04LessThan(String value) {
            addCriterion("EG03BJ04 <", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ04 <=", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04Like(String value) {
            addCriterion("EG03BJ04 like", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04NotLike(String value) {
            addCriterion("EG03BJ04 not like", value, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04In(List<String> values) {
            addCriterion("EG03BJ04 in", values, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04NotIn(List<String> values) {
            addCriterion("EG03BJ04 not in", values, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04Between(String value1, String value2) {
            addCriterion("EG03BJ04 between", value1, value2, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj04NotBetween(String value1, String value2) {
            addCriterion("EG03BJ04 not between", value1, value2, "eg03bj04");
            return (Criteria) this;
        }

        public Criteria andEg03bj05IsNull() {
            addCriterion("EG03BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj05IsNotNull() {
            addCriterion("EG03BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj05EqualTo(String value) {
            addCriterion("EG03BJ05 =", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05NotEqualTo(String value) {
            addCriterion("EG03BJ05 <>", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05GreaterThan(String value) {
            addCriterion("EG03BJ05 >", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ05 >=", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05LessThan(String value) {
            addCriterion("EG03BJ05 <", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ05 <=", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05Like(String value) {
            addCriterion("EG03BJ05 like", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05NotLike(String value) {
            addCriterion("EG03BJ05 not like", value, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05In(List<String> values) {
            addCriterion("EG03BJ05 in", values, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05NotIn(List<String> values) {
            addCriterion("EG03BJ05 not in", values, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05Between(String value1, String value2) {
            addCriterion("EG03BJ05 between", value1, value2, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj05NotBetween(String value1, String value2) {
            addCriterion("EG03BJ05 not between", value1, value2, "eg03bj05");
            return (Criteria) this;
        }

        public Criteria andEg03bj06IsNull() {
            addCriterion("EG03BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj06IsNotNull() {
            addCriterion("EG03BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj06EqualTo(String value) {
            addCriterion("EG03BJ06 =", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06NotEqualTo(String value) {
            addCriterion("EG03BJ06 <>", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06GreaterThan(String value) {
            addCriterion("EG03BJ06 >", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ06 >=", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06LessThan(String value) {
            addCriterion("EG03BJ06 <", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ06 <=", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06Like(String value) {
            addCriterion("EG03BJ06 like", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06NotLike(String value) {
            addCriterion("EG03BJ06 not like", value, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06In(List<String> values) {
            addCriterion("EG03BJ06 in", values, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06NotIn(List<String> values) {
            addCriterion("EG03BJ06 not in", values, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06Between(String value1, String value2) {
            addCriterion("EG03BJ06 between", value1, value2, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj06NotBetween(String value1, String value2) {
            addCriterion("EG03BJ06 not between", value1, value2, "eg03bj06");
            return (Criteria) this;
        }

        public Criteria andEg03bj07IsNull() {
            addCriterion("EG03BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj07IsNotNull() {
            addCriterion("EG03BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj07EqualTo(String value) {
            addCriterion("EG03BJ07 =", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07NotEqualTo(String value) {
            addCriterion("EG03BJ07 <>", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07GreaterThan(String value) {
            addCriterion("EG03BJ07 >", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ07 >=", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07LessThan(String value) {
            addCriterion("EG03BJ07 <", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ07 <=", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07Like(String value) {
            addCriterion("EG03BJ07 like", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07NotLike(String value) {
            addCriterion("EG03BJ07 not like", value, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07In(List<String> values) {
            addCriterion("EG03BJ07 in", values, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07NotIn(List<String> values) {
            addCriterion("EG03BJ07 not in", values, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07Between(String value1, String value2) {
            addCriterion("EG03BJ07 between", value1, value2, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj07NotBetween(String value1, String value2) {
            addCriterion("EG03BJ07 not between", value1, value2, "eg03bj07");
            return (Criteria) this;
        }

        public Criteria andEg03bj08IsNull() {
            addCriterion("EG03BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj08IsNotNull() {
            addCriterion("EG03BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj08EqualTo(String value) {
            addCriterion("EG03BJ08 =", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08NotEqualTo(String value) {
            addCriterion("EG03BJ08 <>", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08GreaterThan(String value) {
            addCriterion("EG03BJ08 >", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ08 >=", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08LessThan(String value) {
            addCriterion("EG03BJ08 <", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ08 <=", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08Like(String value) {
            addCriterion("EG03BJ08 like", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08NotLike(String value) {
            addCriterion("EG03BJ08 not like", value, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08In(List<String> values) {
            addCriterion("EG03BJ08 in", values, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08NotIn(List<String> values) {
            addCriterion("EG03BJ08 not in", values, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08Between(String value1, String value2) {
            addCriterion("EG03BJ08 between", value1, value2, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj08NotBetween(String value1, String value2) {
            addCriterion("EG03BJ08 not between", value1, value2, "eg03bj08");
            return (Criteria) this;
        }

        public Criteria andEg03bj09IsNull() {
            addCriterion("EG03BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj09IsNotNull() {
            addCriterion("EG03BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj09EqualTo(String value) {
            addCriterion("EG03BJ09 =", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09NotEqualTo(String value) {
            addCriterion("EG03BJ09 <>", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09GreaterThan(String value) {
            addCriterion("EG03BJ09 >", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ09 >=", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09LessThan(String value) {
            addCriterion("EG03BJ09 <", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ09 <=", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09Like(String value) {
            addCriterion("EG03BJ09 like", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09NotLike(String value) {
            addCriterion("EG03BJ09 not like", value, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09In(List<String> values) {
            addCriterion("EG03BJ09 in", values, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09NotIn(List<String> values) {
            addCriterion("EG03BJ09 not in", values, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09Between(String value1, String value2) {
            addCriterion("EG03BJ09 between", value1, value2, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj09NotBetween(String value1, String value2) {
            addCriterion("EG03BJ09 not between", value1, value2, "eg03bj09");
            return (Criteria) this;
        }

        public Criteria andEg03bj10IsNull() {
            addCriterion("EG03BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj10IsNotNull() {
            addCriterion("EG03BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj10EqualTo(String value) {
            addCriterion("EG03BJ10 =", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10NotEqualTo(String value) {
            addCriterion("EG03BJ10 <>", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10GreaterThan(String value) {
            addCriterion("EG03BJ10 >", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ10 >=", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10LessThan(String value) {
            addCriterion("EG03BJ10 <", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ10 <=", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10Like(String value) {
            addCriterion("EG03BJ10 like", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10NotLike(String value) {
            addCriterion("EG03BJ10 not like", value, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10In(List<String> values) {
            addCriterion("EG03BJ10 in", values, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10NotIn(List<String> values) {
            addCriterion("EG03BJ10 not in", values, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10Between(String value1, String value2) {
            addCriterion("EG03BJ10 between", value1, value2, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj10NotBetween(String value1, String value2) {
            addCriterion("EG03BJ10 not between", value1, value2, "eg03bj10");
            return (Criteria) this;
        }

        public Criteria andEg03bj11IsNull() {
            addCriterion("EG03BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj11IsNotNull() {
            addCriterion("EG03BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj11EqualTo(String value) {
            addCriterion("EG03BJ11 =", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11NotEqualTo(String value) {
            addCriterion("EG03BJ11 <>", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11GreaterThan(String value) {
            addCriterion("EG03BJ11 >", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ11 >=", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11LessThan(String value) {
            addCriterion("EG03BJ11 <", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ11 <=", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11Like(String value) {
            addCriterion("EG03BJ11 like", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11NotLike(String value) {
            addCriterion("EG03BJ11 not like", value, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11In(List<String> values) {
            addCriterion("EG03BJ11 in", values, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11NotIn(List<String> values) {
            addCriterion("EG03BJ11 not in", values, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11Between(String value1, String value2) {
            addCriterion("EG03BJ11 between", value1, value2, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj11NotBetween(String value1, String value2) {
            addCriterion("EG03BJ11 not between", value1, value2, "eg03bj11");
            return (Criteria) this;
        }

        public Criteria andEg03bj12IsNull() {
            addCriterion("EG03BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj12IsNotNull() {
            addCriterion("EG03BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj12EqualTo(String value) {
            addCriterion("EG03BJ12 =", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12NotEqualTo(String value) {
            addCriterion("EG03BJ12 <>", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12GreaterThan(String value) {
            addCriterion("EG03BJ12 >", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ12 >=", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12LessThan(String value) {
            addCriterion("EG03BJ12 <", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ12 <=", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12Like(String value) {
            addCriterion("EG03BJ12 like", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12NotLike(String value) {
            addCriterion("EG03BJ12 not like", value, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12In(List<String> values) {
            addCriterion("EG03BJ12 in", values, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12NotIn(List<String> values) {
            addCriterion("EG03BJ12 not in", values, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12Between(String value1, String value2) {
            addCriterion("EG03BJ12 between", value1, value2, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj12NotBetween(String value1, String value2) {
            addCriterion("EG03BJ12 not between", value1, value2, "eg03bj12");
            return (Criteria) this;
        }

        public Criteria andEg03bj13IsNull() {
            addCriterion("EG03BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj13IsNotNull() {
            addCriterion("EG03BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj13EqualTo(String value) {
            addCriterion("EG03BJ13 =", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13NotEqualTo(String value) {
            addCriterion("EG03BJ13 <>", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13GreaterThan(String value) {
            addCriterion("EG03BJ13 >", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ13 >=", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13LessThan(String value) {
            addCriterion("EG03BJ13 <", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ13 <=", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13Like(String value) {
            addCriterion("EG03BJ13 like", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13NotLike(String value) {
            addCriterion("EG03BJ13 not like", value, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13In(List<String> values) {
            addCriterion("EG03BJ13 in", values, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13NotIn(List<String> values) {
            addCriterion("EG03BJ13 not in", values, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13Between(String value1, String value2) {
            addCriterion("EG03BJ13 between", value1, value2, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj13NotBetween(String value1, String value2) {
            addCriterion("EG03BJ13 not between", value1, value2, "eg03bj13");
            return (Criteria) this;
        }

        public Criteria andEg03bj14IsNull() {
            addCriterion("EG03BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj14IsNotNull() {
            addCriterion("EG03BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj14EqualTo(String value) {
            addCriterion("EG03BJ14 =", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14NotEqualTo(String value) {
            addCriterion("EG03BJ14 <>", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14GreaterThan(String value) {
            addCriterion("EG03BJ14 >", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ14 >=", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14LessThan(String value) {
            addCriterion("EG03BJ14 <", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ14 <=", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14Like(String value) {
            addCriterion("EG03BJ14 like", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14NotLike(String value) {
            addCriterion("EG03BJ14 not like", value, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14In(List<String> values) {
            addCriterion("EG03BJ14 in", values, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14NotIn(List<String> values) {
            addCriterion("EG03BJ14 not in", values, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14Between(String value1, String value2) {
            addCriterion("EG03BJ14 between", value1, value2, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj14NotBetween(String value1, String value2) {
            addCriterion("EG03BJ14 not between", value1, value2, "eg03bj14");
            return (Criteria) this;
        }

        public Criteria andEg03bj15IsNull() {
            addCriterion("EG03BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj15IsNotNull() {
            addCriterion("EG03BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj15EqualTo(String value) {
            addCriterion("EG03BJ15 =", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15NotEqualTo(String value) {
            addCriterion("EG03BJ15 <>", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15GreaterThan(String value) {
            addCriterion("EG03BJ15 >", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ15 >=", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15LessThan(String value) {
            addCriterion("EG03BJ15 <", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ15 <=", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15Like(String value) {
            addCriterion("EG03BJ15 like", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15NotLike(String value) {
            addCriterion("EG03BJ15 not like", value, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15In(List<String> values) {
            addCriterion("EG03BJ15 in", values, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15NotIn(List<String> values) {
            addCriterion("EG03BJ15 not in", values, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15Between(String value1, String value2) {
            addCriterion("EG03BJ15 between", value1, value2, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj15NotBetween(String value1, String value2) {
            addCriterion("EG03BJ15 not between", value1, value2, "eg03bj15");
            return (Criteria) this;
        }

        public Criteria andEg03bj16IsNull() {
            addCriterion("EG03BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj16IsNotNull() {
            addCriterion("EG03BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj16EqualTo(String value) {
            addCriterion("EG03BJ16 =", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16NotEqualTo(String value) {
            addCriterion("EG03BJ16 <>", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16GreaterThan(String value) {
            addCriterion("EG03BJ16 >", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ16 >=", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16LessThan(String value) {
            addCriterion("EG03BJ16 <", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ16 <=", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16Like(String value) {
            addCriterion("EG03BJ16 like", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16NotLike(String value) {
            addCriterion("EG03BJ16 not like", value, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16In(List<String> values) {
            addCriterion("EG03BJ16 in", values, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16NotIn(List<String> values) {
            addCriterion("EG03BJ16 not in", values, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16Between(String value1, String value2) {
            addCriterion("EG03BJ16 between", value1, value2, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj16NotBetween(String value1, String value2) {
            addCriterion("EG03BJ16 not between", value1, value2, "eg03bj16");
            return (Criteria) this;
        }

        public Criteria andEg03bj17IsNull() {
            addCriterion("EG03BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj17IsNotNull() {
            addCriterion("EG03BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj17EqualTo(String value) {
            addCriterion("EG03BJ17 =", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17NotEqualTo(String value) {
            addCriterion("EG03BJ17 <>", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17GreaterThan(String value) {
            addCriterion("EG03BJ17 >", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ17 >=", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17LessThan(String value) {
            addCriterion("EG03BJ17 <", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ17 <=", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17Like(String value) {
            addCriterion("EG03BJ17 like", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17NotLike(String value) {
            addCriterion("EG03BJ17 not like", value, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17In(List<String> values) {
            addCriterion("EG03BJ17 in", values, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17NotIn(List<String> values) {
            addCriterion("EG03BJ17 not in", values, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17Between(String value1, String value2) {
            addCriterion("EG03BJ17 between", value1, value2, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj17NotBetween(String value1, String value2) {
            addCriterion("EG03BJ17 not between", value1, value2, "eg03bj17");
            return (Criteria) this;
        }

        public Criteria andEg03bj18IsNull() {
            addCriterion("EG03BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj18IsNotNull() {
            addCriterion("EG03BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj18EqualTo(String value) {
            addCriterion("EG03BJ18 =", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18NotEqualTo(String value) {
            addCriterion("EG03BJ18 <>", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18GreaterThan(String value) {
            addCriterion("EG03BJ18 >", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ18 >=", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18LessThan(String value) {
            addCriterion("EG03BJ18 <", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ18 <=", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18Like(String value) {
            addCriterion("EG03BJ18 like", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18NotLike(String value) {
            addCriterion("EG03BJ18 not like", value, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18In(List<String> values) {
            addCriterion("EG03BJ18 in", values, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18NotIn(List<String> values) {
            addCriterion("EG03BJ18 not in", values, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18Between(String value1, String value2) {
            addCriterion("EG03BJ18 between", value1, value2, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj18NotBetween(String value1, String value2) {
            addCriterion("EG03BJ18 not between", value1, value2, "eg03bj18");
            return (Criteria) this;
        }

        public Criteria andEg03bj19IsNull() {
            addCriterion("EG03BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj19IsNotNull() {
            addCriterion("EG03BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj19EqualTo(String value) {
            addCriterion("EG03BJ19 =", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19NotEqualTo(String value) {
            addCriterion("EG03BJ19 <>", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19GreaterThan(String value) {
            addCriterion("EG03BJ19 >", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ19 >=", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19LessThan(String value) {
            addCriterion("EG03BJ19 <", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ19 <=", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19Like(String value) {
            addCriterion("EG03BJ19 like", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19NotLike(String value) {
            addCriterion("EG03BJ19 not like", value, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19In(List<String> values) {
            addCriterion("EG03BJ19 in", values, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19NotIn(List<String> values) {
            addCriterion("EG03BJ19 not in", values, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19Between(String value1, String value2) {
            addCriterion("EG03BJ19 between", value1, value2, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj19NotBetween(String value1, String value2) {
            addCriterion("EG03BJ19 not between", value1, value2, "eg03bj19");
            return (Criteria) this;
        }

        public Criteria andEg03bj20IsNull() {
            addCriterion("EG03BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj20IsNotNull() {
            addCriterion("EG03BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj20EqualTo(String value) {
            addCriterion("EG03BJ20 =", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20NotEqualTo(String value) {
            addCriterion("EG03BJ20 <>", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20GreaterThan(String value) {
            addCriterion("EG03BJ20 >", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ20 >=", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20LessThan(String value) {
            addCriterion("EG03BJ20 <", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ20 <=", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20Like(String value) {
            addCriterion("EG03BJ20 like", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20NotLike(String value) {
            addCriterion("EG03BJ20 not like", value, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20In(List<String> values) {
            addCriterion("EG03BJ20 in", values, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20NotIn(List<String> values) {
            addCriterion("EG03BJ20 not in", values, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20Between(String value1, String value2) {
            addCriterion("EG03BJ20 between", value1, value2, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj20NotBetween(String value1, String value2) {
            addCriterion("EG03BJ20 not between", value1, value2, "eg03bj20");
            return (Criteria) this;
        }

        public Criteria andEg03bj21IsNull() {
            addCriterion("EG03BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj21IsNotNull() {
            addCriterion("EG03BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj21EqualTo(String value) {
            addCriterion("EG03BJ21 =", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21NotEqualTo(String value) {
            addCriterion("EG03BJ21 <>", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21GreaterThan(String value) {
            addCriterion("EG03BJ21 >", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ21 >=", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21LessThan(String value) {
            addCriterion("EG03BJ21 <", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ21 <=", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21Like(String value) {
            addCriterion("EG03BJ21 like", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21NotLike(String value) {
            addCriterion("EG03BJ21 not like", value, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21In(List<String> values) {
            addCriterion("EG03BJ21 in", values, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21NotIn(List<String> values) {
            addCriterion("EG03BJ21 not in", values, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21Between(String value1, String value2) {
            addCriterion("EG03BJ21 between", value1, value2, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj21NotBetween(String value1, String value2) {
            addCriterion("EG03BJ21 not between", value1, value2, "eg03bj21");
            return (Criteria) this;
        }

        public Criteria andEg03bj22IsNull() {
            addCriterion("EG03BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj22IsNotNull() {
            addCriterion("EG03BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj22EqualTo(String value) {
            addCriterion("EG03BJ22 =", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22NotEqualTo(String value) {
            addCriterion("EG03BJ22 <>", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22GreaterThan(String value) {
            addCriterion("EG03BJ22 >", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ22 >=", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22LessThan(String value) {
            addCriterion("EG03BJ22 <", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ22 <=", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22Like(String value) {
            addCriterion("EG03BJ22 like", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22NotLike(String value) {
            addCriterion("EG03BJ22 not like", value, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22In(List<String> values) {
            addCriterion("EG03BJ22 in", values, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22NotIn(List<String> values) {
            addCriterion("EG03BJ22 not in", values, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22Between(String value1, String value2) {
            addCriterion("EG03BJ22 between", value1, value2, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj22NotBetween(String value1, String value2) {
            addCriterion("EG03BJ22 not between", value1, value2, "eg03bj22");
            return (Criteria) this;
        }

        public Criteria andEg03bj23IsNull() {
            addCriterion("EG03BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj23IsNotNull() {
            addCriterion("EG03BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj23EqualTo(String value) {
            addCriterion("EG03BJ23 =", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23NotEqualTo(String value) {
            addCriterion("EG03BJ23 <>", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23GreaterThan(String value) {
            addCriterion("EG03BJ23 >", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ23 >=", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23LessThan(String value) {
            addCriterion("EG03BJ23 <", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ23 <=", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23Like(String value) {
            addCriterion("EG03BJ23 like", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23NotLike(String value) {
            addCriterion("EG03BJ23 not like", value, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23In(List<String> values) {
            addCriterion("EG03BJ23 in", values, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23NotIn(List<String> values) {
            addCriterion("EG03BJ23 not in", values, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23Between(String value1, String value2) {
            addCriterion("EG03BJ23 between", value1, value2, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj23NotBetween(String value1, String value2) {
            addCriterion("EG03BJ23 not between", value1, value2, "eg03bj23");
            return (Criteria) this;
        }

        public Criteria andEg03bj24IsNull() {
            addCriterion("EG03BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj24IsNotNull() {
            addCriterion("EG03BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj24EqualTo(String value) {
            addCriterion("EG03BJ24 =", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24NotEqualTo(String value) {
            addCriterion("EG03BJ24 <>", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24GreaterThan(String value) {
            addCriterion("EG03BJ24 >", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ24 >=", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24LessThan(String value) {
            addCriterion("EG03BJ24 <", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ24 <=", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24Like(String value) {
            addCriterion("EG03BJ24 like", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24NotLike(String value) {
            addCriterion("EG03BJ24 not like", value, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24In(List<String> values) {
            addCriterion("EG03BJ24 in", values, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24NotIn(List<String> values) {
            addCriterion("EG03BJ24 not in", values, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24Between(String value1, String value2) {
            addCriterion("EG03BJ24 between", value1, value2, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj24NotBetween(String value1, String value2) {
            addCriterion("EG03BJ24 not between", value1, value2, "eg03bj24");
            return (Criteria) this;
        }

        public Criteria andEg03bj25IsNull() {
            addCriterion("EG03BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj25IsNotNull() {
            addCriterion("EG03BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj25EqualTo(String value) {
            addCriterion("EG03BJ25 =", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25NotEqualTo(String value) {
            addCriterion("EG03BJ25 <>", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25GreaterThan(String value) {
            addCriterion("EG03BJ25 >", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ25 >=", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25LessThan(String value) {
            addCriterion("EG03BJ25 <", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ25 <=", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25Like(String value) {
            addCriterion("EG03BJ25 like", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25NotLike(String value) {
            addCriterion("EG03BJ25 not like", value, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25In(List<String> values) {
            addCriterion("EG03BJ25 in", values, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25NotIn(List<String> values) {
            addCriterion("EG03BJ25 not in", values, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25Between(String value1, String value2) {
            addCriterion("EG03BJ25 between", value1, value2, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj25NotBetween(String value1, String value2) {
            addCriterion("EG03BJ25 not between", value1, value2, "eg03bj25");
            return (Criteria) this;
        }

        public Criteria andEg03bj26IsNull() {
            addCriterion("EG03BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj26IsNotNull() {
            addCriterion("EG03BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj26EqualTo(String value) {
            addCriterion("EG03BJ26 =", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26NotEqualTo(String value) {
            addCriterion("EG03BJ26 <>", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26GreaterThan(String value) {
            addCriterion("EG03BJ26 >", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ26 >=", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26LessThan(String value) {
            addCriterion("EG03BJ26 <", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ26 <=", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26Like(String value) {
            addCriterion("EG03BJ26 like", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26NotLike(String value) {
            addCriterion("EG03BJ26 not like", value, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26In(List<String> values) {
            addCriterion("EG03BJ26 in", values, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26NotIn(List<String> values) {
            addCriterion("EG03BJ26 not in", values, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26Between(String value1, String value2) {
            addCriterion("EG03BJ26 between", value1, value2, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj26NotBetween(String value1, String value2) {
            addCriterion("EG03BJ26 not between", value1, value2, "eg03bj26");
            return (Criteria) this;
        }

        public Criteria andEg03bj27IsNull() {
            addCriterion("EG03BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj27IsNotNull() {
            addCriterion("EG03BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj27EqualTo(String value) {
            addCriterion("EG03BJ27 =", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27NotEqualTo(String value) {
            addCriterion("EG03BJ27 <>", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27GreaterThan(String value) {
            addCriterion("EG03BJ27 >", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ27 >=", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27LessThan(String value) {
            addCriterion("EG03BJ27 <", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ27 <=", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27Like(String value) {
            addCriterion("EG03BJ27 like", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27NotLike(String value) {
            addCriterion("EG03BJ27 not like", value, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27In(List<String> values) {
            addCriterion("EG03BJ27 in", values, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27NotIn(List<String> values) {
            addCriterion("EG03BJ27 not in", values, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27Between(String value1, String value2) {
            addCriterion("EG03BJ27 between", value1, value2, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj27NotBetween(String value1, String value2) {
            addCriterion("EG03BJ27 not between", value1, value2, "eg03bj27");
            return (Criteria) this;
        }

        public Criteria andEg03bj28IsNull() {
            addCriterion("EG03BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj28IsNotNull() {
            addCriterion("EG03BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj28EqualTo(String value) {
            addCriterion("EG03BJ28 =", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28NotEqualTo(String value) {
            addCriterion("EG03BJ28 <>", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28GreaterThan(String value) {
            addCriterion("EG03BJ28 >", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ28 >=", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28LessThan(String value) {
            addCriterion("EG03BJ28 <", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ28 <=", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28Like(String value) {
            addCriterion("EG03BJ28 like", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28NotLike(String value) {
            addCriterion("EG03BJ28 not like", value, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28In(List<String> values) {
            addCriterion("EG03BJ28 in", values, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28NotIn(List<String> values) {
            addCriterion("EG03BJ28 not in", values, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28Between(String value1, String value2) {
            addCriterion("EG03BJ28 between", value1, value2, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj28NotBetween(String value1, String value2) {
            addCriterion("EG03BJ28 not between", value1, value2, "eg03bj28");
            return (Criteria) this;
        }

        public Criteria andEg03bj29IsNull() {
            addCriterion("EG03BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj29IsNotNull() {
            addCriterion("EG03BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj29EqualTo(String value) {
            addCriterion("EG03BJ29 =", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29NotEqualTo(String value) {
            addCriterion("EG03BJ29 <>", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29GreaterThan(String value) {
            addCriterion("EG03BJ29 >", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ29 >=", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29LessThan(String value) {
            addCriterion("EG03BJ29 <", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ29 <=", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29Like(String value) {
            addCriterion("EG03BJ29 like", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29NotLike(String value) {
            addCriterion("EG03BJ29 not like", value, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29In(List<String> values) {
            addCriterion("EG03BJ29 in", values, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29NotIn(List<String> values) {
            addCriterion("EG03BJ29 not in", values, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29Between(String value1, String value2) {
            addCriterion("EG03BJ29 between", value1, value2, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj29NotBetween(String value1, String value2) {
            addCriterion("EG03BJ29 not between", value1, value2, "eg03bj29");
            return (Criteria) this;
        }

        public Criteria andEg03bj30IsNull() {
            addCriterion("EG03BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj30IsNotNull() {
            addCriterion("EG03BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj30EqualTo(String value) {
            addCriterion("EG03BJ30 =", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30NotEqualTo(String value) {
            addCriterion("EG03BJ30 <>", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30GreaterThan(String value) {
            addCriterion("EG03BJ30 >", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ30 >=", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30LessThan(String value) {
            addCriterion("EG03BJ30 <", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ30 <=", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30Like(String value) {
            addCriterion("EG03BJ30 like", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30NotLike(String value) {
            addCriterion("EG03BJ30 not like", value, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30In(List<String> values) {
            addCriterion("EG03BJ30 in", values, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30NotIn(List<String> values) {
            addCriterion("EG03BJ30 not in", values, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30Between(String value1, String value2) {
            addCriterion("EG03BJ30 between", value1, value2, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj30NotBetween(String value1, String value2) {
            addCriterion("EG03BJ30 not between", value1, value2, "eg03bj30");
            return (Criteria) this;
        }

        public Criteria andEg03bj31IsNull() {
            addCriterion("EG03BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj31IsNotNull() {
            addCriterion("EG03BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj31EqualTo(String value) {
            addCriterion("EG03BJ31 =", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31NotEqualTo(String value) {
            addCriterion("EG03BJ31 <>", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31GreaterThan(String value) {
            addCriterion("EG03BJ31 >", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ31 >=", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31LessThan(String value) {
            addCriterion("EG03BJ31 <", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ31 <=", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31Like(String value) {
            addCriterion("EG03BJ31 like", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31NotLike(String value) {
            addCriterion("EG03BJ31 not like", value, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31In(List<String> values) {
            addCriterion("EG03BJ31 in", values, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31NotIn(List<String> values) {
            addCriterion("EG03BJ31 not in", values, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31Between(String value1, String value2) {
            addCriterion("EG03BJ31 between", value1, value2, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj31NotBetween(String value1, String value2) {
            addCriterion("EG03BJ31 not between", value1, value2, "eg03bj31");
            return (Criteria) this;
        }

        public Criteria andEg03bj32IsNull() {
            addCriterion("EG03BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj32IsNotNull() {
            addCriterion("EG03BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj32EqualTo(String value) {
            addCriterion("EG03BJ32 =", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32NotEqualTo(String value) {
            addCriterion("EG03BJ32 <>", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32GreaterThan(String value) {
            addCriterion("EG03BJ32 >", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ32 >=", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32LessThan(String value) {
            addCriterion("EG03BJ32 <", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ32 <=", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32Like(String value) {
            addCriterion("EG03BJ32 like", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32NotLike(String value) {
            addCriterion("EG03BJ32 not like", value, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32In(List<String> values) {
            addCriterion("EG03BJ32 in", values, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32NotIn(List<String> values) {
            addCriterion("EG03BJ32 not in", values, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32Between(String value1, String value2) {
            addCriterion("EG03BJ32 between", value1, value2, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj32NotBetween(String value1, String value2) {
            addCriterion("EG03BJ32 not between", value1, value2, "eg03bj32");
            return (Criteria) this;
        }

        public Criteria andEg03bj33IsNull() {
            addCriterion("EG03BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj33IsNotNull() {
            addCriterion("EG03BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj33EqualTo(String value) {
            addCriterion("EG03BJ33 =", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33NotEqualTo(String value) {
            addCriterion("EG03BJ33 <>", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33GreaterThan(String value) {
            addCriterion("EG03BJ33 >", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ33 >=", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33LessThan(String value) {
            addCriterion("EG03BJ33 <", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ33 <=", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33Like(String value) {
            addCriterion("EG03BJ33 like", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33NotLike(String value) {
            addCriterion("EG03BJ33 not like", value, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33In(List<String> values) {
            addCriterion("EG03BJ33 in", values, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33NotIn(List<String> values) {
            addCriterion("EG03BJ33 not in", values, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33Between(String value1, String value2) {
            addCriterion("EG03BJ33 between", value1, value2, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj33NotBetween(String value1, String value2) {
            addCriterion("EG03BJ33 not between", value1, value2, "eg03bj33");
            return (Criteria) this;
        }

        public Criteria andEg03bj34IsNull() {
            addCriterion("EG03BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj34IsNotNull() {
            addCriterion("EG03BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj34EqualTo(String value) {
            addCriterion("EG03BJ34 =", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34NotEqualTo(String value) {
            addCriterion("EG03BJ34 <>", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34GreaterThan(String value) {
            addCriterion("EG03BJ34 >", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ34 >=", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34LessThan(String value) {
            addCriterion("EG03BJ34 <", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ34 <=", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34Like(String value) {
            addCriterion("EG03BJ34 like", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34NotLike(String value) {
            addCriterion("EG03BJ34 not like", value, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34In(List<String> values) {
            addCriterion("EG03BJ34 in", values, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34NotIn(List<String> values) {
            addCriterion("EG03BJ34 not in", values, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34Between(String value1, String value2) {
            addCriterion("EG03BJ34 between", value1, value2, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj34NotBetween(String value1, String value2) {
            addCriterion("EG03BJ34 not between", value1, value2, "eg03bj34");
            return (Criteria) this;
        }

        public Criteria andEg03bj35IsNull() {
            addCriterion("EG03BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj35IsNotNull() {
            addCriterion("EG03BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj35EqualTo(String value) {
            addCriterion("EG03BJ35 =", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35NotEqualTo(String value) {
            addCriterion("EG03BJ35 <>", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35GreaterThan(String value) {
            addCriterion("EG03BJ35 >", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ35 >=", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35LessThan(String value) {
            addCriterion("EG03BJ35 <", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ35 <=", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35Like(String value) {
            addCriterion("EG03BJ35 like", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35NotLike(String value) {
            addCriterion("EG03BJ35 not like", value, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35In(List<String> values) {
            addCriterion("EG03BJ35 in", values, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35NotIn(List<String> values) {
            addCriterion("EG03BJ35 not in", values, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35Between(String value1, String value2) {
            addCriterion("EG03BJ35 between", value1, value2, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj35NotBetween(String value1, String value2) {
            addCriterion("EG03BJ35 not between", value1, value2, "eg03bj35");
            return (Criteria) this;
        }

        public Criteria andEg03bj36IsNull() {
            addCriterion("EG03BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj36IsNotNull() {
            addCriterion("EG03BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj36EqualTo(String value) {
            addCriterion("EG03BJ36 =", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36NotEqualTo(String value) {
            addCriterion("EG03BJ36 <>", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36GreaterThan(String value) {
            addCriterion("EG03BJ36 >", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ36 >=", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36LessThan(String value) {
            addCriterion("EG03BJ36 <", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ36 <=", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36Like(String value) {
            addCriterion("EG03BJ36 like", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36NotLike(String value) {
            addCriterion("EG03BJ36 not like", value, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36In(List<String> values) {
            addCriterion("EG03BJ36 in", values, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36NotIn(List<String> values) {
            addCriterion("EG03BJ36 not in", values, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36Between(String value1, String value2) {
            addCriterion("EG03BJ36 between", value1, value2, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj36NotBetween(String value1, String value2) {
            addCriterion("EG03BJ36 not between", value1, value2, "eg03bj36");
            return (Criteria) this;
        }

        public Criteria andEg03bj37IsNull() {
            addCriterion("EG03BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj37IsNotNull() {
            addCriterion("EG03BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj37EqualTo(String value) {
            addCriterion("EG03BJ37 =", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37NotEqualTo(String value) {
            addCriterion("EG03BJ37 <>", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37GreaterThan(String value) {
            addCriterion("EG03BJ37 >", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ37 >=", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37LessThan(String value) {
            addCriterion("EG03BJ37 <", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ37 <=", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37Like(String value) {
            addCriterion("EG03BJ37 like", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37NotLike(String value) {
            addCriterion("EG03BJ37 not like", value, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37In(List<String> values) {
            addCriterion("EG03BJ37 in", values, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37NotIn(List<String> values) {
            addCriterion("EG03BJ37 not in", values, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37Between(String value1, String value2) {
            addCriterion("EG03BJ37 between", value1, value2, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj37NotBetween(String value1, String value2) {
            addCriterion("EG03BJ37 not between", value1, value2, "eg03bj37");
            return (Criteria) this;
        }

        public Criteria andEg03bj38IsNull() {
            addCriterion("EG03BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj38IsNotNull() {
            addCriterion("EG03BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj38EqualTo(String value) {
            addCriterion("EG03BJ38 =", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38NotEqualTo(String value) {
            addCriterion("EG03BJ38 <>", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38GreaterThan(String value) {
            addCriterion("EG03BJ38 >", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ38 >=", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38LessThan(String value) {
            addCriterion("EG03BJ38 <", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ38 <=", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38Like(String value) {
            addCriterion("EG03BJ38 like", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38NotLike(String value) {
            addCriterion("EG03BJ38 not like", value, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38In(List<String> values) {
            addCriterion("EG03BJ38 in", values, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38NotIn(List<String> values) {
            addCriterion("EG03BJ38 not in", values, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38Between(String value1, String value2) {
            addCriterion("EG03BJ38 between", value1, value2, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj38NotBetween(String value1, String value2) {
            addCriterion("EG03BJ38 not between", value1, value2, "eg03bj38");
            return (Criteria) this;
        }

        public Criteria andEg03bj39IsNull() {
            addCriterion("EG03BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj39IsNotNull() {
            addCriterion("EG03BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj39EqualTo(String value) {
            addCriterion("EG03BJ39 =", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39NotEqualTo(String value) {
            addCriterion("EG03BJ39 <>", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39GreaterThan(String value) {
            addCriterion("EG03BJ39 >", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ39 >=", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39LessThan(String value) {
            addCriterion("EG03BJ39 <", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ39 <=", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39Like(String value) {
            addCriterion("EG03BJ39 like", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39NotLike(String value) {
            addCriterion("EG03BJ39 not like", value, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39In(List<String> values) {
            addCriterion("EG03BJ39 in", values, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39NotIn(List<String> values) {
            addCriterion("EG03BJ39 not in", values, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39Between(String value1, String value2) {
            addCriterion("EG03BJ39 between", value1, value2, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj39NotBetween(String value1, String value2) {
            addCriterion("EG03BJ39 not between", value1, value2, "eg03bj39");
            return (Criteria) this;
        }

        public Criteria andEg03bj40IsNull() {
            addCriterion("EG03BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj40IsNotNull() {
            addCriterion("EG03BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj40EqualTo(String value) {
            addCriterion("EG03BJ40 =", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40NotEqualTo(String value) {
            addCriterion("EG03BJ40 <>", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40GreaterThan(String value) {
            addCriterion("EG03BJ40 >", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ40 >=", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40LessThan(String value) {
            addCriterion("EG03BJ40 <", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ40 <=", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40Like(String value) {
            addCriterion("EG03BJ40 like", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40NotLike(String value) {
            addCriterion("EG03BJ40 not like", value, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40In(List<String> values) {
            addCriterion("EG03BJ40 in", values, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40NotIn(List<String> values) {
            addCriterion("EG03BJ40 not in", values, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40Between(String value1, String value2) {
            addCriterion("EG03BJ40 between", value1, value2, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj40NotBetween(String value1, String value2) {
            addCriterion("EG03BJ40 not between", value1, value2, "eg03bj40");
            return (Criteria) this;
        }

        public Criteria andEg03bj41IsNull() {
            addCriterion("EG03BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj41IsNotNull() {
            addCriterion("EG03BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj41EqualTo(String value) {
            addCriterion("EG03BJ41 =", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41NotEqualTo(String value) {
            addCriterion("EG03BJ41 <>", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41GreaterThan(String value) {
            addCriterion("EG03BJ41 >", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ41 >=", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41LessThan(String value) {
            addCriterion("EG03BJ41 <", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ41 <=", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41Like(String value) {
            addCriterion("EG03BJ41 like", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41NotLike(String value) {
            addCriterion("EG03BJ41 not like", value, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41In(List<String> values) {
            addCriterion("EG03BJ41 in", values, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41NotIn(List<String> values) {
            addCriterion("EG03BJ41 not in", values, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41Between(String value1, String value2) {
            addCriterion("EG03BJ41 between", value1, value2, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj41NotBetween(String value1, String value2) {
            addCriterion("EG03BJ41 not between", value1, value2, "eg03bj41");
            return (Criteria) this;
        }

        public Criteria andEg03bj42IsNull() {
            addCriterion("EG03BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj42IsNotNull() {
            addCriterion("EG03BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj42EqualTo(String value) {
            addCriterion("EG03BJ42 =", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42NotEqualTo(String value) {
            addCriterion("EG03BJ42 <>", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42GreaterThan(String value) {
            addCriterion("EG03BJ42 >", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ42 >=", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42LessThan(String value) {
            addCriterion("EG03BJ42 <", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ42 <=", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42Like(String value) {
            addCriterion("EG03BJ42 like", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42NotLike(String value) {
            addCriterion("EG03BJ42 not like", value, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42In(List<String> values) {
            addCriterion("EG03BJ42 in", values, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42NotIn(List<String> values) {
            addCriterion("EG03BJ42 not in", values, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42Between(String value1, String value2) {
            addCriterion("EG03BJ42 between", value1, value2, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj42NotBetween(String value1, String value2) {
            addCriterion("EG03BJ42 not between", value1, value2, "eg03bj42");
            return (Criteria) this;
        }

        public Criteria andEg03bj43IsNull() {
            addCriterion("EG03BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj43IsNotNull() {
            addCriterion("EG03BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj43EqualTo(String value) {
            addCriterion("EG03BJ43 =", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43NotEqualTo(String value) {
            addCriterion("EG03BJ43 <>", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43GreaterThan(String value) {
            addCriterion("EG03BJ43 >", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ43 >=", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43LessThan(String value) {
            addCriterion("EG03BJ43 <", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ43 <=", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43Like(String value) {
            addCriterion("EG03BJ43 like", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43NotLike(String value) {
            addCriterion("EG03BJ43 not like", value, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43In(List<String> values) {
            addCriterion("EG03BJ43 in", values, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43NotIn(List<String> values) {
            addCriterion("EG03BJ43 not in", values, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43Between(String value1, String value2) {
            addCriterion("EG03BJ43 between", value1, value2, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj43NotBetween(String value1, String value2) {
            addCriterion("EG03BJ43 not between", value1, value2, "eg03bj43");
            return (Criteria) this;
        }

        public Criteria andEg03bj44IsNull() {
            addCriterion("EG03BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj44IsNotNull() {
            addCriterion("EG03BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj44EqualTo(String value) {
            addCriterion("EG03BJ44 =", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44NotEqualTo(String value) {
            addCriterion("EG03BJ44 <>", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44GreaterThan(String value) {
            addCriterion("EG03BJ44 >", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ44 >=", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44LessThan(String value) {
            addCriterion("EG03BJ44 <", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ44 <=", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44Like(String value) {
            addCriterion("EG03BJ44 like", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44NotLike(String value) {
            addCriterion("EG03BJ44 not like", value, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44In(List<String> values) {
            addCriterion("EG03BJ44 in", values, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44NotIn(List<String> values) {
            addCriterion("EG03BJ44 not in", values, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44Between(String value1, String value2) {
            addCriterion("EG03BJ44 between", value1, value2, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj44NotBetween(String value1, String value2) {
            addCriterion("EG03BJ44 not between", value1, value2, "eg03bj44");
            return (Criteria) this;
        }

        public Criteria andEg03bj45IsNull() {
            addCriterion("EG03BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj45IsNotNull() {
            addCriterion("EG03BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj45EqualTo(String value) {
            addCriterion("EG03BJ45 =", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45NotEqualTo(String value) {
            addCriterion("EG03BJ45 <>", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45GreaterThan(String value) {
            addCriterion("EG03BJ45 >", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ45 >=", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45LessThan(String value) {
            addCriterion("EG03BJ45 <", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ45 <=", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45Like(String value) {
            addCriterion("EG03BJ45 like", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45NotLike(String value) {
            addCriterion("EG03BJ45 not like", value, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45In(List<String> values) {
            addCriterion("EG03BJ45 in", values, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45NotIn(List<String> values) {
            addCriterion("EG03BJ45 not in", values, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45Between(String value1, String value2) {
            addCriterion("EG03BJ45 between", value1, value2, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj45NotBetween(String value1, String value2) {
            addCriterion("EG03BJ45 not between", value1, value2, "eg03bj45");
            return (Criteria) this;
        }

        public Criteria andEg03bj46IsNull() {
            addCriterion("EG03BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj46IsNotNull() {
            addCriterion("EG03BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj46EqualTo(String value) {
            addCriterion("EG03BJ46 =", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46NotEqualTo(String value) {
            addCriterion("EG03BJ46 <>", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46GreaterThan(String value) {
            addCriterion("EG03BJ46 >", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ46 >=", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46LessThan(String value) {
            addCriterion("EG03BJ46 <", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ46 <=", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46Like(String value) {
            addCriterion("EG03BJ46 like", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46NotLike(String value) {
            addCriterion("EG03BJ46 not like", value, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46In(List<String> values) {
            addCriterion("EG03BJ46 in", values, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46NotIn(List<String> values) {
            addCriterion("EG03BJ46 not in", values, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46Between(String value1, String value2) {
            addCriterion("EG03BJ46 between", value1, value2, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj46NotBetween(String value1, String value2) {
            addCriterion("EG03BJ46 not between", value1, value2, "eg03bj46");
            return (Criteria) this;
        }

        public Criteria andEg03bj47IsNull() {
            addCriterion("EG03BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj47IsNotNull() {
            addCriterion("EG03BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj47EqualTo(String value) {
            addCriterion("EG03BJ47 =", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47NotEqualTo(String value) {
            addCriterion("EG03BJ47 <>", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47GreaterThan(String value) {
            addCriterion("EG03BJ47 >", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ47 >=", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47LessThan(String value) {
            addCriterion("EG03BJ47 <", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ47 <=", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47Like(String value) {
            addCriterion("EG03BJ47 like", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47NotLike(String value) {
            addCriterion("EG03BJ47 not like", value, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47In(List<String> values) {
            addCriterion("EG03BJ47 in", values, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47NotIn(List<String> values) {
            addCriterion("EG03BJ47 not in", values, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47Between(String value1, String value2) {
            addCriterion("EG03BJ47 between", value1, value2, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj47NotBetween(String value1, String value2) {
            addCriterion("EG03BJ47 not between", value1, value2, "eg03bj47");
            return (Criteria) this;
        }

        public Criteria andEg03bj48IsNull() {
            addCriterion("EG03BJ48 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj48IsNotNull() {
            addCriterion("EG03BJ48 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj48EqualTo(String value) {
            addCriterion("EG03BJ48 =", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48NotEqualTo(String value) {
            addCriterion("EG03BJ48 <>", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48GreaterThan(String value) {
            addCriterion("EG03BJ48 >", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ48 >=", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48LessThan(String value) {
            addCriterion("EG03BJ48 <", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ48 <=", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48Like(String value) {
            addCriterion("EG03BJ48 like", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48NotLike(String value) {
            addCriterion("EG03BJ48 not like", value, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48In(List<String> values) {
            addCriterion("EG03BJ48 in", values, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48NotIn(List<String> values) {
            addCriterion("EG03BJ48 not in", values, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48Between(String value1, String value2) {
            addCriterion("EG03BJ48 between", value1, value2, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj48NotBetween(String value1, String value2) {
            addCriterion("EG03BJ48 not between", value1, value2, "eg03bj48");
            return (Criteria) this;
        }

        public Criteria andEg03bj49IsNull() {
            addCriterion("EG03BJ49 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj49IsNotNull() {
            addCriterion("EG03BJ49 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj49EqualTo(String value) {
            addCriterion("EG03BJ49 =", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49NotEqualTo(String value) {
            addCriterion("EG03BJ49 <>", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49GreaterThan(String value) {
            addCriterion("EG03BJ49 >", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ49 >=", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49LessThan(String value) {
            addCriterion("EG03BJ49 <", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ49 <=", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49Like(String value) {
            addCriterion("EG03BJ49 like", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49NotLike(String value) {
            addCriterion("EG03BJ49 not like", value, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49In(List<String> values) {
            addCriterion("EG03BJ49 in", values, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49NotIn(List<String> values) {
            addCriterion("EG03BJ49 not in", values, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49Between(String value1, String value2) {
            addCriterion("EG03BJ49 between", value1, value2, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj49NotBetween(String value1, String value2) {
            addCriterion("EG03BJ49 not between", value1, value2, "eg03bj49");
            return (Criteria) this;
        }

        public Criteria andEg03bj50IsNull() {
            addCriterion("EG03BJ50 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj50IsNotNull() {
            addCriterion("EG03BJ50 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj50EqualTo(String value) {
            addCriterion("EG03BJ50 =", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50NotEqualTo(String value) {
            addCriterion("EG03BJ50 <>", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50GreaterThan(String value) {
            addCriterion("EG03BJ50 >", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ50 >=", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50LessThan(String value) {
            addCriterion("EG03BJ50 <", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ50 <=", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50Like(String value) {
            addCriterion("EG03BJ50 like", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50NotLike(String value) {
            addCriterion("EG03BJ50 not like", value, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50In(List<String> values) {
            addCriterion("EG03BJ50 in", values, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50NotIn(List<String> values) {
            addCriterion("EG03BJ50 not in", values, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50Between(String value1, String value2) {
            addCriterion("EG03BJ50 between", value1, value2, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj50NotBetween(String value1, String value2) {
            addCriterion("EG03BJ50 not between", value1, value2, "eg03bj50");
            return (Criteria) this;
        }

        public Criteria andEg03bj51IsNull() {
            addCriterion("EG03BJ51 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj51IsNotNull() {
            addCriterion("EG03BJ51 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj51EqualTo(String value) {
            addCriterion("EG03BJ51 =", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51NotEqualTo(String value) {
            addCriterion("EG03BJ51 <>", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51GreaterThan(String value) {
            addCriterion("EG03BJ51 >", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ51 >=", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51LessThan(String value) {
            addCriterion("EG03BJ51 <", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ51 <=", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51Like(String value) {
            addCriterion("EG03BJ51 like", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51NotLike(String value) {
            addCriterion("EG03BJ51 not like", value, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51In(List<String> values) {
            addCriterion("EG03BJ51 in", values, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51NotIn(List<String> values) {
            addCriterion("EG03BJ51 not in", values, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51Between(String value1, String value2) {
            addCriterion("EG03BJ51 between", value1, value2, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj51NotBetween(String value1, String value2) {
            addCriterion("EG03BJ51 not between", value1, value2, "eg03bj51");
            return (Criteria) this;
        }

        public Criteria andEg03bj52IsNull() {
            addCriterion("EG03BJ52 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj52IsNotNull() {
            addCriterion("EG03BJ52 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj52EqualTo(String value) {
            addCriterion("EG03BJ52 =", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52NotEqualTo(String value) {
            addCriterion("EG03BJ52 <>", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52GreaterThan(String value) {
            addCriterion("EG03BJ52 >", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ52 >=", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52LessThan(String value) {
            addCriterion("EG03BJ52 <", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ52 <=", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52Like(String value) {
            addCriterion("EG03BJ52 like", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52NotLike(String value) {
            addCriterion("EG03BJ52 not like", value, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52In(List<String> values) {
            addCriterion("EG03BJ52 in", values, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52NotIn(List<String> values) {
            addCriterion("EG03BJ52 not in", values, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52Between(String value1, String value2) {
            addCriterion("EG03BJ52 between", value1, value2, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj52NotBetween(String value1, String value2) {
            addCriterion("EG03BJ52 not between", value1, value2, "eg03bj52");
            return (Criteria) this;
        }

        public Criteria andEg03bj53IsNull() {
            addCriterion("EG03BJ53 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj53IsNotNull() {
            addCriterion("EG03BJ53 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj53EqualTo(String value) {
            addCriterion("EG03BJ53 =", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53NotEqualTo(String value) {
            addCriterion("EG03BJ53 <>", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53GreaterThan(String value) {
            addCriterion("EG03BJ53 >", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ53 >=", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53LessThan(String value) {
            addCriterion("EG03BJ53 <", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ53 <=", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53Like(String value) {
            addCriterion("EG03BJ53 like", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53NotLike(String value) {
            addCriterion("EG03BJ53 not like", value, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53In(List<String> values) {
            addCriterion("EG03BJ53 in", values, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53NotIn(List<String> values) {
            addCriterion("EG03BJ53 not in", values, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53Between(String value1, String value2) {
            addCriterion("EG03BJ53 between", value1, value2, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj53NotBetween(String value1, String value2) {
            addCriterion("EG03BJ53 not between", value1, value2, "eg03bj53");
            return (Criteria) this;
        }

        public Criteria andEg03bj54IsNull() {
            addCriterion("EG03BJ54 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj54IsNotNull() {
            addCriterion("EG03BJ54 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj54EqualTo(String value) {
            addCriterion("EG03BJ54 =", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54NotEqualTo(String value) {
            addCriterion("EG03BJ54 <>", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54GreaterThan(String value) {
            addCriterion("EG03BJ54 >", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ54 >=", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54LessThan(String value) {
            addCriterion("EG03BJ54 <", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ54 <=", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54Like(String value) {
            addCriterion("EG03BJ54 like", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54NotLike(String value) {
            addCriterion("EG03BJ54 not like", value, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54In(List<String> values) {
            addCriterion("EG03BJ54 in", values, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54NotIn(List<String> values) {
            addCriterion("EG03BJ54 not in", values, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54Between(String value1, String value2) {
            addCriterion("EG03BJ54 between", value1, value2, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj54NotBetween(String value1, String value2) {
            addCriterion("EG03BJ54 not between", value1, value2, "eg03bj54");
            return (Criteria) this;
        }

        public Criteria andEg03bj55IsNull() {
            addCriterion("EG03BJ55 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj55IsNotNull() {
            addCriterion("EG03BJ55 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj55EqualTo(String value) {
            addCriterion("EG03BJ55 =", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55NotEqualTo(String value) {
            addCriterion("EG03BJ55 <>", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55GreaterThan(String value) {
            addCriterion("EG03BJ55 >", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ55 >=", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55LessThan(String value) {
            addCriterion("EG03BJ55 <", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ55 <=", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55Like(String value) {
            addCriterion("EG03BJ55 like", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55NotLike(String value) {
            addCriterion("EG03BJ55 not like", value, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55In(List<String> values) {
            addCriterion("EG03BJ55 in", values, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55NotIn(List<String> values) {
            addCriterion("EG03BJ55 not in", values, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55Between(String value1, String value2) {
            addCriterion("EG03BJ55 between", value1, value2, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj55NotBetween(String value1, String value2) {
            addCriterion("EG03BJ55 not between", value1, value2, "eg03bj55");
            return (Criteria) this;
        }

        public Criteria andEg03bj56IsNull() {
            addCriterion("EG03BJ56 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj56IsNotNull() {
            addCriterion("EG03BJ56 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj56EqualTo(String value) {
            addCriterion("EG03BJ56 =", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56NotEqualTo(String value) {
            addCriterion("EG03BJ56 <>", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56GreaterThan(String value) {
            addCriterion("EG03BJ56 >", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ56 >=", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56LessThan(String value) {
            addCriterion("EG03BJ56 <", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ56 <=", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56Like(String value) {
            addCriterion("EG03BJ56 like", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56NotLike(String value) {
            addCriterion("EG03BJ56 not like", value, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56In(List<String> values) {
            addCriterion("EG03BJ56 in", values, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56NotIn(List<String> values) {
            addCriterion("EG03BJ56 not in", values, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56Between(String value1, String value2) {
            addCriterion("EG03BJ56 between", value1, value2, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj56NotBetween(String value1, String value2) {
            addCriterion("EG03BJ56 not between", value1, value2, "eg03bj56");
            return (Criteria) this;
        }

        public Criteria andEg03bj57IsNull() {
            addCriterion("EG03BJ57 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj57IsNotNull() {
            addCriterion("EG03BJ57 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj57EqualTo(String value) {
            addCriterion("EG03BJ57 =", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57NotEqualTo(String value) {
            addCriterion("EG03BJ57 <>", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57GreaterThan(String value) {
            addCriterion("EG03BJ57 >", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ57 >=", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57LessThan(String value) {
            addCriterion("EG03BJ57 <", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ57 <=", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57Like(String value) {
            addCriterion("EG03BJ57 like", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57NotLike(String value) {
            addCriterion("EG03BJ57 not like", value, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57In(List<String> values) {
            addCriterion("EG03BJ57 in", values, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57NotIn(List<String> values) {
            addCriterion("EG03BJ57 not in", values, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57Between(String value1, String value2) {
            addCriterion("EG03BJ57 between", value1, value2, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj57NotBetween(String value1, String value2) {
            addCriterion("EG03BJ57 not between", value1, value2, "eg03bj57");
            return (Criteria) this;
        }

        public Criteria andEg03bj58IsNull() {
            addCriterion("EG03BJ58 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj58IsNotNull() {
            addCriterion("EG03BJ58 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj58EqualTo(String value) {
            addCriterion("EG03BJ58 =", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58NotEqualTo(String value) {
            addCriterion("EG03BJ58 <>", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58GreaterThan(String value) {
            addCriterion("EG03BJ58 >", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ58 >=", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58LessThan(String value) {
            addCriterion("EG03BJ58 <", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ58 <=", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58Like(String value) {
            addCriterion("EG03BJ58 like", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58NotLike(String value) {
            addCriterion("EG03BJ58 not like", value, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58In(List<String> values) {
            addCriterion("EG03BJ58 in", values, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58NotIn(List<String> values) {
            addCriterion("EG03BJ58 not in", values, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58Between(String value1, String value2) {
            addCriterion("EG03BJ58 between", value1, value2, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj58NotBetween(String value1, String value2) {
            addCriterion("EG03BJ58 not between", value1, value2, "eg03bj58");
            return (Criteria) this;
        }

        public Criteria andEg03bj59IsNull() {
            addCriterion("EG03BJ59 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj59IsNotNull() {
            addCriterion("EG03BJ59 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj59EqualTo(String value) {
            addCriterion("EG03BJ59 =", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59NotEqualTo(String value) {
            addCriterion("EG03BJ59 <>", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59GreaterThan(String value) {
            addCriterion("EG03BJ59 >", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ59 >=", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59LessThan(String value) {
            addCriterion("EG03BJ59 <", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ59 <=", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59Like(String value) {
            addCriterion("EG03BJ59 like", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59NotLike(String value) {
            addCriterion("EG03BJ59 not like", value, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59In(List<String> values) {
            addCriterion("EG03BJ59 in", values, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59NotIn(List<String> values) {
            addCriterion("EG03BJ59 not in", values, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59Between(String value1, String value2) {
            addCriterion("EG03BJ59 between", value1, value2, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj59NotBetween(String value1, String value2) {
            addCriterion("EG03BJ59 not between", value1, value2, "eg03bj59");
            return (Criteria) this;
        }

        public Criteria andEg03bj60IsNull() {
            addCriterion("EG03BJ60 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj60IsNotNull() {
            addCriterion("EG03BJ60 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj60EqualTo(String value) {
            addCriterion("EG03BJ60 =", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60NotEqualTo(String value) {
            addCriterion("EG03BJ60 <>", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60GreaterThan(String value) {
            addCriterion("EG03BJ60 >", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ60 >=", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60LessThan(String value) {
            addCriterion("EG03BJ60 <", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ60 <=", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60Like(String value) {
            addCriterion("EG03BJ60 like", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60NotLike(String value) {
            addCriterion("EG03BJ60 not like", value, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60In(List<String> values) {
            addCriterion("EG03BJ60 in", values, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60NotIn(List<String> values) {
            addCriterion("EG03BJ60 not in", values, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60Between(String value1, String value2) {
            addCriterion("EG03BJ60 between", value1, value2, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj60NotBetween(String value1, String value2) {
            addCriterion("EG03BJ60 not between", value1, value2, "eg03bj60");
            return (Criteria) this;
        }

        public Criteria andEg03bj61IsNull() {
            addCriterion("EG03BJ61 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj61IsNotNull() {
            addCriterion("EG03BJ61 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj61EqualTo(String value) {
            addCriterion("EG03BJ61 =", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61NotEqualTo(String value) {
            addCriterion("EG03BJ61 <>", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61GreaterThan(String value) {
            addCriterion("EG03BJ61 >", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ61 >=", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61LessThan(String value) {
            addCriterion("EG03BJ61 <", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ61 <=", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61Like(String value) {
            addCriterion("EG03BJ61 like", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61NotLike(String value) {
            addCriterion("EG03BJ61 not like", value, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61In(List<String> values) {
            addCriterion("EG03BJ61 in", values, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61NotIn(List<String> values) {
            addCriterion("EG03BJ61 not in", values, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61Between(String value1, String value2) {
            addCriterion("EG03BJ61 between", value1, value2, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj61NotBetween(String value1, String value2) {
            addCriterion("EG03BJ61 not between", value1, value2, "eg03bj61");
            return (Criteria) this;
        }

        public Criteria andEg03bj62IsNull() {
            addCriterion("EG03BJ62 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj62IsNotNull() {
            addCriterion("EG03BJ62 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj62EqualTo(String value) {
            addCriterion("EG03BJ62 =", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62NotEqualTo(String value) {
            addCriterion("EG03BJ62 <>", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62GreaterThan(String value) {
            addCriterion("EG03BJ62 >", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ62 >=", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62LessThan(String value) {
            addCriterion("EG03BJ62 <", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ62 <=", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62Like(String value) {
            addCriterion("EG03BJ62 like", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62NotLike(String value) {
            addCriterion("EG03BJ62 not like", value, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62In(List<String> values) {
            addCriterion("EG03BJ62 in", values, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62NotIn(List<String> values) {
            addCriterion("EG03BJ62 not in", values, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62Between(String value1, String value2) {
            addCriterion("EG03BJ62 between", value1, value2, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj62NotBetween(String value1, String value2) {
            addCriterion("EG03BJ62 not between", value1, value2, "eg03bj62");
            return (Criteria) this;
        }

        public Criteria andEg03bj63IsNull() {
            addCriterion("EG03BJ63 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj63IsNotNull() {
            addCriterion("EG03BJ63 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj63EqualTo(String value) {
            addCriterion("EG03BJ63 =", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63NotEqualTo(String value) {
            addCriterion("EG03BJ63 <>", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63GreaterThan(String value) {
            addCriterion("EG03BJ63 >", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ63 >=", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63LessThan(String value) {
            addCriterion("EG03BJ63 <", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ63 <=", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63Like(String value) {
            addCriterion("EG03BJ63 like", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63NotLike(String value) {
            addCriterion("EG03BJ63 not like", value, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63In(List<String> values) {
            addCriterion("EG03BJ63 in", values, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63NotIn(List<String> values) {
            addCriterion("EG03BJ63 not in", values, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63Between(String value1, String value2) {
            addCriterion("EG03BJ63 between", value1, value2, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj63NotBetween(String value1, String value2) {
            addCriterion("EG03BJ63 not between", value1, value2, "eg03bj63");
            return (Criteria) this;
        }

        public Criteria andEg03bj64IsNull() {
            addCriterion("EG03BJ64 is null");
            return (Criteria) this;
        }

        public Criteria andEg03bj64IsNotNull() {
            addCriterion("EG03BJ64 is not null");
            return (Criteria) this;
        }

        public Criteria andEg03bj64EqualTo(String value) {
            addCriterion("EG03BJ64 =", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64NotEqualTo(String value) {
            addCriterion("EG03BJ64 <>", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64GreaterThan(String value) {
            addCriterion("EG03BJ64 >", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64GreaterThanOrEqualTo(String value) {
            addCriterion("EG03BJ64 >=", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64LessThan(String value) {
            addCriterion("EG03BJ64 <", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64LessThanOrEqualTo(String value) {
            addCriterion("EG03BJ64 <=", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64Like(String value) {
            addCriterion("EG03BJ64 like", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64NotLike(String value) {
            addCriterion("EG03BJ64 not like", value, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64In(List<String> values) {
            addCriterion("EG03BJ64 in", values, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64NotIn(List<String> values) {
            addCriterion("EG03BJ64 not in", values, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64Between(String value1, String value2) {
            addCriterion("EG03BJ64 between", value1, value2, "eg03bj64");
            return (Criteria) this;
        }

        public Criteria andEg03bj64NotBetween(String value1, String value2) {
            addCriterion("EG03BJ64 not between", value1, value2, "eg03bj64");
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