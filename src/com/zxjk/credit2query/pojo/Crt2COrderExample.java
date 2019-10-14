package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Crt2COrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2COrderExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andApplyserinoIsNull() {
            addCriterion("APPLYSERINO is null");
            return (Criteria) this;
        }

        public Criteria andApplyserinoIsNotNull() {
            addCriterion("APPLYSERINO is not null");
            return (Criteria) this;
        }

        public Criteria andApplyserinoEqualTo(String value) {
            addCriterion("APPLYSERINO =", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoNotEqualTo(String value) {
            addCriterion("APPLYSERINO <>", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoGreaterThan(String value) {
            addCriterion("APPLYSERINO >", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYSERINO >=", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoLessThan(String value) {
            addCriterion("APPLYSERINO <", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoLessThanOrEqualTo(String value) {
            addCriterion("APPLYSERINO <=", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoLike(String value) {
            addCriterion("APPLYSERINO like", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoNotLike(String value) {
            addCriterion("APPLYSERINO not like", value, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoIn(List<String> values) {
            addCriterion("APPLYSERINO in", values, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoNotIn(List<String> values) {
            addCriterion("APPLYSERINO not in", values, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoBetween(String value1, String value2) {
            addCriterion("APPLYSERINO between", value1, value2, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplyserinoNotBetween(String value1, String value2) {
            addCriterion("APPLYSERINO not between", value1, value2, "applyserino");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNull() {
            addCriterion("APPLYTIME is null");
            return (Criteria) this;
        }

        public Criteria andApplytimeIsNotNull() {
            addCriterion("APPLYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andApplytimeEqualTo(Date value) {
            addCriterion("APPLYTIME =", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotEqualTo(Date value) {
            addCriterion("APPLYTIME <>", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThan(Date value) {
            addCriterion("APPLYTIME >", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYTIME >=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThan(Date value) {
            addCriterion("APPLYTIME <", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeLessThanOrEqualTo(Date value) {
            addCriterion("APPLYTIME <=", value, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeIn(List<Date> values) {
            addCriterion("APPLYTIME in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotIn(List<Date> values) {
            addCriterion("APPLYTIME not in", values, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeBetween(Date value1, Date value2) {
            addCriterion("APPLYTIME between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andApplytimeNotBetween(Date value1, Date value2) {
            addCriterion("APPLYTIME not between", value1, value2, "applytime");
            return (Criteria) this;
        }

        public Criteria andSysidIsNull() {
            addCriterion("SYSID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("SYSID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(String value) {
            addCriterion("SYSID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(String value) {
            addCriterion("SYSID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(String value) {
            addCriterion("SYSID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(String value) {
            addCriterion("SYSID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(String value) {
            addCriterion("SYSID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLike(String value) {
            addCriterion("SYSID like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotLike(String value) {
            addCriterion("SYSID not like", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<String> values) {
            addCriterion("SYSID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<String> values) {
            addCriterion("SYSID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(String value1, String value2) {
            addCriterion("SYSID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(String value1, String value2) {
            addCriterion("SYSID not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidIsNull() {
            addCriterion("SYSQUERYORGID is null");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidIsNotNull() {
            addCriterion("SYSQUERYORGID is not null");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidEqualTo(String value) {
            addCriterion("SYSQUERYORGID =", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidNotEqualTo(String value) {
            addCriterion("SYSQUERYORGID <>", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidGreaterThan(String value) {
            addCriterion("SYSQUERYORGID >", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSQUERYORGID >=", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidLessThan(String value) {
            addCriterion("SYSQUERYORGID <", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidLessThanOrEqualTo(String value) {
            addCriterion("SYSQUERYORGID <=", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidLike(String value) {
            addCriterion("SYSQUERYORGID like", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidNotLike(String value) {
            addCriterion("SYSQUERYORGID not like", value, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidIn(List<String> values) {
            addCriterion("SYSQUERYORGID in", values, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidNotIn(List<String> values) {
            addCriterion("SYSQUERYORGID not in", values, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidBetween(String value1, String value2) {
            addCriterion("SYSQUERYORGID between", value1, value2, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryorgidNotBetween(String value1, String value2) {
            addCriterion("SYSQUERYORGID not between", value1, value2, "sysqueryorgid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridIsNull() {
            addCriterion("SYSQUERYUSERID is null");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridIsNotNull() {
            addCriterion("SYSQUERYUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridEqualTo(String value) {
            addCriterion("SYSQUERYUSERID =", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridNotEqualTo(String value) {
            addCriterion("SYSQUERYUSERID <>", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridGreaterThan(String value) {
            addCriterion("SYSQUERYUSERID >", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridGreaterThanOrEqualTo(String value) {
            addCriterion("SYSQUERYUSERID >=", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridLessThan(String value) {
            addCriterion("SYSQUERYUSERID <", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridLessThanOrEqualTo(String value) {
            addCriterion("SYSQUERYUSERID <=", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridLike(String value) {
            addCriterion("SYSQUERYUSERID like", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridNotLike(String value) {
            addCriterion("SYSQUERYUSERID not like", value, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridIn(List<String> values) {
            addCriterion("SYSQUERYUSERID in", values, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridNotIn(List<String> values) {
            addCriterion("SYSQUERYUSERID not in", values, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridBetween(String value1, String value2) {
            addCriterion("SYSQUERYUSERID between", value1, value2, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andSysqueryuseridNotBetween(String value1, String value2) {
            addCriterion("SYSQUERYUSERID not between", value1, value2, "sysqueryuserid");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("ORGCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("ORGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("ORGCODE =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("ORGCODE <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("ORGCODE >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGCODE >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("ORGCODE <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGCODE <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("ORGCODE like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("ORGCODE not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("ORGCODE in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("ORGCODE not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("ORGCODE between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("ORGCODE not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("USERID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("USERID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
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