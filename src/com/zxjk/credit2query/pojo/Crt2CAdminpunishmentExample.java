package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CAdminpunishmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CAdminpunishmentExample() {
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

        public Criteria andPenaltyidIsNull() {
            addCriterion("PENALTYID is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyidIsNotNull() {
            addCriterion("PENALTYID is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyidEqualTo(String value) {
            addCriterion("PENALTYID =", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidNotEqualTo(String value) {
            addCriterion("PENALTYID <>", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidGreaterThan(String value) {
            addCriterion("PENALTYID >", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidGreaterThanOrEqualTo(String value) {
            addCriterion("PENALTYID >=", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidLessThan(String value) {
            addCriterion("PENALTYID <", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidLessThanOrEqualTo(String value) {
            addCriterion("PENALTYID <=", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidLike(String value) {
            addCriterion("PENALTYID like", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidNotLike(String value) {
            addCriterion("PENALTYID not like", value, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidIn(List<String> values) {
            addCriterion("PENALTYID in", values, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidNotIn(List<String> values) {
            addCriterion("PENALTYID not in", values, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidBetween(String value1, String value2) {
            addCriterion("PENALTYID between", value1, value2, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPenaltyidNotBetween(String value1, String value2) {
            addCriterion("PENALTYID not between", value1, value2, "penaltyid");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityIsNull() {
            addCriterion("PUNISHMENTAUTHORITY is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityIsNotNull() {
            addCriterion("PUNISHMENTAUTHORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityEqualTo(String value) {
            addCriterion("PUNISHMENTAUTHORITY =", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityNotEqualTo(String value) {
            addCriterion("PUNISHMENTAUTHORITY <>", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityGreaterThan(String value) {
            addCriterion("PUNISHMENTAUTHORITY >", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTAUTHORITY >=", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityLessThan(String value) {
            addCriterion("PUNISHMENTAUTHORITY <", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityLessThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTAUTHORITY <=", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityLike(String value) {
            addCriterion("PUNISHMENTAUTHORITY like", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityNotLike(String value) {
            addCriterion("PUNISHMENTAUTHORITY not like", value, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityIn(List<String> values) {
            addCriterion("PUNISHMENTAUTHORITY in", values, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityNotIn(List<String> values) {
            addCriterion("PUNISHMENTAUTHORITY not in", values, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityBetween(String value1, String value2) {
            addCriterion("PUNISHMENTAUTHORITY between", value1, value2, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentauthorityNotBetween(String value1, String value2) {
            addCriterion("PUNISHMENTAUTHORITY not between", value1, value2, "punishmentauthority");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumIsNull() {
            addCriterion("PUNISHMENTDOCUMENTNUM is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumIsNotNull() {
            addCriterion("PUNISHMENTDOCUMENTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumEqualTo(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM =", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumNotEqualTo(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM <>", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumGreaterThan(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM >", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM >=", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumLessThan(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM <", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumLessThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM <=", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumLike(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM like", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumNotLike(String value) {
            addCriterion("PUNISHMENTDOCUMENTNUM not like", value, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumIn(List<String> values) {
            addCriterion("PUNISHMENTDOCUMENTNUM in", values, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumNotIn(List<String> values) {
            addCriterion("PUNISHMENTDOCUMENTNUM not in", values, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumBetween(String value1, String value2) {
            addCriterion("PUNISHMENTDOCUMENTNUM between", value1, value2, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andPunishmentdocumentnumNotBetween(String value1, String value2) {
            addCriterion("PUNISHMENTDOCUMENTNUM not between", value1, value2, "punishmentdocumentnum");
            return (Criteria) this;
        }

        public Criteria andIllegalactionIsNull() {
            addCriterion("ILLEGALACTION is null");
            return (Criteria) this;
        }

        public Criteria andIllegalactionIsNotNull() {
            addCriterion("ILLEGALACTION is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalactionEqualTo(String value) {
            addCriterion("ILLEGALACTION =", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionNotEqualTo(String value) {
            addCriterion("ILLEGALACTION <>", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionGreaterThan(String value) {
            addCriterion("ILLEGALACTION >", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionGreaterThanOrEqualTo(String value) {
            addCriterion("ILLEGALACTION >=", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionLessThan(String value) {
            addCriterion("ILLEGALACTION <", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionLessThanOrEqualTo(String value) {
            addCriterion("ILLEGALACTION <=", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionLike(String value) {
            addCriterion("ILLEGALACTION like", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionNotLike(String value) {
            addCriterion("ILLEGALACTION not like", value, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionIn(List<String> values) {
            addCriterion("ILLEGALACTION in", values, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionNotIn(List<String> values) {
            addCriterion("ILLEGALACTION not in", values, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionBetween(String value1, String value2) {
            addCriterion("ILLEGALACTION between", value1, value2, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andIllegalactionNotBetween(String value1, String value2) {
            addCriterion("ILLEGALACTION not between", value1, value2, "illegalaction");
            return (Criteria) this;
        }

        public Criteria andPunishdecideIsNull() {
            addCriterion("PUNISHDECIDE is null");
            return (Criteria) this;
        }

        public Criteria andPunishdecideIsNotNull() {
            addCriterion("PUNISHDECIDE is not null");
            return (Criteria) this;
        }

        public Criteria andPunishdecideEqualTo(String value) {
            addCriterion("PUNISHDECIDE =", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideNotEqualTo(String value) {
            addCriterion("PUNISHDECIDE <>", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideGreaterThan(String value) {
            addCriterion("PUNISHDECIDE >", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHDECIDE >=", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideLessThan(String value) {
            addCriterion("PUNISHDECIDE <", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideLessThanOrEqualTo(String value) {
            addCriterion("PUNISHDECIDE <=", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideLike(String value) {
            addCriterion("PUNISHDECIDE like", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideNotLike(String value) {
            addCriterion("PUNISHDECIDE not like", value, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideIn(List<String> values) {
            addCriterion("PUNISHDECIDE in", values, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideNotIn(List<String> values) {
            addCriterion("PUNISHDECIDE not in", values, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideBetween(String value1, String value2) {
            addCriterion("PUNISHDECIDE between", value1, value2, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishdecideNotBetween(String value1, String value2) {
            addCriterion("PUNISHDECIDE not between", value1, value2, "punishdecide");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateIsNull() {
            addCriterion("PUNISHMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateIsNotNull() {
            addCriterion("PUNISHMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateEqualTo(String value) {
            addCriterion("PUNISHMENTDATE =", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateNotEqualTo(String value) {
            addCriterion("PUNISHMENTDATE <>", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateGreaterThan(String value) {
            addCriterion("PUNISHMENTDATE >", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTDATE >=", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateLessThan(String value) {
            addCriterion("PUNISHMENTDATE <", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateLessThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTDATE <=", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateLike(String value) {
            addCriterion("PUNISHMENTDATE like", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateNotLike(String value) {
            addCriterion("PUNISHMENTDATE not like", value, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateIn(List<String> values) {
            addCriterion("PUNISHMENTDATE in", values, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateNotIn(List<String> values) {
            addCriterion("PUNISHMENTDATE not in", values, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateBetween(String value1, String value2) {
            addCriterion("PUNISHMENTDATE between", value1, value2, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentdateNotBetween(String value1, String value2) {
            addCriterion("PUNISHMENTDATE not between", value1, value2, "punishmentdate");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountIsNull() {
            addCriterion("PUNISHMENTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountIsNotNull() {
            addCriterion("PUNISHMENTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountEqualTo(String value) {
            addCriterion("PUNISHMENTAMOUNT =", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountNotEqualTo(String value) {
            addCriterion("PUNISHMENTAMOUNT <>", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountGreaterThan(String value) {
            addCriterion("PUNISHMENTAMOUNT >", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTAMOUNT >=", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountLessThan(String value) {
            addCriterion("PUNISHMENTAMOUNT <", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountLessThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTAMOUNT <=", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountLike(String value) {
            addCriterion("PUNISHMENTAMOUNT like", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountNotLike(String value) {
            addCriterion("PUNISHMENTAMOUNT not like", value, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountIn(List<String> values) {
            addCriterion("PUNISHMENTAMOUNT in", values, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountNotIn(List<String> values) {
            addCriterion("PUNISHMENTAMOUNT not in", values, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountBetween(String value1, String value2) {
            addCriterion("PUNISHMENTAMOUNT between", value1, value2, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentamountNotBetween(String value1, String value2) {
            addCriterion("PUNISHMENTAMOUNT not between", value1, value2, "punishmentamount");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationIsNull() {
            addCriterion("PUNISHMENTIMPLEMENTATION is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationIsNotNull() {
            addCriterion("PUNISHMENTIMPLEMENTATION is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationEqualTo(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION =", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationNotEqualTo(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION <>", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationGreaterThan(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION >", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION >=", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationLessThan(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION <", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationLessThanOrEqualTo(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION <=", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationLike(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION like", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationNotLike(String value) {
            addCriterion("PUNISHMENTIMPLEMENTATION not like", value, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationIn(List<String> values) {
            addCriterion("PUNISHMENTIMPLEMENTATION in", values, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationNotIn(List<String> values) {
            addCriterion("PUNISHMENTIMPLEMENTATION not in", values, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationBetween(String value1, String value2) {
            addCriterion("PUNISHMENTIMPLEMENTATION between", value1, value2, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andPunishmentimplementationNotBetween(String value1, String value2) {
            addCriterion("PUNISHMENTIMPLEMENTATION not between", value1, value2, "punishmentimplementation");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
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