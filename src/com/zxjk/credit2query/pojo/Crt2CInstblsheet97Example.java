package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CInstblsheet97Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CInstblsheet97Example() {
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

        public Criteria andEg07bj01IsNull() {
            addCriterion("EG07BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj01IsNotNull() {
            addCriterion("EG07BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj01EqualTo(String value) {
            addCriterion("EG07BJ01 =", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01NotEqualTo(String value) {
            addCriterion("EG07BJ01 <>", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01GreaterThan(String value) {
            addCriterion("EG07BJ01 >", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ01 >=", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01LessThan(String value) {
            addCriterion("EG07BJ01 <", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ01 <=", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01Like(String value) {
            addCriterion("EG07BJ01 like", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01NotLike(String value) {
            addCriterion("EG07BJ01 not like", value, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01In(List<String> values) {
            addCriterion("EG07BJ01 in", values, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01NotIn(List<String> values) {
            addCriterion("EG07BJ01 not in", values, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01Between(String value1, String value2) {
            addCriterion("EG07BJ01 between", value1, value2, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj01NotBetween(String value1, String value2) {
            addCriterion("EG07BJ01 not between", value1, value2, "eg07bj01");
            return (Criteria) this;
        }

        public Criteria andEg07bj02IsNull() {
            addCriterion("EG07BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj02IsNotNull() {
            addCriterion("EG07BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj02EqualTo(String value) {
            addCriterion("EG07BJ02 =", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02NotEqualTo(String value) {
            addCriterion("EG07BJ02 <>", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02GreaterThan(String value) {
            addCriterion("EG07BJ02 >", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ02 >=", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02LessThan(String value) {
            addCriterion("EG07BJ02 <", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ02 <=", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02Like(String value) {
            addCriterion("EG07BJ02 like", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02NotLike(String value) {
            addCriterion("EG07BJ02 not like", value, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02In(List<String> values) {
            addCriterion("EG07BJ02 in", values, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02NotIn(List<String> values) {
            addCriterion("EG07BJ02 not in", values, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02Between(String value1, String value2) {
            addCriterion("EG07BJ02 between", value1, value2, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj02NotBetween(String value1, String value2) {
            addCriterion("EG07BJ02 not between", value1, value2, "eg07bj02");
            return (Criteria) this;
        }

        public Criteria andEg07bj03IsNull() {
            addCriterion("EG07BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj03IsNotNull() {
            addCriterion("EG07BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj03EqualTo(String value) {
            addCriterion("EG07BJ03 =", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03NotEqualTo(String value) {
            addCriterion("EG07BJ03 <>", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03GreaterThan(String value) {
            addCriterion("EG07BJ03 >", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ03 >=", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03LessThan(String value) {
            addCriterion("EG07BJ03 <", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ03 <=", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03Like(String value) {
            addCriterion("EG07BJ03 like", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03NotLike(String value) {
            addCriterion("EG07BJ03 not like", value, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03In(List<String> values) {
            addCriterion("EG07BJ03 in", values, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03NotIn(List<String> values) {
            addCriterion("EG07BJ03 not in", values, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03Between(String value1, String value2) {
            addCriterion("EG07BJ03 between", value1, value2, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj03NotBetween(String value1, String value2) {
            addCriterion("EG07BJ03 not between", value1, value2, "eg07bj03");
            return (Criteria) this;
        }

        public Criteria andEg07bj04IsNull() {
            addCriterion("EG07BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj04IsNotNull() {
            addCriterion("EG07BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj04EqualTo(String value) {
            addCriterion("EG07BJ04 =", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04NotEqualTo(String value) {
            addCriterion("EG07BJ04 <>", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04GreaterThan(String value) {
            addCriterion("EG07BJ04 >", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ04 >=", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04LessThan(String value) {
            addCriterion("EG07BJ04 <", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ04 <=", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04Like(String value) {
            addCriterion("EG07BJ04 like", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04NotLike(String value) {
            addCriterion("EG07BJ04 not like", value, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04In(List<String> values) {
            addCriterion("EG07BJ04 in", values, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04NotIn(List<String> values) {
            addCriterion("EG07BJ04 not in", values, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04Between(String value1, String value2) {
            addCriterion("EG07BJ04 between", value1, value2, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj04NotBetween(String value1, String value2) {
            addCriterion("EG07BJ04 not between", value1, value2, "eg07bj04");
            return (Criteria) this;
        }

        public Criteria andEg07bj05IsNull() {
            addCriterion("EG07BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj05IsNotNull() {
            addCriterion("EG07BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj05EqualTo(String value) {
            addCriterion("EG07BJ05 =", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05NotEqualTo(String value) {
            addCriterion("EG07BJ05 <>", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05GreaterThan(String value) {
            addCriterion("EG07BJ05 >", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ05 >=", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05LessThan(String value) {
            addCriterion("EG07BJ05 <", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ05 <=", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05Like(String value) {
            addCriterion("EG07BJ05 like", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05NotLike(String value) {
            addCriterion("EG07BJ05 not like", value, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05In(List<String> values) {
            addCriterion("EG07BJ05 in", values, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05NotIn(List<String> values) {
            addCriterion("EG07BJ05 not in", values, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05Between(String value1, String value2) {
            addCriterion("EG07BJ05 between", value1, value2, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj05NotBetween(String value1, String value2) {
            addCriterion("EG07BJ05 not between", value1, value2, "eg07bj05");
            return (Criteria) this;
        }

        public Criteria andEg07bj06IsNull() {
            addCriterion("EG07BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj06IsNotNull() {
            addCriterion("EG07BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj06EqualTo(String value) {
            addCriterion("EG07BJ06 =", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06NotEqualTo(String value) {
            addCriterion("EG07BJ06 <>", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06GreaterThan(String value) {
            addCriterion("EG07BJ06 >", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ06 >=", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06LessThan(String value) {
            addCriterion("EG07BJ06 <", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ06 <=", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06Like(String value) {
            addCriterion("EG07BJ06 like", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06NotLike(String value) {
            addCriterion("EG07BJ06 not like", value, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06In(List<String> values) {
            addCriterion("EG07BJ06 in", values, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06NotIn(List<String> values) {
            addCriterion("EG07BJ06 not in", values, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06Between(String value1, String value2) {
            addCriterion("EG07BJ06 between", value1, value2, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj06NotBetween(String value1, String value2) {
            addCriterion("EG07BJ06 not between", value1, value2, "eg07bj06");
            return (Criteria) this;
        }

        public Criteria andEg07bj07IsNull() {
            addCriterion("EG07BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj07IsNotNull() {
            addCriterion("EG07BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj07EqualTo(String value) {
            addCriterion("EG07BJ07 =", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07NotEqualTo(String value) {
            addCriterion("EG07BJ07 <>", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07GreaterThan(String value) {
            addCriterion("EG07BJ07 >", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ07 >=", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07LessThan(String value) {
            addCriterion("EG07BJ07 <", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ07 <=", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07Like(String value) {
            addCriterion("EG07BJ07 like", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07NotLike(String value) {
            addCriterion("EG07BJ07 not like", value, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07In(List<String> values) {
            addCriterion("EG07BJ07 in", values, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07NotIn(List<String> values) {
            addCriterion("EG07BJ07 not in", values, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07Between(String value1, String value2) {
            addCriterion("EG07BJ07 between", value1, value2, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj07NotBetween(String value1, String value2) {
            addCriterion("EG07BJ07 not between", value1, value2, "eg07bj07");
            return (Criteria) this;
        }

        public Criteria andEg07bj08IsNull() {
            addCriterion("EG07BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj08IsNotNull() {
            addCriterion("EG07BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj08EqualTo(String value) {
            addCriterion("EG07BJ08 =", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08NotEqualTo(String value) {
            addCriterion("EG07BJ08 <>", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08GreaterThan(String value) {
            addCriterion("EG07BJ08 >", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ08 >=", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08LessThan(String value) {
            addCriterion("EG07BJ08 <", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ08 <=", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08Like(String value) {
            addCriterion("EG07BJ08 like", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08NotLike(String value) {
            addCriterion("EG07BJ08 not like", value, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08In(List<String> values) {
            addCriterion("EG07BJ08 in", values, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08NotIn(List<String> values) {
            addCriterion("EG07BJ08 not in", values, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08Between(String value1, String value2) {
            addCriterion("EG07BJ08 between", value1, value2, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj08NotBetween(String value1, String value2) {
            addCriterion("EG07BJ08 not between", value1, value2, "eg07bj08");
            return (Criteria) this;
        }

        public Criteria andEg07bj09IsNull() {
            addCriterion("EG07BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj09IsNotNull() {
            addCriterion("EG07BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj09EqualTo(String value) {
            addCriterion("EG07BJ09 =", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09NotEqualTo(String value) {
            addCriterion("EG07BJ09 <>", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09GreaterThan(String value) {
            addCriterion("EG07BJ09 >", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ09 >=", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09LessThan(String value) {
            addCriterion("EG07BJ09 <", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ09 <=", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09Like(String value) {
            addCriterion("EG07BJ09 like", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09NotLike(String value) {
            addCriterion("EG07BJ09 not like", value, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09In(List<String> values) {
            addCriterion("EG07BJ09 in", values, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09NotIn(List<String> values) {
            addCriterion("EG07BJ09 not in", values, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09Between(String value1, String value2) {
            addCriterion("EG07BJ09 between", value1, value2, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj09NotBetween(String value1, String value2) {
            addCriterion("EG07BJ09 not between", value1, value2, "eg07bj09");
            return (Criteria) this;
        }

        public Criteria andEg07bj10IsNull() {
            addCriterion("EG07BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj10IsNotNull() {
            addCriterion("EG07BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj10EqualTo(String value) {
            addCriterion("EG07BJ10 =", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10NotEqualTo(String value) {
            addCriterion("EG07BJ10 <>", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10GreaterThan(String value) {
            addCriterion("EG07BJ10 >", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ10 >=", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10LessThan(String value) {
            addCriterion("EG07BJ10 <", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ10 <=", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10Like(String value) {
            addCriterion("EG07BJ10 like", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10NotLike(String value) {
            addCriterion("EG07BJ10 not like", value, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10In(List<String> values) {
            addCriterion("EG07BJ10 in", values, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10NotIn(List<String> values) {
            addCriterion("EG07BJ10 not in", values, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10Between(String value1, String value2) {
            addCriterion("EG07BJ10 between", value1, value2, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj10NotBetween(String value1, String value2) {
            addCriterion("EG07BJ10 not between", value1, value2, "eg07bj10");
            return (Criteria) this;
        }

        public Criteria andEg07bj11IsNull() {
            addCriterion("EG07BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj11IsNotNull() {
            addCriterion("EG07BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj11EqualTo(String value) {
            addCriterion("EG07BJ11 =", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11NotEqualTo(String value) {
            addCriterion("EG07BJ11 <>", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11GreaterThan(String value) {
            addCriterion("EG07BJ11 >", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ11 >=", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11LessThan(String value) {
            addCriterion("EG07BJ11 <", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ11 <=", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11Like(String value) {
            addCriterion("EG07BJ11 like", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11NotLike(String value) {
            addCriterion("EG07BJ11 not like", value, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11In(List<String> values) {
            addCriterion("EG07BJ11 in", values, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11NotIn(List<String> values) {
            addCriterion("EG07BJ11 not in", values, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11Between(String value1, String value2) {
            addCriterion("EG07BJ11 between", value1, value2, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj11NotBetween(String value1, String value2) {
            addCriterion("EG07BJ11 not between", value1, value2, "eg07bj11");
            return (Criteria) this;
        }

        public Criteria andEg07bj12IsNull() {
            addCriterion("EG07BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj12IsNotNull() {
            addCriterion("EG07BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj12EqualTo(String value) {
            addCriterion("EG07BJ12 =", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12NotEqualTo(String value) {
            addCriterion("EG07BJ12 <>", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12GreaterThan(String value) {
            addCriterion("EG07BJ12 >", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ12 >=", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12LessThan(String value) {
            addCriterion("EG07BJ12 <", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ12 <=", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12Like(String value) {
            addCriterion("EG07BJ12 like", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12NotLike(String value) {
            addCriterion("EG07BJ12 not like", value, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12In(List<String> values) {
            addCriterion("EG07BJ12 in", values, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12NotIn(List<String> values) {
            addCriterion("EG07BJ12 not in", values, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12Between(String value1, String value2) {
            addCriterion("EG07BJ12 between", value1, value2, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj12NotBetween(String value1, String value2) {
            addCriterion("EG07BJ12 not between", value1, value2, "eg07bj12");
            return (Criteria) this;
        }

        public Criteria andEg07bj13IsNull() {
            addCriterion("EG07BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj13IsNotNull() {
            addCriterion("EG07BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj13EqualTo(String value) {
            addCriterion("EG07BJ13 =", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13NotEqualTo(String value) {
            addCriterion("EG07BJ13 <>", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13GreaterThan(String value) {
            addCriterion("EG07BJ13 >", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ13 >=", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13LessThan(String value) {
            addCriterion("EG07BJ13 <", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ13 <=", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13Like(String value) {
            addCriterion("EG07BJ13 like", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13NotLike(String value) {
            addCriterion("EG07BJ13 not like", value, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13In(List<String> values) {
            addCriterion("EG07BJ13 in", values, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13NotIn(List<String> values) {
            addCriterion("EG07BJ13 not in", values, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13Between(String value1, String value2) {
            addCriterion("EG07BJ13 between", value1, value2, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj13NotBetween(String value1, String value2) {
            addCriterion("EG07BJ13 not between", value1, value2, "eg07bj13");
            return (Criteria) this;
        }

        public Criteria andEg07bj14IsNull() {
            addCriterion("EG07BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj14IsNotNull() {
            addCriterion("EG07BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj14EqualTo(String value) {
            addCriterion("EG07BJ14 =", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14NotEqualTo(String value) {
            addCriterion("EG07BJ14 <>", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14GreaterThan(String value) {
            addCriterion("EG07BJ14 >", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ14 >=", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14LessThan(String value) {
            addCriterion("EG07BJ14 <", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ14 <=", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14Like(String value) {
            addCriterion("EG07BJ14 like", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14NotLike(String value) {
            addCriterion("EG07BJ14 not like", value, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14In(List<String> values) {
            addCriterion("EG07BJ14 in", values, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14NotIn(List<String> values) {
            addCriterion("EG07BJ14 not in", values, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14Between(String value1, String value2) {
            addCriterion("EG07BJ14 between", value1, value2, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj14NotBetween(String value1, String value2) {
            addCriterion("EG07BJ14 not between", value1, value2, "eg07bj14");
            return (Criteria) this;
        }

        public Criteria andEg07bj15IsNull() {
            addCriterion("EG07BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj15IsNotNull() {
            addCriterion("EG07BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj15EqualTo(String value) {
            addCriterion("EG07BJ15 =", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15NotEqualTo(String value) {
            addCriterion("EG07BJ15 <>", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15GreaterThan(String value) {
            addCriterion("EG07BJ15 >", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ15 >=", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15LessThan(String value) {
            addCriterion("EG07BJ15 <", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ15 <=", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15Like(String value) {
            addCriterion("EG07BJ15 like", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15NotLike(String value) {
            addCriterion("EG07BJ15 not like", value, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15In(List<String> values) {
            addCriterion("EG07BJ15 in", values, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15NotIn(List<String> values) {
            addCriterion("EG07BJ15 not in", values, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15Between(String value1, String value2) {
            addCriterion("EG07BJ15 between", value1, value2, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj15NotBetween(String value1, String value2) {
            addCriterion("EG07BJ15 not between", value1, value2, "eg07bj15");
            return (Criteria) this;
        }

        public Criteria andEg07bj16IsNull() {
            addCriterion("EG07BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj16IsNotNull() {
            addCriterion("EG07BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj16EqualTo(String value) {
            addCriterion("EG07BJ16 =", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16NotEqualTo(String value) {
            addCriterion("EG07BJ16 <>", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16GreaterThan(String value) {
            addCriterion("EG07BJ16 >", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ16 >=", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16LessThan(String value) {
            addCriterion("EG07BJ16 <", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ16 <=", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16Like(String value) {
            addCriterion("EG07BJ16 like", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16NotLike(String value) {
            addCriterion("EG07BJ16 not like", value, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16In(List<String> values) {
            addCriterion("EG07BJ16 in", values, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16NotIn(List<String> values) {
            addCriterion("EG07BJ16 not in", values, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16Between(String value1, String value2) {
            addCriterion("EG07BJ16 between", value1, value2, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj16NotBetween(String value1, String value2) {
            addCriterion("EG07BJ16 not between", value1, value2, "eg07bj16");
            return (Criteria) this;
        }

        public Criteria andEg07bj17IsNull() {
            addCriterion("EG07BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj17IsNotNull() {
            addCriterion("EG07BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj17EqualTo(String value) {
            addCriterion("EG07BJ17 =", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17NotEqualTo(String value) {
            addCriterion("EG07BJ17 <>", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17GreaterThan(String value) {
            addCriterion("EG07BJ17 >", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ17 >=", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17LessThan(String value) {
            addCriterion("EG07BJ17 <", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ17 <=", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17Like(String value) {
            addCriterion("EG07BJ17 like", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17NotLike(String value) {
            addCriterion("EG07BJ17 not like", value, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17In(List<String> values) {
            addCriterion("EG07BJ17 in", values, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17NotIn(List<String> values) {
            addCriterion("EG07BJ17 not in", values, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17Between(String value1, String value2) {
            addCriterion("EG07BJ17 between", value1, value2, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj17NotBetween(String value1, String value2) {
            addCriterion("EG07BJ17 not between", value1, value2, "eg07bj17");
            return (Criteria) this;
        }

        public Criteria andEg07bj18IsNull() {
            addCriterion("EG07BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj18IsNotNull() {
            addCriterion("EG07BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj18EqualTo(String value) {
            addCriterion("EG07BJ18 =", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18NotEqualTo(String value) {
            addCriterion("EG07BJ18 <>", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18GreaterThan(String value) {
            addCriterion("EG07BJ18 >", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ18 >=", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18LessThan(String value) {
            addCriterion("EG07BJ18 <", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ18 <=", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18Like(String value) {
            addCriterion("EG07BJ18 like", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18NotLike(String value) {
            addCriterion("EG07BJ18 not like", value, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18In(List<String> values) {
            addCriterion("EG07BJ18 in", values, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18NotIn(List<String> values) {
            addCriterion("EG07BJ18 not in", values, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18Between(String value1, String value2) {
            addCriterion("EG07BJ18 between", value1, value2, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj18NotBetween(String value1, String value2) {
            addCriterion("EG07BJ18 not between", value1, value2, "eg07bj18");
            return (Criteria) this;
        }

        public Criteria andEg07bj19IsNull() {
            addCriterion("EG07BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj19IsNotNull() {
            addCriterion("EG07BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj19EqualTo(String value) {
            addCriterion("EG07BJ19 =", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19NotEqualTo(String value) {
            addCriterion("EG07BJ19 <>", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19GreaterThan(String value) {
            addCriterion("EG07BJ19 >", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ19 >=", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19LessThan(String value) {
            addCriterion("EG07BJ19 <", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ19 <=", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19Like(String value) {
            addCriterion("EG07BJ19 like", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19NotLike(String value) {
            addCriterion("EG07BJ19 not like", value, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19In(List<String> values) {
            addCriterion("EG07BJ19 in", values, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19NotIn(List<String> values) {
            addCriterion("EG07BJ19 not in", values, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19Between(String value1, String value2) {
            addCriterion("EG07BJ19 between", value1, value2, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj19NotBetween(String value1, String value2) {
            addCriterion("EG07BJ19 not between", value1, value2, "eg07bj19");
            return (Criteria) this;
        }

        public Criteria andEg07bj20IsNull() {
            addCriterion("EG07BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj20IsNotNull() {
            addCriterion("EG07BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj20EqualTo(String value) {
            addCriterion("EG07BJ20 =", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20NotEqualTo(String value) {
            addCriterion("EG07BJ20 <>", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20GreaterThan(String value) {
            addCriterion("EG07BJ20 >", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ20 >=", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20LessThan(String value) {
            addCriterion("EG07BJ20 <", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ20 <=", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20Like(String value) {
            addCriterion("EG07BJ20 like", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20NotLike(String value) {
            addCriterion("EG07BJ20 not like", value, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20In(List<String> values) {
            addCriterion("EG07BJ20 in", values, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20NotIn(List<String> values) {
            addCriterion("EG07BJ20 not in", values, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20Between(String value1, String value2) {
            addCriterion("EG07BJ20 between", value1, value2, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj20NotBetween(String value1, String value2) {
            addCriterion("EG07BJ20 not between", value1, value2, "eg07bj20");
            return (Criteria) this;
        }

        public Criteria andEg07bj21IsNull() {
            addCriterion("EG07BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj21IsNotNull() {
            addCriterion("EG07BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj21EqualTo(String value) {
            addCriterion("EG07BJ21 =", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21NotEqualTo(String value) {
            addCriterion("EG07BJ21 <>", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21GreaterThan(String value) {
            addCriterion("EG07BJ21 >", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ21 >=", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21LessThan(String value) {
            addCriterion("EG07BJ21 <", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ21 <=", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21Like(String value) {
            addCriterion("EG07BJ21 like", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21NotLike(String value) {
            addCriterion("EG07BJ21 not like", value, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21In(List<String> values) {
            addCriterion("EG07BJ21 in", values, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21NotIn(List<String> values) {
            addCriterion("EG07BJ21 not in", values, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21Between(String value1, String value2) {
            addCriterion("EG07BJ21 between", value1, value2, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj21NotBetween(String value1, String value2) {
            addCriterion("EG07BJ21 not between", value1, value2, "eg07bj21");
            return (Criteria) this;
        }

        public Criteria andEg07bj22IsNull() {
            addCriterion("EG07BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj22IsNotNull() {
            addCriterion("EG07BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj22EqualTo(String value) {
            addCriterion("EG07BJ22 =", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22NotEqualTo(String value) {
            addCriterion("EG07BJ22 <>", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22GreaterThan(String value) {
            addCriterion("EG07BJ22 >", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ22 >=", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22LessThan(String value) {
            addCriterion("EG07BJ22 <", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ22 <=", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22Like(String value) {
            addCriterion("EG07BJ22 like", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22NotLike(String value) {
            addCriterion("EG07BJ22 not like", value, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22In(List<String> values) {
            addCriterion("EG07BJ22 in", values, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22NotIn(List<String> values) {
            addCriterion("EG07BJ22 not in", values, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22Between(String value1, String value2) {
            addCriterion("EG07BJ22 between", value1, value2, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj22NotBetween(String value1, String value2) {
            addCriterion("EG07BJ22 not between", value1, value2, "eg07bj22");
            return (Criteria) this;
        }

        public Criteria andEg07bj23IsNull() {
            addCriterion("EG07BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj23IsNotNull() {
            addCriterion("EG07BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj23EqualTo(String value) {
            addCriterion("EG07BJ23 =", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23NotEqualTo(String value) {
            addCriterion("EG07BJ23 <>", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23GreaterThan(String value) {
            addCriterion("EG07BJ23 >", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ23 >=", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23LessThan(String value) {
            addCriterion("EG07BJ23 <", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ23 <=", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23Like(String value) {
            addCriterion("EG07BJ23 like", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23NotLike(String value) {
            addCriterion("EG07BJ23 not like", value, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23In(List<String> values) {
            addCriterion("EG07BJ23 in", values, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23NotIn(List<String> values) {
            addCriterion("EG07BJ23 not in", values, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23Between(String value1, String value2) {
            addCriterion("EG07BJ23 between", value1, value2, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj23NotBetween(String value1, String value2) {
            addCriterion("EG07BJ23 not between", value1, value2, "eg07bj23");
            return (Criteria) this;
        }

        public Criteria andEg07bj24IsNull() {
            addCriterion("EG07BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj24IsNotNull() {
            addCriterion("EG07BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj24EqualTo(String value) {
            addCriterion("EG07BJ24 =", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24NotEqualTo(String value) {
            addCriterion("EG07BJ24 <>", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24GreaterThan(String value) {
            addCriterion("EG07BJ24 >", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ24 >=", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24LessThan(String value) {
            addCriterion("EG07BJ24 <", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ24 <=", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24Like(String value) {
            addCriterion("EG07BJ24 like", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24NotLike(String value) {
            addCriterion("EG07BJ24 not like", value, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24In(List<String> values) {
            addCriterion("EG07BJ24 in", values, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24NotIn(List<String> values) {
            addCriterion("EG07BJ24 not in", values, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24Between(String value1, String value2) {
            addCriterion("EG07BJ24 between", value1, value2, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj24NotBetween(String value1, String value2) {
            addCriterion("EG07BJ24 not between", value1, value2, "eg07bj24");
            return (Criteria) this;
        }

        public Criteria andEg07bj25IsNull() {
            addCriterion("EG07BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj25IsNotNull() {
            addCriterion("EG07BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj25EqualTo(String value) {
            addCriterion("EG07BJ25 =", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25NotEqualTo(String value) {
            addCriterion("EG07BJ25 <>", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25GreaterThan(String value) {
            addCriterion("EG07BJ25 >", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ25 >=", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25LessThan(String value) {
            addCriterion("EG07BJ25 <", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ25 <=", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25Like(String value) {
            addCriterion("EG07BJ25 like", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25NotLike(String value) {
            addCriterion("EG07BJ25 not like", value, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25In(List<String> values) {
            addCriterion("EG07BJ25 in", values, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25NotIn(List<String> values) {
            addCriterion("EG07BJ25 not in", values, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25Between(String value1, String value2) {
            addCriterion("EG07BJ25 between", value1, value2, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj25NotBetween(String value1, String value2) {
            addCriterion("EG07BJ25 not between", value1, value2, "eg07bj25");
            return (Criteria) this;
        }

        public Criteria andEg07bj26IsNull() {
            addCriterion("EG07BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj26IsNotNull() {
            addCriterion("EG07BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj26EqualTo(String value) {
            addCriterion("EG07BJ26 =", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26NotEqualTo(String value) {
            addCriterion("EG07BJ26 <>", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26GreaterThan(String value) {
            addCriterion("EG07BJ26 >", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ26 >=", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26LessThan(String value) {
            addCriterion("EG07BJ26 <", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ26 <=", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26Like(String value) {
            addCriterion("EG07BJ26 like", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26NotLike(String value) {
            addCriterion("EG07BJ26 not like", value, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26In(List<String> values) {
            addCriterion("EG07BJ26 in", values, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26NotIn(List<String> values) {
            addCriterion("EG07BJ26 not in", values, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26Between(String value1, String value2) {
            addCriterion("EG07BJ26 between", value1, value2, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj26NotBetween(String value1, String value2) {
            addCriterion("EG07BJ26 not between", value1, value2, "eg07bj26");
            return (Criteria) this;
        }

        public Criteria andEg07bj27IsNull() {
            addCriterion("EG07BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj27IsNotNull() {
            addCriterion("EG07BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj27EqualTo(String value) {
            addCriterion("EG07BJ27 =", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27NotEqualTo(String value) {
            addCriterion("EG07BJ27 <>", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27GreaterThan(String value) {
            addCriterion("EG07BJ27 >", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ27 >=", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27LessThan(String value) {
            addCriterion("EG07BJ27 <", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ27 <=", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27Like(String value) {
            addCriterion("EG07BJ27 like", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27NotLike(String value) {
            addCriterion("EG07BJ27 not like", value, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27In(List<String> values) {
            addCriterion("EG07BJ27 in", values, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27NotIn(List<String> values) {
            addCriterion("EG07BJ27 not in", values, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27Between(String value1, String value2) {
            addCriterion("EG07BJ27 between", value1, value2, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj27NotBetween(String value1, String value2) {
            addCriterion("EG07BJ27 not between", value1, value2, "eg07bj27");
            return (Criteria) this;
        }

        public Criteria andEg07bj28IsNull() {
            addCriterion("EG07BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj28IsNotNull() {
            addCriterion("EG07BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj28EqualTo(String value) {
            addCriterion("EG07BJ28 =", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28NotEqualTo(String value) {
            addCriterion("EG07BJ28 <>", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28GreaterThan(String value) {
            addCriterion("EG07BJ28 >", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ28 >=", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28LessThan(String value) {
            addCriterion("EG07BJ28 <", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ28 <=", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28Like(String value) {
            addCriterion("EG07BJ28 like", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28NotLike(String value) {
            addCriterion("EG07BJ28 not like", value, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28In(List<String> values) {
            addCriterion("EG07BJ28 in", values, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28NotIn(List<String> values) {
            addCriterion("EG07BJ28 not in", values, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28Between(String value1, String value2) {
            addCriterion("EG07BJ28 between", value1, value2, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj28NotBetween(String value1, String value2) {
            addCriterion("EG07BJ28 not between", value1, value2, "eg07bj28");
            return (Criteria) this;
        }

        public Criteria andEg07bj29IsNull() {
            addCriterion("EG07BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj29IsNotNull() {
            addCriterion("EG07BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj29EqualTo(String value) {
            addCriterion("EG07BJ29 =", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29NotEqualTo(String value) {
            addCriterion("EG07BJ29 <>", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29GreaterThan(String value) {
            addCriterion("EG07BJ29 >", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ29 >=", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29LessThan(String value) {
            addCriterion("EG07BJ29 <", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ29 <=", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29Like(String value) {
            addCriterion("EG07BJ29 like", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29NotLike(String value) {
            addCriterion("EG07BJ29 not like", value, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29In(List<String> values) {
            addCriterion("EG07BJ29 in", values, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29NotIn(List<String> values) {
            addCriterion("EG07BJ29 not in", values, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29Between(String value1, String value2) {
            addCriterion("EG07BJ29 between", value1, value2, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj29NotBetween(String value1, String value2) {
            addCriterion("EG07BJ29 not between", value1, value2, "eg07bj29");
            return (Criteria) this;
        }

        public Criteria andEg07bj30IsNull() {
            addCriterion("EG07BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj30IsNotNull() {
            addCriterion("EG07BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj30EqualTo(String value) {
            addCriterion("EG07BJ30 =", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30NotEqualTo(String value) {
            addCriterion("EG07BJ30 <>", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30GreaterThan(String value) {
            addCriterion("EG07BJ30 >", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ30 >=", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30LessThan(String value) {
            addCriterion("EG07BJ30 <", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ30 <=", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30Like(String value) {
            addCriterion("EG07BJ30 like", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30NotLike(String value) {
            addCriterion("EG07BJ30 not like", value, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30In(List<String> values) {
            addCriterion("EG07BJ30 in", values, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30NotIn(List<String> values) {
            addCriterion("EG07BJ30 not in", values, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30Between(String value1, String value2) {
            addCriterion("EG07BJ30 between", value1, value2, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj30NotBetween(String value1, String value2) {
            addCriterion("EG07BJ30 not between", value1, value2, "eg07bj30");
            return (Criteria) this;
        }

        public Criteria andEg07bj31IsNull() {
            addCriterion("EG07BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj31IsNotNull() {
            addCriterion("EG07BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj31EqualTo(String value) {
            addCriterion("EG07BJ31 =", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31NotEqualTo(String value) {
            addCriterion("EG07BJ31 <>", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31GreaterThan(String value) {
            addCriterion("EG07BJ31 >", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ31 >=", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31LessThan(String value) {
            addCriterion("EG07BJ31 <", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ31 <=", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31Like(String value) {
            addCriterion("EG07BJ31 like", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31NotLike(String value) {
            addCriterion("EG07BJ31 not like", value, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31In(List<String> values) {
            addCriterion("EG07BJ31 in", values, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31NotIn(List<String> values) {
            addCriterion("EG07BJ31 not in", values, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31Between(String value1, String value2) {
            addCriterion("EG07BJ31 between", value1, value2, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj31NotBetween(String value1, String value2) {
            addCriterion("EG07BJ31 not between", value1, value2, "eg07bj31");
            return (Criteria) this;
        }

        public Criteria andEg07bj32IsNull() {
            addCriterion("EG07BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj32IsNotNull() {
            addCriterion("EG07BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj32EqualTo(String value) {
            addCriterion("EG07BJ32 =", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32NotEqualTo(String value) {
            addCriterion("EG07BJ32 <>", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32GreaterThan(String value) {
            addCriterion("EG07BJ32 >", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ32 >=", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32LessThan(String value) {
            addCriterion("EG07BJ32 <", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ32 <=", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32Like(String value) {
            addCriterion("EG07BJ32 like", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32NotLike(String value) {
            addCriterion("EG07BJ32 not like", value, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32In(List<String> values) {
            addCriterion("EG07BJ32 in", values, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32NotIn(List<String> values) {
            addCriterion("EG07BJ32 not in", values, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32Between(String value1, String value2) {
            addCriterion("EG07BJ32 between", value1, value2, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj32NotBetween(String value1, String value2) {
            addCriterion("EG07BJ32 not between", value1, value2, "eg07bj32");
            return (Criteria) this;
        }

        public Criteria andEg07bj33IsNull() {
            addCriterion("EG07BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj33IsNotNull() {
            addCriterion("EG07BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj33EqualTo(String value) {
            addCriterion("EG07BJ33 =", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33NotEqualTo(String value) {
            addCriterion("EG07BJ33 <>", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33GreaterThan(String value) {
            addCriterion("EG07BJ33 >", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ33 >=", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33LessThan(String value) {
            addCriterion("EG07BJ33 <", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ33 <=", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33Like(String value) {
            addCriterion("EG07BJ33 like", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33NotLike(String value) {
            addCriterion("EG07BJ33 not like", value, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33In(List<String> values) {
            addCriterion("EG07BJ33 in", values, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33NotIn(List<String> values) {
            addCriterion("EG07BJ33 not in", values, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33Between(String value1, String value2) {
            addCriterion("EG07BJ33 between", value1, value2, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj33NotBetween(String value1, String value2) {
            addCriterion("EG07BJ33 not between", value1, value2, "eg07bj33");
            return (Criteria) this;
        }

        public Criteria andEg07bj34IsNull() {
            addCriterion("EG07BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj34IsNotNull() {
            addCriterion("EG07BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj34EqualTo(String value) {
            addCriterion("EG07BJ34 =", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34NotEqualTo(String value) {
            addCriterion("EG07BJ34 <>", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34GreaterThan(String value) {
            addCriterion("EG07BJ34 >", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ34 >=", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34LessThan(String value) {
            addCriterion("EG07BJ34 <", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ34 <=", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34Like(String value) {
            addCriterion("EG07BJ34 like", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34NotLike(String value) {
            addCriterion("EG07BJ34 not like", value, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34In(List<String> values) {
            addCriterion("EG07BJ34 in", values, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34NotIn(List<String> values) {
            addCriterion("EG07BJ34 not in", values, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34Between(String value1, String value2) {
            addCriterion("EG07BJ34 between", value1, value2, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj34NotBetween(String value1, String value2) {
            addCriterion("EG07BJ34 not between", value1, value2, "eg07bj34");
            return (Criteria) this;
        }

        public Criteria andEg07bj35IsNull() {
            addCriterion("EG07BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj35IsNotNull() {
            addCriterion("EG07BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj35EqualTo(String value) {
            addCriterion("EG07BJ35 =", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35NotEqualTo(String value) {
            addCriterion("EG07BJ35 <>", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35GreaterThan(String value) {
            addCriterion("EG07BJ35 >", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ35 >=", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35LessThan(String value) {
            addCriterion("EG07BJ35 <", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ35 <=", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35Like(String value) {
            addCriterion("EG07BJ35 like", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35NotLike(String value) {
            addCriterion("EG07BJ35 not like", value, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35In(List<String> values) {
            addCriterion("EG07BJ35 in", values, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35NotIn(List<String> values) {
            addCriterion("EG07BJ35 not in", values, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35Between(String value1, String value2) {
            addCriterion("EG07BJ35 between", value1, value2, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj35NotBetween(String value1, String value2) {
            addCriterion("EG07BJ35 not between", value1, value2, "eg07bj35");
            return (Criteria) this;
        }

        public Criteria andEg07bj36IsNull() {
            addCriterion("EG07BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj36IsNotNull() {
            addCriterion("EG07BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj36EqualTo(String value) {
            addCriterion("EG07BJ36 =", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36NotEqualTo(String value) {
            addCriterion("EG07BJ36 <>", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36GreaterThan(String value) {
            addCriterion("EG07BJ36 >", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ36 >=", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36LessThan(String value) {
            addCriterion("EG07BJ36 <", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ36 <=", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36Like(String value) {
            addCriterion("EG07BJ36 like", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36NotLike(String value) {
            addCriterion("EG07BJ36 not like", value, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36In(List<String> values) {
            addCriterion("EG07BJ36 in", values, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36NotIn(List<String> values) {
            addCriterion("EG07BJ36 not in", values, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36Between(String value1, String value2) {
            addCriterion("EG07BJ36 between", value1, value2, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj36NotBetween(String value1, String value2) {
            addCriterion("EG07BJ36 not between", value1, value2, "eg07bj36");
            return (Criteria) this;
        }

        public Criteria andEg07bj37IsNull() {
            addCriterion("EG07BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj37IsNotNull() {
            addCriterion("EG07BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj37EqualTo(String value) {
            addCriterion("EG07BJ37 =", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37NotEqualTo(String value) {
            addCriterion("EG07BJ37 <>", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37GreaterThan(String value) {
            addCriterion("EG07BJ37 >", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ37 >=", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37LessThan(String value) {
            addCriterion("EG07BJ37 <", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ37 <=", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37Like(String value) {
            addCriterion("EG07BJ37 like", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37NotLike(String value) {
            addCriterion("EG07BJ37 not like", value, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37In(List<String> values) {
            addCriterion("EG07BJ37 in", values, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37NotIn(List<String> values) {
            addCriterion("EG07BJ37 not in", values, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37Between(String value1, String value2) {
            addCriterion("EG07BJ37 between", value1, value2, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj37NotBetween(String value1, String value2) {
            addCriterion("EG07BJ37 not between", value1, value2, "eg07bj37");
            return (Criteria) this;
        }

        public Criteria andEg07bj38IsNull() {
            addCriterion("EG07BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj38IsNotNull() {
            addCriterion("EG07BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj38EqualTo(String value) {
            addCriterion("EG07BJ38 =", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38NotEqualTo(String value) {
            addCriterion("EG07BJ38 <>", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38GreaterThan(String value) {
            addCriterion("EG07BJ38 >", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ38 >=", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38LessThan(String value) {
            addCriterion("EG07BJ38 <", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ38 <=", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38Like(String value) {
            addCriterion("EG07BJ38 like", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38NotLike(String value) {
            addCriterion("EG07BJ38 not like", value, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38In(List<String> values) {
            addCriterion("EG07BJ38 in", values, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38NotIn(List<String> values) {
            addCriterion("EG07BJ38 not in", values, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38Between(String value1, String value2) {
            addCriterion("EG07BJ38 between", value1, value2, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj38NotBetween(String value1, String value2) {
            addCriterion("EG07BJ38 not between", value1, value2, "eg07bj38");
            return (Criteria) this;
        }

        public Criteria andEg07bj39IsNull() {
            addCriterion("EG07BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj39IsNotNull() {
            addCriterion("EG07BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj39EqualTo(String value) {
            addCriterion("EG07BJ39 =", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39NotEqualTo(String value) {
            addCriterion("EG07BJ39 <>", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39GreaterThan(String value) {
            addCriterion("EG07BJ39 >", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ39 >=", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39LessThan(String value) {
            addCriterion("EG07BJ39 <", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ39 <=", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39Like(String value) {
            addCriterion("EG07BJ39 like", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39NotLike(String value) {
            addCriterion("EG07BJ39 not like", value, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39In(List<String> values) {
            addCriterion("EG07BJ39 in", values, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39NotIn(List<String> values) {
            addCriterion("EG07BJ39 not in", values, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39Between(String value1, String value2) {
            addCriterion("EG07BJ39 between", value1, value2, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj39NotBetween(String value1, String value2) {
            addCriterion("EG07BJ39 not between", value1, value2, "eg07bj39");
            return (Criteria) this;
        }

        public Criteria andEg07bj40IsNull() {
            addCriterion("EG07BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj40IsNotNull() {
            addCriterion("EG07BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj40EqualTo(String value) {
            addCriterion("EG07BJ40 =", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40NotEqualTo(String value) {
            addCriterion("EG07BJ40 <>", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40GreaterThan(String value) {
            addCriterion("EG07BJ40 >", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ40 >=", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40LessThan(String value) {
            addCriterion("EG07BJ40 <", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ40 <=", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40Like(String value) {
            addCriterion("EG07BJ40 like", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40NotLike(String value) {
            addCriterion("EG07BJ40 not like", value, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40In(List<String> values) {
            addCriterion("EG07BJ40 in", values, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40NotIn(List<String> values) {
            addCriterion("EG07BJ40 not in", values, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40Between(String value1, String value2) {
            addCriterion("EG07BJ40 between", value1, value2, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj40NotBetween(String value1, String value2) {
            addCriterion("EG07BJ40 not between", value1, value2, "eg07bj40");
            return (Criteria) this;
        }

        public Criteria andEg07bj41IsNull() {
            addCriterion("EG07BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj41IsNotNull() {
            addCriterion("EG07BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj41EqualTo(String value) {
            addCriterion("EG07BJ41 =", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41NotEqualTo(String value) {
            addCriterion("EG07BJ41 <>", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41GreaterThan(String value) {
            addCriterion("EG07BJ41 >", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ41 >=", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41LessThan(String value) {
            addCriterion("EG07BJ41 <", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ41 <=", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41Like(String value) {
            addCriterion("EG07BJ41 like", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41NotLike(String value) {
            addCriterion("EG07BJ41 not like", value, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41In(List<String> values) {
            addCriterion("EG07BJ41 in", values, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41NotIn(List<String> values) {
            addCriterion("EG07BJ41 not in", values, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41Between(String value1, String value2) {
            addCriterion("EG07BJ41 between", value1, value2, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj41NotBetween(String value1, String value2) {
            addCriterion("EG07BJ41 not between", value1, value2, "eg07bj41");
            return (Criteria) this;
        }

        public Criteria andEg07bj42IsNull() {
            addCriterion("EG07BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj42IsNotNull() {
            addCriterion("EG07BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj42EqualTo(String value) {
            addCriterion("EG07BJ42 =", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42NotEqualTo(String value) {
            addCriterion("EG07BJ42 <>", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42GreaterThan(String value) {
            addCriterion("EG07BJ42 >", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ42 >=", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42LessThan(String value) {
            addCriterion("EG07BJ42 <", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ42 <=", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42Like(String value) {
            addCriterion("EG07BJ42 like", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42NotLike(String value) {
            addCriterion("EG07BJ42 not like", value, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42In(List<String> values) {
            addCriterion("EG07BJ42 in", values, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42NotIn(List<String> values) {
            addCriterion("EG07BJ42 not in", values, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42Between(String value1, String value2) {
            addCriterion("EG07BJ42 between", value1, value2, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj42NotBetween(String value1, String value2) {
            addCriterion("EG07BJ42 not between", value1, value2, "eg07bj42");
            return (Criteria) this;
        }

        public Criteria andEg07bj43IsNull() {
            addCriterion("EG07BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj43IsNotNull() {
            addCriterion("EG07BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj43EqualTo(String value) {
            addCriterion("EG07BJ43 =", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43NotEqualTo(String value) {
            addCriterion("EG07BJ43 <>", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43GreaterThan(String value) {
            addCriterion("EG07BJ43 >", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ43 >=", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43LessThan(String value) {
            addCriterion("EG07BJ43 <", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ43 <=", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43Like(String value) {
            addCriterion("EG07BJ43 like", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43NotLike(String value) {
            addCriterion("EG07BJ43 not like", value, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43In(List<String> values) {
            addCriterion("EG07BJ43 in", values, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43NotIn(List<String> values) {
            addCriterion("EG07BJ43 not in", values, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43Between(String value1, String value2) {
            addCriterion("EG07BJ43 between", value1, value2, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj43NotBetween(String value1, String value2) {
            addCriterion("EG07BJ43 not between", value1, value2, "eg07bj43");
            return (Criteria) this;
        }

        public Criteria andEg07bj44IsNull() {
            addCriterion("EG07BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj44IsNotNull() {
            addCriterion("EG07BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj44EqualTo(String value) {
            addCriterion("EG07BJ44 =", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44NotEqualTo(String value) {
            addCriterion("EG07BJ44 <>", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44GreaterThan(String value) {
            addCriterion("EG07BJ44 >", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ44 >=", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44LessThan(String value) {
            addCriterion("EG07BJ44 <", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ44 <=", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44Like(String value) {
            addCriterion("EG07BJ44 like", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44NotLike(String value) {
            addCriterion("EG07BJ44 not like", value, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44In(List<String> values) {
            addCriterion("EG07BJ44 in", values, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44NotIn(List<String> values) {
            addCriterion("EG07BJ44 not in", values, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44Between(String value1, String value2) {
            addCriterion("EG07BJ44 between", value1, value2, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj44NotBetween(String value1, String value2) {
            addCriterion("EG07BJ44 not between", value1, value2, "eg07bj44");
            return (Criteria) this;
        }

        public Criteria andEg07bj45IsNull() {
            addCriterion("EG07BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj45IsNotNull() {
            addCriterion("EG07BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj45EqualTo(String value) {
            addCriterion("EG07BJ45 =", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45NotEqualTo(String value) {
            addCriterion("EG07BJ45 <>", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45GreaterThan(String value) {
            addCriterion("EG07BJ45 >", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ45 >=", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45LessThan(String value) {
            addCriterion("EG07BJ45 <", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ45 <=", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45Like(String value) {
            addCriterion("EG07BJ45 like", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45NotLike(String value) {
            addCriterion("EG07BJ45 not like", value, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45In(List<String> values) {
            addCriterion("EG07BJ45 in", values, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45NotIn(List<String> values) {
            addCriterion("EG07BJ45 not in", values, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45Between(String value1, String value2) {
            addCriterion("EG07BJ45 between", value1, value2, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj45NotBetween(String value1, String value2) {
            addCriterion("EG07BJ45 not between", value1, value2, "eg07bj45");
            return (Criteria) this;
        }

        public Criteria andEg07bj46IsNull() {
            addCriterion("EG07BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj46IsNotNull() {
            addCriterion("EG07BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj46EqualTo(String value) {
            addCriterion("EG07BJ46 =", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46NotEqualTo(String value) {
            addCriterion("EG07BJ46 <>", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46GreaterThan(String value) {
            addCriterion("EG07BJ46 >", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ46 >=", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46LessThan(String value) {
            addCriterion("EG07BJ46 <", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ46 <=", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46Like(String value) {
            addCriterion("EG07BJ46 like", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46NotLike(String value) {
            addCriterion("EG07BJ46 not like", value, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46In(List<String> values) {
            addCriterion("EG07BJ46 in", values, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46NotIn(List<String> values) {
            addCriterion("EG07BJ46 not in", values, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46Between(String value1, String value2) {
            addCriterion("EG07BJ46 between", value1, value2, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj46NotBetween(String value1, String value2) {
            addCriterion("EG07BJ46 not between", value1, value2, "eg07bj46");
            return (Criteria) this;
        }

        public Criteria andEg07bj47IsNull() {
            addCriterion("EG07BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj47IsNotNull() {
            addCriterion("EG07BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj47EqualTo(String value) {
            addCriterion("EG07BJ47 =", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47NotEqualTo(String value) {
            addCriterion("EG07BJ47 <>", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47GreaterThan(String value) {
            addCriterion("EG07BJ47 >", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ47 >=", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47LessThan(String value) {
            addCriterion("EG07BJ47 <", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ47 <=", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47Like(String value) {
            addCriterion("EG07BJ47 like", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47NotLike(String value) {
            addCriterion("EG07BJ47 not like", value, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47In(List<String> values) {
            addCriterion("EG07BJ47 in", values, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47NotIn(List<String> values) {
            addCriterion("EG07BJ47 not in", values, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47Between(String value1, String value2) {
            addCriterion("EG07BJ47 between", value1, value2, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj47NotBetween(String value1, String value2) {
            addCriterion("EG07BJ47 not between", value1, value2, "eg07bj47");
            return (Criteria) this;
        }

        public Criteria andEg07bj48IsNull() {
            addCriterion("EG07BJ48 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj48IsNotNull() {
            addCriterion("EG07BJ48 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj48EqualTo(String value) {
            addCriterion("EG07BJ48 =", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48NotEqualTo(String value) {
            addCriterion("EG07BJ48 <>", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48GreaterThan(String value) {
            addCriterion("EG07BJ48 >", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ48 >=", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48LessThan(String value) {
            addCriterion("EG07BJ48 <", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ48 <=", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48Like(String value) {
            addCriterion("EG07BJ48 like", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48NotLike(String value) {
            addCriterion("EG07BJ48 not like", value, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48In(List<String> values) {
            addCriterion("EG07BJ48 in", values, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48NotIn(List<String> values) {
            addCriterion("EG07BJ48 not in", values, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48Between(String value1, String value2) {
            addCriterion("EG07BJ48 between", value1, value2, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj48NotBetween(String value1, String value2) {
            addCriterion("EG07BJ48 not between", value1, value2, "eg07bj48");
            return (Criteria) this;
        }

        public Criteria andEg07bj49IsNull() {
            addCriterion("EG07BJ49 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj49IsNotNull() {
            addCriterion("EG07BJ49 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj49EqualTo(String value) {
            addCriterion("EG07BJ49 =", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49NotEqualTo(String value) {
            addCriterion("EG07BJ49 <>", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49GreaterThan(String value) {
            addCriterion("EG07BJ49 >", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ49 >=", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49LessThan(String value) {
            addCriterion("EG07BJ49 <", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ49 <=", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49Like(String value) {
            addCriterion("EG07BJ49 like", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49NotLike(String value) {
            addCriterion("EG07BJ49 not like", value, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49In(List<String> values) {
            addCriterion("EG07BJ49 in", values, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49NotIn(List<String> values) {
            addCriterion("EG07BJ49 not in", values, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49Between(String value1, String value2) {
            addCriterion("EG07BJ49 between", value1, value2, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj49NotBetween(String value1, String value2) {
            addCriterion("EG07BJ49 not between", value1, value2, "eg07bj49");
            return (Criteria) this;
        }

        public Criteria andEg07bj50IsNull() {
            addCriterion("EG07BJ50 is null");
            return (Criteria) this;
        }

        public Criteria andEg07bj50IsNotNull() {
            addCriterion("EG07BJ50 is not null");
            return (Criteria) this;
        }

        public Criteria andEg07bj50EqualTo(String value) {
            addCriterion("EG07BJ50 =", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50NotEqualTo(String value) {
            addCriterion("EG07BJ50 <>", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50GreaterThan(String value) {
            addCriterion("EG07BJ50 >", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50GreaterThanOrEqualTo(String value) {
            addCriterion("EG07BJ50 >=", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50LessThan(String value) {
            addCriterion("EG07BJ50 <", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50LessThanOrEqualTo(String value) {
            addCriterion("EG07BJ50 <=", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50Like(String value) {
            addCriterion("EG07BJ50 like", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50NotLike(String value) {
            addCriterion("EG07BJ50 not like", value, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50In(List<String> values) {
            addCriterion("EG07BJ50 in", values, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50NotIn(List<String> values) {
            addCriterion("EG07BJ50 not in", values, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50Between(String value1, String value2) {
            addCriterion("EG07BJ50 between", value1, value2, "eg07bj50");
            return (Criteria) this;
        }

        public Criteria andEg07bj50NotBetween(String value1, String value2) {
            addCriterion("EG07BJ50 not between", value1, value2, "eg07bj50");
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