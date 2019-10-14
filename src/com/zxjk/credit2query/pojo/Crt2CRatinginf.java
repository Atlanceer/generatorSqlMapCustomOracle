package com.zxjk.credit2query.pojo;

public class Crt2CRatinginf {
    private String reportid;

    private String ratinginformationid;

    private String oraganizationname;

    private String ratingdate;

    private String ratingresults;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getRatinginformationid() {
        return ratinginformationid;
    }

    public void setRatinginformationid(String ratinginformationid) {
        this.ratinginformationid = ratinginformationid == null ? null : ratinginformationid.trim();
    }

    public String getOraganizationname() {
        return oraganizationname;
    }

    public void setOraganizationname(String oraganizationname) {
        this.oraganizationname = oraganizationname == null ? null : oraganizationname.trim();
    }

    public String getRatingdate() {
        return ratingdate;
    }

    public void setRatingdate(String ratingdate) {
        this.ratingdate = ratingdate == null ? null : ratingdate.trim();
    }

    public String getRatingresults() {
        return ratingresults;
    }

    public void setRatingresults(String ratingresults) {
        this.ratingresults = ratingresults == null ? null : ratingresults.trim();
    }
}