package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.List;

public class Crt2CHousingfundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CHousingfundExample() {
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

        public Criteria andAccountidIsNull() {
            addCriterion("ACCOUNTID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("ACCOUNTID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("ACCOUNTID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("ACCOUNTID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("ACCOUNTID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("ACCOUNTID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("ACCOUNTID like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("ACCOUNTID not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("ACCOUNTID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("ACCOUNTID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("ACCOUNTID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstIsNull() {
            addCriterion("PAYDATEFIRST is null");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstIsNotNull() {
            addCriterion("PAYDATEFIRST is not null");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstEqualTo(String value) {
            addCriterion("PAYDATEFIRST =", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstNotEqualTo(String value) {
            addCriterion("PAYDATEFIRST <>", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstGreaterThan(String value) {
            addCriterion("PAYDATEFIRST >", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstGreaterThanOrEqualTo(String value) {
            addCriterion("PAYDATEFIRST >=", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstLessThan(String value) {
            addCriterion("PAYDATEFIRST <", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstLessThanOrEqualTo(String value) {
            addCriterion("PAYDATEFIRST <=", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstLike(String value) {
            addCriterion("PAYDATEFIRST like", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstNotLike(String value) {
            addCriterion("PAYDATEFIRST not like", value, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstIn(List<String> values) {
            addCriterion("PAYDATEFIRST in", values, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstNotIn(List<String> values) {
            addCriterion("PAYDATEFIRST not in", values, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstBetween(String value1, String value2) {
            addCriterion("PAYDATEFIRST between", value1, value2, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andPaydatefirstNotBetween(String value1, String value2) {
            addCriterion("PAYDATEFIRST not between", value1, value2, "paydatefirst");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNull() {
            addCriterion("EMPLOYEENUM is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNotNull() {
            addCriterion("EMPLOYEENUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumEqualTo(String value) {
            addCriterion("EMPLOYEENUM =", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotEqualTo(String value) {
            addCriterion("EMPLOYEENUM <>", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThan(String value) {
            addCriterion("EMPLOYEENUM >", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEENUM >=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThan(String value) {
            addCriterion("EMPLOYEENUM <", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEENUM <=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLike(String value) {
            addCriterion("EMPLOYEENUM like", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotLike(String value) {
            addCriterion("EMPLOYEENUM not like", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIn(List<String> values) {
            addCriterion("EMPLOYEENUM in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotIn(List<String> values) {
            addCriterion("EMPLOYEENUM not in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumBetween(String value1, String value2) {
            addCriterion("EMPLOYEENUM between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEENUM not between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyIsNull() {
            addCriterion("BASICMONEY is null");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyIsNotNull() {
            addCriterion("BASICMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyEqualTo(String value) {
            addCriterion("BASICMONEY =", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyNotEqualTo(String value) {
            addCriterion("BASICMONEY <>", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyGreaterThan(String value) {
            addCriterion("BASICMONEY >", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("BASICMONEY >=", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyLessThan(String value) {
            addCriterion("BASICMONEY <", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyLessThanOrEqualTo(String value) {
            addCriterion("BASICMONEY <=", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyLike(String value) {
            addCriterion("BASICMONEY like", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyNotLike(String value) {
            addCriterion("BASICMONEY not like", value, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyIn(List<String> values) {
            addCriterion("BASICMONEY in", values, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyNotIn(List<String> values) {
            addCriterion("BASICMONEY not in", values, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyBetween(String value1, String value2) {
            addCriterion("BASICMONEY between", value1, value2, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andBasicmoneyNotBetween(String value1, String value2) {
            addCriterion("BASICMONEY not between", value1, value2, "basicmoney");
            return (Criteria) this;
        }

        public Criteria andDaterecentIsNull() {
            addCriterion("DATERECENT is null");
            return (Criteria) this;
        }

        public Criteria andDaterecentIsNotNull() {
            addCriterion("DATERECENT is not null");
            return (Criteria) this;
        }

        public Criteria andDaterecentEqualTo(String value) {
            addCriterion("DATERECENT =", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentNotEqualTo(String value) {
            addCriterion("DATERECENT <>", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentGreaterThan(String value) {
            addCriterion("DATERECENT >", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentGreaterThanOrEqualTo(String value) {
            addCriterion("DATERECENT >=", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentLessThan(String value) {
            addCriterion("DATERECENT <", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentLessThanOrEqualTo(String value) {
            addCriterion("DATERECENT <=", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentLike(String value) {
            addCriterion("DATERECENT like", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentNotLike(String value) {
            addCriterion("DATERECENT not like", value, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentIn(List<String> values) {
            addCriterion("DATERECENT in", values, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentNotIn(List<String> values) {
            addCriterion("DATERECENT not in", values, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentBetween(String value1, String value2) {
            addCriterion("DATERECENT between", value1, value2, "daterecent");
            return (Criteria) this;
        }

        public Criteria andDaterecentNotBetween(String value1, String value2) {
            addCriterion("DATERECENT not between", value1, value2, "daterecent");
            return (Criteria) this;
        }

        public Criteria andPaydateendIsNull() {
            addCriterion("PAYDATEEND is null");
            return (Criteria) this;
        }

        public Criteria andPaydateendIsNotNull() {
            addCriterion("PAYDATEEND is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateendEqualTo(String value) {
            addCriterion("PAYDATEEND =", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendNotEqualTo(String value) {
            addCriterion("PAYDATEEND <>", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendGreaterThan(String value) {
            addCriterion("PAYDATEEND >", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendGreaterThanOrEqualTo(String value) {
            addCriterion("PAYDATEEND >=", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendLessThan(String value) {
            addCriterion("PAYDATEEND <", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendLessThanOrEqualTo(String value) {
            addCriterion("PAYDATEEND <=", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendLike(String value) {
            addCriterion("PAYDATEEND like", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendNotLike(String value) {
            addCriterion("PAYDATEEND not like", value, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendIn(List<String> values) {
            addCriterion("PAYDATEEND in", values, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendNotIn(List<String> values) {
            addCriterion("PAYDATEEND not in", values, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendBetween(String value1, String value2) {
            addCriterion("PAYDATEEND between", value1, value2, "paydateend");
            return (Criteria) this;
        }

        public Criteria andPaydateendNotBetween(String value1, String value2) {
            addCriterion("PAYDATEEND not between", value1, value2, "paydateend");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIsNull() {
            addCriterion("ACCOUNTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIsNotNull() {
            addCriterion("ACCOUNTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAccountstatusEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS =", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS <>", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusGreaterThan(String value) {
            addCriterion("ACCOUNTSTATUS >", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS >=", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLessThan(String value) {
            addCriterion("ACCOUNTSTATUS <", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTATUS <=", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusLike(String value) {
            addCriterion("ACCOUNTSTATUS like", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotLike(String value) {
            addCriterion("ACCOUNTSTATUS not like", value, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusIn(List<String> values) {
            addCriterion("ACCOUNTSTATUS in", values, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotIn(List<String> values) {
            addCriterion("ACCOUNTSTATUS not in", values, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTATUS between", value1, value2, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccountstatusNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTATUS not between", value1, value2, "accountstatus");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountIsNull() {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountIsNotNull() {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT =", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT <>", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountGreaterThan(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT >", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT >=", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountLessThan(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT <", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountLessThanOrEqualTo(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT <=", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountLike(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT like", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotLike(String value) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT not like", value, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountIn(List<String> values) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT in", values, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotIn(List<String> values) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT not in", values, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountBetween(String value1, String value2) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT between", value1, value2, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedoverdueamountNotBetween(String value1, String value2) {
            addCriterion("ACCUMULATEDOVERDUEAMOUNT not between", value1, value2, "accumulatedoverdueamount");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateIsNull() {
            addCriterion("STATISTICALDATE is null");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateIsNotNull() {
            addCriterion("STATISTICALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateEqualTo(String value) {
            addCriterion("STATISTICALDATE =", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateNotEqualTo(String value) {
            addCriterion("STATISTICALDATE <>", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateGreaterThan(String value) {
            addCriterion("STATISTICALDATE >", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateGreaterThanOrEqualTo(String value) {
            addCriterion("STATISTICALDATE >=", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateLessThan(String value) {
            addCriterion("STATISTICALDATE <", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateLessThanOrEqualTo(String value) {
            addCriterion("STATISTICALDATE <=", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateLike(String value) {
            addCriterion("STATISTICALDATE like", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateNotLike(String value) {
            addCriterion("STATISTICALDATE not like", value, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateIn(List<String> values) {
            addCriterion("STATISTICALDATE in", values, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateNotIn(List<String> values) {
            addCriterion("STATISTICALDATE not in", values, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateBetween(String value1, String value2) {
            addCriterion("STATISTICALDATE between", value1, value2, "statisticaldate");
            return (Criteria) this;
        }

        public Criteria andStatisticaldateNotBetween(String value1, String value2) {
            addCriterion("STATISTICALDATE not between", value1, value2, "statisticaldate");
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