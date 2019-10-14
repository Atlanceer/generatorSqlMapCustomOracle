package com.zxjk.credit2query.pojo;

public class Crt2CHousingfund {
    private String reportid;

    private String accountid;

    private String paydatefirst;

    private String employeenum;

    private String basicmoney;

    private String daterecent;

    private String paydateend;

    private String accountstatus;

    private String accumulatedoverdueamount;

    private String statisticaldate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getPaydatefirst() {
        return paydatefirst;
    }

    public void setPaydatefirst(String paydatefirst) {
        this.paydatefirst = paydatefirst == null ? null : paydatefirst.trim();
    }

    public String getEmployeenum() {
        return employeenum;
    }

    public void setEmployeenum(String employeenum) {
        this.employeenum = employeenum == null ? null : employeenum.trim();
    }

    public String getBasicmoney() {
        return basicmoney;
    }

    public void setBasicmoney(String basicmoney) {
        this.basicmoney = basicmoney == null ? null : basicmoney.trim();
    }

    public String getDaterecent() {
        return daterecent;
    }

    public void setDaterecent(String daterecent) {
        this.daterecent = daterecent == null ? null : daterecent.trim();
    }

    public String getPaydateend() {
        return paydateend;
    }

    public void setPaydateend(String paydateend) {
        this.paydateend = paydateend == null ? null : paydateend.trim();
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus == null ? null : accountstatus.trim();
    }

    public String getAccumulatedoverdueamount() {
        return accumulatedoverdueamount;
    }

    public void setAccumulatedoverdueamount(String accumulatedoverdueamount) {
        this.accumulatedoverdueamount = accumulatedoverdueamount == null ? null : accumulatedoverdueamount.trim();
    }

    public String getStatisticaldate() {
        return statisticaldate;
    }

    public void setStatisticaldate(String statisticaldate) {
        this.statisticaldate = statisticaldate == null ? null : statisticaldate.trim();
    }
}