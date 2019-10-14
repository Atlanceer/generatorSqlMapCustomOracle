package com.zxjk.credit2query.pojo;

public class Crt2CTaxinfo {
    private String reportid;

    private String taxarrearsid;

    private String taxbureau;

    private String owedtaxamount;

    private String owedtaxdate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getTaxarrearsid() {
        return taxarrearsid;
    }

    public void setTaxarrearsid(String taxarrearsid) {
        this.taxarrearsid = taxarrearsid == null ? null : taxarrearsid.trim();
    }

    public String getTaxbureau() {
        return taxbureau;
    }

    public void setTaxbureau(String taxbureau) {
        this.taxbureau = taxbureau == null ? null : taxbureau.trim();
    }

    public String getOwedtaxamount() {
        return owedtaxamount;
    }

    public void setOwedtaxamount(String owedtaxamount) {
        this.owedtaxamount = owedtaxamount == null ? null : owedtaxamount.trim();
    }

    public String getOwedtaxdate() {
        return owedtaxdate;
    }

    public void setOwedtaxdate(String owedtaxdate) {
        this.owedtaxdate = owedtaxdate == null ? null : owedtaxdate.trim();
    }
}