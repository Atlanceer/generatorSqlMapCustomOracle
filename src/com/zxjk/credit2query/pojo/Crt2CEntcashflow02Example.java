package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntcashflow02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntcashflow02Example() {
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

        public Criteria andEg05bj01IsNull() {
            addCriterion("EG05BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj01IsNotNull() {
            addCriterion("EG05BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj01EqualTo(String value) {
            addCriterion("EG05BJ01 =", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01NotEqualTo(String value) {
            addCriterion("EG05BJ01 <>", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01GreaterThan(String value) {
            addCriterion("EG05BJ01 >", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ01 >=", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01LessThan(String value) {
            addCriterion("EG05BJ01 <", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ01 <=", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01Like(String value) {
            addCriterion("EG05BJ01 like", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01NotLike(String value) {
            addCriterion("EG05BJ01 not like", value, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01In(List<String> values) {
            addCriterion("EG05BJ01 in", values, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01NotIn(List<String> values) {
            addCriterion("EG05BJ01 not in", values, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01Between(String value1, String value2) {
            addCriterion("EG05BJ01 between", value1, value2, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj01NotBetween(String value1, String value2) {
            addCriterion("EG05BJ01 not between", value1, value2, "eg05bj01");
            return (Criteria) this;
        }

        public Criteria andEg05bj02IsNull() {
            addCriterion("EG05BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj02IsNotNull() {
            addCriterion("EG05BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj02EqualTo(String value) {
            addCriterion("EG05BJ02 =", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02NotEqualTo(String value) {
            addCriterion("EG05BJ02 <>", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02GreaterThan(String value) {
            addCriterion("EG05BJ02 >", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ02 >=", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02LessThan(String value) {
            addCriterion("EG05BJ02 <", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ02 <=", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02Like(String value) {
            addCriterion("EG05BJ02 like", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02NotLike(String value) {
            addCriterion("EG05BJ02 not like", value, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02In(List<String> values) {
            addCriterion("EG05BJ02 in", values, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02NotIn(List<String> values) {
            addCriterion("EG05BJ02 not in", values, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02Between(String value1, String value2) {
            addCriterion("EG05BJ02 between", value1, value2, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj02NotBetween(String value1, String value2) {
            addCriterion("EG05BJ02 not between", value1, value2, "eg05bj02");
            return (Criteria) this;
        }

        public Criteria andEg05bj03IsNull() {
            addCriterion("EG05BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj03IsNotNull() {
            addCriterion("EG05BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj03EqualTo(String value) {
            addCriterion("EG05BJ03 =", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03NotEqualTo(String value) {
            addCriterion("EG05BJ03 <>", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03GreaterThan(String value) {
            addCriterion("EG05BJ03 >", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ03 >=", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03LessThan(String value) {
            addCriterion("EG05BJ03 <", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ03 <=", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03Like(String value) {
            addCriterion("EG05BJ03 like", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03NotLike(String value) {
            addCriterion("EG05BJ03 not like", value, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03In(List<String> values) {
            addCriterion("EG05BJ03 in", values, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03NotIn(List<String> values) {
            addCriterion("EG05BJ03 not in", values, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03Between(String value1, String value2) {
            addCriterion("EG05BJ03 between", value1, value2, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj03NotBetween(String value1, String value2) {
            addCriterion("EG05BJ03 not between", value1, value2, "eg05bj03");
            return (Criteria) this;
        }

        public Criteria andEg05bj04IsNull() {
            addCriterion("EG05BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj04IsNotNull() {
            addCriterion("EG05BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj04EqualTo(String value) {
            addCriterion("EG05BJ04 =", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04NotEqualTo(String value) {
            addCriterion("EG05BJ04 <>", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04GreaterThan(String value) {
            addCriterion("EG05BJ04 >", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ04 >=", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04LessThan(String value) {
            addCriterion("EG05BJ04 <", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ04 <=", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04Like(String value) {
            addCriterion("EG05BJ04 like", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04NotLike(String value) {
            addCriterion("EG05BJ04 not like", value, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04In(List<String> values) {
            addCriterion("EG05BJ04 in", values, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04NotIn(List<String> values) {
            addCriterion("EG05BJ04 not in", values, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04Between(String value1, String value2) {
            addCriterion("EG05BJ04 between", value1, value2, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj04NotBetween(String value1, String value2) {
            addCriterion("EG05BJ04 not between", value1, value2, "eg05bj04");
            return (Criteria) this;
        }

        public Criteria andEg05bj05IsNull() {
            addCriterion("EG05BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj05IsNotNull() {
            addCriterion("EG05BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj05EqualTo(String value) {
            addCriterion("EG05BJ05 =", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05NotEqualTo(String value) {
            addCriterion("EG05BJ05 <>", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05GreaterThan(String value) {
            addCriterion("EG05BJ05 >", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ05 >=", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05LessThan(String value) {
            addCriterion("EG05BJ05 <", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ05 <=", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05Like(String value) {
            addCriterion("EG05BJ05 like", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05NotLike(String value) {
            addCriterion("EG05BJ05 not like", value, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05In(List<String> values) {
            addCriterion("EG05BJ05 in", values, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05NotIn(List<String> values) {
            addCriterion("EG05BJ05 not in", values, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05Between(String value1, String value2) {
            addCriterion("EG05BJ05 between", value1, value2, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj05NotBetween(String value1, String value2) {
            addCriterion("EG05BJ05 not between", value1, value2, "eg05bj05");
            return (Criteria) this;
        }

        public Criteria andEg05bj06IsNull() {
            addCriterion("EG05BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj06IsNotNull() {
            addCriterion("EG05BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj06EqualTo(String value) {
            addCriterion("EG05BJ06 =", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06NotEqualTo(String value) {
            addCriterion("EG05BJ06 <>", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06GreaterThan(String value) {
            addCriterion("EG05BJ06 >", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ06 >=", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06LessThan(String value) {
            addCriterion("EG05BJ06 <", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ06 <=", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06Like(String value) {
            addCriterion("EG05BJ06 like", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06NotLike(String value) {
            addCriterion("EG05BJ06 not like", value, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06In(List<String> values) {
            addCriterion("EG05BJ06 in", values, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06NotIn(List<String> values) {
            addCriterion("EG05BJ06 not in", values, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06Between(String value1, String value2) {
            addCriterion("EG05BJ06 between", value1, value2, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj06NotBetween(String value1, String value2) {
            addCriterion("EG05BJ06 not between", value1, value2, "eg05bj06");
            return (Criteria) this;
        }

        public Criteria andEg05bj07IsNull() {
            addCriterion("EG05BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj07IsNotNull() {
            addCriterion("EG05BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj07EqualTo(String value) {
            addCriterion("EG05BJ07 =", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07NotEqualTo(String value) {
            addCriterion("EG05BJ07 <>", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07GreaterThan(String value) {
            addCriterion("EG05BJ07 >", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ07 >=", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07LessThan(String value) {
            addCriterion("EG05BJ07 <", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ07 <=", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07Like(String value) {
            addCriterion("EG05BJ07 like", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07NotLike(String value) {
            addCriterion("EG05BJ07 not like", value, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07In(List<String> values) {
            addCriterion("EG05BJ07 in", values, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07NotIn(List<String> values) {
            addCriterion("EG05BJ07 not in", values, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07Between(String value1, String value2) {
            addCriterion("EG05BJ07 between", value1, value2, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj07NotBetween(String value1, String value2) {
            addCriterion("EG05BJ07 not between", value1, value2, "eg05bj07");
            return (Criteria) this;
        }

        public Criteria andEg05bj08IsNull() {
            addCriterion("EG05BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj08IsNotNull() {
            addCriterion("EG05BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj08EqualTo(String value) {
            addCriterion("EG05BJ08 =", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08NotEqualTo(String value) {
            addCriterion("EG05BJ08 <>", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08GreaterThan(String value) {
            addCriterion("EG05BJ08 >", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ08 >=", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08LessThan(String value) {
            addCriterion("EG05BJ08 <", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ08 <=", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08Like(String value) {
            addCriterion("EG05BJ08 like", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08NotLike(String value) {
            addCriterion("EG05BJ08 not like", value, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08In(List<String> values) {
            addCriterion("EG05BJ08 in", values, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08NotIn(List<String> values) {
            addCriterion("EG05BJ08 not in", values, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08Between(String value1, String value2) {
            addCriterion("EG05BJ08 between", value1, value2, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj08NotBetween(String value1, String value2) {
            addCriterion("EG05BJ08 not between", value1, value2, "eg05bj08");
            return (Criteria) this;
        }

        public Criteria andEg05bj09IsNull() {
            addCriterion("EG05BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj09IsNotNull() {
            addCriterion("EG05BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj09EqualTo(String value) {
            addCriterion("EG05BJ09 =", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09NotEqualTo(String value) {
            addCriterion("EG05BJ09 <>", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09GreaterThan(String value) {
            addCriterion("EG05BJ09 >", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ09 >=", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09LessThan(String value) {
            addCriterion("EG05BJ09 <", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ09 <=", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09Like(String value) {
            addCriterion("EG05BJ09 like", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09NotLike(String value) {
            addCriterion("EG05BJ09 not like", value, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09In(List<String> values) {
            addCriterion("EG05BJ09 in", values, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09NotIn(List<String> values) {
            addCriterion("EG05BJ09 not in", values, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09Between(String value1, String value2) {
            addCriterion("EG05BJ09 between", value1, value2, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj09NotBetween(String value1, String value2) {
            addCriterion("EG05BJ09 not between", value1, value2, "eg05bj09");
            return (Criteria) this;
        }

        public Criteria andEg05bj10IsNull() {
            addCriterion("EG05BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj10IsNotNull() {
            addCriterion("EG05BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj10EqualTo(String value) {
            addCriterion("EG05BJ10 =", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10NotEqualTo(String value) {
            addCriterion("EG05BJ10 <>", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10GreaterThan(String value) {
            addCriterion("EG05BJ10 >", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ10 >=", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10LessThan(String value) {
            addCriterion("EG05BJ10 <", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ10 <=", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10Like(String value) {
            addCriterion("EG05BJ10 like", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10NotLike(String value) {
            addCriterion("EG05BJ10 not like", value, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10In(List<String> values) {
            addCriterion("EG05BJ10 in", values, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10NotIn(List<String> values) {
            addCriterion("EG05BJ10 not in", values, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10Between(String value1, String value2) {
            addCriterion("EG05BJ10 between", value1, value2, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj10NotBetween(String value1, String value2) {
            addCriterion("EG05BJ10 not between", value1, value2, "eg05bj10");
            return (Criteria) this;
        }

        public Criteria andEg05bj11IsNull() {
            addCriterion("EG05BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj11IsNotNull() {
            addCriterion("EG05BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj11EqualTo(String value) {
            addCriterion("EG05BJ11 =", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11NotEqualTo(String value) {
            addCriterion("EG05BJ11 <>", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11GreaterThan(String value) {
            addCriterion("EG05BJ11 >", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ11 >=", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11LessThan(String value) {
            addCriterion("EG05BJ11 <", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ11 <=", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11Like(String value) {
            addCriterion("EG05BJ11 like", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11NotLike(String value) {
            addCriterion("EG05BJ11 not like", value, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11In(List<String> values) {
            addCriterion("EG05BJ11 in", values, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11NotIn(List<String> values) {
            addCriterion("EG05BJ11 not in", values, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11Between(String value1, String value2) {
            addCriterion("EG05BJ11 between", value1, value2, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj11NotBetween(String value1, String value2) {
            addCriterion("EG05BJ11 not between", value1, value2, "eg05bj11");
            return (Criteria) this;
        }

        public Criteria andEg05bj12IsNull() {
            addCriterion("EG05BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj12IsNotNull() {
            addCriterion("EG05BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj12EqualTo(String value) {
            addCriterion("EG05BJ12 =", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12NotEqualTo(String value) {
            addCriterion("EG05BJ12 <>", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12GreaterThan(String value) {
            addCriterion("EG05BJ12 >", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ12 >=", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12LessThan(String value) {
            addCriterion("EG05BJ12 <", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ12 <=", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12Like(String value) {
            addCriterion("EG05BJ12 like", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12NotLike(String value) {
            addCriterion("EG05BJ12 not like", value, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12In(List<String> values) {
            addCriterion("EG05BJ12 in", values, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12NotIn(List<String> values) {
            addCriterion("EG05BJ12 not in", values, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12Between(String value1, String value2) {
            addCriterion("EG05BJ12 between", value1, value2, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj12NotBetween(String value1, String value2) {
            addCriterion("EG05BJ12 not between", value1, value2, "eg05bj12");
            return (Criteria) this;
        }

        public Criteria andEg05bj13IsNull() {
            addCriterion("EG05BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj13IsNotNull() {
            addCriterion("EG05BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj13EqualTo(String value) {
            addCriterion("EG05BJ13 =", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13NotEqualTo(String value) {
            addCriterion("EG05BJ13 <>", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13GreaterThan(String value) {
            addCriterion("EG05BJ13 >", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ13 >=", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13LessThan(String value) {
            addCriterion("EG05BJ13 <", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ13 <=", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13Like(String value) {
            addCriterion("EG05BJ13 like", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13NotLike(String value) {
            addCriterion("EG05BJ13 not like", value, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13In(List<String> values) {
            addCriterion("EG05BJ13 in", values, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13NotIn(List<String> values) {
            addCriterion("EG05BJ13 not in", values, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13Between(String value1, String value2) {
            addCriterion("EG05BJ13 between", value1, value2, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj13NotBetween(String value1, String value2) {
            addCriterion("EG05BJ13 not between", value1, value2, "eg05bj13");
            return (Criteria) this;
        }

        public Criteria andEg05bj14IsNull() {
            addCriterion("EG05BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj14IsNotNull() {
            addCriterion("EG05BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj14EqualTo(String value) {
            addCriterion("EG05BJ14 =", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14NotEqualTo(String value) {
            addCriterion("EG05BJ14 <>", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14GreaterThan(String value) {
            addCriterion("EG05BJ14 >", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ14 >=", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14LessThan(String value) {
            addCriterion("EG05BJ14 <", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ14 <=", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14Like(String value) {
            addCriterion("EG05BJ14 like", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14NotLike(String value) {
            addCriterion("EG05BJ14 not like", value, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14In(List<String> values) {
            addCriterion("EG05BJ14 in", values, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14NotIn(List<String> values) {
            addCriterion("EG05BJ14 not in", values, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14Between(String value1, String value2) {
            addCriterion("EG05BJ14 between", value1, value2, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj14NotBetween(String value1, String value2) {
            addCriterion("EG05BJ14 not between", value1, value2, "eg05bj14");
            return (Criteria) this;
        }

        public Criteria andEg05bj15IsNull() {
            addCriterion("EG05BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj15IsNotNull() {
            addCriterion("EG05BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj15EqualTo(String value) {
            addCriterion("EG05BJ15 =", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15NotEqualTo(String value) {
            addCriterion("EG05BJ15 <>", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15GreaterThan(String value) {
            addCriterion("EG05BJ15 >", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ15 >=", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15LessThan(String value) {
            addCriterion("EG05BJ15 <", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ15 <=", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15Like(String value) {
            addCriterion("EG05BJ15 like", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15NotLike(String value) {
            addCriterion("EG05BJ15 not like", value, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15In(List<String> values) {
            addCriterion("EG05BJ15 in", values, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15NotIn(List<String> values) {
            addCriterion("EG05BJ15 not in", values, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15Between(String value1, String value2) {
            addCriterion("EG05BJ15 between", value1, value2, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj15NotBetween(String value1, String value2) {
            addCriterion("EG05BJ15 not between", value1, value2, "eg05bj15");
            return (Criteria) this;
        }

        public Criteria andEg05bj16IsNull() {
            addCriterion("EG05BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj16IsNotNull() {
            addCriterion("EG05BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj16EqualTo(String value) {
            addCriterion("EG05BJ16 =", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16NotEqualTo(String value) {
            addCriterion("EG05BJ16 <>", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16GreaterThan(String value) {
            addCriterion("EG05BJ16 >", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ16 >=", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16LessThan(String value) {
            addCriterion("EG05BJ16 <", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ16 <=", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16Like(String value) {
            addCriterion("EG05BJ16 like", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16NotLike(String value) {
            addCriterion("EG05BJ16 not like", value, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16In(List<String> values) {
            addCriterion("EG05BJ16 in", values, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16NotIn(List<String> values) {
            addCriterion("EG05BJ16 not in", values, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16Between(String value1, String value2) {
            addCriterion("EG05BJ16 between", value1, value2, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj16NotBetween(String value1, String value2) {
            addCriterion("EG05BJ16 not between", value1, value2, "eg05bj16");
            return (Criteria) this;
        }

        public Criteria andEg05bj17IsNull() {
            addCriterion("EG05BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj17IsNotNull() {
            addCriterion("EG05BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj17EqualTo(String value) {
            addCriterion("EG05BJ17 =", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17NotEqualTo(String value) {
            addCriterion("EG05BJ17 <>", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17GreaterThan(String value) {
            addCriterion("EG05BJ17 >", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ17 >=", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17LessThan(String value) {
            addCriterion("EG05BJ17 <", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ17 <=", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17Like(String value) {
            addCriterion("EG05BJ17 like", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17NotLike(String value) {
            addCriterion("EG05BJ17 not like", value, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17In(List<String> values) {
            addCriterion("EG05BJ17 in", values, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17NotIn(List<String> values) {
            addCriterion("EG05BJ17 not in", values, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17Between(String value1, String value2) {
            addCriterion("EG05BJ17 between", value1, value2, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj17NotBetween(String value1, String value2) {
            addCriterion("EG05BJ17 not between", value1, value2, "eg05bj17");
            return (Criteria) this;
        }

        public Criteria andEg05bj18IsNull() {
            addCriterion("EG05BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj18IsNotNull() {
            addCriterion("EG05BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj18EqualTo(String value) {
            addCriterion("EG05BJ18 =", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18NotEqualTo(String value) {
            addCriterion("EG05BJ18 <>", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18GreaterThan(String value) {
            addCriterion("EG05BJ18 >", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ18 >=", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18LessThan(String value) {
            addCriterion("EG05BJ18 <", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ18 <=", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18Like(String value) {
            addCriterion("EG05BJ18 like", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18NotLike(String value) {
            addCriterion("EG05BJ18 not like", value, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18In(List<String> values) {
            addCriterion("EG05BJ18 in", values, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18NotIn(List<String> values) {
            addCriterion("EG05BJ18 not in", values, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18Between(String value1, String value2) {
            addCriterion("EG05BJ18 between", value1, value2, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj18NotBetween(String value1, String value2) {
            addCriterion("EG05BJ18 not between", value1, value2, "eg05bj18");
            return (Criteria) this;
        }

        public Criteria andEg05bj19IsNull() {
            addCriterion("EG05BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj19IsNotNull() {
            addCriterion("EG05BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj19EqualTo(String value) {
            addCriterion("EG05BJ19 =", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19NotEqualTo(String value) {
            addCriterion("EG05BJ19 <>", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19GreaterThan(String value) {
            addCriterion("EG05BJ19 >", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ19 >=", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19LessThan(String value) {
            addCriterion("EG05BJ19 <", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ19 <=", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19Like(String value) {
            addCriterion("EG05BJ19 like", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19NotLike(String value) {
            addCriterion("EG05BJ19 not like", value, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19In(List<String> values) {
            addCriterion("EG05BJ19 in", values, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19NotIn(List<String> values) {
            addCriterion("EG05BJ19 not in", values, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19Between(String value1, String value2) {
            addCriterion("EG05BJ19 between", value1, value2, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj19NotBetween(String value1, String value2) {
            addCriterion("EG05BJ19 not between", value1, value2, "eg05bj19");
            return (Criteria) this;
        }

        public Criteria andEg05bj20IsNull() {
            addCriterion("EG05BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj20IsNotNull() {
            addCriterion("EG05BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj20EqualTo(String value) {
            addCriterion("EG05BJ20 =", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20NotEqualTo(String value) {
            addCriterion("EG05BJ20 <>", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20GreaterThan(String value) {
            addCriterion("EG05BJ20 >", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ20 >=", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20LessThan(String value) {
            addCriterion("EG05BJ20 <", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ20 <=", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20Like(String value) {
            addCriterion("EG05BJ20 like", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20NotLike(String value) {
            addCriterion("EG05BJ20 not like", value, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20In(List<String> values) {
            addCriterion("EG05BJ20 in", values, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20NotIn(List<String> values) {
            addCriterion("EG05BJ20 not in", values, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20Between(String value1, String value2) {
            addCriterion("EG05BJ20 between", value1, value2, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj20NotBetween(String value1, String value2) {
            addCriterion("EG05BJ20 not between", value1, value2, "eg05bj20");
            return (Criteria) this;
        }

        public Criteria andEg05bj21IsNull() {
            addCriterion("EG05BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj21IsNotNull() {
            addCriterion("EG05BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj21EqualTo(String value) {
            addCriterion("EG05BJ21 =", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21NotEqualTo(String value) {
            addCriterion("EG05BJ21 <>", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21GreaterThan(String value) {
            addCriterion("EG05BJ21 >", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ21 >=", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21LessThan(String value) {
            addCriterion("EG05BJ21 <", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ21 <=", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21Like(String value) {
            addCriterion("EG05BJ21 like", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21NotLike(String value) {
            addCriterion("EG05BJ21 not like", value, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21In(List<String> values) {
            addCriterion("EG05BJ21 in", values, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21NotIn(List<String> values) {
            addCriterion("EG05BJ21 not in", values, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21Between(String value1, String value2) {
            addCriterion("EG05BJ21 between", value1, value2, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj21NotBetween(String value1, String value2) {
            addCriterion("EG05BJ21 not between", value1, value2, "eg05bj21");
            return (Criteria) this;
        }

        public Criteria andEg05bj22IsNull() {
            addCriterion("EG05BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj22IsNotNull() {
            addCriterion("EG05BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj22EqualTo(String value) {
            addCriterion("EG05BJ22 =", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22NotEqualTo(String value) {
            addCriterion("EG05BJ22 <>", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22GreaterThan(String value) {
            addCriterion("EG05BJ22 >", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ22 >=", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22LessThan(String value) {
            addCriterion("EG05BJ22 <", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ22 <=", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22Like(String value) {
            addCriterion("EG05BJ22 like", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22NotLike(String value) {
            addCriterion("EG05BJ22 not like", value, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22In(List<String> values) {
            addCriterion("EG05BJ22 in", values, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22NotIn(List<String> values) {
            addCriterion("EG05BJ22 not in", values, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22Between(String value1, String value2) {
            addCriterion("EG05BJ22 between", value1, value2, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj22NotBetween(String value1, String value2) {
            addCriterion("EG05BJ22 not between", value1, value2, "eg05bj22");
            return (Criteria) this;
        }

        public Criteria andEg05bj23IsNull() {
            addCriterion("EG05BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj23IsNotNull() {
            addCriterion("EG05BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj23EqualTo(String value) {
            addCriterion("EG05BJ23 =", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23NotEqualTo(String value) {
            addCriterion("EG05BJ23 <>", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23GreaterThan(String value) {
            addCriterion("EG05BJ23 >", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ23 >=", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23LessThan(String value) {
            addCriterion("EG05BJ23 <", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ23 <=", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23Like(String value) {
            addCriterion("EG05BJ23 like", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23NotLike(String value) {
            addCriterion("EG05BJ23 not like", value, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23In(List<String> values) {
            addCriterion("EG05BJ23 in", values, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23NotIn(List<String> values) {
            addCriterion("EG05BJ23 not in", values, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23Between(String value1, String value2) {
            addCriterion("EG05BJ23 between", value1, value2, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj23NotBetween(String value1, String value2) {
            addCriterion("EG05BJ23 not between", value1, value2, "eg05bj23");
            return (Criteria) this;
        }

        public Criteria andEg05bj24IsNull() {
            addCriterion("EG05BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj24IsNotNull() {
            addCriterion("EG05BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj24EqualTo(String value) {
            addCriterion("EG05BJ24 =", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24NotEqualTo(String value) {
            addCriterion("EG05BJ24 <>", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24GreaterThan(String value) {
            addCriterion("EG05BJ24 >", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ24 >=", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24LessThan(String value) {
            addCriterion("EG05BJ24 <", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ24 <=", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24Like(String value) {
            addCriterion("EG05BJ24 like", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24NotLike(String value) {
            addCriterion("EG05BJ24 not like", value, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24In(List<String> values) {
            addCriterion("EG05BJ24 in", values, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24NotIn(List<String> values) {
            addCriterion("EG05BJ24 not in", values, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24Between(String value1, String value2) {
            addCriterion("EG05BJ24 between", value1, value2, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj24NotBetween(String value1, String value2) {
            addCriterion("EG05BJ24 not between", value1, value2, "eg05bj24");
            return (Criteria) this;
        }

        public Criteria andEg05bj25IsNull() {
            addCriterion("EG05BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj25IsNotNull() {
            addCriterion("EG05BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj25EqualTo(String value) {
            addCriterion("EG05BJ25 =", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25NotEqualTo(String value) {
            addCriterion("EG05BJ25 <>", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25GreaterThan(String value) {
            addCriterion("EG05BJ25 >", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ25 >=", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25LessThan(String value) {
            addCriterion("EG05BJ25 <", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ25 <=", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25Like(String value) {
            addCriterion("EG05BJ25 like", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25NotLike(String value) {
            addCriterion("EG05BJ25 not like", value, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25In(List<String> values) {
            addCriterion("EG05BJ25 in", values, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25NotIn(List<String> values) {
            addCriterion("EG05BJ25 not in", values, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25Between(String value1, String value2) {
            addCriterion("EG05BJ25 between", value1, value2, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj25NotBetween(String value1, String value2) {
            addCriterion("EG05BJ25 not between", value1, value2, "eg05bj25");
            return (Criteria) this;
        }

        public Criteria andEg05bj26IsNull() {
            addCriterion("EG05BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj26IsNotNull() {
            addCriterion("EG05BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj26EqualTo(String value) {
            addCriterion("EG05BJ26 =", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26NotEqualTo(String value) {
            addCriterion("EG05BJ26 <>", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26GreaterThan(String value) {
            addCriterion("EG05BJ26 >", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ26 >=", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26LessThan(String value) {
            addCriterion("EG05BJ26 <", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ26 <=", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26Like(String value) {
            addCriterion("EG05BJ26 like", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26NotLike(String value) {
            addCriterion("EG05BJ26 not like", value, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26In(List<String> values) {
            addCriterion("EG05BJ26 in", values, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26NotIn(List<String> values) {
            addCriterion("EG05BJ26 not in", values, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26Between(String value1, String value2) {
            addCriterion("EG05BJ26 between", value1, value2, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj26NotBetween(String value1, String value2) {
            addCriterion("EG05BJ26 not between", value1, value2, "eg05bj26");
            return (Criteria) this;
        }

        public Criteria andEg05bj27IsNull() {
            addCriterion("EG05BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj27IsNotNull() {
            addCriterion("EG05BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj27EqualTo(String value) {
            addCriterion("EG05BJ27 =", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27NotEqualTo(String value) {
            addCriterion("EG05BJ27 <>", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27GreaterThan(String value) {
            addCriterion("EG05BJ27 >", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ27 >=", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27LessThan(String value) {
            addCriterion("EG05BJ27 <", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ27 <=", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27Like(String value) {
            addCriterion("EG05BJ27 like", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27NotLike(String value) {
            addCriterion("EG05BJ27 not like", value, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27In(List<String> values) {
            addCriterion("EG05BJ27 in", values, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27NotIn(List<String> values) {
            addCriterion("EG05BJ27 not in", values, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27Between(String value1, String value2) {
            addCriterion("EG05BJ27 between", value1, value2, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj27NotBetween(String value1, String value2) {
            addCriterion("EG05BJ27 not between", value1, value2, "eg05bj27");
            return (Criteria) this;
        }

        public Criteria andEg05bj28IsNull() {
            addCriterion("EG05BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj28IsNotNull() {
            addCriterion("EG05BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj28EqualTo(String value) {
            addCriterion("EG05BJ28 =", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28NotEqualTo(String value) {
            addCriterion("EG05BJ28 <>", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28GreaterThan(String value) {
            addCriterion("EG05BJ28 >", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ28 >=", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28LessThan(String value) {
            addCriterion("EG05BJ28 <", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ28 <=", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28Like(String value) {
            addCriterion("EG05BJ28 like", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28NotLike(String value) {
            addCriterion("EG05BJ28 not like", value, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28In(List<String> values) {
            addCriterion("EG05BJ28 in", values, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28NotIn(List<String> values) {
            addCriterion("EG05BJ28 not in", values, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28Between(String value1, String value2) {
            addCriterion("EG05BJ28 between", value1, value2, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj28NotBetween(String value1, String value2) {
            addCriterion("EG05BJ28 not between", value1, value2, "eg05bj28");
            return (Criteria) this;
        }

        public Criteria andEg05bj29IsNull() {
            addCriterion("EG05BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj29IsNotNull() {
            addCriterion("EG05BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj29EqualTo(String value) {
            addCriterion("EG05BJ29 =", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29NotEqualTo(String value) {
            addCriterion("EG05BJ29 <>", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29GreaterThan(String value) {
            addCriterion("EG05BJ29 >", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ29 >=", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29LessThan(String value) {
            addCriterion("EG05BJ29 <", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ29 <=", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29Like(String value) {
            addCriterion("EG05BJ29 like", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29NotLike(String value) {
            addCriterion("EG05BJ29 not like", value, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29In(List<String> values) {
            addCriterion("EG05BJ29 in", values, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29NotIn(List<String> values) {
            addCriterion("EG05BJ29 not in", values, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29Between(String value1, String value2) {
            addCriterion("EG05BJ29 between", value1, value2, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj29NotBetween(String value1, String value2) {
            addCriterion("EG05BJ29 not between", value1, value2, "eg05bj29");
            return (Criteria) this;
        }

        public Criteria andEg05bj30IsNull() {
            addCriterion("EG05BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj30IsNotNull() {
            addCriterion("EG05BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj30EqualTo(String value) {
            addCriterion("EG05BJ30 =", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30NotEqualTo(String value) {
            addCriterion("EG05BJ30 <>", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30GreaterThan(String value) {
            addCriterion("EG05BJ30 >", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ30 >=", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30LessThan(String value) {
            addCriterion("EG05BJ30 <", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ30 <=", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30Like(String value) {
            addCriterion("EG05BJ30 like", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30NotLike(String value) {
            addCriterion("EG05BJ30 not like", value, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30In(List<String> values) {
            addCriterion("EG05BJ30 in", values, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30NotIn(List<String> values) {
            addCriterion("EG05BJ30 not in", values, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30Between(String value1, String value2) {
            addCriterion("EG05BJ30 between", value1, value2, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj30NotBetween(String value1, String value2) {
            addCriterion("EG05BJ30 not between", value1, value2, "eg05bj30");
            return (Criteria) this;
        }

        public Criteria andEg05bj31IsNull() {
            addCriterion("EG05BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj31IsNotNull() {
            addCriterion("EG05BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj31EqualTo(String value) {
            addCriterion("EG05BJ31 =", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31NotEqualTo(String value) {
            addCriterion("EG05BJ31 <>", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31GreaterThan(String value) {
            addCriterion("EG05BJ31 >", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ31 >=", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31LessThan(String value) {
            addCriterion("EG05BJ31 <", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ31 <=", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31Like(String value) {
            addCriterion("EG05BJ31 like", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31NotLike(String value) {
            addCriterion("EG05BJ31 not like", value, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31In(List<String> values) {
            addCriterion("EG05BJ31 in", values, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31NotIn(List<String> values) {
            addCriterion("EG05BJ31 not in", values, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31Between(String value1, String value2) {
            addCriterion("EG05BJ31 between", value1, value2, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj31NotBetween(String value1, String value2) {
            addCriterion("EG05BJ31 not between", value1, value2, "eg05bj31");
            return (Criteria) this;
        }

        public Criteria andEg05bj32IsNull() {
            addCriterion("EG05BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj32IsNotNull() {
            addCriterion("EG05BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj32EqualTo(String value) {
            addCriterion("EG05BJ32 =", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32NotEqualTo(String value) {
            addCriterion("EG05BJ32 <>", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32GreaterThan(String value) {
            addCriterion("EG05BJ32 >", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ32 >=", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32LessThan(String value) {
            addCriterion("EG05BJ32 <", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ32 <=", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32Like(String value) {
            addCriterion("EG05BJ32 like", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32NotLike(String value) {
            addCriterion("EG05BJ32 not like", value, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32In(List<String> values) {
            addCriterion("EG05BJ32 in", values, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32NotIn(List<String> values) {
            addCriterion("EG05BJ32 not in", values, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32Between(String value1, String value2) {
            addCriterion("EG05BJ32 between", value1, value2, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj32NotBetween(String value1, String value2) {
            addCriterion("EG05BJ32 not between", value1, value2, "eg05bj32");
            return (Criteria) this;
        }

        public Criteria andEg05bj33IsNull() {
            addCriterion("EG05BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj33IsNotNull() {
            addCriterion("EG05BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj33EqualTo(String value) {
            addCriterion("EG05BJ33 =", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33NotEqualTo(String value) {
            addCriterion("EG05BJ33 <>", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33GreaterThan(String value) {
            addCriterion("EG05BJ33 >", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ33 >=", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33LessThan(String value) {
            addCriterion("EG05BJ33 <", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ33 <=", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33Like(String value) {
            addCriterion("EG05BJ33 like", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33NotLike(String value) {
            addCriterion("EG05BJ33 not like", value, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33In(List<String> values) {
            addCriterion("EG05BJ33 in", values, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33NotIn(List<String> values) {
            addCriterion("EG05BJ33 not in", values, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33Between(String value1, String value2) {
            addCriterion("EG05BJ33 between", value1, value2, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj33NotBetween(String value1, String value2) {
            addCriterion("EG05BJ33 not between", value1, value2, "eg05bj33");
            return (Criteria) this;
        }

        public Criteria andEg05bj34IsNull() {
            addCriterion("EG05BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj34IsNotNull() {
            addCriterion("EG05BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj34EqualTo(String value) {
            addCriterion("EG05BJ34 =", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34NotEqualTo(String value) {
            addCriterion("EG05BJ34 <>", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34GreaterThan(String value) {
            addCriterion("EG05BJ34 >", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ34 >=", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34LessThan(String value) {
            addCriterion("EG05BJ34 <", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ34 <=", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34Like(String value) {
            addCriterion("EG05BJ34 like", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34NotLike(String value) {
            addCriterion("EG05BJ34 not like", value, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34In(List<String> values) {
            addCriterion("EG05BJ34 in", values, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34NotIn(List<String> values) {
            addCriterion("EG05BJ34 not in", values, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34Between(String value1, String value2) {
            addCriterion("EG05BJ34 between", value1, value2, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj34NotBetween(String value1, String value2) {
            addCriterion("EG05BJ34 not between", value1, value2, "eg05bj34");
            return (Criteria) this;
        }

        public Criteria andEg05bj35IsNull() {
            addCriterion("EG05BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj35IsNotNull() {
            addCriterion("EG05BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj35EqualTo(String value) {
            addCriterion("EG05BJ35 =", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35NotEqualTo(String value) {
            addCriterion("EG05BJ35 <>", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35GreaterThan(String value) {
            addCriterion("EG05BJ35 >", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ35 >=", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35LessThan(String value) {
            addCriterion("EG05BJ35 <", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ35 <=", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35Like(String value) {
            addCriterion("EG05BJ35 like", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35NotLike(String value) {
            addCriterion("EG05BJ35 not like", value, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35In(List<String> values) {
            addCriterion("EG05BJ35 in", values, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35NotIn(List<String> values) {
            addCriterion("EG05BJ35 not in", values, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35Between(String value1, String value2) {
            addCriterion("EG05BJ35 between", value1, value2, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj35NotBetween(String value1, String value2) {
            addCriterion("EG05BJ35 not between", value1, value2, "eg05bj35");
            return (Criteria) this;
        }

        public Criteria andEg05bj36IsNull() {
            addCriterion("EG05BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj36IsNotNull() {
            addCriterion("EG05BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj36EqualTo(String value) {
            addCriterion("EG05BJ36 =", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36NotEqualTo(String value) {
            addCriterion("EG05BJ36 <>", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36GreaterThan(String value) {
            addCriterion("EG05BJ36 >", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ36 >=", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36LessThan(String value) {
            addCriterion("EG05BJ36 <", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ36 <=", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36Like(String value) {
            addCriterion("EG05BJ36 like", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36NotLike(String value) {
            addCriterion("EG05BJ36 not like", value, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36In(List<String> values) {
            addCriterion("EG05BJ36 in", values, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36NotIn(List<String> values) {
            addCriterion("EG05BJ36 not in", values, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36Between(String value1, String value2) {
            addCriterion("EG05BJ36 between", value1, value2, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj36NotBetween(String value1, String value2) {
            addCriterion("EG05BJ36 not between", value1, value2, "eg05bj36");
            return (Criteria) this;
        }

        public Criteria andEg05bj37IsNull() {
            addCriterion("EG05BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj37IsNotNull() {
            addCriterion("EG05BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj37EqualTo(String value) {
            addCriterion("EG05BJ37 =", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37NotEqualTo(String value) {
            addCriterion("EG05BJ37 <>", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37GreaterThan(String value) {
            addCriterion("EG05BJ37 >", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ37 >=", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37LessThan(String value) {
            addCriterion("EG05BJ37 <", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ37 <=", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37Like(String value) {
            addCriterion("EG05BJ37 like", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37NotLike(String value) {
            addCriterion("EG05BJ37 not like", value, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37In(List<String> values) {
            addCriterion("EG05BJ37 in", values, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37NotIn(List<String> values) {
            addCriterion("EG05BJ37 not in", values, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37Between(String value1, String value2) {
            addCriterion("EG05BJ37 between", value1, value2, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj37NotBetween(String value1, String value2) {
            addCriterion("EG05BJ37 not between", value1, value2, "eg05bj37");
            return (Criteria) this;
        }

        public Criteria andEg05bj38IsNull() {
            addCriterion("EG05BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj38IsNotNull() {
            addCriterion("EG05BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj38EqualTo(String value) {
            addCriterion("EG05BJ38 =", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38NotEqualTo(String value) {
            addCriterion("EG05BJ38 <>", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38GreaterThan(String value) {
            addCriterion("EG05BJ38 >", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ38 >=", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38LessThan(String value) {
            addCriterion("EG05BJ38 <", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ38 <=", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38Like(String value) {
            addCriterion("EG05BJ38 like", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38NotLike(String value) {
            addCriterion("EG05BJ38 not like", value, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38In(List<String> values) {
            addCriterion("EG05BJ38 in", values, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38NotIn(List<String> values) {
            addCriterion("EG05BJ38 not in", values, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38Between(String value1, String value2) {
            addCriterion("EG05BJ38 between", value1, value2, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj38NotBetween(String value1, String value2) {
            addCriterion("EG05BJ38 not between", value1, value2, "eg05bj38");
            return (Criteria) this;
        }

        public Criteria andEg05bj39IsNull() {
            addCriterion("EG05BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj39IsNotNull() {
            addCriterion("EG05BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj39EqualTo(String value) {
            addCriterion("EG05BJ39 =", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39NotEqualTo(String value) {
            addCriterion("EG05BJ39 <>", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39GreaterThan(String value) {
            addCriterion("EG05BJ39 >", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ39 >=", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39LessThan(String value) {
            addCriterion("EG05BJ39 <", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ39 <=", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39Like(String value) {
            addCriterion("EG05BJ39 like", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39NotLike(String value) {
            addCriterion("EG05BJ39 not like", value, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39In(List<String> values) {
            addCriterion("EG05BJ39 in", values, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39NotIn(List<String> values) {
            addCriterion("EG05BJ39 not in", values, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39Between(String value1, String value2) {
            addCriterion("EG05BJ39 between", value1, value2, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj39NotBetween(String value1, String value2) {
            addCriterion("EG05BJ39 not between", value1, value2, "eg05bj39");
            return (Criteria) this;
        }

        public Criteria andEg05bj40IsNull() {
            addCriterion("EG05BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj40IsNotNull() {
            addCriterion("EG05BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj40EqualTo(String value) {
            addCriterion("EG05BJ40 =", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40NotEqualTo(String value) {
            addCriterion("EG05BJ40 <>", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40GreaterThan(String value) {
            addCriterion("EG05BJ40 >", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ40 >=", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40LessThan(String value) {
            addCriterion("EG05BJ40 <", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ40 <=", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40Like(String value) {
            addCriterion("EG05BJ40 like", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40NotLike(String value) {
            addCriterion("EG05BJ40 not like", value, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40In(List<String> values) {
            addCriterion("EG05BJ40 in", values, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40NotIn(List<String> values) {
            addCriterion("EG05BJ40 not in", values, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40Between(String value1, String value2) {
            addCriterion("EG05BJ40 between", value1, value2, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj40NotBetween(String value1, String value2) {
            addCriterion("EG05BJ40 not between", value1, value2, "eg05bj40");
            return (Criteria) this;
        }

        public Criteria andEg05bj41IsNull() {
            addCriterion("EG05BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj41IsNotNull() {
            addCriterion("EG05BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj41EqualTo(String value) {
            addCriterion("EG05BJ41 =", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41NotEqualTo(String value) {
            addCriterion("EG05BJ41 <>", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41GreaterThan(String value) {
            addCriterion("EG05BJ41 >", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ41 >=", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41LessThan(String value) {
            addCriterion("EG05BJ41 <", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ41 <=", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41Like(String value) {
            addCriterion("EG05BJ41 like", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41NotLike(String value) {
            addCriterion("EG05BJ41 not like", value, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41In(List<String> values) {
            addCriterion("EG05BJ41 in", values, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41NotIn(List<String> values) {
            addCriterion("EG05BJ41 not in", values, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41Between(String value1, String value2) {
            addCriterion("EG05BJ41 between", value1, value2, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj41NotBetween(String value1, String value2) {
            addCriterion("EG05BJ41 not between", value1, value2, "eg05bj41");
            return (Criteria) this;
        }

        public Criteria andEg05bj42IsNull() {
            addCriterion("EG05BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj42IsNotNull() {
            addCriterion("EG05BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj42EqualTo(String value) {
            addCriterion("EG05BJ42 =", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42NotEqualTo(String value) {
            addCriterion("EG05BJ42 <>", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42GreaterThan(String value) {
            addCriterion("EG05BJ42 >", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ42 >=", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42LessThan(String value) {
            addCriterion("EG05BJ42 <", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ42 <=", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42Like(String value) {
            addCriterion("EG05BJ42 like", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42NotLike(String value) {
            addCriterion("EG05BJ42 not like", value, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42In(List<String> values) {
            addCriterion("EG05BJ42 in", values, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42NotIn(List<String> values) {
            addCriterion("EG05BJ42 not in", values, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42Between(String value1, String value2) {
            addCriterion("EG05BJ42 between", value1, value2, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj42NotBetween(String value1, String value2) {
            addCriterion("EG05BJ42 not between", value1, value2, "eg05bj42");
            return (Criteria) this;
        }

        public Criteria andEg05bj43IsNull() {
            addCriterion("EG05BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj43IsNotNull() {
            addCriterion("EG05BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj43EqualTo(String value) {
            addCriterion("EG05BJ43 =", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43NotEqualTo(String value) {
            addCriterion("EG05BJ43 <>", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43GreaterThan(String value) {
            addCriterion("EG05BJ43 >", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ43 >=", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43LessThan(String value) {
            addCriterion("EG05BJ43 <", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ43 <=", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43Like(String value) {
            addCriterion("EG05BJ43 like", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43NotLike(String value) {
            addCriterion("EG05BJ43 not like", value, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43In(List<String> values) {
            addCriterion("EG05BJ43 in", values, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43NotIn(List<String> values) {
            addCriterion("EG05BJ43 not in", values, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43Between(String value1, String value2) {
            addCriterion("EG05BJ43 between", value1, value2, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj43NotBetween(String value1, String value2) {
            addCriterion("EG05BJ43 not between", value1, value2, "eg05bj43");
            return (Criteria) this;
        }

        public Criteria andEg05bj44IsNull() {
            addCriterion("EG05BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj44IsNotNull() {
            addCriterion("EG05BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj44EqualTo(String value) {
            addCriterion("EG05BJ44 =", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44NotEqualTo(String value) {
            addCriterion("EG05BJ44 <>", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44GreaterThan(String value) {
            addCriterion("EG05BJ44 >", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ44 >=", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44LessThan(String value) {
            addCriterion("EG05BJ44 <", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ44 <=", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44Like(String value) {
            addCriterion("EG05BJ44 like", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44NotLike(String value) {
            addCriterion("EG05BJ44 not like", value, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44In(List<String> values) {
            addCriterion("EG05BJ44 in", values, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44NotIn(List<String> values) {
            addCriterion("EG05BJ44 not in", values, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44Between(String value1, String value2) {
            addCriterion("EG05BJ44 between", value1, value2, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj44NotBetween(String value1, String value2) {
            addCriterion("EG05BJ44 not between", value1, value2, "eg05bj44");
            return (Criteria) this;
        }

        public Criteria andEg05bj45IsNull() {
            addCriterion("EG05BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj45IsNotNull() {
            addCriterion("EG05BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj45EqualTo(String value) {
            addCriterion("EG05BJ45 =", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45NotEqualTo(String value) {
            addCriterion("EG05BJ45 <>", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45GreaterThan(String value) {
            addCriterion("EG05BJ45 >", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ45 >=", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45LessThan(String value) {
            addCriterion("EG05BJ45 <", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ45 <=", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45Like(String value) {
            addCriterion("EG05BJ45 like", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45NotLike(String value) {
            addCriterion("EG05BJ45 not like", value, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45In(List<String> values) {
            addCriterion("EG05BJ45 in", values, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45NotIn(List<String> values) {
            addCriterion("EG05BJ45 not in", values, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45Between(String value1, String value2) {
            addCriterion("EG05BJ45 between", value1, value2, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj45NotBetween(String value1, String value2) {
            addCriterion("EG05BJ45 not between", value1, value2, "eg05bj45");
            return (Criteria) this;
        }

        public Criteria andEg05bj46IsNull() {
            addCriterion("EG05BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj46IsNotNull() {
            addCriterion("EG05BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj46EqualTo(String value) {
            addCriterion("EG05BJ46 =", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46NotEqualTo(String value) {
            addCriterion("EG05BJ46 <>", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46GreaterThan(String value) {
            addCriterion("EG05BJ46 >", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ46 >=", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46LessThan(String value) {
            addCriterion("EG05BJ46 <", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ46 <=", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46Like(String value) {
            addCriterion("EG05BJ46 like", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46NotLike(String value) {
            addCriterion("EG05BJ46 not like", value, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46In(List<String> values) {
            addCriterion("EG05BJ46 in", values, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46NotIn(List<String> values) {
            addCriterion("EG05BJ46 not in", values, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46Between(String value1, String value2) {
            addCriterion("EG05BJ46 between", value1, value2, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj46NotBetween(String value1, String value2) {
            addCriterion("EG05BJ46 not between", value1, value2, "eg05bj46");
            return (Criteria) this;
        }

        public Criteria andEg05bj47IsNull() {
            addCriterion("EG05BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj47IsNotNull() {
            addCriterion("EG05BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj47EqualTo(String value) {
            addCriterion("EG05BJ47 =", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47NotEqualTo(String value) {
            addCriterion("EG05BJ47 <>", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47GreaterThan(String value) {
            addCriterion("EG05BJ47 >", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ47 >=", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47LessThan(String value) {
            addCriterion("EG05BJ47 <", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ47 <=", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47Like(String value) {
            addCriterion("EG05BJ47 like", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47NotLike(String value) {
            addCriterion("EG05BJ47 not like", value, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47In(List<String> values) {
            addCriterion("EG05BJ47 in", values, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47NotIn(List<String> values) {
            addCriterion("EG05BJ47 not in", values, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47Between(String value1, String value2) {
            addCriterion("EG05BJ47 between", value1, value2, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj47NotBetween(String value1, String value2) {
            addCriterion("EG05BJ47 not between", value1, value2, "eg05bj47");
            return (Criteria) this;
        }

        public Criteria andEg05bj48IsNull() {
            addCriterion("EG05BJ48 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj48IsNotNull() {
            addCriterion("EG05BJ48 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj48EqualTo(String value) {
            addCriterion("EG05BJ48 =", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48NotEqualTo(String value) {
            addCriterion("EG05BJ48 <>", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48GreaterThan(String value) {
            addCriterion("EG05BJ48 >", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ48 >=", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48LessThan(String value) {
            addCriterion("EG05BJ48 <", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ48 <=", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48Like(String value) {
            addCriterion("EG05BJ48 like", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48NotLike(String value) {
            addCriterion("EG05BJ48 not like", value, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48In(List<String> values) {
            addCriterion("EG05BJ48 in", values, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48NotIn(List<String> values) {
            addCriterion("EG05BJ48 not in", values, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48Between(String value1, String value2) {
            addCriterion("EG05BJ48 between", value1, value2, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj48NotBetween(String value1, String value2) {
            addCriterion("EG05BJ48 not between", value1, value2, "eg05bj48");
            return (Criteria) this;
        }

        public Criteria andEg05bj49IsNull() {
            addCriterion("EG05BJ49 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj49IsNotNull() {
            addCriterion("EG05BJ49 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj49EqualTo(String value) {
            addCriterion("EG05BJ49 =", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49NotEqualTo(String value) {
            addCriterion("EG05BJ49 <>", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49GreaterThan(String value) {
            addCriterion("EG05BJ49 >", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ49 >=", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49LessThan(String value) {
            addCriterion("EG05BJ49 <", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ49 <=", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49Like(String value) {
            addCriterion("EG05BJ49 like", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49NotLike(String value) {
            addCriterion("EG05BJ49 not like", value, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49In(List<String> values) {
            addCriterion("EG05BJ49 in", values, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49NotIn(List<String> values) {
            addCriterion("EG05BJ49 not in", values, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49Between(String value1, String value2) {
            addCriterion("EG05BJ49 between", value1, value2, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj49NotBetween(String value1, String value2) {
            addCriterion("EG05BJ49 not between", value1, value2, "eg05bj49");
            return (Criteria) this;
        }

        public Criteria andEg05bj50IsNull() {
            addCriterion("EG05BJ50 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj50IsNotNull() {
            addCriterion("EG05BJ50 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj50EqualTo(String value) {
            addCriterion("EG05BJ50 =", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50NotEqualTo(String value) {
            addCriterion("EG05BJ50 <>", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50GreaterThan(String value) {
            addCriterion("EG05BJ50 >", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ50 >=", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50LessThan(String value) {
            addCriterion("EG05BJ50 <", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ50 <=", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50Like(String value) {
            addCriterion("EG05BJ50 like", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50NotLike(String value) {
            addCriterion("EG05BJ50 not like", value, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50In(List<String> values) {
            addCriterion("EG05BJ50 in", values, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50NotIn(List<String> values) {
            addCriterion("EG05BJ50 not in", values, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50Between(String value1, String value2) {
            addCriterion("EG05BJ50 between", value1, value2, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj50NotBetween(String value1, String value2) {
            addCriterion("EG05BJ50 not between", value1, value2, "eg05bj50");
            return (Criteria) this;
        }

        public Criteria andEg05bj51IsNull() {
            addCriterion("EG05BJ51 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj51IsNotNull() {
            addCriterion("EG05BJ51 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj51EqualTo(String value) {
            addCriterion("EG05BJ51 =", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51NotEqualTo(String value) {
            addCriterion("EG05BJ51 <>", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51GreaterThan(String value) {
            addCriterion("EG05BJ51 >", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ51 >=", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51LessThan(String value) {
            addCriterion("EG05BJ51 <", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ51 <=", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51Like(String value) {
            addCriterion("EG05BJ51 like", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51NotLike(String value) {
            addCriterion("EG05BJ51 not like", value, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51In(List<String> values) {
            addCriterion("EG05BJ51 in", values, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51NotIn(List<String> values) {
            addCriterion("EG05BJ51 not in", values, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51Between(String value1, String value2) {
            addCriterion("EG05BJ51 between", value1, value2, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj51NotBetween(String value1, String value2) {
            addCriterion("EG05BJ51 not between", value1, value2, "eg05bj51");
            return (Criteria) this;
        }

        public Criteria andEg05bj52IsNull() {
            addCriterion("EG05BJ52 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj52IsNotNull() {
            addCriterion("EG05BJ52 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj52EqualTo(String value) {
            addCriterion("EG05BJ52 =", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52NotEqualTo(String value) {
            addCriterion("EG05BJ52 <>", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52GreaterThan(String value) {
            addCriterion("EG05BJ52 >", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ52 >=", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52LessThan(String value) {
            addCriterion("EG05BJ52 <", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ52 <=", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52Like(String value) {
            addCriterion("EG05BJ52 like", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52NotLike(String value) {
            addCriterion("EG05BJ52 not like", value, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52In(List<String> values) {
            addCriterion("EG05BJ52 in", values, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52NotIn(List<String> values) {
            addCriterion("EG05BJ52 not in", values, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52Between(String value1, String value2) {
            addCriterion("EG05BJ52 between", value1, value2, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj52NotBetween(String value1, String value2) {
            addCriterion("EG05BJ52 not between", value1, value2, "eg05bj52");
            return (Criteria) this;
        }

        public Criteria andEg05bj53IsNull() {
            addCriterion("EG05BJ53 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj53IsNotNull() {
            addCriterion("EG05BJ53 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj53EqualTo(String value) {
            addCriterion("EG05BJ53 =", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53NotEqualTo(String value) {
            addCriterion("EG05BJ53 <>", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53GreaterThan(String value) {
            addCriterion("EG05BJ53 >", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ53 >=", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53LessThan(String value) {
            addCriterion("EG05BJ53 <", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ53 <=", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53Like(String value) {
            addCriterion("EG05BJ53 like", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53NotLike(String value) {
            addCriterion("EG05BJ53 not like", value, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53In(List<String> values) {
            addCriterion("EG05BJ53 in", values, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53NotIn(List<String> values) {
            addCriterion("EG05BJ53 not in", values, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53Between(String value1, String value2) {
            addCriterion("EG05BJ53 between", value1, value2, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj53NotBetween(String value1, String value2) {
            addCriterion("EG05BJ53 not between", value1, value2, "eg05bj53");
            return (Criteria) this;
        }

        public Criteria andEg05bj54IsNull() {
            addCriterion("EG05BJ54 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj54IsNotNull() {
            addCriterion("EG05BJ54 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj54EqualTo(String value) {
            addCriterion("EG05BJ54 =", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54NotEqualTo(String value) {
            addCriterion("EG05BJ54 <>", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54GreaterThan(String value) {
            addCriterion("EG05BJ54 >", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ54 >=", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54LessThan(String value) {
            addCriterion("EG05BJ54 <", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ54 <=", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54Like(String value) {
            addCriterion("EG05BJ54 like", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54NotLike(String value) {
            addCriterion("EG05BJ54 not like", value, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54In(List<String> values) {
            addCriterion("EG05BJ54 in", values, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54NotIn(List<String> values) {
            addCriterion("EG05BJ54 not in", values, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54Between(String value1, String value2) {
            addCriterion("EG05BJ54 between", value1, value2, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj54NotBetween(String value1, String value2) {
            addCriterion("EG05BJ54 not between", value1, value2, "eg05bj54");
            return (Criteria) this;
        }

        public Criteria andEg05bj55IsNull() {
            addCriterion("EG05BJ55 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj55IsNotNull() {
            addCriterion("EG05BJ55 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj55EqualTo(String value) {
            addCriterion("EG05BJ55 =", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55NotEqualTo(String value) {
            addCriterion("EG05BJ55 <>", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55GreaterThan(String value) {
            addCriterion("EG05BJ55 >", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ55 >=", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55LessThan(String value) {
            addCriterion("EG05BJ55 <", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ55 <=", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55Like(String value) {
            addCriterion("EG05BJ55 like", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55NotLike(String value) {
            addCriterion("EG05BJ55 not like", value, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55In(List<String> values) {
            addCriterion("EG05BJ55 in", values, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55NotIn(List<String> values) {
            addCriterion("EG05BJ55 not in", values, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55Between(String value1, String value2) {
            addCriterion("EG05BJ55 between", value1, value2, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj55NotBetween(String value1, String value2) {
            addCriterion("EG05BJ55 not between", value1, value2, "eg05bj55");
            return (Criteria) this;
        }

        public Criteria andEg05bj56IsNull() {
            addCriterion("EG05BJ56 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj56IsNotNull() {
            addCriterion("EG05BJ56 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj56EqualTo(String value) {
            addCriterion("EG05BJ56 =", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56NotEqualTo(String value) {
            addCriterion("EG05BJ56 <>", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56GreaterThan(String value) {
            addCriterion("EG05BJ56 >", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ56 >=", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56LessThan(String value) {
            addCriterion("EG05BJ56 <", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ56 <=", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56Like(String value) {
            addCriterion("EG05BJ56 like", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56NotLike(String value) {
            addCriterion("EG05BJ56 not like", value, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56In(List<String> values) {
            addCriterion("EG05BJ56 in", values, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56NotIn(List<String> values) {
            addCriterion("EG05BJ56 not in", values, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56Between(String value1, String value2) {
            addCriterion("EG05BJ56 between", value1, value2, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj56NotBetween(String value1, String value2) {
            addCriterion("EG05BJ56 not between", value1, value2, "eg05bj56");
            return (Criteria) this;
        }

        public Criteria andEg05bj57IsNull() {
            addCriterion("EG05BJ57 is null");
            return (Criteria) this;
        }

        public Criteria andEg05bj57IsNotNull() {
            addCriterion("EG05BJ57 is not null");
            return (Criteria) this;
        }

        public Criteria andEg05bj57EqualTo(String value) {
            addCriterion("EG05BJ57 =", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57NotEqualTo(String value) {
            addCriterion("EG05BJ57 <>", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57GreaterThan(String value) {
            addCriterion("EG05BJ57 >", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57GreaterThanOrEqualTo(String value) {
            addCriterion("EG05BJ57 >=", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57LessThan(String value) {
            addCriterion("EG05BJ57 <", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57LessThanOrEqualTo(String value) {
            addCriterion("EG05BJ57 <=", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57Like(String value) {
            addCriterion("EG05BJ57 like", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57NotLike(String value) {
            addCriterion("EG05BJ57 not like", value, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57In(List<String> values) {
            addCriterion("EG05BJ57 in", values, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57NotIn(List<String> values) {
            addCriterion("EG05BJ57 not in", values, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57Between(String value1, String value2) {
            addCriterion("EG05BJ57 between", value1, value2, "eg05bj57");
            return (Criteria) this;
        }

        public Criteria andEg05bj57NotBetween(String value1, String value2) {
            addCriterion("EG05BJ57 not between", value1, value2, "eg05bj57");
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