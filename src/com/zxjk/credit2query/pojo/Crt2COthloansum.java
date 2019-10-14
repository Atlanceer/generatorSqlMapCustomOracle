package com.zxjk.credit2query.pojo;

public class Crt2COthloansum {
    private String reportid;

    private String businesstype;

    private String assetquality;

    private String accountnumber;

    private String balance;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getAssetquality() {
        return assetquality;
    }

    public void setAssetquality(String assetquality) {
        this.assetquality = assetquality == null ? null : assetquality.trim();
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber == null ? null : accountnumber.trim();
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }
}