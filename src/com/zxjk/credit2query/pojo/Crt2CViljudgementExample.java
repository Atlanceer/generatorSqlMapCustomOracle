package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CViljudgementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CViljudgementExample() {
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

        public Criteria andCiviljudgmentidIsNull() {
            addCriterion("CIVILJUDGMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidIsNotNull() {
            addCriterion("CIVILJUDGMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidEqualTo(String value) {
            addCriterion("CIVILJUDGMENTID =", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidNotEqualTo(String value) {
            addCriterion("CIVILJUDGMENTID <>", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidGreaterThan(String value) {
            addCriterion("CIVILJUDGMENTID >", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidGreaterThanOrEqualTo(String value) {
            addCriterion("CIVILJUDGMENTID >=", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidLessThan(String value) {
            addCriterion("CIVILJUDGMENTID <", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidLessThanOrEqualTo(String value) {
            addCriterion("CIVILJUDGMENTID <=", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidLike(String value) {
            addCriterion("CIVILJUDGMENTID like", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidNotLike(String value) {
            addCriterion("CIVILJUDGMENTID not like", value, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidIn(List<String> values) {
            addCriterion("CIVILJUDGMENTID in", values, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidNotIn(List<String> values) {
            addCriterion("CIVILJUDGMENTID not in", values, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidBetween(String value1, String value2) {
            addCriterion("CIVILJUDGMENTID between", value1, value2, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andCiviljudgmentidNotBetween(String value1, String value2) {
            addCriterion("CIVILJUDGMENTID not between", value1, value2, "civiljudgmentid");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtIsNull() {
            addCriterion("REGISTEREDCOURT is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtIsNotNull() {
            addCriterion("REGISTEREDCOURT is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtEqualTo(String value) {
            addCriterion("REGISTEREDCOURT =", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtNotEqualTo(String value) {
            addCriterion("REGISTEREDCOURT <>", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtGreaterThan(String value) {
            addCriterion("REGISTEREDCOURT >", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTEREDCOURT >=", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtLessThan(String value) {
            addCriterion("REGISTEREDCOURT <", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtLessThanOrEqualTo(String value) {
            addCriterion("REGISTEREDCOURT <=", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtLike(String value) {
            addCriterion("REGISTEREDCOURT like", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtNotLike(String value) {
            addCriterion("REGISTEREDCOURT not like", value, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtIn(List<String> values) {
            addCriterion("REGISTEREDCOURT in", values, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtNotIn(List<String> values) {
            addCriterion("REGISTEREDCOURT not in", values, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtBetween(String value1, String value2) {
            addCriterion("REGISTEREDCOURT between", value1, value2, "registeredcourt");
            return (Criteria) this;
        }

        public Criteria andRegisteredcourtNotBetween(String value1, String value2) {
            addCriterion("REGISTEREDCOURT not between", value1, value2, "registeredcourt");
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

        public Criteria andRegistercauseIsNull() {
            addCriterion("REGISTERCAUSE is null");
            return (Criteria) this;
        }

        public Criteria andRegistercauseIsNotNull() {
            addCriterion("REGISTERCAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistercauseEqualTo(String value) {
            addCriterion("REGISTERCAUSE =", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseNotEqualTo(String value) {
            addCriterion("REGISTERCAUSE <>", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseGreaterThan(String value) {
            addCriterion("REGISTERCAUSE >", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERCAUSE >=", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseLessThan(String value) {
            addCriterion("REGISTERCAUSE <", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseLessThanOrEqualTo(String value) {
            addCriterion("REGISTERCAUSE <=", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseLike(String value) {
            addCriterion("REGISTERCAUSE like", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseNotLike(String value) {
            addCriterion("REGISTERCAUSE not like", value, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseIn(List<String> values) {
            addCriterion("REGISTERCAUSE in", values, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseNotIn(List<String> values) {
            addCriterion("REGISTERCAUSE not in", values, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseBetween(String value1, String value2) {
            addCriterion("REGISTERCAUSE between", value1, value2, "registercause");
            return (Criteria) this;
        }

        public Criteria andRegistercauseNotBetween(String value1, String value2) {
            addCriterion("REGISTERCAUSE not between", value1, value2, "registercause");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeIsNull() {
            addCriterion("LAWSUITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeIsNotNull() {
            addCriterion("LAWSUITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeEqualTo(String value) {
            addCriterion("LAWSUITTYPE =", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeNotEqualTo(String value) {
            addCriterion("LAWSUITTYPE <>", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeGreaterThan(String value) {
            addCriterion("LAWSUITTYPE >", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeGreaterThanOrEqualTo(String value) {
            addCriterion("LAWSUITTYPE >=", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeLessThan(String value) {
            addCriterion("LAWSUITTYPE <", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeLessThanOrEqualTo(String value) {
            addCriterion("LAWSUITTYPE <=", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeLike(String value) {
            addCriterion("LAWSUITTYPE like", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeNotLike(String value) {
            addCriterion("LAWSUITTYPE not like", value, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeIn(List<String> values) {
            addCriterion("LAWSUITTYPE in", values, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeNotIn(List<String> values) {
            addCriterion("LAWSUITTYPE not in", values, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeBetween(String value1, String value2) {
            addCriterion("LAWSUITTYPE between", value1, value2, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuittypeNotBetween(String value1, String value2) {
            addCriterion("LAWSUITTYPE not between", value1, value2, "lawsuittype");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoIsNull() {
            addCriterion("LAWSUITNO is null");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoIsNotNull() {
            addCriterion("LAWSUITNO is not null");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoEqualTo(String value) {
            addCriterion("LAWSUITNO =", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoNotEqualTo(String value) {
            addCriterion("LAWSUITNO <>", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoGreaterThan(String value) {
            addCriterion("LAWSUITNO >", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoGreaterThanOrEqualTo(String value) {
            addCriterion("LAWSUITNO >=", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoLessThan(String value) {
            addCriterion("LAWSUITNO <", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoLessThanOrEqualTo(String value) {
            addCriterion("LAWSUITNO <=", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoLike(String value) {
            addCriterion("LAWSUITNO like", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoNotLike(String value) {
            addCriterion("LAWSUITNO not like", value, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoIn(List<String> values) {
            addCriterion("LAWSUITNO in", values, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoNotIn(List<String> values) {
            addCriterion("LAWSUITNO not in", values, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoBetween(String value1, String value2) {
            addCriterion("LAWSUITNO between", value1, value2, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andLawsuitnoNotBetween(String value1, String value2) {
            addCriterion("LAWSUITNO not between", value1, value2, "lawsuitno");
            return (Criteria) this;
        }

        public Criteria andCaseprocessIsNull() {
            addCriterion("CASEPROCESS is null");
            return (Criteria) this;
        }

        public Criteria andCaseprocessIsNotNull() {
            addCriterion("CASEPROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andCaseprocessEqualTo(String value) {
            addCriterion("CASEPROCESS =", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessNotEqualTo(String value) {
            addCriterion("CASEPROCESS <>", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessGreaterThan(String value) {
            addCriterion("CASEPROCESS >", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessGreaterThanOrEqualTo(String value) {
            addCriterion("CASEPROCESS >=", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessLessThan(String value) {
            addCriterion("CASEPROCESS <", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessLessThanOrEqualTo(String value) {
            addCriterion("CASEPROCESS <=", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessLike(String value) {
            addCriterion("CASEPROCESS like", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessNotLike(String value) {
            addCriterion("CASEPROCESS not like", value, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessIn(List<String> values) {
            addCriterion("CASEPROCESS in", values, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessNotIn(List<String> values) {
            addCriterion("CASEPROCESS not in", values, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessBetween(String value1, String value2) {
            addCriterion("CASEPROCESS between", value1, value2, "caseprocess");
            return (Criteria) this;
        }

        public Criteria andCaseprocessNotBetween(String value1, String value2) {
            addCriterion("CASEPROCESS not between", value1, value2, "caseprocess");
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

        public Criteria andClosedtypeIsNull() {
            addCriterion("CLOSEDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClosedtypeIsNotNull() {
            addCriterion("CLOSEDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClosedtypeEqualTo(String value) {
            addCriterion("CLOSEDTYPE =", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeNotEqualTo(String value) {
            addCriterion("CLOSEDTYPE <>", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeGreaterThan(String value) {
            addCriterion("CLOSEDTYPE >", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSEDTYPE >=", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeLessThan(String value) {
            addCriterion("CLOSEDTYPE <", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeLessThanOrEqualTo(String value) {
            addCriterion("CLOSEDTYPE <=", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeLike(String value) {
            addCriterion("CLOSEDTYPE like", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeNotLike(String value) {
            addCriterion("CLOSEDTYPE not like", value, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeIn(List<String> values) {
            addCriterion("CLOSEDTYPE in", values, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeNotIn(List<String> values) {
            addCriterion("CLOSEDTYPE not in", values, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeBetween(String value1, String value2) {
            addCriterion("CLOSEDTYPE between", value1, value2, "closedtype");
            return (Criteria) this;
        }

        public Criteria andClosedtypeNotBetween(String value1, String value2) {
            addCriterion("CLOSEDTYPE not between", value1, value2, "closedtype");
            return (Criteria) this;
        }

        public Criteria andValidatedateIsNull() {
            addCriterion("VALIDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andValidatedateIsNotNull() {
            addCriterion("VALIDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andValidatedateEqualTo(String value) {
            addCriterion("VALIDATEDATE =", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateNotEqualTo(String value) {
            addCriterion("VALIDATEDATE <>", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateGreaterThan(String value) {
            addCriterion("VALIDATEDATE >", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDATEDATE >=", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateLessThan(String value) {
            addCriterion("VALIDATEDATE <", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateLessThanOrEqualTo(String value) {
            addCriterion("VALIDATEDATE <=", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateLike(String value) {
            addCriterion("VALIDATEDATE like", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateNotLike(String value) {
            addCriterion("VALIDATEDATE not like", value, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateIn(List<String> values) {
            addCriterion("VALIDATEDATE in", values, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateNotIn(List<String> values) {
            addCriterion("VALIDATEDATE not in", values, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateBetween(String value1, String value2) {
            addCriterion("VALIDATEDATE between", value1, value2, "validatedate");
            return (Criteria) this;
        }

        public Criteria andValidatedateNotBetween(String value1, String value2) {
            addCriterion("VALIDATEDATE not between", value1, value2, "validatedate");
            return (Criteria) this;
        }

        public Criteria andCaseresultIsNull() {
            addCriterion("CASERESULT is null");
            return (Criteria) this;
        }

        public Criteria andCaseresultIsNotNull() {
            addCriterion("CASERESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCaseresultEqualTo(String value) {
            addCriterion("CASERESULT =", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultNotEqualTo(String value) {
            addCriterion("CASERESULT <>", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultGreaterThan(String value) {
            addCriterion("CASERESULT >", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultGreaterThanOrEqualTo(String value) {
            addCriterion("CASERESULT >=", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultLessThan(String value) {
            addCriterion("CASERESULT <", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultLessThanOrEqualTo(String value) {
            addCriterion("CASERESULT <=", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultLike(String value) {
            addCriterion("CASERESULT like", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultNotLike(String value) {
            addCriterion("CASERESULT not like", value, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultIn(List<String> values) {
            addCriterion("CASERESULT in", values, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultNotIn(List<String> values) {
            addCriterion("CASERESULT not in", values, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultBetween(String value1, String value2) {
            addCriterion("CASERESULT between", value1, value2, "caseresult");
            return (Criteria) this;
        }

        public Criteria andCaseresultNotBetween(String value1, String value2) {
            addCriterion("CASERESULT not between", value1, value2, "caseresult");
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