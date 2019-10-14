package com.zxjk.credit2query.pojo;

public class Crt2CUtilityexpshis {
    private String reportid;

    private String utilityaccountid;

    private String statisticalyear;

    private String paymentstate;

    private String amountpayment;

    private String actualamount;

    private String amountarrears;

    private String paymentrecordnumber;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getUtilityaccountid() {
        return utilityaccountid;
    }

    public void setUtilityaccountid(String utilityaccountid) {
        this.utilityaccountid = utilityaccountid == null ? null : utilityaccountid.trim();
    }

    public String getStatisticalyear() {
        return statisticalyear;
    }

    public void setStatisticalyear(String statisticalyear) {
        this.statisticalyear = statisticalyear == null ? null : statisticalyear.trim();
    }

    public String getPaymentstate() {
        return paymentstate;
    }

    public void setPaymentstate(String paymentstate) {
        this.paymentstate = paymentstate == null ? null : paymentstate.trim();
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

    public String getAmountarrears() {
        return amountarrears;
    }

    public void setAmountarrears(String amountarrears) {
        this.amountarrears = amountarrears == null ? null : amountarrears.trim();
    }

    public String getPaymentrecordnumber() {
        return paymentrecordnumber;
    }

    public void setPaymentrecordnumber(String paymentrecordnumber) {
        this.paymentrecordnumber = paymentrecordnumber == null ? null : paymentrecordnumber.trim();
    }
}