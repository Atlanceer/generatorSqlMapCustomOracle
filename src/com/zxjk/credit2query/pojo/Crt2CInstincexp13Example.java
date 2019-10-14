package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CInstincexp13Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CInstincexp13Example() {
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

        public Criteria andEg10bj01IsNull() {
            addCriterion("EG10BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj01IsNotNull() {
            addCriterion("EG10BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj01EqualTo(String value) {
            addCriterion("EG10BJ01 =", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01NotEqualTo(String value) {
            addCriterion("EG10BJ01 <>", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01GreaterThan(String value) {
            addCriterion("EG10BJ01 >", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ01 >=", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01LessThan(String value) {
            addCriterion("EG10BJ01 <", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ01 <=", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01Like(String value) {
            addCriterion("EG10BJ01 like", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01NotLike(String value) {
            addCriterion("EG10BJ01 not like", value, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01In(List<String> values) {
            addCriterion("EG10BJ01 in", values, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01NotIn(List<String> values) {
            addCriterion("EG10BJ01 not in", values, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01Between(String value1, String value2) {
            addCriterion("EG10BJ01 between", value1, value2, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj01NotBetween(String value1, String value2) {
            addCriterion("EG10BJ01 not between", value1, value2, "eg10bj01");
            return (Criteria) this;
        }

        public Criteria andEg10bj02IsNull() {
            addCriterion("EG10BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj02IsNotNull() {
            addCriterion("EG10BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj02EqualTo(String value) {
            addCriterion("EG10BJ02 =", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02NotEqualTo(String value) {
            addCriterion("EG10BJ02 <>", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02GreaterThan(String value) {
            addCriterion("EG10BJ02 >", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ02 >=", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02LessThan(String value) {
            addCriterion("EG10BJ02 <", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ02 <=", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02Like(String value) {
            addCriterion("EG10BJ02 like", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02NotLike(String value) {
            addCriterion("EG10BJ02 not like", value, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02In(List<String> values) {
            addCriterion("EG10BJ02 in", values, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02NotIn(List<String> values) {
            addCriterion("EG10BJ02 not in", values, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02Between(String value1, String value2) {
            addCriterion("EG10BJ02 between", value1, value2, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj02NotBetween(String value1, String value2) {
            addCriterion("EG10BJ02 not between", value1, value2, "eg10bj02");
            return (Criteria) this;
        }

        public Criteria andEg10bj03IsNull() {
            addCriterion("EG10BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj03IsNotNull() {
            addCriterion("EG10BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj03EqualTo(String value) {
            addCriterion("EG10BJ03 =", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03NotEqualTo(String value) {
            addCriterion("EG10BJ03 <>", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03GreaterThan(String value) {
            addCriterion("EG10BJ03 >", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ03 >=", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03LessThan(String value) {
            addCriterion("EG10BJ03 <", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ03 <=", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03Like(String value) {
            addCriterion("EG10BJ03 like", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03NotLike(String value) {
            addCriterion("EG10BJ03 not like", value, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03In(List<String> values) {
            addCriterion("EG10BJ03 in", values, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03NotIn(List<String> values) {
            addCriterion("EG10BJ03 not in", values, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03Between(String value1, String value2) {
            addCriterion("EG10BJ03 between", value1, value2, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj03NotBetween(String value1, String value2) {
            addCriterion("EG10BJ03 not between", value1, value2, "eg10bj03");
            return (Criteria) this;
        }

        public Criteria andEg10bj04IsNull() {
            addCriterion("EG10BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj04IsNotNull() {
            addCriterion("EG10BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj04EqualTo(String value) {
            addCriterion("EG10BJ04 =", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04NotEqualTo(String value) {
            addCriterion("EG10BJ04 <>", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04GreaterThan(String value) {
            addCriterion("EG10BJ04 >", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ04 >=", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04LessThan(String value) {
            addCriterion("EG10BJ04 <", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ04 <=", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04Like(String value) {
            addCriterion("EG10BJ04 like", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04NotLike(String value) {
            addCriterion("EG10BJ04 not like", value, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04In(List<String> values) {
            addCriterion("EG10BJ04 in", values, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04NotIn(List<String> values) {
            addCriterion("EG10BJ04 not in", values, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04Between(String value1, String value2) {
            addCriterion("EG10BJ04 between", value1, value2, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj04NotBetween(String value1, String value2) {
            addCriterion("EG10BJ04 not between", value1, value2, "eg10bj04");
            return (Criteria) this;
        }

        public Criteria andEg10bj05IsNull() {
            addCriterion("EG10BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj05IsNotNull() {
            addCriterion("EG10BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj05EqualTo(String value) {
            addCriterion("EG10BJ05 =", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05NotEqualTo(String value) {
            addCriterion("EG10BJ05 <>", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05GreaterThan(String value) {
            addCriterion("EG10BJ05 >", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ05 >=", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05LessThan(String value) {
            addCriterion("EG10BJ05 <", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ05 <=", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05Like(String value) {
            addCriterion("EG10BJ05 like", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05NotLike(String value) {
            addCriterion("EG10BJ05 not like", value, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05In(List<String> values) {
            addCriterion("EG10BJ05 in", values, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05NotIn(List<String> values) {
            addCriterion("EG10BJ05 not in", values, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05Between(String value1, String value2) {
            addCriterion("EG10BJ05 between", value1, value2, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj05NotBetween(String value1, String value2) {
            addCriterion("EG10BJ05 not between", value1, value2, "eg10bj05");
            return (Criteria) this;
        }

        public Criteria andEg10bj06IsNull() {
            addCriterion("EG10BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj06IsNotNull() {
            addCriterion("EG10BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj06EqualTo(String value) {
            addCriterion("EG10BJ06 =", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06NotEqualTo(String value) {
            addCriterion("EG10BJ06 <>", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06GreaterThan(String value) {
            addCriterion("EG10BJ06 >", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ06 >=", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06LessThan(String value) {
            addCriterion("EG10BJ06 <", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ06 <=", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06Like(String value) {
            addCriterion("EG10BJ06 like", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06NotLike(String value) {
            addCriterion("EG10BJ06 not like", value, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06In(List<String> values) {
            addCriterion("EG10BJ06 in", values, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06NotIn(List<String> values) {
            addCriterion("EG10BJ06 not in", values, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06Between(String value1, String value2) {
            addCriterion("EG10BJ06 between", value1, value2, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj06NotBetween(String value1, String value2) {
            addCriterion("EG10BJ06 not between", value1, value2, "eg10bj06");
            return (Criteria) this;
        }

        public Criteria andEg10bj07IsNull() {
            addCriterion("EG10BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj07IsNotNull() {
            addCriterion("EG10BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj07EqualTo(String value) {
            addCriterion("EG10BJ07 =", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07NotEqualTo(String value) {
            addCriterion("EG10BJ07 <>", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07GreaterThan(String value) {
            addCriterion("EG10BJ07 >", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ07 >=", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07LessThan(String value) {
            addCriterion("EG10BJ07 <", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ07 <=", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07Like(String value) {
            addCriterion("EG10BJ07 like", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07NotLike(String value) {
            addCriterion("EG10BJ07 not like", value, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07In(List<String> values) {
            addCriterion("EG10BJ07 in", values, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07NotIn(List<String> values) {
            addCriterion("EG10BJ07 not in", values, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07Between(String value1, String value2) {
            addCriterion("EG10BJ07 between", value1, value2, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj07NotBetween(String value1, String value2) {
            addCriterion("EG10BJ07 not between", value1, value2, "eg10bj07");
            return (Criteria) this;
        }

        public Criteria andEg10bj08IsNull() {
            addCriterion("EG10BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj08IsNotNull() {
            addCriterion("EG10BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj08EqualTo(String value) {
            addCriterion("EG10BJ08 =", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08NotEqualTo(String value) {
            addCriterion("EG10BJ08 <>", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08GreaterThan(String value) {
            addCriterion("EG10BJ08 >", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ08 >=", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08LessThan(String value) {
            addCriterion("EG10BJ08 <", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ08 <=", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08Like(String value) {
            addCriterion("EG10BJ08 like", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08NotLike(String value) {
            addCriterion("EG10BJ08 not like", value, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08In(List<String> values) {
            addCriterion("EG10BJ08 in", values, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08NotIn(List<String> values) {
            addCriterion("EG10BJ08 not in", values, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08Between(String value1, String value2) {
            addCriterion("EG10BJ08 between", value1, value2, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj08NotBetween(String value1, String value2) {
            addCriterion("EG10BJ08 not between", value1, value2, "eg10bj08");
            return (Criteria) this;
        }

        public Criteria andEg10bj09IsNull() {
            addCriterion("EG10BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj09IsNotNull() {
            addCriterion("EG10BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj09EqualTo(String value) {
            addCriterion("EG10BJ09 =", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09NotEqualTo(String value) {
            addCriterion("EG10BJ09 <>", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09GreaterThan(String value) {
            addCriterion("EG10BJ09 >", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ09 >=", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09LessThan(String value) {
            addCriterion("EG10BJ09 <", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ09 <=", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09Like(String value) {
            addCriterion("EG10BJ09 like", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09NotLike(String value) {
            addCriterion("EG10BJ09 not like", value, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09In(List<String> values) {
            addCriterion("EG10BJ09 in", values, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09NotIn(List<String> values) {
            addCriterion("EG10BJ09 not in", values, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09Between(String value1, String value2) {
            addCriterion("EG10BJ09 between", value1, value2, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj09NotBetween(String value1, String value2) {
            addCriterion("EG10BJ09 not between", value1, value2, "eg10bj09");
            return (Criteria) this;
        }

        public Criteria andEg10bj10IsNull() {
            addCriterion("EG10BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj10IsNotNull() {
            addCriterion("EG10BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj10EqualTo(String value) {
            addCriterion("EG10BJ10 =", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10NotEqualTo(String value) {
            addCriterion("EG10BJ10 <>", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10GreaterThan(String value) {
            addCriterion("EG10BJ10 >", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ10 >=", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10LessThan(String value) {
            addCriterion("EG10BJ10 <", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ10 <=", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10Like(String value) {
            addCriterion("EG10BJ10 like", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10NotLike(String value) {
            addCriterion("EG10BJ10 not like", value, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10In(List<String> values) {
            addCriterion("EG10BJ10 in", values, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10NotIn(List<String> values) {
            addCriterion("EG10BJ10 not in", values, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10Between(String value1, String value2) {
            addCriterion("EG10BJ10 between", value1, value2, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj10NotBetween(String value1, String value2) {
            addCriterion("EG10BJ10 not between", value1, value2, "eg10bj10");
            return (Criteria) this;
        }

        public Criteria andEg10bj11IsNull() {
            addCriterion("EG10BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj11IsNotNull() {
            addCriterion("EG10BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj11EqualTo(String value) {
            addCriterion("EG10BJ11 =", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11NotEqualTo(String value) {
            addCriterion("EG10BJ11 <>", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11GreaterThan(String value) {
            addCriterion("EG10BJ11 >", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ11 >=", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11LessThan(String value) {
            addCriterion("EG10BJ11 <", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ11 <=", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11Like(String value) {
            addCriterion("EG10BJ11 like", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11NotLike(String value) {
            addCriterion("EG10BJ11 not like", value, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11In(List<String> values) {
            addCriterion("EG10BJ11 in", values, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11NotIn(List<String> values) {
            addCriterion("EG10BJ11 not in", values, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11Between(String value1, String value2) {
            addCriterion("EG10BJ11 between", value1, value2, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj11NotBetween(String value1, String value2) {
            addCriterion("EG10BJ11 not between", value1, value2, "eg10bj11");
            return (Criteria) this;
        }

        public Criteria andEg10bj12IsNull() {
            addCriterion("EG10BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj12IsNotNull() {
            addCriterion("EG10BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj12EqualTo(String value) {
            addCriterion("EG10BJ12 =", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12NotEqualTo(String value) {
            addCriterion("EG10BJ12 <>", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12GreaterThan(String value) {
            addCriterion("EG10BJ12 >", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ12 >=", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12LessThan(String value) {
            addCriterion("EG10BJ12 <", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ12 <=", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12Like(String value) {
            addCriterion("EG10BJ12 like", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12NotLike(String value) {
            addCriterion("EG10BJ12 not like", value, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12In(List<String> values) {
            addCriterion("EG10BJ12 in", values, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12NotIn(List<String> values) {
            addCriterion("EG10BJ12 not in", values, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12Between(String value1, String value2) {
            addCriterion("EG10BJ12 between", value1, value2, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj12NotBetween(String value1, String value2) {
            addCriterion("EG10BJ12 not between", value1, value2, "eg10bj12");
            return (Criteria) this;
        }

        public Criteria andEg10bj13IsNull() {
            addCriterion("EG10BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj13IsNotNull() {
            addCriterion("EG10BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj13EqualTo(String value) {
            addCriterion("EG10BJ13 =", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13NotEqualTo(String value) {
            addCriterion("EG10BJ13 <>", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13GreaterThan(String value) {
            addCriterion("EG10BJ13 >", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ13 >=", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13LessThan(String value) {
            addCriterion("EG10BJ13 <", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ13 <=", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13Like(String value) {
            addCriterion("EG10BJ13 like", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13NotLike(String value) {
            addCriterion("EG10BJ13 not like", value, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13In(List<String> values) {
            addCriterion("EG10BJ13 in", values, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13NotIn(List<String> values) {
            addCriterion("EG10BJ13 not in", values, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13Between(String value1, String value2) {
            addCriterion("EG10BJ13 between", value1, value2, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj13NotBetween(String value1, String value2) {
            addCriterion("EG10BJ13 not between", value1, value2, "eg10bj13");
            return (Criteria) this;
        }

        public Criteria andEg10bj14IsNull() {
            addCriterion("EG10BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj14IsNotNull() {
            addCriterion("EG10BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj14EqualTo(String value) {
            addCriterion("EG10BJ14 =", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14NotEqualTo(String value) {
            addCriterion("EG10BJ14 <>", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14GreaterThan(String value) {
            addCriterion("EG10BJ14 >", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ14 >=", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14LessThan(String value) {
            addCriterion("EG10BJ14 <", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ14 <=", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14Like(String value) {
            addCriterion("EG10BJ14 like", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14NotLike(String value) {
            addCriterion("EG10BJ14 not like", value, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14In(List<String> values) {
            addCriterion("EG10BJ14 in", values, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14NotIn(List<String> values) {
            addCriterion("EG10BJ14 not in", values, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14Between(String value1, String value2) {
            addCriterion("EG10BJ14 between", value1, value2, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj14NotBetween(String value1, String value2) {
            addCriterion("EG10BJ14 not between", value1, value2, "eg10bj14");
            return (Criteria) this;
        }

        public Criteria andEg10bj15IsNull() {
            addCriterion("EG10BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj15IsNotNull() {
            addCriterion("EG10BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj15EqualTo(String value) {
            addCriterion("EG10BJ15 =", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15NotEqualTo(String value) {
            addCriterion("EG10BJ15 <>", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15GreaterThan(String value) {
            addCriterion("EG10BJ15 >", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ15 >=", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15LessThan(String value) {
            addCriterion("EG10BJ15 <", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ15 <=", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15Like(String value) {
            addCriterion("EG10BJ15 like", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15NotLike(String value) {
            addCriterion("EG10BJ15 not like", value, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15In(List<String> values) {
            addCriterion("EG10BJ15 in", values, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15NotIn(List<String> values) {
            addCriterion("EG10BJ15 not in", values, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15Between(String value1, String value2) {
            addCriterion("EG10BJ15 between", value1, value2, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj15NotBetween(String value1, String value2) {
            addCriterion("EG10BJ15 not between", value1, value2, "eg10bj15");
            return (Criteria) this;
        }

        public Criteria andEg10bj16IsNull() {
            addCriterion("EG10BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj16IsNotNull() {
            addCriterion("EG10BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj16EqualTo(String value) {
            addCriterion("EG10BJ16 =", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16NotEqualTo(String value) {
            addCriterion("EG10BJ16 <>", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16GreaterThan(String value) {
            addCriterion("EG10BJ16 >", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ16 >=", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16LessThan(String value) {
            addCriterion("EG10BJ16 <", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ16 <=", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16Like(String value) {
            addCriterion("EG10BJ16 like", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16NotLike(String value) {
            addCriterion("EG10BJ16 not like", value, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16In(List<String> values) {
            addCriterion("EG10BJ16 in", values, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16NotIn(List<String> values) {
            addCriterion("EG10BJ16 not in", values, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16Between(String value1, String value2) {
            addCriterion("EG10BJ16 between", value1, value2, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj16NotBetween(String value1, String value2) {
            addCriterion("EG10BJ16 not between", value1, value2, "eg10bj16");
            return (Criteria) this;
        }

        public Criteria andEg10bj17IsNull() {
            addCriterion("EG10BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj17IsNotNull() {
            addCriterion("EG10BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj17EqualTo(String value) {
            addCriterion("EG10BJ17 =", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17NotEqualTo(String value) {
            addCriterion("EG10BJ17 <>", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17GreaterThan(String value) {
            addCriterion("EG10BJ17 >", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ17 >=", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17LessThan(String value) {
            addCriterion("EG10BJ17 <", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ17 <=", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17Like(String value) {
            addCriterion("EG10BJ17 like", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17NotLike(String value) {
            addCriterion("EG10BJ17 not like", value, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17In(List<String> values) {
            addCriterion("EG10BJ17 in", values, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17NotIn(List<String> values) {
            addCriterion("EG10BJ17 not in", values, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17Between(String value1, String value2) {
            addCriterion("EG10BJ17 between", value1, value2, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj17NotBetween(String value1, String value2) {
            addCriterion("EG10BJ17 not between", value1, value2, "eg10bj17");
            return (Criteria) this;
        }

        public Criteria andEg10bj18IsNull() {
            addCriterion("EG10BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj18IsNotNull() {
            addCriterion("EG10BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj18EqualTo(String value) {
            addCriterion("EG10BJ18 =", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18NotEqualTo(String value) {
            addCriterion("EG10BJ18 <>", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18GreaterThan(String value) {
            addCriterion("EG10BJ18 >", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ18 >=", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18LessThan(String value) {
            addCriterion("EG10BJ18 <", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ18 <=", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18Like(String value) {
            addCriterion("EG10BJ18 like", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18NotLike(String value) {
            addCriterion("EG10BJ18 not like", value, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18In(List<String> values) {
            addCriterion("EG10BJ18 in", values, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18NotIn(List<String> values) {
            addCriterion("EG10BJ18 not in", values, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18Between(String value1, String value2) {
            addCriterion("EG10BJ18 between", value1, value2, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj18NotBetween(String value1, String value2) {
            addCriterion("EG10BJ18 not between", value1, value2, "eg10bj18");
            return (Criteria) this;
        }

        public Criteria andEg10bj19IsNull() {
            addCriterion("EG10BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj19IsNotNull() {
            addCriterion("EG10BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj19EqualTo(String value) {
            addCriterion("EG10BJ19 =", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19NotEqualTo(String value) {
            addCriterion("EG10BJ19 <>", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19GreaterThan(String value) {
            addCriterion("EG10BJ19 >", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ19 >=", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19LessThan(String value) {
            addCriterion("EG10BJ19 <", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ19 <=", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19Like(String value) {
            addCriterion("EG10BJ19 like", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19NotLike(String value) {
            addCriterion("EG10BJ19 not like", value, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19In(List<String> values) {
            addCriterion("EG10BJ19 in", values, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19NotIn(List<String> values) {
            addCriterion("EG10BJ19 not in", values, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19Between(String value1, String value2) {
            addCriterion("EG10BJ19 between", value1, value2, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj19NotBetween(String value1, String value2) {
            addCriterion("EG10BJ19 not between", value1, value2, "eg10bj19");
            return (Criteria) this;
        }

        public Criteria andEg10bj20IsNull() {
            addCriterion("EG10BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj20IsNotNull() {
            addCriterion("EG10BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj20EqualTo(String value) {
            addCriterion("EG10BJ20 =", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20NotEqualTo(String value) {
            addCriterion("EG10BJ20 <>", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20GreaterThan(String value) {
            addCriterion("EG10BJ20 >", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ20 >=", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20LessThan(String value) {
            addCriterion("EG10BJ20 <", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ20 <=", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20Like(String value) {
            addCriterion("EG10BJ20 like", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20NotLike(String value) {
            addCriterion("EG10BJ20 not like", value, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20In(List<String> values) {
            addCriterion("EG10BJ20 in", values, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20NotIn(List<String> values) {
            addCriterion("EG10BJ20 not in", values, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20Between(String value1, String value2) {
            addCriterion("EG10BJ20 between", value1, value2, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj20NotBetween(String value1, String value2) {
            addCriterion("EG10BJ20 not between", value1, value2, "eg10bj20");
            return (Criteria) this;
        }

        public Criteria andEg10bj21IsNull() {
            addCriterion("EG10BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj21IsNotNull() {
            addCriterion("EG10BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj21EqualTo(String value) {
            addCriterion("EG10BJ21 =", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21NotEqualTo(String value) {
            addCriterion("EG10BJ21 <>", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21GreaterThan(String value) {
            addCriterion("EG10BJ21 >", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ21 >=", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21LessThan(String value) {
            addCriterion("EG10BJ21 <", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ21 <=", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21Like(String value) {
            addCriterion("EG10BJ21 like", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21NotLike(String value) {
            addCriterion("EG10BJ21 not like", value, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21In(List<String> values) {
            addCriterion("EG10BJ21 in", values, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21NotIn(List<String> values) {
            addCriterion("EG10BJ21 not in", values, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21Between(String value1, String value2) {
            addCriterion("EG10BJ21 between", value1, value2, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj21NotBetween(String value1, String value2) {
            addCriterion("EG10BJ21 not between", value1, value2, "eg10bj21");
            return (Criteria) this;
        }

        public Criteria andEg10bj22IsNull() {
            addCriterion("EG10BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj22IsNotNull() {
            addCriterion("EG10BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj22EqualTo(String value) {
            addCriterion("EG10BJ22 =", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22NotEqualTo(String value) {
            addCriterion("EG10BJ22 <>", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22GreaterThan(String value) {
            addCriterion("EG10BJ22 >", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ22 >=", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22LessThan(String value) {
            addCriterion("EG10BJ22 <", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ22 <=", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22Like(String value) {
            addCriterion("EG10BJ22 like", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22NotLike(String value) {
            addCriterion("EG10BJ22 not like", value, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22In(List<String> values) {
            addCriterion("EG10BJ22 in", values, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22NotIn(List<String> values) {
            addCriterion("EG10BJ22 not in", values, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22Between(String value1, String value2) {
            addCriterion("EG10BJ22 between", value1, value2, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj22NotBetween(String value1, String value2) {
            addCriterion("EG10BJ22 not between", value1, value2, "eg10bj22");
            return (Criteria) this;
        }

        public Criteria andEg10bj23IsNull() {
            addCriterion("EG10BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj23IsNotNull() {
            addCriterion("EG10BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj23EqualTo(String value) {
            addCriterion("EG10BJ23 =", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23NotEqualTo(String value) {
            addCriterion("EG10BJ23 <>", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23GreaterThan(String value) {
            addCriterion("EG10BJ23 >", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ23 >=", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23LessThan(String value) {
            addCriterion("EG10BJ23 <", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ23 <=", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23Like(String value) {
            addCriterion("EG10BJ23 like", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23NotLike(String value) {
            addCriterion("EG10BJ23 not like", value, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23In(List<String> values) {
            addCriterion("EG10BJ23 in", values, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23NotIn(List<String> values) {
            addCriterion("EG10BJ23 not in", values, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23Between(String value1, String value2) {
            addCriterion("EG10BJ23 between", value1, value2, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj23NotBetween(String value1, String value2) {
            addCriterion("EG10BJ23 not between", value1, value2, "eg10bj23");
            return (Criteria) this;
        }

        public Criteria andEg10bj24IsNull() {
            addCriterion("EG10BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj24IsNotNull() {
            addCriterion("EG10BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj24EqualTo(String value) {
            addCriterion("EG10BJ24 =", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24NotEqualTo(String value) {
            addCriterion("EG10BJ24 <>", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24GreaterThan(String value) {
            addCriterion("EG10BJ24 >", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ24 >=", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24LessThan(String value) {
            addCriterion("EG10BJ24 <", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ24 <=", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24Like(String value) {
            addCriterion("EG10BJ24 like", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24NotLike(String value) {
            addCriterion("EG10BJ24 not like", value, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24In(List<String> values) {
            addCriterion("EG10BJ24 in", values, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24NotIn(List<String> values) {
            addCriterion("EG10BJ24 not in", values, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24Between(String value1, String value2) {
            addCriterion("EG10BJ24 between", value1, value2, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj24NotBetween(String value1, String value2) {
            addCriterion("EG10BJ24 not between", value1, value2, "eg10bj24");
            return (Criteria) this;
        }

        public Criteria andEg10bj25IsNull() {
            addCriterion("EG10BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg10bj25IsNotNull() {
            addCriterion("EG10BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg10bj25EqualTo(String value) {
            addCriterion("EG10BJ25 =", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25NotEqualTo(String value) {
            addCriterion("EG10BJ25 <>", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25GreaterThan(String value) {
            addCriterion("EG10BJ25 >", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG10BJ25 >=", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25LessThan(String value) {
            addCriterion("EG10BJ25 <", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25LessThanOrEqualTo(String value) {
            addCriterion("EG10BJ25 <=", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25Like(String value) {
            addCriterion("EG10BJ25 like", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25NotLike(String value) {
            addCriterion("EG10BJ25 not like", value, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25In(List<String> values) {
            addCriterion("EG10BJ25 in", values, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25NotIn(List<String> values) {
            addCriterion("EG10BJ25 not in", values, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25Between(String value1, String value2) {
            addCriterion("EG10BJ25 between", value1, value2, "eg10bj25");
            return (Criteria) this;
        }

        public Criteria andEg10bj25NotBetween(String value1, String value2) {
            addCriterion("EG10BJ25 not between", value1, value2, "eg10bj25");
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