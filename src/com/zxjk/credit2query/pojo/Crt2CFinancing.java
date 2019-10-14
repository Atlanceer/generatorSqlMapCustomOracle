package com.zxjk.credit2query.pojo;

public class Crt2CFinancing {
    private String reportid;

    private String informationid;

    private String alistnames;

    private String financingcontroltype;

    private String year;

    private String scale;

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

    public String getAlistnames() {
        return alistnames;
    }

    public void setAlistnames(String alistnames) {
        this.alistnames = alistnames == null ? null : alistnames.trim();
    }

    public String getFinancingcontroltype() {
        return financingcontroltype;
    }

    public void setFinancingcontroltype(String financingcontroltype) {
        this.financingcontroltype = financingcontroltype == null ? null : financingcontroltype.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }
}