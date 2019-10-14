package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CRewardinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CRewardinfoExample() {
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

        public Criteria andRewardidIsNull() {
            addCriterion("REWARDID is null");
            return (Criteria) this;
        }

        public Criteria andRewardidIsNotNull() {
            addCriterion("REWARDID is not null");
            return (Criteria) this;
        }

        public Criteria andRewardidEqualTo(String value) {
            addCriterion("REWARDID =", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotEqualTo(String value) {
            addCriterion("REWARDID <>", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidGreaterThan(String value) {
            addCriterion("REWARDID >", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidGreaterThanOrEqualTo(String value) {
            addCriterion("REWARDID >=", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidLessThan(String value) {
            addCriterion("REWARDID <", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidLessThanOrEqualTo(String value) {
            addCriterion("REWARDID <=", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidLike(String value) {
            addCriterion("REWARDID like", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotLike(String value) {
            addCriterion("REWARDID not like", value, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidIn(List<String> values) {
            addCriterion("REWARDID in", values, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotIn(List<String> values) {
            addCriterion("REWARDID not in", values, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidBetween(String value1, String value2) {
            addCriterion("REWARDID between", value1, value2, "rewardid");
            return (Criteria) this;
        }

        public Criteria andRewardidNotBetween(String value1, String value2) {
            addCriterion("REWARDID not between", value1, value2, "rewardid");
            return (Criteria) this;
        }

        public Criteria andAwardunitIsNull() {
            addCriterion("AWARDUNIT is null");
            return (Criteria) this;
        }

        public Criteria andAwardunitIsNotNull() {
            addCriterion("AWARDUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAwardunitEqualTo(String value) {
            addCriterion("AWARDUNIT =", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitNotEqualTo(String value) {
            addCriterion("AWARDUNIT <>", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitGreaterThan(String value) {
            addCriterion("AWARDUNIT >", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitGreaterThanOrEqualTo(String value) {
            addCriterion("AWARDUNIT >=", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitLessThan(String value) {
            addCriterion("AWARDUNIT <", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitLessThanOrEqualTo(String value) {
            addCriterion("AWARDUNIT <=", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitLike(String value) {
            addCriterion("AWARDUNIT like", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitNotLike(String value) {
            addCriterion("AWARDUNIT not like", value, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitIn(List<String> values) {
            addCriterion("AWARDUNIT in", values, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitNotIn(List<String> values) {
            addCriterion("AWARDUNIT not in", values, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitBetween(String value1, String value2) {
            addCriterion("AWARDUNIT between", value1, value2, "awardunit");
            return (Criteria) this;
        }

        public Criteria andAwardunitNotBetween(String value1, String value2) {
            addCriterion("AWARDUNIT not between", value1, value2, "awardunit");
            return (Criteria) this;
        }

        public Criteria andEncouragementIsNull() {
            addCriterion("ENCOURAGEMENT is null");
            return (Criteria) this;
        }

        public Criteria andEncouragementIsNotNull() {
            addCriterion("ENCOURAGEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andEncouragementEqualTo(String value) {
            addCriterion("ENCOURAGEMENT =", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotEqualTo(String value) {
            addCriterion("ENCOURAGEMENT <>", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementGreaterThan(String value) {
            addCriterion("ENCOURAGEMENT >", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementGreaterThanOrEqualTo(String value) {
            addCriterion("ENCOURAGEMENT >=", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementLessThan(String value) {
            addCriterion("ENCOURAGEMENT <", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementLessThanOrEqualTo(String value) {
            addCriterion("ENCOURAGEMENT <=", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementLike(String value) {
            addCriterion("ENCOURAGEMENT like", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotLike(String value) {
            addCriterion("ENCOURAGEMENT not like", value, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementIn(List<String> values) {
            addCriterion("ENCOURAGEMENT in", values, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotIn(List<String> values) {
            addCriterion("ENCOURAGEMENT not in", values, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementBetween(String value1, String value2) {
            addCriterion("ENCOURAGEMENT between", value1, value2, "encouragement");
            return (Criteria) this;
        }

        public Criteria andEncouragementNotBetween(String value1, String value2) {
            addCriterion("ENCOURAGEMENT not between", value1, value2, "encouragement");
            return (Criteria) this;
        }

        public Criteria andAwarddateIsNull() {
            addCriterion("AWARDDATE is null");
            return (Criteria) this;
        }

        public Criteria andAwarddateIsNotNull() {
            addCriterion("AWARDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAwarddateEqualTo(String value) {
            addCriterion("AWARDDATE =", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateNotEqualTo(String value) {
            addCriterion("AWARDDATE <>", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateGreaterThan(String value) {
            addCriterion("AWARDDATE >", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateGreaterThanOrEqualTo(String value) {
            addCriterion("AWARDDATE >=", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateLessThan(String value) {
            addCriterion("AWARDDATE <", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateLessThanOrEqualTo(String value) {
            addCriterion("AWARDDATE <=", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateLike(String value) {
            addCriterion("AWARDDATE like", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateNotLike(String value) {
            addCriterion("AWARDDATE not like", value, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateIn(List<String> values) {
            addCriterion("AWARDDATE in", values, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateNotIn(List<String> values) {
            addCriterion("AWARDDATE not in", values, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateBetween(String value1, String value2) {
            addCriterion("AWARDDATE between", value1, value2, "awarddate");
            return (Criteria) this;
        }

        public Criteria andAwarddateNotBetween(String value1, String value2) {
            addCriterion("AWARDDATE not between", value1, value2, "awarddate");
            return (Criteria) this;
        }

        public Criteria andValiditydateIsNull() {
            addCriterion("VALIDITYDATE is null");
            return (Criteria) this;
        }

        public Criteria andValiditydateIsNotNull() {
            addCriterion("VALIDITYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andValiditydateEqualTo(String value) {
            addCriterion("VALIDITYDATE =", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotEqualTo(String value) {
            addCriterion("VALIDITYDATE <>", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateGreaterThan(String value) {
            addCriterion("VALIDITYDATE >", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDITYDATE >=", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateLessThan(String value) {
            addCriterion("VALIDITYDATE <", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateLessThanOrEqualTo(String value) {
            addCriterion("VALIDITYDATE <=", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateLike(String value) {
            addCriterion("VALIDITYDATE like", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotLike(String value) {
            addCriterion("VALIDITYDATE not like", value, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateIn(List<String> values) {
            addCriterion("VALIDITYDATE in", values, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotIn(List<String> values) {
            addCriterion("VALIDITYDATE not in", values, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateBetween(String value1, String value2) {
            addCriterion("VALIDITYDATE between", value1, value2, "validitydate");
            return (Criteria) this;
        }

        public Criteria andValiditydateNotBetween(String value1, String value2) {
            addCriterion("VALIDITYDATE not between", value1, value2, "validitydate");
            return (Criteria) this;
        }

        public Criteria andFactIsNull() {
            addCriterion("FACT is null");
            return (Criteria) this;
        }

        public Criteria andFactIsNotNull() {
            addCriterion("FACT is not null");
            return (Criteria) this;
        }

        public Criteria andFactEqualTo(String value) {
            addCriterion("FACT =", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactNotEqualTo(String value) {
            addCriterion("FACT <>", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactGreaterThan(String value) {
            addCriterion("FACT >", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactGreaterThanOrEqualTo(String value) {
            addCriterion("FACT >=", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactLessThan(String value) {
            addCriterion("FACT <", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactLessThanOrEqualTo(String value) {
            addCriterion("FACT <=", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactLike(String value) {
            addCriterion("FACT like", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactNotLike(String value) {
            addCriterion("FACT not like", value, "fact");
            return (Criteria) this;
        }

        public Criteria andFactIn(List<String> values) {
            addCriterion("FACT in", values, "fact");
            return (Criteria) this;
        }

        public Criteria andFactNotIn(List<String> values) {
            addCriterion("FACT not in", values, "fact");
            return (Criteria) this;
        }

        public Criteria andFactBetween(String value1, String value2) {
            addCriterion("FACT between", value1, value2, "fact");
            return (Criteria) this;
        }

        public Criteria andFactNotBetween(String value1, String value2) {
            addCriterion("FACT not between", value1, value2, "fact");
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