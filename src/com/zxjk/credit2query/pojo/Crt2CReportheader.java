package com.zxjk.credit2query.pojo;

public class Crt2CReportheader {
    private String reportid;

    private String reportdate;

    private String queryorgcode;

    private String queryreason;

    private String enterprisename;

    private String enterpriseidnum;

    private String enterpriseidtype;

    private String enterpriseidnumber;

    private String numobjections;

    private String exchangerate;

    private String exchangeratedate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public String getQueryorgcode() {
        return queryorgcode;
    }

    public void setQueryorgcode(String queryorgcode) {
        this.queryorgcode = queryorgcode == null ? null : queryorgcode.trim();
    }

    public String getQueryreason() {
        return queryreason;
    }

    public void setQueryreason(String queryreason) {
        this.queryreason = queryreason == null ? null : queryreason.trim();
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename == null ? null : enterprisename.trim();
    }

    public String getEnterpriseidnum() {
        return enterpriseidnum;
    }

    public void setEnterpriseidnum(String enterpriseidnum) {
        this.enterpriseidnum = enterpriseidnum == null ? null : enterpriseidnum.trim();
    }

    public String getEnterpriseidtype() {
        return enterpriseidtype;
    }

    public void setEnterpriseidtype(String enterpriseidtype) {
        this.enterpriseidtype = enterpriseidtype == null ? null : enterpriseidtype.trim();
    }

    public String getEnterpriseidnumber() {
        return enterpriseidnumber;
    }

    public void setEnterpriseidnumber(String enterpriseidnumber) {
        this.enterpriseidnumber = enterpriseidnumber == null ? null : enterpriseidnumber.trim();
    }

    public String getNumobjections() {
        return numobjections;
    }

    public void setNumobjections(String numobjections) {
        this.numobjections = numobjections == null ? null : numobjections.trim();
    }

    public String getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(String exchangerate) {
        this.exchangerate = exchangerate == null ? null : exchangerate.trim();
    }

    public String getExchangeratedate() {
        return exchangeratedate;
    }

    public void setExchangeratedate(String exchangeratedate) {
        this.exchangeratedate = exchangeratedate == null ? null : exchangeratedate.trim();
    }
}