package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CBasicborrowingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CBasicborrowingExample() {
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

        public Criteria andLoanaccountidIsNull() {
            addCriterion("LOANACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidIsNotNull() {
            addCriterion("LOANACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidEqualTo(String value) {
            addCriterion("LOANACCOUNTID =", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidNotEqualTo(String value) {
            addCriterion("LOANACCOUNTID <>", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidGreaterThan(String value) {
            addCriterion("LOANACCOUNTID >", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidGreaterThanOrEqualTo(String value) {
            addCriterion("LOANACCOUNTID >=", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidLessThan(String value) {
            addCriterion("LOANACCOUNTID <", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidLessThanOrEqualTo(String value) {
            addCriterion("LOANACCOUNTID <=", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidLike(String value) {
            addCriterion("LOANACCOUNTID like", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidNotLike(String value) {
            addCriterion("LOANACCOUNTID not like", value, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidIn(List<String> values) {
            addCriterion("LOANACCOUNTID in", values, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidNotIn(List<String> values) {
            addCriterion("LOANACCOUNTID not in", values, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidBetween(String value1, String value2) {
            addCriterion("LOANACCOUNTID between", value1, value2, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andLoanaccountidNotBetween(String value1, String value2) {
            addCriterion("LOANACCOUNTID not between", value1, value2, "loanaccountid");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusIsNull() {
            addCriterion("ACCOUNTACTIVITYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusIsNotNull() {
            addCriterion("ACCOUNTACTIVITYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusEqualTo(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS =", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusNotEqualTo(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS <>", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusGreaterThan(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS >", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS >=", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusLessThan(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS <", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS <=", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusLike(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS like", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusNotLike(String value) {
            addCriterion("ACCOUNTACTIVITYSTATUS not like", value, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusIn(List<String> values) {
            addCriterion("ACCOUNTACTIVITYSTATUS in", values, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusNotIn(List<String> values) {
            addCriterion("ACCOUNTACTIVITYSTATUS not in", values, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusBetween(String value1, String value2) {
            addCriterion("ACCOUNTACTIVITYSTATUS between", value1, value2, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andAccountactivitystatusNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTACTIVITYSTATUS not between", value1, value2, "accountactivitystatus");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountIsNull() {
            addCriterion("TYPELOANACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountIsNotNull() {
            addCriterion("TYPELOANACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountEqualTo(String value) {
            addCriterion("TYPELOANACCOUNT =", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountNotEqualTo(String value) {
            addCriterion("TYPELOANACCOUNT <>", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountGreaterThan(String value) {
            addCriterion("TYPELOANACCOUNT >", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountGreaterThanOrEqualTo(String value) {
            addCriterion("TYPELOANACCOUNT >=", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountLessThan(String value) {
            addCriterion("TYPELOANACCOUNT <", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountLessThanOrEqualTo(String value) {
            addCriterion("TYPELOANACCOUNT <=", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountLike(String value) {
            addCriterion("TYPELOANACCOUNT like", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountNotLike(String value) {
            addCriterion("TYPELOANACCOUNT not like", value, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountIn(List<String> values) {
            addCriterion("TYPELOANACCOUNT in", values, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountNotIn(List<String> values) {
            addCriterion("TYPELOANACCOUNT not in", values, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountBetween(String value1, String value2) {
            addCriterion("TYPELOANACCOUNT between", value1, value2, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTypeloanaccountNotBetween(String value1, String value2) {
            addCriterion("TYPELOANACCOUNT not between", value1, value2, "typeloanaccount");
            return (Criteria) this;
        }

        public Criteria andTermloanIsNull() {
            addCriterion("TERMLOAN is null");
            return (Criteria) this;
        }

        public Criteria andTermloanIsNotNull() {
            addCriterion("TERMLOAN is not null");
            return (Criteria) this;
        }

        public Criteria andTermloanEqualTo(String value) {
            addCriterion("TERMLOAN =", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanNotEqualTo(String value) {
            addCriterion("TERMLOAN <>", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanGreaterThan(String value) {
            addCriterion("TERMLOAN >", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanGreaterThanOrEqualTo(String value) {
            addCriterion("TERMLOAN >=", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanLessThan(String value) {
            addCriterion("TERMLOAN <", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanLessThanOrEqualTo(String value) {
            addCriterion("TERMLOAN <=", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanLike(String value) {
            addCriterion("TERMLOAN like", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanNotLike(String value) {
            addCriterion("TERMLOAN not like", value, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanIn(List<String> values) {
            addCriterion("TERMLOAN in", values, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanNotIn(List<String> values) {
            addCriterion("TERMLOAN not in", values, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanBetween(String value1, String value2) {
            addCriterion("TERMLOAN between", value1, value2, "termloan");
            return (Criteria) this;
        }

        public Criteria andTermloanNotBetween(String value1, String value2) {
            addCriterion("TERMLOAN not between", value1, value2, "termloan");
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

        public Criteria andCreditagreementIsNull() {
            addCriterion("CREDITAGREEMENT is null");
            return (Criteria) this;
        }

        public Criteria andCreditagreementIsNotNull() {
            addCriterion("CREDITAGREEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditagreementEqualTo(String value) {
            addCriterion("CREDITAGREEMENT =", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementNotEqualTo(String value) {
            addCriterion("CREDITAGREEMENT <>", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementGreaterThan(String value) {
            addCriterion("CREDITAGREEMENT >", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITAGREEMENT >=", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementLessThan(String value) {
            addCriterion("CREDITAGREEMENT <", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementLessThanOrEqualTo(String value) {
            addCriterion("CREDITAGREEMENT <=", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementLike(String value) {
            addCriterion("CREDITAGREEMENT like", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementNotLike(String value) {
            addCriterion("CREDITAGREEMENT not like", value, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementIn(List<String> values) {
            addCriterion("CREDITAGREEMENT in", values, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementNotIn(List<String> values) {
            addCriterion("CREDITAGREEMENT not in", values, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementBetween(String value1, String value2) {
            addCriterion("CREDITAGREEMENT between", value1, value2, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCreditagreementNotBetween(String value1, String value2) {
            addCriterion("CREDITAGREEMENT not between", value1, value2, "creditagreement");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassIsNull() {
            addCriterion("CATEGORYLARGECLASS is null");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassIsNotNull() {
            addCriterion("CATEGORYLARGECLASS is not null");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassEqualTo(String value) {
            addCriterion("CATEGORYLARGECLASS =", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassNotEqualTo(String value) {
            addCriterion("CATEGORYLARGECLASS <>", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassGreaterThan(String value) {
            addCriterion("CATEGORYLARGECLASS >", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYLARGECLASS >=", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassLessThan(String value) {
            addCriterion("CATEGORYLARGECLASS <", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYLARGECLASS <=", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassLike(String value) {
            addCriterion("CATEGORYLARGECLASS like", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassNotLike(String value) {
            addCriterion("CATEGORYLARGECLASS not like", value, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassIn(List<String> values) {
            addCriterion("CATEGORYLARGECLASS in", values, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassNotIn(List<String> values) {
            addCriterion("CATEGORYLARGECLASS not in", values, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassBetween(String value1, String value2) {
            addCriterion("CATEGORYLARGECLASS between", value1, value2, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorylargeclassNotBetween(String value1, String value2) {
            addCriterion("CATEGORYLARGECLASS not between", value1, value2, "categorylargeclass");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionIsNull() {
            addCriterion("CATEGORYSUBDIVISION is null");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionIsNotNull() {
            addCriterion("CATEGORYSUBDIVISION is not null");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION =", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION <>", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionGreaterThan(String value) {
            addCriterion("CATEGORYSUBDIVISION >", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION >=", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionLessThan(String value) {
            addCriterion("CATEGORYSUBDIVISION <", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYSUBDIVISION <=", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionLike(String value) {
            addCriterion("CATEGORYSUBDIVISION like", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotLike(String value) {
            addCriterion("CATEGORYSUBDIVISION not like", value, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionIn(List<String> values) {
            addCriterion("CATEGORYSUBDIVISION in", values, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotIn(List<String> values) {
            addCriterion("CATEGORYSUBDIVISION not in", values, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionBetween(String value1, String value2) {
            addCriterion("CATEGORYSUBDIVISION between", value1, value2, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andCategorysubdivisionNotBetween(String value1, String value2) {
            addCriterion("CATEGORYSUBDIVISION not between", value1, value2, "categorysubdivision");
            return (Criteria) this;
        }

        public Criteria andDateopenedIsNull() {
            addCriterion("DATEOPENED is null");
            return (Criteria) this;
        }

        public Criteria andDateopenedIsNotNull() {
            addCriterion("DATEOPENED is not null");
            return (Criteria) this;
        }

        public Criteria andDateopenedEqualTo(String value) {
            addCriterion("DATEOPENED =", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedNotEqualTo(String value) {
            addCriterion("DATEOPENED <>", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedGreaterThan(String value) {
            addCriterion("DATEOPENED >", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedGreaterThanOrEqualTo(String value) {
            addCriterion("DATEOPENED >=", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedLessThan(String value) {
            addCriterion("DATEOPENED <", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedLessThanOrEqualTo(String value) {
            addCriterion("DATEOPENED <=", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedLike(String value) {
            addCriterion("DATEOPENED like", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedNotLike(String value) {
            addCriterion("DATEOPENED not like", value, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedIn(List<String> values) {
            addCriterion("DATEOPENED in", values, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedNotIn(List<String> values) {
            addCriterion("DATEOPENED not in", values, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedBetween(String value1, String value2) {
            addCriterion("DATEOPENED between", value1, value2, "dateopened");
            return (Criteria) this;
        }

        public Criteria andDateopenedNotBetween(String value1, String value2) {
            addCriterion("DATEOPENED not between", value1, value2, "dateopened");
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

        public Criteria andDuedateIsNull() {
            addCriterion("DUEDATE is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DUEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(String value) {
            addCriterion("DUEDATE =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(String value) {
            addCriterion("DUEDATE <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(String value) {
            addCriterion("DUEDATE >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(String value) {
            addCriterion("DUEDATE >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(String value) {
            addCriterion("DUEDATE <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(String value) {
            addCriterion("DUEDATE <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLike(String value) {
            addCriterion("DUEDATE like", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotLike(String value) {
            addCriterion("DUEDATE not like", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<String> values) {
            addCriterion("DUEDATE in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<String> values) {
            addCriterion("DUEDATE not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(String value1, String value2) {
            addCriterion("DUEDATE between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(String value1, String value2) {
            addCriterion("DUEDATE not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodIsNull() {
            addCriterion("GUARANTEEMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodIsNotNull() {
            addCriterion("GUARANTEEMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodEqualTo(String value) {
            addCriterion("GUARANTEEMETHOD =", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodNotEqualTo(String value) {
            addCriterion("GUARANTEEMETHOD <>", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodGreaterThan(String value) {
            addCriterion("GUARANTEEMETHOD >", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEEMETHOD >=", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodLessThan(String value) {
            addCriterion("GUARANTEEMETHOD <", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEEMETHOD <=", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodLike(String value) {
            addCriterion("GUARANTEEMETHOD like", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodNotLike(String value) {
            addCriterion("GUARANTEEMETHOD not like", value, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodIn(List<String> values) {
            addCriterion("GUARANTEEMETHOD in", values, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodNotIn(List<String> values) {
            addCriterion("GUARANTEEMETHOD not in", values, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodBetween(String value1, String value2) {
            addCriterion("GUARANTEEMETHOD between", value1, value2, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andGuaranteemethodNotBetween(String value1, String value2) {
            addCriterion("GUARANTEEMETHOD not between", value1, value2, "guaranteemethod");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentIsNull() {
            addCriterion("OTHERREPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentIsNotNull() {
            addCriterion("OTHERREPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentEqualTo(String value) {
            addCriterion("OTHERREPAYMENT =", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotEqualTo(String value) {
            addCriterion("OTHERREPAYMENT <>", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentGreaterThan(String value) {
            addCriterion("OTHERREPAYMENT >", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERREPAYMENT >=", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentLessThan(String value) {
            addCriterion("OTHERREPAYMENT <", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentLessThanOrEqualTo(String value) {
            addCriterion("OTHERREPAYMENT <=", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentLike(String value) {
            addCriterion("OTHERREPAYMENT like", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotLike(String value) {
            addCriterion("OTHERREPAYMENT not like", value, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentIn(List<String> values) {
            addCriterion("OTHERREPAYMENT in", values, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotIn(List<String> values) {
            addCriterion("OTHERREPAYMENT not in", values, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentBetween(String value1, String value2) {
            addCriterion("OTHERREPAYMENT between", value1, value2, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andOtherrepaymentNotBetween(String value1, String value2) {
            addCriterion("OTHERREPAYMENT not between", value1, value2, "otherrepayment");
            return (Criteria) this;
        }

        public Criteria andFormdistributionIsNull() {
            addCriterion("FORMDISTRIBUTION is null");
            return (Criteria) this;
        }

        public Criteria andFormdistributionIsNotNull() {
            addCriterion("FORMDISTRIBUTION is not null");
            return (Criteria) this;
        }

        public Criteria andFormdistributionEqualTo(String value) {
            addCriterion("FORMDISTRIBUTION =", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionNotEqualTo(String value) {
            addCriterion("FORMDISTRIBUTION <>", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionGreaterThan(String value) {
            addCriterion("FORMDISTRIBUTION >", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionGreaterThanOrEqualTo(String value) {
            addCriterion("FORMDISTRIBUTION >=", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionLessThan(String value) {
            addCriterion("FORMDISTRIBUTION <", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionLessThanOrEqualTo(String value) {
            addCriterion("FORMDISTRIBUTION <=", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionLike(String value) {
            addCriterion("FORMDISTRIBUTION like", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionNotLike(String value) {
            addCriterion("FORMDISTRIBUTION not like", value, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionIn(List<String> values) {
            addCriterion("FORMDISTRIBUTION in", values, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionNotIn(List<String> values) {
            addCriterion("FORMDISTRIBUTION not in", values, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionBetween(String value1, String value2) {
            addCriterion("FORMDISTRIBUTION between", value1, value2, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andFormdistributionNotBetween(String value1, String value2) {
            addCriterion("FORMDISTRIBUTION not between", value1, value2, "formdistribution");
            return (Criteria) this;
        }

        public Criteria andLoanlogoIsNull() {
            addCriterion("LOANLOGO is null");
            return (Criteria) this;
        }

        public Criteria andLoanlogoIsNotNull() {
            addCriterion("LOANLOGO is not null");
            return (Criteria) this;
        }

        public Criteria andLoanlogoEqualTo(String value) {
            addCriterion("LOANLOGO =", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoNotEqualTo(String value) {
            addCriterion("LOANLOGO <>", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoGreaterThan(String value) {
            addCriterion("LOANLOGO >", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoGreaterThanOrEqualTo(String value) {
            addCriterion("LOANLOGO >=", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoLessThan(String value) {
            addCriterion("LOANLOGO <", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoLessThanOrEqualTo(String value) {
            addCriterion("LOANLOGO <=", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoLike(String value) {
            addCriterion("LOANLOGO like", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoNotLike(String value) {
            addCriterion("LOANLOGO not like", value, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoIn(List<String> values) {
            addCriterion("LOANLOGO in", values, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoNotIn(List<String> values) {
            addCriterion("LOANLOGO not in", values, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoBetween(String value1, String value2) {
            addCriterion("LOANLOGO between", value1, value2, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andLoanlogoNotBetween(String value1, String value2) {
            addCriterion("LOANLOGO not between", value1, value2, "loanlogo");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNull() {
            addCriterion("CLOSINGDATE is null");
            return (Criteria) this;
        }

        public Criteria andClosingdateIsNotNull() {
            addCriterion("CLOSINGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClosingdateEqualTo(String value) {
            addCriterion("CLOSINGDATE =", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotEqualTo(String value) {
            addCriterion("CLOSINGDATE <>", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThan(String value) {
            addCriterion("CLOSINGDATE >", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSINGDATE >=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThan(String value) {
            addCriterion("CLOSINGDATE <", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLessThanOrEqualTo(String value) {
            addCriterion("CLOSINGDATE <=", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateLike(String value) {
            addCriterion("CLOSINGDATE like", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotLike(String value) {
            addCriterion("CLOSINGDATE not like", value, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateIn(List<String> values) {
            addCriterion("CLOSINGDATE in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotIn(List<String> values) {
            addCriterion("CLOSINGDATE not in", values, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateBetween(String value1, String value2) {
            addCriterion("CLOSINGDATE between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andClosingdateNotBetween(String value1, String value2) {
            addCriterion("CLOSINGDATE not between", value1, value2, "closingdate");
            return (Criteria) this;
        }

        public Criteria andDatereportIsNull() {
            addCriterion("DATEREPORT is null");
            return (Criteria) this;
        }

        public Criteria andDatereportIsNotNull() {
            addCriterion("DATEREPORT is not null");
            return (Criteria) this;
        }

        public Criteria andDatereportEqualTo(String value) {
            addCriterion("DATEREPORT =", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotEqualTo(String value) {
            addCriterion("DATEREPORT <>", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportGreaterThan(String value) {
            addCriterion("DATEREPORT >", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportGreaterThanOrEqualTo(String value) {
            addCriterion("DATEREPORT >=", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportLessThan(String value) {
            addCriterion("DATEREPORT <", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportLessThanOrEqualTo(String value) {
            addCriterion("DATEREPORT <=", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportLike(String value) {
            addCriterion("DATEREPORT like", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotLike(String value) {
            addCriterion("DATEREPORT not like", value, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportIn(List<String> values) {
            addCriterion("DATEREPORT in", values, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotIn(List<String> values) {
            addCriterion("DATEREPORT not in", values, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportBetween(String value1, String value2) {
            addCriterion("DATEREPORT between", value1, value2, "datereport");
            return (Criteria) this;
        }

        public Criteria andDatereportNotBetween(String value1, String value2) {
            addCriterion("DATEREPORT not between", value1, value2, "datereport");
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