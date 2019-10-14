package com.zxjk.credit2query.pojo;

public class Crt2CCreditagreesum {
    private String reportid;

    private String acycliccreditline;

    private String useacycliccreditline;

    private String surplusacycliccreditline;

    private String circulationline;

    private String usecirculationline;

    private String surpluscirculationline;

    private String creditlimit;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getAcycliccreditline() {
        return acycliccreditline;
    }

    public void setAcycliccreditline(String acycliccreditline) {
        this.acycliccreditline = acycliccreditline == null ? null : acycliccreditline.trim();
    }

    public String getUseacycliccreditline() {
        return useacycliccreditline;
    }

    public void setUseacycliccreditline(String useacycliccreditline) {
        this.useacycliccreditline = useacycliccreditline == null ? null : useacycliccreditline.trim();
    }

    public String getSurplusacycliccreditline() {
        return surplusacycliccreditline;
    }

    public void setSurplusacycliccreditline(String surplusacycliccreditline) {
        this.surplusacycliccreditline = surplusacycliccreditline == null ? null : surplusacycliccreditline.trim();
    }

    public String getCirculationline() {
        return circulationline;
    }

    public void setCirculationline(String circulationline) {
        this.circulationline = circulationline == null ? null : circulationline.trim();
    }

    public String getUsecirculationline() {
        return usecirculationline;
    }

    public void setUsecirculationline(String usecirculationline) {
        this.usecirculationline = usecirculationline == null ? null : usecirculationline.trim();
    }

    public String getSurpluscirculationline() {
        return surpluscirculationline;
    }

    public void setSurpluscirculationline(String surpluscirculationline) {
        this.surpluscirculationline = surpluscirculationline == null ? null : surpluscirculationline.trim();
    }

    public String getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(String creditlimit) {
        this.creditlimit = creditlimit == null ? null : creditlimit.trim();
    }
}