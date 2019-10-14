package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CRraccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CRraccountExample() {
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

        public Criteria andAccountidIsNull() {
            addCriterion("ACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("ACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("ACCOUNTID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("ACCOUNTID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("ACCOUNTID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("ACCOUNTID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("ACCOUNTID like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("ACCOUNTID not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("ACCOUNTID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("ACCOUNTID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("ACCOUNTID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryIsNull() {
            addCriterion("BORROWERCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryIsNotNull() {
            addCriterion("BORROWERCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryEqualTo(String value) {
            addCriterion("BORROWERCATEGORY =", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryNotEqualTo(String value) {
            addCriterion("BORROWERCATEGORY <>", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryGreaterThan(String value) {
            addCriterion("BORROWERCATEGORY >", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWERCATEGORY >=", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryLessThan(String value) {
            addCriterion("BORROWERCATEGORY <", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryLessThanOrEqualTo(String value) {
            addCriterion("BORROWERCATEGORY <=", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryLike(String value) {
            addCriterion("BORROWERCATEGORY like", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryNotLike(String value) {
            addCriterion("BORROWERCATEGORY not like", value, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryIn(List<String> values) {
            addCriterion("BORROWERCATEGORY in", values, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryNotIn(List<String> values) {
            addCriterion("BORROWERCATEGORY not in", values, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryBetween(String value1, String value2) {
            addCriterion("BORROWERCATEGORY between", value1, value2, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andBorrowercategoryNotBetween(String value1, String value2) {
            addCriterion("BORROWERCATEGORY not between", value1, value2, "borrowercategory");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("ACCOUNTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("ACCOUNTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(String value) {
            addCriterion("ACCOUNTTYPE =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(String value) {
            addCriterion("ACCOUNTTYPE <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(String value) {
            addCriterion("ACCOUNTTYPE >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTYPE >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(String value) {
            addCriterion("ACCOUNTTYPE <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTTYPE <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLike(String value) {
            addCriterion("ACCOUNTTYPE like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotLike(String value) {
            addCriterion("ACCOUNTTYPE not like", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<String> values) {
            addCriterion("ACCOUNTTYPE in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<String> values) {
            addCriterion("ACCOUNTTYPE not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(String value1, String value2) {
            addCriterion("ACCOUNTTYPE between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTTYPE not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIsNull() {
            addCriterion("REPAYMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIsNotNull() {
            addCriterion("REPAYMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeEqualTo(String value) {
            addCriterion("REPAYMENTTYPE =", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotEqualTo(String value) {
            addCriterion("REPAYMENTTYPE <>", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeGreaterThan(String value) {
            addCriterion("REPAYMENTTYPE >", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTTYPE >=", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLessThan(String value) {
            addCriterion("REPAYMENTTYPE <", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTTYPE <=", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLike(String value) {
            addCriterion("REPAYMENTTYPE like", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotLike(String value) {
            addCriterion("REPAYMENTTYPE not like", value, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIn(List<String> values) {
            addCriterion("REPAYMENTTYPE in", values, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotIn(List<String> values) {
            addCriterion("REPAYMENTTYPE not in", values, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeBetween(String value1, String value2) {
            addCriterion("REPAYMENTTYPE between", value1, value2, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTTYPE not between", value1, value2, "repaymenttype");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyIsNull() {
            addCriterion("CURRENCYMONEY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyIsNotNull() {
            addCriterion("CURRENCYMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyEqualTo(String value) {
            addCriterion("CURRENCYMONEY =", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyNotEqualTo(String value) {
            addCriterion("CURRENCYMONEY <>", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyGreaterThan(String value) {
            addCriterion("CURRENCYMONEY >", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYMONEY >=", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyLessThan(String value) {
            addCriterion("CURRENCYMONEY <", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYMONEY <=", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyLike(String value) {
            addCriterion("CURRENCYMONEY like", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyNotLike(String value) {
            addCriterion("CURRENCYMONEY not like", value, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyIn(List<String> values) {
            addCriterion("CURRENCYMONEY in", values, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyNotIn(List<String> values) {
            addCriterion("CURRENCYMONEY not in", values, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyBetween(String value1, String value2) {
            addCriterion("CURRENCYMONEY between", value1, value2, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andCurrencymoneyNotBetween(String value1, String value2) {
            addCriterion("CURRENCYMONEY not between", value1, value2, "currencymoney");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentIsNull() {
            addCriterion("AMOUNTREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentIsNotNull() {
            addCriterion("AMOUNTREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentEqualTo(String value) {
            addCriterion("AMOUNTREPAYMENT =", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentNotEqualTo(String value) {
            addCriterion("AMOUNTREPAYMENT <>", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentGreaterThan(String value) {
            addCriterion("AMOUNTREPAYMENT >", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNTREPAYMENT >=", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentLessThan(String value) {
            addCriterion("AMOUNTREPAYMENT <", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentLessThanOrEqualTo(String value) {
            addCriterion("AMOUNTREPAYMENT <=", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentLike(String value) {
            addCriterion("AMOUNTREPAYMENT like", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentNotLike(String value) {
            addCriterion("AMOUNTREPAYMENT not like", value, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentIn(List<String> values) {
            addCriterion("AMOUNTREPAYMENT in", values, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentNotIn(List<String> values) {
            addCriterion("AMOUNTREPAYMENT not in", values, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentBetween(String value1, String value2) {
            addCriterion("AMOUNTREPAYMENT between", value1, value2, "amountrepayment");
            return (Criteria) this;
        }

        public Criteria andAmountrepaymentNotBetween(String value1, String value2) {
            addCriterion("AMOUNTREPAYMENT not between", value1, value2, "amountrepayment");
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

        public Criteria andBusinestypesIsNull() {
            addCriterion("BUSINESTYPES is null");
            return (Criteria) this;
        }

        public Criteria andBusinestypesIsNotNull() {
            addCriterion("BUSINESTYPES is not null");
            return (Criteria) this;
        }

        public Criteria andBusinestypesEqualTo(String value) {
            addCriterion("BUSINESTYPES =", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesNotEqualTo(String value) {
            addCriterion("BUSINESTYPES <>", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesGreaterThan(String value) {
            addCriterion("BUSINESTYPES >", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESTYPES >=", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesLessThan(String value) {
            addCriterion("BUSINESTYPES <", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesLessThanOrEqualTo(String value) {
            addCriterion("BUSINESTYPES <=", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesLike(String value) {
            addCriterion("BUSINESTYPES like", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesNotLike(String value) {
            addCriterion("BUSINESTYPES not like", value, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesIn(List<String> values) {
            addCriterion("BUSINESTYPES in", values, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesNotIn(List<String> values) {
            addCriterion("BUSINESTYPES not in", values, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesBetween(String value1, String value2) {
            addCriterion("BUSINESTYPES between", value1, value2, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinestypesNotBetween(String value1, String value2) {
            addCriterion("BUSINESTYPES not between", value1, value2, "businestypes");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationIsNull() {
            addCriterion("BUSINESSEGMENTATION is null");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationIsNotNull() {
            addCriterion("BUSINESSEGMENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION =", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION <>", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationGreaterThan(String value) {
            addCriterion("BUSINESSEGMENTATION >", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION >=", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationLessThan(String value) {
            addCriterion("BUSINESSEGMENTATION <", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSEGMENTATION <=", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationLike(String value) {
            addCriterion("BUSINESSEGMENTATION like", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotLike(String value) {
            addCriterion("BUSINESSEGMENTATION not like", value, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationIn(List<String> values) {
            addCriterion("BUSINESSEGMENTATION in", values, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotIn(List<String> values) {
            addCriterion("BUSINESSEGMENTATION not in", values, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationBetween(String value1, String value2) {
            addCriterion("BUSINESSEGMENTATION between", value1, value2, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andBusinessegmentationNotBetween(String value1, String value2) {
            addCriterion("BUSINESSEGMENTATION not between", value1, value2, "businessegmentation");
            return (Criteria) this;
        }

        public Criteria andLssuancedateIsNull() {
            addCriterion("LSSUANCEDATE is null");
            return (Criteria) this;
        }

        public Criteria andLssuancedateIsNotNull() {
            addCriterion("LSSUANCEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLssuancedateEqualTo(String value) {
            addCriterion("LSSUANCEDATE =", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotEqualTo(String value) {
            addCriterion("LSSUANCEDATE <>", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateGreaterThan(String value) {
            addCriterion("LSSUANCEDATE >", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateGreaterThanOrEqualTo(String value) {
            addCriterion("LSSUANCEDATE >=", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateLessThan(String value) {
            addCriterion("LSSUANCEDATE <", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateLessThanOrEqualTo(String value) {
            addCriterion("LSSUANCEDATE <=", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateLike(String value) {
            addCriterion("LSSUANCEDATE like", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotLike(String value) {
            addCriterion("LSSUANCEDATE not like", value, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateIn(List<String> values) {
            addCriterion("LSSUANCEDATE in", values, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotIn(List<String> values) {
            addCriterion("LSSUANCEDATE not in", values, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateBetween(String value1, String value2) {
            addCriterion("LSSUANCEDATE between", value1, value2, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLssuancedateNotBetween(String value1, String value2) {
            addCriterion("LSSUANCEDATE not between", value1, value2, "lssuancedate");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("LASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("LASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(String value) {
            addCriterion("LASTDATE =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(String value) {
            addCriterion("LASTDATE <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(String value) {
            addCriterion("LASTDATE >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(String value) {
            addCriterion("LASTDATE >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(String value) {
            addCriterion("LASTDATE <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(String value) {
            addCriterion("LASTDATE <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLike(String value) {
            addCriterion("LASTDATE like", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotLike(String value) {
            addCriterion("LASTDATE not like", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<String> values) {
            addCriterion("LASTDATE in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<String> values) {
            addCriterion("LASTDATE not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(String value1, String value2) {
            addCriterion("LASTDATE between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(String value1, String value2) {
            addCriterion("LASTDATE not between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("BALANCE =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("BALANCE <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("BALANCE >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("BALANCE <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("BALANCE <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("BALANCE like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("BALANCE not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("BALANCE in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("BALANCE not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("BALANCE between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("BALANCE not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andFivelevelIsNull() {
            addCriterion("FIVELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFivelevelIsNotNull() {
            addCriterion("FIVELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFivelevelEqualTo(String value) {
            addCriterion("FIVELEVEL =", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotEqualTo(String value) {
            addCriterion("FIVELEVEL <>", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelGreaterThan(String value) {
            addCriterion("FIVELEVEL >", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelGreaterThanOrEqualTo(String value) {
            addCriterion("FIVELEVEL >=", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelLessThan(String value) {
            addCriterion("FIVELEVEL <", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelLessThanOrEqualTo(String value) {
            addCriterion("FIVELEVEL <=", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelLike(String value) {
            addCriterion("FIVELEVEL like", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotLike(String value) {
            addCriterion("FIVELEVEL not like", value, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelIn(List<String> values) {
            addCriterion("FIVELEVEL in", values, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotIn(List<String> values) {
            addCriterion("FIVELEVEL not in", values, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelBetween(String value1, String value2) {
            addCriterion("FIVELEVEL between", value1, value2, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andFivelevelNotBetween(String value1, String value2) {
            addCriterion("FIVELEVEL not between", value1, value2, "fivelevel");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueIsNull() {
            addCriterion("TOTALOVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueIsNotNull() {
            addCriterion("TOTALOVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueEqualTo(String value) {
            addCriterion("TOTALOVERDUE =", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotEqualTo(String value) {
            addCriterion("TOTALOVERDUE <>", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueGreaterThan(String value) {
            addCriterion("TOTALOVERDUE >", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALOVERDUE >=", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueLessThan(String value) {
            addCriterion("TOTALOVERDUE <", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueLessThanOrEqualTo(String value) {
            addCriterion("TOTALOVERDUE <=", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueLike(String value) {
            addCriterion("TOTALOVERDUE like", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotLike(String value) {
            addCriterion("TOTALOVERDUE not like", value, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueIn(List<String> values) {
            addCriterion("TOTALOVERDUE in", values, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotIn(List<String> values) {
            addCriterion("TOTALOVERDUE not in", values, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueBetween(String value1, String value2) {
            addCriterion("TOTALOVERDUE between", value1, value2, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andTotaloverdueNotBetween(String value1, String value2) {
            addCriterion("TOTALOVERDUE not between", value1, value2, "totaloverdue");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalIsNull() {
            addCriterion("OVERDUEPRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalIsNotNull() {
            addCriterion("OVERDUEPRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL =", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL <>", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalGreaterThan(String value) {
            addCriterion("OVERDUEPRINCIPAL >", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL >=", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalLessThan(String value) {
            addCriterion("OVERDUEPRINCIPAL <", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEPRINCIPAL <=", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalLike(String value) {
            addCriterion("OVERDUEPRINCIPAL like", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotLike(String value) {
            addCriterion("OVERDUEPRINCIPAL not like", value, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalIn(List<String> values) {
            addCriterion("OVERDUEPRINCIPAL in", values, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotIn(List<String> values) {
            addCriterion("OVERDUEPRINCIPAL not in", values, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalBetween(String value1, String value2) {
            addCriterion("OVERDUEPRINCIPAL between", value1, value2, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalNotBetween(String value1, String value2) {
            addCriterion("OVERDUEPRINCIPAL not between", value1, value2, "overdueprincipal");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsIsNull() {
            addCriterion("OVERDUEMONTHS is null");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsIsNotNull() {
            addCriterion("OVERDUEMONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsEqualTo(String value) {
            addCriterion("OVERDUEMONTHS =", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotEqualTo(String value) {
            addCriterion("OVERDUEMONTHS <>", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsGreaterThan(String value) {
            addCriterion("OVERDUEMONTHS >", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUEMONTHS >=", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsLessThan(String value) {
            addCriterion("OVERDUEMONTHS <", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsLessThanOrEqualTo(String value) {
            addCriterion("OVERDUEMONTHS <=", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsLike(String value) {
            addCriterion("OVERDUEMONTHS like", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotLike(String value) {
            addCriterion("OVERDUEMONTHS not like", value, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsIn(List<String> values) {
            addCriterion("OVERDUEMONTHS in", values, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotIn(List<String> values) {
            addCriterion("OVERDUEMONTHS not in", values, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsBetween(String value1, String value2) {
            addCriterion("OVERDUEMONTHS between", value1, value2, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andOverduemonthsNotBetween(String value1, String value2) {
            addCriterion("OVERDUEMONTHS not between", value1, value2, "overduemonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateIsNull() {
            addCriterion("REPAYMENTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateIsNotNull() {
            addCriterion("REPAYMENTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateEqualTo(String value) {
            addCriterion("REPAYMENTSTATE =", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateNotEqualTo(String value) {
            addCriterion("REPAYMENTSTATE <>", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateGreaterThan(String value) {
            addCriterion("REPAYMENTSTATE >", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTSTATE >=", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateLessThan(String value) {
            addCriterion("REPAYMENTSTATE <", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTSTATE <=", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateLike(String value) {
            addCriterion("REPAYMENTSTATE like", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateNotLike(String value) {
            addCriterion("REPAYMENTSTATE not like", value, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateIn(List<String> values) {
            addCriterion("REPAYMENTSTATE in", values, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateNotIn(List<String> values) {
            addCriterion("REPAYMENTSTATE not in", values, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateBetween(String value1, String value2) {
            addCriterion("REPAYMENTSTATE between", value1, value2, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentstateNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTSTATE not between", value1, value2, "repaymentstate");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsIsNull() {
            addCriterion("REPAYMENTMONTHS is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsIsNotNull() {
            addCriterion("REPAYMENTMONTHS is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS =", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS <>", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsGreaterThan(String value) {
            addCriterion("REPAYMENTMONTHS >", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS >=", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsLessThan(String value) {
            addCriterion("REPAYMENTMONTHS <", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTMONTHS <=", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsLike(String value) {
            addCriterion("REPAYMENTMONTHS like", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotLike(String value) {
            addCriterion("REPAYMENTMONTHS not like", value, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsIn(List<String> values) {
            addCriterion("REPAYMENTMONTHS in", values, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotIn(List<String> values) {
            addCriterion("REPAYMENTMONTHS not in", values, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsBetween(String value1, String value2) {
            addCriterion("REPAYMENTMONTHS between", value1, value2, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andRepaymentmonthsNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTMONTHS not between", value1, value2, "repaymentmonths");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNull() {
            addCriterion("REPORTDATE is null");
            return (Criteria) this;
        }

        public Criteria andReportdateIsNotNull() {
            addCriterion("REPORTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReportdateEqualTo(String value) {
            addCriterion("REPORTDATE =", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotEqualTo(String value) {
            addCriterion("REPORTDATE <>", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThan(String value) {
            addCriterion("REPORTDATE >", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTDATE >=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThan(String value) {
            addCriterion("REPORTDATE <", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLessThanOrEqualTo(String value) {
            addCriterion("REPORTDATE <=", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateLike(String value) {
            addCriterion("REPORTDATE like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotLike(String value) {
            addCriterion("REPORTDATE not like", value, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateIn(List<String> values) {
            addCriterion("REPORTDATE in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotIn(List<String> values) {
            addCriterion("REPORTDATE not in", values, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateBetween(String value1, String value2) {
            addCriterion("REPORTDATE between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andReportdateNotBetween(String value1, String value2) {
            addCriterion("REPORTDATE not between", value1, value2, "reportdate");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("LOANAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("LOANAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(String value) {
            addCriterion("LOANAMOUNT =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(String value) {
            addCriterion("LOANAMOUNT <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(String value) {
            addCriterion("LOANAMOUNT >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(String value) {
            addCriterion("LOANAMOUNT >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(String value) {
            addCriterion("LOANAMOUNT <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(String value) {
            addCriterion("LOANAMOUNT <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLike(String value) {
            addCriterion("LOANAMOUNT like", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotLike(String value) {
            addCriterion("LOANAMOUNT not like", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<String> values) {
            addCriterion("LOANAMOUNT in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<String> values) {
            addCriterion("LOANAMOUNT not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(String value1, String value2) {
            addCriterion("LOANAMOUNT between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(String value1, String value2) {
            addCriterion("LOANAMOUNT not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andCreditlineIsNull() {
            addCriterion("CREDITLINE is null");
            return (Criteria) this;
        }

        public Criteria andCreditlineIsNotNull() {
            addCriterion("CREDITLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlineEqualTo(String value) {
            addCriterion("CREDITLINE =", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineNotEqualTo(String value) {
            addCriterion("CREDITLINE <>", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineGreaterThan(String value) {
            addCriterion("CREDITLINE >", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITLINE >=", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineLessThan(String value) {
            addCriterion("CREDITLINE <", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineLessThanOrEqualTo(String value) {
            addCriterion("CREDITLINE <=", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineLike(String value) {
            addCriterion("CREDITLINE like", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineNotLike(String value) {
            addCriterion("CREDITLINE not like", value, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineIn(List<String> values) {
            addCriterion("CREDITLINE in", values, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineNotIn(List<String> values) {
            addCriterion("CREDITLINE not in", values, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineBetween(String value1, String value2) {
            addCriterion("CREDITLINE between", value1, value2, "creditline");
            return (Criteria) this;
        }

        public Criteria andCreditlineNotBetween(String value1, String value2) {
            addCriterion("CREDITLINE not between", value1, value2, "creditline");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberIsNull() {
            addCriterion("GUARANTEECONTRACTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberIsNotNull() {
            addCriterion("GUARANTEECONTRACTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER =", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER <>", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberGreaterThan(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER >", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER >=", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberLessThan(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER <", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER <=", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberLike(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER like", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotLike(String value) {
            addCriterion("GUARANTEECONTRACTNUMBER not like", value, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberIn(List<String> values) {
            addCriterion("GUARANTEECONTRACTNUMBER in", values, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotIn(List<String> values) {
            addCriterion("GUARANTEECONTRACTNUMBER not in", values, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberBetween(String value1, String value2) {
            addCriterion("GUARANTEECONTRACTNUMBER between", value1, value2, "guaranteecontractnumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteecontractnumberNotBetween(String value1, String value2) {
            addCriterion("GUARANTEECONTRACTNUMBER not between", value1, value2, "guaranteecontractnumber");
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