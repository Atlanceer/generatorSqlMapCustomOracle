package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CLeadingmemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CLeadingmemberExample() {
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

        public Criteria andPrincipalmembersIsNull() {
            addCriterion("PRINCIPALMEMBERS is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersIsNotNull() {
            addCriterion("PRINCIPALMEMBERS is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersEqualTo(String value) {
            addCriterion("PRINCIPALMEMBERS =", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersNotEqualTo(String value) {
            addCriterion("PRINCIPALMEMBERS <>", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersGreaterThan(String value) {
            addCriterion("PRINCIPALMEMBERS >", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPALMEMBERS >=", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersLessThan(String value) {
            addCriterion("PRINCIPALMEMBERS <", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPALMEMBERS <=", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersLike(String value) {
            addCriterion("PRINCIPALMEMBERS like", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersNotLike(String value) {
            addCriterion("PRINCIPALMEMBERS not like", value, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersIn(List<String> values) {
            addCriterion("PRINCIPALMEMBERS in", values, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersNotIn(List<String> values) {
            addCriterion("PRINCIPALMEMBERS not in", values, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersBetween(String value1, String value2) {
            addCriterion("PRINCIPALMEMBERS between", value1, value2, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andPrincipalmembersNotBetween(String value1, String value2) {
            addCriterion("PRINCIPALMEMBERS not between", value1, value2, "principalmembers");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeIsNull() {
            addCriterion("DOCUMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeIsNotNull() {
            addCriterion("DOCUMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeEqualTo(String value) {
            addCriterion("DOCUMENTTYPE =", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeNotEqualTo(String value) {
            addCriterion("DOCUMENTTYPE <>", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeGreaterThan(String value) {
            addCriterion("DOCUMENTTYPE >", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTTYPE >=", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeLessThan(String value) {
            addCriterion("DOCUMENTTYPE <", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTTYPE <=", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeLike(String value) {
            addCriterion("DOCUMENTTYPE like", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeNotLike(String value) {
            addCriterion("DOCUMENTTYPE not like", value, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeIn(List<String> values) {
            addCriterion("DOCUMENTTYPE in", values, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeNotIn(List<String> values) {
            addCriterion("DOCUMENTTYPE not in", values, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeBetween(String value1, String value2) {
            addCriterion("DOCUMENTTYPE between", value1, value2, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumenttypeNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTTYPE not between", value1, value2, "documenttype");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberIsNull() {
            addCriterion("DOCUMENTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberIsNotNull() {
            addCriterion("DOCUMENTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberEqualTo(String value) {
            addCriterion("DOCUMENTNUMBER =", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotEqualTo(String value) {
            addCriterion("DOCUMENTNUMBER <>", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberGreaterThan(String value) {
            addCriterion("DOCUMENTNUMBER >", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("DOCUMENTNUMBER >=", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberLessThan(String value) {
            addCriterion("DOCUMENTNUMBER <", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberLessThanOrEqualTo(String value) {
            addCriterion("DOCUMENTNUMBER <=", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberLike(String value) {
            addCriterion("DOCUMENTNUMBER like", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotLike(String value) {
            addCriterion("DOCUMENTNUMBER not like", value, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberIn(List<String> values) {
            addCriterion("DOCUMENTNUMBER in", values, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotIn(List<String> values) {
            addCriterion("DOCUMENTNUMBER not in", values, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberBetween(String value1, String value2) {
            addCriterion("DOCUMENTNUMBER between", value1, value2, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andDocumentnumberNotBetween(String value1, String value2) {
            addCriterion("DOCUMENTNUMBER not between", value1, value2, "documentnumber");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
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