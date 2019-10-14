package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntprofit07Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntprofit07Example() {
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

        public Criteria andEg04bj01IsNull() {
            addCriterion("EG04BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj01IsNotNull() {
            addCriterion("EG04BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj01EqualTo(String value) {
            addCriterion("EG04BJ01 =", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01NotEqualTo(String value) {
            addCriterion("EG04BJ01 <>", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01GreaterThan(String value) {
            addCriterion("EG04BJ01 >", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ01 >=", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01LessThan(String value) {
            addCriterion("EG04BJ01 <", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ01 <=", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01Like(String value) {
            addCriterion("EG04BJ01 like", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01NotLike(String value) {
            addCriterion("EG04BJ01 not like", value, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01In(List<String> values) {
            addCriterion("EG04BJ01 in", values, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01NotIn(List<String> values) {
            addCriterion("EG04BJ01 not in", values, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01Between(String value1, String value2) {
            addCriterion("EG04BJ01 between", value1, value2, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj01NotBetween(String value1, String value2) {
            addCriterion("EG04BJ01 not between", value1, value2, "eg04bj01");
            return (Criteria) this;
        }

        public Criteria andEg04bj02IsNull() {
            addCriterion("EG04BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj02IsNotNull() {
            addCriterion("EG04BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj02EqualTo(String value) {
            addCriterion("EG04BJ02 =", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02NotEqualTo(String value) {
            addCriterion("EG04BJ02 <>", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02GreaterThan(String value) {
            addCriterion("EG04BJ02 >", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ02 >=", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02LessThan(String value) {
            addCriterion("EG04BJ02 <", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ02 <=", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02Like(String value) {
            addCriterion("EG04BJ02 like", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02NotLike(String value) {
            addCriterion("EG04BJ02 not like", value, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02In(List<String> values) {
            addCriterion("EG04BJ02 in", values, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02NotIn(List<String> values) {
            addCriterion("EG04BJ02 not in", values, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02Between(String value1, String value2) {
            addCriterion("EG04BJ02 between", value1, value2, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj02NotBetween(String value1, String value2) {
            addCriterion("EG04BJ02 not between", value1, value2, "eg04bj02");
            return (Criteria) this;
        }

        public Criteria andEg04bj03IsNull() {
            addCriterion("EG04BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj03IsNotNull() {
            addCriterion("EG04BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj03EqualTo(String value) {
            addCriterion("EG04BJ03 =", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03NotEqualTo(String value) {
            addCriterion("EG04BJ03 <>", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03GreaterThan(String value) {
            addCriterion("EG04BJ03 >", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ03 >=", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03LessThan(String value) {
            addCriterion("EG04BJ03 <", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ03 <=", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03Like(String value) {
            addCriterion("EG04BJ03 like", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03NotLike(String value) {
            addCriterion("EG04BJ03 not like", value, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03In(List<String> values) {
            addCriterion("EG04BJ03 in", values, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03NotIn(List<String> values) {
            addCriterion("EG04BJ03 not in", values, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03Between(String value1, String value2) {
            addCriterion("EG04BJ03 between", value1, value2, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj03NotBetween(String value1, String value2) {
            addCriterion("EG04BJ03 not between", value1, value2, "eg04bj03");
            return (Criteria) this;
        }

        public Criteria andEg04bj04IsNull() {
            addCriterion("EG04BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj04IsNotNull() {
            addCriterion("EG04BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj04EqualTo(String value) {
            addCriterion("EG04BJ04 =", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04NotEqualTo(String value) {
            addCriterion("EG04BJ04 <>", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04GreaterThan(String value) {
            addCriterion("EG04BJ04 >", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ04 >=", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04LessThan(String value) {
            addCriterion("EG04BJ04 <", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ04 <=", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04Like(String value) {
            addCriterion("EG04BJ04 like", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04NotLike(String value) {
            addCriterion("EG04BJ04 not like", value, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04In(List<String> values) {
            addCriterion("EG04BJ04 in", values, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04NotIn(List<String> values) {
            addCriterion("EG04BJ04 not in", values, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04Between(String value1, String value2) {
            addCriterion("EG04BJ04 between", value1, value2, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj04NotBetween(String value1, String value2) {
            addCriterion("EG04BJ04 not between", value1, value2, "eg04bj04");
            return (Criteria) this;
        }

        public Criteria andEg04bj05IsNull() {
            addCriterion("EG04BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj05IsNotNull() {
            addCriterion("EG04BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj05EqualTo(String value) {
            addCriterion("EG04BJ05 =", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05NotEqualTo(String value) {
            addCriterion("EG04BJ05 <>", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05GreaterThan(String value) {
            addCriterion("EG04BJ05 >", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ05 >=", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05LessThan(String value) {
            addCriterion("EG04BJ05 <", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ05 <=", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05Like(String value) {
            addCriterion("EG04BJ05 like", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05NotLike(String value) {
            addCriterion("EG04BJ05 not like", value, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05In(List<String> values) {
            addCriterion("EG04BJ05 in", values, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05NotIn(List<String> values) {
            addCriterion("EG04BJ05 not in", values, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05Between(String value1, String value2) {
            addCriterion("EG04BJ05 between", value1, value2, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj05NotBetween(String value1, String value2) {
            addCriterion("EG04BJ05 not between", value1, value2, "eg04bj05");
            return (Criteria) this;
        }

        public Criteria andEg04bj06IsNull() {
            addCriterion("EG04BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj06IsNotNull() {
            addCriterion("EG04BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj06EqualTo(String value) {
            addCriterion("EG04BJ06 =", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06NotEqualTo(String value) {
            addCriterion("EG04BJ06 <>", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06GreaterThan(String value) {
            addCriterion("EG04BJ06 >", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ06 >=", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06LessThan(String value) {
            addCriterion("EG04BJ06 <", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ06 <=", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06Like(String value) {
            addCriterion("EG04BJ06 like", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06NotLike(String value) {
            addCriterion("EG04BJ06 not like", value, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06In(List<String> values) {
            addCriterion("EG04BJ06 in", values, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06NotIn(List<String> values) {
            addCriterion("EG04BJ06 not in", values, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06Between(String value1, String value2) {
            addCriterion("EG04BJ06 between", value1, value2, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj06NotBetween(String value1, String value2) {
            addCriterion("EG04BJ06 not between", value1, value2, "eg04bj06");
            return (Criteria) this;
        }

        public Criteria andEg04bj07IsNull() {
            addCriterion("EG04BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj07IsNotNull() {
            addCriterion("EG04BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj07EqualTo(String value) {
            addCriterion("EG04BJ07 =", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07NotEqualTo(String value) {
            addCriterion("EG04BJ07 <>", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07GreaterThan(String value) {
            addCriterion("EG04BJ07 >", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ07 >=", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07LessThan(String value) {
            addCriterion("EG04BJ07 <", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ07 <=", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07Like(String value) {
            addCriterion("EG04BJ07 like", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07NotLike(String value) {
            addCriterion("EG04BJ07 not like", value, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07In(List<String> values) {
            addCriterion("EG04BJ07 in", values, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07NotIn(List<String> values) {
            addCriterion("EG04BJ07 not in", values, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07Between(String value1, String value2) {
            addCriterion("EG04BJ07 between", value1, value2, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj07NotBetween(String value1, String value2) {
            addCriterion("EG04BJ07 not between", value1, value2, "eg04bj07");
            return (Criteria) this;
        }

        public Criteria andEg04bj08IsNull() {
            addCriterion("EG04BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj08IsNotNull() {
            addCriterion("EG04BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj08EqualTo(String value) {
            addCriterion("EG04BJ08 =", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08NotEqualTo(String value) {
            addCriterion("EG04BJ08 <>", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08GreaterThan(String value) {
            addCriterion("EG04BJ08 >", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ08 >=", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08LessThan(String value) {
            addCriterion("EG04BJ08 <", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ08 <=", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08Like(String value) {
            addCriterion("EG04BJ08 like", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08NotLike(String value) {
            addCriterion("EG04BJ08 not like", value, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08In(List<String> values) {
            addCriterion("EG04BJ08 in", values, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08NotIn(List<String> values) {
            addCriterion("EG04BJ08 not in", values, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08Between(String value1, String value2) {
            addCriterion("EG04BJ08 between", value1, value2, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj08NotBetween(String value1, String value2) {
            addCriterion("EG04BJ08 not between", value1, value2, "eg04bj08");
            return (Criteria) this;
        }

        public Criteria andEg04bj09IsNull() {
            addCriterion("EG04BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj09IsNotNull() {
            addCriterion("EG04BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj09EqualTo(String value) {
            addCriterion("EG04BJ09 =", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09NotEqualTo(String value) {
            addCriterion("EG04BJ09 <>", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09GreaterThan(String value) {
            addCriterion("EG04BJ09 >", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ09 >=", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09LessThan(String value) {
            addCriterion("EG04BJ09 <", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ09 <=", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09Like(String value) {
            addCriterion("EG04BJ09 like", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09NotLike(String value) {
            addCriterion("EG04BJ09 not like", value, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09In(List<String> values) {
            addCriterion("EG04BJ09 in", values, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09NotIn(List<String> values) {
            addCriterion("EG04BJ09 not in", values, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09Between(String value1, String value2) {
            addCriterion("EG04BJ09 between", value1, value2, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj09NotBetween(String value1, String value2) {
            addCriterion("EG04BJ09 not between", value1, value2, "eg04bj09");
            return (Criteria) this;
        }

        public Criteria andEg04bj10IsNull() {
            addCriterion("EG04BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj10IsNotNull() {
            addCriterion("EG04BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj10EqualTo(String value) {
            addCriterion("EG04BJ10 =", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10NotEqualTo(String value) {
            addCriterion("EG04BJ10 <>", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10GreaterThan(String value) {
            addCriterion("EG04BJ10 >", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ10 >=", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10LessThan(String value) {
            addCriterion("EG04BJ10 <", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ10 <=", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10Like(String value) {
            addCriterion("EG04BJ10 like", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10NotLike(String value) {
            addCriterion("EG04BJ10 not like", value, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10In(List<String> values) {
            addCriterion("EG04BJ10 in", values, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10NotIn(List<String> values) {
            addCriterion("EG04BJ10 not in", values, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10Between(String value1, String value2) {
            addCriterion("EG04BJ10 between", value1, value2, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj10NotBetween(String value1, String value2) {
            addCriterion("EG04BJ10 not between", value1, value2, "eg04bj10");
            return (Criteria) this;
        }

        public Criteria andEg04bj11IsNull() {
            addCriterion("EG04BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj11IsNotNull() {
            addCriterion("EG04BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj11EqualTo(String value) {
            addCriterion("EG04BJ11 =", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11NotEqualTo(String value) {
            addCriterion("EG04BJ11 <>", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11GreaterThan(String value) {
            addCriterion("EG04BJ11 >", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ11 >=", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11LessThan(String value) {
            addCriterion("EG04BJ11 <", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ11 <=", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11Like(String value) {
            addCriterion("EG04BJ11 like", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11NotLike(String value) {
            addCriterion("EG04BJ11 not like", value, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11In(List<String> values) {
            addCriterion("EG04BJ11 in", values, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11NotIn(List<String> values) {
            addCriterion("EG04BJ11 not in", values, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11Between(String value1, String value2) {
            addCriterion("EG04BJ11 between", value1, value2, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj11NotBetween(String value1, String value2) {
            addCriterion("EG04BJ11 not between", value1, value2, "eg04bj11");
            return (Criteria) this;
        }

        public Criteria andEg04bj12IsNull() {
            addCriterion("EG04BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj12IsNotNull() {
            addCriterion("EG04BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj12EqualTo(String value) {
            addCriterion("EG04BJ12 =", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12NotEqualTo(String value) {
            addCriterion("EG04BJ12 <>", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12GreaterThan(String value) {
            addCriterion("EG04BJ12 >", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ12 >=", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12LessThan(String value) {
            addCriterion("EG04BJ12 <", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ12 <=", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12Like(String value) {
            addCriterion("EG04BJ12 like", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12NotLike(String value) {
            addCriterion("EG04BJ12 not like", value, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12In(List<String> values) {
            addCriterion("EG04BJ12 in", values, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12NotIn(List<String> values) {
            addCriterion("EG04BJ12 not in", values, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12Between(String value1, String value2) {
            addCriterion("EG04BJ12 between", value1, value2, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj12NotBetween(String value1, String value2) {
            addCriterion("EG04BJ12 not between", value1, value2, "eg04bj12");
            return (Criteria) this;
        }

        public Criteria andEg04bj13IsNull() {
            addCriterion("EG04BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj13IsNotNull() {
            addCriterion("EG04BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj13EqualTo(String value) {
            addCriterion("EG04BJ13 =", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13NotEqualTo(String value) {
            addCriterion("EG04BJ13 <>", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13GreaterThan(String value) {
            addCriterion("EG04BJ13 >", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ13 >=", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13LessThan(String value) {
            addCriterion("EG04BJ13 <", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ13 <=", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13Like(String value) {
            addCriterion("EG04BJ13 like", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13NotLike(String value) {
            addCriterion("EG04BJ13 not like", value, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13In(List<String> values) {
            addCriterion("EG04BJ13 in", values, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13NotIn(List<String> values) {
            addCriterion("EG04BJ13 not in", values, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13Between(String value1, String value2) {
            addCriterion("EG04BJ13 between", value1, value2, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj13NotBetween(String value1, String value2) {
            addCriterion("EG04BJ13 not between", value1, value2, "eg04bj13");
            return (Criteria) this;
        }

        public Criteria andEg04bj14IsNull() {
            addCriterion("EG04BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj14IsNotNull() {
            addCriterion("EG04BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj14EqualTo(String value) {
            addCriterion("EG04BJ14 =", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14NotEqualTo(String value) {
            addCriterion("EG04BJ14 <>", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14GreaterThan(String value) {
            addCriterion("EG04BJ14 >", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ14 >=", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14LessThan(String value) {
            addCriterion("EG04BJ14 <", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ14 <=", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14Like(String value) {
            addCriterion("EG04BJ14 like", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14NotLike(String value) {
            addCriterion("EG04BJ14 not like", value, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14In(List<String> values) {
            addCriterion("EG04BJ14 in", values, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14NotIn(List<String> values) {
            addCriterion("EG04BJ14 not in", values, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14Between(String value1, String value2) {
            addCriterion("EG04BJ14 between", value1, value2, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj14NotBetween(String value1, String value2) {
            addCriterion("EG04BJ14 not between", value1, value2, "eg04bj14");
            return (Criteria) this;
        }

        public Criteria andEg04bj15IsNull() {
            addCriterion("EG04BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj15IsNotNull() {
            addCriterion("EG04BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj15EqualTo(String value) {
            addCriterion("EG04BJ15 =", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15NotEqualTo(String value) {
            addCriterion("EG04BJ15 <>", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15GreaterThan(String value) {
            addCriterion("EG04BJ15 >", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ15 >=", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15LessThan(String value) {
            addCriterion("EG04BJ15 <", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ15 <=", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15Like(String value) {
            addCriterion("EG04BJ15 like", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15NotLike(String value) {
            addCriterion("EG04BJ15 not like", value, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15In(List<String> values) {
            addCriterion("EG04BJ15 in", values, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15NotIn(List<String> values) {
            addCriterion("EG04BJ15 not in", values, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15Between(String value1, String value2) {
            addCriterion("EG04BJ15 between", value1, value2, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj15NotBetween(String value1, String value2) {
            addCriterion("EG04BJ15 not between", value1, value2, "eg04bj15");
            return (Criteria) this;
        }

        public Criteria andEg04bj16IsNull() {
            addCriterion("EG04BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj16IsNotNull() {
            addCriterion("EG04BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj16EqualTo(String value) {
            addCriterion("EG04BJ16 =", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16NotEqualTo(String value) {
            addCriterion("EG04BJ16 <>", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16GreaterThan(String value) {
            addCriterion("EG04BJ16 >", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ16 >=", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16LessThan(String value) {
            addCriterion("EG04BJ16 <", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ16 <=", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16Like(String value) {
            addCriterion("EG04BJ16 like", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16NotLike(String value) {
            addCriterion("EG04BJ16 not like", value, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16In(List<String> values) {
            addCriterion("EG04BJ16 in", values, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16NotIn(List<String> values) {
            addCriterion("EG04BJ16 not in", values, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16Between(String value1, String value2) {
            addCriterion("EG04BJ16 between", value1, value2, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj16NotBetween(String value1, String value2) {
            addCriterion("EG04BJ16 not between", value1, value2, "eg04bj16");
            return (Criteria) this;
        }

        public Criteria andEg04bj17IsNull() {
            addCriterion("EG04BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj17IsNotNull() {
            addCriterion("EG04BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj17EqualTo(String value) {
            addCriterion("EG04BJ17 =", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17NotEqualTo(String value) {
            addCriterion("EG04BJ17 <>", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17GreaterThan(String value) {
            addCriterion("EG04BJ17 >", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ17 >=", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17LessThan(String value) {
            addCriterion("EG04BJ17 <", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ17 <=", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17Like(String value) {
            addCriterion("EG04BJ17 like", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17NotLike(String value) {
            addCriterion("EG04BJ17 not like", value, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17In(List<String> values) {
            addCriterion("EG04BJ17 in", values, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17NotIn(List<String> values) {
            addCriterion("EG04BJ17 not in", values, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17Between(String value1, String value2) {
            addCriterion("EG04BJ17 between", value1, value2, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj17NotBetween(String value1, String value2) {
            addCriterion("EG04BJ17 not between", value1, value2, "eg04bj17");
            return (Criteria) this;
        }

        public Criteria andEg04bj18IsNull() {
            addCriterion("EG04BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj18IsNotNull() {
            addCriterion("EG04BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj18EqualTo(String value) {
            addCriterion("EG04BJ18 =", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18NotEqualTo(String value) {
            addCriterion("EG04BJ18 <>", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18GreaterThan(String value) {
            addCriterion("EG04BJ18 >", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ18 >=", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18LessThan(String value) {
            addCriterion("EG04BJ18 <", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ18 <=", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18Like(String value) {
            addCriterion("EG04BJ18 like", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18NotLike(String value) {
            addCriterion("EG04BJ18 not like", value, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18In(List<String> values) {
            addCriterion("EG04BJ18 in", values, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18NotIn(List<String> values) {
            addCriterion("EG04BJ18 not in", values, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18Between(String value1, String value2) {
            addCriterion("EG04BJ18 between", value1, value2, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj18NotBetween(String value1, String value2) {
            addCriterion("EG04BJ18 not between", value1, value2, "eg04bj18");
            return (Criteria) this;
        }

        public Criteria andEg04bj19IsNull() {
            addCriterion("EG04BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg04bj19IsNotNull() {
            addCriterion("EG04BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg04bj19EqualTo(String value) {
            addCriterion("EG04BJ19 =", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19NotEqualTo(String value) {
            addCriterion("EG04BJ19 <>", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19GreaterThan(String value) {
            addCriterion("EG04BJ19 >", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG04BJ19 >=", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19LessThan(String value) {
            addCriterion("EG04BJ19 <", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19LessThanOrEqualTo(String value) {
            addCriterion("EG04BJ19 <=", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19Like(String value) {
            addCriterion("EG04BJ19 like", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19NotLike(String value) {
            addCriterion("EG04BJ19 not like", value, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19In(List<String> values) {
            addCriterion("EG04BJ19 in", values, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19NotIn(List<String> values) {
            addCriterion("EG04BJ19 not in", values, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19Between(String value1, String value2) {
            addCriterion("EG04BJ19 between", value1, value2, "eg04bj19");
            return (Criteria) this;
        }

        public Criteria andEg04bj19NotBetween(String value1, String value2) {
            addCriterion("EG04BJ19 not between", value1, value2, "eg04bj19");
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