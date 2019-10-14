package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CForceexecutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CForceexecutionExample() {
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

        public Criteria andEnforcementidIsNull() {
            addCriterion("ENFORCEMENTID is null");
            return (Criteria) this;
        }

        public Criteria andEnforcementidIsNotNull() {
            addCriterion("ENFORCEMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andEnforcementidEqualTo(String value) {
            addCriterion("ENFORCEMENTID =", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidNotEqualTo(String value) {
            addCriterion("ENFORCEMENTID <>", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidGreaterThan(String value) {
            addCriterion("ENFORCEMENTID >", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidGreaterThanOrEqualTo(String value) {
            addCriterion("ENFORCEMENTID >=", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidLessThan(String value) {
            addCriterion("ENFORCEMENTID <", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidLessThanOrEqualTo(String value) {
            addCriterion("ENFORCEMENTID <=", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidLike(String value) {
            addCriterion("ENFORCEMENTID like", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidNotLike(String value) {
            addCriterion("ENFORCEMENTID not like", value, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidIn(List<String> values) {
            addCriterion("ENFORCEMENTID in", values, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidNotIn(List<String> values) {
            addCriterion("ENFORCEMENTID not in", values, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidBetween(String value1, String value2) {
            addCriterion("ENFORCEMENTID between", value1, value2, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andEnforcementidNotBetween(String value1, String value2) {
            addCriterion("ENFORCEMENTID not between", value1, value2, "enforcementid");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtIsNull() {
            addCriterion("EXCUTIVECOURT is null");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtIsNotNull() {
            addCriterion("EXCUTIVECOURT is not null");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtEqualTo(String value) {
            addCriterion("EXCUTIVECOURT =", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtNotEqualTo(String value) {
            addCriterion("EXCUTIVECOURT <>", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtGreaterThan(String value) {
            addCriterion("EXCUTIVECOURT >", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtGreaterThanOrEqualTo(String value) {
            addCriterion("EXCUTIVECOURT >=", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtLessThan(String value) {
            addCriterion("EXCUTIVECOURT <", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtLessThanOrEqualTo(String value) {
            addCriterion("EXCUTIVECOURT <=", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtLike(String value) {
            addCriterion("EXCUTIVECOURT like", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtNotLike(String value) {
            addCriterion("EXCUTIVECOURT not like", value, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtIn(List<String> values) {
            addCriterion("EXCUTIVECOURT in", values, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtNotIn(List<String> values) {
            addCriterion("EXCUTIVECOURT not in", values, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtBetween(String value1, String value2) {
            addCriterion("EXCUTIVECOURT between", value1, value2, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andExcutivecourtNotBetween(String value1, String value2) {
            addCriterion("EXCUTIVECOURT not between", value1, value2, "excutivecourt");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateIsNull() {
            addCriterion("CASEREGISTRATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateIsNotNull() {
            addCriterion("CASEREGISTRATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateEqualTo(String value) {
            addCriterion("CASEREGISTRATIONDATE =", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateNotEqualTo(String value) {
            addCriterion("CASEREGISTRATIONDATE <>", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateGreaterThan(String value) {
            addCriterion("CASEREGISTRATIONDATE >", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateGreaterThanOrEqualTo(String value) {
            addCriterion("CASEREGISTRATIONDATE >=", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateLessThan(String value) {
            addCriterion("CASEREGISTRATIONDATE <", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateLessThanOrEqualTo(String value) {
            addCriterion("CASEREGISTRATIONDATE <=", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateLike(String value) {
            addCriterion("CASEREGISTRATIONDATE like", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateNotLike(String value) {
            addCriterion("CASEREGISTRATIONDATE not like", value, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateIn(List<String> values) {
            addCriterion("CASEREGISTRATIONDATE in", values, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateNotIn(List<String> values) {
            addCriterion("CASEREGISTRATIONDATE not in", values, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateBetween(String value1, String value2) {
            addCriterion("CASEREGISTRATIONDATE between", value1, value2, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andCaseregistrationdateNotBetween(String value1, String value2) {
            addCriterion("CASEREGISTRATIONDATE not between", value1, value2, "caseregistrationdate");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseIsNull() {
            addCriterion("ENFORCECASE is null");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseIsNotNull() {
            addCriterion("ENFORCECASE is not null");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseEqualTo(String value) {
            addCriterion("ENFORCECASE =", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseNotEqualTo(String value) {
            addCriterion("ENFORCECASE <>", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseGreaterThan(String value) {
            addCriterion("ENFORCECASE >", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseGreaterThanOrEqualTo(String value) {
            addCriterion("ENFORCECASE >=", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseLessThan(String value) {
            addCriterion("ENFORCECASE <", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseLessThanOrEqualTo(String value) {
            addCriterion("ENFORCECASE <=", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseLike(String value) {
            addCriterion("ENFORCECASE like", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseNotLike(String value) {
            addCriterion("ENFORCECASE not like", value, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseIn(List<String> values) {
            addCriterion("ENFORCECASE in", values, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseNotIn(List<String> values) {
            addCriterion("ENFORCECASE not in", values, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseBetween(String value1, String value2) {
            addCriterion("ENFORCECASE between", value1, value2, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andEnforcecaseNotBetween(String value1, String value2) {
            addCriterion("ENFORCECASE not between", value1, value2, "enforcecase");
            return (Criteria) this;
        }

        public Criteria andCasenumIsNull() {
            addCriterion("CASENUM is null");
            return (Criteria) this;
        }

        public Criteria andCasenumIsNotNull() {
            addCriterion("CASENUM is not null");
            return (Criteria) this;
        }

        public Criteria andCasenumEqualTo(String value) {
            addCriterion("CASENUM =", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotEqualTo(String value) {
            addCriterion("CASENUM <>", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumGreaterThan(String value) {
            addCriterion("CASENUM >", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumGreaterThanOrEqualTo(String value) {
            addCriterion("CASENUM >=", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumLessThan(String value) {
            addCriterion("CASENUM <", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumLessThanOrEqualTo(String value) {
            addCriterion("CASENUM <=", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumLike(String value) {
            addCriterion("CASENUM like", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotLike(String value) {
            addCriterion("CASENUM not like", value, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumIn(List<String> values) {
            addCriterion("CASENUM in", values, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotIn(List<String> values) {
            addCriterion("CASENUM not in", values, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumBetween(String value1, String value2) {
            addCriterion("CASENUM between", value1, value2, "casenum");
            return (Criteria) this;
        }

        public Criteria andCasenumNotBetween(String value1, String value2) {
            addCriterion("CASENUM not between", value1, value2, "casenum");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectIsNull() {
            addCriterion("LAWSUITOBJECT is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectIsNotNull() {
            addCriterion("LAWSUITOBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectEqualTo(String value) {
            addCriterion("LAWSUITOBJECT =", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectNotEqualTo(String value) {
            addCriterion("LAWSUITOBJECT <>", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectGreaterThan(String value) {
            addCriterion("LAWSUITOBJECT >", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectGreaterThanOrEqualTo(String value) {
            addCriterion("LAWSUITOBJECT >=", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectLessThan(String value) {
            addCriterion("LAWSUITOBJECT <", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectLessThanOrEqualTo(String value) {
            addCriterion("LAWSUITOBJECT <=", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectLike(String value) {
            addCriterion("LAWSUITOBJECT like", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectNotLike(String value) {
            addCriterion("LAWSUITOBJECT not like", value, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectIn(List<String> values) {
            addCriterion("LAWSUITOBJECT in", values, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectNotIn(List<String> values) {
            addCriterion("LAWSUITOBJECT not in", values, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectBetween(String value1, String value2) {
            addCriterion("LAWSUITOBJECT between", value1, value2, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectNotBetween(String value1, String value2) {
            addCriterion("LAWSUITOBJECT not between", value1, value2, "lawsuitobject");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountIsNull() {
            addCriterion("LAWSUITOBJECTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountIsNotNull() {
            addCriterion("LAWSUITOBJECTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountEqualTo(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT =", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountNotEqualTo(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT <>", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountGreaterThan(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT >", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountGreaterThanOrEqualTo(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT >=", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountLessThan(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT <", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountLessThanOrEqualTo(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT <=", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountLike(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT like", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountNotLike(String value) {
            addCriterion("LAWSUITOBJECTAMOUNT not like", value, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountIn(List<String> values) {
            addCriterion("LAWSUITOBJECTAMOUNT in", values, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountNotIn(List<String> values) {
            addCriterion("LAWSUITOBJECTAMOUNT not in", values, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountBetween(String value1, String value2) {
            addCriterion("LAWSUITOBJECTAMOUNT between", value1, value2, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andLawsuitobjectamountNotBetween(String value1, String value2) {
            addCriterion("LAWSUITOBJECTAMOUNT not between", value1, value2, "lawsuitobjectamount");
            return (Criteria) this;
        }

        public Criteria andCasestatusIsNull() {
            addCriterion("CASESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCasestatusIsNotNull() {
            addCriterion("CASESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCasestatusEqualTo(String value) {
            addCriterion("CASESTATUS =", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotEqualTo(String value) {
            addCriterion("CASESTATUS <>", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusGreaterThan(String value) {
            addCriterion("CASESTATUS >", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusGreaterThanOrEqualTo(String value) {
            addCriterion("CASESTATUS >=", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusLessThan(String value) {
            addCriterion("CASESTATUS <", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusLessThanOrEqualTo(String value) {
            addCriterion("CASESTATUS <=", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusLike(String value) {
            addCriterion("CASESTATUS like", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotLike(String value) {
            addCriterion("CASESTATUS not like", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusIn(List<String> values) {
            addCriterion("CASESTATUS in", values, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotIn(List<String> values) {
            addCriterion("CASESTATUS not in", values, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusBetween(String value1, String value2) {
            addCriterion("CASESTATUS between", value1, value2, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotBetween(String value1, String value2) {
            addCriterion("CASESTATUS not between", value1, value2, "casestatus");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeIsNull() {
            addCriterion("ENFORCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeIsNotNull() {
            addCriterion("ENFORCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeEqualTo(String value) {
            addCriterion("ENFORCETYPE =", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeNotEqualTo(String value) {
            addCriterion("ENFORCETYPE <>", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeGreaterThan(String value) {
            addCriterion("ENFORCETYPE >", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENFORCETYPE >=", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeLessThan(String value) {
            addCriterion("ENFORCETYPE <", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeLessThanOrEqualTo(String value) {
            addCriterion("ENFORCETYPE <=", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeLike(String value) {
            addCriterion("ENFORCETYPE like", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeNotLike(String value) {
            addCriterion("ENFORCETYPE not like", value, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeIn(List<String> values) {
            addCriterion("ENFORCETYPE in", values, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeNotIn(List<String> values) {
            addCriterion("ENFORCETYPE not in", values, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeBetween(String value1, String value2) {
            addCriterion("ENFORCETYPE between", value1, value2, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andEnforcetypeNotBetween(String value1, String value2) {
            addCriterion("ENFORCETYPE not between", value1, value2, "enforcetype");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectIsNull() {
            addCriterion("EXECUTEDOBJECT is null");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectIsNotNull() {
            addCriterion("EXECUTEDOBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectEqualTo(String value) {
            addCriterion("EXECUTEDOBJECT =", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectNotEqualTo(String value) {
            addCriterion("EXECUTEDOBJECT <>", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectGreaterThan(String value) {
            addCriterion("EXECUTEDOBJECT >", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTEDOBJECT >=", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectLessThan(String value) {
            addCriterion("EXECUTEDOBJECT <", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectLessThanOrEqualTo(String value) {
            addCriterion("EXECUTEDOBJECT <=", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectLike(String value) {
            addCriterion("EXECUTEDOBJECT like", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectNotLike(String value) {
            addCriterion("EXECUTEDOBJECT not like", value, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectIn(List<String> values) {
            addCriterion("EXECUTEDOBJECT in", values, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectNotIn(List<String> values) {
            addCriterion("EXECUTEDOBJECT not in", values, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectBetween(String value1, String value2) {
            addCriterion("EXECUTEDOBJECT between", value1, value2, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectNotBetween(String value1, String value2) {
            addCriterion("EXECUTEDOBJECT not between", value1, value2, "executedobject");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountIsNull() {
            addCriterion("EXECUTEDOBJECTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountIsNotNull() {
            addCriterion("EXECUTEDOBJECTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountEqualTo(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT =", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountNotEqualTo(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT <>", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountGreaterThan(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT >", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT >=", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountLessThan(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT <", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountLessThanOrEqualTo(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT <=", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountLike(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT like", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountNotLike(String value) {
            addCriterion("EXECUTEDOBJECTAMOUNT not like", value, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountIn(List<String> values) {
            addCriterion("EXECUTEDOBJECTAMOUNT in", values, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountNotIn(List<String> values) {
            addCriterion("EXECUTEDOBJECTAMOUNT not in", values, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountBetween(String value1, String value2) {
            addCriterion("EXECUTEDOBJECTAMOUNT between", value1, value2, "executedobjectamount");
            return (Criteria) this;
        }

        public Criteria andExecutedobjectamountNotBetween(String value1, String value2) {
            addCriterion("EXECUTEDOBJECTAMOUNT not between", value1, value2, "executedobjectamount");
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