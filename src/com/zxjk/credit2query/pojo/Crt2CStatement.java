package com.zxjk.credit2query.pojo;

public class Crt2CStatement {
    private String reportid;

    private String objecttype;

    private String objectidentification;

    private String decalarationstype;

    private String decalarations;

    private String adddate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype == null ? null : objecttype.trim();
    }

    public String getObjectidentification() {
        return objectidentification;
    }

    public void setObjectidentification(String objectidentification) {
        this.objectidentification = objectidentification == null ? null : objectidentification.trim();
    }

    public String getDecalarationstype() {
        return decalarationstype;
    }

    public void setDecalarationstype(String decalarationstype) {
        this.decalarationstype = decalarationstype == null ? null : decalarationstype.trim();
    }

    public String getDecalarations() {
        return decalarations;
    }

    public void setDecalarations(String decalarations) {
        this.decalarations = decalarations == null ? null : decalarations.trim();
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate == null ? null : adddate.trim();
    }
}