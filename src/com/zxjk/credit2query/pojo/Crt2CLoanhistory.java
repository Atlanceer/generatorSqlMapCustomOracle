package com.zxjk.credit2query.pojo;

public class Crt2CLoanhistory {
    private String reportid;

    private String month;

    private String totalaccountliabilities;

    private String totalliabilitiesbalance;

    private String advanceaccountnumber;

    private String numberaccountsconcerned;

    private String badaccountnumber;

    private String badbalance;

    private String overdueaccounts;

    private String totaloverdue;

    private String overdueprincipalaccount;

    private String overdueprincipal;

    private String loanhistorymonthnumber;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getTotalaccountliabilities() {
        return totalaccountliabilities;
    }

    public void setTotalaccountliabilities(String totalaccountliabilities) {
        this.totalaccountliabilities = totalaccountliabilities == null ? null : totalaccountliabilities.trim();
    }

    public String getTotalliabilitiesbalance() {
        return totalliabilitiesbalance;
    }

    public void setTotalliabilitiesbalance(String totalliabilitiesbalance) {
        this.totalliabilitiesbalance = totalliabilitiesbalance == null ? null : totalliabilitiesbalance.trim();
    }

    public String getAdvanceaccountnumber() {
        return advanceaccountnumber;
    }

    public void setAdvanceaccountnumber(String advanceaccountnumber) {
        this.advanceaccountnumber = advanceaccountnumber == null ? null : advanceaccountnumber.trim();
    }

    public String getNumberaccountsconcerned() {
        return numberaccountsconcerned;
    }

    public void setNumberaccountsconcerned(String numberaccountsconcerned) {
        this.numberaccountsconcerned = numberaccountsconcerned == null ? null : numberaccountsconcerned.trim();
    }

    public String getBadaccountnumber() {
        return badaccountnumber;
    }

    public void setBadaccountnumber(String badaccountnumber) {
        this.badaccountnumber = badaccountnumber == null ? null : badaccountnumber.trim();
    }

    public String getBadbalance() {
        return badbalance;
    }

    public void setBadbalance(String badbalance) {
        this.badbalance = badbalance == null ? null : badbalance.trim();
    }

    public String getOverdueaccounts() {
        return overdueaccounts;
    }

    public void setOverdueaccounts(String overdueaccounts) {
        this.overdueaccounts = overdueaccounts == null ? null : overdueaccounts.trim();
    }

    public String getTotaloverdue() {
        return totaloverdue;
    }

    public void setTotaloverdue(String totaloverdue) {
        this.totaloverdue = totaloverdue == null ? null : totaloverdue.trim();
    }

    public String getOverdueprincipalaccount() {
        return overdueprincipalaccount;
    }

    public void setOverdueprincipalaccount(String overdueprincipalaccount) {
        this.overdueprincipalaccount = overdueprincipalaccount == null ? null : overdueprincipalaccount.trim();
    }

    public String getOverdueprincipal() {
        return overdueprincipal;
    }

    public void setOverdueprincipal(String overdueprincipal) {
        this.overdueprincipal = overdueprincipal == null ? null : overdueprincipal.trim();
    }

    public String getLoanhistorymonthnumber() {
        return loanhistorymonthnumber;
    }

    public void setLoanhistorymonthnumber(String loanhistorymonthnumber) {
        this.loanhistorymonthnumber = loanhistorymonthnumber == null ? null : loanhistorymonthnumber.trim();
    }
}