package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CPermitinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CPermitinfoExample() {
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

        public Criteria andLicenseidIsNull() {
            addCriterion("LICENSEID is null");
            return (Criteria) this;
        }

        public Criteria andLicenseidIsNotNull() {
            addCriterion("LICENSEID is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseidEqualTo(String value) {
            addCriterion("LICENSEID =", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotEqualTo(String value) {
            addCriterion("LICENSEID <>", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidGreaterThan(String value) {
            addCriterion("LICENSEID >", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSEID >=", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidLessThan(String value) {
            addCriterion("LICENSEID <", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidLessThanOrEqualTo(String value) {
            addCriterion("LICENSEID <=", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidLike(String value) {
            addCriterion("LICENSEID like", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotLike(String value) {
            addCriterion("LICENSEID not like", value, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidIn(List<String> values) {
            addCriterion("LICENSEID in", values, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotIn(List<String> values) {
            addCriterion("LICENSEID not in", values, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidBetween(String value1, String value2) {
            addCriterion("LICENSEID between", value1, value2, "licenseid");
            return (Criteria) this;
        }

        public Criteria andLicenseidNotBetween(String value1, String value2) {
            addCriterion("LICENSEID not between", value1, value2, "licenseid");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameIsNull() {
            addCriterion("PERMITORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameIsNotNull() {
            addCriterion("PERMITORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameEqualTo(String value) {
            addCriterion("PERMITORGNAME =", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameNotEqualTo(String value) {
            addCriterion("PERMITORGNAME <>", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameGreaterThan(String value) {
            addCriterion("PERMITORGNAME >", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("PERMITORGNAME >=", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameLessThan(String value) {
            addCriterion("PERMITORGNAME <", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameLessThanOrEqualTo(String value) {
            addCriterion("PERMITORGNAME <=", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameLike(String value) {
            addCriterion("PERMITORGNAME like", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameNotLike(String value) {
            addCriterion("PERMITORGNAME not like", value, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameIn(List<String> values) {
            addCriterion("PERMITORGNAME in", values, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameNotIn(List<String> values) {
            addCriterion("PERMITORGNAME not in", values, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameBetween(String value1, String value2) {
            addCriterion("PERMITORGNAME between", value1, value2, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermitorgnameNotBetween(String value1, String value2) {
            addCriterion("PERMITORGNAME not between", value1, value2, "permitorgname");
            return (Criteria) this;
        }

        public Criteria andPermittypeIsNull() {
            addCriterion("PERMITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPermittypeIsNotNull() {
            addCriterion("PERMITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPermittypeEqualTo(String value) {
            addCriterion("PERMITTYPE =", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeNotEqualTo(String value) {
            addCriterion("PERMITTYPE <>", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeGreaterThan(String value) {
            addCriterion("PERMITTYPE >", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMITTYPE >=", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeLessThan(String value) {
            addCriterion("PERMITTYPE <", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeLessThanOrEqualTo(String value) {
            addCriterion("PERMITTYPE <=", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeLike(String value) {
            addCriterion("PERMITTYPE like", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeNotLike(String value) {
            addCriterion("PERMITTYPE not like", value, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeIn(List<String> values) {
            addCriterion("PERMITTYPE in", values, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeNotIn(List<String> values) {
            addCriterion("PERMITTYPE not in", values, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeBetween(String value1, String value2) {
            addCriterion("PERMITTYPE between", value1, value2, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermittypeNotBetween(String value1, String value2) {
            addCriterion("PERMITTYPE not between", value1, value2, "permittype");
            return (Criteria) this;
        }

        public Criteria andPermitdateIsNull() {
            addCriterion("PERMITDATE is null");
            return (Criteria) this;
        }

        public Criteria andPermitdateIsNotNull() {
            addCriterion("PERMITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPermitdateEqualTo(String value) {
            addCriterion("PERMITDATE =", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateNotEqualTo(String value) {
            addCriterion("PERMITDATE <>", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateGreaterThan(String value) {
            addCriterion("PERMITDATE >", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateGreaterThanOrEqualTo(String value) {
            addCriterion("PERMITDATE >=", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateLessThan(String value) {
            addCriterion("PERMITDATE <", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateLessThanOrEqualTo(String value) {
            addCriterion("PERMITDATE <=", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateLike(String value) {
            addCriterion("PERMITDATE like", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateNotLike(String value) {
            addCriterion("PERMITDATE not like", value, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateIn(List<String> values) {
            addCriterion("PERMITDATE in", values, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateNotIn(List<String> values) {
            addCriterion("PERMITDATE not in", values, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateBetween(String value1, String value2) {
            addCriterion("PERMITDATE between", value1, value2, "permitdate");
            return (Criteria) this;
        }

        public Criteria andPermitdateNotBetween(String value1, String value2) {
            addCriterion("PERMITDATE not between", value1, value2, "permitdate");
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

        public Criteria andPermitcontentIsNull() {
            addCriterion("PERMITCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPermitcontentIsNotNull() {
            addCriterion("PERMITCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPermitcontentEqualTo(String value) {
            addCriterion("PERMITCONTENT =", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentNotEqualTo(String value) {
            addCriterion("PERMITCONTENT <>", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentGreaterThan(String value) {
            addCriterion("PERMITCONTENT >", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentGreaterThanOrEqualTo(String value) {
            addCriterion("PERMITCONTENT >=", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentLessThan(String value) {
            addCriterion("PERMITCONTENT <", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentLessThanOrEqualTo(String value) {
            addCriterion("PERMITCONTENT <=", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentLike(String value) {
            addCriterion("PERMITCONTENT like", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentNotLike(String value) {
            addCriterion("PERMITCONTENT not like", value, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentIn(List<String> values) {
            addCriterion("PERMITCONTENT in", values, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentNotIn(List<String> values) {
            addCriterion("PERMITCONTENT not in", values, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentBetween(String value1, String value2) {
            addCriterion("PERMITCONTENT between", value1, value2, "permitcontent");
            return (Criteria) this;
        }

        public Criteria andPermitcontentNotBetween(String value1, String value2) {
            addCriterion("PERMITCONTENT not between", value1, value2, "permitcontent");
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