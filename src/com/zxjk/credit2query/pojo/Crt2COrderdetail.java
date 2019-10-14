package com.zxjk.credit2query.pojo;

public class Crt2COrderdetail {
    private String orderdetailid;

    private String orderid;

    private String queryreason;

    private String querytype;

    private String reporttype;

    private String querytimelimit;

    private String reportmodeltype;

    private String querystatus;

    private String querystatusdesc;

    private String datasource;

    private String reportid;

    private String entcertnum;

    private String entcerttype;

    private String reporttables;

    public String getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(String orderdetailid) {
        this.orderdetailid = orderdetailid == null ? null : orderdetailid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getQueryreason() {
        return queryreason;
    }

    public void setQueryreason(String queryreason) {
        this.queryreason = queryreason == null ? null : queryreason.trim();
    }

    public String getQuerytype() {
        return querytype;
    }

    public void setQuerytype(String querytype) {
        this.querytype = querytype == null ? null : querytype.trim();
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype == null ? null : reporttype.trim();
    }

    public String getQuerytimelimit() {
        return querytimelimit;
    }

    public void setQuerytimelimit(String querytimelimit) {
        this.querytimelimit = querytimelimit == null ? null : querytimelimit.trim();
    }

    public String getReportmodeltype() {
        return reportmodeltype;
    }

    public void setReportmodeltype(String reportmodeltype) {
        this.reportmodeltype = reportmodeltype == null ? null : reportmodeltype.trim();
    }

    public String getQuerystatus() {
        return querystatus;
    }

    public void setQuerystatus(String querystatus) {
        this.querystatus = querystatus == null ? null : querystatus.trim();
    }

    public String getQuerystatusdesc() {
        return querystatusdesc;
    }

    public void setQuerystatusdesc(String querystatusdesc) {
        this.querystatusdesc = querystatusdesc == null ? null : querystatusdesc.trim();
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getEntcertnum() {
        return entcertnum;
    }

    public void setEntcertnum(String entcertnum) {
        this.entcertnum = entcertnum == null ? null : entcertnum.trim();
    }

    public String getEntcerttype() {
        return entcerttype;
    }

    public void setEntcerttype(String entcerttype) {
        this.entcerttype = entcerttype == null ? null : entcerttype.trim();
    }

    public String getReporttables() {
        return reporttables;
    }

    public void setReporttables(String reporttables) {
        this.reporttables = reporttables == null ? null : reporttables.trim();
    }
}