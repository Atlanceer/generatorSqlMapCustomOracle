package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2COrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2COrderdetailExample() {
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

        public Criteria andOrderdetailidIsNull() {
            addCriterion("ORDERDETAILID is null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIsNotNull() {
            addCriterion("ORDERDETAILID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidEqualTo(String value) {
            addCriterion("ORDERDETAILID =", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotEqualTo(String value) {
            addCriterion("ORDERDETAILID <>", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThan(String value) {
            addCriterion("ORDERDETAILID >", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERDETAILID >=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThan(String value) {
            addCriterion("ORDERDETAILID <", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLessThanOrEqualTo(String value) {
            addCriterion("ORDERDETAILID <=", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidLike(String value) {
            addCriterion("ORDERDETAILID like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotLike(String value) {
            addCriterion("ORDERDETAILID not like", value, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidIn(List<String> values) {
            addCriterion("ORDERDETAILID in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotIn(List<String> values) {
            addCriterion("ORDERDETAILID not in", values, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidBetween(String value1, String value2) {
            addCriterion("ORDERDETAILID between", value1, value2, "orderdetailid");
            return (Criteria) this;
        }

        public Criteria andOrderdetailidNotBetween(String value1, String value2) {
            addCriterion("ORDERDETAILID not between", value1, value2, "orderdetailid");
            return (Criteria) this;
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

        public Criteria andQueryreasonIsNull() {
            addCriterion("QUERYREASON is null");
            return (Criteria) this;
        }

        public Criteria andQueryreasonIsNotNull() {
            addCriterion("QUERYREASON is not null");
            return (Criteria) this;
        }

        public Criteria andQueryreasonEqualTo(String value) {
            addCriterion("QUERYREASON =", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotEqualTo(String value) {
            addCriterion("QUERYREASON <>", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonGreaterThan(String value) {
            addCriterion("QUERYREASON >", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYREASON >=", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonLessThan(String value) {
            addCriterion("QUERYREASON <", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonLessThanOrEqualTo(String value) {
            addCriterion("QUERYREASON <=", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonLike(String value) {
            addCriterion("QUERYREASON like", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotLike(String value) {
            addCriterion("QUERYREASON not like", value, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonIn(List<String> values) {
            addCriterion("QUERYREASON in", values, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotIn(List<String> values) {
            addCriterion("QUERYREASON not in", values, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonBetween(String value1, String value2) {
            addCriterion("QUERYREASON between", value1, value2, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQueryreasonNotBetween(String value1, String value2) {
            addCriterion("QUERYREASON not between", value1, value2, "queryreason");
            return (Criteria) this;
        }

        public Criteria andQuerytypeIsNull() {
            addCriterion("QUERYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andQuerytypeIsNotNull() {
            addCriterion("QUERYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andQuerytypeEqualTo(String value) {
            addCriterion("QUERYTYPE =", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotEqualTo(String value) {
            addCriterion("QUERYTYPE <>", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeGreaterThan(String value) {
            addCriterion("QUERYTYPE >", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYTYPE >=", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeLessThan(String value) {
            addCriterion("QUERYTYPE <", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeLessThanOrEqualTo(String value) {
            addCriterion("QUERYTYPE <=", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeLike(String value) {
            addCriterion("QUERYTYPE like", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotLike(String value) {
            addCriterion("QUERYTYPE not like", value, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeIn(List<String> values) {
            addCriterion("QUERYTYPE in", values, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotIn(List<String> values) {
            addCriterion("QUERYTYPE not in", values, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeBetween(String value1, String value2) {
            addCriterion("QUERYTYPE between", value1, value2, "querytype");
            return (Criteria) this;
        }

        public Criteria andQuerytypeNotBetween(String value1, String value2) {
            addCriterion("QUERYTYPE not between", value1, value2, "querytype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNull() {
            addCriterion("REPORTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReporttypeIsNotNull() {
            addCriterion("REPORTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReporttypeEqualTo(String value) {
            addCriterion("REPORTTYPE =", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotEqualTo(String value) {
            addCriterion("REPORTTYPE <>", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThan(String value) {
            addCriterion("REPORTTYPE >", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTTYPE >=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThan(String value) {
            addCriterion("REPORTTYPE <", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLessThanOrEqualTo(String value) {
            addCriterion("REPORTTYPE <=", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeLike(String value) {
            addCriterion("REPORTTYPE like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotLike(String value) {
            addCriterion("REPORTTYPE not like", value, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeIn(List<String> values) {
            addCriterion("REPORTTYPE in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotIn(List<String> values) {
            addCriterion("REPORTTYPE not in", values, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeBetween(String value1, String value2) {
            addCriterion("REPORTTYPE between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andReporttypeNotBetween(String value1, String value2) {
            addCriterion("REPORTTYPE not between", value1, value2, "reporttype");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitIsNull() {
            addCriterion("QUERYTIMELIMIT is null");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitIsNotNull() {
            addCriterion("QUERYTIMELIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitEqualTo(String value) {
            addCriterion("QUERYTIMELIMIT =", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitNotEqualTo(String value) {
            addCriterion("QUERYTIMELIMIT <>", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitGreaterThan(String value) {
            addCriterion("QUERYTIMELIMIT >", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYTIMELIMIT >=", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitLessThan(String value) {
            addCriterion("QUERYTIMELIMIT <", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitLessThanOrEqualTo(String value) {
            addCriterion("QUERYTIMELIMIT <=", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitLike(String value) {
            addCriterion("QUERYTIMELIMIT like", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitNotLike(String value) {
            addCriterion("QUERYTIMELIMIT not like", value, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitIn(List<String> values) {
            addCriterion("QUERYTIMELIMIT in", values, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitNotIn(List<String> values) {
            addCriterion("QUERYTIMELIMIT not in", values, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitBetween(String value1, String value2) {
            addCriterion("QUERYTIMELIMIT between", value1, value2, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andQuerytimelimitNotBetween(String value1, String value2) {
            addCriterion("QUERYTIMELIMIT not between", value1, value2, "querytimelimit");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeIsNull() {
            addCriterion("REPORTMODELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeIsNotNull() {
            addCriterion("REPORTMODELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeEqualTo(String value) {
            addCriterion("REPORTMODELTYPE =", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeNotEqualTo(String value) {
            addCriterion("REPORTMODELTYPE <>", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeGreaterThan(String value) {
            addCriterion("REPORTMODELTYPE >", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTMODELTYPE >=", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeLessThan(String value) {
            addCriterion("REPORTMODELTYPE <", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeLessThanOrEqualTo(String value) {
            addCriterion("REPORTMODELTYPE <=", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeLike(String value) {
            addCriterion("REPORTMODELTYPE like", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeNotLike(String value) {
            addCriterion("REPORTMODELTYPE not like", value, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeIn(List<String> values) {
            addCriterion("REPORTMODELTYPE in", values, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeNotIn(List<String> values) {
            addCriterion("REPORTMODELTYPE not in", values, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeBetween(String value1, String value2) {
            addCriterion("REPORTMODELTYPE between", value1, value2, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andReportmodeltypeNotBetween(String value1, String value2) {
            addCriterion("REPORTMODELTYPE not between", value1, value2, "reportmodeltype");
            return (Criteria) this;
        }

        public Criteria andQuerystatusIsNull() {
            addCriterion("QUERYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andQuerystatusIsNotNull() {
            addCriterion("QUERYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andQuerystatusEqualTo(String value) {
            addCriterion("QUERYSTATUS =", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotEqualTo(String value) {
            addCriterion("QUERYSTATUS <>", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusGreaterThan(String value) {
            addCriterion("QUERYSTATUS >", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYSTATUS >=", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusLessThan(String value) {
            addCriterion("QUERYSTATUS <", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusLessThanOrEqualTo(String value) {
            addCriterion("QUERYSTATUS <=", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusLike(String value) {
            addCriterion("QUERYSTATUS like", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotLike(String value) {
            addCriterion("QUERYSTATUS not like", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusIn(List<String> values) {
            addCriterion("QUERYSTATUS in", values, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotIn(List<String> values) {
            addCriterion("QUERYSTATUS not in", values, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusBetween(String value1, String value2) {
            addCriterion("QUERYSTATUS between", value1, value2, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotBetween(String value1, String value2) {
            addCriterion("QUERYSTATUS not between", value1, value2, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescIsNull() {
            addCriterion("QUERYSTATUSDESC is null");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescIsNotNull() {
            addCriterion("QUERYSTATUSDESC is not null");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescEqualTo(String value) {
            addCriterion("QUERYSTATUSDESC =", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescNotEqualTo(String value) {
            addCriterion("QUERYSTATUSDESC <>", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescGreaterThan(String value) {
            addCriterion("QUERYSTATUSDESC >", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescGreaterThanOrEqualTo(String value) {
            addCriterion("QUERYSTATUSDESC >=", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescLessThan(String value) {
            addCriterion("QUERYSTATUSDESC <", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescLessThanOrEqualTo(String value) {
            addCriterion("QUERYSTATUSDESC <=", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescLike(String value) {
            addCriterion("QUERYSTATUSDESC like", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescNotLike(String value) {
            addCriterion("QUERYSTATUSDESC not like", value, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescIn(List<String> values) {
            addCriterion("QUERYSTATUSDESC in", values, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescNotIn(List<String> values) {
            addCriterion("QUERYSTATUSDESC not in", values, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescBetween(String value1, String value2) {
            addCriterion("QUERYSTATUSDESC between", value1, value2, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andQuerystatusdescNotBetween(String value1, String value2) {
            addCriterion("QUERYSTATUSDESC not between", value1, value2, "querystatusdesc");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNull() {
            addCriterion("DATASOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceIsNotNull() {
            addCriterion("DATASOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceEqualTo(String value) {
            addCriterion("DATASOURCE =", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotEqualTo(String value) {
            addCriterion("DATASOURCE <>", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThan(String value) {
            addCriterion("DATASOURCE >", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATASOURCE >=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThan(String value) {
            addCriterion("DATASOURCE <", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLessThanOrEqualTo(String value) {
            addCriterion("DATASOURCE <=", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceLike(String value) {
            addCriterion("DATASOURCE like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotLike(String value) {
            addCriterion("DATASOURCE not like", value, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceIn(List<String> values) {
            addCriterion("DATASOURCE in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotIn(List<String> values) {
            addCriterion("DATASOURCE not in", values, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceBetween(String value1, String value2) {
            addCriterion("DATASOURCE between", value1, value2, "datasource");
            return (Criteria) this;
        }

        public Criteria andDatasourceNotBetween(String value1, String value2) {
            addCriterion("DATASOURCE not between", value1, value2, "datasource");
            return (Criteria) this;
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

        public Criteria andEntcertnumIsNull() {
            addCriterion("ENTCERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andEntcertnumIsNotNull() {
            addCriterion("ENTCERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEntcertnumEqualTo(String value) {
            addCriterion("ENTCERTNUM =", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumNotEqualTo(String value) {
            addCriterion("ENTCERTNUM <>", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumGreaterThan(String value) {
            addCriterion("ENTCERTNUM >", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumGreaterThanOrEqualTo(String value) {
            addCriterion("ENTCERTNUM >=", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumLessThan(String value) {
            addCriterion("ENTCERTNUM <", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumLessThanOrEqualTo(String value) {
            addCriterion("ENTCERTNUM <=", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumLike(String value) {
            addCriterion("ENTCERTNUM like", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumNotLike(String value) {
            addCriterion("ENTCERTNUM not like", value, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumIn(List<String> values) {
            addCriterion("ENTCERTNUM in", values, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumNotIn(List<String> values) {
            addCriterion("ENTCERTNUM not in", values, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumBetween(String value1, String value2) {
            addCriterion("ENTCERTNUM between", value1, value2, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcertnumNotBetween(String value1, String value2) {
            addCriterion("ENTCERTNUM not between", value1, value2, "entcertnum");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeIsNull() {
            addCriterion("ENTCERTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeIsNotNull() {
            addCriterion("ENTCERTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeEqualTo(String value) {
            addCriterion("ENTCERTTYPE =", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeNotEqualTo(String value) {
            addCriterion("ENTCERTTYPE <>", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeGreaterThan(String value) {
            addCriterion("ENTCERTTYPE >", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTCERTTYPE >=", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeLessThan(String value) {
            addCriterion("ENTCERTTYPE <", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeLessThanOrEqualTo(String value) {
            addCriterion("ENTCERTTYPE <=", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeLike(String value) {
            addCriterion("ENTCERTTYPE like", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeNotLike(String value) {
            addCriterion("ENTCERTTYPE not like", value, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeIn(List<String> values) {
            addCriterion("ENTCERTTYPE in", values, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeNotIn(List<String> values) {
            addCriterion("ENTCERTTYPE not in", values, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeBetween(String value1, String value2) {
            addCriterion("ENTCERTTYPE between", value1, value2, "entcerttype");
            return (Criteria) this;
        }

        public Criteria andEntcerttypeNotBetween(String value1, String value2) {
            addCriterion("ENTCERTTYPE not between", value1, value2, "entcerttype");
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