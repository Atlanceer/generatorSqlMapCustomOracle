package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntblsheet07Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntblsheet07Example() {
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

        public Criteria andReportyearIsNull() {
            addCriterion("REPORTYEAR is null");
            return (Criteria) this;
        }

        public Criteria andReportyearIsNotNull() {
            addCriterion("REPORTYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andReportyearEqualTo(String value) {
            addCriterion("REPORTYEAR =", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotEqualTo(String value) {
            addCriterion("REPORTYEAR <>", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearGreaterThan(String value) {
            addCriterion("REPORTYEAR >", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTYEAR >=", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearLessThan(String value) {
            addCriterion("REPORTYEAR <", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearLessThanOrEqualTo(String value) {
            addCriterion("REPORTYEAR <=", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearLike(String value) {
            addCriterion("REPORTYEAR like", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotLike(String value) {
            addCriterion("REPORTYEAR not like", value, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearIn(List<String> values) {
            addCriterion("REPORTYEAR in", values, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotIn(List<String> values) {
            addCriterion("REPORTYEAR not in", values, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearBetween(String value1, String value2) {
            addCriterion("REPORTYEAR between", value1, value2, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReportyearNotBetween(String value1, String value2) {
            addCriterion("REPORTYEAR not between", value1, value2, "reportyear");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("REPORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("REPORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(String value) {
            addCriterion("REPORTTYPE =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(String value) {
            addCriterion("REPORTTYPE <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(String value) {
            addCriterion("REPORTTYPE >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTTYPE >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(String value) {
            addCriterion("REPORTTYPE <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(String value) {
            addCriterion("REPORTTYPE <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLike(String value) {
            addCriterion("REPORTTYPE like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotLike(String value) {
            addCriterion("REPORTTYPE not like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<String> values) {
            addCriterion("REPORTTYPE in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<String> values) {
            addCriterion("REPORTTYPE not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(String value1, String value2) {
            addCriterion("REPORTTYPE between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(String value1, String value2) {
            addCriterion("REPORTTYPE not between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypesubIsNull() {
            addCriterion("REPORTTYPESUB is null");
            return (Criteria) this;
        }

        public Criteria andReporttypesubIsNotNull() {
            addCriterion("REPORTTYPESUB is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypesubEqualTo(String value) {
            addCriterion("REPORTTYPESUB =", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubNotEqualTo(String value) {
            addCriterion("REPORTTYPESUB <>", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubGreaterThan(String value) {
            addCriterion("REPORTTYPESUB >", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTTYPESUB >=", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubLessThan(String value) {
            addCriterion("REPORTTYPESUB <", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubLessThanOrEqualTo(String value) {
            addCriterion("REPORTTYPESUB <=", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubLike(String value) {
            addCriterion("REPORTTYPESUB like", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubNotLike(String value) {
            addCriterion("REPORTTYPESUB not like", value, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubIn(List<String> values) {
            addCriterion("REPORTTYPESUB in", values, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubNotIn(List<String> values) {
            addCriterion("REPORTTYPESUB not in", values, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubBetween(String value1, String value2) {
            addCriterion("REPORTTYPESUB between", value1, value2, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andReporttypesubNotBetween(String value1, String value2) {
            addCriterion("REPORTTYPESUB not between", value1, value2, "reporttypesub");
            return (Criteria) this;
        }

        public Criteria andEg02bj01IsNull() {
            addCriterion("EG02BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj01IsNotNull() {
            addCriterion("EG02BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj01EqualTo(String value) {
            addCriterion("EG02BJ01 =", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01NotEqualTo(String value) {
            addCriterion("EG02BJ01 <>", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01GreaterThan(String value) {
            addCriterion("EG02BJ01 >", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ01 >=", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01LessThan(String value) {
            addCriterion("EG02BJ01 <", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ01 <=", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01Like(String value) {
            addCriterion("EG02BJ01 like", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01NotLike(String value) {
            addCriterion("EG02BJ01 not like", value, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01In(List<String> values) {
            addCriterion("EG02BJ01 in", values, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01NotIn(List<String> values) {
            addCriterion("EG02BJ01 not in", values, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01Between(String value1, String value2) {
            addCriterion("EG02BJ01 between", value1, value2, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj01NotBetween(String value1, String value2) {
            addCriterion("EG02BJ01 not between", value1, value2, "eg02bj01");
            return (Criteria) this;
        }

        public Criteria andEg02bj02IsNull() {
            addCriterion("EG02BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj02IsNotNull() {
            addCriterion("EG02BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj02EqualTo(String value) {
            addCriterion("EG02BJ02 =", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02NotEqualTo(String value) {
            addCriterion("EG02BJ02 <>", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02GreaterThan(String value) {
            addCriterion("EG02BJ02 >", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ02 >=", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02LessThan(String value) {
            addCriterion("EG02BJ02 <", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ02 <=", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02Like(String value) {
            addCriterion("EG02BJ02 like", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02NotLike(String value) {
            addCriterion("EG02BJ02 not like", value, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02In(List<String> values) {
            addCriterion("EG02BJ02 in", values, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02NotIn(List<String> values) {
            addCriterion("EG02BJ02 not in", values, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02Between(String value1, String value2) {
            addCriterion("EG02BJ02 between", value1, value2, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj02NotBetween(String value1, String value2) {
            addCriterion("EG02BJ02 not between", value1, value2, "eg02bj02");
            return (Criteria) this;
        }

        public Criteria andEg02bj03IsNull() {
            addCriterion("EG02BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj03IsNotNull() {
            addCriterion("EG02BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj03EqualTo(String value) {
            addCriterion("EG02BJ03 =", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03NotEqualTo(String value) {
            addCriterion("EG02BJ03 <>", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03GreaterThan(String value) {
            addCriterion("EG02BJ03 >", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ03 >=", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03LessThan(String value) {
            addCriterion("EG02BJ03 <", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ03 <=", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03Like(String value) {
            addCriterion("EG02BJ03 like", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03NotLike(String value) {
            addCriterion("EG02BJ03 not like", value, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03In(List<String> values) {
            addCriterion("EG02BJ03 in", values, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03NotIn(List<String> values) {
            addCriterion("EG02BJ03 not in", values, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03Between(String value1, String value2) {
            addCriterion("EG02BJ03 between", value1, value2, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj03NotBetween(String value1, String value2) {
            addCriterion("EG02BJ03 not between", value1, value2, "eg02bj03");
            return (Criteria) this;
        }

        public Criteria andEg02bj04IsNull() {
            addCriterion("EG02BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj04IsNotNull() {
            addCriterion("EG02BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj04EqualTo(String value) {
            addCriterion("EG02BJ04 =", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04NotEqualTo(String value) {
            addCriterion("EG02BJ04 <>", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04GreaterThan(String value) {
            addCriterion("EG02BJ04 >", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ04 >=", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04LessThan(String value) {
            addCriterion("EG02BJ04 <", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ04 <=", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04Like(String value) {
            addCriterion("EG02BJ04 like", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04NotLike(String value) {
            addCriterion("EG02BJ04 not like", value, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04In(List<String> values) {
            addCriterion("EG02BJ04 in", values, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04NotIn(List<String> values) {
            addCriterion("EG02BJ04 not in", values, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04Between(String value1, String value2) {
            addCriterion("EG02BJ04 between", value1, value2, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj04NotBetween(String value1, String value2) {
            addCriterion("EG02BJ04 not between", value1, value2, "eg02bj04");
            return (Criteria) this;
        }

        public Criteria andEg02bj05IsNull() {
            addCriterion("EG02BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj05IsNotNull() {
            addCriterion("EG02BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj05EqualTo(String value) {
            addCriterion("EG02BJ05 =", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05NotEqualTo(String value) {
            addCriterion("EG02BJ05 <>", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05GreaterThan(String value) {
            addCriterion("EG02BJ05 >", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ05 >=", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05LessThan(String value) {
            addCriterion("EG02BJ05 <", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ05 <=", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05Like(String value) {
            addCriterion("EG02BJ05 like", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05NotLike(String value) {
            addCriterion("EG02BJ05 not like", value, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05In(List<String> values) {
            addCriterion("EG02BJ05 in", values, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05NotIn(List<String> values) {
            addCriterion("EG02BJ05 not in", values, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05Between(String value1, String value2) {
            addCriterion("EG02BJ05 between", value1, value2, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj05NotBetween(String value1, String value2) {
            addCriterion("EG02BJ05 not between", value1, value2, "eg02bj05");
            return (Criteria) this;
        }

        public Criteria andEg02bj06IsNull() {
            addCriterion("EG02BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj06IsNotNull() {
            addCriterion("EG02BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj06EqualTo(String value) {
            addCriterion("EG02BJ06 =", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06NotEqualTo(String value) {
            addCriterion("EG02BJ06 <>", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06GreaterThan(String value) {
            addCriterion("EG02BJ06 >", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ06 >=", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06LessThan(String value) {
            addCriterion("EG02BJ06 <", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ06 <=", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06Like(String value) {
            addCriterion("EG02BJ06 like", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06NotLike(String value) {
            addCriterion("EG02BJ06 not like", value, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06In(List<String> values) {
            addCriterion("EG02BJ06 in", values, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06NotIn(List<String> values) {
            addCriterion("EG02BJ06 not in", values, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06Between(String value1, String value2) {
            addCriterion("EG02BJ06 between", value1, value2, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj06NotBetween(String value1, String value2) {
            addCriterion("EG02BJ06 not between", value1, value2, "eg02bj06");
            return (Criteria) this;
        }

        public Criteria andEg02bj07IsNull() {
            addCriterion("EG02BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj07IsNotNull() {
            addCriterion("EG02BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj07EqualTo(String value) {
            addCriterion("EG02BJ07 =", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07NotEqualTo(String value) {
            addCriterion("EG02BJ07 <>", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07GreaterThan(String value) {
            addCriterion("EG02BJ07 >", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ07 >=", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07LessThan(String value) {
            addCriterion("EG02BJ07 <", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ07 <=", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07Like(String value) {
            addCriterion("EG02BJ07 like", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07NotLike(String value) {
            addCriterion("EG02BJ07 not like", value, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07In(List<String> values) {
            addCriterion("EG02BJ07 in", values, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07NotIn(List<String> values) {
            addCriterion("EG02BJ07 not in", values, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07Between(String value1, String value2) {
            addCriterion("EG02BJ07 between", value1, value2, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj07NotBetween(String value1, String value2) {
            addCriterion("EG02BJ07 not between", value1, value2, "eg02bj07");
            return (Criteria) this;
        }

        public Criteria andEg02bj08IsNull() {
            addCriterion("EG02BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj08IsNotNull() {
            addCriterion("EG02BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj08EqualTo(String value) {
            addCriterion("EG02BJ08 =", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08NotEqualTo(String value) {
            addCriterion("EG02BJ08 <>", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08GreaterThan(String value) {
            addCriterion("EG02BJ08 >", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ08 >=", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08LessThan(String value) {
            addCriterion("EG02BJ08 <", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ08 <=", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08Like(String value) {
            addCriterion("EG02BJ08 like", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08NotLike(String value) {
            addCriterion("EG02BJ08 not like", value, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08In(List<String> values) {
            addCriterion("EG02BJ08 in", values, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08NotIn(List<String> values) {
            addCriterion("EG02BJ08 not in", values, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08Between(String value1, String value2) {
            addCriterion("EG02BJ08 between", value1, value2, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj08NotBetween(String value1, String value2) {
            addCriterion("EG02BJ08 not between", value1, value2, "eg02bj08");
            return (Criteria) this;
        }

        public Criteria andEg02bj09IsNull() {
            addCriterion("EG02BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj09IsNotNull() {
            addCriterion("EG02BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj09EqualTo(String value) {
            addCriterion("EG02BJ09 =", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09NotEqualTo(String value) {
            addCriterion("EG02BJ09 <>", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09GreaterThan(String value) {
            addCriterion("EG02BJ09 >", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ09 >=", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09LessThan(String value) {
            addCriterion("EG02BJ09 <", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ09 <=", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09Like(String value) {
            addCriterion("EG02BJ09 like", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09NotLike(String value) {
            addCriterion("EG02BJ09 not like", value, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09In(List<String> values) {
            addCriterion("EG02BJ09 in", values, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09NotIn(List<String> values) {
            addCriterion("EG02BJ09 not in", values, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09Between(String value1, String value2) {
            addCriterion("EG02BJ09 between", value1, value2, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj09NotBetween(String value1, String value2) {
            addCriterion("EG02BJ09 not between", value1, value2, "eg02bj09");
            return (Criteria) this;
        }

        public Criteria andEg02bj10IsNull() {
            addCriterion("EG02BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj10IsNotNull() {
            addCriterion("EG02BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj10EqualTo(String value) {
            addCriterion("EG02BJ10 =", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10NotEqualTo(String value) {
            addCriterion("EG02BJ10 <>", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10GreaterThan(String value) {
            addCriterion("EG02BJ10 >", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ10 >=", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10LessThan(String value) {
            addCriterion("EG02BJ10 <", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ10 <=", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10Like(String value) {
            addCriterion("EG02BJ10 like", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10NotLike(String value) {
            addCriterion("EG02BJ10 not like", value, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10In(List<String> values) {
            addCriterion("EG02BJ10 in", values, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10NotIn(List<String> values) {
            addCriterion("EG02BJ10 not in", values, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10Between(String value1, String value2) {
            addCriterion("EG02BJ10 between", value1, value2, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj10NotBetween(String value1, String value2) {
            addCriterion("EG02BJ10 not between", value1, value2, "eg02bj10");
            return (Criteria) this;
        }

        public Criteria andEg02bj11IsNull() {
            addCriterion("EG02BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj11IsNotNull() {
            addCriterion("EG02BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj11EqualTo(String value) {
            addCriterion("EG02BJ11 =", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11NotEqualTo(String value) {
            addCriterion("EG02BJ11 <>", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11GreaterThan(String value) {
            addCriterion("EG02BJ11 >", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ11 >=", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11LessThan(String value) {
            addCriterion("EG02BJ11 <", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ11 <=", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11Like(String value) {
            addCriterion("EG02BJ11 like", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11NotLike(String value) {
            addCriterion("EG02BJ11 not like", value, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11In(List<String> values) {
            addCriterion("EG02BJ11 in", values, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11NotIn(List<String> values) {
            addCriterion("EG02BJ11 not in", values, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11Between(String value1, String value2) {
            addCriterion("EG02BJ11 between", value1, value2, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj11NotBetween(String value1, String value2) {
            addCriterion("EG02BJ11 not between", value1, value2, "eg02bj11");
            return (Criteria) this;
        }

        public Criteria andEg02bj12IsNull() {
            addCriterion("EG02BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj12IsNotNull() {
            addCriterion("EG02BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj12EqualTo(String value) {
            addCriterion("EG02BJ12 =", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12NotEqualTo(String value) {
            addCriterion("EG02BJ12 <>", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12GreaterThan(String value) {
            addCriterion("EG02BJ12 >", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ12 >=", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12LessThan(String value) {
            addCriterion("EG02BJ12 <", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ12 <=", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12Like(String value) {
            addCriterion("EG02BJ12 like", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12NotLike(String value) {
            addCriterion("EG02BJ12 not like", value, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12In(List<String> values) {
            addCriterion("EG02BJ12 in", values, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12NotIn(List<String> values) {
            addCriterion("EG02BJ12 not in", values, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12Between(String value1, String value2) {
            addCriterion("EG02BJ12 between", value1, value2, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj12NotBetween(String value1, String value2) {
            addCriterion("EG02BJ12 not between", value1, value2, "eg02bj12");
            return (Criteria) this;
        }

        public Criteria andEg02bj13IsNull() {
            addCriterion("EG02BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj13IsNotNull() {
            addCriterion("EG02BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj13EqualTo(String value) {
            addCriterion("EG02BJ13 =", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13NotEqualTo(String value) {
            addCriterion("EG02BJ13 <>", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13GreaterThan(String value) {
            addCriterion("EG02BJ13 >", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ13 >=", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13LessThan(String value) {
            addCriterion("EG02BJ13 <", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ13 <=", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13Like(String value) {
            addCriterion("EG02BJ13 like", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13NotLike(String value) {
            addCriterion("EG02BJ13 not like", value, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13In(List<String> values) {
            addCriterion("EG02BJ13 in", values, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13NotIn(List<String> values) {
            addCriterion("EG02BJ13 not in", values, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13Between(String value1, String value2) {
            addCriterion("EG02BJ13 between", value1, value2, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj13NotBetween(String value1, String value2) {
            addCriterion("EG02BJ13 not between", value1, value2, "eg02bj13");
            return (Criteria) this;
        }

        public Criteria andEg02bj14IsNull() {
            addCriterion("EG02BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj14IsNotNull() {
            addCriterion("EG02BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj14EqualTo(String value) {
            addCriterion("EG02BJ14 =", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14NotEqualTo(String value) {
            addCriterion("EG02BJ14 <>", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14GreaterThan(String value) {
            addCriterion("EG02BJ14 >", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ14 >=", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14LessThan(String value) {
            addCriterion("EG02BJ14 <", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ14 <=", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14Like(String value) {
            addCriterion("EG02BJ14 like", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14NotLike(String value) {
            addCriterion("EG02BJ14 not like", value, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14In(List<String> values) {
            addCriterion("EG02BJ14 in", values, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14NotIn(List<String> values) {
            addCriterion("EG02BJ14 not in", values, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14Between(String value1, String value2) {
            addCriterion("EG02BJ14 between", value1, value2, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj14NotBetween(String value1, String value2) {
            addCriterion("EG02BJ14 not between", value1, value2, "eg02bj14");
            return (Criteria) this;
        }

        public Criteria andEg02bj15IsNull() {
            addCriterion("EG02BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj15IsNotNull() {
            addCriterion("EG02BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj15EqualTo(String value) {
            addCriterion("EG02BJ15 =", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15NotEqualTo(String value) {
            addCriterion("EG02BJ15 <>", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15GreaterThan(String value) {
            addCriterion("EG02BJ15 >", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ15 >=", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15LessThan(String value) {
            addCriterion("EG02BJ15 <", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ15 <=", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15Like(String value) {
            addCriterion("EG02BJ15 like", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15NotLike(String value) {
            addCriterion("EG02BJ15 not like", value, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15In(List<String> values) {
            addCriterion("EG02BJ15 in", values, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15NotIn(List<String> values) {
            addCriterion("EG02BJ15 not in", values, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15Between(String value1, String value2) {
            addCriterion("EG02BJ15 between", value1, value2, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj15NotBetween(String value1, String value2) {
            addCriterion("EG02BJ15 not between", value1, value2, "eg02bj15");
            return (Criteria) this;
        }

        public Criteria andEg02bj16IsNull() {
            addCriterion("EG02BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj16IsNotNull() {
            addCriterion("EG02BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj16EqualTo(String value) {
            addCriterion("EG02BJ16 =", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16NotEqualTo(String value) {
            addCriterion("EG02BJ16 <>", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16GreaterThan(String value) {
            addCriterion("EG02BJ16 >", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ16 >=", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16LessThan(String value) {
            addCriterion("EG02BJ16 <", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ16 <=", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16Like(String value) {
            addCriterion("EG02BJ16 like", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16NotLike(String value) {
            addCriterion("EG02BJ16 not like", value, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16In(List<String> values) {
            addCriterion("EG02BJ16 in", values, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16NotIn(List<String> values) {
            addCriterion("EG02BJ16 not in", values, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16Between(String value1, String value2) {
            addCriterion("EG02BJ16 between", value1, value2, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj16NotBetween(String value1, String value2) {
            addCriterion("EG02BJ16 not between", value1, value2, "eg02bj16");
            return (Criteria) this;
        }

        public Criteria andEg02bj17IsNull() {
            addCriterion("EG02BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj17IsNotNull() {
            addCriterion("EG02BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj17EqualTo(String value) {
            addCriterion("EG02BJ17 =", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17NotEqualTo(String value) {
            addCriterion("EG02BJ17 <>", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17GreaterThan(String value) {
            addCriterion("EG02BJ17 >", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ17 >=", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17LessThan(String value) {
            addCriterion("EG02BJ17 <", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ17 <=", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17Like(String value) {
            addCriterion("EG02BJ17 like", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17NotLike(String value) {
            addCriterion("EG02BJ17 not like", value, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17In(List<String> values) {
            addCriterion("EG02BJ17 in", values, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17NotIn(List<String> values) {
            addCriterion("EG02BJ17 not in", values, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17Between(String value1, String value2) {
            addCriterion("EG02BJ17 between", value1, value2, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj17NotBetween(String value1, String value2) {
            addCriterion("EG02BJ17 not between", value1, value2, "eg02bj17");
            return (Criteria) this;
        }

        public Criteria andEg02bj18IsNull() {
            addCriterion("EG02BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj18IsNotNull() {
            addCriterion("EG02BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj18EqualTo(String value) {
            addCriterion("EG02BJ18 =", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18NotEqualTo(String value) {
            addCriterion("EG02BJ18 <>", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18GreaterThan(String value) {
            addCriterion("EG02BJ18 >", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ18 >=", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18LessThan(String value) {
            addCriterion("EG02BJ18 <", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ18 <=", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18Like(String value) {
            addCriterion("EG02BJ18 like", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18NotLike(String value) {
            addCriterion("EG02BJ18 not like", value, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18In(List<String> values) {
            addCriterion("EG02BJ18 in", values, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18NotIn(List<String> values) {
            addCriterion("EG02BJ18 not in", values, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18Between(String value1, String value2) {
            addCriterion("EG02BJ18 between", value1, value2, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj18NotBetween(String value1, String value2) {
            addCriterion("EG02BJ18 not between", value1, value2, "eg02bj18");
            return (Criteria) this;
        }

        public Criteria andEg02bj19IsNull() {
            addCriterion("EG02BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj19IsNotNull() {
            addCriterion("EG02BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj19EqualTo(String value) {
            addCriterion("EG02BJ19 =", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19NotEqualTo(String value) {
            addCriterion("EG02BJ19 <>", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19GreaterThan(String value) {
            addCriterion("EG02BJ19 >", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ19 >=", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19LessThan(String value) {
            addCriterion("EG02BJ19 <", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ19 <=", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19Like(String value) {
            addCriterion("EG02BJ19 like", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19NotLike(String value) {
            addCriterion("EG02BJ19 not like", value, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19In(List<String> values) {
            addCriterion("EG02BJ19 in", values, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19NotIn(List<String> values) {
            addCriterion("EG02BJ19 not in", values, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19Between(String value1, String value2) {
            addCriterion("EG02BJ19 between", value1, value2, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj19NotBetween(String value1, String value2) {
            addCriterion("EG02BJ19 not between", value1, value2, "eg02bj19");
            return (Criteria) this;
        }

        public Criteria andEg02bj20IsNull() {
            addCriterion("EG02BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj20IsNotNull() {
            addCriterion("EG02BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj20EqualTo(String value) {
            addCriterion("EG02BJ20 =", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20NotEqualTo(String value) {
            addCriterion("EG02BJ20 <>", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20GreaterThan(String value) {
            addCriterion("EG02BJ20 >", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ20 >=", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20LessThan(String value) {
            addCriterion("EG02BJ20 <", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ20 <=", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20Like(String value) {
            addCriterion("EG02BJ20 like", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20NotLike(String value) {
            addCriterion("EG02BJ20 not like", value, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20In(List<String> values) {
            addCriterion("EG02BJ20 in", values, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20NotIn(List<String> values) {
            addCriterion("EG02BJ20 not in", values, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20Between(String value1, String value2) {
            addCriterion("EG02BJ20 between", value1, value2, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj20NotBetween(String value1, String value2) {
            addCriterion("EG02BJ20 not between", value1, value2, "eg02bj20");
            return (Criteria) this;
        }

        public Criteria andEg02bj21IsNull() {
            addCriterion("EG02BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj21IsNotNull() {
            addCriterion("EG02BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj21EqualTo(String value) {
            addCriterion("EG02BJ21 =", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21NotEqualTo(String value) {
            addCriterion("EG02BJ21 <>", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21GreaterThan(String value) {
            addCriterion("EG02BJ21 >", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ21 >=", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21LessThan(String value) {
            addCriterion("EG02BJ21 <", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ21 <=", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21Like(String value) {
            addCriterion("EG02BJ21 like", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21NotLike(String value) {
            addCriterion("EG02BJ21 not like", value, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21In(List<String> values) {
            addCriterion("EG02BJ21 in", values, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21NotIn(List<String> values) {
            addCriterion("EG02BJ21 not in", values, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21Between(String value1, String value2) {
            addCriterion("EG02BJ21 between", value1, value2, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj21NotBetween(String value1, String value2) {
            addCriterion("EG02BJ21 not between", value1, value2, "eg02bj21");
            return (Criteria) this;
        }

        public Criteria andEg02bj22IsNull() {
            addCriterion("EG02BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj22IsNotNull() {
            addCriterion("EG02BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj22EqualTo(String value) {
            addCriterion("EG02BJ22 =", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22NotEqualTo(String value) {
            addCriterion("EG02BJ22 <>", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22GreaterThan(String value) {
            addCriterion("EG02BJ22 >", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ22 >=", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22LessThan(String value) {
            addCriterion("EG02BJ22 <", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ22 <=", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22Like(String value) {
            addCriterion("EG02BJ22 like", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22NotLike(String value) {
            addCriterion("EG02BJ22 not like", value, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22In(List<String> values) {
            addCriterion("EG02BJ22 in", values, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22NotIn(List<String> values) {
            addCriterion("EG02BJ22 not in", values, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22Between(String value1, String value2) {
            addCriterion("EG02BJ22 between", value1, value2, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj22NotBetween(String value1, String value2) {
            addCriterion("EG02BJ22 not between", value1, value2, "eg02bj22");
            return (Criteria) this;
        }

        public Criteria andEg02bj23IsNull() {
            addCriterion("EG02BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj23IsNotNull() {
            addCriterion("EG02BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj23EqualTo(String value) {
            addCriterion("EG02BJ23 =", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23NotEqualTo(String value) {
            addCriterion("EG02BJ23 <>", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23GreaterThan(String value) {
            addCriterion("EG02BJ23 >", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ23 >=", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23LessThan(String value) {
            addCriterion("EG02BJ23 <", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ23 <=", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23Like(String value) {
            addCriterion("EG02BJ23 like", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23NotLike(String value) {
            addCriterion("EG02BJ23 not like", value, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23In(List<String> values) {
            addCriterion("EG02BJ23 in", values, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23NotIn(List<String> values) {
            addCriterion("EG02BJ23 not in", values, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23Between(String value1, String value2) {
            addCriterion("EG02BJ23 between", value1, value2, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj23NotBetween(String value1, String value2) {
            addCriterion("EG02BJ23 not between", value1, value2, "eg02bj23");
            return (Criteria) this;
        }

        public Criteria andEg02bj24IsNull() {
            addCriterion("EG02BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj24IsNotNull() {
            addCriterion("EG02BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj24EqualTo(String value) {
            addCriterion("EG02BJ24 =", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24NotEqualTo(String value) {
            addCriterion("EG02BJ24 <>", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24GreaterThan(String value) {
            addCriterion("EG02BJ24 >", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ24 >=", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24LessThan(String value) {
            addCriterion("EG02BJ24 <", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ24 <=", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24Like(String value) {
            addCriterion("EG02BJ24 like", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24NotLike(String value) {
            addCriterion("EG02BJ24 not like", value, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24In(List<String> values) {
            addCriterion("EG02BJ24 in", values, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24NotIn(List<String> values) {
            addCriterion("EG02BJ24 not in", values, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24Between(String value1, String value2) {
            addCriterion("EG02BJ24 between", value1, value2, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj24NotBetween(String value1, String value2) {
            addCriterion("EG02BJ24 not between", value1, value2, "eg02bj24");
            return (Criteria) this;
        }

        public Criteria andEg02bj25IsNull() {
            addCriterion("EG02BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj25IsNotNull() {
            addCriterion("EG02BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj25EqualTo(String value) {
            addCriterion("EG02BJ25 =", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25NotEqualTo(String value) {
            addCriterion("EG02BJ25 <>", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25GreaterThan(String value) {
            addCriterion("EG02BJ25 >", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ25 >=", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25LessThan(String value) {
            addCriterion("EG02BJ25 <", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ25 <=", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25Like(String value) {
            addCriterion("EG02BJ25 like", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25NotLike(String value) {
            addCriterion("EG02BJ25 not like", value, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25In(List<String> values) {
            addCriterion("EG02BJ25 in", values, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25NotIn(List<String> values) {
            addCriterion("EG02BJ25 not in", values, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25Between(String value1, String value2) {
            addCriterion("EG02BJ25 between", value1, value2, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj25NotBetween(String value1, String value2) {
            addCriterion("EG02BJ25 not between", value1, value2, "eg02bj25");
            return (Criteria) this;
        }

        public Criteria andEg02bj26IsNull() {
            addCriterion("EG02BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj26IsNotNull() {
            addCriterion("EG02BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj26EqualTo(String value) {
            addCriterion("EG02BJ26 =", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26NotEqualTo(String value) {
            addCriterion("EG02BJ26 <>", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26GreaterThan(String value) {
            addCriterion("EG02BJ26 >", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ26 >=", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26LessThan(String value) {
            addCriterion("EG02BJ26 <", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ26 <=", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26Like(String value) {
            addCriterion("EG02BJ26 like", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26NotLike(String value) {
            addCriterion("EG02BJ26 not like", value, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26In(List<String> values) {
            addCriterion("EG02BJ26 in", values, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26NotIn(List<String> values) {
            addCriterion("EG02BJ26 not in", values, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26Between(String value1, String value2) {
            addCriterion("EG02BJ26 between", value1, value2, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj26NotBetween(String value1, String value2) {
            addCriterion("EG02BJ26 not between", value1, value2, "eg02bj26");
            return (Criteria) this;
        }

        public Criteria andEg02bj27IsNull() {
            addCriterion("EG02BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj27IsNotNull() {
            addCriterion("EG02BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj27EqualTo(String value) {
            addCriterion("EG02BJ27 =", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27NotEqualTo(String value) {
            addCriterion("EG02BJ27 <>", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27GreaterThan(String value) {
            addCriterion("EG02BJ27 >", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ27 >=", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27LessThan(String value) {
            addCriterion("EG02BJ27 <", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ27 <=", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27Like(String value) {
            addCriterion("EG02BJ27 like", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27NotLike(String value) {
            addCriterion("EG02BJ27 not like", value, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27In(List<String> values) {
            addCriterion("EG02BJ27 in", values, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27NotIn(List<String> values) {
            addCriterion("EG02BJ27 not in", values, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27Between(String value1, String value2) {
            addCriterion("EG02BJ27 between", value1, value2, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj27NotBetween(String value1, String value2) {
            addCriterion("EG02BJ27 not between", value1, value2, "eg02bj27");
            return (Criteria) this;
        }

        public Criteria andEg02bj28IsNull() {
            addCriterion("EG02BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj28IsNotNull() {
            addCriterion("EG02BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj28EqualTo(String value) {
            addCriterion("EG02BJ28 =", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28NotEqualTo(String value) {
            addCriterion("EG02BJ28 <>", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28GreaterThan(String value) {
            addCriterion("EG02BJ28 >", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ28 >=", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28LessThan(String value) {
            addCriterion("EG02BJ28 <", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ28 <=", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28Like(String value) {
            addCriterion("EG02BJ28 like", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28NotLike(String value) {
            addCriterion("EG02BJ28 not like", value, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28In(List<String> values) {
            addCriterion("EG02BJ28 in", values, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28NotIn(List<String> values) {
            addCriterion("EG02BJ28 not in", values, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28Between(String value1, String value2) {
            addCriterion("EG02BJ28 between", value1, value2, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj28NotBetween(String value1, String value2) {
            addCriterion("EG02BJ28 not between", value1, value2, "eg02bj28");
            return (Criteria) this;
        }

        public Criteria andEg02bj29IsNull() {
            addCriterion("EG02BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj29IsNotNull() {
            addCriterion("EG02BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj29EqualTo(String value) {
            addCriterion("EG02BJ29 =", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29NotEqualTo(String value) {
            addCriterion("EG02BJ29 <>", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29GreaterThan(String value) {
            addCriterion("EG02BJ29 >", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ29 >=", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29LessThan(String value) {
            addCriterion("EG02BJ29 <", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ29 <=", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29Like(String value) {
            addCriterion("EG02BJ29 like", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29NotLike(String value) {
            addCriterion("EG02BJ29 not like", value, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29In(List<String> values) {
            addCriterion("EG02BJ29 in", values, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29NotIn(List<String> values) {
            addCriterion("EG02BJ29 not in", values, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29Between(String value1, String value2) {
            addCriterion("EG02BJ29 between", value1, value2, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj29NotBetween(String value1, String value2) {
            addCriterion("EG02BJ29 not between", value1, value2, "eg02bj29");
            return (Criteria) this;
        }

        public Criteria andEg02bj30IsNull() {
            addCriterion("EG02BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj30IsNotNull() {
            addCriterion("EG02BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj30EqualTo(String value) {
            addCriterion("EG02BJ30 =", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30NotEqualTo(String value) {
            addCriterion("EG02BJ30 <>", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30GreaterThan(String value) {
            addCriterion("EG02BJ30 >", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ30 >=", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30LessThan(String value) {
            addCriterion("EG02BJ30 <", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ30 <=", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30Like(String value) {
            addCriterion("EG02BJ30 like", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30NotLike(String value) {
            addCriterion("EG02BJ30 not like", value, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30In(List<String> values) {
            addCriterion("EG02BJ30 in", values, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30NotIn(List<String> values) {
            addCriterion("EG02BJ30 not in", values, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30Between(String value1, String value2) {
            addCriterion("EG02BJ30 between", value1, value2, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj30NotBetween(String value1, String value2) {
            addCriterion("EG02BJ30 not between", value1, value2, "eg02bj30");
            return (Criteria) this;
        }

        public Criteria andEg02bj31IsNull() {
            addCriterion("EG02BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj31IsNotNull() {
            addCriterion("EG02BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj31EqualTo(String value) {
            addCriterion("EG02BJ31 =", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31NotEqualTo(String value) {
            addCriterion("EG02BJ31 <>", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31GreaterThan(String value) {
            addCriterion("EG02BJ31 >", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ31 >=", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31LessThan(String value) {
            addCriterion("EG02BJ31 <", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ31 <=", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31Like(String value) {
            addCriterion("EG02BJ31 like", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31NotLike(String value) {
            addCriterion("EG02BJ31 not like", value, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31In(List<String> values) {
            addCriterion("EG02BJ31 in", values, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31NotIn(List<String> values) {
            addCriterion("EG02BJ31 not in", values, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31Between(String value1, String value2) {
            addCriterion("EG02BJ31 between", value1, value2, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj31NotBetween(String value1, String value2) {
            addCriterion("EG02BJ31 not between", value1, value2, "eg02bj31");
            return (Criteria) this;
        }

        public Criteria andEg02bj32IsNull() {
            addCriterion("EG02BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj32IsNotNull() {
            addCriterion("EG02BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj32EqualTo(String value) {
            addCriterion("EG02BJ32 =", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32NotEqualTo(String value) {
            addCriterion("EG02BJ32 <>", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32GreaterThan(String value) {
            addCriterion("EG02BJ32 >", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ32 >=", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32LessThan(String value) {
            addCriterion("EG02BJ32 <", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ32 <=", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32Like(String value) {
            addCriterion("EG02BJ32 like", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32NotLike(String value) {
            addCriterion("EG02BJ32 not like", value, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32In(List<String> values) {
            addCriterion("EG02BJ32 in", values, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32NotIn(List<String> values) {
            addCriterion("EG02BJ32 not in", values, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32Between(String value1, String value2) {
            addCriterion("EG02BJ32 between", value1, value2, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj32NotBetween(String value1, String value2) {
            addCriterion("EG02BJ32 not between", value1, value2, "eg02bj32");
            return (Criteria) this;
        }

        public Criteria andEg02bj33IsNull() {
            addCriterion("EG02BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj33IsNotNull() {
            addCriterion("EG02BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj33EqualTo(String value) {
            addCriterion("EG02BJ33 =", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33NotEqualTo(String value) {
            addCriterion("EG02BJ33 <>", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33GreaterThan(String value) {
            addCriterion("EG02BJ33 >", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ33 >=", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33LessThan(String value) {
            addCriterion("EG02BJ33 <", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ33 <=", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33Like(String value) {
            addCriterion("EG02BJ33 like", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33NotLike(String value) {
            addCriterion("EG02BJ33 not like", value, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33In(List<String> values) {
            addCriterion("EG02BJ33 in", values, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33NotIn(List<String> values) {
            addCriterion("EG02BJ33 not in", values, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33Between(String value1, String value2) {
            addCriterion("EG02BJ33 between", value1, value2, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj33NotBetween(String value1, String value2) {
            addCriterion("EG02BJ33 not between", value1, value2, "eg02bj33");
            return (Criteria) this;
        }

        public Criteria andEg02bj34IsNull() {
            addCriterion("EG02BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj34IsNotNull() {
            addCriterion("EG02BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj34EqualTo(String value) {
            addCriterion("EG02BJ34 =", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34NotEqualTo(String value) {
            addCriterion("EG02BJ34 <>", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34GreaterThan(String value) {
            addCriterion("EG02BJ34 >", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ34 >=", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34LessThan(String value) {
            addCriterion("EG02BJ34 <", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ34 <=", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34Like(String value) {
            addCriterion("EG02BJ34 like", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34NotLike(String value) {
            addCriterion("EG02BJ34 not like", value, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34In(List<String> values) {
            addCriterion("EG02BJ34 in", values, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34NotIn(List<String> values) {
            addCriterion("EG02BJ34 not in", values, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34Between(String value1, String value2) {
            addCriterion("EG02BJ34 between", value1, value2, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj34NotBetween(String value1, String value2) {
            addCriterion("EG02BJ34 not between", value1, value2, "eg02bj34");
            return (Criteria) this;
        }

        public Criteria andEg02bj35IsNull() {
            addCriterion("EG02BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj35IsNotNull() {
            addCriterion("EG02BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj35EqualTo(String value) {
            addCriterion("EG02BJ35 =", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35NotEqualTo(String value) {
            addCriterion("EG02BJ35 <>", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35GreaterThan(String value) {
            addCriterion("EG02BJ35 >", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ35 >=", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35LessThan(String value) {
            addCriterion("EG02BJ35 <", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ35 <=", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35Like(String value) {
            addCriterion("EG02BJ35 like", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35NotLike(String value) {
            addCriterion("EG02BJ35 not like", value, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35In(List<String> values) {
            addCriterion("EG02BJ35 in", values, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35NotIn(List<String> values) {
            addCriterion("EG02BJ35 not in", values, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35Between(String value1, String value2) {
            addCriterion("EG02BJ35 between", value1, value2, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj35NotBetween(String value1, String value2) {
            addCriterion("EG02BJ35 not between", value1, value2, "eg02bj35");
            return (Criteria) this;
        }

        public Criteria andEg02bj36IsNull() {
            addCriterion("EG02BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj36IsNotNull() {
            addCriterion("EG02BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj36EqualTo(String value) {
            addCriterion("EG02BJ36 =", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36NotEqualTo(String value) {
            addCriterion("EG02BJ36 <>", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36GreaterThan(String value) {
            addCriterion("EG02BJ36 >", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ36 >=", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36LessThan(String value) {
            addCriterion("EG02BJ36 <", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ36 <=", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36Like(String value) {
            addCriterion("EG02BJ36 like", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36NotLike(String value) {
            addCriterion("EG02BJ36 not like", value, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36In(List<String> values) {
            addCriterion("EG02BJ36 in", values, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36NotIn(List<String> values) {
            addCriterion("EG02BJ36 not in", values, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36Between(String value1, String value2) {
            addCriterion("EG02BJ36 between", value1, value2, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj36NotBetween(String value1, String value2) {
            addCriterion("EG02BJ36 not between", value1, value2, "eg02bj36");
            return (Criteria) this;
        }

        public Criteria andEg02bj37IsNull() {
            addCriterion("EG02BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj37IsNotNull() {
            addCriterion("EG02BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj37EqualTo(String value) {
            addCriterion("EG02BJ37 =", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37NotEqualTo(String value) {
            addCriterion("EG02BJ37 <>", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37GreaterThan(String value) {
            addCriterion("EG02BJ37 >", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ37 >=", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37LessThan(String value) {
            addCriterion("EG02BJ37 <", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ37 <=", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37Like(String value) {
            addCriterion("EG02BJ37 like", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37NotLike(String value) {
            addCriterion("EG02BJ37 not like", value, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37In(List<String> values) {
            addCriterion("EG02BJ37 in", values, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37NotIn(List<String> values) {
            addCriterion("EG02BJ37 not in", values, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37Between(String value1, String value2) {
            addCriterion("EG02BJ37 between", value1, value2, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj37NotBetween(String value1, String value2) {
            addCriterion("EG02BJ37 not between", value1, value2, "eg02bj37");
            return (Criteria) this;
        }

        public Criteria andEg02bj38IsNull() {
            addCriterion("EG02BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj38IsNotNull() {
            addCriterion("EG02BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj38EqualTo(String value) {
            addCriterion("EG02BJ38 =", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38NotEqualTo(String value) {
            addCriterion("EG02BJ38 <>", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38GreaterThan(String value) {
            addCriterion("EG02BJ38 >", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ38 >=", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38LessThan(String value) {
            addCriterion("EG02BJ38 <", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ38 <=", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38Like(String value) {
            addCriterion("EG02BJ38 like", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38NotLike(String value) {
            addCriterion("EG02BJ38 not like", value, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38In(List<String> values) {
            addCriterion("EG02BJ38 in", values, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38NotIn(List<String> values) {
            addCriterion("EG02BJ38 not in", values, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38Between(String value1, String value2) {
            addCriterion("EG02BJ38 between", value1, value2, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj38NotBetween(String value1, String value2) {
            addCriterion("EG02BJ38 not between", value1, value2, "eg02bj38");
            return (Criteria) this;
        }

        public Criteria andEg02bj39IsNull() {
            addCriterion("EG02BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj39IsNotNull() {
            addCriterion("EG02BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj39EqualTo(String value) {
            addCriterion("EG02BJ39 =", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39NotEqualTo(String value) {
            addCriterion("EG02BJ39 <>", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39GreaterThan(String value) {
            addCriterion("EG02BJ39 >", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ39 >=", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39LessThan(String value) {
            addCriterion("EG02BJ39 <", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ39 <=", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39Like(String value) {
            addCriterion("EG02BJ39 like", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39NotLike(String value) {
            addCriterion("EG02BJ39 not like", value, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39In(List<String> values) {
            addCriterion("EG02BJ39 in", values, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39NotIn(List<String> values) {
            addCriterion("EG02BJ39 not in", values, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39Between(String value1, String value2) {
            addCriterion("EG02BJ39 between", value1, value2, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj39NotBetween(String value1, String value2) {
            addCriterion("EG02BJ39 not between", value1, value2, "eg02bj39");
            return (Criteria) this;
        }

        public Criteria andEg02bj40IsNull() {
            addCriterion("EG02BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj40IsNotNull() {
            addCriterion("EG02BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj40EqualTo(String value) {
            addCriterion("EG02BJ40 =", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40NotEqualTo(String value) {
            addCriterion("EG02BJ40 <>", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40GreaterThan(String value) {
            addCriterion("EG02BJ40 >", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ40 >=", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40LessThan(String value) {
            addCriterion("EG02BJ40 <", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ40 <=", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40Like(String value) {
            addCriterion("EG02BJ40 like", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40NotLike(String value) {
            addCriterion("EG02BJ40 not like", value, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40In(List<String> values) {
            addCriterion("EG02BJ40 in", values, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40NotIn(List<String> values) {
            addCriterion("EG02BJ40 not in", values, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40Between(String value1, String value2) {
            addCriterion("EG02BJ40 between", value1, value2, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj40NotBetween(String value1, String value2) {
            addCriterion("EG02BJ40 not between", value1, value2, "eg02bj40");
            return (Criteria) this;
        }

        public Criteria andEg02bj41IsNull() {
            addCriterion("EG02BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj41IsNotNull() {
            addCriterion("EG02BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj41EqualTo(String value) {
            addCriterion("EG02BJ41 =", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41NotEqualTo(String value) {
            addCriterion("EG02BJ41 <>", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41GreaterThan(String value) {
            addCriterion("EG02BJ41 >", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ41 >=", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41LessThan(String value) {
            addCriterion("EG02BJ41 <", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ41 <=", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41Like(String value) {
            addCriterion("EG02BJ41 like", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41NotLike(String value) {
            addCriterion("EG02BJ41 not like", value, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41In(List<String> values) {
            addCriterion("EG02BJ41 in", values, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41NotIn(List<String> values) {
            addCriterion("EG02BJ41 not in", values, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41Between(String value1, String value2) {
            addCriterion("EG02BJ41 between", value1, value2, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj41NotBetween(String value1, String value2) {
            addCriterion("EG02BJ41 not between", value1, value2, "eg02bj41");
            return (Criteria) this;
        }

        public Criteria andEg02bj42IsNull() {
            addCriterion("EG02BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj42IsNotNull() {
            addCriterion("EG02BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj42EqualTo(String value) {
            addCriterion("EG02BJ42 =", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42NotEqualTo(String value) {
            addCriterion("EG02BJ42 <>", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42GreaterThan(String value) {
            addCriterion("EG02BJ42 >", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ42 >=", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42LessThan(String value) {
            addCriterion("EG02BJ42 <", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ42 <=", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42Like(String value) {
            addCriterion("EG02BJ42 like", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42NotLike(String value) {
            addCriterion("EG02BJ42 not like", value, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42In(List<String> values) {
            addCriterion("EG02BJ42 in", values, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42NotIn(List<String> values) {
            addCriterion("EG02BJ42 not in", values, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42Between(String value1, String value2) {
            addCriterion("EG02BJ42 between", value1, value2, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj42NotBetween(String value1, String value2) {
            addCriterion("EG02BJ42 not between", value1, value2, "eg02bj42");
            return (Criteria) this;
        }

        public Criteria andEg02bj43IsNull() {
            addCriterion("EG02BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj43IsNotNull() {
            addCriterion("EG02BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj43EqualTo(String value) {
            addCriterion("EG02BJ43 =", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43NotEqualTo(String value) {
            addCriterion("EG02BJ43 <>", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43GreaterThan(String value) {
            addCriterion("EG02BJ43 >", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ43 >=", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43LessThan(String value) {
            addCriterion("EG02BJ43 <", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ43 <=", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43Like(String value) {
            addCriterion("EG02BJ43 like", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43NotLike(String value) {
            addCriterion("EG02BJ43 not like", value, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43In(List<String> values) {
            addCriterion("EG02BJ43 in", values, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43NotIn(List<String> values) {
            addCriterion("EG02BJ43 not in", values, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43Between(String value1, String value2) {
            addCriterion("EG02BJ43 between", value1, value2, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj43NotBetween(String value1, String value2) {
            addCriterion("EG02BJ43 not between", value1, value2, "eg02bj43");
            return (Criteria) this;
        }

        public Criteria andEg02bj44IsNull() {
            addCriterion("EG02BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj44IsNotNull() {
            addCriterion("EG02BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj44EqualTo(String value) {
            addCriterion("EG02BJ44 =", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44NotEqualTo(String value) {
            addCriterion("EG02BJ44 <>", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44GreaterThan(String value) {
            addCriterion("EG02BJ44 >", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ44 >=", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44LessThan(String value) {
            addCriterion("EG02BJ44 <", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ44 <=", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44Like(String value) {
            addCriterion("EG02BJ44 like", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44NotLike(String value) {
            addCriterion("EG02BJ44 not like", value, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44In(List<String> values) {
            addCriterion("EG02BJ44 in", values, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44NotIn(List<String> values) {
            addCriterion("EG02BJ44 not in", values, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44Between(String value1, String value2) {
            addCriterion("EG02BJ44 between", value1, value2, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj44NotBetween(String value1, String value2) {
            addCriterion("EG02BJ44 not between", value1, value2, "eg02bj44");
            return (Criteria) this;
        }

        public Criteria andEg02bj45IsNull() {
            addCriterion("EG02BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj45IsNotNull() {
            addCriterion("EG02BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj45EqualTo(String value) {
            addCriterion("EG02BJ45 =", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45NotEqualTo(String value) {
            addCriterion("EG02BJ45 <>", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45GreaterThan(String value) {
            addCriterion("EG02BJ45 >", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ45 >=", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45LessThan(String value) {
            addCriterion("EG02BJ45 <", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ45 <=", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45Like(String value) {
            addCriterion("EG02BJ45 like", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45NotLike(String value) {
            addCriterion("EG02BJ45 not like", value, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45In(List<String> values) {
            addCriterion("EG02BJ45 in", values, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45NotIn(List<String> values) {
            addCriterion("EG02BJ45 not in", values, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45Between(String value1, String value2) {
            addCriterion("EG02BJ45 between", value1, value2, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj45NotBetween(String value1, String value2) {
            addCriterion("EG02BJ45 not between", value1, value2, "eg02bj45");
            return (Criteria) this;
        }

        public Criteria andEg02bj46IsNull() {
            addCriterion("EG02BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj46IsNotNull() {
            addCriterion("EG02BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj46EqualTo(String value) {
            addCriterion("EG02BJ46 =", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46NotEqualTo(String value) {
            addCriterion("EG02BJ46 <>", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46GreaterThan(String value) {
            addCriterion("EG02BJ46 >", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ46 >=", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46LessThan(String value) {
            addCriterion("EG02BJ46 <", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ46 <=", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46Like(String value) {
            addCriterion("EG02BJ46 like", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46NotLike(String value) {
            addCriterion("EG02BJ46 not like", value, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46In(List<String> values) {
            addCriterion("EG02BJ46 in", values, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46NotIn(List<String> values) {
            addCriterion("EG02BJ46 not in", values, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46Between(String value1, String value2) {
            addCriterion("EG02BJ46 between", value1, value2, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj46NotBetween(String value1, String value2) {
            addCriterion("EG02BJ46 not between", value1, value2, "eg02bj46");
            return (Criteria) this;
        }

        public Criteria andEg02bj47IsNull() {
            addCriterion("EG02BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj47IsNotNull() {
            addCriterion("EG02BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj47EqualTo(String value) {
            addCriterion("EG02BJ47 =", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47NotEqualTo(String value) {
            addCriterion("EG02BJ47 <>", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47GreaterThan(String value) {
            addCriterion("EG02BJ47 >", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ47 >=", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47LessThan(String value) {
            addCriterion("EG02BJ47 <", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ47 <=", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47Like(String value) {
            addCriterion("EG02BJ47 like", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47NotLike(String value) {
            addCriterion("EG02BJ47 not like", value, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47In(List<String> values) {
            addCriterion("EG02BJ47 in", values, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47NotIn(List<String> values) {
            addCriterion("EG02BJ47 not in", values, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47Between(String value1, String value2) {
            addCriterion("EG02BJ47 between", value1, value2, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj47NotBetween(String value1, String value2) {
            addCriterion("EG02BJ47 not between", value1, value2, "eg02bj47");
            return (Criteria) this;
        }

        public Criteria andEg02bj48IsNull() {
            addCriterion("EG02BJ48 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj48IsNotNull() {
            addCriterion("EG02BJ48 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj48EqualTo(String value) {
            addCriterion("EG02BJ48 =", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48NotEqualTo(String value) {
            addCriterion("EG02BJ48 <>", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48GreaterThan(String value) {
            addCriterion("EG02BJ48 >", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ48 >=", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48LessThan(String value) {
            addCriterion("EG02BJ48 <", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ48 <=", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48Like(String value) {
            addCriterion("EG02BJ48 like", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48NotLike(String value) {
            addCriterion("EG02BJ48 not like", value, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48In(List<String> values) {
            addCriterion("EG02BJ48 in", values, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48NotIn(List<String> values) {
            addCriterion("EG02BJ48 not in", values, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48Between(String value1, String value2) {
            addCriterion("EG02BJ48 between", value1, value2, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj48NotBetween(String value1, String value2) {
            addCriterion("EG02BJ48 not between", value1, value2, "eg02bj48");
            return (Criteria) this;
        }

        public Criteria andEg02bj49IsNull() {
            addCriterion("EG02BJ49 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj49IsNotNull() {
            addCriterion("EG02BJ49 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj49EqualTo(String value) {
            addCriterion("EG02BJ49 =", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49NotEqualTo(String value) {
            addCriterion("EG02BJ49 <>", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49GreaterThan(String value) {
            addCriterion("EG02BJ49 >", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ49 >=", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49LessThan(String value) {
            addCriterion("EG02BJ49 <", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ49 <=", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49Like(String value) {
            addCriterion("EG02BJ49 like", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49NotLike(String value) {
            addCriterion("EG02BJ49 not like", value, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49In(List<String> values) {
            addCriterion("EG02BJ49 in", values, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49NotIn(List<String> values) {
            addCriterion("EG02BJ49 not in", values, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49Between(String value1, String value2) {
            addCriterion("EG02BJ49 between", value1, value2, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj49NotBetween(String value1, String value2) {
            addCriterion("EG02BJ49 not between", value1, value2, "eg02bj49");
            return (Criteria) this;
        }

        public Criteria andEg02bj50IsNull() {
            addCriterion("EG02BJ50 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj50IsNotNull() {
            addCriterion("EG02BJ50 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj50EqualTo(String value) {
            addCriterion("EG02BJ50 =", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50NotEqualTo(String value) {
            addCriterion("EG02BJ50 <>", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50GreaterThan(String value) {
            addCriterion("EG02BJ50 >", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ50 >=", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50LessThan(String value) {
            addCriterion("EG02BJ50 <", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ50 <=", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50Like(String value) {
            addCriterion("EG02BJ50 like", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50NotLike(String value) {
            addCriterion("EG02BJ50 not like", value, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50In(List<String> values) {
            addCriterion("EG02BJ50 in", values, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50NotIn(List<String> values) {
            addCriterion("EG02BJ50 not in", values, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50Between(String value1, String value2) {
            addCriterion("EG02BJ50 between", value1, value2, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj50NotBetween(String value1, String value2) {
            addCriterion("EG02BJ50 not between", value1, value2, "eg02bj50");
            return (Criteria) this;
        }

        public Criteria andEg02bj51IsNull() {
            addCriterion("EG02BJ51 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj51IsNotNull() {
            addCriterion("EG02BJ51 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj51EqualTo(String value) {
            addCriterion("EG02BJ51 =", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51NotEqualTo(String value) {
            addCriterion("EG02BJ51 <>", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51GreaterThan(String value) {
            addCriterion("EG02BJ51 >", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ51 >=", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51LessThan(String value) {
            addCriterion("EG02BJ51 <", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ51 <=", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51Like(String value) {
            addCriterion("EG02BJ51 like", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51NotLike(String value) {
            addCriterion("EG02BJ51 not like", value, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51In(List<String> values) {
            addCriterion("EG02BJ51 in", values, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51NotIn(List<String> values) {
            addCriterion("EG02BJ51 not in", values, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51Between(String value1, String value2) {
            addCriterion("EG02BJ51 between", value1, value2, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj51NotBetween(String value1, String value2) {
            addCriterion("EG02BJ51 not between", value1, value2, "eg02bj51");
            return (Criteria) this;
        }

        public Criteria andEg02bj52IsNull() {
            addCriterion("EG02BJ52 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj52IsNotNull() {
            addCriterion("EG02BJ52 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj52EqualTo(String value) {
            addCriterion("EG02BJ52 =", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52NotEqualTo(String value) {
            addCriterion("EG02BJ52 <>", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52GreaterThan(String value) {
            addCriterion("EG02BJ52 >", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ52 >=", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52LessThan(String value) {
            addCriterion("EG02BJ52 <", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ52 <=", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52Like(String value) {
            addCriterion("EG02BJ52 like", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52NotLike(String value) {
            addCriterion("EG02BJ52 not like", value, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52In(List<String> values) {
            addCriterion("EG02BJ52 in", values, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52NotIn(List<String> values) {
            addCriterion("EG02BJ52 not in", values, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52Between(String value1, String value2) {
            addCriterion("EG02BJ52 between", value1, value2, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj52NotBetween(String value1, String value2) {
            addCriterion("EG02BJ52 not between", value1, value2, "eg02bj52");
            return (Criteria) this;
        }

        public Criteria andEg02bj53IsNull() {
            addCriterion("EG02BJ53 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj53IsNotNull() {
            addCriterion("EG02BJ53 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj53EqualTo(String value) {
            addCriterion("EG02BJ53 =", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53NotEqualTo(String value) {
            addCriterion("EG02BJ53 <>", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53GreaterThan(String value) {
            addCriterion("EG02BJ53 >", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ53 >=", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53LessThan(String value) {
            addCriterion("EG02BJ53 <", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ53 <=", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53Like(String value) {
            addCriterion("EG02BJ53 like", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53NotLike(String value) {
            addCriterion("EG02BJ53 not like", value, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53In(List<String> values) {
            addCriterion("EG02BJ53 in", values, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53NotIn(List<String> values) {
            addCriterion("EG02BJ53 not in", values, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53Between(String value1, String value2) {
            addCriterion("EG02BJ53 between", value1, value2, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj53NotBetween(String value1, String value2) {
            addCriterion("EG02BJ53 not between", value1, value2, "eg02bj53");
            return (Criteria) this;
        }

        public Criteria andEg02bj54IsNull() {
            addCriterion("EG02BJ54 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj54IsNotNull() {
            addCriterion("EG02BJ54 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj54EqualTo(String value) {
            addCriterion("EG02BJ54 =", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54NotEqualTo(String value) {
            addCriterion("EG02BJ54 <>", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54GreaterThan(String value) {
            addCriterion("EG02BJ54 >", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ54 >=", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54LessThan(String value) {
            addCriterion("EG02BJ54 <", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ54 <=", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54Like(String value) {
            addCriterion("EG02BJ54 like", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54NotLike(String value) {
            addCriterion("EG02BJ54 not like", value, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54In(List<String> values) {
            addCriterion("EG02BJ54 in", values, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54NotIn(List<String> values) {
            addCriterion("EG02BJ54 not in", values, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54Between(String value1, String value2) {
            addCriterion("EG02BJ54 between", value1, value2, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj54NotBetween(String value1, String value2) {
            addCriterion("EG02BJ54 not between", value1, value2, "eg02bj54");
            return (Criteria) this;
        }

        public Criteria andEg02bj55IsNull() {
            addCriterion("EG02BJ55 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj55IsNotNull() {
            addCriterion("EG02BJ55 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj55EqualTo(String value) {
            addCriterion("EG02BJ55 =", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55NotEqualTo(String value) {
            addCriterion("EG02BJ55 <>", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55GreaterThan(String value) {
            addCriterion("EG02BJ55 >", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ55 >=", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55LessThan(String value) {
            addCriterion("EG02BJ55 <", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ55 <=", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55Like(String value) {
            addCriterion("EG02BJ55 like", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55NotLike(String value) {
            addCriterion("EG02BJ55 not like", value, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55In(List<String> values) {
            addCriterion("EG02BJ55 in", values, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55NotIn(List<String> values) {
            addCriterion("EG02BJ55 not in", values, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55Between(String value1, String value2) {
            addCriterion("EG02BJ55 between", value1, value2, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj55NotBetween(String value1, String value2) {
            addCriterion("EG02BJ55 not between", value1, value2, "eg02bj55");
            return (Criteria) this;
        }

        public Criteria andEg02bj56IsNull() {
            addCriterion("EG02BJ56 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj56IsNotNull() {
            addCriterion("EG02BJ56 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj56EqualTo(String value) {
            addCriterion("EG02BJ56 =", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56NotEqualTo(String value) {
            addCriterion("EG02BJ56 <>", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56GreaterThan(String value) {
            addCriterion("EG02BJ56 >", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ56 >=", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56LessThan(String value) {
            addCriterion("EG02BJ56 <", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ56 <=", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56Like(String value) {
            addCriterion("EG02BJ56 like", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56NotLike(String value) {
            addCriterion("EG02BJ56 not like", value, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56In(List<String> values) {
            addCriterion("EG02BJ56 in", values, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56NotIn(List<String> values) {
            addCriterion("EG02BJ56 not in", values, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56Between(String value1, String value2) {
            addCriterion("EG02BJ56 between", value1, value2, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj56NotBetween(String value1, String value2) {
            addCriterion("EG02BJ56 not between", value1, value2, "eg02bj56");
            return (Criteria) this;
        }

        public Criteria andEg02bj57IsNull() {
            addCriterion("EG02BJ57 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj57IsNotNull() {
            addCriterion("EG02BJ57 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj57EqualTo(String value) {
            addCriterion("EG02BJ57 =", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57NotEqualTo(String value) {
            addCriterion("EG02BJ57 <>", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57GreaterThan(String value) {
            addCriterion("EG02BJ57 >", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ57 >=", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57LessThan(String value) {
            addCriterion("EG02BJ57 <", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ57 <=", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57Like(String value) {
            addCriterion("EG02BJ57 like", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57NotLike(String value) {
            addCriterion("EG02BJ57 not like", value, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57In(List<String> values) {
            addCriterion("EG02BJ57 in", values, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57NotIn(List<String> values) {
            addCriterion("EG02BJ57 not in", values, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57Between(String value1, String value2) {
            addCriterion("EG02BJ57 between", value1, value2, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj57NotBetween(String value1, String value2) {
            addCriterion("EG02BJ57 not between", value1, value2, "eg02bj57");
            return (Criteria) this;
        }

        public Criteria andEg02bj58IsNull() {
            addCriterion("EG02BJ58 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj58IsNotNull() {
            addCriterion("EG02BJ58 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj58EqualTo(String value) {
            addCriterion("EG02BJ58 =", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58NotEqualTo(String value) {
            addCriterion("EG02BJ58 <>", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58GreaterThan(String value) {
            addCriterion("EG02BJ58 >", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ58 >=", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58LessThan(String value) {
            addCriterion("EG02BJ58 <", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ58 <=", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58Like(String value) {
            addCriterion("EG02BJ58 like", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58NotLike(String value) {
            addCriterion("EG02BJ58 not like", value, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58In(List<String> values) {
            addCriterion("EG02BJ58 in", values, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58NotIn(List<String> values) {
            addCriterion("EG02BJ58 not in", values, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58Between(String value1, String value2) {
            addCriterion("EG02BJ58 between", value1, value2, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj58NotBetween(String value1, String value2) {
            addCriterion("EG02BJ58 not between", value1, value2, "eg02bj58");
            return (Criteria) this;
        }

        public Criteria andEg02bj59IsNull() {
            addCriterion("EG02BJ59 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj59IsNotNull() {
            addCriterion("EG02BJ59 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj59EqualTo(String value) {
            addCriterion("EG02BJ59 =", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59NotEqualTo(String value) {
            addCriterion("EG02BJ59 <>", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59GreaterThan(String value) {
            addCriterion("EG02BJ59 >", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ59 >=", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59LessThan(String value) {
            addCriterion("EG02BJ59 <", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ59 <=", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59Like(String value) {
            addCriterion("EG02BJ59 like", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59NotLike(String value) {
            addCriterion("EG02BJ59 not like", value, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59In(List<String> values) {
            addCriterion("EG02BJ59 in", values, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59NotIn(List<String> values) {
            addCriterion("EG02BJ59 not in", values, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59Between(String value1, String value2) {
            addCriterion("EG02BJ59 between", value1, value2, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj59NotBetween(String value1, String value2) {
            addCriterion("EG02BJ59 not between", value1, value2, "eg02bj59");
            return (Criteria) this;
        }

        public Criteria andEg02bj60IsNull() {
            addCriterion("EG02BJ60 is null");
            return (Criteria) this;
        }

        public Criteria andEg02bj60IsNotNull() {
            addCriterion("EG02BJ60 is not null");
            return (Criteria) this;
        }

        public Criteria andEg02bj60EqualTo(String value) {
            addCriterion("EG02BJ60 =", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60NotEqualTo(String value) {
            addCriterion("EG02BJ60 <>", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60GreaterThan(String value) {
            addCriterion("EG02BJ60 >", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60GreaterThanOrEqualTo(String value) {
            addCriterion("EG02BJ60 >=", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60LessThan(String value) {
            addCriterion("EG02BJ60 <", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60LessThanOrEqualTo(String value) {
            addCriterion("EG02BJ60 <=", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60Like(String value) {
            addCriterion("EG02BJ60 like", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60NotLike(String value) {
            addCriterion("EG02BJ60 not like", value, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60In(List<String> values) {
            addCriterion("EG02BJ60 in", values, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60NotIn(List<String> values) {
            addCriterion("EG02BJ60 not in", values, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60Between(String value1, String value2) {
            addCriterion("EG02BJ60 between", value1, value2, "eg02bj60");
            return (Criteria) this;
        }

        public Criteria andEg02bj60NotBetween(String value1, String value2) {
            addCriterion("EG02BJ60 not between", value1, value2, "eg02bj60");
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