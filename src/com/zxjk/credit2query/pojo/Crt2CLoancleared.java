package com.zxjk.credit2query.pojo;

public class Crt2CLoancleared {
    private String reportid;

    private String assetsaccountnumber;

    private String balanceassets;

    private String completiondate;

    private String cleardate;

    private String advanceaccountnumber;

    private String summoney;

    private String otherloans;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getAssetsaccountnumber() {
        return assetsaccountnumber;
    }

    public void setAssetsaccountnumber(String assetsaccountnumber) {
        this.assetsaccountnumber = assetsaccountnumber == null ? null : assetsaccountnumber.trim();
    }

    public String getBalanceassets() {
        return balanceassets;
    }

    public void setBalanceassets(String balanceassets) {
        this.balanceassets = balanceassets == null ? null : balanceassets.trim();
    }

    public String getCompletiondate() {
        return completiondate;
    }

    public void setCompletiondate(String completiondate) {
        this.completiondate = completiondate == null ? null : completiondate.trim();
    }

    public String getCleardate() {
        return cleardate;
    }

    public void setCleardate(String cleardate) {
        this.cleardate = cleardate == null ? null : cleardate.trim();
    }

    public String getAdvanceaccountnumber() {
        return advanceaccountnumber;
    }

    public void setAdvanceaccountnumber(String advanceaccountnumber) {
        this.advanceaccountnumber = advanceaccountnumber == null ? null : advanceaccountnumber.trim();
    }

    public String getSummoney() {
        return summoney;
    }

    public void setSummoney(String summoney) {
        this.summoney = summoney == null ? null : summoney.trim();
    }

    public String getOtherloans() {
        return otherloans;
    }

    public void setOtherloans(String otherloans) {
        this.otherloans = otherloans == null ? null : otherloans.trim();
    }
}