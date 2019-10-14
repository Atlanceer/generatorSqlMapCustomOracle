package com.zxjk.credit2query.pojo;

public class Crt2CExemption {
    private String reportid;

    private String informationid;

    private String ratifydept;

    private String productname;

    private String exquaid;

    private String validitydate;

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

    public String getExquaid() {
        return exquaid;
    }

    public void setExquaid(String exquaid) {
        this.exquaid = exquaid == null ? null : exquaid.trim();
    }

    public String getValiditydate() {
        return validitydate;
    }

    public void setValiditydate(String validitydate) {
        this.validitydate = validitydate == null ? null : validitydate.trim();
    }
}