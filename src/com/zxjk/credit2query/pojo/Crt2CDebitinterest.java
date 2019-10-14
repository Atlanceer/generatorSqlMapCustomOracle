package com.zxjk.credit2query.pojo;

public class Crt2CDebitinterest {
    private String reportid;

    private String interestinformationid;

    private String mechanismtype;

    private String mechanismcode;

    private String currency;

    private String balanceinterest;

    private String changedate;

    private String debitinteresttype;

    private String datereport;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getInterestinformationid() {
        return interestinformationid;
    }

    public void setInterestinformationid(String interestinformationid) {
        this.interestinformationid = interestinformationid == null ? null : interestinformationid.trim();
    }

    public String getMechanismtype() {
        return mechanismtype;
    }

    public void setMechanismtype(String mechanismtype) {
        this.mechanismtype = mechanismtype == null ? null : mechanismtype.trim();
    }

    public String getMechanismcode() {
        return mechanismcode;
    }

    public void setMechanismcode(String mechanismcode) {
        this.mechanismcode = mechanismcode == null ? null : mechanismcode.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getBalanceinterest() {
        return balanceinterest;
    }

    public void setBalanceinterest(String balanceinterest) {
        this.balanceinterest = balanceinterest == null ? null : balanceinterest.trim();
    }

    public String getChangedate() {
        return changedate;
    }

    public void setChangedate(String changedate) {
        this.changedate = changedate == null ? null : changedate.trim();
    }

    public String getDebitinteresttype() {
        return debitinteresttype;
    }

    public void setDebitinteresttype(String debitinteresttype) {
        this.debitinteresttype = debitinteresttype == null ? null : debitinteresttype.trim();
    }

    public String getDatereport() {
        return datereport;
    }

    public void setDatereport(String datereport) {
        this.datereport = datereport == null ? null : datereport.trim();
    }
}