package com.zxjk.credit2query.pojo;

public class Crt2CHousingfundhis {
    private String reportid;

    private String statisticalyear;

    private String accountstatus;

    private String amountpayment;

    private String actualamount;

    private String accumulatedoverdueamount;

    private String paymentrecord;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getStatisticalyear() {
        return statisticalyear;
    }

    public void setStatisticalyear(String statisticalyear) {
        this.statisticalyear = statisticalyear == null ? null : statisticalyear.trim();
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus == null ? null : accountstatus.trim();
    }

    public String getAmountpayment() {
        return amountpayment;
    }

    public void setAmountpayment(String amountpayment) {
        this.amountpayment = amountpayment == null ? null : amountpayment.trim();
    }

    public String getActualamount() {
        return actualamount;
    }

    public void setActualamount(String actualamount) {
        this.actualamount = actualamount == null ? null : actualamount.trim();
    }

    public String getAccumulatedoverdueamount() {
        return accumulatedoverdueamount;
    }

    public void setAccumulatedoverdueamount(String accumulatedoverdueamount) {
        this.accumulatedoverdueamount = accumulatedoverdueamount == null ? null : accumulatedoverdueamount.trim();
    }

    public String getPaymentrecord() {
        return paymentrecord;
    }

    public void setPaymentrecord(String paymentrecord) {
        this.paymentrecord = paymentrecord == null ? null : paymentrecord.trim();
    }
}