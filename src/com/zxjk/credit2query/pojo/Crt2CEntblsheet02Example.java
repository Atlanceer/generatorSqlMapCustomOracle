package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CEntblsheet02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CEntblsheet02Example() {
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

        public Criteria andEg01bj01IsNull() {
            addCriterion("EG01BJ01 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj01IsNotNull() {
            addCriterion("EG01BJ01 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj01EqualTo(String value) {
            addCriterion("EG01BJ01 =", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01NotEqualTo(String value) {
            addCriterion("EG01BJ01 <>", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01GreaterThan(String value) {
            addCriterion("EG01BJ01 >", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ01 >=", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01LessThan(String value) {
            addCriterion("EG01BJ01 <", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ01 <=", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01Like(String value) {
            addCriterion("EG01BJ01 like", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01NotLike(String value) {
            addCriterion("EG01BJ01 not like", value, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01In(List<String> values) {
            addCriterion("EG01BJ01 in", values, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01NotIn(List<String> values) {
            addCriterion("EG01BJ01 not in", values, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01Between(String value1, String value2) {
            addCriterion("EG01BJ01 between", value1, value2, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj01NotBetween(String value1, String value2) {
            addCriterion("EG01BJ01 not between", value1, value2, "eg01bj01");
            return (Criteria) this;
        }

        public Criteria andEg01bj02IsNull() {
            addCriterion("EG01BJ02 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj02IsNotNull() {
            addCriterion("EG01BJ02 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj02EqualTo(String value) {
            addCriterion("EG01BJ02 =", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02NotEqualTo(String value) {
            addCriterion("EG01BJ02 <>", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02GreaterThan(String value) {
            addCriterion("EG01BJ02 >", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ02 >=", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02LessThan(String value) {
            addCriterion("EG01BJ02 <", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ02 <=", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02Like(String value) {
            addCriterion("EG01BJ02 like", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02NotLike(String value) {
            addCriterion("EG01BJ02 not like", value, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02In(List<String> values) {
            addCriterion("EG01BJ02 in", values, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02NotIn(List<String> values) {
            addCriterion("EG01BJ02 not in", values, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02Between(String value1, String value2) {
            addCriterion("EG01BJ02 between", value1, value2, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj02NotBetween(String value1, String value2) {
            addCriterion("EG01BJ02 not between", value1, value2, "eg01bj02");
            return (Criteria) this;
        }

        public Criteria andEg01bj03IsNull() {
            addCriterion("EG01BJ03 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj03IsNotNull() {
            addCriterion("EG01BJ03 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj03EqualTo(String value) {
            addCriterion("EG01BJ03 =", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03NotEqualTo(String value) {
            addCriterion("EG01BJ03 <>", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03GreaterThan(String value) {
            addCriterion("EG01BJ03 >", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ03 >=", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03LessThan(String value) {
            addCriterion("EG01BJ03 <", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ03 <=", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03Like(String value) {
            addCriterion("EG01BJ03 like", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03NotLike(String value) {
            addCriterion("EG01BJ03 not like", value, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03In(List<String> values) {
            addCriterion("EG01BJ03 in", values, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03NotIn(List<String> values) {
            addCriterion("EG01BJ03 not in", values, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03Between(String value1, String value2) {
            addCriterion("EG01BJ03 between", value1, value2, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj03NotBetween(String value1, String value2) {
            addCriterion("EG01BJ03 not between", value1, value2, "eg01bj03");
            return (Criteria) this;
        }

        public Criteria andEg01bj04IsNull() {
            addCriterion("EG01BJ04 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj04IsNotNull() {
            addCriterion("EG01BJ04 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj04EqualTo(String value) {
            addCriterion("EG01BJ04 =", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04NotEqualTo(String value) {
            addCriterion("EG01BJ04 <>", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04GreaterThan(String value) {
            addCriterion("EG01BJ04 >", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ04 >=", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04LessThan(String value) {
            addCriterion("EG01BJ04 <", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ04 <=", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04Like(String value) {
            addCriterion("EG01BJ04 like", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04NotLike(String value) {
            addCriterion("EG01BJ04 not like", value, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04In(List<String> values) {
            addCriterion("EG01BJ04 in", values, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04NotIn(List<String> values) {
            addCriterion("EG01BJ04 not in", values, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04Between(String value1, String value2) {
            addCriterion("EG01BJ04 between", value1, value2, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj04NotBetween(String value1, String value2) {
            addCriterion("EG01BJ04 not between", value1, value2, "eg01bj04");
            return (Criteria) this;
        }

        public Criteria andEg01bj05IsNull() {
            addCriterion("EG01BJ05 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj05IsNotNull() {
            addCriterion("EG01BJ05 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj05EqualTo(String value) {
            addCriterion("EG01BJ05 =", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05NotEqualTo(String value) {
            addCriterion("EG01BJ05 <>", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05GreaterThan(String value) {
            addCriterion("EG01BJ05 >", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ05 >=", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05LessThan(String value) {
            addCriterion("EG01BJ05 <", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ05 <=", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05Like(String value) {
            addCriterion("EG01BJ05 like", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05NotLike(String value) {
            addCriterion("EG01BJ05 not like", value, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05In(List<String> values) {
            addCriterion("EG01BJ05 in", values, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05NotIn(List<String> values) {
            addCriterion("EG01BJ05 not in", values, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05Between(String value1, String value2) {
            addCriterion("EG01BJ05 between", value1, value2, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj05NotBetween(String value1, String value2) {
            addCriterion("EG01BJ05 not between", value1, value2, "eg01bj05");
            return (Criteria) this;
        }

        public Criteria andEg01bj06IsNull() {
            addCriterion("EG01BJ06 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj06IsNotNull() {
            addCriterion("EG01BJ06 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj06EqualTo(String value) {
            addCriterion("EG01BJ06 =", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06NotEqualTo(String value) {
            addCriterion("EG01BJ06 <>", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06GreaterThan(String value) {
            addCriterion("EG01BJ06 >", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ06 >=", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06LessThan(String value) {
            addCriterion("EG01BJ06 <", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ06 <=", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06Like(String value) {
            addCriterion("EG01BJ06 like", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06NotLike(String value) {
            addCriterion("EG01BJ06 not like", value, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06In(List<String> values) {
            addCriterion("EG01BJ06 in", values, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06NotIn(List<String> values) {
            addCriterion("EG01BJ06 not in", values, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06Between(String value1, String value2) {
            addCriterion("EG01BJ06 between", value1, value2, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj06NotBetween(String value1, String value2) {
            addCriterion("EG01BJ06 not between", value1, value2, "eg01bj06");
            return (Criteria) this;
        }

        public Criteria andEg01bj07IsNull() {
            addCriterion("EG01BJ07 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj07IsNotNull() {
            addCriterion("EG01BJ07 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj07EqualTo(String value) {
            addCriterion("EG01BJ07 =", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07NotEqualTo(String value) {
            addCriterion("EG01BJ07 <>", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07GreaterThan(String value) {
            addCriterion("EG01BJ07 >", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ07 >=", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07LessThan(String value) {
            addCriterion("EG01BJ07 <", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ07 <=", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07Like(String value) {
            addCriterion("EG01BJ07 like", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07NotLike(String value) {
            addCriterion("EG01BJ07 not like", value, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07In(List<String> values) {
            addCriterion("EG01BJ07 in", values, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07NotIn(List<String> values) {
            addCriterion("EG01BJ07 not in", values, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07Between(String value1, String value2) {
            addCriterion("EG01BJ07 between", value1, value2, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj07NotBetween(String value1, String value2) {
            addCriterion("EG01BJ07 not between", value1, value2, "eg01bj07");
            return (Criteria) this;
        }

        public Criteria andEg01bj08IsNull() {
            addCriterion("EG01BJ08 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj08IsNotNull() {
            addCriterion("EG01BJ08 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj08EqualTo(String value) {
            addCriterion("EG01BJ08 =", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08NotEqualTo(String value) {
            addCriterion("EG01BJ08 <>", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08GreaterThan(String value) {
            addCriterion("EG01BJ08 >", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ08 >=", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08LessThan(String value) {
            addCriterion("EG01BJ08 <", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ08 <=", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08Like(String value) {
            addCriterion("EG01BJ08 like", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08NotLike(String value) {
            addCriterion("EG01BJ08 not like", value, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08In(List<String> values) {
            addCriterion("EG01BJ08 in", values, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08NotIn(List<String> values) {
            addCriterion("EG01BJ08 not in", values, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08Between(String value1, String value2) {
            addCriterion("EG01BJ08 between", value1, value2, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj08NotBetween(String value1, String value2) {
            addCriterion("EG01BJ08 not between", value1, value2, "eg01bj08");
            return (Criteria) this;
        }

        public Criteria andEg01bj09IsNull() {
            addCriterion("EG01BJ09 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj09IsNotNull() {
            addCriterion("EG01BJ09 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj09EqualTo(String value) {
            addCriterion("EG01BJ09 =", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09NotEqualTo(String value) {
            addCriterion("EG01BJ09 <>", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09GreaterThan(String value) {
            addCriterion("EG01BJ09 >", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ09 >=", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09LessThan(String value) {
            addCriterion("EG01BJ09 <", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ09 <=", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09Like(String value) {
            addCriterion("EG01BJ09 like", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09NotLike(String value) {
            addCriterion("EG01BJ09 not like", value, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09In(List<String> values) {
            addCriterion("EG01BJ09 in", values, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09NotIn(List<String> values) {
            addCriterion("EG01BJ09 not in", values, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09Between(String value1, String value2) {
            addCriterion("EG01BJ09 between", value1, value2, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj09NotBetween(String value1, String value2) {
            addCriterion("EG01BJ09 not between", value1, value2, "eg01bj09");
            return (Criteria) this;
        }

        public Criteria andEg01bj10IsNull() {
            addCriterion("EG01BJ10 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj10IsNotNull() {
            addCriterion("EG01BJ10 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj10EqualTo(String value) {
            addCriterion("EG01BJ10 =", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10NotEqualTo(String value) {
            addCriterion("EG01BJ10 <>", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10GreaterThan(String value) {
            addCriterion("EG01BJ10 >", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ10 >=", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10LessThan(String value) {
            addCriterion("EG01BJ10 <", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ10 <=", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10Like(String value) {
            addCriterion("EG01BJ10 like", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10NotLike(String value) {
            addCriterion("EG01BJ10 not like", value, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10In(List<String> values) {
            addCriterion("EG01BJ10 in", values, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10NotIn(List<String> values) {
            addCriterion("EG01BJ10 not in", values, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10Between(String value1, String value2) {
            addCriterion("EG01BJ10 between", value1, value2, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj10NotBetween(String value1, String value2) {
            addCriterion("EG01BJ10 not between", value1, value2, "eg01bj10");
            return (Criteria) this;
        }

        public Criteria andEg01bj11IsNull() {
            addCriterion("EG01BJ11 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj11IsNotNull() {
            addCriterion("EG01BJ11 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj11EqualTo(String value) {
            addCriterion("EG01BJ11 =", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11NotEqualTo(String value) {
            addCriterion("EG01BJ11 <>", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11GreaterThan(String value) {
            addCriterion("EG01BJ11 >", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ11 >=", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11LessThan(String value) {
            addCriterion("EG01BJ11 <", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ11 <=", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11Like(String value) {
            addCriterion("EG01BJ11 like", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11NotLike(String value) {
            addCriterion("EG01BJ11 not like", value, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11In(List<String> values) {
            addCriterion("EG01BJ11 in", values, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11NotIn(List<String> values) {
            addCriterion("EG01BJ11 not in", values, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11Between(String value1, String value2) {
            addCriterion("EG01BJ11 between", value1, value2, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj11NotBetween(String value1, String value2) {
            addCriterion("EG01BJ11 not between", value1, value2, "eg01bj11");
            return (Criteria) this;
        }

        public Criteria andEg01bj12IsNull() {
            addCriterion("EG01BJ12 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj12IsNotNull() {
            addCriterion("EG01BJ12 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj12EqualTo(String value) {
            addCriterion("EG01BJ12 =", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12NotEqualTo(String value) {
            addCriterion("EG01BJ12 <>", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12GreaterThan(String value) {
            addCriterion("EG01BJ12 >", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ12 >=", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12LessThan(String value) {
            addCriterion("EG01BJ12 <", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ12 <=", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12Like(String value) {
            addCriterion("EG01BJ12 like", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12NotLike(String value) {
            addCriterion("EG01BJ12 not like", value, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12In(List<String> values) {
            addCriterion("EG01BJ12 in", values, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12NotIn(List<String> values) {
            addCriterion("EG01BJ12 not in", values, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12Between(String value1, String value2) {
            addCriterion("EG01BJ12 between", value1, value2, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj12NotBetween(String value1, String value2) {
            addCriterion("EG01BJ12 not between", value1, value2, "eg01bj12");
            return (Criteria) this;
        }

        public Criteria andEg01bj13IsNull() {
            addCriterion("EG01BJ13 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj13IsNotNull() {
            addCriterion("EG01BJ13 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj13EqualTo(String value) {
            addCriterion("EG01BJ13 =", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13NotEqualTo(String value) {
            addCriterion("EG01BJ13 <>", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13GreaterThan(String value) {
            addCriterion("EG01BJ13 >", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ13 >=", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13LessThan(String value) {
            addCriterion("EG01BJ13 <", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ13 <=", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13Like(String value) {
            addCriterion("EG01BJ13 like", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13NotLike(String value) {
            addCriterion("EG01BJ13 not like", value, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13In(List<String> values) {
            addCriterion("EG01BJ13 in", values, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13NotIn(List<String> values) {
            addCriterion("EG01BJ13 not in", values, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13Between(String value1, String value2) {
            addCriterion("EG01BJ13 between", value1, value2, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj13NotBetween(String value1, String value2) {
            addCriterion("EG01BJ13 not between", value1, value2, "eg01bj13");
            return (Criteria) this;
        }

        public Criteria andEg01bj14IsNull() {
            addCriterion("EG01BJ14 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj14IsNotNull() {
            addCriterion("EG01BJ14 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj14EqualTo(String value) {
            addCriterion("EG01BJ14 =", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14NotEqualTo(String value) {
            addCriterion("EG01BJ14 <>", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14GreaterThan(String value) {
            addCriterion("EG01BJ14 >", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ14 >=", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14LessThan(String value) {
            addCriterion("EG01BJ14 <", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ14 <=", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14Like(String value) {
            addCriterion("EG01BJ14 like", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14NotLike(String value) {
            addCriterion("EG01BJ14 not like", value, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14In(List<String> values) {
            addCriterion("EG01BJ14 in", values, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14NotIn(List<String> values) {
            addCriterion("EG01BJ14 not in", values, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14Between(String value1, String value2) {
            addCriterion("EG01BJ14 between", value1, value2, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj14NotBetween(String value1, String value2) {
            addCriterion("EG01BJ14 not between", value1, value2, "eg01bj14");
            return (Criteria) this;
        }

        public Criteria andEg01bj15IsNull() {
            addCriterion("EG01BJ15 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj15IsNotNull() {
            addCriterion("EG01BJ15 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj15EqualTo(String value) {
            addCriterion("EG01BJ15 =", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15NotEqualTo(String value) {
            addCriterion("EG01BJ15 <>", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15GreaterThan(String value) {
            addCriterion("EG01BJ15 >", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ15 >=", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15LessThan(String value) {
            addCriterion("EG01BJ15 <", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ15 <=", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15Like(String value) {
            addCriterion("EG01BJ15 like", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15NotLike(String value) {
            addCriterion("EG01BJ15 not like", value, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15In(List<String> values) {
            addCriterion("EG01BJ15 in", values, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15NotIn(List<String> values) {
            addCriterion("EG01BJ15 not in", values, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15Between(String value1, String value2) {
            addCriterion("EG01BJ15 between", value1, value2, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj15NotBetween(String value1, String value2) {
            addCriterion("EG01BJ15 not between", value1, value2, "eg01bj15");
            return (Criteria) this;
        }

        public Criteria andEg01bj16IsNull() {
            addCriterion("EG01BJ16 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj16IsNotNull() {
            addCriterion("EG01BJ16 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj16EqualTo(String value) {
            addCriterion("EG01BJ16 =", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16NotEqualTo(String value) {
            addCriterion("EG01BJ16 <>", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16GreaterThan(String value) {
            addCriterion("EG01BJ16 >", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ16 >=", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16LessThan(String value) {
            addCriterion("EG01BJ16 <", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ16 <=", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16Like(String value) {
            addCriterion("EG01BJ16 like", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16NotLike(String value) {
            addCriterion("EG01BJ16 not like", value, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16In(List<String> values) {
            addCriterion("EG01BJ16 in", values, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16NotIn(List<String> values) {
            addCriterion("EG01BJ16 not in", values, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16Between(String value1, String value2) {
            addCriterion("EG01BJ16 between", value1, value2, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj16NotBetween(String value1, String value2) {
            addCriterion("EG01BJ16 not between", value1, value2, "eg01bj16");
            return (Criteria) this;
        }

        public Criteria andEg01bj17IsNull() {
            addCriterion("EG01BJ17 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj17IsNotNull() {
            addCriterion("EG01BJ17 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj17EqualTo(String value) {
            addCriterion("EG01BJ17 =", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17NotEqualTo(String value) {
            addCriterion("EG01BJ17 <>", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17GreaterThan(String value) {
            addCriterion("EG01BJ17 >", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ17 >=", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17LessThan(String value) {
            addCriterion("EG01BJ17 <", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ17 <=", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17Like(String value) {
            addCriterion("EG01BJ17 like", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17NotLike(String value) {
            addCriterion("EG01BJ17 not like", value, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17In(List<String> values) {
            addCriterion("EG01BJ17 in", values, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17NotIn(List<String> values) {
            addCriterion("EG01BJ17 not in", values, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17Between(String value1, String value2) {
            addCriterion("EG01BJ17 between", value1, value2, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj17NotBetween(String value1, String value2) {
            addCriterion("EG01BJ17 not between", value1, value2, "eg01bj17");
            return (Criteria) this;
        }

        public Criteria andEg01bj18IsNull() {
            addCriterion("EG01BJ18 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj18IsNotNull() {
            addCriterion("EG01BJ18 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj18EqualTo(String value) {
            addCriterion("EG01BJ18 =", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18NotEqualTo(String value) {
            addCriterion("EG01BJ18 <>", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18GreaterThan(String value) {
            addCriterion("EG01BJ18 >", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ18 >=", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18LessThan(String value) {
            addCriterion("EG01BJ18 <", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ18 <=", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18Like(String value) {
            addCriterion("EG01BJ18 like", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18NotLike(String value) {
            addCriterion("EG01BJ18 not like", value, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18In(List<String> values) {
            addCriterion("EG01BJ18 in", values, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18NotIn(List<String> values) {
            addCriterion("EG01BJ18 not in", values, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18Between(String value1, String value2) {
            addCriterion("EG01BJ18 between", value1, value2, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj18NotBetween(String value1, String value2) {
            addCriterion("EG01BJ18 not between", value1, value2, "eg01bj18");
            return (Criteria) this;
        }

        public Criteria andEg01bj19IsNull() {
            addCriterion("EG01BJ19 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj19IsNotNull() {
            addCriterion("EG01BJ19 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj19EqualTo(String value) {
            addCriterion("EG01BJ19 =", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19NotEqualTo(String value) {
            addCriterion("EG01BJ19 <>", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19GreaterThan(String value) {
            addCriterion("EG01BJ19 >", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ19 >=", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19LessThan(String value) {
            addCriterion("EG01BJ19 <", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ19 <=", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19Like(String value) {
            addCriterion("EG01BJ19 like", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19NotLike(String value) {
            addCriterion("EG01BJ19 not like", value, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19In(List<String> values) {
            addCriterion("EG01BJ19 in", values, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19NotIn(List<String> values) {
            addCriterion("EG01BJ19 not in", values, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19Between(String value1, String value2) {
            addCriterion("EG01BJ19 between", value1, value2, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj19NotBetween(String value1, String value2) {
            addCriterion("EG01BJ19 not between", value1, value2, "eg01bj19");
            return (Criteria) this;
        }

        public Criteria andEg01bj20IsNull() {
            addCriterion("EG01BJ20 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj20IsNotNull() {
            addCriterion("EG01BJ20 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj20EqualTo(String value) {
            addCriterion("EG01BJ20 =", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20NotEqualTo(String value) {
            addCriterion("EG01BJ20 <>", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20GreaterThan(String value) {
            addCriterion("EG01BJ20 >", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ20 >=", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20LessThan(String value) {
            addCriterion("EG01BJ20 <", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ20 <=", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20Like(String value) {
            addCriterion("EG01BJ20 like", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20NotLike(String value) {
            addCriterion("EG01BJ20 not like", value, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20In(List<String> values) {
            addCriterion("EG01BJ20 in", values, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20NotIn(List<String> values) {
            addCriterion("EG01BJ20 not in", values, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20Between(String value1, String value2) {
            addCriterion("EG01BJ20 between", value1, value2, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj20NotBetween(String value1, String value2) {
            addCriterion("EG01BJ20 not between", value1, value2, "eg01bj20");
            return (Criteria) this;
        }

        public Criteria andEg01bj21IsNull() {
            addCriterion("EG01BJ21 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj21IsNotNull() {
            addCriterion("EG01BJ21 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj21EqualTo(String value) {
            addCriterion("EG01BJ21 =", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21NotEqualTo(String value) {
            addCriterion("EG01BJ21 <>", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21GreaterThan(String value) {
            addCriterion("EG01BJ21 >", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ21 >=", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21LessThan(String value) {
            addCriterion("EG01BJ21 <", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ21 <=", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21Like(String value) {
            addCriterion("EG01BJ21 like", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21NotLike(String value) {
            addCriterion("EG01BJ21 not like", value, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21In(List<String> values) {
            addCriterion("EG01BJ21 in", values, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21NotIn(List<String> values) {
            addCriterion("EG01BJ21 not in", values, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21Between(String value1, String value2) {
            addCriterion("EG01BJ21 between", value1, value2, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj21NotBetween(String value1, String value2) {
            addCriterion("EG01BJ21 not between", value1, value2, "eg01bj21");
            return (Criteria) this;
        }

        public Criteria andEg01bj22IsNull() {
            addCriterion("EG01BJ22 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj22IsNotNull() {
            addCriterion("EG01BJ22 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj22EqualTo(String value) {
            addCriterion("EG01BJ22 =", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22NotEqualTo(String value) {
            addCriterion("EG01BJ22 <>", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22GreaterThan(String value) {
            addCriterion("EG01BJ22 >", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ22 >=", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22LessThan(String value) {
            addCriterion("EG01BJ22 <", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ22 <=", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22Like(String value) {
            addCriterion("EG01BJ22 like", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22NotLike(String value) {
            addCriterion("EG01BJ22 not like", value, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22In(List<String> values) {
            addCriterion("EG01BJ22 in", values, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22NotIn(List<String> values) {
            addCriterion("EG01BJ22 not in", values, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22Between(String value1, String value2) {
            addCriterion("EG01BJ22 between", value1, value2, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj22NotBetween(String value1, String value2) {
            addCriterion("EG01BJ22 not between", value1, value2, "eg01bj22");
            return (Criteria) this;
        }

        public Criteria andEg01bj23IsNull() {
            addCriterion("EG01BJ23 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj23IsNotNull() {
            addCriterion("EG01BJ23 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj23EqualTo(String value) {
            addCriterion("EG01BJ23 =", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23NotEqualTo(String value) {
            addCriterion("EG01BJ23 <>", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23GreaterThan(String value) {
            addCriterion("EG01BJ23 >", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ23 >=", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23LessThan(String value) {
            addCriterion("EG01BJ23 <", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ23 <=", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23Like(String value) {
            addCriterion("EG01BJ23 like", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23NotLike(String value) {
            addCriterion("EG01BJ23 not like", value, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23In(List<String> values) {
            addCriterion("EG01BJ23 in", values, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23NotIn(List<String> values) {
            addCriterion("EG01BJ23 not in", values, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23Between(String value1, String value2) {
            addCriterion("EG01BJ23 between", value1, value2, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj23NotBetween(String value1, String value2) {
            addCriterion("EG01BJ23 not between", value1, value2, "eg01bj23");
            return (Criteria) this;
        }

        public Criteria andEg01bj24IsNull() {
            addCriterion("EG01BJ24 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj24IsNotNull() {
            addCriterion("EG01BJ24 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj24EqualTo(String value) {
            addCriterion("EG01BJ24 =", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24NotEqualTo(String value) {
            addCriterion("EG01BJ24 <>", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24GreaterThan(String value) {
            addCriterion("EG01BJ24 >", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ24 >=", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24LessThan(String value) {
            addCriterion("EG01BJ24 <", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ24 <=", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24Like(String value) {
            addCriterion("EG01BJ24 like", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24NotLike(String value) {
            addCriterion("EG01BJ24 not like", value, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24In(List<String> values) {
            addCriterion("EG01BJ24 in", values, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24NotIn(List<String> values) {
            addCriterion("EG01BJ24 not in", values, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24Between(String value1, String value2) {
            addCriterion("EG01BJ24 between", value1, value2, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj24NotBetween(String value1, String value2) {
            addCriterion("EG01BJ24 not between", value1, value2, "eg01bj24");
            return (Criteria) this;
        }

        public Criteria andEg01bj25IsNull() {
            addCriterion("EG01BJ25 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj25IsNotNull() {
            addCriterion("EG01BJ25 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj25EqualTo(String value) {
            addCriterion("EG01BJ25 =", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25NotEqualTo(String value) {
            addCriterion("EG01BJ25 <>", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25GreaterThan(String value) {
            addCriterion("EG01BJ25 >", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ25 >=", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25LessThan(String value) {
            addCriterion("EG01BJ25 <", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ25 <=", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25Like(String value) {
            addCriterion("EG01BJ25 like", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25NotLike(String value) {
            addCriterion("EG01BJ25 not like", value, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25In(List<String> values) {
            addCriterion("EG01BJ25 in", values, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25NotIn(List<String> values) {
            addCriterion("EG01BJ25 not in", values, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25Between(String value1, String value2) {
            addCriterion("EG01BJ25 between", value1, value2, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj25NotBetween(String value1, String value2) {
            addCriterion("EG01BJ25 not between", value1, value2, "eg01bj25");
            return (Criteria) this;
        }

        public Criteria andEg01bj26IsNull() {
            addCriterion("EG01BJ26 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj26IsNotNull() {
            addCriterion("EG01BJ26 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj26EqualTo(String value) {
            addCriterion("EG01BJ26 =", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26NotEqualTo(String value) {
            addCriterion("EG01BJ26 <>", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26GreaterThan(String value) {
            addCriterion("EG01BJ26 >", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ26 >=", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26LessThan(String value) {
            addCriterion("EG01BJ26 <", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ26 <=", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26Like(String value) {
            addCriterion("EG01BJ26 like", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26NotLike(String value) {
            addCriterion("EG01BJ26 not like", value, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26In(List<String> values) {
            addCriterion("EG01BJ26 in", values, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26NotIn(List<String> values) {
            addCriterion("EG01BJ26 not in", values, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26Between(String value1, String value2) {
            addCriterion("EG01BJ26 between", value1, value2, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj26NotBetween(String value1, String value2) {
            addCriterion("EG01BJ26 not between", value1, value2, "eg01bj26");
            return (Criteria) this;
        }

        public Criteria andEg01bj27IsNull() {
            addCriterion("EG01BJ27 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj27IsNotNull() {
            addCriterion("EG01BJ27 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj27EqualTo(String value) {
            addCriterion("EG01BJ27 =", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27NotEqualTo(String value) {
            addCriterion("EG01BJ27 <>", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27GreaterThan(String value) {
            addCriterion("EG01BJ27 >", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ27 >=", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27LessThan(String value) {
            addCriterion("EG01BJ27 <", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ27 <=", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27Like(String value) {
            addCriterion("EG01BJ27 like", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27NotLike(String value) {
            addCriterion("EG01BJ27 not like", value, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27In(List<String> values) {
            addCriterion("EG01BJ27 in", values, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27NotIn(List<String> values) {
            addCriterion("EG01BJ27 not in", values, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27Between(String value1, String value2) {
            addCriterion("EG01BJ27 between", value1, value2, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj27NotBetween(String value1, String value2) {
            addCriterion("EG01BJ27 not between", value1, value2, "eg01bj27");
            return (Criteria) this;
        }

        public Criteria andEg01bj28IsNull() {
            addCriterion("EG01BJ28 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj28IsNotNull() {
            addCriterion("EG01BJ28 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj28EqualTo(String value) {
            addCriterion("EG01BJ28 =", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28NotEqualTo(String value) {
            addCriterion("EG01BJ28 <>", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28GreaterThan(String value) {
            addCriterion("EG01BJ28 >", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ28 >=", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28LessThan(String value) {
            addCriterion("EG01BJ28 <", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ28 <=", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28Like(String value) {
            addCriterion("EG01BJ28 like", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28NotLike(String value) {
            addCriterion("EG01BJ28 not like", value, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28In(List<String> values) {
            addCriterion("EG01BJ28 in", values, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28NotIn(List<String> values) {
            addCriterion("EG01BJ28 not in", values, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28Between(String value1, String value2) {
            addCriterion("EG01BJ28 between", value1, value2, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj28NotBetween(String value1, String value2) {
            addCriterion("EG01BJ28 not between", value1, value2, "eg01bj28");
            return (Criteria) this;
        }

        public Criteria andEg01bj29IsNull() {
            addCriterion("EG01BJ29 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj29IsNotNull() {
            addCriterion("EG01BJ29 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj29EqualTo(String value) {
            addCriterion("EG01BJ29 =", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29NotEqualTo(String value) {
            addCriterion("EG01BJ29 <>", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29GreaterThan(String value) {
            addCriterion("EG01BJ29 >", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ29 >=", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29LessThan(String value) {
            addCriterion("EG01BJ29 <", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ29 <=", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29Like(String value) {
            addCriterion("EG01BJ29 like", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29NotLike(String value) {
            addCriterion("EG01BJ29 not like", value, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29In(List<String> values) {
            addCriterion("EG01BJ29 in", values, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29NotIn(List<String> values) {
            addCriterion("EG01BJ29 not in", values, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29Between(String value1, String value2) {
            addCriterion("EG01BJ29 between", value1, value2, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj29NotBetween(String value1, String value2) {
            addCriterion("EG01BJ29 not between", value1, value2, "eg01bj29");
            return (Criteria) this;
        }

        public Criteria andEg01bj30IsNull() {
            addCriterion("EG01BJ30 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj30IsNotNull() {
            addCriterion("EG01BJ30 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj30EqualTo(String value) {
            addCriterion("EG01BJ30 =", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30NotEqualTo(String value) {
            addCriterion("EG01BJ30 <>", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30GreaterThan(String value) {
            addCriterion("EG01BJ30 >", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ30 >=", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30LessThan(String value) {
            addCriterion("EG01BJ30 <", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ30 <=", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30Like(String value) {
            addCriterion("EG01BJ30 like", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30NotLike(String value) {
            addCriterion("EG01BJ30 not like", value, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30In(List<String> values) {
            addCriterion("EG01BJ30 in", values, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30NotIn(List<String> values) {
            addCriterion("EG01BJ30 not in", values, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30Between(String value1, String value2) {
            addCriterion("EG01BJ30 between", value1, value2, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj30NotBetween(String value1, String value2) {
            addCriterion("EG01BJ30 not between", value1, value2, "eg01bj30");
            return (Criteria) this;
        }

        public Criteria andEg01bj31IsNull() {
            addCriterion("EG01BJ31 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj31IsNotNull() {
            addCriterion("EG01BJ31 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj31EqualTo(String value) {
            addCriterion("EG01BJ31 =", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31NotEqualTo(String value) {
            addCriterion("EG01BJ31 <>", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31GreaterThan(String value) {
            addCriterion("EG01BJ31 >", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ31 >=", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31LessThan(String value) {
            addCriterion("EG01BJ31 <", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ31 <=", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31Like(String value) {
            addCriterion("EG01BJ31 like", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31NotLike(String value) {
            addCriterion("EG01BJ31 not like", value, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31In(List<String> values) {
            addCriterion("EG01BJ31 in", values, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31NotIn(List<String> values) {
            addCriterion("EG01BJ31 not in", values, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31Between(String value1, String value2) {
            addCriterion("EG01BJ31 between", value1, value2, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj31NotBetween(String value1, String value2) {
            addCriterion("EG01BJ31 not between", value1, value2, "eg01bj31");
            return (Criteria) this;
        }

        public Criteria andEg01bj32IsNull() {
            addCriterion("EG01BJ32 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj32IsNotNull() {
            addCriterion("EG01BJ32 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj32EqualTo(String value) {
            addCriterion("EG01BJ32 =", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32NotEqualTo(String value) {
            addCriterion("EG01BJ32 <>", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32GreaterThan(String value) {
            addCriterion("EG01BJ32 >", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ32 >=", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32LessThan(String value) {
            addCriterion("EG01BJ32 <", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ32 <=", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32Like(String value) {
            addCriterion("EG01BJ32 like", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32NotLike(String value) {
            addCriterion("EG01BJ32 not like", value, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32In(List<String> values) {
            addCriterion("EG01BJ32 in", values, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32NotIn(List<String> values) {
            addCriterion("EG01BJ32 not in", values, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32Between(String value1, String value2) {
            addCriterion("EG01BJ32 between", value1, value2, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj32NotBetween(String value1, String value2) {
            addCriterion("EG01BJ32 not between", value1, value2, "eg01bj32");
            return (Criteria) this;
        }

        public Criteria andEg01bj33IsNull() {
            addCriterion("EG01BJ33 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj33IsNotNull() {
            addCriterion("EG01BJ33 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj33EqualTo(String value) {
            addCriterion("EG01BJ33 =", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33NotEqualTo(String value) {
            addCriterion("EG01BJ33 <>", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33GreaterThan(String value) {
            addCriterion("EG01BJ33 >", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ33 >=", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33LessThan(String value) {
            addCriterion("EG01BJ33 <", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ33 <=", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33Like(String value) {
            addCriterion("EG01BJ33 like", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33NotLike(String value) {
            addCriterion("EG01BJ33 not like", value, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33In(List<String> values) {
            addCriterion("EG01BJ33 in", values, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33NotIn(List<String> values) {
            addCriterion("EG01BJ33 not in", values, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33Between(String value1, String value2) {
            addCriterion("EG01BJ33 between", value1, value2, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj33NotBetween(String value1, String value2) {
            addCriterion("EG01BJ33 not between", value1, value2, "eg01bj33");
            return (Criteria) this;
        }

        public Criteria andEg01bj34IsNull() {
            addCriterion("EG01BJ34 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj34IsNotNull() {
            addCriterion("EG01BJ34 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj34EqualTo(String value) {
            addCriterion("EG01BJ34 =", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34NotEqualTo(String value) {
            addCriterion("EG01BJ34 <>", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34GreaterThan(String value) {
            addCriterion("EG01BJ34 >", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ34 >=", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34LessThan(String value) {
            addCriterion("EG01BJ34 <", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ34 <=", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34Like(String value) {
            addCriterion("EG01BJ34 like", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34NotLike(String value) {
            addCriterion("EG01BJ34 not like", value, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34In(List<String> values) {
            addCriterion("EG01BJ34 in", values, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34NotIn(List<String> values) {
            addCriterion("EG01BJ34 not in", values, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34Between(String value1, String value2) {
            addCriterion("EG01BJ34 between", value1, value2, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj34NotBetween(String value1, String value2) {
            addCriterion("EG01BJ34 not between", value1, value2, "eg01bj34");
            return (Criteria) this;
        }

        public Criteria andEg01bj35IsNull() {
            addCriterion("EG01BJ35 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj35IsNotNull() {
            addCriterion("EG01BJ35 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj35EqualTo(String value) {
            addCriterion("EG01BJ35 =", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35NotEqualTo(String value) {
            addCriterion("EG01BJ35 <>", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35GreaterThan(String value) {
            addCriterion("EG01BJ35 >", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ35 >=", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35LessThan(String value) {
            addCriterion("EG01BJ35 <", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ35 <=", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35Like(String value) {
            addCriterion("EG01BJ35 like", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35NotLike(String value) {
            addCriterion("EG01BJ35 not like", value, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35In(List<String> values) {
            addCriterion("EG01BJ35 in", values, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35NotIn(List<String> values) {
            addCriterion("EG01BJ35 not in", values, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35Between(String value1, String value2) {
            addCriterion("EG01BJ35 between", value1, value2, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj35NotBetween(String value1, String value2) {
            addCriterion("EG01BJ35 not between", value1, value2, "eg01bj35");
            return (Criteria) this;
        }

        public Criteria andEg01bj36IsNull() {
            addCriterion("EG01BJ36 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj36IsNotNull() {
            addCriterion("EG01BJ36 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj36EqualTo(String value) {
            addCriterion("EG01BJ36 =", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36NotEqualTo(String value) {
            addCriterion("EG01BJ36 <>", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36GreaterThan(String value) {
            addCriterion("EG01BJ36 >", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ36 >=", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36LessThan(String value) {
            addCriterion("EG01BJ36 <", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ36 <=", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36Like(String value) {
            addCriterion("EG01BJ36 like", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36NotLike(String value) {
            addCriterion("EG01BJ36 not like", value, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36In(List<String> values) {
            addCriterion("EG01BJ36 in", values, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36NotIn(List<String> values) {
            addCriterion("EG01BJ36 not in", values, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36Between(String value1, String value2) {
            addCriterion("EG01BJ36 between", value1, value2, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj36NotBetween(String value1, String value2) {
            addCriterion("EG01BJ36 not between", value1, value2, "eg01bj36");
            return (Criteria) this;
        }

        public Criteria andEg01bj37IsNull() {
            addCriterion("EG01BJ37 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj37IsNotNull() {
            addCriterion("EG01BJ37 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj37EqualTo(String value) {
            addCriterion("EG01BJ37 =", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37NotEqualTo(String value) {
            addCriterion("EG01BJ37 <>", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37GreaterThan(String value) {
            addCriterion("EG01BJ37 >", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ37 >=", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37LessThan(String value) {
            addCriterion("EG01BJ37 <", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ37 <=", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37Like(String value) {
            addCriterion("EG01BJ37 like", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37NotLike(String value) {
            addCriterion("EG01BJ37 not like", value, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37In(List<String> values) {
            addCriterion("EG01BJ37 in", values, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37NotIn(List<String> values) {
            addCriterion("EG01BJ37 not in", values, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37Between(String value1, String value2) {
            addCriterion("EG01BJ37 between", value1, value2, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj37NotBetween(String value1, String value2) {
            addCriterion("EG01BJ37 not between", value1, value2, "eg01bj37");
            return (Criteria) this;
        }

        public Criteria andEg01bj38IsNull() {
            addCriterion("EG01BJ38 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj38IsNotNull() {
            addCriterion("EG01BJ38 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj38EqualTo(String value) {
            addCriterion("EG01BJ38 =", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38NotEqualTo(String value) {
            addCriterion("EG01BJ38 <>", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38GreaterThan(String value) {
            addCriterion("EG01BJ38 >", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ38 >=", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38LessThan(String value) {
            addCriterion("EG01BJ38 <", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ38 <=", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38Like(String value) {
            addCriterion("EG01BJ38 like", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38NotLike(String value) {
            addCriterion("EG01BJ38 not like", value, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38In(List<String> values) {
            addCriterion("EG01BJ38 in", values, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38NotIn(List<String> values) {
            addCriterion("EG01BJ38 not in", values, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38Between(String value1, String value2) {
            addCriterion("EG01BJ38 between", value1, value2, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj38NotBetween(String value1, String value2) {
            addCriterion("EG01BJ38 not between", value1, value2, "eg01bj38");
            return (Criteria) this;
        }

        public Criteria andEg01bj39IsNull() {
            addCriterion("EG01BJ39 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj39IsNotNull() {
            addCriterion("EG01BJ39 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj39EqualTo(String value) {
            addCriterion("EG01BJ39 =", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39NotEqualTo(String value) {
            addCriterion("EG01BJ39 <>", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39GreaterThan(String value) {
            addCriterion("EG01BJ39 >", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ39 >=", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39LessThan(String value) {
            addCriterion("EG01BJ39 <", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ39 <=", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39Like(String value) {
            addCriterion("EG01BJ39 like", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39NotLike(String value) {
            addCriterion("EG01BJ39 not like", value, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39In(List<String> values) {
            addCriterion("EG01BJ39 in", values, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39NotIn(List<String> values) {
            addCriterion("EG01BJ39 not in", values, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39Between(String value1, String value2) {
            addCriterion("EG01BJ39 between", value1, value2, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj39NotBetween(String value1, String value2) {
            addCriterion("EG01BJ39 not between", value1, value2, "eg01bj39");
            return (Criteria) this;
        }

        public Criteria andEg01bj40IsNull() {
            addCriterion("EG01BJ40 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj40IsNotNull() {
            addCriterion("EG01BJ40 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj40EqualTo(String value) {
            addCriterion("EG01BJ40 =", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40NotEqualTo(String value) {
            addCriterion("EG01BJ40 <>", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40GreaterThan(String value) {
            addCriterion("EG01BJ40 >", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ40 >=", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40LessThan(String value) {
            addCriterion("EG01BJ40 <", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ40 <=", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40Like(String value) {
            addCriterion("EG01BJ40 like", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40NotLike(String value) {
            addCriterion("EG01BJ40 not like", value, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40In(List<String> values) {
            addCriterion("EG01BJ40 in", values, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40NotIn(List<String> values) {
            addCriterion("EG01BJ40 not in", values, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40Between(String value1, String value2) {
            addCriterion("EG01BJ40 between", value1, value2, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj40NotBetween(String value1, String value2) {
            addCriterion("EG01BJ40 not between", value1, value2, "eg01bj40");
            return (Criteria) this;
        }

        public Criteria andEg01bj41IsNull() {
            addCriterion("EG01BJ41 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj41IsNotNull() {
            addCriterion("EG01BJ41 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj41EqualTo(String value) {
            addCriterion("EG01BJ41 =", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41NotEqualTo(String value) {
            addCriterion("EG01BJ41 <>", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41GreaterThan(String value) {
            addCriterion("EG01BJ41 >", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ41 >=", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41LessThan(String value) {
            addCriterion("EG01BJ41 <", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ41 <=", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41Like(String value) {
            addCriterion("EG01BJ41 like", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41NotLike(String value) {
            addCriterion("EG01BJ41 not like", value, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41In(List<String> values) {
            addCriterion("EG01BJ41 in", values, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41NotIn(List<String> values) {
            addCriterion("EG01BJ41 not in", values, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41Between(String value1, String value2) {
            addCriterion("EG01BJ41 between", value1, value2, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj41NotBetween(String value1, String value2) {
            addCriterion("EG01BJ41 not between", value1, value2, "eg01bj41");
            return (Criteria) this;
        }

        public Criteria andEg01bj42IsNull() {
            addCriterion("EG01BJ42 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj42IsNotNull() {
            addCriterion("EG01BJ42 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj42EqualTo(String value) {
            addCriterion("EG01BJ42 =", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42NotEqualTo(String value) {
            addCriterion("EG01BJ42 <>", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42GreaterThan(String value) {
            addCriterion("EG01BJ42 >", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ42 >=", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42LessThan(String value) {
            addCriterion("EG01BJ42 <", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ42 <=", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42Like(String value) {
            addCriterion("EG01BJ42 like", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42NotLike(String value) {
            addCriterion("EG01BJ42 not like", value, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42In(List<String> values) {
            addCriterion("EG01BJ42 in", values, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42NotIn(List<String> values) {
            addCriterion("EG01BJ42 not in", values, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42Between(String value1, String value2) {
            addCriterion("EG01BJ42 between", value1, value2, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj42NotBetween(String value1, String value2) {
            addCriterion("EG01BJ42 not between", value1, value2, "eg01bj42");
            return (Criteria) this;
        }

        public Criteria andEg01bj43IsNull() {
            addCriterion("EG01BJ43 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj43IsNotNull() {
            addCriterion("EG01BJ43 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj43EqualTo(String value) {
            addCriterion("EG01BJ43 =", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43NotEqualTo(String value) {
            addCriterion("EG01BJ43 <>", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43GreaterThan(String value) {
            addCriterion("EG01BJ43 >", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ43 >=", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43LessThan(String value) {
            addCriterion("EG01BJ43 <", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ43 <=", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43Like(String value) {
            addCriterion("EG01BJ43 like", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43NotLike(String value) {
            addCriterion("EG01BJ43 not like", value, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43In(List<String> values) {
            addCriterion("EG01BJ43 in", values, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43NotIn(List<String> values) {
            addCriterion("EG01BJ43 not in", values, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43Between(String value1, String value2) {
            addCriterion("EG01BJ43 between", value1, value2, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj43NotBetween(String value1, String value2) {
            addCriterion("EG01BJ43 not between", value1, value2, "eg01bj43");
            return (Criteria) this;
        }

        public Criteria andEg01bj44IsNull() {
            addCriterion("EG01BJ44 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj44IsNotNull() {
            addCriterion("EG01BJ44 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj44EqualTo(String value) {
            addCriterion("EG01BJ44 =", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44NotEqualTo(String value) {
            addCriterion("EG01BJ44 <>", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44GreaterThan(String value) {
            addCriterion("EG01BJ44 >", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ44 >=", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44LessThan(String value) {
            addCriterion("EG01BJ44 <", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ44 <=", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44Like(String value) {
            addCriterion("EG01BJ44 like", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44NotLike(String value) {
            addCriterion("EG01BJ44 not like", value, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44In(List<String> values) {
            addCriterion("EG01BJ44 in", values, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44NotIn(List<String> values) {
            addCriterion("EG01BJ44 not in", values, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44Between(String value1, String value2) {
            addCriterion("EG01BJ44 between", value1, value2, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj44NotBetween(String value1, String value2) {
            addCriterion("EG01BJ44 not between", value1, value2, "eg01bj44");
            return (Criteria) this;
        }

        public Criteria andEg01bj45IsNull() {
            addCriterion("EG01BJ45 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj45IsNotNull() {
            addCriterion("EG01BJ45 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj45EqualTo(String value) {
            addCriterion("EG01BJ45 =", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45NotEqualTo(String value) {
            addCriterion("EG01BJ45 <>", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45GreaterThan(String value) {
            addCriterion("EG01BJ45 >", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ45 >=", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45LessThan(String value) {
            addCriterion("EG01BJ45 <", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ45 <=", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45Like(String value) {
            addCriterion("EG01BJ45 like", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45NotLike(String value) {
            addCriterion("EG01BJ45 not like", value, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45In(List<String> values) {
            addCriterion("EG01BJ45 in", values, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45NotIn(List<String> values) {
            addCriterion("EG01BJ45 not in", values, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45Between(String value1, String value2) {
            addCriterion("EG01BJ45 between", value1, value2, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj45NotBetween(String value1, String value2) {
            addCriterion("EG01BJ45 not between", value1, value2, "eg01bj45");
            return (Criteria) this;
        }

        public Criteria andEg01bj46IsNull() {
            addCriterion("EG01BJ46 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj46IsNotNull() {
            addCriterion("EG01BJ46 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj46EqualTo(String value) {
            addCriterion("EG01BJ46 =", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46NotEqualTo(String value) {
            addCriterion("EG01BJ46 <>", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46GreaterThan(String value) {
            addCriterion("EG01BJ46 >", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ46 >=", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46LessThan(String value) {
            addCriterion("EG01BJ46 <", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ46 <=", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46Like(String value) {
            addCriterion("EG01BJ46 like", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46NotLike(String value) {
            addCriterion("EG01BJ46 not like", value, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46In(List<String> values) {
            addCriterion("EG01BJ46 in", values, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46NotIn(List<String> values) {
            addCriterion("EG01BJ46 not in", values, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46Between(String value1, String value2) {
            addCriterion("EG01BJ46 between", value1, value2, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj46NotBetween(String value1, String value2) {
            addCriterion("EG01BJ46 not between", value1, value2, "eg01bj46");
            return (Criteria) this;
        }

        public Criteria andEg01bj47IsNull() {
            addCriterion("EG01BJ47 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj47IsNotNull() {
            addCriterion("EG01BJ47 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj47EqualTo(String value) {
            addCriterion("EG01BJ47 =", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47NotEqualTo(String value) {
            addCriterion("EG01BJ47 <>", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47GreaterThan(String value) {
            addCriterion("EG01BJ47 >", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ47 >=", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47LessThan(String value) {
            addCriterion("EG01BJ47 <", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ47 <=", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47Like(String value) {
            addCriterion("EG01BJ47 like", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47NotLike(String value) {
            addCriterion("EG01BJ47 not like", value, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47In(List<String> values) {
            addCriterion("EG01BJ47 in", values, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47NotIn(List<String> values) {
            addCriterion("EG01BJ47 not in", values, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47Between(String value1, String value2) {
            addCriterion("EG01BJ47 between", value1, value2, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj47NotBetween(String value1, String value2) {
            addCriterion("EG01BJ47 not between", value1, value2, "eg01bj47");
            return (Criteria) this;
        }

        public Criteria andEg01bj48IsNull() {
            addCriterion("EG01BJ48 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj48IsNotNull() {
            addCriterion("EG01BJ48 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj48EqualTo(String value) {
            addCriterion("EG01BJ48 =", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48NotEqualTo(String value) {
            addCriterion("EG01BJ48 <>", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48GreaterThan(String value) {
            addCriterion("EG01BJ48 >", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ48 >=", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48LessThan(String value) {
            addCriterion("EG01BJ48 <", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ48 <=", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48Like(String value) {
            addCriterion("EG01BJ48 like", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48NotLike(String value) {
            addCriterion("EG01BJ48 not like", value, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48In(List<String> values) {
            addCriterion("EG01BJ48 in", values, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48NotIn(List<String> values) {
            addCriterion("EG01BJ48 not in", values, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48Between(String value1, String value2) {
            addCriterion("EG01BJ48 between", value1, value2, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj48NotBetween(String value1, String value2) {
            addCriterion("EG01BJ48 not between", value1, value2, "eg01bj48");
            return (Criteria) this;
        }

        public Criteria andEg01bj49IsNull() {
            addCriterion("EG01BJ49 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj49IsNotNull() {
            addCriterion("EG01BJ49 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj49EqualTo(String value) {
            addCriterion("EG01BJ49 =", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49NotEqualTo(String value) {
            addCriterion("EG01BJ49 <>", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49GreaterThan(String value) {
            addCriterion("EG01BJ49 >", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ49 >=", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49LessThan(String value) {
            addCriterion("EG01BJ49 <", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ49 <=", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49Like(String value) {
            addCriterion("EG01BJ49 like", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49NotLike(String value) {
            addCriterion("EG01BJ49 not like", value, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49In(List<String> values) {
            addCriterion("EG01BJ49 in", values, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49NotIn(List<String> values) {
            addCriterion("EG01BJ49 not in", values, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49Between(String value1, String value2) {
            addCriterion("EG01BJ49 between", value1, value2, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj49NotBetween(String value1, String value2) {
            addCriterion("EG01BJ49 not between", value1, value2, "eg01bj49");
            return (Criteria) this;
        }

        public Criteria andEg01bj50IsNull() {
            addCriterion("EG01BJ50 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj50IsNotNull() {
            addCriterion("EG01BJ50 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj50EqualTo(String value) {
            addCriterion("EG01BJ50 =", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50NotEqualTo(String value) {
            addCriterion("EG01BJ50 <>", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50GreaterThan(String value) {
            addCriterion("EG01BJ50 >", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ50 >=", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50LessThan(String value) {
            addCriterion("EG01BJ50 <", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ50 <=", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50Like(String value) {
            addCriterion("EG01BJ50 like", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50NotLike(String value) {
            addCriterion("EG01BJ50 not like", value, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50In(List<String> values) {
            addCriterion("EG01BJ50 in", values, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50NotIn(List<String> values) {
            addCriterion("EG01BJ50 not in", values, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50Between(String value1, String value2) {
            addCriterion("EG01BJ50 between", value1, value2, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj50NotBetween(String value1, String value2) {
            addCriterion("EG01BJ50 not between", value1, value2, "eg01bj50");
            return (Criteria) this;
        }

        public Criteria andEg01bj51IsNull() {
            addCriterion("EG01BJ51 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj51IsNotNull() {
            addCriterion("EG01BJ51 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj51EqualTo(String value) {
            addCriterion("EG01BJ51 =", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51NotEqualTo(String value) {
            addCriterion("EG01BJ51 <>", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51GreaterThan(String value) {
            addCriterion("EG01BJ51 >", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ51 >=", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51LessThan(String value) {
            addCriterion("EG01BJ51 <", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ51 <=", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51Like(String value) {
            addCriterion("EG01BJ51 like", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51NotLike(String value) {
            addCriterion("EG01BJ51 not like", value, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51In(List<String> values) {
            addCriterion("EG01BJ51 in", values, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51NotIn(List<String> values) {
            addCriterion("EG01BJ51 not in", values, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51Between(String value1, String value2) {
            addCriterion("EG01BJ51 between", value1, value2, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj51NotBetween(String value1, String value2) {
            addCriterion("EG01BJ51 not between", value1, value2, "eg01bj51");
            return (Criteria) this;
        }

        public Criteria andEg01bj52IsNull() {
            addCriterion("EG01BJ52 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj52IsNotNull() {
            addCriterion("EG01BJ52 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj52EqualTo(String value) {
            addCriterion("EG01BJ52 =", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52NotEqualTo(String value) {
            addCriterion("EG01BJ52 <>", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52GreaterThan(String value) {
            addCriterion("EG01BJ52 >", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ52 >=", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52LessThan(String value) {
            addCriterion("EG01BJ52 <", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ52 <=", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52Like(String value) {
            addCriterion("EG01BJ52 like", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52NotLike(String value) {
            addCriterion("EG01BJ52 not like", value, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52In(List<String> values) {
            addCriterion("EG01BJ52 in", values, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52NotIn(List<String> values) {
            addCriterion("EG01BJ52 not in", values, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52Between(String value1, String value2) {
            addCriterion("EG01BJ52 between", value1, value2, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj52NotBetween(String value1, String value2) {
            addCriterion("EG01BJ52 not between", value1, value2, "eg01bj52");
            return (Criteria) this;
        }

        public Criteria andEg01bj53IsNull() {
            addCriterion("EG01BJ53 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj53IsNotNull() {
            addCriterion("EG01BJ53 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj53EqualTo(String value) {
            addCriterion("EG01BJ53 =", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53NotEqualTo(String value) {
            addCriterion("EG01BJ53 <>", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53GreaterThan(String value) {
            addCriterion("EG01BJ53 >", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ53 >=", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53LessThan(String value) {
            addCriterion("EG01BJ53 <", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ53 <=", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53Like(String value) {
            addCriterion("EG01BJ53 like", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53NotLike(String value) {
            addCriterion("EG01BJ53 not like", value, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53In(List<String> values) {
            addCriterion("EG01BJ53 in", values, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53NotIn(List<String> values) {
            addCriterion("EG01BJ53 not in", values, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53Between(String value1, String value2) {
            addCriterion("EG01BJ53 between", value1, value2, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj53NotBetween(String value1, String value2) {
            addCriterion("EG01BJ53 not between", value1, value2, "eg01bj53");
            return (Criteria) this;
        }

        public Criteria andEg01bj54IsNull() {
            addCriterion("EG01BJ54 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj54IsNotNull() {
            addCriterion("EG01BJ54 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj54EqualTo(String value) {
            addCriterion("EG01BJ54 =", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54NotEqualTo(String value) {
            addCriterion("EG01BJ54 <>", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54GreaterThan(String value) {
            addCriterion("EG01BJ54 >", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ54 >=", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54LessThan(String value) {
            addCriterion("EG01BJ54 <", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ54 <=", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54Like(String value) {
            addCriterion("EG01BJ54 like", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54NotLike(String value) {
            addCriterion("EG01BJ54 not like", value, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54In(List<String> values) {
            addCriterion("EG01BJ54 in", values, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54NotIn(List<String> values) {
            addCriterion("EG01BJ54 not in", values, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54Between(String value1, String value2) {
            addCriterion("EG01BJ54 between", value1, value2, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj54NotBetween(String value1, String value2) {
            addCriterion("EG01BJ54 not between", value1, value2, "eg01bj54");
            return (Criteria) this;
        }

        public Criteria andEg01bj55IsNull() {
            addCriterion("EG01BJ55 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj55IsNotNull() {
            addCriterion("EG01BJ55 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj55EqualTo(String value) {
            addCriterion("EG01BJ55 =", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55NotEqualTo(String value) {
            addCriterion("EG01BJ55 <>", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55GreaterThan(String value) {
            addCriterion("EG01BJ55 >", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ55 >=", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55LessThan(String value) {
            addCriterion("EG01BJ55 <", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ55 <=", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55Like(String value) {
            addCriterion("EG01BJ55 like", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55NotLike(String value) {
            addCriterion("EG01BJ55 not like", value, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55In(List<String> values) {
            addCriterion("EG01BJ55 in", values, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55NotIn(List<String> values) {
            addCriterion("EG01BJ55 not in", values, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55Between(String value1, String value2) {
            addCriterion("EG01BJ55 between", value1, value2, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj55NotBetween(String value1, String value2) {
            addCriterion("EG01BJ55 not between", value1, value2, "eg01bj55");
            return (Criteria) this;
        }

        public Criteria andEg01bj56IsNull() {
            addCriterion("EG01BJ56 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj56IsNotNull() {
            addCriterion("EG01BJ56 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj56EqualTo(String value) {
            addCriterion("EG01BJ56 =", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56NotEqualTo(String value) {
            addCriterion("EG01BJ56 <>", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56GreaterThan(String value) {
            addCriterion("EG01BJ56 >", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ56 >=", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56LessThan(String value) {
            addCriterion("EG01BJ56 <", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ56 <=", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56Like(String value) {
            addCriterion("EG01BJ56 like", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56NotLike(String value) {
            addCriterion("EG01BJ56 not like", value, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56In(List<String> values) {
            addCriterion("EG01BJ56 in", values, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56NotIn(List<String> values) {
            addCriterion("EG01BJ56 not in", values, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56Between(String value1, String value2) {
            addCriterion("EG01BJ56 between", value1, value2, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj56NotBetween(String value1, String value2) {
            addCriterion("EG01BJ56 not between", value1, value2, "eg01bj56");
            return (Criteria) this;
        }

        public Criteria andEg01bj57IsNull() {
            addCriterion("EG01BJ57 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj57IsNotNull() {
            addCriterion("EG01BJ57 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj57EqualTo(String value) {
            addCriterion("EG01BJ57 =", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57NotEqualTo(String value) {
            addCriterion("EG01BJ57 <>", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57GreaterThan(String value) {
            addCriterion("EG01BJ57 >", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ57 >=", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57LessThan(String value) {
            addCriterion("EG01BJ57 <", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ57 <=", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57Like(String value) {
            addCriterion("EG01BJ57 like", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57NotLike(String value) {
            addCriterion("EG01BJ57 not like", value, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57In(List<String> values) {
            addCriterion("EG01BJ57 in", values, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57NotIn(List<String> values) {
            addCriterion("EG01BJ57 not in", values, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57Between(String value1, String value2) {
            addCriterion("EG01BJ57 between", value1, value2, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj57NotBetween(String value1, String value2) {
            addCriterion("EG01BJ57 not between", value1, value2, "eg01bj57");
            return (Criteria) this;
        }

        public Criteria andEg01bj58IsNull() {
            addCriterion("EG01BJ58 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj58IsNotNull() {
            addCriterion("EG01BJ58 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj58EqualTo(String value) {
            addCriterion("EG01BJ58 =", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58NotEqualTo(String value) {
            addCriterion("EG01BJ58 <>", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58GreaterThan(String value) {
            addCriterion("EG01BJ58 >", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ58 >=", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58LessThan(String value) {
            addCriterion("EG01BJ58 <", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ58 <=", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58Like(String value) {
            addCriterion("EG01BJ58 like", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58NotLike(String value) {
            addCriterion("EG01BJ58 not like", value, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58In(List<String> values) {
            addCriterion("EG01BJ58 in", values, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58NotIn(List<String> values) {
            addCriterion("EG01BJ58 not in", values, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58Between(String value1, String value2) {
            addCriterion("EG01BJ58 between", value1, value2, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj58NotBetween(String value1, String value2) {
            addCriterion("EG01BJ58 not between", value1, value2, "eg01bj58");
            return (Criteria) this;
        }

        public Criteria andEg01bj59IsNull() {
            addCriterion("EG01BJ59 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj59IsNotNull() {
            addCriterion("EG01BJ59 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj59EqualTo(String value) {
            addCriterion("EG01BJ59 =", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59NotEqualTo(String value) {
            addCriterion("EG01BJ59 <>", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59GreaterThan(String value) {
            addCriterion("EG01BJ59 >", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ59 >=", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59LessThan(String value) {
            addCriterion("EG01BJ59 <", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ59 <=", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59Like(String value) {
            addCriterion("EG01BJ59 like", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59NotLike(String value) {
            addCriterion("EG01BJ59 not like", value, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59In(List<String> values) {
            addCriterion("EG01BJ59 in", values, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59NotIn(List<String> values) {
            addCriterion("EG01BJ59 not in", values, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59Between(String value1, String value2) {
            addCriterion("EG01BJ59 between", value1, value2, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj59NotBetween(String value1, String value2) {
            addCriterion("EG01BJ59 not between", value1, value2, "eg01bj59");
            return (Criteria) this;
        }

        public Criteria andEg01bj60IsNull() {
            addCriterion("EG01BJ60 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj60IsNotNull() {
            addCriterion("EG01BJ60 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj60EqualTo(String value) {
            addCriterion("EG01BJ60 =", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60NotEqualTo(String value) {
            addCriterion("EG01BJ60 <>", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60GreaterThan(String value) {
            addCriterion("EG01BJ60 >", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ60 >=", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60LessThan(String value) {
            addCriterion("EG01BJ60 <", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ60 <=", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60Like(String value) {
            addCriterion("EG01BJ60 like", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60NotLike(String value) {
            addCriterion("EG01BJ60 not like", value, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60In(List<String> values) {
            addCriterion("EG01BJ60 in", values, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60NotIn(List<String> values) {
            addCriterion("EG01BJ60 not in", values, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60Between(String value1, String value2) {
            addCriterion("EG01BJ60 between", value1, value2, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj60NotBetween(String value1, String value2) {
            addCriterion("EG01BJ60 not between", value1, value2, "eg01bj60");
            return (Criteria) this;
        }

        public Criteria andEg01bj61IsNull() {
            addCriterion("EG01BJ61 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj61IsNotNull() {
            addCriterion("EG01BJ61 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj61EqualTo(String value) {
            addCriterion("EG01BJ61 =", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61NotEqualTo(String value) {
            addCriterion("EG01BJ61 <>", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61GreaterThan(String value) {
            addCriterion("EG01BJ61 >", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ61 >=", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61LessThan(String value) {
            addCriterion("EG01BJ61 <", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ61 <=", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61Like(String value) {
            addCriterion("EG01BJ61 like", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61NotLike(String value) {
            addCriterion("EG01BJ61 not like", value, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61In(List<String> values) {
            addCriterion("EG01BJ61 in", values, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61NotIn(List<String> values) {
            addCriterion("EG01BJ61 not in", values, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61Between(String value1, String value2) {
            addCriterion("EG01BJ61 between", value1, value2, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj61NotBetween(String value1, String value2) {
            addCriterion("EG01BJ61 not between", value1, value2, "eg01bj61");
            return (Criteria) this;
        }

        public Criteria andEg01bj62IsNull() {
            addCriterion("EG01BJ62 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj62IsNotNull() {
            addCriterion("EG01BJ62 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj62EqualTo(String value) {
            addCriterion("EG01BJ62 =", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62NotEqualTo(String value) {
            addCriterion("EG01BJ62 <>", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62GreaterThan(String value) {
            addCriterion("EG01BJ62 >", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ62 >=", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62LessThan(String value) {
            addCriterion("EG01BJ62 <", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ62 <=", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62Like(String value) {
            addCriterion("EG01BJ62 like", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62NotLike(String value) {
            addCriterion("EG01BJ62 not like", value, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62In(List<String> values) {
            addCriterion("EG01BJ62 in", values, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62NotIn(List<String> values) {
            addCriterion("EG01BJ62 not in", values, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62Between(String value1, String value2) {
            addCriterion("EG01BJ62 between", value1, value2, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj62NotBetween(String value1, String value2) {
            addCriterion("EG01BJ62 not between", value1, value2, "eg01bj62");
            return (Criteria) this;
        }

        public Criteria andEg01bj63IsNull() {
            addCriterion("EG01BJ63 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj63IsNotNull() {
            addCriterion("EG01BJ63 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj63EqualTo(String value) {
            addCriterion("EG01BJ63 =", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63NotEqualTo(String value) {
            addCriterion("EG01BJ63 <>", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63GreaterThan(String value) {
            addCriterion("EG01BJ63 >", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ63 >=", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63LessThan(String value) {
            addCriterion("EG01BJ63 <", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ63 <=", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63Like(String value) {
            addCriterion("EG01BJ63 like", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63NotLike(String value) {
            addCriterion("EG01BJ63 not like", value, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63In(List<String> values) {
            addCriterion("EG01BJ63 in", values, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63NotIn(List<String> values) {
            addCriterion("EG01BJ63 not in", values, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63Between(String value1, String value2) {
            addCriterion("EG01BJ63 between", value1, value2, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj63NotBetween(String value1, String value2) {
            addCriterion("EG01BJ63 not between", value1, value2, "eg01bj63");
            return (Criteria) this;
        }

        public Criteria andEg01bj64IsNull() {
            addCriterion("EG01BJ64 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj64IsNotNull() {
            addCriterion("EG01BJ64 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj64EqualTo(String value) {
            addCriterion("EG01BJ64 =", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64NotEqualTo(String value) {
            addCriterion("EG01BJ64 <>", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64GreaterThan(String value) {
            addCriterion("EG01BJ64 >", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ64 >=", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64LessThan(String value) {
            addCriterion("EG01BJ64 <", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ64 <=", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64Like(String value) {
            addCriterion("EG01BJ64 like", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64NotLike(String value) {
            addCriterion("EG01BJ64 not like", value, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64In(List<String> values) {
            addCriterion("EG01BJ64 in", values, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64NotIn(List<String> values) {
            addCriterion("EG01BJ64 not in", values, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64Between(String value1, String value2) {
            addCriterion("EG01BJ64 between", value1, value2, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj64NotBetween(String value1, String value2) {
            addCriterion("EG01BJ64 not between", value1, value2, "eg01bj64");
            return (Criteria) this;
        }

        public Criteria andEg01bj65IsNull() {
            addCriterion("EG01BJ65 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj65IsNotNull() {
            addCriterion("EG01BJ65 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj65EqualTo(String value) {
            addCriterion("EG01BJ65 =", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65NotEqualTo(String value) {
            addCriterion("EG01BJ65 <>", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65GreaterThan(String value) {
            addCriterion("EG01BJ65 >", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ65 >=", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65LessThan(String value) {
            addCriterion("EG01BJ65 <", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ65 <=", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65Like(String value) {
            addCriterion("EG01BJ65 like", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65NotLike(String value) {
            addCriterion("EG01BJ65 not like", value, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65In(List<String> values) {
            addCriterion("EG01BJ65 in", values, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65NotIn(List<String> values) {
            addCriterion("EG01BJ65 not in", values, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65Between(String value1, String value2) {
            addCriterion("EG01BJ65 between", value1, value2, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj65NotBetween(String value1, String value2) {
            addCriterion("EG01BJ65 not between", value1, value2, "eg01bj65");
            return (Criteria) this;
        }

        public Criteria andEg01bj66IsNull() {
            addCriterion("EG01BJ66 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj66IsNotNull() {
            addCriterion("EG01BJ66 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj66EqualTo(String value) {
            addCriterion("EG01BJ66 =", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66NotEqualTo(String value) {
            addCriterion("EG01BJ66 <>", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66GreaterThan(String value) {
            addCriterion("EG01BJ66 >", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ66 >=", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66LessThan(String value) {
            addCriterion("EG01BJ66 <", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ66 <=", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66Like(String value) {
            addCriterion("EG01BJ66 like", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66NotLike(String value) {
            addCriterion("EG01BJ66 not like", value, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66In(List<String> values) {
            addCriterion("EG01BJ66 in", values, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66NotIn(List<String> values) {
            addCriterion("EG01BJ66 not in", values, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66Between(String value1, String value2) {
            addCriterion("EG01BJ66 between", value1, value2, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj66NotBetween(String value1, String value2) {
            addCriterion("EG01BJ66 not between", value1, value2, "eg01bj66");
            return (Criteria) this;
        }

        public Criteria andEg01bj67IsNull() {
            addCriterion("EG01BJ67 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj67IsNotNull() {
            addCriterion("EG01BJ67 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj67EqualTo(String value) {
            addCriterion("EG01BJ67 =", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67NotEqualTo(String value) {
            addCriterion("EG01BJ67 <>", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67GreaterThan(String value) {
            addCriterion("EG01BJ67 >", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ67 >=", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67LessThan(String value) {
            addCriterion("EG01BJ67 <", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ67 <=", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67Like(String value) {
            addCriterion("EG01BJ67 like", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67NotLike(String value) {
            addCriterion("EG01BJ67 not like", value, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67In(List<String> values) {
            addCriterion("EG01BJ67 in", values, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67NotIn(List<String> values) {
            addCriterion("EG01BJ67 not in", values, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67Between(String value1, String value2) {
            addCriterion("EG01BJ67 between", value1, value2, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj67NotBetween(String value1, String value2) {
            addCriterion("EG01BJ67 not between", value1, value2, "eg01bj67");
            return (Criteria) this;
        }

        public Criteria andEg01bj68IsNull() {
            addCriterion("EG01BJ68 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj68IsNotNull() {
            addCriterion("EG01BJ68 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj68EqualTo(String value) {
            addCriterion("EG01BJ68 =", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68NotEqualTo(String value) {
            addCriterion("EG01BJ68 <>", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68GreaterThan(String value) {
            addCriterion("EG01BJ68 >", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ68 >=", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68LessThan(String value) {
            addCriterion("EG01BJ68 <", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ68 <=", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68Like(String value) {
            addCriterion("EG01BJ68 like", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68NotLike(String value) {
            addCriterion("EG01BJ68 not like", value, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68In(List<String> values) {
            addCriterion("EG01BJ68 in", values, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68NotIn(List<String> values) {
            addCriterion("EG01BJ68 not in", values, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68Between(String value1, String value2) {
            addCriterion("EG01BJ68 between", value1, value2, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj68NotBetween(String value1, String value2) {
            addCriterion("EG01BJ68 not between", value1, value2, "eg01bj68");
            return (Criteria) this;
        }

        public Criteria andEg01bj69IsNull() {
            addCriterion("EG01BJ69 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj69IsNotNull() {
            addCriterion("EG01BJ69 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj69EqualTo(String value) {
            addCriterion("EG01BJ69 =", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69NotEqualTo(String value) {
            addCriterion("EG01BJ69 <>", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69GreaterThan(String value) {
            addCriterion("EG01BJ69 >", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ69 >=", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69LessThan(String value) {
            addCriterion("EG01BJ69 <", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ69 <=", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69Like(String value) {
            addCriterion("EG01BJ69 like", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69NotLike(String value) {
            addCriterion("EG01BJ69 not like", value, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69In(List<String> values) {
            addCriterion("EG01BJ69 in", values, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69NotIn(List<String> values) {
            addCriterion("EG01BJ69 not in", values, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69Between(String value1, String value2) {
            addCriterion("EG01BJ69 between", value1, value2, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj69NotBetween(String value1, String value2) {
            addCriterion("EG01BJ69 not between", value1, value2, "eg01bj69");
            return (Criteria) this;
        }

        public Criteria andEg01bj70IsNull() {
            addCriterion("EG01BJ70 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj70IsNotNull() {
            addCriterion("EG01BJ70 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj70EqualTo(String value) {
            addCriterion("EG01BJ70 =", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70NotEqualTo(String value) {
            addCriterion("EG01BJ70 <>", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70GreaterThan(String value) {
            addCriterion("EG01BJ70 >", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ70 >=", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70LessThan(String value) {
            addCriterion("EG01BJ70 <", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ70 <=", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70Like(String value) {
            addCriterion("EG01BJ70 like", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70NotLike(String value) {
            addCriterion("EG01BJ70 not like", value, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70In(List<String> values) {
            addCriterion("EG01BJ70 in", values, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70NotIn(List<String> values) {
            addCriterion("EG01BJ70 not in", values, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70Between(String value1, String value2) {
            addCriterion("EG01BJ70 between", value1, value2, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj70NotBetween(String value1, String value2) {
            addCriterion("EG01BJ70 not between", value1, value2, "eg01bj70");
            return (Criteria) this;
        }

        public Criteria andEg01bj71IsNull() {
            addCriterion("EG01BJ71 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj71IsNotNull() {
            addCriterion("EG01BJ71 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj71EqualTo(String value) {
            addCriterion("EG01BJ71 =", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71NotEqualTo(String value) {
            addCriterion("EG01BJ71 <>", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71GreaterThan(String value) {
            addCriterion("EG01BJ71 >", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ71 >=", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71LessThan(String value) {
            addCriterion("EG01BJ71 <", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ71 <=", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71Like(String value) {
            addCriterion("EG01BJ71 like", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71NotLike(String value) {
            addCriterion("EG01BJ71 not like", value, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71In(List<String> values) {
            addCriterion("EG01BJ71 in", values, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71NotIn(List<String> values) {
            addCriterion("EG01BJ71 not in", values, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71Between(String value1, String value2) {
            addCriterion("EG01BJ71 between", value1, value2, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj71NotBetween(String value1, String value2) {
            addCriterion("EG01BJ71 not between", value1, value2, "eg01bj71");
            return (Criteria) this;
        }

        public Criteria andEg01bj72IsNull() {
            addCriterion("EG01BJ72 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj72IsNotNull() {
            addCriterion("EG01BJ72 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj72EqualTo(String value) {
            addCriterion("EG01BJ72 =", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72NotEqualTo(String value) {
            addCriterion("EG01BJ72 <>", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72GreaterThan(String value) {
            addCriterion("EG01BJ72 >", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ72 >=", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72LessThan(String value) {
            addCriterion("EG01BJ72 <", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ72 <=", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72Like(String value) {
            addCriterion("EG01BJ72 like", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72NotLike(String value) {
            addCriterion("EG01BJ72 not like", value, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72In(List<String> values) {
            addCriterion("EG01BJ72 in", values, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72NotIn(List<String> values) {
            addCriterion("EG01BJ72 not in", values, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72Between(String value1, String value2) {
            addCriterion("EG01BJ72 between", value1, value2, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj72NotBetween(String value1, String value2) {
            addCriterion("EG01BJ72 not between", value1, value2, "eg01bj72");
            return (Criteria) this;
        }

        public Criteria andEg01bj73IsNull() {
            addCriterion("EG01BJ73 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj73IsNotNull() {
            addCriterion("EG01BJ73 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj73EqualTo(String value) {
            addCriterion("EG01BJ73 =", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73NotEqualTo(String value) {
            addCriterion("EG01BJ73 <>", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73GreaterThan(String value) {
            addCriterion("EG01BJ73 >", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ73 >=", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73LessThan(String value) {
            addCriterion("EG01BJ73 <", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ73 <=", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73Like(String value) {
            addCriterion("EG01BJ73 like", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73NotLike(String value) {
            addCriterion("EG01BJ73 not like", value, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73In(List<String> values) {
            addCriterion("EG01BJ73 in", values, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73NotIn(List<String> values) {
            addCriterion("EG01BJ73 not in", values, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73Between(String value1, String value2) {
            addCriterion("EG01BJ73 between", value1, value2, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj73NotBetween(String value1, String value2) {
            addCriterion("EG01BJ73 not between", value1, value2, "eg01bj73");
            return (Criteria) this;
        }

        public Criteria andEg01bj74IsNull() {
            addCriterion("EG01BJ74 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj74IsNotNull() {
            addCriterion("EG01BJ74 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj74EqualTo(String value) {
            addCriterion("EG01BJ74 =", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74NotEqualTo(String value) {
            addCriterion("EG01BJ74 <>", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74GreaterThan(String value) {
            addCriterion("EG01BJ74 >", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ74 >=", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74LessThan(String value) {
            addCriterion("EG01BJ74 <", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ74 <=", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74Like(String value) {
            addCriterion("EG01BJ74 like", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74NotLike(String value) {
            addCriterion("EG01BJ74 not like", value, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74In(List<String> values) {
            addCriterion("EG01BJ74 in", values, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74NotIn(List<String> values) {
            addCriterion("EG01BJ74 not in", values, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74Between(String value1, String value2) {
            addCriterion("EG01BJ74 between", value1, value2, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj74NotBetween(String value1, String value2) {
            addCriterion("EG01BJ74 not between", value1, value2, "eg01bj74");
            return (Criteria) this;
        }

        public Criteria andEg01bj75IsNull() {
            addCriterion("EG01BJ75 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj75IsNotNull() {
            addCriterion("EG01BJ75 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj75EqualTo(String value) {
            addCriterion("EG01BJ75 =", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75NotEqualTo(String value) {
            addCriterion("EG01BJ75 <>", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75GreaterThan(String value) {
            addCriterion("EG01BJ75 >", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ75 >=", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75LessThan(String value) {
            addCriterion("EG01BJ75 <", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ75 <=", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75Like(String value) {
            addCriterion("EG01BJ75 like", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75NotLike(String value) {
            addCriterion("EG01BJ75 not like", value, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75In(List<String> values) {
            addCriterion("EG01BJ75 in", values, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75NotIn(List<String> values) {
            addCriterion("EG01BJ75 not in", values, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75Between(String value1, String value2) {
            addCriterion("EG01BJ75 between", value1, value2, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj75NotBetween(String value1, String value2) {
            addCriterion("EG01BJ75 not between", value1, value2, "eg01bj75");
            return (Criteria) this;
        }

        public Criteria andEg01bj76IsNull() {
            addCriterion("EG01BJ76 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj76IsNotNull() {
            addCriterion("EG01BJ76 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj76EqualTo(String value) {
            addCriterion("EG01BJ76 =", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76NotEqualTo(String value) {
            addCriterion("EG01BJ76 <>", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76GreaterThan(String value) {
            addCriterion("EG01BJ76 >", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ76 >=", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76LessThan(String value) {
            addCriterion("EG01BJ76 <", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ76 <=", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76Like(String value) {
            addCriterion("EG01BJ76 like", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76NotLike(String value) {
            addCriterion("EG01BJ76 not like", value, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76In(List<String> values) {
            addCriterion("EG01BJ76 in", values, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76NotIn(List<String> values) {
            addCriterion("EG01BJ76 not in", values, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76Between(String value1, String value2) {
            addCriterion("EG01BJ76 between", value1, value2, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj76NotBetween(String value1, String value2) {
            addCriterion("EG01BJ76 not between", value1, value2, "eg01bj76");
            return (Criteria) this;
        }

        public Criteria andEg01bj77IsNull() {
            addCriterion("EG01BJ77 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj77IsNotNull() {
            addCriterion("EG01BJ77 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj77EqualTo(String value) {
            addCriterion("EG01BJ77 =", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77NotEqualTo(String value) {
            addCriterion("EG01BJ77 <>", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77GreaterThan(String value) {
            addCriterion("EG01BJ77 >", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ77 >=", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77LessThan(String value) {
            addCriterion("EG01BJ77 <", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ77 <=", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77Like(String value) {
            addCriterion("EG01BJ77 like", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77NotLike(String value) {
            addCriterion("EG01BJ77 not like", value, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77In(List<String> values) {
            addCriterion("EG01BJ77 in", values, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77NotIn(List<String> values) {
            addCriterion("EG01BJ77 not in", values, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77Between(String value1, String value2) {
            addCriterion("EG01BJ77 between", value1, value2, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj77NotBetween(String value1, String value2) {
            addCriterion("EG01BJ77 not between", value1, value2, "eg01bj77");
            return (Criteria) this;
        }

        public Criteria andEg01bj78IsNull() {
            addCriterion("EG01BJ78 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj78IsNotNull() {
            addCriterion("EG01BJ78 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj78EqualTo(String value) {
            addCriterion("EG01BJ78 =", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78NotEqualTo(String value) {
            addCriterion("EG01BJ78 <>", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78GreaterThan(String value) {
            addCriterion("EG01BJ78 >", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ78 >=", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78LessThan(String value) {
            addCriterion("EG01BJ78 <", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ78 <=", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78Like(String value) {
            addCriterion("EG01BJ78 like", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78NotLike(String value) {
            addCriterion("EG01BJ78 not like", value, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78In(List<String> values) {
            addCriterion("EG01BJ78 in", values, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78NotIn(List<String> values) {
            addCriterion("EG01BJ78 not in", values, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78Between(String value1, String value2) {
            addCriterion("EG01BJ78 between", value1, value2, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj78NotBetween(String value1, String value2) {
            addCriterion("EG01BJ78 not between", value1, value2, "eg01bj78");
            return (Criteria) this;
        }

        public Criteria andEg01bj79IsNull() {
            addCriterion("EG01BJ79 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj79IsNotNull() {
            addCriterion("EG01BJ79 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj79EqualTo(String value) {
            addCriterion("EG01BJ79 =", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79NotEqualTo(String value) {
            addCriterion("EG01BJ79 <>", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79GreaterThan(String value) {
            addCriterion("EG01BJ79 >", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ79 >=", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79LessThan(String value) {
            addCriterion("EG01BJ79 <", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ79 <=", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79Like(String value) {
            addCriterion("EG01BJ79 like", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79NotLike(String value) {
            addCriterion("EG01BJ79 not like", value, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79In(List<String> values) {
            addCriterion("EG01BJ79 in", values, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79NotIn(List<String> values) {
            addCriterion("EG01BJ79 not in", values, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79Between(String value1, String value2) {
            addCriterion("EG01BJ79 between", value1, value2, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj79NotBetween(String value1, String value2) {
            addCriterion("EG01BJ79 not between", value1, value2, "eg01bj79");
            return (Criteria) this;
        }

        public Criteria andEg01bj80IsNull() {
            addCriterion("EG01BJ80 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj80IsNotNull() {
            addCriterion("EG01BJ80 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj80EqualTo(String value) {
            addCriterion("EG01BJ80 =", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80NotEqualTo(String value) {
            addCriterion("EG01BJ80 <>", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80GreaterThan(String value) {
            addCriterion("EG01BJ80 >", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ80 >=", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80LessThan(String value) {
            addCriterion("EG01BJ80 <", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ80 <=", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80Like(String value) {
            addCriterion("EG01BJ80 like", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80NotLike(String value) {
            addCriterion("EG01BJ80 not like", value, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80In(List<String> values) {
            addCriterion("EG01BJ80 in", values, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80NotIn(List<String> values) {
            addCriterion("EG01BJ80 not in", values, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80Between(String value1, String value2) {
            addCriterion("EG01BJ80 between", value1, value2, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj80NotBetween(String value1, String value2) {
            addCriterion("EG01BJ80 not between", value1, value2, "eg01bj80");
            return (Criteria) this;
        }

        public Criteria andEg01bj81IsNull() {
            addCriterion("EG01BJ81 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj81IsNotNull() {
            addCriterion("EG01BJ81 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj81EqualTo(String value) {
            addCriterion("EG01BJ81 =", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81NotEqualTo(String value) {
            addCriterion("EG01BJ81 <>", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81GreaterThan(String value) {
            addCriterion("EG01BJ81 >", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ81 >=", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81LessThan(String value) {
            addCriterion("EG01BJ81 <", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ81 <=", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81Like(String value) {
            addCriterion("EG01BJ81 like", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81NotLike(String value) {
            addCriterion("EG01BJ81 not like", value, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81In(List<String> values) {
            addCriterion("EG01BJ81 in", values, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81NotIn(List<String> values) {
            addCriterion("EG01BJ81 not in", values, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81Between(String value1, String value2) {
            addCriterion("EG01BJ81 between", value1, value2, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj81NotBetween(String value1, String value2) {
            addCriterion("EG01BJ81 not between", value1, value2, "eg01bj81");
            return (Criteria) this;
        }

        public Criteria andEg01bj82IsNull() {
            addCriterion("EG01BJ82 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj82IsNotNull() {
            addCriterion("EG01BJ82 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj82EqualTo(String value) {
            addCriterion("EG01BJ82 =", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82NotEqualTo(String value) {
            addCriterion("EG01BJ82 <>", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82GreaterThan(String value) {
            addCriterion("EG01BJ82 >", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ82 >=", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82LessThan(String value) {
            addCriterion("EG01BJ82 <", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ82 <=", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82Like(String value) {
            addCriterion("EG01BJ82 like", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82NotLike(String value) {
            addCriterion("EG01BJ82 not like", value, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82In(List<String> values) {
            addCriterion("EG01BJ82 in", values, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82NotIn(List<String> values) {
            addCriterion("EG01BJ82 not in", values, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82Between(String value1, String value2) {
            addCriterion("EG01BJ82 between", value1, value2, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj82NotBetween(String value1, String value2) {
            addCriterion("EG01BJ82 not between", value1, value2, "eg01bj82");
            return (Criteria) this;
        }

        public Criteria andEg01bj83IsNull() {
            addCriterion("EG01BJ83 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj83IsNotNull() {
            addCriterion("EG01BJ83 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj83EqualTo(String value) {
            addCriterion("EG01BJ83 =", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83NotEqualTo(String value) {
            addCriterion("EG01BJ83 <>", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83GreaterThan(String value) {
            addCriterion("EG01BJ83 >", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ83 >=", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83LessThan(String value) {
            addCriterion("EG01BJ83 <", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ83 <=", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83Like(String value) {
            addCriterion("EG01BJ83 like", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83NotLike(String value) {
            addCriterion("EG01BJ83 not like", value, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83In(List<String> values) {
            addCriterion("EG01BJ83 in", values, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83NotIn(List<String> values) {
            addCriterion("EG01BJ83 not in", values, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83Between(String value1, String value2) {
            addCriterion("EG01BJ83 between", value1, value2, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj83NotBetween(String value1, String value2) {
            addCriterion("EG01BJ83 not between", value1, value2, "eg01bj83");
            return (Criteria) this;
        }

        public Criteria andEg01bj84IsNull() {
            addCriterion("EG01BJ84 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj84IsNotNull() {
            addCriterion("EG01BJ84 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj84EqualTo(String value) {
            addCriterion("EG01BJ84 =", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84NotEqualTo(String value) {
            addCriterion("EG01BJ84 <>", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84GreaterThan(String value) {
            addCriterion("EG01BJ84 >", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ84 >=", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84LessThan(String value) {
            addCriterion("EG01BJ84 <", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ84 <=", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84Like(String value) {
            addCriterion("EG01BJ84 like", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84NotLike(String value) {
            addCriterion("EG01BJ84 not like", value, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84In(List<String> values) {
            addCriterion("EG01BJ84 in", values, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84NotIn(List<String> values) {
            addCriterion("EG01BJ84 not in", values, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84Between(String value1, String value2) {
            addCriterion("EG01BJ84 between", value1, value2, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj84NotBetween(String value1, String value2) {
            addCriterion("EG01BJ84 not between", value1, value2, "eg01bj84");
            return (Criteria) this;
        }

        public Criteria andEg01bj85IsNull() {
            addCriterion("EG01BJ85 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj85IsNotNull() {
            addCriterion("EG01BJ85 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj85EqualTo(String value) {
            addCriterion("EG01BJ85 =", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85NotEqualTo(String value) {
            addCriterion("EG01BJ85 <>", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85GreaterThan(String value) {
            addCriterion("EG01BJ85 >", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ85 >=", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85LessThan(String value) {
            addCriterion("EG01BJ85 <", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ85 <=", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85Like(String value) {
            addCriterion("EG01BJ85 like", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85NotLike(String value) {
            addCriterion("EG01BJ85 not like", value, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85In(List<String> values) {
            addCriterion("EG01BJ85 in", values, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85NotIn(List<String> values) {
            addCriterion("EG01BJ85 not in", values, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85Between(String value1, String value2) {
            addCriterion("EG01BJ85 between", value1, value2, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj85NotBetween(String value1, String value2) {
            addCriterion("EG01BJ85 not between", value1, value2, "eg01bj85");
            return (Criteria) this;
        }

        public Criteria andEg01bj86IsNull() {
            addCriterion("EG01BJ86 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj86IsNotNull() {
            addCriterion("EG01BJ86 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj86EqualTo(String value) {
            addCriterion("EG01BJ86 =", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86NotEqualTo(String value) {
            addCriterion("EG01BJ86 <>", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86GreaterThan(String value) {
            addCriterion("EG01BJ86 >", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ86 >=", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86LessThan(String value) {
            addCriterion("EG01BJ86 <", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ86 <=", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86Like(String value) {
            addCriterion("EG01BJ86 like", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86NotLike(String value) {
            addCriterion("EG01BJ86 not like", value, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86In(List<String> values) {
            addCriterion("EG01BJ86 in", values, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86NotIn(List<String> values) {
            addCriterion("EG01BJ86 not in", values, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86Between(String value1, String value2) {
            addCriterion("EG01BJ86 between", value1, value2, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj86NotBetween(String value1, String value2) {
            addCriterion("EG01BJ86 not between", value1, value2, "eg01bj86");
            return (Criteria) this;
        }

        public Criteria andEg01bj87IsNull() {
            addCriterion("EG01BJ87 is null");
            return (Criteria) this;
        }

        public Criteria andEg01bj87IsNotNull() {
            addCriterion("EG01BJ87 is not null");
            return (Criteria) this;
        }

        public Criteria andEg01bj87EqualTo(String value) {
            addCriterion("EG01BJ87 =", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87NotEqualTo(String value) {
            addCriterion("EG01BJ87 <>", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87GreaterThan(String value) {
            addCriterion("EG01BJ87 >", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87GreaterThanOrEqualTo(String value) {
            addCriterion("EG01BJ87 >=", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87LessThan(String value) {
            addCriterion("EG01BJ87 <", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87LessThanOrEqualTo(String value) {
            addCriterion("EG01BJ87 <=", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87Like(String value) {
            addCriterion("EG01BJ87 like", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87NotLike(String value) {
            addCriterion("EG01BJ87 not like", value, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87In(List<String> values) {
            addCriterion("EG01BJ87 in", values, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87NotIn(List<String> values) {
            addCriterion("EG01BJ87 not in", values, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87Between(String value1, String value2) {
            addCriterion("EG01BJ87 between", value1, value2, "eg01bj87");
            return (Criteria) this;
        }

        public Criteria andEg01bj87NotBetween(String value1, String value2) {
            addCriterion("EG01BJ87 not between", value1, value2, "eg01bj87");
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