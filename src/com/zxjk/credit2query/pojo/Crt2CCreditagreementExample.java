package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CCreditagreementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CCreditagreementExample() {
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

        public Criteria andCreaditagreementidIsNull() {
            addCriterion("CREADITAGREEMENTID is null");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidIsNotNull() {
            addCriterion("CREADITAGREEMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidEqualTo(String value) {
            addCriterion("CREADITAGREEMENTID =", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidNotEqualTo(String value) {
            addCriterion("CREADITAGREEMENTID <>", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidGreaterThan(String value) {
            addCriterion("CREADITAGREEMENTID >", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidGreaterThanOrEqualTo(String value) {
            addCriterion("CREADITAGREEMENTID >=", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidLessThan(String value) {
            addCriterion("CREADITAGREEMENTID <", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidLessThanOrEqualTo(String value) {
            addCriterion("CREADITAGREEMENTID <=", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidLike(String value) {
            addCriterion("CREADITAGREEMENTID like", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidNotLike(String value) {
            addCriterion("CREADITAGREEMENTID not like", value, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidIn(List<String> values) {
            addCriterion("CREADITAGREEMENTID in", values, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidNotIn(List<String> values) {
            addCriterion("CREADITAGREEMENTID not in", values, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidBetween(String value1, String value2) {
            addCriterion("CREADITAGREEMENTID between", value1, value2, "creaditagreementid");
            return (Criteria) this;
        }

        public Criteria andCreaditagreementidNotBetween(String value1, String value2) {
            addCriterion("CREADITAGREEMENTID not between", value1, value2, "creaditagreementid");
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

        public Criteria andCreaditlinetypeIsNull() {
            addCriterion("CREADITLINETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeIsNotNull() {
            addCriterion("CREADITLINETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeEqualTo(String value) {
            addCriterion("CREADITLINETYPE =", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeNotEqualTo(String value) {
            addCriterion("CREADITLINETYPE <>", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeGreaterThan(String value) {
            addCriterion("CREADITLINETYPE >", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREADITLINETYPE >=", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeLessThan(String value) {
            addCriterion("CREADITLINETYPE <", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeLessThanOrEqualTo(String value) {
            addCriterion("CREADITLINETYPE <=", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeLike(String value) {
            addCriterion("CREADITLINETYPE like", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeNotLike(String value) {
            addCriterion("CREADITLINETYPE not like", value, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeIn(List<String> values) {
            addCriterion("CREADITLINETYPE in", values, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeNotIn(List<String> values) {
            addCriterion("CREADITLINETYPE not in", values, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeBetween(String value1, String value2) {
            addCriterion("CREADITLINETYPE between", value1, value2, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andCreaditlinetypeNotBetween(String value1, String value2) {
            addCriterion("CREADITLINETYPE not between", value1, value2, "creaditlinetype");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignIsNull() {
            addCriterion("QUOTALOOPSIGN is null");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignIsNotNull() {
            addCriterion("QUOTALOOPSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignEqualTo(String value) {
            addCriterion("QUOTALOOPSIGN =", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignNotEqualTo(String value) {
            addCriterion("QUOTALOOPSIGN <>", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignGreaterThan(String value) {
            addCriterion("QUOTALOOPSIGN >", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignGreaterThanOrEqualTo(String value) {
            addCriterion("QUOTALOOPSIGN >=", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignLessThan(String value) {
            addCriterion("QUOTALOOPSIGN <", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignLessThanOrEqualTo(String value) {
            addCriterion("QUOTALOOPSIGN <=", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignLike(String value) {
            addCriterion("QUOTALOOPSIGN like", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignNotLike(String value) {
            addCriterion("QUOTALOOPSIGN not like", value, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignIn(List<String> values) {
            addCriterion("QUOTALOOPSIGN in", values, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignNotIn(List<String> values) {
            addCriterion("QUOTALOOPSIGN not in", values, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignBetween(String value1, String value2) {
            addCriterion("QUOTALOOPSIGN between", value1, value2, "quotaloopsign");
            return (Criteria) this;
        }

        public Criteria andQuotaloopsignNotBetween(String value1, String value2) {
            addCriterion("QUOTALOOPSIGN not between", value1, value2, "quotaloopsign");
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

        public Criteria andAmountusedIsNull() {
            addCriterion("AMOUNTUSED is null");
            return (Criteria) this;
        }

        public Criteria andAmountusedIsNotNull() {
            addCriterion("AMOUNTUSED is not null");
            return (Criteria) this;
        }

        public Criteria andAmountusedEqualTo(String value) {
            addCriterion("AMOUNTUSED =", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedNotEqualTo(String value) {
            addCriterion("AMOUNTUSED <>", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedGreaterThan(String value) {
            addCriterion("AMOUNTUSED >", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedGreaterThanOrEqualTo(String value) {
            addCriterion("AMOUNTUSED >=", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedLessThan(String value) {
            addCriterion("AMOUNTUSED <", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedLessThanOrEqualTo(String value) {
            addCriterion("AMOUNTUSED <=", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedLike(String value) {
            addCriterion("AMOUNTUSED like", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedNotLike(String value) {
            addCriterion("AMOUNTUSED not like", value, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedIn(List<String> values) {
            addCriterion("AMOUNTUSED in", values, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedNotIn(List<String> values) {
            addCriterion("AMOUNTUSED not in", values, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedBetween(String value1, String value2) {
            addCriterion("AMOUNTUSED between", value1, value2, "amountused");
            return (Criteria) this;
        }

        public Criteria andAmountusedNotBetween(String value1, String value2) {
            addCriterion("AMOUNTUSED not between", value1, value2, "amountused");
            return (Criteria) this;
        }

        public Criteria andCreditlimitIsNull() {
            addCriterion("CREDITLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitIsNotNull() {
            addCriterion("CREDITLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitEqualTo(String value) {
            addCriterion("CREDITLIMIT =", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotEqualTo(String value) {
            addCriterion("CREDITLIMIT <>", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitGreaterThan(String value) {
            addCriterion("CREDITLIMIT >", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITLIMIT >=", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitLessThan(String value) {
            addCriterion("CREDITLIMIT <", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitLessThanOrEqualTo(String value) {
            addCriterion("CREDITLIMIT <=", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitLike(String value) {
            addCriterion("CREDITLIMIT like", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotLike(String value) {
            addCriterion("CREDITLIMIT not like", value, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitIn(List<String> values) {
            addCriterion("CREDITLIMIT in", values, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotIn(List<String> values) {
            addCriterion("CREDITLIMIT not in", values, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitBetween(String value1, String value2) {
            addCriterion("CREDITLIMIT between", value1, value2, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitNotBetween(String value1, String value2) {
            addCriterion("CREDITLIMIT not between", value1, value2, "creditlimit");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberIsNull() {
            addCriterion("CREDITLIMITNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberIsNotNull() {
            addCriterion("CREDITLIMITNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberEqualTo(String value) {
            addCriterion("CREDITLIMITNUMBER =", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberNotEqualTo(String value) {
            addCriterion("CREDITLIMITNUMBER <>", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberGreaterThan(String value) {
            addCriterion("CREDITLIMITNUMBER >", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITLIMITNUMBER >=", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberLessThan(String value) {
            addCriterion("CREDITLIMITNUMBER <", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberLessThanOrEqualTo(String value) {
            addCriterion("CREDITLIMITNUMBER <=", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberLike(String value) {
            addCriterion("CREDITLIMITNUMBER like", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberNotLike(String value) {
            addCriterion("CREDITLIMITNUMBER not like", value, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberIn(List<String> values) {
            addCriterion("CREDITLIMITNUMBER in", values, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberNotIn(List<String> values) {
            addCriterion("CREDITLIMITNUMBER not in", values, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberBetween(String value1, String value2) {
            addCriterion("CREDITLIMITNUMBER between", value1, value2, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andCreditlimitnumberNotBetween(String value1, String value2) {
            addCriterion("CREDITLIMITNUMBER not between", value1, value2, "creditlimitnumber");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIsNull() {
            addCriterion("EFFECTIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIsNotNull() {
            addCriterion("EFFECTIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectivedateEqualTo(String value) {
            addCriterion("EFFECTIVEDATE =", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotEqualTo(String value) {
            addCriterion("EFFECTIVEDATE <>", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateGreaterThan(String value) {
            addCriterion("EFFECTIVEDATE >", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateGreaterThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE >=", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLessThan(String value) {
            addCriterion("EFFECTIVEDATE <", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLessThanOrEqualTo(String value) {
            addCriterion("EFFECTIVEDATE <=", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateLike(String value) {
            addCriterion("EFFECTIVEDATE like", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotLike(String value) {
            addCriterion("EFFECTIVEDATE not like", value, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateIn(List<String> values) {
            addCriterion("EFFECTIVEDATE in", values, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotIn(List<String> values) {
            addCriterion("EFFECTIVEDATE not in", values, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE between", value1, value2, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andEffectivedateNotBetween(String value1, String value2) {
            addCriterion("EFFECTIVEDATE not between", value1, value2, "effectivedate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateIsNull() {
            addCriterion("TERMINATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andTerminationdateIsNotNull() {
            addCriterion("TERMINATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTerminationdateEqualTo(String value) {
            addCriterion("TERMINATIONDATE =", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateNotEqualTo(String value) {
            addCriterion("TERMINATIONDATE <>", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateGreaterThan(String value) {
            addCriterion("TERMINATIONDATE >", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINATIONDATE >=", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateLessThan(String value) {
            addCriterion("TERMINATIONDATE <", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateLessThanOrEqualTo(String value) {
            addCriterion("TERMINATIONDATE <=", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateLike(String value) {
            addCriterion("TERMINATIONDATE like", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateNotLike(String value) {
            addCriterion("TERMINATIONDATE not like", value, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateIn(List<String> values) {
            addCriterion("TERMINATIONDATE in", values, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateNotIn(List<String> values) {
            addCriterion("TERMINATIONDATE not in", values, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateBetween(String value1, String value2) {
            addCriterion("TERMINATIONDATE between", value1, value2, "terminationdate");
            return (Criteria) this;
        }

        public Criteria andTerminationdateNotBetween(String value1, String value2) {
            addCriterion("TERMINATIONDATE not between", value1, value2, "terminationdate");
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