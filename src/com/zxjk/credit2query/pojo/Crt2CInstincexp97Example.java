package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CInstincexp97Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CInstincexp97Example() {
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

        public Criteria andEg09bj01IsNull() {
            addCriterion("EG09BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj01IsNotNull() {
            addCriterion("EG09BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj01EqualTo(String value) {
            addCriterion("EG09BJ01 =", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01NotEqualTo(String value) {
            addCriterion("EG09BJ01 <>", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01GreaterThan(String value) {
            addCriterion("EG09BJ01 >", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ01 >=", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01LessThan(String value) {
            addCriterion("EG09BJ01 <", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ01 <=", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01Like(String value) {
            addCriterion("EG09BJ01 like", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01NotLike(String value) {
            addCriterion("EG09BJ01 not like", value, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01In(List<String> values) {
            addCriterion("EG09BJ01 in", values, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01NotIn(List<String> values) {
            addCriterion("EG09BJ01 not in", values, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01Between(String value1, String value2) {
            addCriterion("EG09BJ01 between", value1, value2, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj01NotBetween(String value1, String value2) {
            addCriterion("EG09BJ01 not between", value1, value2, "eg09bj01");
            return (Criteria) this;
        }

        public Criteria andEg09bj02IsNull() {
            addCriterion("EG09BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj02IsNotNull() {
            addCriterion("EG09BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj02EqualTo(String value) {
            addCriterion("EG09BJ02 =", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02NotEqualTo(String value) {
            addCriterion("EG09BJ02 <>", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02GreaterThan(String value) {
            addCriterion("EG09BJ02 >", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ02 >=", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02LessThan(String value) {
            addCriterion("EG09BJ02 <", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ02 <=", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02Like(String value) {
            addCriterion("EG09BJ02 like", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02NotLike(String value) {
            addCriterion("EG09BJ02 not like", value, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02In(List<String> values) {
            addCriterion("EG09BJ02 in", values, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02NotIn(List<String> values) {
            addCriterion("EG09BJ02 not in", values, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02Between(String value1, String value2) {
            addCriterion("EG09BJ02 between", value1, value2, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj02NotBetween(String value1, String value2) {
            addCriterion("EG09BJ02 not between", value1, value2, "eg09bj02");
            return (Criteria) this;
        }

        public Criteria andEg09bj03IsNull() {
            addCriterion("EG09BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj03IsNotNull() {
            addCriterion("EG09BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj03EqualTo(String value) {
            addCriterion("EG09BJ03 =", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03NotEqualTo(String value) {
            addCriterion("EG09BJ03 <>", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03GreaterThan(String value) {
            addCriterion("EG09BJ03 >", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ03 >=", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03LessThan(String value) {
            addCriterion("EG09BJ03 <", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ03 <=", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03Like(String value) {
            addCriterion("EG09BJ03 like", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03NotLike(String value) {
            addCriterion("EG09BJ03 not like", value, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03In(List<String> values) {
            addCriterion("EG09BJ03 in", values, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03NotIn(List<String> values) {
            addCriterion("EG09BJ03 not in", values, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03Between(String value1, String value2) {
            addCriterion("EG09BJ03 between", value1, value2, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj03NotBetween(String value1, String value2) {
            addCriterion("EG09BJ03 not between", value1, value2, "eg09bj03");
            return (Criteria) this;
        }

        public Criteria andEg09bj04IsNull() {
            addCriterion("EG09BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj04IsNotNull() {
            addCriterion("EG09BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj04EqualTo(String value) {
            addCriterion("EG09BJ04 =", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04NotEqualTo(String value) {
            addCriterion("EG09BJ04 <>", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04GreaterThan(String value) {
            addCriterion("EG09BJ04 >", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ04 >=", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04LessThan(String value) {
            addCriterion("EG09BJ04 <", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ04 <=", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04Like(String value) {
            addCriterion("EG09BJ04 like", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04NotLike(String value) {
            addCriterion("EG09BJ04 not like", value, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04In(List<String> values) {
            addCriterion("EG09BJ04 in", values, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04NotIn(List<String> values) {
            addCriterion("EG09BJ04 not in", values, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04Between(String value1, String value2) {
            addCriterion("EG09BJ04 between", value1, value2, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj04NotBetween(String value1, String value2) {
            addCriterion("EG09BJ04 not between", value1, value2, "eg09bj04");
            return (Criteria) this;
        }

        public Criteria andEg09bj05IsNull() {
            addCriterion("EG09BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj05IsNotNull() {
            addCriterion("EG09BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj05EqualTo(String value) {
            addCriterion("EG09BJ05 =", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05NotEqualTo(String value) {
            addCriterion("EG09BJ05 <>", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05GreaterThan(String value) {
            addCriterion("EG09BJ05 >", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ05 >=", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05LessThan(String value) {
            addCriterion("EG09BJ05 <", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ05 <=", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05Like(String value) {
            addCriterion("EG09BJ05 like", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05NotLike(String value) {
            addCriterion("EG09BJ05 not like", value, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05In(List<String> values) {
            addCriterion("EG09BJ05 in", values, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05NotIn(List<String> values) {
            addCriterion("EG09BJ05 not in", values, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05Between(String value1, String value2) {
            addCriterion("EG09BJ05 between", value1, value2, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj05NotBetween(String value1, String value2) {
            addCriterion("EG09BJ05 not between", value1, value2, "eg09bj05");
            return (Criteria) this;
        }

        public Criteria andEg09bj06IsNull() {
            addCriterion("EG09BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj06IsNotNull() {
            addCriterion("EG09BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj06EqualTo(String value) {
            addCriterion("EG09BJ06 =", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06NotEqualTo(String value) {
            addCriterion("EG09BJ06 <>", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06GreaterThan(String value) {
            addCriterion("EG09BJ06 >", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ06 >=", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06LessThan(String value) {
            addCriterion("EG09BJ06 <", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ06 <=", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06Like(String value) {
            addCriterion("EG09BJ06 like", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06NotLike(String value) {
            addCriterion("EG09BJ06 not like", value, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06In(List<String> values) {
            addCriterion("EG09BJ06 in", values, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06NotIn(List<String> values) {
            addCriterion("EG09BJ06 not in", values, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06Between(String value1, String value2) {
            addCriterion("EG09BJ06 between", value1, value2, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj06NotBetween(String value1, String value2) {
            addCriterion("EG09BJ06 not between", value1, value2, "eg09bj06");
            return (Criteria) this;
        }

        public Criteria andEg09bj07IsNull() {
            addCriterion("EG09BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj07IsNotNull() {
            addCriterion("EG09BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj07EqualTo(String value) {
            addCriterion("EG09BJ07 =", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07NotEqualTo(String value) {
            addCriterion("EG09BJ07 <>", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07GreaterThan(String value) {
            addCriterion("EG09BJ07 >", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ07 >=", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07LessThan(String value) {
            addCriterion("EG09BJ07 <", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ07 <=", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07Like(String value) {
            addCriterion("EG09BJ07 like", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07NotLike(String value) {
            addCriterion("EG09BJ07 not like", value, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07In(List<String> values) {
            addCriterion("EG09BJ07 in", values, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07NotIn(List<String> values) {
            addCriterion("EG09BJ07 not in", values, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07Between(String value1, String value2) {
            addCriterion("EG09BJ07 between", value1, value2, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj07NotBetween(String value1, String value2) {
            addCriterion("EG09BJ07 not between", value1, value2, "eg09bj07");
            return (Criteria) this;
        }

        public Criteria andEg09bj08IsNull() {
            addCriterion("EG09BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj08IsNotNull() {
            addCriterion("EG09BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj08EqualTo(String value) {
            addCriterion("EG09BJ08 =", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08NotEqualTo(String value) {
            addCriterion("EG09BJ08 <>", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08GreaterThan(String value) {
            addCriterion("EG09BJ08 >", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ08 >=", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08LessThan(String value) {
            addCriterion("EG09BJ08 <", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ08 <=", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08Like(String value) {
            addCriterion("EG09BJ08 like", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08NotLike(String value) {
            addCriterion("EG09BJ08 not like", value, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08In(List<String> values) {
            addCriterion("EG09BJ08 in", values, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08NotIn(List<String> values) {
            addCriterion("EG09BJ08 not in", values, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08Between(String value1, String value2) {
            addCriterion("EG09BJ08 between", value1, value2, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj08NotBetween(String value1, String value2) {
            addCriterion("EG09BJ08 not between", value1, value2, "eg09bj08");
            return (Criteria) this;
        }

        public Criteria andEg09bj09IsNull() {
            addCriterion("EG09BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj09IsNotNull() {
            addCriterion("EG09BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj09EqualTo(String value) {
            addCriterion("EG09BJ09 =", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09NotEqualTo(String value) {
            addCriterion("EG09BJ09 <>", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09GreaterThan(String value) {
            addCriterion("EG09BJ09 >", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ09 >=", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09LessThan(String value) {
            addCriterion("EG09BJ09 <", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ09 <=", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09Like(String value) {
            addCriterion("EG09BJ09 like", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09NotLike(String value) {
            addCriterion("EG09BJ09 not like", value, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09In(List<String> values) {
            addCriterion("EG09BJ09 in", values, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09NotIn(List<String> values) {
            addCriterion("EG09BJ09 not in", values, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09Between(String value1, String value2) {
            addCriterion("EG09BJ09 between", value1, value2, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj09NotBetween(String value1, String value2) {
            addCriterion("EG09BJ09 not between", value1, value2, "eg09bj09");
            return (Criteria) this;
        }

        public Criteria andEg09bj10IsNull() {
            addCriterion("EG09BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj10IsNotNull() {
            addCriterion("EG09BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj10EqualTo(String value) {
            addCriterion("EG09BJ10 =", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10NotEqualTo(String value) {
            addCriterion("EG09BJ10 <>", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10GreaterThan(String value) {
            addCriterion("EG09BJ10 >", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ10 >=", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10LessThan(String value) {
            addCriterion("EG09BJ10 <", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ10 <=", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10Like(String value) {
            addCriterion("EG09BJ10 like", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10NotLike(String value) {
            addCriterion("EG09BJ10 not like", value, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10In(List<String> values) {
            addCriterion("EG09BJ10 in", values, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10NotIn(List<String> values) {
            addCriterion("EG09BJ10 not in", values, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10Between(String value1, String value2) {
            addCriterion("EG09BJ10 between", value1, value2, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj10NotBetween(String value1, String value2) {
            addCriterion("EG09BJ10 not between", value1, value2, "eg09bj10");
            return (Criteria) this;
        }

        public Criteria andEg09bj11IsNull() {
            addCriterion("EG09BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj11IsNotNull() {
            addCriterion("EG09BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj11EqualTo(String value) {
            addCriterion("EG09BJ11 =", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11NotEqualTo(String value) {
            addCriterion("EG09BJ11 <>", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11GreaterThan(String value) {
            addCriterion("EG09BJ11 >", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ11 >=", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11LessThan(String value) {
            addCriterion("EG09BJ11 <", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ11 <=", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11Like(String value) {
            addCriterion("EG09BJ11 like", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11NotLike(String value) {
            addCriterion("EG09BJ11 not like", value, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11In(List<String> values) {
            addCriterion("EG09BJ11 in", values, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11NotIn(List<String> values) {
            addCriterion("EG09BJ11 not in", values, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11Between(String value1, String value2) {
            addCriterion("EG09BJ11 between", value1, value2, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj11NotBetween(String value1, String value2) {
            addCriterion("EG09BJ11 not between", value1, value2, "eg09bj11");
            return (Criteria) this;
        }

        public Criteria andEg09bj12IsNull() {
            addCriterion("EG09BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj12IsNotNull() {
            addCriterion("EG09BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj12EqualTo(String value) {
            addCriterion("EG09BJ12 =", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12NotEqualTo(String value) {
            addCriterion("EG09BJ12 <>", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12GreaterThan(String value) {
            addCriterion("EG09BJ12 >", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ12 >=", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12LessThan(String value) {
            addCriterion("EG09BJ12 <", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ12 <=", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12Like(String value) {
            addCriterion("EG09BJ12 like", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12NotLike(String value) {
            addCriterion("EG09BJ12 not like", value, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12In(List<String> values) {
            addCriterion("EG09BJ12 in", values, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12NotIn(List<String> values) {
            addCriterion("EG09BJ12 not in", values, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12Between(String value1, String value2) {
            addCriterion("EG09BJ12 between", value1, value2, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj12NotBetween(String value1, String value2) {
            addCriterion("EG09BJ12 not between", value1, value2, "eg09bj12");
            return (Criteria) this;
        }

        public Criteria andEg09bj13IsNull() {
            addCriterion("EG09BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj13IsNotNull() {
            addCriterion("EG09BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj13EqualTo(String value) {
            addCriterion("EG09BJ13 =", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13NotEqualTo(String value) {
            addCriterion("EG09BJ13 <>", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13GreaterThan(String value) {
            addCriterion("EG09BJ13 >", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ13 >=", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13LessThan(String value) {
            addCriterion("EG09BJ13 <", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ13 <=", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13Like(String value) {
            addCriterion("EG09BJ13 like", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13NotLike(String value) {
            addCriterion("EG09BJ13 not like", value, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13In(List<String> values) {
            addCriterion("EG09BJ13 in", values, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13NotIn(List<String> values) {
            addCriterion("EG09BJ13 not in", values, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13Between(String value1, String value2) {
            addCriterion("EG09BJ13 between", value1, value2, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj13NotBetween(String value1, String value2) {
            addCriterion("EG09BJ13 not between", value1, value2, "eg09bj13");
            return (Criteria) this;
        }

        public Criteria andEg09bj14IsNull() {
            addCriterion("EG09BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj14IsNotNull() {
            addCriterion("EG09BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj14EqualTo(String value) {
            addCriterion("EG09BJ14 =", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14NotEqualTo(String value) {
            addCriterion("EG09BJ14 <>", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14GreaterThan(String value) {
            addCriterion("EG09BJ14 >", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ14 >=", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14LessThan(String value) {
            addCriterion("EG09BJ14 <", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ14 <=", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14Like(String value) {
            addCriterion("EG09BJ14 like", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14NotLike(String value) {
            addCriterion("EG09BJ14 not like", value, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14In(List<String> values) {
            addCriterion("EG09BJ14 in", values, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14NotIn(List<String> values) {
            addCriterion("EG09BJ14 not in", values, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14Between(String value1, String value2) {
            addCriterion("EG09BJ14 between", value1, value2, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj14NotBetween(String value1, String value2) {
            addCriterion("EG09BJ14 not between", value1, value2, "eg09bj14");
            return (Criteria) this;
        }

        public Criteria andEg09bj15IsNull() {
            addCriterion("EG09BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj15IsNotNull() {
            addCriterion("EG09BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj15EqualTo(String value) {
            addCriterion("EG09BJ15 =", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15NotEqualTo(String value) {
            addCriterion("EG09BJ15 <>", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15GreaterThan(String value) {
            addCriterion("EG09BJ15 >", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ15 >=", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15LessThan(String value) {
            addCriterion("EG09BJ15 <", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ15 <=", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15Like(String value) {
            addCriterion("EG09BJ15 like", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15NotLike(String value) {
            addCriterion("EG09BJ15 not like", value, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15In(List<String> values) {
            addCriterion("EG09BJ15 in", values, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15NotIn(List<String> values) {
            addCriterion("EG09BJ15 not in", values, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15Between(String value1, String value2) {
            addCriterion("EG09BJ15 between", value1, value2, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj15NotBetween(String value1, String value2) {
            addCriterion("EG09BJ15 not between", value1, value2, "eg09bj15");
            return (Criteria) this;
        }

        public Criteria andEg09bj16IsNull() {
            addCriterion("EG09BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj16IsNotNull() {
            addCriterion("EG09BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj16EqualTo(String value) {
            addCriterion("EG09BJ16 =", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16NotEqualTo(String value) {
            addCriterion("EG09BJ16 <>", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16GreaterThan(String value) {
            addCriterion("EG09BJ16 >", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ16 >=", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16LessThan(String value) {
            addCriterion("EG09BJ16 <", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ16 <=", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16Like(String value) {
            addCriterion("EG09BJ16 like", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16NotLike(String value) {
            addCriterion("EG09BJ16 not like", value, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16In(List<String> values) {
            addCriterion("EG09BJ16 in", values, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16NotIn(List<String> values) {
            addCriterion("EG09BJ16 not in", values, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16Between(String value1, String value2) {
            addCriterion("EG09BJ16 between", value1, value2, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj16NotBetween(String value1, String value2) {
            addCriterion("EG09BJ16 not between", value1, value2, "eg09bj16");
            return (Criteria) this;
        }

        public Criteria andEg09bj17IsNull() {
            addCriterion("EG09BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj17IsNotNull() {
            addCriterion("EG09BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj17EqualTo(String value) {
            addCriterion("EG09BJ17 =", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17NotEqualTo(String value) {
            addCriterion("EG09BJ17 <>", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17GreaterThan(String value) {
            addCriterion("EG09BJ17 >", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ17 >=", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17LessThan(String value) {
            addCriterion("EG09BJ17 <", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ17 <=", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17Like(String value) {
            addCriterion("EG09BJ17 like", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17NotLike(String value) {
            addCriterion("EG09BJ17 not like", value, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17In(List<String> values) {
            addCriterion("EG09BJ17 in", values, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17NotIn(List<String> values) {
            addCriterion("EG09BJ17 not in", values, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17Between(String value1, String value2) {
            addCriterion("EG09BJ17 between", value1, value2, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj17NotBetween(String value1, String value2) {
            addCriterion("EG09BJ17 not between", value1, value2, "eg09bj17");
            return (Criteria) this;
        }

        public Criteria andEg09bj18IsNull() {
            addCriterion("EG09BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj18IsNotNull() {
            addCriterion("EG09BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj18EqualTo(String value) {
            addCriterion("EG09BJ18 =", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18NotEqualTo(String value) {
            addCriterion("EG09BJ18 <>", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18GreaterThan(String value) {
            addCriterion("EG09BJ18 >", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ18 >=", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18LessThan(String value) {
            addCriterion("EG09BJ18 <", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ18 <=", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18Like(String value) {
            addCriterion("EG09BJ18 like", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18NotLike(String value) {
            addCriterion("EG09BJ18 not like", value, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18In(List<String> values) {
            addCriterion("EG09BJ18 in", values, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18NotIn(List<String> values) {
            addCriterion("EG09BJ18 not in", values, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18Between(String value1, String value2) {
            addCriterion("EG09BJ18 between", value1, value2, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj18NotBetween(String value1, String value2) {
            addCriterion("EG09BJ18 not between", value1, value2, "eg09bj18");
            return (Criteria) this;
        }

        public Criteria andEg09bj19IsNull() {
            addCriterion("EG09BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj19IsNotNull() {
            addCriterion("EG09BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj19EqualTo(String value) {
            addCriterion("EG09BJ19 =", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19NotEqualTo(String value) {
            addCriterion("EG09BJ19 <>", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19GreaterThan(String value) {
            addCriterion("EG09BJ19 >", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ19 >=", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19LessThan(String value) {
            addCriterion("EG09BJ19 <", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ19 <=", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19Like(String value) {
            addCriterion("EG09BJ19 like", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19NotLike(String value) {
            addCriterion("EG09BJ19 not like", value, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19In(List<String> values) {
            addCriterion("EG09BJ19 in", values, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19NotIn(List<String> values) {
            addCriterion("EG09BJ19 not in", values, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19Between(String value1, String value2) {
            addCriterion("EG09BJ19 between", value1, value2, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj19NotBetween(String value1, String value2) {
            addCriterion("EG09BJ19 not between", value1, value2, "eg09bj19");
            return (Criteria) this;
        }

        public Criteria andEg09bj20IsNull() {
            addCriterion("EG09BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj20IsNotNull() {
            addCriterion("EG09BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj20EqualTo(String value) {
            addCriterion("EG09BJ20 =", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20NotEqualTo(String value) {
            addCriterion("EG09BJ20 <>", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20GreaterThan(String value) {
            addCriterion("EG09BJ20 >", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ20 >=", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20LessThan(String value) {
            addCriterion("EG09BJ20 <", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ20 <=", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20Like(String value) {
            addCriterion("EG09BJ20 like", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20NotLike(String value) {
            addCriterion("EG09BJ20 not like", value, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20In(List<String> values) {
            addCriterion("EG09BJ20 in", values, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20NotIn(List<String> values) {
            addCriterion("EG09BJ20 not in", values, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20Between(String value1, String value2) {
            addCriterion("EG09BJ20 between", value1, value2, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj20NotBetween(String value1, String value2) {
            addCriterion("EG09BJ20 not between", value1, value2, "eg09bj20");
            return (Criteria) this;
        }

        public Criteria andEg09bj21IsNull() {
            addCriterion("EG09BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj21IsNotNull() {
            addCriterion("EG09BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj21EqualTo(String value) {
            addCriterion("EG09BJ21 =", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21NotEqualTo(String value) {
            addCriterion("EG09BJ21 <>", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21GreaterThan(String value) {
            addCriterion("EG09BJ21 >", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ21 >=", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21LessThan(String value) {
            addCriterion("EG09BJ21 <", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ21 <=", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21Like(String value) {
            addCriterion("EG09BJ21 like", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21NotLike(String value) {
            addCriterion("EG09BJ21 not like", value, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21In(List<String> values) {
            addCriterion("EG09BJ21 in", values, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21NotIn(List<String> values) {
            addCriterion("EG09BJ21 not in", values, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21Between(String value1, String value2) {
            addCriterion("EG09BJ21 between", value1, value2, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj21NotBetween(String value1, String value2) {
            addCriterion("EG09BJ21 not between", value1, value2, "eg09bj21");
            return (Criteria) this;
        }

        public Criteria andEg09bj22IsNull() {
            addCriterion("EG09BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj22IsNotNull() {
            addCriterion("EG09BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj22EqualTo(String value) {
            addCriterion("EG09BJ22 =", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22NotEqualTo(String value) {
            addCriterion("EG09BJ22 <>", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22GreaterThan(String value) {
            addCriterion("EG09BJ22 >", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ22 >=", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22LessThan(String value) {
            addCriterion("EG09BJ22 <", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ22 <=", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22Like(String value) {
            addCriterion("EG09BJ22 like", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22NotLike(String value) {
            addCriterion("EG09BJ22 not like", value, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22In(List<String> values) {
            addCriterion("EG09BJ22 in", values, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22NotIn(List<String> values) {
            addCriterion("EG09BJ22 not in", values, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22Between(String value1, String value2) {
            addCriterion("EG09BJ22 between", value1, value2, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj22NotBetween(String value1, String value2) {
            addCriterion("EG09BJ22 not between", value1, value2, "eg09bj22");
            return (Criteria) this;
        }

        public Criteria andEg09bj23IsNull() {
            addCriterion("EG09BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj23IsNotNull() {
            addCriterion("EG09BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj23EqualTo(String value) {
            addCriterion("EG09BJ23 =", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23NotEqualTo(String value) {
            addCriterion("EG09BJ23 <>", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23GreaterThan(String value) {
            addCriterion("EG09BJ23 >", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ23 >=", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23LessThan(String value) {
            addCriterion("EG09BJ23 <", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ23 <=", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23Like(String value) {
            addCriterion("EG09BJ23 like", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23NotLike(String value) {
            addCriterion("EG09BJ23 not like", value, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23In(List<String> values) {
            addCriterion("EG09BJ23 in", values, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23NotIn(List<String> values) {
            addCriterion("EG09BJ23 not in", values, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23Between(String value1, String value2) {
            addCriterion("EG09BJ23 between", value1, value2, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj23NotBetween(String value1, String value2) {
            addCriterion("EG09BJ23 not between", value1, value2, "eg09bj23");
            return (Criteria) this;
        }

        public Criteria andEg09bj24IsNull() {
            addCriterion("EG09BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj24IsNotNull() {
            addCriterion("EG09BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj24EqualTo(String value) {
            addCriterion("EG09BJ24 =", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24NotEqualTo(String value) {
            addCriterion("EG09BJ24 <>", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24GreaterThan(String value) {
            addCriterion("EG09BJ24 >", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ24 >=", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24LessThan(String value) {
            addCriterion("EG09BJ24 <", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ24 <=", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24Like(String value) {
            addCriterion("EG09BJ24 like", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24NotLike(String value) {
            addCriterion("EG09BJ24 not like", value, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24In(List<String> values) {
            addCriterion("EG09BJ24 in", values, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24NotIn(List<String> values) {
            addCriterion("EG09BJ24 not in", values, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24Between(String value1, String value2) {
            addCriterion("EG09BJ24 between", value1, value2, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj24NotBetween(String value1, String value2) {
            addCriterion("EG09BJ24 not between", value1, value2, "eg09bj24");
            return (Criteria) this;
        }

        public Criteria andEg09bj25IsNull() {
            addCriterion("EG09BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj25IsNotNull() {
            addCriterion("EG09BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj25EqualTo(String value) {
            addCriterion("EG09BJ25 =", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25NotEqualTo(String value) {
            addCriterion("EG09BJ25 <>", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25GreaterThan(String value) {
            addCriterion("EG09BJ25 >", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ25 >=", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25LessThan(String value) {
            addCriterion("EG09BJ25 <", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ25 <=", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25Like(String value) {
            addCriterion("EG09BJ25 like", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25NotLike(String value) {
            addCriterion("EG09BJ25 not like", value, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25In(List<String> values) {
            addCriterion("EG09BJ25 in", values, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25NotIn(List<String> values) {
            addCriterion("EG09BJ25 not in", values, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25Between(String value1, String value2) {
            addCriterion("EG09BJ25 between", value1, value2, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj25NotBetween(String value1, String value2) {
            addCriterion("EG09BJ25 not between", value1, value2, "eg09bj25");
            return (Criteria) this;
        }

        public Criteria andEg09bj26IsNull() {
            addCriterion("EG09BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj26IsNotNull() {
            addCriterion("EG09BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj26EqualTo(String value) {
            addCriterion("EG09BJ26 =", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26NotEqualTo(String value) {
            addCriterion("EG09BJ26 <>", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26GreaterThan(String value) {
            addCriterion("EG09BJ26 >", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ26 >=", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26LessThan(String value) {
            addCriterion("EG09BJ26 <", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ26 <=", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26Like(String value) {
            addCriterion("EG09BJ26 like", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26NotLike(String value) {
            addCriterion("EG09BJ26 not like", value, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26In(List<String> values) {
            addCriterion("EG09BJ26 in", values, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26NotIn(List<String> values) {
            addCriterion("EG09BJ26 not in", values, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26Between(String value1, String value2) {
            addCriterion("EG09BJ26 between", value1, value2, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj26NotBetween(String value1, String value2) {
            addCriterion("EG09BJ26 not between", value1, value2, "eg09bj26");
            return (Criteria) this;
        }

        public Criteria andEg09bj27IsNull() {
            addCriterion("EG09BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj27IsNotNull() {
            addCriterion("EG09BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj27EqualTo(String value) {
            addCriterion("EG09BJ27 =", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27NotEqualTo(String value) {
            addCriterion("EG09BJ27 <>", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27GreaterThan(String value) {
            addCriterion("EG09BJ27 >", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ27 >=", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27LessThan(String value) {
            addCriterion("EG09BJ27 <", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ27 <=", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27Like(String value) {
            addCriterion("EG09BJ27 like", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27NotLike(String value) {
            addCriterion("EG09BJ27 not like", value, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27In(List<String> values) {
            addCriterion("EG09BJ27 in", values, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27NotIn(List<String> values) {
            addCriterion("EG09BJ27 not in", values, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27Between(String value1, String value2) {
            addCriterion("EG09BJ27 between", value1, value2, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj27NotBetween(String value1, String value2) {
            addCriterion("EG09BJ27 not between", value1, value2, "eg09bj27");
            return (Criteria) this;
        }

        public Criteria andEg09bj28IsNull() {
            addCriterion("EG09BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj28IsNotNull() {
            addCriterion("EG09BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj28EqualTo(String value) {
            addCriterion("EG09BJ28 =", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28NotEqualTo(String value) {
            addCriterion("EG09BJ28 <>", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28GreaterThan(String value) {
            addCriterion("EG09BJ28 >", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ28 >=", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28LessThan(String value) {
            addCriterion("EG09BJ28 <", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ28 <=", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28Like(String value) {
            addCriterion("EG09BJ28 like", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28NotLike(String value) {
            addCriterion("EG09BJ28 not like", value, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28In(List<String> values) {
            addCriterion("EG09BJ28 in", values, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28NotIn(List<String> values) {
            addCriterion("EG09BJ28 not in", values, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28Between(String value1, String value2) {
            addCriterion("EG09BJ28 between", value1, value2, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj28NotBetween(String value1, String value2) {
            addCriterion("EG09BJ28 not between", value1, value2, "eg09bj28");
            return (Criteria) this;
        }

        public Criteria andEg09bj29IsNull() {
            addCriterion("EG09BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj29IsNotNull() {
            addCriterion("EG09BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj29EqualTo(String value) {
            addCriterion("EG09BJ29 =", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29NotEqualTo(String value) {
            addCriterion("EG09BJ29 <>", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29GreaterThan(String value) {
            addCriterion("EG09BJ29 >", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ29 >=", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29LessThan(String value) {
            addCriterion("EG09BJ29 <", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ29 <=", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29Like(String value) {
            addCriterion("EG09BJ29 like", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29NotLike(String value) {
            addCriterion("EG09BJ29 not like", value, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29In(List<String> values) {
            addCriterion("EG09BJ29 in", values, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29NotIn(List<String> values) {
            addCriterion("EG09BJ29 not in", values, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29Between(String value1, String value2) {
            addCriterion("EG09BJ29 between", value1, value2, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj29NotBetween(String value1, String value2) {
            addCriterion("EG09BJ29 not between", value1, value2, "eg09bj29");
            return (Criteria) this;
        }

        public Criteria andEg09bj30IsNull() {
            addCriterion("EG09BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj30IsNotNull() {
            addCriterion("EG09BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj30EqualTo(String value) {
            addCriterion("EG09BJ30 =", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30NotEqualTo(String value) {
            addCriterion("EG09BJ30 <>", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30GreaterThan(String value) {
            addCriterion("EG09BJ30 >", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ30 >=", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30LessThan(String value) {
            addCriterion("EG09BJ30 <", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ30 <=", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30Like(String value) {
            addCriterion("EG09BJ30 like", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30NotLike(String value) {
            addCriterion("EG09BJ30 not like", value, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30In(List<String> values) {
            addCriterion("EG09BJ30 in", values, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30NotIn(List<String> values) {
            addCriterion("EG09BJ30 not in", values, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30Between(String value1, String value2) {
            addCriterion("EG09BJ30 between", value1, value2, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj30NotBetween(String value1, String value2) {
            addCriterion("EG09BJ30 not between", value1, value2, "eg09bj30");
            return (Criteria) this;
        }

        public Criteria andEg09bj31IsNull() {
            addCriterion("EG09BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj31IsNotNull() {
            addCriterion("EG09BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj31EqualTo(String value) {
            addCriterion("EG09BJ31 =", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31NotEqualTo(String value) {
            addCriterion("EG09BJ31 <>", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31GreaterThan(String value) {
            addCriterion("EG09BJ31 >", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ31 >=", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31LessThan(String value) {
            addCriterion("EG09BJ31 <", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ31 <=", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31Like(String value) {
            addCriterion("EG09BJ31 like", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31NotLike(String value) {
            addCriterion("EG09BJ31 not like", value, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31In(List<String> values) {
            addCriterion("EG09BJ31 in", values, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31NotIn(List<String> values) {
            addCriterion("EG09BJ31 not in", values, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31Between(String value1, String value2) {
            addCriterion("EG09BJ31 between", value1, value2, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj31NotBetween(String value1, String value2) {
            addCriterion("EG09BJ31 not between", value1, value2, "eg09bj31");
            return (Criteria) this;
        }

        public Criteria andEg09bj32IsNull() {
            addCriterion("EG09BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj32IsNotNull() {
            addCriterion("EG09BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj32EqualTo(String value) {
            addCriterion("EG09BJ32 =", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32NotEqualTo(String value) {
            addCriterion("EG09BJ32 <>", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32GreaterThan(String value) {
            addCriterion("EG09BJ32 >", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ32 >=", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32LessThan(String value) {
            addCriterion("EG09BJ32 <", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ32 <=", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32Like(String value) {
            addCriterion("EG09BJ32 like", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32NotLike(String value) {
            addCriterion("EG09BJ32 not like", value, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32In(List<String> values) {
            addCriterion("EG09BJ32 in", values, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32NotIn(List<String> values) {
            addCriterion("EG09BJ32 not in", values, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32Between(String value1, String value2) {
            addCriterion("EG09BJ32 between", value1, value2, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj32NotBetween(String value1, String value2) {
            addCriterion("EG09BJ32 not between", value1, value2, "eg09bj32");
            return (Criteria) this;
        }

        public Criteria andEg09bj33IsNull() {
            addCriterion("EG09BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj33IsNotNull() {
            addCriterion("EG09BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj33EqualTo(String value) {
            addCriterion("EG09BJ33 =", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33NotEqualTo(String value) {
            addCriterion("EG09BJ33 <>", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33GreaterThan(String value) {
            addCriterion("EG09BJ33 >", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ33 >=", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33LessThan(String value) {
            addCriterion("EG09BJ33 <", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ33 <=", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33Like(String value) {
            addCriterion("EG09BJ33 like", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33NotLike(String value) {
            addCriterion("EG09BJ33 not like", value, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33In(List<String> values) {
            addCriterion("EG09BJ33 in", values, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33NotIn(List<String> values) {
            addCriterion("EG09BJ33 not in", values, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33Between(String value1, String value2) {
            addCriterion("EG09BJ33 between", value1, value2, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj33NotBetween(String value1, String value2) {
            addCriterion("EG09BJ33 not between", value1, value2, "eg09bj33");
            return (Criteria) this;
        }

        public Criteria andEg09bj34IsNull() {
            addCriterion("EG09BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj34IsNotNull() {
            addCriterion("EG09BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj34EqualTo(String value) {
            addCriterion("EG09BJ34 =", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34NotEqualTo(String value) {
            addCriterion("EG09BJ34 <>", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34GreaterThan(String value) {
            addCriterion("EG09BJ34 >", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ34 >=", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34LessThan(String value) {
            addCriterion("EG09BJ34 <", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ34 <=", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34Like(String value) {
            addCriterion("EG09BJ34 like", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34NotLike(String value) {
            addCriterion("EG09BJ34 not like", value, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34In(List<String> values) {
            addCriterion("EG09BJ34 in", values, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34NotIn(List<String> values) {
            addCriterion("EG09BJ34 not in", values, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34Between(String value1, String value2) {
            addCriterion("EG09BJ34 between", value1, value2, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj34NotBetween(String value1, String value2) {
            addCriterion("EG09BJ34 not between", value1, value2, "eg09bj34");
            return (Criteria) this;
        }

        public Criteria andEg09bj35IsNull() {
            addCriterion("EG09BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj35IsNotNull() {
            addCriterion("EG09BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj35EqualTo(String value) {
            addCriterion("EG09BJ35 =", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35NotEqualTo(String value) {
            addCriterion("EG09BJ35 <>", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35GreaterThan(String value) {
            addCriterion("EG09BJ35 >", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ35 >=", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35LessThan(String value) {
            addCriterion("EG09BJ35 <", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ35 <=", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35Like(String value) {
            addCriterion("EG09BJ35 like", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35NotLike(String value) {
            addCriterion("EG09BJ35 not like", value, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35In(List<String> values) {
            addCriterion("EG09BJ35 in", values, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35NotIn(List<String> values) {
            addCriterion("EG09BJ35 not in", values, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35Between(String value1, String value2) {
            addCriterion("EG09BJ35 between", value1, value2, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj35NotBetween(String value1, String value2) {
            addCriterion("EG09BJ35 not between", value1, value2, "eg09bj35");
            return (Criteria) this;
        }

        public Criteria andEg09bj36IsNull() {
            addCriterion("EG09BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj36IsNotNull() {
            addCriterion("EG09BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj36EqualTo(String value) {
            addCriterion("EG09BJ36 =", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36NotEqualTo(String value) {
            addCriterion("EG09BJ36 <>", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36GreaterThan(String value) {
            addCriterion("EG09BJ36 >", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ36 >=", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36LessThan(String value) {
            addCriterion("EG09BJ36 <", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ36 <=", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36Like(String value) {
            addCriterion("EG09BJ36 like", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36NotLike(String value) {
            addCriterion("EG09BJ36 not like", value, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36In(List<String> values) {
            addCriterion("EG09BJ36 in", values, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36NotIn(List<String> values) {
            addCriterion("EG09BJ36 not in", values, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36Between(String value1, String value2) {
            addCriterion("EG09BJ36 between", value1, value2, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj36NotBetween(String value1, String value2) {
            addCriterion("EG09BJ36 not between", value1, value2, "eg09bj36");
            return (Criteria) this;
        }

        public Criteria andEg09bj37IsNull() {
            addCriterion("EG09BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj37IsNotNull() {
            addCriterion("EG09BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj37EqualTo(String value) {
            addCriterion("EG09BJ37 =", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37NotEqualTo(String value) {
            addCriterion("EG09BJ37 <>", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37GreaterThan(String value) {
            addCriterion("EG09BJ37 >", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ37 >=", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37LessThan(String value) {
            addCriterion("EG09BJ37 <", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ37 <=", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37Like(String value) {
            addCriterion("EG09BJ37 like", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37NotLike(String value) {
            addCriterion("EG09BJ37 not like", value, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37In(List<String> values) {
            addCriterion("EG09BJ37 in", values, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37NotIn(List<String> values) {
            addCriterion("EG09BJ37 not in", values, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37Between(String value1, String value2) {
            addCriterion("EG09BJ37 between", value1, value2, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj37NotBetween(String value1, String value2) {
            addCriterion("EG09BJ37 not between", value1, value2, "eg09bj37");
            return (Criteria) this;
        }

        public Criteria andEg09bj38IsNull() {
            addCriterion("EG09BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg09bj38IsNotNull() {
            addCriterion("EG09BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg09bj38EqualTo(String value) {
            addCriterion("EG09BJ38 =", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38NotEqualTo(String value) {
            addCriterion("EG09BJ38 <>", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38GreaterThan(String value) {
            addCriterion("EG09BJ38 >", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG09BJ38 >=", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38LessThan(String value) {
            addCriterion("EG09BJ38 <", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38LessThanOrEqualTo(String value) {
            addCriterion("EG09BJ38 <=", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38Like(String value) {
            addCriterion("EG09BJ38 like", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38NotLike(String value) {
            addCriterion("EG09BJ38 not like", value, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38In(List<String> values) {
            addCriterion("EG09BJ38 in", values, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38NotIn(List<String> values) {
            addCriterion("EG09BJ38 not in", values, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38Between(String value1, String value2) {
            addCriterion("EG09BJ38 between", value1, value2, "eg09bj38");
            return (Criteria) this;
        }

        public Criteria andEg09bj38NotBetween(String value1, String value2) {
            addCriterion("EG09BJ38 not between", value1, value2, "eg09bj38");
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