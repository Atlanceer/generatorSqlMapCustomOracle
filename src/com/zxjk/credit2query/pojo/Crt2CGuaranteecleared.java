package com.zxjk.credit2query.pojo;

public class Crt2CGuaranteecleared {
    private String reportid;

    private String businesstype;

    private String assetquality;

    private String accountnumber;

    private String guaranteclearnum;

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

    public String getGuaranteclearnum() {
        return guaranteclearnum;
    }

    public void setGuaranteclearnum(String guaranteclearnum) {
        this.guaranteclearnum = guaranteclearnum == null ? null : guaranteclearnum.trim();
    }
}