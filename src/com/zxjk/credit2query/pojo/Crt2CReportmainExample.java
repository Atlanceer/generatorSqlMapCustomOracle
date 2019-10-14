package com.zxjk.credit2query.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Crt2CReportmainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Crt2CReportmainExample() {
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

        public Criteria andCreditcodeIsNull() {
            addCriterion("CREDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNotNull() {
            addCriterion("CREDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeEqualTo(String value) {
            addCriterion("CREDITCODE =", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotEqualTo(String value) {
            addCriterion("CREDITCODE <>", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThan(String value) {
            addCriterion("CREDITCODE >", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITCODE >=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThan(String value) {
            addCriterion("CREDITCODE <", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThanOrEqualTo(String value) {
            addCriterion("CREDITCODE <=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLike(String value) {
            addCriterion("CREDITCODE like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotLike(String value) {
            addCriterion("CREDITCODE not like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIn(List<String> values) {
            addCriterion("CREDITCODE in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotIn(List<String> values) {
            addCriterion("CREDITCODE not in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeBetween(String value1, String value2) {
            addCriterion("CREDITCODE between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotBetween(String value1, String value2) {
            addCriterion("CREDITCODE not between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andLoancardnoIsNull() {
            addCriterion("LOANCARDNO is null");
            return (Criteria) this;
        }

        public Criteria andLoancardnoIsNotNull() {
            addCriterion("LOANCARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andLoancardnoEqualTo(String value) {
            addCriterion("LOANCARDNO =", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoNotEqualTo(String value) {
            addCriterion("LOANCARDNO <>", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoGreaterThan(String value) {
            addCriterion("LOANCARDNO >", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoGreaterThanOrEqualTo(String value) {
            addCriterion("LOANCARDNO >=", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoLessThan(String value) {
            addCriterion("LOANCARDNO <", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoLessThanOrEqualTo(String value) {
            addCriterion("LOANCARDNO <=", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoLike(String value) {
            addCriterion("LOANCARDNO like", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoNotLike(String value) {
            addCriterion("LOANCARDNO not like", value, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoIn(List<String> values) {
            addCriterion("LOANCARDNO in", values, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoNotIn(List<String> values) {
            addCriterion("LOANCARDNO not in", values, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoBetween(String value1, String value2) {
            addCriterion("LOANCARDNO between", value1, value2, "loancardno");
            return (Criteria) this;
        }

        public Criteria andLoancardnoNotBetween(String value1, String value2) {
            addCriterion("LOANCARDNO not between", value1, value2, "loancardno");
            return (Criteria) this;
        }

        public Criteria andCorpnoIsNull() {
            addCriterion("CORPNO is null");
            return (Criteria) this;
        }

        public Criteria andCorpnoIsNotNull() {
            addCriterion("CORPNO is not null");
            return (Criteria) this;
        }

        public Criteria andCorpnoEqualTo(String value) {
            addCriterion("CORPNO =", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoNotEqualTo(String value) {
            addCriterion("CORPNO <>", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoGreaterThan(String value) {
            addCriterion("CORPNO >", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoGreaterThanOrEqualTo(String value) {
            addCriterion("CORPNO >=", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoLessThan(String value) {
            addCriterion("CORPNO <", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoLessThanOrEqualTo(String value) {
            addCriterion("CORPNO <=", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoLike(String value) {
            addCriterion("CORPNO like", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoNotLike(String value) {
            addCriterion("CORPNO not like", value, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoIn(List<String> values) {
            addCriterion("CORPNO in", values, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoNotIn(List<String> values) {
            addCriterion("CORPNO not in", values, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoBetween(String value1, String value2) {
            addCriterion("CORPNO between", value1, value2, "corpno");
            return (Criteria) this;
        }

        public Criteria andCorpnoNotBetween(String value1, String value2) {
            addCriterion("CORPNO not between", value1, value2, "corpno");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIsNull() {
            addCriterion("REGISTERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIsNotNull() {
            addCriterion("REGISTERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertypeEqualTo(String value) {
            addCriterion("REGISTERTYPE =", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotEqualTo(String value) {
            addCriterion("REGISTERTYPE <>", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeGreaterThan(String value) {
            addCriterion("REGISTERTYPE >", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERTYPE >=", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLessThan(String value) {
            addCriterion("REGISTERTYPE <", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLessThanOrEqualTo(String value) {
            addCriterion("REGISTERTYPE <=", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeLike(String value) {
            addCriterion("REGISTERTYPE like", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotLike(String value) {
            addCriterion("REGISTERTYPE not like", value, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeIn(List<String> values) {
            addCriterion("REGISTERTYPE in", values, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotIn(List<String> values) {
            addCriterion("REGISTERTYPE not in", values, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeBetween(String value1, String value2) {
            addCriterion("REGISTERTYPE between", value1, value2, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegistertypeNotBetween(String value1, String value2) {
            addCriterion("REGISTERTYPE not between", value1, value2, "registertype");
            return (Criteria) this;
        }

        public Criteria andRegisternoIsNull() {
            addCriterion("REGISTERNO is null");
            return (Criteria) this;
        }

        public Criteria andRegisternoIsNotNull() {
            addCriterion("REGISTERNO is not null");
            return (Criteria) this;
        }

        public Criteria andRegisternoEqualTo(String value) {
            addCriterion("REGISTERNO =", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoNotEqualTo(String value) {
            addCriterion("REGISTERNO <>", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoGreaterThan(String value) {
            addCriterion("REGISTERNO >", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTERNO >=", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoLessThan(String value) {
            addCriterion("REGISTERNO <", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoLessThanOrEqualTo(String value) {
            addCriterion("REGISTERNO <=", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoLike(String value) {
            addCriterion("REGISTERNO like", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoNotLike(String value) {
            addCriterion("REGISTERNO not like", value, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoIn(List<String> values) {
            addCriterion("REGISTERNO in", values, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoNotIn(List<String> values) {
            addCriterion("REGISTERNO not in", values, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoBetween(String value1, String value2) {
            addCriterion("REGISTERNO between", value1, value2, "registerno");
            return (Criteria) this;
        }

        public Criteria andRegisternoNotBetween(String value1, String value2) {
            addCriterion("REGISTERNO not between", value1, value2, "registerno");
            return (Criteria) this;
        }

        public Criteria andGsreginoIsNull() {
            addCriterion("GSREGINO is null");
            return (Criteria) this;
        }

        public Criteria andGsreginoIsNotNull() {
            addCriterion("GSREGINO is not null");
            return (Criteria) this;
        }

        public Criteria andGsreginoEqualTo(String value) {
            addCriterion("GSREGINO =", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoNotEqualTo(String value) {
            addCriterion("GSREGINO <>", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoGreaterThan(String value) {
            addCriterion("GSREGINO >", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoGreaterThanOrEqualTo(String value) {
            addCriterion("GSREGINO >=", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoLessThan(String value) {
            addCriterion("GSREGINO <", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoLessThanOrEqualTo(String value) {
            addCriterion("GSREGINO <=", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoLike(String value) {
            addCriterion("GSREGINO like", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoNotLike(String value) {
            addCriterion("GSREGINO not like", value, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoIn(List<String> values) {
            addCriterion("GSREGINO in", values, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoNotIn(List<String> values) {
            addCriterion("GSREGINO not in", values, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoBetween(String value1, String value2) {
            addCriterion("GSREGINO between", value1, value2, "gsregino");
            return (Criteria) this;
        }

        public Criteria andGsreginoNotBetween(String value1, String value2) {
            addCriterion("GSREGINO not between", value1, value2, "gsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoIsNull() {
            addCriterion("DSREGINO is null");
            return (Criteria) this;
        }

        public Criteria andDsreginoIsNotNull() {
            addCriterion("DSREGINO is not null");
            return (Criteria) this;
        }

        public Criteria andDsreginoEqualTo(String value) {
            addCriterion("DSREGINO =", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoNotEqualTo(String value) {
            addCriterion("DSREGINO <>", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoGreaterThan(String value) {
            addCriterion("DSREGINO >", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoGreaterThanOrEqualTo(String value) {
            addCriterion("DSREGINO >=", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoLessThan(String value) {
            addCriterion("DSREGINO <", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoLessThanOrEqualTo(String value) {
            addCriterion("DSREGINO <=", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoLike(String value) {
            addCriterion("DSREGINO like", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoNotLike(String value) {
            addCriterion("DSREGINO not like", value, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoIn(List<String> values) {
            addCriterion("DSREGINO in", values, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoNotIn(List<String> values) {
            addCriterion("DSREGINO not in", values, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoBetween(String value1, String value2) {
            addCriterion("DSREGINO between", value1, value2, "dsregino");
            return (Criteria) this;
        }

        public Criteria andDsreginoNotBetween(String value1, String value2) {
            addCriterion("DSREGINO not between", value1, value2, "dsregino");
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

        public Criteria andReportacquiretimeIsNull() {
            addCriterion("REPORTACQUIRETIME is null");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeIsNotNull() {
            addCriterion("REPORTACQUIRETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeEqualTo(Date value) {
            addCriterion("REPORTACQUIRETIME =", value, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeNotEqualTo(Date value) {
            addCriterion("REPORTACQUIRETIME <>", value, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeGreaterThan(Date value) {
            addCriterion("REPORTACQUIRETIME >", value, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REPORTACQUIRETIME >=", value, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeLessThan(Date value) {
            addCriterion("REPORTACQUIRETIME <", value, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeLessThanOrEqualTo(Date value) {
            addCriterion("REPORTACQUIRETIME <=", value, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeIn(List<Date> values) {
            addCriterion("REPORTACQUIRETIME in", values, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeNotIn(List<Date> values) {
            addCriterion("REPORTACQUIRETIME not in", values, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeBetween(Date value1, Date value2) {
            addCriterion("REPORTACQUIRETIME between", value1, value2, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andReportacquiretimeNotBetween(Date value1, Date value2) {
            addCriterion("REPORTACQUIRETIME not between", value1, value2, "reportacquiretime");
            return (Criteria) this;
        }

        public Criteria andParsestatusIsNull() {
            addCriterion("PARSESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andParsestatusIsNotNull() {
            addCriterion("PARSESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andParsestatusEqualTo(String value) {
            addCriterion("PARSESTATUS =", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusNotEqualTo(String value) {
            addCriterion("PARSESTATUS <>", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusGreaterThan(String value) {
            addCriterion("PARSESTATUS >", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusGreaterThanOrEqualTo(String value) {
            addCriterion("PARSESTATUS >=", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusLessThan(String value) {
            addCriterion("PARSESTATUS <", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusLessThanOrEqualTo(String value) {
            addCriterion("PARSESTATUS <=", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusLike(String value) {
            addCriterion("PARSESTATUS like", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusNotLike(String value) {
            addCriterion("PARSESTATUS not like", value, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusIn(List<String> values) {
            addCriterion("PARSESTATUS in", values, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusNotIn(List<String> values) {
            addCriterion("PARSESTATUS not in", values, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusBetween(String value1, String value2) {
            addCriterion("PARSESTATUS between", value1, value2, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andParsestatusNotBetween(String value1, String value2) {
            addCriterion("PARSESTATUS not between", value1, value2, "parsestatus");
            return (Criteria) this;
        }

        public Criteria andIslatestIsNull() {
            addCriterion("ISLATEST is null");
            return (Criteria) this;
        }

        public Criteria andIslatestIsNotNull() {
            addCriterion("ISLATEST is not null");
            return (Criteria) this;
        }

        public Criteria andIslatestEqualTo(String value) {
            addCriterion("ISLATEST =", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestNotEqualTo(String value) {
            addCriterion("ISLATEST <>", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestGreaterThan(String value) {
            addCriterion("ISLATEST >", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestGreaterThanOrEqualTo(String value) {
            addCriterion("ISLATEST >=", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestLessThan(String value) {
            addCriterion("ISLATEST <", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestLessThanOrEqualTo(String value) {
            addCriterion("ISLATEST <=", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestLike(String value) {
            addCriterion("ISLATEST like", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestNotLike(String value) {
            addCriterion("ISLATEST not like", value, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestIn(List<String> values) {
            addCriterion("ISLATEST in", values, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestNotIn(List<String> values) {
            addCriterion("ISLATEST not in", values, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestBetween(String value1, String value2) {
            addCriterion("ISLATEST between", value1, value2, "islatest");
            return (Criteria) this;
        }

        public Criteria andIslatestNotBetween(String value1, String value2) {
            addCriterion("ISLATEST not between", value1, value2, "islatest");
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