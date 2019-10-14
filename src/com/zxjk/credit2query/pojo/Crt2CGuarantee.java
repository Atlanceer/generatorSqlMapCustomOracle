package com.zxjk.credit2query.pojo;

public class Crt2CGuarantee {
    private String reportid;

    private String guaranteeaccountid;

    private String reportdate;

    private String accountstate;

    private String balance;

    private String fivelevel;

    private String riskexposure;

    private String compensatorysign;

    private String commondebtidentifier;

    private String closingdate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getGuaranteeaccountid() {
        return guaranteeaccountid;
    }

    public void setGuaranteeaccountid(String guaranteeaccountid) {
        this.guaranteeaccountid = guaranteeaccountid == null ? null : guaranteeaccountid.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public String getAccountstate() {
        return accountstate;
    }

    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate == null ? null : accountstate.trim();
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    public String getFivelevel() {
        return fivelevel;
    }

    public void setFivelevel(String fivelevel) {
        this.fivelevel = fivelevel == null ? null : fivelevel.trim();
    }

    public String getRiskexposure() {
        return riskexposure;
    }

    public void setRiskexposure(String riskexposure) {
        this.riskexposure = riskexposure == null ? null : riskexposure.trim();
    }

    public String getCompensatorysign() {
        return compensatorysign;
    }

    public void setCompensatorysign(String compensatorysign) {
        this.compensatorysign = compensatorysign == null ? null : compensatorysign.trim();
    }

    public String getCommondebtidentifier() {
        return commondebtidentifier;
    }

    public void setCommondebtidentifier(String commondebtidentifier) {
        this.commondebtidentifier = commondebtidentifier == null ? null : commondebtidentifier.trim();
    }

    public String getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(String closingdate) {
        this.closingdate = closingdate == null ? null : closingdate.trim();
    }
}