package com.zxjk.credit2query.pojo;

public class Crt2CRrguaranteesum {
    private String reportid;

    private String typeresponsibility;

    private String repaymentresponsibility;

    private String accountnumber;

    private String balance;

    private String concemclassbalance;

    private String badclassbalance;

    private String rrguaranteesumnumber;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getTyperesponsibility() {
        return typeresponsibility;
    }

    public void setTyperesponsibility(String typeresponsibility) {
        this.typeresponsibility = typeresponsibility == null ? null : typeresponsibility.trim();
    }

    public String getRepaymentresponsibility() {
        return repaymentresponsibility;
    }

    public void setRepaymentresponsibility(String repaymentresponsibility) {
        this.repaymentresponsibility = repaymentresponsibility == null ? null : repaymentresponsibility.trim();
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

    public String getConcemclassbalance() {
        return concemclassbalance;
    }

    public void setConcemclassbalance(String concemclassbalance) {
        this.concemclassbalance = concemclassbalance == null ? null : concemclassbalance.trim();
    }

    public String getBadclassbalance() {
        return badclassbalance;
    }

    public void setBadclassbalance(String badclassbalance) {
        this.badclassbalance = badclassbalance == null ? null : badclassbalance.trim();
    }

    public String getRrguaranteesumnumber() {
        return rrguaranteesumnumber;
    }

    public void setRrguaranteesumnumber(String rrguaranteesumnumber) {
        this.rrguaranteesumnumber = rrguaranteesumnumber == null ? null : rrguaranteesumnumber.trim();
    }
}