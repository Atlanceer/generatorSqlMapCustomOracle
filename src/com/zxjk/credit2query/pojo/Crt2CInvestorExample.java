package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CInvestorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CInvestorExample() {
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

        public Criteria andRegisterdescIsNull() {
            addCriterion("REGISTERDESC is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdescIsNotNull() {
            addCriterion("REGISTERDESC is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdescEqualTo(String value) {
            addCriterion("REGISTERDESC =", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescNotEqualTo(String value) {
            addCriterion("REGISTERDESC <>", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescGreaterThan(String value) {
            addCriterion("REGISTERDESC >", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERDESC >=", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescLessThan(String value) {
            addCriterion("REGISTERDESC <", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescLessThanOrEqualTo(String value) {
            addCriterion("REGISTERDESC <=", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescLike(String value) {
            addCriterion("REGISTERDESC like", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescNotLike(String value) {
            addCriterion("REGISTERDESC not like", value, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescIn(List<String> values) {
            addCriterion("REGISTERDESC in", values, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescNotIn(List<String> values) {
            addCriterion("REGISTERDESC not in", values, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescBetween(String value1, String value2) {
            addCriterion("REGISTERDESC between", value1, value2, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andRegisterdescNotBetween(String value1, String value2) {
            addCriterion("REGISTERDESC not between", value1, value2, "registerdesc");
            return (Criteria) this;
        }

        public Criteria andMaincontributorIsNull() {
            addCriterion("MAINCONTRIBUTOR is null");
            return (Criteria) this;
        }

        public Criteria andMaincontributorIsNotNull() {
            addCriterion("MAINCONTRIBUTOR is not null");
            return (Criteria) this;
        }

        public Criteria andMaincontributorEqualTo(String value) {
            addCriterion("MAINCONTRIBUTOR =", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorNotEqualTo(String value) {
            addCriterion("MAINCONTRIBUTOR <>", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorGreaterThan(String value) {
            addCriterion("MAINCONTRIBUTOR >", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorGreaterThanOrEqualTo(String value) {
            addCriterion("MAINCONTRIBUTOR >=", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorLessThan(String value) {
            addCriterion("MAINCONTRIBUTOR <", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorLessThanOrEqualTo(String value) {
            addCriterion("MAINCONTRIBUTOR <=", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorLike(String value) {
            addCriterion("MAINCONTRIBUTOR like", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorNotLike(String value) {
            addCriterion("MAINCONTRIBUTOR not like", value, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorIn(List<String> values) {
            addCriterion("MAINCONTRIBUTOR in", values, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorNotIn(List<String> values) {
            addCriterion("MAINCONTRIBUTOR not in", values, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorBetween(String value1, String value2) {
            addCriterion("MAINCONTRIBUTOR between", value1, value2, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andMaincontributorNotBetween(String value1, String value2) {
            addCriterion("MAINCONTRIBUTOR not between", value1, value2, "maincontributor");
            return (Criteria) this;
        }

        public Criteria andContributortypeIsNull() {
            addCriterion("CONTRIBUTORTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContributortypeIsNotNull() {
            addCriterion("CONTRIBUTORTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContributortypeEqualTo(String value) {
            addCriterion("CONTRIBUTORTYPE =", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeNotEqualTo(String value) {
            addCriterion("CONTRIBUTORTYPE <>", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeGreaterThan(String value) {
            addCriterion("CONTRIBUTORTYPE >", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORTYPE >=", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeLessThan(String value) {
            addCriterion("CONTRIBUTORTYPE <", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORTYPE <=", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeLike(String value) {
            addCriterion("CONTRIBUTORTYPE like", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeNotLike(String value) {
            addCriterion("CONTRIBUTORTYPE not like", value, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeIn(List<String> values) {
            addCriterion("CONTRIBUTORTYPE in", values, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeNotIn(List<String> values) {
            addCriterion("CONTRIBUTORTYPE not in", values, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORTYPE between", value1, value2, "contributortype");
            return (Criteria) this;
        }

        public Criteria andContributortypeNotBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORTYPE not between", value1, value2, "contributortype");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorIsNull() {
            addCriterion("CATEGORYINVESTOR is null");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorIsNotNull() {
            addCriterion("CATEGORYINVESTOR is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorEqualTo(String value) {
            addCriterion("CATEGORYINVESTOR =", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorNotEqualTo(String value) {
            addCriterion("CATEGORYINVESTOR <>", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorGreaterThan(String value) {
            addCriterion("CATEGORYINVESTOR >", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORYINVESTOR >=", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorLessThan(String value) {
            addCriterion("CATEGORYINVESTOR <", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorLessThanOrEqualTo(String value) {
            addCriterion("CATEGORYINVESTOR <=", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorLike(String value) {
            addCriterion("CATEGORYINVESTOR like", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorNotLike(String value) {
            addCriterion("CATEGORYINVESTOR not like", value, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorIn(List<String> values) {
            addCriterion("CATEGORYINVESTOR in", values, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorNotIn(List<String> values) {
            addCriterion("CATEGORYINVESTOR not in", values, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorBetween(String value1, String value2) {
            addCriterion("CATEGORYINVESTOR between", value1, value2, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andCategoryinvestorNotBetween(String value1, String value2) {
            addCriterion("CATEGORYINVESTOR not between", value1, value2, "categoryinvestor");
            return (Criteria) this;
        }

        public Criteria andContributornameIsNull() {
            addCriterion("CONTRIBUTORNAME is null");
            return (Criteria) this;
        }

        public Criteria andContributornameIsNotNull() {
            addCriterion("CONTRIBUTORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andContributornameEqualTo(String value) {
            addCriterion("CONTRIBUTORNAME =", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameNotEqualTo(String value) {
            addCriterion("CONTRIBUTORNAME <>", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameGreaterThan(String value) {
            addCriterion("CONTRIBUTORNAME >", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORNAME >=", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameLessThan(String value) {
            addCriterion("CONTRIBUTORNAME <", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameLessThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORNAME <=", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameLike(String value) {
            addCriterion("CONTRIBUTORNAME like", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameNotLike(String value) {
            addCriterion("CONTRIBUTORNAME not like", value, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameIn(List<String> values) {
            addCriterion("CONTRIBUTORNAME in", values, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameNotIn(List<String> values) {
            addCriterion("CONTRIBUTORNAME not in", values, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORNAME between", value1, value2, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributornameNotBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORNAME not between", value1, value2, "contributorname");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeIsNull() {
            addCriterion("CONTRIBUTORIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeIsNotNull() {
            addCriterion("CONTRIBUTORIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeEqualTo(String value) {
            addCriterion("CONTRIBUTORIDTYPE =", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeNotEqualTo(String value) {
            addCriterion("CONTRIBUTORIDTYPE <>", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeGreaterThan(String value) {
            addCriterion("CONTRIBUTORIDTYPE >", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORIDTYPE >=", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeLessThan(String value) {
            addCriterion("CONTRIBUTORIDTYPE <", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORIDTYPE <=", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeLike(String value) {
            addCriterion("CONTRIBUTORIDTYPE like", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeNotLike(String value) {
            addCriterion("CONTRIBUTORIDTYPE not like", value, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeIn(List<String> values) {
            addCriterion("CONTRIBUTORIDTYPE in", values, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeNotIn(List<String> values) {
            addCriterion("CONTRIBUTORIDTYPE not in", values, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORIDTYPE between", value1, value2, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridtypeNotBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORIDTYPE not between", value1, value2, "contributoridtype");
            return (Criteria) this;
        }

        public Criteria andContributoridIsNull() {
            addCriterion("CONTRIBUTORID is null");
            return (Criteria) this;
        }

        public Criteria andContributoridIsNotNull() {
            addCriterion("CONTRIBUTORID is not null");
            return (Criteria) this;
        }

        public Criteria andContributoridEqualTo(String value) {
            addCriterion("CONTRIBUTORID =", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridNotEqualTo(String value) {
            addCriterion("CONTRIBUTORID <>", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridGreaterThan(String value) {
            addCriterion("CONTRIBUTORID >", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORID >=", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridLessThan(String value) {
            addCriterion("CONTRIBUTORID <", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridLessThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTORID <=", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridLike(String value) {
            addCriterion("CONTRIBUTORID like", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridNotLike(String value) {
            addCriterion("CONTRIBUTORID not like", value, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridIn(List<String> values) {
            addCriterion("CONTRIBUTORID in", values, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridNotIn(List<String> values) {
            addCriterion("CONTRIBUTORID not in", values, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORID between", value1, value2, "contributorid");
            return (Criteria) this;
        }

        public Criteria andContributoridNotBetween(String value1, String value2) {
            addCriterion("CONTRIBUTORID not between", value1, value2, "contributorid");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateIsNull() {
            addCriterion("INVESTMENTRATE is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateIsNotNull() {
            addCriterion("INVESTMENTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateEqualTo(String value) {
            addCriterion("INVESTMENTRATE =", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotEqualTo(String value) {
            addCriterion("INVESTMENTRATE <>", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateGreaterThan(String value) {
            addCriterion("INVESTMENTRATE >", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMENTRATE >=", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateLessThan(String value) {
            addCriterion("INVESTMENTRATE <", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateLessThanOrEqualTo(String value) {
            addCriterion("INVESTMENTRATE <=", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateLike(String value) {
            addCriterion("INVESTMENTRATE like", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotLike(String value) {
            addCriterion("INVESTMENTRATE not like", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateIn(List<String> values) {
            addCriterion("INVESTMENTRATE in", values, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotIn(List<String> values) {
            addCriterion("INVESTMENTRATE not in", values, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateBetween(String value1, String value2) {
            addCriterion("INVESTMENTRATE between", value1, value2, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotBetween(String value1, String value2) {
            addCriterion("INVESTMENTRATE not between", value1, value2, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(String value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(String value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(String value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(String value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(String value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLike(String value) {
            addCriterion("UPDATEDATE like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotLike(String value) {
            addCriterion("UPDATEDATE not like", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<String> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<String> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(String value1, String value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(String value1, String value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
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