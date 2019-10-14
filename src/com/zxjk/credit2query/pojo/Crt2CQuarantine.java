package com.zxjk.credit2query.pojo;

public class Crt2CQuarantine {
    private String reportid;

    private String informationid;

    private String ratifydept;

    private String productname;

    private String inuredate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getInformationid() {
        return informationid;
    }

    public void setInformationid(String informationid) {
        this.informationid = informationid == null ? null : informationid.trim();
    }

    public String getRatifydept() {
        return ratifydept;
    }

    public void setRatifydept(String ratifydept) {
        this.ratifydept = ratifydept == null ? null : ratifydept.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getInuredate() {
        return inuredate;
    }

    public void setInuredate(String inuredate) {
        this.inuredate = inuredate == null ? null : inuredate.trim();
    }
}