package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CBasicprofileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CBasicprofileExample() {
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

        public Criteria andEconomictypeIsNull() {
            addCriterion("ECONOMICTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEconomictypeIsNotNull() {
            addCriterion("ECONOMICTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEconomictypeEqualTo(String value) {
            addCriterion("ECONOMICTYPE =", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeNotEqualTo(String value) {
            addCriterion("ECONOMICTYPE <>", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeGreaterThan(String value) {
            addCriterion("ECONOMICTYPE >", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeGreaterThanOrEqualTo(String value) {
            addCriterion("ECONOMICTYPE >=", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeLessThan(String value) {
            addCriterion("ECONOMICTYPE <", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeLessThanOrEqualTo(String value) {
            addCriterion("ECONOMICTYPE <=", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeLike(String value) {
            addCriterion("ECONOMICTYPE like", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeNotLike(String value) {
            addCriterion("ECONOMICTYPE not like", value, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeIn(List<String> values) {
            addCriterion("ECONOMICTYPE in", values, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeNotIn(List<String> values) {
            addCriterion("ECONOMICTYPE not in", values, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeBetween(String value1, String value2) {
            addCriterion("ECONOMICTYPE between", value1, value2, "economictype");
            return (Criteria) this;
        }

        public Criteria andEconomictypeNotBetween(String value1, String value2) {
            addCriterion("ECONOMICTYPE not between", value1, value2, "economictype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeIsNull() {
            addCriterion("ORGANIZATIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeIsNotNull() {
            addCriterion("ORGANIZATIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeEqualTo(String value) {
            addCriterion("ORGANIZATIONTYPE =", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotEqualTo(String value) {
            addCriterion("ORGANIZATIONTYPE <>", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeGreaterThan(String value) {
            addCriterion("ORGANIZATIONTYPE >", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONTYPE >=", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeLessThan(String value) {
            addCriterion("ORGANIZATIONTYPE <", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONTYPE <=", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeLike(String value) {
            addCriterion("ORGANIZATIONTYPE like", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotLike(String value) {
            addCriterion("ORGANIZATIONTYPE not like", value, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeIn(List<String> values) {
            addCriterion("ORGANIZATIONTYPE in", values, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotIn(List<String> values) {
            addCriterion("ORGANIZATIONTYPE not in", values, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONTYPE between", value1, value2, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andOrganizationtypeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONTYPE not between", value1, value2, "organizationtype");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleIsNull() {
            addCriterion("ENTERPRISESCALE is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleIsNotNull() {
            addCriterion("ENTERPRISESCALE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleEqualTo(String value) {
            addCriterion("ENTERPRISESCALE =", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleNotEqualTo(String value) {
            addCriterion("ENTERPRISESCALE <>", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleGreaterThan(String value) {
            addCriterion("ENTERPRISESCALE >", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISESCALE >=", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleLessThan(String value) {
            addCriterion("ENTERPRISESCALE <", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISESCALE <=", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleLike(String value) {
            addCriterion("ENTERPRISESCALE like", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleNotLike(String value) {
            addCriterion("ENTERPRISESCALE not like", value, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleIn(List<String> values) {
            addCriterion("ENTERPRISESCALE in", values, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleNotIn(List<String> values) {
            addCriterion("ENTERPRISESCALE not in", values, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleBetween(String value1, String value2) {
            addCriterion("ENTERPRISESCALE between", value1, value2, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andEnterprisescaleNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISESCALE not between", value1, value2, "enterprisescale");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andRegaddIsNull() {
            addCriterion("REGADD is null");
            return (Criteria) this;
        }

        public Criteria andRegaddIsNotNull() {
            addCriterion("REGADD is not null");
            return (Criteria) this;
        }

        public Criteria andRegaddEqualTo(String value) {
            addCriterion("REGADD =", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddNotEqualTo(String value) {
            addCriterion("REGADD <>", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddGreaterThan(String value) {
            addCriterion("REGADD >", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddGreaterThanOrEqualTo(String value) {
            addCriterion("REGADD >=", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddLessThan(String value) {
            addCriterion("REGADD <", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddLessThanOrEqualTo(String value) {
            addCriterion("REGADD <=", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddLike(String value) {
            addCriterion("REGADD like", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddNotLike(String value) {
            addCriterion("REGADD not like", value, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddIn(List<String> values) {
            addCriterion("REGADD in", values, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddNotIn(List<String> values) {
            addCriterion("REGADD not in", values, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddBetween(String value1, String value2) {
            addCriterion("REGADD between", value1, value2, "regadd");
            return (Criteria) this;
        }

        public Criteria andRegaddNotBetween(String value1, String value2) {
            addCriterion("REGADD not between", value1, value2, "regadd");
            return (Criteria) this;
        }

        public Criteria andSetupyearIsNull() {
            addCriterion("SETUPYEAR is null");
            return (Criteria) this;
        }

        public Criteria andSetupyearIsNotNull() {
            addCriterion("SETUPYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andSetupyearEqualTo(String value) {
            addCriterion("SETUPYEAR =", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearNotEqualTo(String value) {
            addCriterion("SETUPYEAR <>", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearGreaterThan(String value) {
            addCriterion("SETUPYEAR >", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearGreaterThanOrEqualTo(String value) {
            addCriterion("SETUPYEAR >=", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearLessThan(String value) {
            addCriterion("SETUPYEAR <", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearLessThanOrEqualTo(String value) {
            addCriterion("SETUPYEAR <=", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearLike(String value) {
            addCriterion("SETUPYEAR like", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearNotLike(String value) {
            addCriterion("SETUPYEAR not like", value, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearIn(List<String> values) {
            addCriterion("SETUPYEAR in", values, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearNotIn(List<String> values) {
            addCriterion("SETUPYEAR not in", values, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearBetween(String value1, String value2) {
            addCriterion("SETUPYEAR between", value1, value2, "setupyear");
            return (Criteria) this;
        }

        public Criteria andSetupyearNotBetween(String value1, String value2) {
            addCriterion("SETUPYEAR not between", value1, value2, "setupyear");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("DEADLINE =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("DEADLINE <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("DEADLINE >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("DEADLINE >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("DEADLINE <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("DEADLINE <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("DEADLINE like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("DEADLINE not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("DEADLINE in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("DEADLINE not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("DEADLINE between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("DEADLINE not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andOperatingaddIsNull() {
            addCriterion("OPERATINGADD is null");
            return (Criteria) this;
        }

        public Criteria andOperatingaddIsNotNull() {
            addCriterion("OPERATINGADD is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingaddEqualTo(String value) {
            addCriterion("OPERATINGADD =", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddNotEqualTo(String value) {
            addCriterion("OPERATINGADD <>", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddGreaterThan(String value) {
            addCriterion("OPERATINGADD >", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATINGADD >=", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddLessThan(String value) {
            addCriterion("OPERATINGADD <", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddLessThanOrEqualTo(String value) {
            addCriterion("OPERATINGADD <=", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddLike(String value) {
            addCriterion("OPERATINGADD like", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddNotLike(String value) {
            addCriterion("OPERATINGADD not like", value, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddIn(List<String> values) {
            addCriterion("OPERATINGADD in", values, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddNotIn(List<String> values) {
            addCriterion("OPERATINGADD not in", values, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddBetween(String value1, String value2) {
            addCriterion("OPERATINGADD between", value1, value2, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andOperatingaddNotBetween(String value1, String value2) {
            addCriterion("OPERATINGADD not between", value1, value2, "operatingadd");
            return (Criteria) this;
        }

        public Criteria andStateexistenceIsNull() {
            addCriterion("STATEEXISTENCE is null");
            return (Criteria) this;
        }

        public Criteria andStateexistenceIsNotNull() {
            addCriterion("STATEEXISTENCE is not null");
            return (Criteria) this;
        }

        public Criteria andStateexistenceEqualTo(String value) {
            addCriterion("STATEEXISTENCE =", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceNotEqualTo(String value) {
            addCriterion("STATEEXISTENCE <>", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceGreaterThan(String value) {
            addCriterion("STATEEXISTENCE >", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceGreaterThanOrEqualTo(String value) {
            addCriterion("STATEEXISTENCE >=", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceLessThan(String value) {
            addCriterion("STATEEXISTENCE <", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceLessThanOrEqualTo(String value) {
            addCriterion("STATEEXISTENCE <=", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceLike(String value) {
            addCriterion("STATEEXISTENCE like", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceNotLike(String value) {
            addCriterion("STATEEXISTENCE not like", value, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceIn(List<String> values) {
            addCriterion("STATEEXISTENCE in", values, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceNotIn(List<String> values) {
            addCriterion("STATEEXISTENCE not in", values, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceBetween(String value1, String value2) {
            addCriterion("STATEEXISTENCE between", value1, value2, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andStateexistenceNotBetween(String value1, String value2) {
            addCriterion("STATEEXISTENCE not between", value1, value2, "stateexistence");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNull() {
            addCriterion("REGCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNotNull() {
            addCriterion("REGCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalEqualTo(String value) {
            addCriterion("REGCAPITAL =", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotEqualTo(String value) {
            addCriterion("REGCAPITAL <>", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThan(String value) {
            addCriterion("REGCAPITAL >", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("REGCAPITAL >=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThan(String value) {
            addCriterion("REGCAPITAL <", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThanOrEqualTo(String value) {
            addCriterion("REGCAPITAL <=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLike(String value) {
            addCriterion("REGCAPITAL like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotLike(String value) {
            addCriterion("REGCAPITAL not like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIn(List<String> values) {
            addCriterion("REGCAPITAL in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotIn(List<String> values) {
            addCriterion("REGCAPITAL not in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalBetween(String value1, String value2) {
            addCriterion("REGCAPITAL between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotBetween(String value1, String value2) {
            addCriterion("REGCAPITAL not between", value1, value2, "regcapital");
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