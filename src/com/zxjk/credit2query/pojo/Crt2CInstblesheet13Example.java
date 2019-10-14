package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CInstblesheet13Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CInstblesheet13Example() {
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

        public Criteria andCashinfodateIsNull() {
            addCriterion("CASHINFODATE is null");
            return (Criteria) this;
        }

        public Criteria andCashinfodateIsNotNull() {
            addCriterion("CASHINFODATE is not null");
            return (Criteria) this;
        }

        public Criteria andCashinfodateEqualTo(String value) {
            addCriterion("CASHINFODATE =", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateNotEqualTo(String value) {
            addCriterion("CASHINFODATE <>", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateGreaterThan(String value) {
            addCriterion("CASHINFODATE >", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateGreaterThanOrEqualTo(String value) {
            addCriterion("CASHINFODATE >=", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateLessThan(String value) {
            addCriterion("CASHINFODATE <", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateLessThanOrEqualTo(String value) {
            addCriterion("CASHINFODATE <=", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateLike(String value) {
            addCriterion("CASHINFODATE like", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateNotLike(String value) {
            addCriterion("CASHINFODATE not like", value, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateIn(List<String> values) {
            addCriterion("CASHINFODATE in", values, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateNotIn(List<String> values) {
            addCriterion("CASHINFODATE not in", values, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateBetween(String value1, String value2) {
            addCriterion("CASHINFODATE between", value1, value2, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfodateNotBetween(String value1, String value2) {
            addCriterion("CASHINFODATE not between", value1, value2, "cashinfodate");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeIsNull() {
            addCriterion("CASHINFOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeIsNotNull() {
            addCriterion("CASHINFOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeEqualTo(String value) {
            addCriterion("CASHINFOTYPE =", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeNotEqualTo(String value) {
            addCriterion("CASHINFOTYPE <>", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeGreaterThan(String value) {
            addCriterion("CASHINFOTYPE >", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASHINFOTYPE >=", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeLessThan(String value) {
            addCriterion("CASHINFOTYPE <", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeLessThanOrEqualTo(String value) {
            addCriterion("CASHINFOTYPE <=", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeLike(String value) {
            addCriterion("CASHINFOTYPE like", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeNotLike(String value) {
            addCriterion("CASHINFOTYPE not like", value, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeIn(List<String> values) {
            addCriterion("CASHINFOTYPE in", values, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeNotIn(List<String> values) {
            addCriterion("CASHINFOTYPE not in", values, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeBetween(String value1, String value2) {
            addCriterion("CASHINFOTYPE between", value1, value2, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfotypeNotBetween(String value1, String value2) {
            addCriterion("CASHINFOTYPE not between", value1, value2, "cashinfotype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeIsNull() {
            addCriterion("CASHINFOSUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeIsNotNull() {
            addCriterion("CASHINFOSUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeEqualTo(String value) {
            addCriterion("CASHINFOSUBTYPE =", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeNotEqualTo(String value) {
            addCriterion("CASHINFOSUBTYPE <>", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeGreaterThan(String value) {
            addCriterion("CASHINFOSUBTYPE >", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CASHINFOSUBTYPE >=", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeLessThan(String value) {
            addCriterion("CASHINFOSUBTYPE <", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeLessThanOrEqualTo(String value) {
            addCriterion("CASHINFOSUBTYPE <=", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeLike(String value) {
            addCriterion("CASHINFOSUBTYPE like", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeNotLike(String value) {
            addCriterion("CASHINFOSUBTYPE not like", value, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeIn(List<String> values) {
            addCriterion("CASHINFOSUBTYPE in", values, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeNotIn(List<String> values) {
            addCriterion("CASHINFOSUBTYPE not in", values, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeBetween(String value1, String value2) {
            addCriterion("CASHINFOSUBTYPE between", value1, value2, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andCashinfosubtypeNotBetween(String value1, String value2) {
            addCriterion("CASHINFOSUBTYPE not between", value1, value2, "cashinfosubtype");
            return (Criteria) this;
        }

        public Criteria andEg08bj01IsNull() {
            addCriterion("EG08BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj01IsNotNull() {
            addCriterion("EG08BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj01EqualTo(String value) {
            addCriterion("EG08BJ01 =", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01NotEqualTo(String value) {
            addCriterion("EG08BJ01 <>", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01GreaterThan(String value) {
            addCriterion("EG08BJ01 >", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ01 >=", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01LessThan(String value) {
            addCriterion("EG08BJ01 <", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ01 <=", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01Like(String value) {
            addCriterion("EG08BJ01 like", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01NotLike(String value) {
            addCriterion("EG08BJ01 not like", value, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01In(List<String> values) {
            addCriterion("EG08BJ01 in", values, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01NotIn(List<String> values) {
            addCriterion("EG08BJ01 not in", values, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01Between(String value1, String value2) {
            addCriterion("EG08BJ01 between", value1, value2, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj01NotBetween(String value1, String value2) {
            addCriterion("EG08BJ01 not between", value1, value2, "eg08bj01");
            return (Criteria) this;
        }

        public Criteria andEg08bj02IsNull() {
            addCriterion("EG08BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj02IsNotNull() {
            addCriterion("EG08BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj02EqualTo(String value) {
            addCriterion("EG08BJ02 =", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02NotEqualTo(String value) {
            addCriterion("EG08BJ02 <>", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02GreaterThan(String value) {
            addCriterion("EG08BJ02 >", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ02 >=", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02LessThan(String value) {
            addCriterion("EG08BJ02 <", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ02 <=", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02Like(String value) {
            addCriterion("EG08BJ02 like", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02NotLike(String value) {
            addCriterion("EG08BJ02 not like", value, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02In(List<String> values) {
            addCriterion("EG08BJ02 in", values, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02NotIn(List<String> values) {
            addCriterion("EG08BJ02 not in", values, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02Between(String value1, String value2) {
            addCriterion("EG08BJ02 between", value1, value2, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj02NotBetween(String value1, String value2) {
            addCriterion("EG08BJ02 not between", value1, value2, "eg08bj02");
            return (Criteria) this;
        }

        public Criteria andEg08bj03IsNull() {
            addCriterion("EG08BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj03IsNotNull() {
            addCriterion("EG08BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj03EqualTo(String value) {
            addCriterion("EG08BJ03 =", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03NotEqualTo(String value) {
            addCriterion("EG08BJ03 <>", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03GreaterThan(String value) {
            addCriterion("EG08BJ03 >", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ03 >=", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03LessThan(String value) {
            addCriterion("EG08BJ03 <", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ03 <=", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03Like(String value) {
            addCriterion("EG08BJ03 like", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03NotLike(String value) {
            addCriterion("EG08BJ03 not like", value, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03In(List<String> values) {
            addCriterion("EG08BJ03 in", values, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03NotIn(List<String> values) {
            addCriterion("EG08BJ03 not in", values, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03Between(String value1, String value2) {
            addCriterion("EG08BJ03 between", value1, value2, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj03NotBetween(String value1, String value2) {
            addCriterion("EG08BJ03 not between", value1, value2, "eg08bj03");
            return (Criteria) this;
        }

        public Criteria andEg08bj04IsNull() {
            addCriterion("EG08BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj04IsNotNull() {
            addCriterion("EG08BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj04EqualTo(String value) {
            addCriterion("EG08BJ04 =", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04NotEqualTo(String value) {
            addCriterion("EG08BJ04 <>", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04GreaterThan(String value) {
            addCriterion("EG08BJ04 >", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ04 >=", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04LessThan(String value) {
            addCriterion("EG08BJ04 <", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ04 <=", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04Like(String value) {
            addCriterion("EG08BJ04 like", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04NotLike(String value) {
            addCriterion("EG08BJ04 not like", value, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04In(List<String> values) {
            addCriterion("EG08BJ04 in", values, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04NotIn(List<String> values) {
            addCriterion("EG08BJ04 not in", values, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04Between(String value1, String value2) {
            addCriterion("EG08BJ04 between", value1, value2, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj04NotBetween(String value1, String value2) {
            addCriterion("EG08BJ04 not between", value1, value2, "eg08bj04");
            return (Criteria) this;
        }

        public Criteria andEg08bj05IsNull() {
            addCriterion("EG08BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj05IsNotNull() {
            addCriterion("EG08BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj05EqualTo(String value) {
            addCriterion("EG08BJ05 =", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05NotEqualTo(String value) {
            addCriterion("EG08BJ05 <>", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05GreaterThan(String value) {
            addCriterion("EG08BJ05 >", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ05 >=", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05LessThan(String value) {
            addCriterion("EG08BJ05 <", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ05 <=", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05Like(String value) {
            addCriterion("EG08BJ05 like", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05NotLike(String value) {
            addCriterion("EG08BJ05 not like", value, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05In(List<String> values) {
            addCriterion("EG08BJ05 in", values, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05NotIn(List<String> values) {
            addCriterion("EG08BJ05 not in", values, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05Between(String value1, String value2) {
            addCriterion("EG08BJ05 between", value1, value2, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj05NotBetween(String value1, String value2) {
            addCriterion("EG08BJ05 not between", value1, value2, "eg08bj05");
            return (Criteria) this;
        }

        public Criteria andEg08bj06IsNull() {
            addCriterion("EG08BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj06IsNotNull() {
            addCriterion("EG08BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj06EqualTo(String value) {
            addCriterion("EG08BJ06 =", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06NotEqualTo(String value) {
            addCriterion("EG08BJ06 <>", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06GreaterThan(String value) {
            addCriterion("EG08BJ06 >", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ06 >=", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06LessThan(String value) {
            addCriterion("EG08BJ06 <", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ06 <=", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06Like(String value) {
            addCriterion("EG08BJ06 like", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06NotLike(String value) {
            addCriterion("EG08BJ06 not like", value, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06In(List<String> values) {
            addCriterion("EG08BJ06 in", values, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06NotIn(List<String> values) {
            addCriterion("EG08BJ06 not in", values, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06Between(String value1, String value2) {
            addCriterion("EG08BJ06 between", value1, value2, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj06NotBetween(String value1, String value2) {
            addCriterion("EG08BJ06 not between", value1, value2, "eg08bj06");
            return (Criteria) this;
        }

        public Criteria andEg08bj07IsNull() {
            addCriterion("EG08BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj07IsNotNull() {
            addCriterion("EG08BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj07EqualTo(String value) {
            addCriterion("EG08BJ07 =", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07NotEqualTo(String value) {
            addCriterion("EG08BJ07 <>", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07GreaterThan(String value) {
            addCriterion("EG08BJ07 >", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ07 >=", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07LessThan(String value) {
            addCriterion("EG08BJ07 <", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ07 <=", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07Like(String value) {
            addCriterion("EG08BJ07 like", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07NotLike(String value) {
            addCriterion("EG08BJ07 not like", value, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07In(List<String> values) {
            addCriterion("EG08BJ07 in", values, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07NotIn(List<String> values) {
            addCriterion("EG08BJ07 not in", values, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07Between(String value1, String value2) {
            addCriterion("EG08BJ07 between", value1, value2, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj07NotBetween(String value1, String value2) {
            addCriterion("EG08BJ07 not between", value1, value2, "eg08bj07");
            return (Criteria) this;
        }

        public Criteria andEg08bj08IsNull() {
            addCriterion("EG08BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj08IsNotNull() {
            addCriterion("EG08BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj08EqualTo(String value) {
            addCriterion("EG08BJ08 =", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08NotEqualTo(String value) {
            addCriterion("EG08BJ08 <>", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08GreaterThan(String value) {
            addCriterion("EG08BJ08 >", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ08 >=", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08LessThan(String value) {
            addCriterion("EG08BJ08 <", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ08 <=", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08Like(String value) {
            addCriterion("EG08BJ08 like", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08NotLike(String value) {
            addCriterion("EG08BJ08 not like", value, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08In(List<String> values) {
            addCriterion("EG08BJ08 in", values, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08NotIn(List<String> values) {
            addCriterion("EG08BJ08 not in", values, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08Between(String value1, String value2) {
            addCriterion("EG08BJ08 between", value1, value2, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj08NotBetween(String value1, String value2) {
            addCriterion("EG08BJ08 not between", value1, value2, "eg08bj08");
            return (Criteria) this;
        }

        public Criteria andEg08bj09IsNull() {
            addCriterion("EG08BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj09IsNotNull() {
            addCriterion("EG08BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj09EqualTo(String value) {
            addCriterion("EG08BJ09 =", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09NotEqualTo(String value) {
            addCriterion("EG08BJ09 <>", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09GreaterThan(String value) {
            addCriterion("EG08BJ09 >", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ09 >=", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09LessThan(String value) {
            addCriterion("EG08BJ09 <", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ09 <=", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09Like(String value) {
            addCriterion("EG08BJ09 like", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09NotLike(String value) {
            addCriterion("EG08BJ09 not like", value, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09In(List<String> values) {
            addCriterion("EG08BJ09 in", values, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09NotIn(List<String> values) {
            addCriterion("EG08BJ09 not in", values, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09Between(String value1, String value2) {
            addCriterion("EG08BJ09 between", value1, value2, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj09NotBetween(String value1, String value2) {
            addCriterion("EG08BJ09 not between", value1, value2, "eg08bj09");
            return (Criteria) this;
        }

        public Criteria andEg08bj10IsNull() {
            addCriterion("EG08BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj10IsNotNull() {
            addCriterion("EG08BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj10EqualTo(String value) {
            addCriterion("EG08BJ10 =", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10NotEqualTo(String value) {
            addCriterion("EG08BJ10 <>", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10GreaterThan(String value) {
            addCriterion("EG08BJ10 >", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ10 >=", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10LessThan(String value) {
            addCriterion("EG08BJ10 <", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ10 <=", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10Like(String value) {
            addCriterion("EG08BJ10 like", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10NotLike(String value) {
            addCriterion("EG08BJ10 not like", value, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10In(List<String> values) {
            addCriterion("EG08BJ10 in", values, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10NotIn(List<String> values) {
            addCriterion("EG08BJ10 not in", values, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10Between(String value1, String value2) {
            addCriterion("EG08BJ10 between", value1, value2, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj10NotBetween(String value1, String value2) {
            addCriterion("EG08BJ10 not between", value1, value2, "eg08bj10");
            return (Criteria) this;
        }

        public Criteria andEg08bj11IsNull() {
            addCriterion("EG08BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj11IsNotNull() {
            addCriterion("EG08BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj11EqualTo(String value) {
            addCriterion("EG08BJ11 =", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11NotEqualTo(String value) {
            addCriterion("EG08BJ11 <>", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11GreaterThan(String value) {
            addCriterion("EG08BJ11 >", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ11 >=", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11LessThan(String value) {
            addCriterion("EG08BJ11 <", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ11 <=", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11Like(String value) {
            addCriterion("EG08BJ11 like", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11NotLike(String value) {
            addCriterion("EG08BJ11 not like", value, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11In(List<String> values) {
            addCriterion("EG08BJ11 in", values, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11NotIn(List<String> values) {
            addCriterion("EG08BJ11 not in", values, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11Between(String value1, String value2) {
            addCriterion("EG08BJ11 between", value1, value2, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj11NotBetween(String value1, String value2) {
            addCriterion("EG08BJ11 not between", value1, value2, "eg08bj11");
            return (Criteria) this;
        }

        public Criteria andEg08bj12IsNull() {
            addCriterion("EG08BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj12IsNotNull() {
            addCriterion("EG08BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj12EqualTo(String value) {
            addCriterion("EG08BJ12 =", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12NotEqualTo(String value) {
            addCriterion("EG08BJ12 <>", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12GreaterThan(String value) {
            addCriterion("EG08BJ12 >", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ12 >=", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12LessThan(String value) {
            addCriterion("EG08BJ12 <", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ12 <=", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12Like(String value) {
            addCriterion("EG08BJ12 like", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12NotLike(String value) {
            addCriterion("EG08BJ12 not like", value, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12In(List<String> values) {
            addCriterion("EG08BJ12 in", values, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12NotIn(List<String> values) {
            addCriterion("EG08BJ12 not in", values, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12Between(String value1, String value2) {
            addCriterion("EG08BJ12 between", value1, value2, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj12NotBetween(String value1, String value2) {
            addCriterion("EG08BJ12 not between", value1, value2, "eg08bj12");
            return (Criteria) this;
        }

        public Criteria andEg08bj13IsNull() {
            addCriterion("EG08BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj13IsNotNull() {
            addCriterion("EG08BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj13EqualTo(String value) {
            addCriterion("EG08BJ13 =", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13NotEqualTo(String value) {
            addCriterion("EG08BJ13 <>", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13GreaterThan(String value) {
            addCriterion("EG08BJ13 >", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ13 >=", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13LessThan(String value) {
            addCriterion("EG08BJ13 <", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ13 <=", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13Like(String value) {
            addCriterion("EG08BJ13 like", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13NotLike(String value) {
            addCriterion("EG08BJ13 not like", value, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13In(List<String> values) {
            addCriterion("EG08BJ13 in", values, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13NotIn(List<String> values) {
            addCriterion("EG08BJ13 not in", values, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13Between(String value1, String value2) {
            addCriterion("EG08BJ13 between", value1, value2, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj13NotBetween(String value1, String value2) {
            addCriterion("EG08BJ13 not between", value1, value2, "eg08bj13");
            return (Criteria) this;
        }

        public Criteria andEg08bj14IsNull() {
            addCriterion("EG08BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj14IsNotNull() {
            addCriterion("EG08BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj14EqualTo(String value) {
            addCriterion("EG08BJ14 =", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14NotEqualTo(String value) {
            addCriterion("EG08BJ14 <>", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14GreaterThan(String value) {
            addCriterion("EG08BJ14 >", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ14 >=", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14LessThan(String value) {
            addCriterion("EG08BJ14 <", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ14 <=", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14Like(String value) {
            addCriterion("EG08BJ14 like", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14NotLike(String value) {
            addCriterion("EG08BJ14 not like", value, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14In(List<String> values) {
            addCriterion("EG08BJ14 in", values, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14NotIn(List<String> values) {
            addCriterion("EG08BJ14 not in", values, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14Between(String value1, String value2) {
            addCriterion("EG08BJ14 between", value1, value2, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj14NotBetween(String value1, String value2) {
            addCriterion("EG08BJ14 not between", value1, value2, "eg08bj14");
            return (Criteria) this;
        }

        public Criteria andEg08bj15IsNull() {
            addCriterion("EG08BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj15IsNotNull() {
            addCriterion("EG08BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj15EqualTo(String value) {
            addCriterion("EG08BJ15 =", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15NotEqualTo(String value) {
            addCriterion("EG08BJ15 <>", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15GreaterThan(String value) {
            addCriterion("EG08BJ15 >", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ15 >=", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15LessThan(String value) {
            addCriterion("EG08BJ15 <", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ15 <=", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15Like(String value) {
            addCriterion("EG08BJ15 like", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15NotLike(String value) {
            addCriterion("EG08BJ15 not like", value, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15In(List<String> values) {
            addCriterion("EG08BJ15 in", values, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15NotIn(List<String> values) {
            addCriterion("EG08BJ15 not in", values, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15Between(String value1, String value2) {
            addCriterion("EG08BJ15 between", value1, value2, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj15NotBetween(String value1, String value2) {
            addCriterion("EG08BJ15 not between", value1, value2, "eg08bj15");
            return (Criteria) this;
        }

        public Criteria andEg08bj16IsNull() {
            addCriterion("EG08BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj16IsNotNull() {
            addCriterion("EG08BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj16EqualTo(String value) {
            addCriterion("EG08BJ16 =", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16NotEqualTo(String value) {
            addCriterion("EG08BJ16 <>", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16GreaterThan(String value) {
            addCriterion("EG08BJ16 >", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ16 >=", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16LessThan(String value) {
            addCriterion("EG08BJ16 <", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ16 <=", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16Like(String value) {
            addCriterion("EG08BJ16 like", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16NotLike(String value) {
            addCriterion("EG08BJ16 not like", value, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16In(List<String> values) {
            addCriterion("EG08BJ16 in", values, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16NotIn(List<String> values) {
            addCriterion("EG08BJ16 not in", values, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16Between(String value1, String value2) {
            addCriterion("EG08BJ16 between", value1, value2, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj16NotBetween(String value1, String value2) {
            addCriterion("EG08BJ16 not between", value1, value2, "eg08bj16");
            return (Criteria) this;
        }

        public Criteria andEg08bj17IsNull() {
            addCriterion("EG08BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj17IsNotNull() {
            addCriterion("EG08BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj17EqualTo(String value) {
            addCriterion("EG08BJ17 =", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17NotEqualTo(String value) {
            addCriterion("EG08BJ17 <>", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17GreaterThan(String value) {
            addCriterion("EG08BJ17 >", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ17 >=", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17LessThan(String value) {
            addCriterion("EG08BJ17 <", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ17 <=", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17Like(String value) {
            addCriterion("EG08BJ17 like", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17NotLike(String value) {
            addCriterion("EG08BJ17 not like", value, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17In(List<String> values) {
            addCriterion("EG08BJ17 in", values, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17NotIn(List<String> values) {
            addCriterion("EG08BJ17 not in", values, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17Between(String value1, String value2) {
            addCriterion("EG08BJ17 between", value1, value2, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj17NotBetween(String value1, String value2) {
            addCriterion("EG08BJ17 not between", value1, value2, "eg08bj17");
            return (Criteria) this;
        }

        public Criteria andEg08bj18IsNull() {
            addCriterion("EG08BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj18IsNotNull() {
            addCriterion("EG08BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj18EqualTo(String value) {
            addCriterion("EG08BJ18 =", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18NotEqualTo(String value) {
            addCriterion("EG08BJ18 <>", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18GreaterThan(String value) {
            addCriterion("EG08BJ18 >", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ18 >=", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18LessThan(String value) {
            addCriterion("EG08BJ18 <", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ18 <=", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18Like(String value) {
            addCriterion("EG08BJ18 like", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18NotLike(String value) {
            addCriterion("EG08BJ18 not like", value, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18In(List<String> values) {
            addCriterion("EG08BJ18 in", values, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18NotIn(List<String> values) {
            addCriterion("EG08BJ18 not in", values, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18Between(String value1, String value2) {
            addCriterion("EG08BJ18 between", value1, value2, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj18NotBetween(String value1, String value2) {
            addCriterion("EG08BJ18 not between", value1, value2, "eg08bj18");
            return (Criteria) this;
        }

        public Criteria andEg08bj19IsNull() {
            addCriterion("EG08BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj19IsNotNull() {
            addCriterion("EG08BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj19EqualTo(String value) {
            addCriterion("EG08BJ19 =", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19NotEqualTo(String value) {
            addCriterion("EG08BJ19 <>", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19GreaterThan(String value) {
            addCriterion("EG08BJ19 >", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ19 >=", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19LessThan(String value) {
            addCriterion("EG08BJ19 <", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ19 <=", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19Like(String value) {
            addCriterion("EG08BJ19 like", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19NotLike(String value) {
            addCriterion("EG08BJ19 not like", value, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19In(List<String> values) {
            addCriterion("EG08BJ19 in", values, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19NotIn(List<String> values) {
            addCriterion("EG08BJ19 not in", values, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19Between(String value1, String value2) {
            addCriterion("EG08BJ19 between", value1, value2, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj19NotBetween(String value1, String value2) {
            addCriterion("EG08BJ19 not between", value1, value2, "eg08bj19");
            return (Criteria) this;
        }

        public Criteria andEg08bj20IsNull() {
            addCriterion("EG08BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj20IsNotNull() {
            addCriterion("EG08BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj20EqualTo(String value) {
            addCriterion("EG08BJ20 =", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20NotEqualTo(String value) {
            addCriterion("EG08BJ20 <>", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20GreaterThan(String value) {
            addCriterion("EG08BJ20 >", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ20 >=", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20LessThan(String value) {
            addCriterion("EG08BJ20 <", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ20 <=", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20Like(String value) {
            addCriterion("EG08BJ20 like", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20NotLike(String value) {
            addCriterion("EG08BJ20 not like", value, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20In(List<String> values) {
            addCriterion("EG08BJ20 in", values, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20NotIn(List<String> values) {
            addCriterion("EG08BJ20 not in", values, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20Between(String value1, String value2) {
            addCriterion("EG08BJ20 between", value1, value2, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj20NotBetween(String value1, String value2) {
            addCriterion("EG08BJ20 not between", value1, value2, "eg08bj20");
            return (Criteria) this;
        }

        public Criteria andEg08bj21IsNull() {
            addCriterion("EG08BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj21IsNotNull() {
            addCriterion("EG08BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj21EqualTo(String value) {
            addCriterion("EG08BJ21 =", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21NotEqualTo(String value) {
            addCriterion("EG08BJ21 <>", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21GreaterThan(String value) {
            addCriterion("EG08BJ21 >", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ21 >=", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21LessThan(String value) {
            addCriterion("EG08BJ21 <", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ21 <=", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21Like(String value) {
            addCriterion("EG08BJ21 like", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21NotLike(String value) {
            addCriterion("EG08BJ21 not like", value, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21In(List<String> values) {
            addCriterion("EG08BJ21 in", values, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21NotIn(List<String> values) {
            addCriterion("EG08BJ21 not in", values, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21Between(String value1, String value2) {
            addCriterion("EG08BJ21 between", value1, value2, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj21NotBetween(String value1, String value2) {
            addCriterion("EG08BJ21 not between", value1, value2, "eg08bj21");
            return (Criteria) this;
        }

        public Criteria andEg08bj22IsNull() {
            addCriterion("EG08BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj22IsNotNull() {
            addCriterion("EG08BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj22EqualTo(String value) {
            addCriterion("EG08BJ22 =", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22NotEqualTo(String value) {
            addCriterion("EG08BJ22 <>", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22GreaterThan(String value) {
            addCriterion("EG08BJ22 >", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ22 >=", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22LessThan(String value) {
            addCriterion("EG08BJ22 <", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ22 <=", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22Like(String value) {
            addCriterion("EG08BJ22 like", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22NotLike(String value) {
            addCriterion("EG08BJ22 not like", value, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22In(List<String> values) {
            addCriterion("EG08BJ22 in", values, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22NotIn(List<String> values) {
            addCriterion("EG08BJ22 not in", values, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22Between(String value1, String value2) {
            addCriterion("EG08BJ22 between", value1, value2, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj22NotBetween(String value1, String value2) {
            addCriterion("EG08BJ22 not between", value1, value2, "eg08bj22");
            return (Criteria) this;
        }

        public Criteria andEg08bj23IsNull() {
            addCriterion("EG08BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj23IsNotNull() {
            addCriterion("EG08BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj23EqualTo(String value) {
            addCriterion("EG08BJ23 =", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23NotEqualTo(String value) {
            addCriterion("EG08BJ23 <>", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23GreaterThan(String value) {
            addCriterion("EG08BJ23 >", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ23 >=", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23LessThan(String value) {
            addCriterion("EG08BJ23 <", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ23 <=", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23Like(String value) {
            addCriterion("EG08BJ23 like", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23NotLike(String value) {
            addCriterion("EG08BJ23 not like", value, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23In(List<String> values) {
            addCriterion("EG08BJ23 in", values, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23NotIn(List<String> values) {
            addCriterion("EG08BJ23 not in", values, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23Between(String value1, String value2) {
            addCriterion("EG08BJ23 between", value1, value2, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj23NotBetween(String value1, String value2) {
            addCriterion("EG08BJ23 not between", value1, value2, "eg08bj23");
            return (Criteria) this;
        }

        public Criteria andEg08bj24IsNull() {
            addCriterion("EG08BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj24IsNotNull() {
            addCriterion("EG08BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj24EqualTo(String value) {
            addCriterion("EG08BJ24 =", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24NotEqualTo(String value) {
            addCriterion("EG08BJ24 <>", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24GreaterThan(String value) {
            addCriterion("EG08BJ24 >", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ24 >=", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24LessThan(String value) {
            addCriterion("EG08BJ24 <", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ24 <=", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24Like(String value) {
            addCriterion("EG08BJ24 like", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24NotLike(String value) {
            addCriterion("EG08BJ24 not like", value, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24In(List<String> values) {
            addCriterion("EG08BJ24 in", values, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24NotIn(List<String> values) {
            addCriterion("EG08BJ24 not in", values, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24Between(String value1, String value2) {
            addCriterion("EG08BJ24 between", value1, value2, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj24NotBetween(String value1, String value2) {
            addCriterion("EG08BJ24 not between", value1, value2, "eg08bj24");
            return (Criteria) this;
        }

        public Criteria andEg08bj25IsNull() {
            addCriterion("EG08BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj25IsNotNull() {
            addCriterion("EG08BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj25EqualTo(String value) {
            addCriterion("EG08BJ25 =", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25NotEqualTo(String value) {
            addCriterion("EG08BJ25 <>", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25GreaterThan(String value) {
            addCriterion("EG08BJ25 >", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ25 >=", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25LessThan(String value) {
            addCriterion("EG08BJ25 <", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ25 <=", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25Like(String value) {
            addCriterion("EG08BJ25 like", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25NotLike(String value) {
            addCriterion("EG08BJ25 not like", value, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25In(List<String> values) {
            addCriterion("EG08BJ25 in", values, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25NotIn(List<String> values) {
            addCriterion("EG08BJ25 not in", values, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25Between(String value1, String value2) {
            addCriterion("EG08BJ25 between", value1, value2, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj25NotBetween(String value1, String value2) {
            addCriterion("EG08BJ25 not between", value1, value2, "eg08bj25");
            return (Criteria) this;
        }

        public Criteria andEg08bj26IsNull() {
            addCriterion("EG08BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj26IsNotNull() {
            addCriterion("EG08BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj26EqualTo(String value) {
            addCriterion("EG08BJ26 =", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26NotEqualTo(String value) {
            addCriterion("EG08BJ26 <>", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26GreaterThan(String value) {
            addCriterion("EG08BJ26 >", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ26 >=", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26LessThan(String value) {
            addCriterion("EG08BJ26 <", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ26 <=", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26Like(String value) {
            addCriterion("EG08BJ26 like", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26NotLike(String value) {
            addCriterion("EG08BJ26 not like", value, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26In(List<String> values) {
            addCriterion("EG08BJ26 in", values, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26NotIn(List<String> values) {
            addCriterion("EG08BJ26 not in", values, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26Between(String value1, String value2) {
            addCriterion("EG08BJ26 between", value1, value2, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj26NotBetween(String value1, String value2) {
            addCriterion("EG08BJ26 not between", value1, value2, "eg08bj26");
            return (Criteria) this;
        }

        public Criteria andEg08bj27IsNull() {
            addCriterion("EG08BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj27IsNotNull() {
            addCriterion("EG08BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj27EqualTo(String value) {
            addCriterion("EG08BJ27 =", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27NotEqualTo(String value) {
            addCriterion("EG08BJ27 <>", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27GreaterThan(String value) {
            addCriterion("EG08BJ27 >", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ27 >=", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27LessThan(String value) {
            addCriterion("EG08BJ27 <", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ27 <=", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27Like(String value) {
            addCriterion("EG08BJ27 like", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27NotLike(String value) {
            addCriterion("EG08BJ27 not like", value, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27In(List<String> values) {
            addCriterion("EG08BJ27 in", values, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27NotIn(List<String> values) {
            addCriterion("EG08BJ27 not in", values, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27Between(String value1, String value2) {
            addCriterion("EG08BJ27 between", value1, value2, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj27NotBetween(String value1, String value2) {
            addCriterion("EG08BJ27 not between", value1, value2, "eg08bj27");
            return (Criteria) this;
        }

        public Criteria andEg08bj28IsNull() {
            addCriterion("EG08BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj28IsNotNull() {
            addCriterion("EG08BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj28EqualTo(String value) {
            addCriterion("EG08BJ28 =", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28NotEqualTo(String value) {
            addCriterion("EG08BJ28 <>", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28GreaterThan(String value) {
            addCriterion("EG08BJ28 >", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ28 >=", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28LessThan(String value) {
            addCriterion("EG08BJ28 <", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ28 <=", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28Like(String value) {
            addCriterion("EG08BJ28 like", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28NotLike(String value) {
            addCriterion("EG08BJ28 not like", value, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28In(List<String> values) {
            addCriterion("EG08BJ28 in", values, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28NotIn(List<String> values) {
            addCriterion("EG08BJ28 not in", values, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28Between(String value1, String value2) {
            addCriterion("EG08BJ28 between", value1, value2, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj28NotBetween(String value1, String value2) {
            addCriterion("EG08BJ28 not between", value1, value2, "eg08bj28");
            return (Criteria) this;
        }

        public Criteria andEg08bj29IsNull() {
            addCriterion("EG08BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj29IsNotNull() {
            addCriterion("EG08BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj29EqualTo(String value) {
            addCriterion("EG08BJ29 =", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29NotEqualTo(String value) {
            addCriterion("EG08BJ29 <>", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29GreaterThan(String value) {
            addCriterion("EG08BJ29 >", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ29 >=", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29LessThan(String value) {
            addCriterion("EG08BJ29 <", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ29 <=", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29Like(String value) {
            addCriterion("EG08BJ29 like", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29NotLike(String value) {
            addCriterion("EG08BJ29 not like", value, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29In(List<String> values) {
            addCriterion("EG08BJ29 in", values, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29NotIn(List<String> values) {
            addCriterion("EG08BJ29 not in", values, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29Between(String value1, String value2) {
            addCriterion("EG08BJ29 between", value1, value2, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj29NotBetween(String value1, String value2) {
            addCriterion("EG08BJ29 not between", value1, value2, "eg08bj29");
            return (Criteria) this;
        }

        public Criteria andEg08bj30IsNull() {
            addCriterion("EG08BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj30IsNotNull() {
            addCriterion("EG08BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj30EqualTo(String value) {
            addCriterion("EG08BJ30 =", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30NotEqualTo(String value) {
            addCriterion("EG08BJ30 <>", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30GreaterThan(String value) {
            addCriterion("EG08BJ30 >", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ30 >=", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30LessThan(String value) {
            addCriterion("EG08BJ30 <", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ30 <=", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30Like(String value) {
            addCriterion("EG08BJ30 like", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30NotLike(String value) {
            addCriterion("EG08BJ30 not like", value, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30In(List<String> values) {
            addCriterion("EG08BJ30 in", values, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30NotIn(List<String> values) {
            addCriterion("EG08BJ30 not in", values, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30Between(String value1, String value2) {
            addCriterion("EG08BJ30 between", value1, value2, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj30NotBetween(String value1, String value2) {
            addCriterion("EG08BJ30 not between", value1, value2, "eg08bj30");
            return (Criteria) this;
        }

        public Criteria andEg08bj31IsNull() {
            addCriterion("EG08BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj31IsNotNull() {
            addCriterion("EG08BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj31EqualTo(String value) {
            addCriterion("EG08BJ31 =", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31NotEqualTo(String value) {
            addCriterion("EG08BJ31 <>", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31GreaterThan(String value) {
            addCriterion("EG08BJ31 >", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ31 >=", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31LessThan(String value) {
            addCriterion("EG08BJ31 <", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ31 <=", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31Like(String value) {
            addCriterion("EG08BJ31 like", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31NotLike(String value) {
            addCriterion("EG08BJ31 not like", value, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31In(List<String> values) {
            addCriterion("EG08BJ31 in", values, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31NotIn(List<String> values) {
            addCriterion("EG08BJ31 not in", values, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31Between(String value1, String value2) {
            addCriterion("EG08BJ31 between", value1, value2, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj31NotBetween(String value1, String value2) {
            addCriterion("EG08BJ31 not between", value1, value2, "eg08bj31");
            return (Criteria) this;
        }

        public Criteria andEg08bj32IsNull() {
            addCriterion("EG08BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj32IsNotNull() {
            addCriterion("EG08BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj32EqualTo(String value) {
            addCriterion("EG08BJ32 =", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32NotEqualTo(String value) {
            addCriterion("EG08BJ32 <>", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32GreaterThan(String value) {
            addCriterion("EG08BJ32 >", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ32 >=", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32LessThan(String value) {
            addCriterion("EG08BJ32 <", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ32 <=", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32Like(String value) {
            addCriterion("EG08BJ32 like", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32NotLike(String value) {
            addCriterion("EG08BJ32 not like", value, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32In(List<String> values) {
            addCriterion("EG08BJ32 in", values, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32NotIn(List<String> values) {
            addCriterion("EG08BJ32 not in", values, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32Between(String value1, String value2) {
            addCriterion("EG08BJ32 between", value1, value2, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj32NotBetween(String value1, String value2) {
            addCriterion("EG08BJ32 not between", value1, value2, "eg08bj32");
            return (Criteria) this;
        }

        public Criteria andEg08bj33IsNull() {
            addCriterion("EG08BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj33IsNotNull() {
            addCriterion("EG08BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj33EqualTo(String value) {
            addCriterion("EG08BJ33 =", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33NotEqualTo(String value) {
            addCriterion("EG08BJ33 <>", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33GreaterThan(String value) {
            addCriterion("EG08BJ33 >", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ33 >=", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33LessThan(String value) {
            addCriterion("EG08BJ33 <", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ33 <=", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33Like(String value) {
            addCriterion("EG08BJ33 like", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33NotLike(String value) {
            addCriterion("EG08BJ33 not like", value, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33In(List<String> values) {
            addCriterion("EG08BJ33 in", values, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33NotIn(List<String> values) {
            addCriterion("EG08BJ33 not in", values, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33Between(String value1, String value2) {
            addCriterion("EG08BJ33 between", value1, value2, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj33NotBetween(String value1, String value2) {
            addCriterion("EG08BJ33 not between", value1, value2, "eg08bj33");
            return (Criteria) this;
        }

        public Criteria andEg08bj34IsNull() {
            addCriterion("EG08BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj34IsNotNull() {
            addCriterion("EG08BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj34EqualTo(String value) {
            addCriterion("EG08BJ34 =", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34NotEqualTo(String value) {
            addCriterion("EG08BJ34 <>", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34GreaterThan(String value) {
            addCriterion("EG08BJ34 >", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ34 >=", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34LessThan(String value) {
            addCriterion("EG08BJ34 <", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ34 <=", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34Like(String value) {
            addCriterion("EG08BJ34 like", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34NotLike(String value) {
            addCriterion("EG08BJ34 not like", value, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34In(List<String> values) {
            addCriterion("EG08BJ34 in", values, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34NotIn(List<String> values) {
            addCriterion("EG08BJ34 not in", values, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34Between(String value1, String value2) {
            addCriterion("EG08BJ34 between", value1, value2, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj34NotBetween(String value1, String value2) {
            addCriterion("EG08BJ34 not between", value1, value2, "eg08bj34");
            return (Criteria) this;
        }

        public Criteria andEg08bj35IsNull() {
            addCriterion("EG08BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj35IsNotNull() {
            addCriterion("EG08BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj35EqualTo(String value) {
            addCriterion("EG08BJ35 =", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35NotEqualTo(String value) {
            addCriterion("EG08BJ35 <>", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35GreaterThan(String value) {
            addCriterion("EG08BJ35 >", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ35 >=", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35LessThan(String value) {
            addCriterion("EG08BJ35 <", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ35 <=", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35Like(String value) {
            addCriterion("EG08BJ35 like", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35NotLike(String value) {
            addCriterion("EG08BJ35 not like", value, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35In(List<String> values) {
            addCriterion("EG08BJ35 in", values, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35NotIn(List<String> values) {
            addCriterion("EG08BJ35 not in", values, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35Between(String value1, String value2) {
            addCriterion("EG08BJ35 between", value1, value2, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj35NotBetween(String value1, String value2) {
            addCriterion("EG08BJ35 not between", value1, value2, "eg08bj35");
            return (Criteria) this;
        }

        public Criteria andEg08bj36IsNull() {
            addCriterion("EG08BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj36IsNotNull() {
            addCriterion("EG08BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj36EqualTo(String value) {
            addCriterion("EG08BJ36 =", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36NotEqualTo(String value) {
            addCriterion("EG08BJ36 <>", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36GreaterThan(String value) {
            addCriterion("EG08BJ36 >", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ36 >=", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36LessThan(String value) {
            addCriterion("EG08BJ36 <", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ36 <=", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36Like(String value) {
            addCriterion("EG08BJ36 like", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36NotLike(String value) {
            addCriterion("EG08BJ36 not like", value, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36In(List<String> values) {
            addCriterion("EG08BJ36 in", values, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36NotIn(List<String> values) {
            addCriterion("EG08BJ36 not in", values, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36Between(String value1, String value2) {
            addCriterion("EG08BJ36 between", value1, value2, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj36NotBetween(String value1, String value2) {
            addCriterion("EG08BJ36 not between", value1, value2, "eg08bj36");
            return (Criteria) this;
        }

        public Criteria andEg08bj37IsNull() {
            addCriterion("EG08BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj37IsNotNull() {
            addCriterion("EG08BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj37EqualTo(String value) {
            addCriterion("EG08BJ37 =", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37NotEqualTo(String value) {
            addCriterion("EG08BJ37 <>", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37GreaterThan(String value) {
            addCriterion("EG08BJ37 >", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ37 >=", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37LessThan(String value) {
            addCriterion("EG08BJ37 <", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ37 <=", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37Like(String value) {
            addCriterion("EG08BJ37 like", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37NotLike(String value) {
            addCriterion("EG08BJ37 not like", value, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37In(List<String> values) {
            addCriterion("EG08BJ37 in", values, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37NotIn(List<String> values) {
            addCriterion("EG08BJ37 not in", values, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37Between(String value1, String value2) {
            addCriterion("EG08BJ37 between", value1, value2, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj37NotBetween(String value1, String value2) {
            addCriterion("EG08BJ37 not between", value1, value2, "eg08bj37");
            return (Criteria) this;
        }

        public Criteria andEg08bj38IsNull() {
            addCriterion("EG08BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj38IsNotNull() {
            addCriterion("EG08BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj38EqualTo(String value) {
            addCriterion("EG08BJ38 =", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38NotEqualTo(String value) {
            addCriterion("EG08BJ38 <>", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38GreaterThan(String value) {
            addCriterion("EG08BJ38 >", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ38 >=", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38LessThan(String value) {
            addCriterion("EG08BJ38 <", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ38 <=", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38Like(String value) {
            addCriterion("EG08BJ38 like", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38NotLike(String value) {
            addCriterion("EG08BJ38 not like", value, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38In(List<String> values) {
            addCriterion("EG08BJ38 in", values, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38NotIn(List<String> values) {
            addCriterion("EG08BJ38 not in", values, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38Between(String value1, String value2) {
            addCriterion("EG08BJ38 between", value1, value2, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj38NotBetween(String value1, String value2) {
            addCriterion("EG08BJ38 not between", value1, value2, "eg08bj38");
            return (Criteria) this;
        }

        public Criteria andEg08bj39IsNull() {
            addCriterion("EG08BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj39IsNotNull() {
            addCriterion("EG08BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj39EqualTo(String value) {
            addCriterion("EG08BJ39 =", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39NotEqualTo(String value) {
            addCriterion("EG08BJ39 <>", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39GreaterThan(String value) {
            addCriterion("EG08BJ39 >", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ39 >=", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39LessThan(String value) {
            addCriterion("EG08BJ39 <", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ39 <=", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39Like(String value) {
            addCriterion("EG08BJ39 like", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39NotLike(String value) {
            addCriterion("EG08BJ39 not like", value, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39In(List<String> values) {
            addCriterion("EG08BJ39 in", values, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39NotIn(List<String> values) {
            addCriterion("EG08BJ39 not in", values, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39Between(String value1, String value2) {
            addCriterion("EG08BJ39 between", value1, value2, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj39NotBetween(String value1, String value2) {
            addCriterion("EG08BJ39 not between", value1, value2, "eg08bj39");
            return (Criteria) this;
        }

        public Criteria andEg08bj40IsNull() {
            addCriterion("EG08BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj40IsNotNull() {
            addCriterion("EG08BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj40EqualTo(String value) {
            addCriterion("EG08BJ40 =", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40NotEqualTo(String value) {
            addCriterion("EG08BJ40 <>", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40GreaterThan(String value) {
            addCriterion("EG08BJ40 >", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ40 >=", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40LessThan(String value) {
            addCriterion("EG08BJ40 <", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ40 <=", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40Like(String value) {
            addCriterion("EG08BJ40 like", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40NotLike(String value) {
            addCriterion("EG08BJ40 not like", value, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40In(List<String> values) {
            addCriterion("EG08BJ40 in", values, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40NotIn(List<String> values) {
            addCriterion("EG08BJ40 not in", values, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40Between(String value1, String value2) {
            addCriterion("EG08BJ40 between", value1, value2, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj40NotBetween(String value1, String value2) {
            addCriterion("EG08BJ40 not between", value1, value2, "eg08bj40");
            return (Criteria) this;
        }

        public Criteria andEg08bj41IsNull() {
            addCriterion("EG08BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj41IsNotNull() {
            addCriterion("EG08BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj41EqualTo(String value) {
            addCriterion("EG08BJ41 =", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41NotEqualTo(String value) {
            addCriterion("EG08BJ41 <>", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41GreaterThan(String value) {
            addCriterion("EG08BJ41 >", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ41 >=", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41LessThan(String value) {
            addCriterion("EG08BJ41 <", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ41 <=", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41Like(String value) {
            addCriterion("EG08BJ41 like", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41NotLike(String value) {
            addCriterion("EG08BJ41 not like", value, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41In(List<String> values) {
            addCriterion("EG08BJ41 in", values, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41NotIn(List<String> values) {
            addCriterion("EG08BJ41 not in", values, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41Between(String value1, String value2) {
            addCriterion("EG08BJ41 between", value1, value2, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj41NotBetween(String value1, String value2) {
            addCriterion("EG08BJ41 not between", value1, value2, "eg08bj41");
            return (Criteria) this;
        }

        public Criteria andEg08bj42IsNull() {
            addCriterion("EG08BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj42IsNotNull() {
            addCriterion("EG08BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj42EqualTo(String value) {
            addCriterion("EG08BJ42 =", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42NotEqualTo(String value) {
            addCriterion("EG08BJ42 <>", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42GreaterThan(String value) {
            addCriterion("EG08BJ42 >", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ42 >=", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42LessThan(String value) {
            addCriterion("EG08BJ42 <", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ42 <=", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42Like(String value) {
            addCriterion("EG08BJ42 like", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42NotLike(String value) {
            addCriterion("EG08BJ42 not like", value, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42In(List<String> values) {
            addCriterion("EG08BJ42 in", values, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42NotIn(List<String> values) {
            addCriterion("EG08BJ42 not in", values, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42Between(String value1, String value2) {
            addCriterion("EG08BJ42 between", value1, value2, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj42NotBetween(String value1, String value2) {
            addCriterion("EG08BJ42 not between", value1, value2, "eg08bj42");
            return (Criteria) this;
        }

        public Criteria andEg08bj43IsNull() {
            addCriterion("EG08BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj43IsNotNull() {
            addCriterion("EG08BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj43EqualTo(String value) {
            addCriterion("EG08BJ43 =", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43NotEqualTo(String value) {
            addCriterion("EG08BJ43 <>", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43GreaterThan(String value) {
            addCriterion("EG08BJ43 >", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ43 >=", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43LessThan(String value) {
            addCriterion("EG08BJ43 <", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ43 <=", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43Like(String value) {
            addCriterion("EG08BJ43 like", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43NotLike(String value) {
            addCriterion("EG08BJ43 not like", value, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43In(List<String> values) {
            addCriterion("EG08BJ43 in", values, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43NotIn(List<String> values) {
            addCriterion("EG08BJ43 not in", values, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43Between(String value1, String value2) {
            addCriterion("EG08BJ43 between", value1, value2, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj43NotBetween(String value1, String value2) {
            addCriterion("EG08BJ43 not between", value1, value2, "eg08bj43");
            return (Criteria) this;
        }

        public Criteria andEg08bj44IsNull() {
            addCriterion("EG08BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj44IsNotNull() {
            addCriterion("EG08BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj44EqualTo(String value) {
            addCriterion("EG08BJ44 =", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44NotEqualTo(String value) {
            addCriterion("EG08BJ44 <>", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44GreaterThan(String value) {
            addCriterion("EG08BJ44 >", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ44 >=", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44LessThan(String value) {
            addCriterion("EG08BJ44 <", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ44 <=", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44Like(String value) {
            addCriterion("EG08BJ44 like", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44NotLike(String value) {
            addCriterion("EG08BJ44 not like", value, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44In(List<String> values) {
            addCriterion("EG08BJ44 in", values, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44NotIn(List<String> values) {
            addCriterion("EG08BJ44 not in", values, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44Between(String value1, String value2) {
            addCriterion("EG08BJ44 between", value1, value2, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj44NotBetween(String value1, String value2) {
            addCriterion("EG08BJ44 not between", value1, value2, "eg08bj44");
            return (Criteria) this;
        }

        public Criteria andEg08bj45IsNull() {
            addCriterion("EG08BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj45IsNotNull() {
            addCriterion("EG08BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj45EqualTo(String value) {
            addCriterion("EG08BJ45 =", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45NotEqualTo(String value) {
            addCriterion("EG08BJ45 <>", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45GreaterThan(String value) {
            addCriterion("EG08BJ45 >", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ45 >=", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45LessThan(String value) {
            addCriterion("EG08BJ45 <", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ45 <=", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45Like(String value) {
            addCriterion("EG08BJ45 like", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45NotLike(String value) {
            addCriterion("EG08BJ45 not like", value, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45In(List<String> values) {
            addCriterion("EG08BJ45 in", values, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45NotIn(List<String> values) {
            addCriterion("EG08BJ45 not in", values, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45Between(String value1, String value2) {
            addCriterion("EG08BJ45 between", value1, value2, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj45NotBetween(String value1, String value2) {
            addCriterion("EG08BJ45 not between", value1, value2, "eg08bj45");
            return (Criteria) this;
        }

        public Criteria andEg08bj46IsNull() {
            addCriterion("EG08BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj46IsNotNull() {
            addCriterion("EG08BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj46EqualTo(String value) {
            addCriterion("EG08BJ46 =", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46NotEqualTo(String value) {
            addCriterion("EG08BJ46 <>", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46GreaterThan(String value) {
            addCriterion("EG08BJ46 >", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ46 >=", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46LessThan(String value) {
            addCriterion("EG08BJ46 <", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ46 <=", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46Like(String value) {
            addCriterion("EG08BJ46 like", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46NotLike(String value) {
            addCriterion("EG08BJ46 not like", value, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46In(List<String> values) {
            addCriterion("EG08BJ46 in", values, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46NotIn(List<String> values) {
            addCriterion("EG08BJ46 not in", values, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46Between(String value1, String value2) {
            addCriterion("EG08BJ46 between", value1, value2, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj46NotBetween(String value1, String value2) {
            addCriterion("EG08BJ46 not between", value1, value2, "eg08bj46");
            return (Criteria) this;
        }

        public Criteria andEg08bj47IsNull() {
            addCriterion("EG08BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg08bj47IsNotNull() {
            addCriterion("EG08BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg08bj47EqualTo(String value) {
            addCriterion("EG08BJ47 =", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47NotEqualTo(String value) {
            addCriterion("EG08BJ47 <>", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47GreaterThan(String value) {
            addCriterion("EG08BJ47 >", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG08BJ47 >=", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47LessThan(String value) {
            addCriterion("EG08BJ47 <", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47LessThanOrEqualTo(String value) {
            addCriterion("EG08BJ47 <=", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47Like(String value) {
            addCriterion("EG08BJ47 like", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47NotLike(String value) {
            addCriterion("EG08BJ47 not like", value, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47In(List<String> values) {
            addCriterion("EG08BJ47 in", values, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47NotIn(List<String> values) {
            addCriterion("EG08BJ47 not in", values, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47Between(String value1, String value2) {
            addCriterion("EG08BJ47 between", value1, value2, "eg08bj47");
            return (Criteria) this;
        }

        public Criteria andEg08bj47NotBetween(String value1, String value2) {
            addCriterion("EG08BJ47 not between", value1, value2, "eg08bj47");
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