package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntcashflow07Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntcashflow07Example() {
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

        public Criteria andEg06bj01IsNull() {
            addCriterion("EG06BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj01IsNotNull() {
            addCriterion("EG06BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj01EqualTo(String value) {
            addCriterion("EG06BJ01 =", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01NotEqualTo(String value) {
            addCriterion("EG06BJ01 <>", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01GreaterThan(String value) {
            addCriterion("EG06BJ01 >", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ01 >=", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01LessThan(String value) {
            addCriterion("EG06BJ01 <", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ01 <=", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01Like(String value) {
            addCriterion("EG06BJ01 like", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01NotLike(String value) {
            addCriterion("EG06BJ01 not like", value, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01In(List<String> values) {
            addCriterion("EG06BJ01 in", values, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01NotIn(List<String> values) {
            addCriterion("EG06BJ01 not in", values, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01Between(String value1, String value2) {
            addCriterion("EG06BJ01 between", value1, value2, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj01NotBetween(String value1, String value2) {
            addCriterion("EG06BJ01 not between", value1, value2, "eg06bj01");
            return (Criteria) this;
        }

        public Criteria andEg06bj02IsNull() {
            addCriterion("EG06BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj02IsNotNull() {
            addCriterion("EG06BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj02EqualTo(String value) {
            addCriterion("EG06BJ02 =", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02NotEqualTo(String value) {
            addCriterion("EG06BJ02 <>", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02GreaterThan(String value) {
            addCriterion("EG06BJ02 >", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ02 >=", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02LessThan(String value) {
            addCriterion("EG06BJ02 <", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ02 <=", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02Like(String value) {
            addCriterion("EG06BJ02 like", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02NotLike(String value) {
            addCriterion("EG06BJ02 not like", value, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02In(List<String> values) {
            addCriterion("EG06BJ02 in", values, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02NotIn(List<String> values) {
            addCriterion("EG06BJ02 not in", values, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02Between(String value1, String value2) {
            addCriterion("EG06BJ02 between", value1, value2, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj02NotBetween(String value1, String value2) {
            addCriterion("EG06BJ02 not between", value1, value2, "eg06bj02");
            return (Criteria) this;
        }

        public Criteria andEg06bj03IsNull() {
            addCriterion("EG06BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj03IsNotNull() {
            addCriterion("EG06BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj03EqualTo(String value) {
            addCriterion("EG06BJ03 =", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03NotEqualTo(String value) {
            addCriterion("EG06BJ03 <>", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03GreaterThan(String value) {
            addCriterion("EG06BJ03 >", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ03 >=", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03LessThan(String value) {
            addCriterion("EG06BJ03 <", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ03 <=", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03Like(String value) {
            addCriterion("EG06BJ03 like", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03NotLike(String value) {
            addCriterion("EG06BJ03 not like", value, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03In(List<String> values) {
            addCriterion("EG06BJ03 in", values, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03NotIn(List<String> values) {
            addCriterion("EG06BJ03 not in", values, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03Between(String value1, String value2) {
            addCriterion("EG06BJ03 between", value1, value2, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj03NotBetween(String value1, String value2) {
            addCriterion("EG06BJ03 not between", value1, value2, "eg06bj03");
            return (Criteria) this;
        }

        public Criteria andEg06bj04IsNull() {
            addCriterion("EG06BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj04IsNotNull() {
            addCriterion("EG06BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj04EqualTo(String value) {
            addCriterion("EG06BJ04 =", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04NotEqualTo(String value) {
            addCriterion("EG06BJ04 <>", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04GreaterThan(String value) {
            addCriterion("EG06BJ04 >", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ04 >=", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04LessThan(String value) {
            addCriterion("EG06BJ04 <", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ04 <=", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04Like(String value) {
            addCriterion("EG06BJ04 like", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04NotLike(String value) {
            addCriterion("EG06BJ04 not like", value, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04In(List<String> values) {
            addCriterion("EG06BJ04 in", values, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04NotIn(List<String> values) {
            addCriterion("EG06BJ04 not in", values, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04Between(String value1, String value2) {
            addCriterion("EG06BJ04 between", value1, value2, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj04NotBetween(String value1, String value2) {
            addCriterion("EG06BJ04 not between", value1, value2, "eg06bj04");
            return (Criteria) this;
        }

        public Criteria andEg06bj05IsNull() {
            addCriterion("EG06BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj05IsNotNull() {
            addCriterion("EG06BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj05EqualTo(String value) {
            addCriterion("EG06BJ05 =", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05NotEqualTo(String value) {
            addCriterion("EG06BJ05 <>", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05GreaterThan(String value) {
            addCriterion("EG06BJ05 >", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ05 >=", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05LessThan(String value) {
            addCriterion("EG06BJ05 <", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ05 <=", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05Like(String value) {
            addCriterion("EG06BJ05 like", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05NotLike(String value) {
            addCriterion("EG06BJ05 not like", value, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05In(List<String> values) {
            addCriterion("EG06BJ05 in", values, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05NotIn(List<String> values) {
            addCriterion("EG06BJ05 not in", values, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05Between(String value1, String value2) {
            addCriterion("EG06BJ05 between", value1, value2, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj05NotBetween(String value1, String value2) {
            addCriterion("EG06BJ05 not between", value1, value2, "eg06bj05");
            return (Criteria) this;
        }

        public Criteria andEg06bj06IsNull() {
            addCriterion("EG06BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj06IsNotNull() {
            addCriterion("EG06BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj06EqualTo(String value) {
            addCriterion("EG06BJ06 =", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06NotEqualTo(String value) {
            addCriterion("EG06BJ06 <>", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06GreaterThan(String value) {
            addCriterion("EG06BJ06 >", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ06 >=", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06LessThan(String value) {
            addCriterion("EG06BJ06 <", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ06 <=", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06Like(String value) {
            addCriterion("EG06BJ06 like", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06NotLike(String value) {
            addCriterion("EG06BJ06 not like", value, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06In(List<String> values) {
            addCriterion("EG06BJ06 in", values, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06NotIn(List<String> values) {
            addCriterion("EG06BJ06 not in", values, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06Between(String value1, String value2) {
            addCriterion("EG06BJ06 between", value1, value2, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj06NotBetween(String value1, String value2) {
            addCriterion("EG06BJ06 not between", value1, value2, "eg06bj06");
            return (Criteria) this;
        }

        public Criteria andEg06bj07IsNull() {
            addCriterion("EG06BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj07IsNotNull() {
            addCriterion("EG06BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj07EqualTo(String value) {
            addCriterion("EG06BJ07 =", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07NotEqualTo(String value) {
            addCriterion("EG06BJ07 <>", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07GreaterThan(String value) {
            addCriterion("EG06BJ07 >", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ07 >=", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07LessThan(String value) {
            addCriterion("EG06BJ07 <", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ07 <=", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07Like(String value) {
            addCriterion("EG06BJ07 like", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07NotLike(String value) {
            addCriterion("EG06BJ07 not like", value, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07In(List<String> values) {
            addCriterion("EG06BJ07 in", values, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07NotIn(List<String> values) {
            addCriterion("EG06BJ07 not in", values, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07Between(String value1, String value2) {
            addCriterion("EG06BJ07 between", value1, value2, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj07NotBetween(String value1, String value2) {
            addCriterion("EG06BJ07 not between", value1, value2, "eg06bj07");
            return (Criteria) this;
        }

        public Criteria andEg06bj08IsNull() {
            addCriterion("EG06BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj08IsNotNull() {
            addCriterion("EG06BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj08EqualTo(String value) {
            addCriterion("EG06BJ08 =", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08NotEqualTo(String value) {
            addCriterion("EG06BJ08 <>", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08GreaterThan(String value) {
            addCriterion("EG06BJ08 >", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ08 >=", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08LessThan(String value) {
            addCriterion("EG06BJ08 <", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ08 <=", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08Like(String value) {
            addCriterion("EG06BJ08 like", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08NotLike(String value) {
            addCriterion("EG06BJ08 not like", value, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08In(List<String> values) {
            addCriterion("EG06BJ08 in", values, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08NotIn(List<String> values) {
            addCriterion("EG06BJ08 not in", values, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08Between(String value1, String value2) {
            addCriterion("EG06BJ08 between", value1, value2, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj08NotBetween(String value1, String value2) {
            addCriterion("EG06BJ08 not between", value1, value2, "eg06bj08");
            return (Criteria) this;
        }

        public Criteria andEg06bj09IsNull() {
            addCriterion("EG06BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj09IsNotNull() {
            addCriterion("EG06BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj09EqualTo(String value) {
            addCriterion("EG06BJ09 =", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09NotEqualTo(String value) {
            addCriterion("EG06BJ09 <>", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09GreaterThan(String value) {
            addCriterion("EG06BJ09 >", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ09 >=", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09LessThan(String value) {
            addCriterion("EG06BJ09 <", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ09 <=", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09Like(String value) {
            addCriterion("EG06BJ09 like", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09NotLike(String value) {
            addCriterion("EG06BJ09 not like", value, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09In(List<String> values) {
            addCriterion("EG06BJ09 in", values, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09NotIn(List<String> values) {
            addCriterion("EG06BJ09 not in", values, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09Between(String value1, String value2) {
            addCriterion("EG06BJ09 between", value1, value2, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj09NotBetween(String value1, String value2) {
            addCriterion("EG06BJ09 not between", value1, value2, "eg06bj09");
            return (Criteria) this;
        }

        public Criteria andEg06bj10IsNull() {
            addCriterion("EG06BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj10IsNotNull() {
            addCriterion("EG06BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj10EqualTo(String value) {
            addCriterion("EG06BJ10 =", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10NotEqualTo(String value) {
            addCriterion("EG06BJ10 <>", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10GreaterThan(String value) {
            addCriterion("EG06BJ10 >", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ10 >=", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10LessThan(String value) {
            addCriterion("EG06BJ10 <", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ10 <=", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10Like(String value) {
            addCriterion("EG06BJ10 like", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10NotLike(String value) {
            addCriterion("EG06BJ10 not like", value, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10In(List<String> values) {
            addCriterion("EG06BJ10 in", values, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10NotIn(List<String> values) {
            addCriterion("EG06BJ10 not in", values, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10Between(String value1, String value2) {
            addCriterion("EG06BJ10 between", value1, value2, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj10NotBetween(String value1, String value2) {
            addCriterion("EG06BJ10 not between", value1, value2, "eg06bj10");
            return (Criteria) this;
        }

        public Criteria andEg06bj11IsNull() {
            addCriterion("EG06BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj11IsNotNull() {
            addCriterion("EG06BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj11EqualTo(String value) {
            addCriterion("EG06BJ11 =", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11NotEqualTo(String value) {
            addCriterion("EG06BJ11 <>", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11GreaterThan(String value) {
            addCriterion("EG06BJ11 >", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ11 >=", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11LessThan(String value) {
            addCriterion("EG06BJ11 <", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ11 <=", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11Like(String value) {
            addCriterion("EG06BJ11 like", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11NotLike(String value) {
            addCriterion("EG06BJ11 not like", value, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11In(List<String> values) {
            addCriterion("EG06BJ11 in", values, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11NotIn(List<String> values) {
            addCriterion("EG06BJ11 not in", values, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11Between(String value1, String value2) {
            addCriterion("EG06BJ11 between", value1, value2, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj11NotBetween(String value1, String value2) {
            addCriterion("EG06BJ11 not between", value1, value2, "eg06bj11");
            return (Criteria) this;
        }

        public Criteria andEg06bj12IsNull() {
            addCriterion("EG06BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj12IsNotNull() {
            addCriterion("EG06BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj12EqualTo(String value) {
            addCriterion("EG06BJ12 =", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12NotEqualTo(String value) {
            addCriterion("EG06BJ12 <>", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12GreaterThan(String value) {
            addCriterion("EG06BJ12 >", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ12 >=", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12LessThan(String value) {
            addCriterion("EG06BJ12 <", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ12 <=", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12Like(String value) {
            addCriterion("EG06BJ12 like", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12NotLike(String value) {
            addCriterion("EG06BJ12 not like", value, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12In(List<String> values) {
            addCriterion("EG06BJ12 in", values, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12NotIn(List<String> values) {
            addCriterion("EG06BJ12 not in", values, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12Between(String value1, String value2) {
            addCriterion("EG06BJ12 between", value1, value2, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj12NotBetween(String value1, String value2) {
            addCriterion("EG06BJ12 not between", value1, value2, "eg06bj12");
            return (Criteria) this;
        }

        public Criteria andEg06bj13IsNull() {
            addCriterion("EG06BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj13IsNotNull() {
            addCriterion("EG06BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj13EqualTo(String value) {
            addCriterion("EG06BJ13 =", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13NotEqualTo(String value) {
            addCriterion("EG06BJ13 <>", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13GreaterThan(String value) {
            addCriterion("EG06BJ13 >", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ13 >=", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13LessThan(String value) {
            addCriterion("EG06BJ13 <", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ13 <=", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13Like(String value) {
            addCriterion("EG06BJ13 like", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13NotLike(String value) {
            addCriterion("EG06BJ13 not like", value, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13In(List<String> values) {
            addCriterion("EG06BJ13 in", values, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13NotIn(List<String> values) {
            addCriterion("EG06BJ13 not in", values, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13Between(String value1, String value2) {
            addCriterion("EG06BJ13 between", value1, value2, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj13NotBetween(String value1, String value2) {
            addCriterion("EG06BJ13 not between", value1, value2, "eg06bj13");
            return (Criteria) this;
        }

        public Criteria andEg06bj14IsNull() {
            addCriterion("EG06BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj14IsNotNull() {
            addCriterion("EG06BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj14EqualTo(String value) {
            addCriterion("EG06BJ14 =", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14NotEqualTo(String value) {
            addCriterion("EG06BJ14 <>", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14GreaterThan(String value) {
            addCriterion("EG06BJ14 >", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ14 >=", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14LessThan(String value) {
            addCriterion("EG06BJ14 <", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ14 <=", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14Like(String value) {
            addCriterion("EG06BJ14 like", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14NotLike(String value) {
            addCriterion("EG06BJ14 not like", value, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14In(List<String> values) {
            addCriterion("EG06BJ14 in", values, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14NotIn(List<String> values) {
            addCriterion("EG06BJ14 not in", values, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14Between(String value1, String value2) {
            addCriterion("EG06BJ14 between", value1, value2, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj14NotBetween(String value1, String value2) {
            addCriterion("EG06BJ14 not between", value1, value2, "eg06bj14");
            return (Criteria) this;
        }

        public Criteria andEg06bj15IsNull() {
            addCriterion("EG06BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj15IsNotNull() {
            addCriterion("EG06BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj15EqualTo(String value) {
            addCriterion("EG06BJ15 =", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15NotEqualTo(String value) {
            addCriterion("EG06BJ15 <>", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15GreaterThan(String value) {
            addCriterion("EG06BJ15 >", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ15 >=", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15LessThan(String value) {
            addCriterion("EG06BJ15 <", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ15 <=", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15Like(String value) {
            addCriterion("EG06BJ15 like", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15NotLike(String value) {
            addCriterion("EG06BJ15 not like", value, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15In(List<String> values) {
            addCriterion("EG06BJ15 in", values, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15NotIn(List<String> values) {
            addCriterion("EG06BJ15 not in", values, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15Between(String value1, String value2) {
            addCriterion("EG06BJ15 between", value1, value2, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj15NotBetween(String value1, String value2) {
            addCriterion("EG06BJ15 not between", value1, value2, "eg06bj15");
            return (Criteria) this;
        }

        public Criteria andEg06bj16IsNull() {
            addCriterion("EG06BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj16IsNotNull() {
            addCriterion("EG06BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj16EqualTo(String value) {
            addCriterion("EG06BJ16 =", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16NotEqualTo(String value) {
            addCriterion("EG06BJ16 <>", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16GreaterThan(String value) {
            addCriterion("EG06BJ16 >", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ16 >=", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16LessThan(String value) {
            addCriterion("EG06BJ16 <", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ16 <=", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16Like(String value) {
            addCriterion("EG06BJ16 like", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16NotLike(String value) {
            addCriterion("EG06BJ16 not like", value, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16In(List<String> values) {
            addCriterion("EG06BJ16 in", values, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16NotIn(List<String> values) {
            addCriterion("EG06BJ16 not in", values, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16Between(String value1, String value2) {
            addCriterion("EG06BJ16 between", value1, value2, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj16NotBetween(String value1, String value2) {
            addCriterion("EG06BJ16 not between", value1, value2, "eg06bj16");
            return (Criteria) this;
        }

        public Criteria andEg06bj17IsNull() {
            addCriterion("EG06BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj17IsNotNull() {
            addCriterion("EG06BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj17EqualTo(String value) {
            addCriterion("EG06BJ17 =", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17NotEqualTo(String value) {
            addCriterion("EG06BJ17 <>", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17GreaterThan(String value) {
            addCriterion("EG06BJ17 >", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ17 >=", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17LessThan(String value) {
            addCriterion("EG06BJ17 <", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ17 <=", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17Like(String value) {
            addCriterion("EG06BJ17 like", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17NotLike(String value) {
            addCriterion("EG06BJ17 not like", value, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17In(List<String> values) {
            addCriterion("EG06BJ17 in", values, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17NotIn(List<String> values) {
            addCriterion("EG06BJ17 not in", values, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17Between(String value1, String value2) {
            addCriterion("EG06BJ17 between", value1, value2, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj17NotBetween(String value1, String value2) {
            addCriterion("EG06BJ17 not between", value1, value2, "eg06bj17");
            return (Criteria) this;
        }

        public Criteria andEg06bj18IsNull() {
            addCriterion("EG06BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj18IsNotNull() {
            addCriterion("EG06BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj18EqualTo(String value) {
            addCriterion("EG06BJ18 =", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18NotEqualTo(String value) {
            addCriterion("EG06BJ18 <>", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18GreaterThan(String value) {
            addCriterion("EG06BJ18 >", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ18 >=", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18LessThan(String value) {
            addCriterion("EG06BJ18 <", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ18 <=", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18Like(String value) {
            addCriterion("EG06BJ18 like", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18NotLike(String value) {
            addCriterion("EG06BJ18 not like", value, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18In(List<String> values) {
            addCriterion("EG06BJ18 in", values, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18NotIn(List<String> values) {
            addCriterion("EG06BJ18 not in", values, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18Between(String value1, String value2) {
            addCriterion("EG06BJ18 between", value1, value2, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj18NotBetween(String value1, String value2) {
            addCriterion("EG06BJ18 not between", value1, value2, "eg06bj18");
            return (Criteria) this;
        }

        public Criteria andEg06bj19IsNull() {
            addCriterion("EG06BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj19IsNotNull() {
            addCriterion("EG06BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj19EqualTo(String value) {
            addCriterion("EG06BJ19 =", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19NotEqualTo(String value) {
            addCriterion("EG06BJ19 <>", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19GreaterThan(String value) {
            addCriterion("EG06BJ19 >", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ19 >=", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19LessThan(String value) {
            addCriterion("EG06BJ19 <", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ19 <=", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19Like(String value) {
            addCriterion("EG06BJ19 like", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19NotLike(String value) {
            addCriterion("EG06BJ19 not like", value, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19In(List<String> values) {
            addCriterion("EG06BJ19 in", values, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19NotIn(List<String> values) {
            addCriterion("EG06BJ19 not in", values, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19Between(String value1, String value2) {
            addCriterion("EG06BJ19 between", value1, value2, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj19NotBetween(String value1, String value2) {
            addCriterion("EG06BJ19 not between", value1, value2, "eg06bj19");
            return (Criteria) this;
        }

        public Criteria andEg06bj20IsNull() {
            addCriterion("EG06BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj20IsNotNull() {
            addCriterion("EG06BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj20EqualTo(String value) {
            addCriterion("EG06BJ20 =", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20NotEqualTo(String value) {
            addCriterion("EG06BJ20 <>", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20GreaterThan(String value) {
            addCriterion("EG06BJ20 >", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ20 >=", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20LessThan(String value) {
            addCriterion("EG06BJ20 <", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ20 <=", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20Like(String value) {
            addCriterion("EG06BJ20 like", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20NotLike(String value) {
            addCriterion("EG06BJ20 not like", value, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20In(List<String> values) {
            addCriterion("EG06BJ20 in", values, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20NotIn(List<String> values) {
            addCriterion("EG06BJ20 not in", values, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20Between(String value1, String value2) {
            addCriterion("EG06BJ20 between", value1, value2, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj20NotBetween(String value1, String value2) {
            addCriterion("EG06BJ20 not between", value1, value2, "eg06bj20");
            return (Criteria) this;
        }

        public Criteria andEg06bj21IsNull() {
            addCriterion("EG06BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj21IsNotNull() {
            addCriterion("EG06BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj21EqualTo(String value) {
            addCriterion("EG06BJ21 =", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21NotEqualTo(String value) {
            addCriterion("EG06BJ21 <>", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21GreaterThan(String value) {
            addCriterion("EG06BJ21 >", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ21 >=", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21LessThan(String value) {
            addCriterion("EG06BJ21 <", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ21 <=", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21Like(String value) {
            addCriterion("EG06BJ21 like", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21NotLike(String value) {
            addCriterion("EG06BJ21 not like", value, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21In(List<String> values) {
            addCriterion("EG06BJ21 in", values, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21NotIn(List<String> values) {
            addCriterion("EG06BJ21 not in", values, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21Between(String value1, String value2) {
            addCriterion("EG06BJ21 between", value1, value2, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj21NotBetween(String value1, String value2) {
            addCriterion("EG06BJ21 not between", value1, value2, "eg06bj21");
            return (Criteria) this;
        }

        public Criteria andEg06bj22IsNull() {
            addCriterion("EG06BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj22IsNotNull() {
            addCriterion("EG06BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj22EqualTo(String value) {
            addCriterion("EG06BJ22 =", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22NotEqualTo(String value) {
            addCriterion("EG06BJ22 <>", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22GreaterThan(String value) {
            addCriterion("EG06BJ22 >", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ22 >=", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22LessThan(String value) {
            addCriterion("EG06BJ22 <", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ22 <=", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22Like(String value) {
            addCriterion("EG06BJ22 like", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22NotLike(String value) {
            addCriterion("EG06BJ22 not like", value, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22In(List<String> values) {
            addCriterion("EG06BJ22 in", values, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22NotIn(List<String> values) {
            addCriterion("EG06BJ22 not in", values, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22Between(String value1, String value2) {
            addCriterion("EG06BJ22 between", value1, value2, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj22NotBetween(String value1, String value2) {
            addCriterion("EG06BJ22 not between", value1, value2, "eg06bj22");
            return (Criteria) this;
        }

        public Criteria andEg06bj23IsNull() {
            addCriterion("EG06BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj23IsNotNull() {
            addCriterion("EG06BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj23EqualTo(String value) {
            addCriterion("EG06BJ23 =", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23NotEqualTo(String value) {
            addCriterion("EG06BJ23 <>", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23GreaterThan(String value) {
            addCriterion("EG06BJ23 >", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ23 >=", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23LessThan(String value) {
            addCriterion("EG06BJ23 <", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ23 <=", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23Like(String value) {
            addCriterion("EG06BJ23 like", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23NotLike(String value) {
            addCriterion("EG06BJ23 not like", value, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23In(List<String> values) {
            addCriterion("EG06BJ23 in", values, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23NotIn(List<String> values) {
            addCriterion("EG06BJ23 not in", values, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23Between(String value1, String value2) {
            addCriterion("EG06BJ23 between", value1, value2, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj23NotBetween(String value1, String value2) {
            addCriterion("EG06BJ23 not between", value1, value2, "eg06bj23");
            return (Criteria) this;
        }

        public Criteria andEg06bj24IsNull() {
            addCriterion("EG06BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj24IsNotNull() {
            addCriterion("EG06BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj24EqualTo(String value) {
            addCriterion("EG06BJ24 =", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24NotEqualTo(String value) {
            addCriterion("EG06BJ24 <>", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24GreaterThan(String value) {
            addCriterion("EG06BJ24 >", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ24 >=", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24LessThan(String value) {
            addCriterion("EG06BJ24 <", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ24 <=", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24Like(String value) {
            addCriterion("EG06BJ24 like", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24NotLike(String value) {
            addCriterion("EG06BJ24 not like", value, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24In(List<String> values) {
            addCriterion("EG06BJ24 in", values, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24NotIn(List<String> values) {
            addCriterion("EG06BJ24 not in", values, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24Between(String value1, String value2) {
            addCriterion("EG06BJ24 between", value1, value2, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj24NotBetween(String value1, String value2) {
            addCriterion("EG06BJ24 not between", value1, value2, "eg06bj24");
            return (Criteria) this;
        }

        public Criteria andEg06bj25IsNull() {
            addCriterion("EG06BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj25IsNotNull() {
            addCriterion("EG06BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj25EqualTo(String value) {
            addCriterion("EG06BJ25 =", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25NotEqualTo(String value) {
            addCriterion("EG06BJ25 <>", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25GreaterThan(String value) {
            addCriterion("EG06BJ25 >", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ25 >=", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25LessThan(String value) {
            addCriterion("EG06BJ25 <", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ25 <=", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25Like(String value) {
            addCriterion("EG06BJ25 like", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25NotLike(String value) {
            addCriterion("EG06BJ25 not like", value, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25In(List<String> values) {
            addCriterion("EG06BJ25 in", values, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25NotIn(List<String> values) {
            addCriterion("EG06BJ25 not in", values, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25Between(String value1, String value2) {
            addCriterion("EG06BJ25 between", value1, value2, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj25NotBetween(String value1, String value2) {
            addCriterion("EG06BJ25 not between", value1, value2, "eg06bj25");
            return (Criteria) this;
        }

        public Criteria andEg06bj26IsNull() {
            addCriterion("EG06BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj26IsNotNull() {
            addCriterion("EG06BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj26EqualTo(String value) {
            addCriterion("EG06BJ26 =", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26NotEqualTo(String value) {
            addCriterion("EG06BJ26 <>", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26GreaterThan(String value) {
            addCriterion("EG06BJ26 >", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ26 >=", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26LessThan(String value) {
            addCriterion("EG06BJ26 <", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ26 <=", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26Like(String value) {
            addCriterion("EG06BJ26 like", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26NotLike(String value) {
            addCriterion("EG06BJ26 not like", value, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26In(List<String> values) {
            addCriterion("EG06BJ26 in", values, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26NotIn(List<String> values) {
            addCriterion("EG06BJ26 not in", values, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26Between(String value1, String value2) {
            addCriterion("EG06BJ26 between", value1, value2, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj26NotBetween(String value1, String value2) {
            addCriterion("EG06BJ26 not between", value1, value2, "eg06bj26");
            return (Criteria) this;
        }

        public Criteria andEg06bj27IsNull() {
            addCriterion("EG06BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj27IsNotNull() {
            addCriterion("EG06BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj27EqualTo(String value) {
            addCriterion("EG06BJ27 =", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27NotEqualTo(String value) {
            addCriterion("EG06BJ27 <>", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27GreaterThan(String value) {
            addCriterion("EG06BJ27 >", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ27 >=", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27LessThan(String value) {
            addCriterion("EG06BJ27 <", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ27 <=", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27Like(String value) {
            addCriterion("EG06BJ27 like", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27NotLike(String value) {
            addCriterion("EG06BJ27 not like", value, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27In(List<String> values) {
            addCriterion("EG06BJ27 in", values, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27NotIn(List<String> values) {
            addCriterion("EG06BJ27 not in", values, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27Between(String value1, String value2) {
            addCriterion("EG06BJ27 between", value1, value2, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj27NotBetween(String value1, String value2) {
            addCriterion("EG06BJ27 not between", value1, value2, "eg06bj27");
            return (Criteria) this;
        }

        public Criteria andEg06bj28IsNull() {
            addCriterion("EG06BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj28IsNotNull() {
            addCriterion("EG06BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj28EqualTo(String value) {
            addCriterion("EG06BJ28 =", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28NotEqualTo(String value) {
            addCriterion("EG06BJ28 <>", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28GreaterThan(String value) {
            addCriterion("EG06BJ28 >", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ28 >=", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28LessThan(String value) {
            addCriterion("EG06BJ28 <", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ28 <=", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28Like(String value) {
            addCriterion("EG06BJ28 like", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28NotLike(String value) {
            addCriterion("EG06BJ28 not like", value, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28In(List<String> values) {
            addCriterion("EG06BJ28 in", values, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28NotIn(List<String> values) {
            addCriterion("EG06BJ28 not in", values, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28Between(String value1, String value2) {
            addCriterion("EG06BJ28 between", value1, value2, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj28NotBetween(String value1, String value2) {
            addCriterion("EG06BJ28 not between", value1, value2, "eg06bj28");
            return (Criteria) this;
        }

        public Criteria andEg06bj29IsNull() {
            addCriterion("EG06BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj29IsNotNull() {
            addCriterion("EG06BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj29EqualTo(String value) {
            addCriterion("EG06BJ29 =", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29NotEqualTo(String value) {
            addCriterion("EG06BJ29 <>", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29GreaterThan(String value) {
            addCriterion("EG06BJ29 >", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ29 >=", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29LessThan(String value) {
            addCriterion("EG06BJ29 <", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ29 <=", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29Like(String value) {
            addCriterion("EG06BJ29 like", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29NotLike(String value) {
            addCriterion("EG06BJ29 not like", value, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29In(List<String> values) {
            addCriterion("EG06BJ29 in", values, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29NotIn(List<String> values) {
            addCriterion("EG06BJ29 not in", values, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29Between(String value1, String value2) {
            addCriterion("EG06BJ29 between", value1, value2, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj29NotBetween(String value1, String value2) {
            addCriterion("EG06BJ29 not between", value1, value2, "eg06bj29");
            return (Criteria) this;
        }

        public Criteria andEg06bj30IsNull() {
            addCriterion("EG06BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj30IsNotNull() {
            addCriterion("EG06BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj30EqualTo(String value) {
            addCriterion("EG06BJ30 =", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30NotEqualTo(String value) {
            addCriterion("EG06BJ30 <>", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30GreaterThan(String value) {
            addCriterion("EG06BJ30 >", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ30 >=", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30LessThan(String value) {
            addCriterion("EG06BJ30 <", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ30 <=", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30Like(String value) {
            addCriterion("EG06BJ30 like", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30NotLike(String value) {
            addCriterion("EG06BJ30 not like", value, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30In(List<String> values) {
            addCriterion("EG06BJ30 in", values, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30NotIn(List<String> values) {
            addCriterion("EG06BJ30 not in", values, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30Between(String value1, String value2) {
            addCriterion("EG06BJ30 between", value1, value2, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj30NotBetween(String value1, String value2) {
            addCriterion("EG06BJ30 not between", value1, value2, "eg06bj30");
            return (Criteria) this;
        }

        public Criteria andEg06bj31IsNull() {
            addCriterion("EG06BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj31IsNotNull() {
            addCriterion("EG06BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj31EqualTo(String value) {
            addCriterion("EG06BJ31 =", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31NotEqualTo(String value) {
            addCriterion("EG06BJ31 <>", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31GreaterThan(String value) {
            addCriterion("EG06BJ31 >", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ31 >=", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31LessThan(String value) {
            addCriterion("EG06BJ31 <", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ31 <=", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31Like(String value) {
            addCriterion("EG06BJ31 like", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31NotLike(String value) {
            addCriterion("EG06BJ31 not like", value, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31In(List<String> values) {
            addCriterion("EG06BJ31 in", values, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31NotIn(List<String> values) {
            addCriterion("EG06BJ31 not in", values, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31Between(String value1, String value2) {
            addCriterion("EG06BJ31 between", value1, value2, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj31NotBetween(String value1, String value2) {
            addCriterion("EG06BJ31 not between", value1, value2, "eg06bj31");
            return (Criteria) this;
        }

        public Criteria andEg06bj32IsNull() {
            addCriterion("EG06BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj32IsNotNull() {
            addCriterion("EG06BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj32EqualTo(String value) {
            addCriterion("EG06BJ32 =", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32NotEqualTo(String value) {
            addCriterion("EG06BJ32 <>", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32GreaterThan(String value) {
            addCriterion("EG06BJ32 >", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ32 >=", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32LessThan(String value) {
            addCriterion("EG06BJ32 <", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ32 <=", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32Like(String value) {
            addCriterion("EG06BJ32 like", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32NotLike(String value) {
            addCriterion("EG06BJ32 not like", value, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32In(List<String> values) {
            addCriterion("EG06BJ32 in", values, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32NotIn(List<String> values) {
            addCriterion("EG06BJ32 not in", values, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32Between(String value1, String value2) {
            addCriterion("EG06BJ32 between", value1, value2, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj32NotBetween(String value1, String value2) {
            addCriterion("EG06BJ32 not between", value1, value2, "eg06bj32");
            return (Criteria) this;
        }

        public Criteria andEg06bj33IsNull() {
            addCriterion("EG06BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj33IsNotNull() {
            addCriterion("EG06BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj33EqualTo(String value) {
            addCriterion("EG06BJ33 =", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33NotEqualTo(String value) {
            addCriterion("EG06BJ33 <>", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33GreaterThan(String value) {
            addCriterion("EG06BJ33 >", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ33 >=", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33LessThan(String value) {
            addCriterion("EG06BJ33 <", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ33 <=", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33Like(String value) {
            addCriterion("EG06BJ33 like", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33NotLike(String value) {
            addCriterion("EG06BJ33 not like", value, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33In(List<String> values) {
            addCriterion("EG06BJ33 in", values, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33NotIn(List<String> values) {
            addCriterion("EG06BJ33 not in", values, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33Between(String value1, String value2) {
            addCriterion("EG06BJ33 between", value1, value2, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj33NotBetween(String value1, String value2) {
            addCriterion("EG06BJ33 not between", value1, value2, "eg06bj33");
            return (Criteria) this;
        }

        public Criteria andEg06bj34IsNull() {
            addCriterion("EG06BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj34IsNotNull() {
            addCriterion("EG06BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj34EqualTo(String value) {
            addCriterion("EG06BJ34 =", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34NotEqualTo(String value) {
            addCriterion("EG06BJ34 <>", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34GreaterThan(String value) {
            addCriterion("EG06BJ34 >", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ34 >=", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34LessThan(String value) {
            addCriterion("EG06BJ34 <", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ34 <=", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34Like(String value) {
            addCriterion("EG06BJ34 like", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34NotLike(String value) {
            addCriterion("EG06BJ34 not like", value, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34In(List<String> values) {
            addCriterion("EG06BJ34 in", values, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34NotIn(List<String> values) {
            addCriterion("EG06BJ34 not in", values, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34Between(String value1, String value2) {
            addCriterion("EG06BJ34 between", value1, value2, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj34NotBetween(String value1, String value2) {
            addCriterion("EG06BJ34 not between", value1, value2, "eg06bj34");
            return (Criteria) this;
        }

        public Criteria andEg06bj35IsNull() {
            addCriterion("EG06BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj35IsNotNull() {
            addCriterion("EG06BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj35EqualTo(String value) {
            addCriterion("EG06BJ35 =", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35NotEqualTo(String value) {
            addCriterion("EG06BJ35 <>", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35GreaterThan(String value) {
            addCriterion("EG06BJ35 >", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ35 >=", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35LessThan(String value) {
            addCriterion("EG06BJ35 <", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ35 <=", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35Like(String value) {
            addCriterion("EG06BJ35 like", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35NotLike(String value) {
            addCriterion("EG06BJ35 not like", value, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35In(List<String> values) {
            addCriterion("EG06BJ35 in", values, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35NotIn(List<String> values) {
            addCriterion("EG06BJ35 not in", values, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35Between(String value1, String value2) {
            addCriterion("EG06BJ35 between", value1, value2, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj35NotBetween(String value1, String value2) {
            addCriterion("EG06BJ35 not between", value1, value2, "eg06bj35");
            return (Criteria) this;
        }

        public Criteria andEg06bj36IsNull() {
            addCriterion("EG06BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj36IsNotNull() {
            addCriterion("EG06BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj36EqualTo(String value) {
            addCriterion("EG06BJ36 =", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36NotEqualTo(String value) {
            addCriterion("EG06BJ36 <>", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36GreaterThan(String value) {
            addCriterion("EG06BJ36 >", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ36 >=", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36LessThan(String value) {
            addCriterion("EG06BJ36 <", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ36 <=", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36Like(String value) {
            addCriterion("EG06BJ36 like", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36NotLike(String value) {
            addCriterion("EG06BJ36 not like", value, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36In(List<String> values) {
            addCriterion("EG06BJ36 in", values, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36NotIn(List<String> values) {
            addCriterion("EG06BJ36 not in", values, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36Between(String value1, String value2) {
            addCriterion("EG06BJ36 between", value1, value2, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj36NotBetween(String value1, String value2) {
            addCriterion("EG06BJ36 not between", value1, value2, "eg06bj36");
            return (Criteria) this;
        }

        public Criteria andEg06bj37IsNull() {
            addCriterion("EG06BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj37IsNotNull() {
            addCriterion("EG06BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj37EqualTo(String value) {
            addCriterion("EG06BJ37 =", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37NotEqualTo(String value) {
            addCriterion("EG06BJ37 <>", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37GreaterThan(String value) {
            addCriterion("EG06BJ37 >", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ37 >=", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37LessThan(String value) {
            addCriterion("EG06BJ37 <", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ37 <=", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37Like(String value) {
            addCriterion("EG06BJ37 like", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37NotLike(String value) {
            addCriterion("EG06BJ37 not like", value, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37In(List<String> values) {
            addCriterion("EG06BJ37 in", values, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37NotIn(List<String> values) {
            addCriterion("EG06BJ37 not in", values, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37Between(String value1, String value2) {
            addCriterion("EG06BJ37 between", value1, value2, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj37NotBetween(String value1, String value2) {
            addCriterion("EG06BJ37 not between", value1, value2, "eg06bj37");
            return (Criteria) this;
        }

        public Criteria andEg06bj38IsNull() {
            addCriterion("EG06BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj38IsNotNull() {
            addCriterion("EG06BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj38EqualTo(String value) {
            addCriterion("EG06BJ38 =", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38NotEqualTo(String value) {
            addCriterion("EG06BJ38 <>", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38GreaterThan(String value) {
            addCriterion("EG06BJ38 >", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ38 >=", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38LessThan(String value) {
            addCriterion("EG06BJ38 <", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ38 <=", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38Like(String value) {
            addCriterion("EG06BJ38 like", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38NotLike(String value) {
            addCriterion("EG06BJ38 not like", value, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38In(List<String> values) {
            addCriterion("EG06BJ38 in", values, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38NotIn(List<String> values) {
            addCriterion("EG06BJ38 not in", values, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38Between(String value1, String value2) {
            addCriterion("EG06BJ38 between", value1, value2, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj38NotBetween(String value1, String value2) {
            addCriterion("EG06BJ38 not between", value1, value2, "eg06bj38");
            return (Criteria) this;
        }

        public Criteria andEg06bj39IsNull() {
            addCriterion("EG06BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj39IsNotNull() {
            addCriterion("EG06BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj39EqualTo(String value) {
            addCriterion("EG06BJ39 =", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39NotEqualTo(String value) {
            addCriterion("EG06BJ39 <>", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39GreaterThan(String value) {
            addCriterion("EG06BJ39 >", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ39 >=", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39LessThan(String value) {
            addCriterion("EG06BJ39 <", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ39 <=", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39Like(String value) {
            addCriterion("EG06BJ39 like", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39NotLike(String value) {
            addCriterion("EG06BJ39 not like", value, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39In(List<String> values) {
            addCriterion("EG06BJ39 in", values, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39NotIn(List<String> values) {
            addCriterion("EG06BJ39 not in", values, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39Between(String value1, String value2) {
            addCriterion("EG06BJ39 between", value1, value2, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj39NotBetween(String value1, String value2) {
            addCriterion("EG06BJ39 not between", value1, value2, "eg06bj39");
            return (Criteria) this;
        }

        public Criteria andEg06bj40IsNull() {
            addCriterion("EG06BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj40IsNotNull() {
            addCriterion("EG06BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj40EqualTo(String value) {
            addCriterion("EG06BJ40 =", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40NotEqualTo(String value) {
            addCriterion("EG06BJ40 <>", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40GreaterThan(String value) {
            addCriterion("EG06BJ40 >", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ40 >=", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40LessThan(String value) {
            addCriterion("EG06BJ40 <", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ40 <=", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40Like(String value) {
            addCriterion("EG06BJ40 like", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40NotLike(String value) {
            addCriterion("EG06BJ40 not like", value, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40In(List<String> values) {
            addCriterion("EG06BJ40 in", values, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40NotIn(List<String> values) {
            addCriterion("EG06BJ40 not in", values, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40Between(String value1, String value2) {
            addCriterion("EG06BJ40 between", value1, value2, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj40NotBetween(String value1, String value2) {
            addCriterion("EG06BJ40 not between", value1, value2, "eg06bj40");
            return (Criteria) this;
        }

        public Criteria andEg06bj41IsNull() {
            addCriterion("EG06BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj41IsNotNull() {
            addCriterion("EG06BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj41EqualTo(String value) {
            addCriterion("EG06BJ41 =", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41NotEqualTo(String value) {
            addCriterion("EG06BJ41 <>", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41GreaterThan(String value) {
            addCriterion("EG06BJ41 >", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ41 >=", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41LessThan(String value) {
            addCriterion("EG06BJ41 <", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ41 <=", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41Like(String value) {
            addCriterion("EG06BJ41 like", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41NotLike(String value) {
            addCriterion("EG06BJ41 not like", value, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41In(List<String> values) {
            addCriterion("EG06BJ41 in", values, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41NotIn(List<String> values) {
            addCriterion("EG06BJ41 not in", values, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41Between(String value1, String value2) {
            addCriterion("EG06BJ41 between", value1, value2, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj41NotBetween(String value1, String value2) {
            addCriterion("EG06BJ41 not between", value1, value2, "eg06bj41");
            return (Criteria) this;
        }

        public Criteria andEg06bj42IsNull() {
            addCriterion("EG06BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj42IsNotNull() {
            addCriterion("EG06BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj42EqualTo(String value) {
            addCriterion("EG06BJ42 =", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42NotEqualTo(String value) {
            addCriterion("EG06BJ42 <>", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42GreaterThan(String value) {
            addCriterion("EG06BJ42 >", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ42 >=", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42LessThan(String value) {
            addCriterion("EG06BJ42 <", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ42 <=", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42Like(String value) {
            addCriterion("EG06BJ42 like", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42NotLike(String value) {
            addCriterion("EG06BJ42 not like", value, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42In(List<String> values) {
            addCriterion("EG06BJ42 in", values, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42NotIn(List<String> values) {
            addCriterion("EG06BJ42 not in", values, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42Between(String value1, String value2) {
            addCriterion("EG06BJ42 between", value1, value2, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj42NotBetween(String value1, String value2) {
            addCriterion("EG06BJ42 not between", value1, value2, "eg06bj42");
            return (Criteria) this;
        }

        public Criteria andEg06bj43IsNull() {
            addCriterion("EG06BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj43IsNotNull() {
            addCriterion("EG06BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj43EqualTo(String value) {
            addCriterion("EG06BJ43 =", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43NotEqualTo(String value) {
            addCriterion("EG06BJ43 <>", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43GreaterThan(String value) {
            addCriterion("EG06BJ43 >", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ43 >=", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43LessThan(String value) {
            addCriterion("EG06BJ43 <", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ43 <=", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43Like(String value) {
            addCriterion("EG06BJ43 like", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43NotLike(String value) {
            addCriterion("EG06BJ43 not like", value, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43In(List<String> values) {
            addCriterion("EG06BJ43 in", values, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43NotIn(List<String> values) {
            addCriterion("EG06BJ43 not in", values, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43Between(String value1, String value2) {
            addCriterion("EG06BJ43 between", value1, value2, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj43NotBetween(String value1, String value2) {
            addCriterion("EG06BJ43 not between", value1, value2, "eg06bj43");
            return (Criteria) this;
        }

        public Criteria andEg06bj44IsNull() {
            addCriterion("EG06BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj44IsNotNull() {
            addCriterion("EG06BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj44EqualTo(String value) {
            addCriterion("EG06BJ44 =", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44NotEqualTo(String value) {
            addCriterion("EG06BJ44 <>", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44GreaterThan(String value) {
            addCriterion("EG06BJ44 >", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ44 >=", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44LessThan(String value) {
            addCriterion("EG06BJ44 <", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ44 <=", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44Like(String value) {
            addCriterion("EG06BJ44 like", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44NotLike(String value) {
            addCriterion("EG06BJ44 not like", value, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44In(List<String> values) {
            addCriterion("EG06BJ44 in", values, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44NotIn(List<String> values) {
            addCriterion("EG06BJ44 not in", values, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44Between(String value1, String value2) {
            addCriterion("EG06BJ44 between", value1, value2, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj44NotBetween(String value1, String value2) {
            addCriterion("EG06BJ44 not between", value1, value2, "eg06bj44");
            return (Criteria) this;
        }

        public Criteria andEg06bj45IsNull() {
            addCriterion("EG06BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj45IsNotNull() {
            addCriterion("EG06BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj45EqualTo(String value) {
            addCriterion("EG06BJ45 =", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45NotEqualTo(String value) {
            addCriterion("EG06BJ45 <>", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45GreaterThan(String value) {
            addCriterion("EG06BJ45 >", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ45 >=", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45LessThan(String value) {
            addCriterion("EG06BJ45 <", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ45 <=", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45Like(String value) {
            addCriterion("EG06BJ45 like", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45NotLike(String value) {
            addCriterion("EG06BJ45 not like", value, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45In(List<String> values) {
            addCriterion("EG06BJ45 in", values, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45NotIn(List<String> values) {
            addCriterion("EG06BJ45 not in", values, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45Between(String value1, String value2) {
            addCriterion("EG06BJ45 between", value1, value2, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj45NotBetween(String value1, String value2) {
            addCriterion("EG06BJ45 not between", value1, value2, "eg06bj45");
            return (Criteria) this;
        }

        public Criteria andEg06bj46IsNull() {
            addCriterion("EG06BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj46IsNotNull() {
            addCriterion("EG06BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj46EqualTo(String value) {
            addCriterion("EG06BJ46 =", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46NotEqualTo(String value) {
            addCriterion("EG06BJ46 <>", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46GreaterThan(String value) {
            addCriterion("EG06BJ46 >", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ46 >=", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46LessThan(String value) {
            addCriterion("EG06BJ46 <", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ46 <=", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46Like(String value) {
            addCriterion("EG06BJ46 like", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46NotLike(String value) {
            addCriterion("EG06BJ46 not like", value, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46In(List<String> values) {
            addCriterion("EG06BJ46 in", values, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46NotIn(List<String> values) {
            addCriterion("EG06BJ46 not in", values, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46Between(String value1, String value2) {
            addCriterion("EG06BJ46 between", value1, value2, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj46NotBetween(String value1, String value2) {
            addCriterion("EG06BJ46 not between", value1, value2, "eg06bj46");
            return (Criteria) this;
        }

        public Criteria andEg06bj47IsNull() {
            addCriterion("EG06BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj47IsNotNull() {
            addCriterion("EG06BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj47EqualTo(String value) {
            addCriterion("EG06BJ47 =", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47NotEqualTo(String value) {
            addCriterion("EG06BJ47 <>", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47GreaterThan(String value) {
            addCriterion("EG06BJ47 >", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ47 >=", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47LessThan(String value) {
            addCriterion("EG06BJ47 <", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ47 <=", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47Like(String value) {
            addCriterion("EG06BJ47 like", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47NotLike(String value) {
            addCriterion("EG06BJ47 not like", value, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47In(List<String> values) {
            addCriterion("EG06BJ47 in", values, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47NotIn(List<String> values) {
            addCriterion("EG06BJ47 not in", values, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47Between(String value1, String value2) {
            addCriterion("EG06BJ47 between", value1, value2, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj47NotBetween(String value1, String value2) {
            addCriterion("EG06BJ47 not between", value1, value2, "eg06bj47");
            return (Criteria) this;
        }

        public Criteria andEg06bj48IsNull() {
            addCriterion("EG06BJ48 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj48IsNotNull() {
            addCriterion("EG06BJ48 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj48EqualTo(String value) {
            addCriterion("EG06BJ48 =", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48NotEqualTo(String value) {
            addCriterion("EG06BJ48 <>", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48GreaterThan(String value) {
            addCriterion("EG06BJ48 >", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ48 >=", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48LessThan(String value) {
            addCriterion("EG06BJ48 <", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ48 <=", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48Like(String value) {
            addCriterion("EG06BJ48 like", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48NotLike(String value) {
            addCriterion("EG06BJ48 not like", value, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48In(List<String> values) {
            addCriterion("EG06BJ48 in", values, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48NotIn(List<String> values) {
            addCriterion("EG06BJ48 not in", values, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48Between(String value1, String value2) {
            addCriterion("EG06BJ48 between", value1, value2, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj48NotBetween(String value1, String value2) {
            addCriterion("EG06BJ48 not between", value1, value2, "eg06bj48");
            return (Criteria) this;
        }

        public Criteria andEg06bj49IsNull() {
            addCriterion("EG06BJ49 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj49IsNotNull() {
            addCriterion("EG06BJ49 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj49EqualTo(String value) {
            addCriterion("EG06BJ49 =", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49NotEqualTo(String value) {
            addCriterion("EG06BJ49 <>", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49GreaterThan(String value) {
            addCriterion("EG06BJ49 >", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ49 >=", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49LessThan(String value) {
            addCriterion("EG06BJ49 <", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ49 <=", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49Like(String value) {
            addCriterion("EG06BJ49 like", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49NotLike(String value) {
            addCriterion("EG06BJ49 not like", value, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49In(List<String> values) {
            addCriterion("EG06BJ49 in", values, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49NotIn(List<String> values) {
            addCriterion("EG06BJ49 not in", values, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49Between(String value1, String value2) {
            addCriterion("EG06BJ49 between", value1, value2, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj49NotBetween(String value1, String value2) {
            addCriterion("EG06BJ49 not between", value1, value2, "eg06bj49");
            return (Criteria) this;
        }

        public Criteria andEg06bj50IsNull() {
            addCriterion("EG06BJ50 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj50IsNotNull() {
            addCriterion("EG06BJ50 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj50EqualTo(String value) {
            addCriterion("EG06BJ50 =", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50NotEqualTo(String value) {
            addCriterion("EG06BJ50 <>", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50GreaterThan(String value) {
            addCriterion("EG06BJ50 >", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ50 >=", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50LessThan(String value) {
            addCriterion("EG06BJ50 <", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ50 <=", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50Like(String value) {
            addCriterion("EG06BJ50 like", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50NotLike(String value) {
            addCriterion("EG06BJ50 not like", value, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50In(List<String> values) {
            addCriterion("EG06BJ50 in", values, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50NotIn(List<String> values) {
            addCriterion("EG06BJ50 not in", values, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50Between(String value1, String value2) {
            addCriterion("EG06BJ50 between", value1, value2, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj50NotBetween(String value1, String value2) {
            addCriterion("EG06BJ50 not between", value1, value2, "eg06bj50");
            return (Criteria) this;
        }

        public Criteria andEg06bj51IsNull() {
            addCriterion("EG06BJ51 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj51IsNotNull() {
            addCriterion("EG06BJ51 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj51EqualTo(String value) {
            addCriterion("EG06BJ51 =", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51NotEqualTo(String value) {
            addCriterion("EG06BJ51 <>", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51GreaterThan(String value) {
            addCriterion("EG06BJ51 >", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ51 >=", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51LessThan(String value) {
            addCriterion("EG06BJ51 <", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ51 <=", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51Like(String value) {
            addCriterion("EG06BJ51 like", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51NotLike(String value) {
            addCriterion("EG06BJ51 not like", value, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51In(List<String> values) {
            addCriterion("EG06BJ51 in", values, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51NotIn(List<String> values) {
            addCriterion("EG06BJ51 not in", values, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51Between(String value1, String value2) {
            addCriterion("EG06BJ51 between", value1, value2, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj51NotBetween(String value1, String value2) {
            addCriterion("EG06BJ51 not between", value1, value2, "eg06bj51");
            return (Criteria) this;
        }

        public Criteria andEg06bj52IsNull() {
            addCriterion("EG06BJ52 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj52IsNotNull() {
            addCriterion("EG06BJ52 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj52EqualTo(String value) {
            addCriterion("EG06BJ52 =", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52NotEqualTo(String value) {
            addCriterion("EG06BJ52 <>", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52GreaterThan(String value) {
            addCriterion("EG06BJ52 >", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ52 >=", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52LessThan(String value) {
            addCriterion("EG06BJ52 <", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ52 <=", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52Like(String value) {
            addCriterion("EG06BJ52 like", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52NotLike(String value) {
            addCriterion("EG06BJ52 not like", value, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52In(List<String> values) {
            addCriterion("EG06BJ52 in", values, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52NotIn(List<String> values) {
            addCriterion("EG06BJ52 not in", values, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52Between(String value1, String value2) {
            addCriterion("EG06BJ52 between", value1, value2, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj52NotBetween(String value1, String value2) {
            addCriterion("EG06BJ52 not between", value1, value2, "eg06bj52");
            return (Criteria) this;
        }

        public Criteria andEg06bj53IsNull() {
            addCriterion("EG06BJ53 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj53IsNotNull() {
            addCriterion("EG06BJ53 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj53EqualTo(String value) {
            addCriterion("EG06BJ53 =", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53NotEqualTo(String value) {
            addCriterion("EG06BJ53 <>", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53GreaterThan(String value) {
            addCriterion("EG06BJ53 >", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ53 >=", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53LessThan(String value) {
            addCriterion("EG06BJ53 <", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ53 <=", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53Like(String value) {
            addCriterion("EG06BJ53 like", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53NotLike(String value) {
            addCriterion("EG06BJ53 not like", value, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53In(List<String> values) {
            addCriterion("EG06BJ53 in", values, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53NotIn(List<String> values) {
            addCriterion("EG06BJ53 not in", values, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53Between(String value1, String value2) {
            addCriterion("EG06BJ53 between", value1, value2, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj53NotBetween(String value1, String value2) {
            addCriterion("EG06BJ53 not between", value1, value2, "eg06bj53");
            return (Criteria) this;
        }

        public Criteria andEg06bj54IsNull() {
            addCriterion("EG06BJ54 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj54IsNotNull() {
            addCriterion("EG06BJ54 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj54EqualTo(String value) {
            addCriterion("EG06BJ54 =", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54NotEqualTo(String value) {
            addCriterion("EG06BJ54 <>", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54GreaterThan(String value) {
            addCriterion("EG06BJ54 >", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ54 >=", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54LessThan(String value) {
            addCriterion("EG06BJ54 <", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ54 <=", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54Like(String value) {
            addCriterion("EG06BJ54 like", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54NotLike(String value) {
            addCriterion("EG06BJ54 not like", value, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54In(List<String> values) {
            addCriterion("EG06BJ54 in", values, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54NotIn(List<String> values) {
            addCriterion("EG06BJ54 not in", values, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54Between(String value1, String value2) {
            addCriterion("EG06BJ54 between", value1, value2, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj54NotBetween(String value1, String value2) {
            addCriterion("EG06BJ54 not between", value1, value2, "eg06bj54");
            return (Criteria) this;
        }

        public Criteria andEg06bj55IsNull() {
            addCriterion("EG06BJ55 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj55IsNotNull() {
            addCriterion("EG06BJ55 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj55EqualTo(String value) {
            addCriterion("EG06BJ55 =", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55NotEqualTo(String value) {
            addCriterion("EG06BJ55 <>", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55GreaterThan(String value) {
            addCriterion("EG06BJ55 >", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ55 >=", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55LessThan(String value) {
            addCriterion("EG06BJ55 <", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ55 <=", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55Like(String value) {
            addCriterion("EG06BJ55 like", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55NotLike(String value) {
            addCriterion("EG06BJ55 not like", value, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55In(List<String> values) {
            addCriterion("EG06BJ55 in", values, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55NotIn(List<String> values) {
            addCriterion("EG06BJ55 not in", values, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55Between(String value1, String value2) {
            addCriterion("EG06BJ55 between", value1, value2, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj55NotBetween(String value1, String value2) {
            addCriterion("EG06BJ55 not between", value1, value2, "eg06bj55");
            return (Criteria) this;
        }

        public Criteria andEg06bj56IsNull() {
            addCriterion("EG06BJ56 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj56IsNotNull() {
            addCriterion("EG06BJ56 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj56EqualTo(String value) {
            addCriterion("EG06BJ56 =", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56NotEqualTo(String value) {
            addCriterion("EG06BJ56 <>", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56GreaterThan(String value) {
            addCriterion("EG06BJ56 >", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ56 >=", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56LessThan(String value) {
            addCriterion("EG06BJ56 <", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ56 <=", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56Like(String value) {
            addCriterion("EG06BJ56 like", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56NotLike(String value) {
            addCriterion("EG06BJ56 not like", value, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56In(List<String> values) {
            addCriterion("EG06BJ56 in", values, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56NotIn(List<String> values) {
            addCriterion("EG06BJ56 not in", values, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56Between(String value1, String value2) {
            addCriterion("EG06BJ56 between", value1, value2, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj56NotBetween(String value1, String value2) {
            addCriterion("EG06BJ56 not between", value1, value2, "eg06bj56");
            return (Criteria) this;
        }

        public Criteria andEg06bj57IsNull() {
            addCriterion("EG06BJ57 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj57IsNotNull() {
            addCriterion("EG06BJ57 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj57EqualTo(String value) {
            addCriterion("EG06BJ57 =", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57NotEqualTo(String value) {
            addCriterion("EG06BJ57 <>", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57GreaterThan(String value) {
            addCriterion("EG06BJ57 >", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ57 >=", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57LessThan(String value) {
            addCriterion("EG06BJ57 <", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ57 <=", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57Like(String value) {
            addCriterion("EG06BJ57 like", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57NotLike(String value) {
            addCriterion("EG06BJ57 not like", value, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57In(List<String> values) {
            addCriterion("EG06BJ57 in", values, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57NotIn(List<String> values) {
            addCriterion("EG06BJ57 not in", values, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57Between(String value1, String value2) {
            addCriterion("EG06BJ57 between", value1, value2, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj57NotBetween(String value1, String value2) {
            addCriterion("EG06BJ57 not between", value1, value2, "eg06bj57");
            return (Criteria) this;
        }

        public Criteria andEg06bj58IsNull() {
            addCriterion("EG06BJ58 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj58IsNotNull() {
            addCriterion("EG06BJ58 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj58EqualTo(String value) {
            addCriterion("EG06BJ58 =", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58NotEqualTo(String value) {
            addCriterion("EG06BJ58 <>", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58GreaterThan(String value) {
            addCriterion("EG06BJ58 >", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ58 >=", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58LessThan(String value) {
            addCriterion("EG06BJ58 <", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ58 <=", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58Like(String value) {
            addCriterion("EG06BJ58 like", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58NotLike(String value) {
            addCriterion("EG06BJ58 not like", value, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58In(List<String> values) {
            addCriterion("EG06BJ58 in", values, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58NotIn(List<String> values) {
            addCriterion("EG06BJ58 not in", values, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58Between(String value1, String value2) {
            addCriterion("EG06BJ58 between", value1, value2, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj58NotBetween(String value1, String value2) {
            addCriterion("EG06BJ58 not between", value1, value2, "eg06bj58");
            return (Criteria) this;
        }

        public Criteria andEg06bj59IsNull() {
            addCriterion("EG06BJ59 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj59IsNotNull() {
            addCriterion("EG06BJ59 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj59EqualTo(String value) {
            addCriterion("EG06BJ59 =", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59NotEqualTo(String value) {
            addCriterion("EG06BJ59 <>", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59GreaterThan(String value) {
            addCriterion("EG06BJ59 >", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ59 >=", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59LessThan(String value) {
            addCriterion("EG06BJ59 <", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ59 <=", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59Like(String value) {
            addCriterion("EG06BJ59 like", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59NotLike(String value) {
            addCriterion("EG06BJ59 not like", value, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59In(List<String> values) {
            addCriterion("EG06BJ59 in", values, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59NotIn(List<String> values) {
            addCriterion("EG06BJ59 not in", values, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59Between(String value1, String value2) {
            addCriterion("EG06BJ59 between", value1, value2, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj59NotBetween(String value1, String value2) {
            addCriterion("EG06BJ59 not between", value1, value2, "eg06bj59");
            return (Criteria) this;
        }

        public Criteria andEg06bj60IsNull() {
            addCriterion("EG06BJ60 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj60IsNotNull() {
            addCriterion("EG06BJ60 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj60EqualTo(String value) {
            addCriterion("EG06BJ60 =", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60NotEqualTo(String value) {
            addCriterion("EG06BJ60 <>", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60GreaterThan(String value) {
            addCriterion("EG06BJ60 >", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ60 >=", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60LessThan(String value) {
            addCriterion("EG06BJ60 <", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ60 <=", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60Like(String value) {
            addCriterion("EG06BJ60 like", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60NotLike(String value) {
            addCriterion("EG06BJ60 not like", value, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60In(List<String> values) {
            addCriterion("EG06BJ60 in", values, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60NotIn(List<String> values) {
            addCriterion("EG06BJ60 not in", values, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60Between(String value1, String value2) {
            addCriterion("EG06BJ60 between", value1, value2, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj60NotBetween(String value1, String value2) {
            addCriterion("EG06BJ60 not between", value1, value2, "eg06bj60");
            return (Criteria) this;
        }

        public Criteria andEg06bj61IsNull() {
            addCriterion("EG06BJ61 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj61IsNotNull() {
            addCriterion("EG06BJ61 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj61EqualTo(String value) {
            addCriterion("EG06BJ61 =", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61NotEqualTo(String value) {
            addCriterion("EG06BJ61 <>", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61GreaterThan(String value) {
            addCriterion("EG06BJ61 >", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ61 >=", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61LessThan(String value) {
            addCriterion("EG06BJ61 <", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ61 <=", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61Like(String value) {
            addCriterion("EG06BJ61 like", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61NotLike(String value) {
            addCriterion("EG06BJ61 not like", value, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61In(List<String> values) {
            addCriterion("EG06BJ61 in", values, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61NotIn(List<String> values) {
            addCriterion("EG06BJ61 not in", values, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61Between(String value1, String value2) {
            addCriterion("EG06BJ61 between", value1, value2, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj61NotBetween(String value1, String value2) {
            addCriterion("EG06BJ61 not between", value1, value2, "eg06bj61");
            return (Criteria) this;
        }

        public Criteria andEg06bj62IsNull() {
            addCriterion("EG06BJ62 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj62IsNotNull() {
            addCriterion("EG06BJ62 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj62EqualTo(String value) {
            addCriterion("EG06BJ62 =", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62NotEqualTo(String value) {
            addCriterion("EG06BJ62 <>", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62GreaterThan(String value) {
            addCriterion("EG06BJ62 >", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ62 >=", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62LessThan(String value) {
            addCriterion("EG06BJ62 <", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ62 <=", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62Like(String value) {
            addCriterion("EG06BJ62 like", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62NotLike(String value) {
            addCriterion("EG06BJ62 not like", value, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62In(List<String> values) {
            addCriterion("EG06BJ62 in", values, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62NotIn(List<String> values) {
            addCriterion("EG06BJ62 not in", values, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62Between(String value1, String value2) {
            addCriterion("EG06BJ62 between", value1, value2, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj62NotBetween(String value1, String value2) {
            addCriterion("EG06BJ62 not between", value1, value2, "eg06bj62");
            return (Criteria) this;
        }

        public Criteria andEg06bj63IsNull() {
            addCriterion("EG06BJ63 is null");
            return (Criteria) this;
        }

        public Criteria andEg06bj63IsNotNull() {
            addCriterion("EG06BJ63 is not null");
            return (Criteria) this;
        }

        public Criteria andEg06bj63EqualTo(String value) {
            addCriterion("EG06BJ63 =", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63NotEqualTo(String value) {
            addCriterion("EG06BJ63 <>", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63GreaterThan(String value) {
            addCriterion("EG06BJ63 >", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63GreaterThanOrEqualTo(String value) {
            addCriterion("EG06BJ63 >=", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63LessThan(String value) {
            addCriterion("EG06BJ63 <", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63LessThanOrEqualTo(String value) {
            addCriterion("EG06BJ63 <=", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63Like(String value) {
            addCriterion("EG06BJ63 like", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63NotLike(String value) {
            addCriterion("EG06BJ63 not like", value, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63In(List<String> values) {
            addCriterion("EG06BJ63 in", values, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63NotIn(List<String> values) {
            addCriterion("EG06BJ63 not in", values, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63Between(String value1, String value2) {
            addCriterion("EG06BJ63 between", value1, value2, "eg06bj63");
            return (Criteria) this;
        }

        public Criteria andEg06bj63NotBetween(String value1, String value2) {
            addCriterion("EG06BJ63 not between", value1, value2, "eg06bj63");
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