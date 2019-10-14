package com.zxjk.credit2query.pojo;

public class Crt2CUtilityexps {
    private String reportid;

    private String utilityaccountid;

    private String unitname;

    private String businesstype;

    private String paymentstate;

    private String accumulativearrears;

    private String statisticalyear;

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

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getPaymentstate() {
        return paymentstate;
    }

    public void setPaymentstate(String paymentstate) {
        this.paymentstate = paymentstate == null ? null : paymentstate.trim();
    }

    public String getAccumulativearrears() {
        return accumulativearrears;
    }

    public void setAccumulativearrears(String accumulativearrears) {
        this.accumulativearrears = accumulativearrears == null ? null : accumulativearrears.trim();
    }

    public String getStatisticalyear() {
        return statisticalyear;
    }

    public void setStatisticalyear(String statisticalyear) {
        this.statisticalyear = statisticalyear == null ? null : statisticalyear.trim();
    }
}