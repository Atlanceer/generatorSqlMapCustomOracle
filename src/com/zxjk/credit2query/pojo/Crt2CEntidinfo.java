package com.zxjk.credit2query.pojo;

public class Crt2CEntidinfo {
    private String reportid;

    private String entidtype;

    private String entidnumber;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getEntidtype() {
        return entidtype;
    }

    public void setEntidtype(String entidtype) {
        this.entidtype = entidtype == null ? null : entidtype.trim();
    }

    public String getEntidnumber() {
        return entidnumber;
    }

    public void setEntidnumber(String entidnumber) {
        this.entidnumber = entidnumber == null ? null : entidnumber.trim();
    }
}