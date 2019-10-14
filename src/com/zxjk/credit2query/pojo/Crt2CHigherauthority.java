package com.zxjk.credit2query.pojo;

public class Crt2CHigherauthority {
    private String reportid;

    private String mechanismtype;

    private String organizationname;

    private String mechanismidtype;

    private String mechanismidnumber;

    private String updatedate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getMechanismtype() {
        return mechanismtype;
    }

    public void setMechanismtype(String mechanismtype) {
        this.mechanismtype = mechanismtype == null ? null : mechanismtype.trim();
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
    }

    public String getMechanismidtype() {
        return mechanismidtype;
    }

    public void setMechanismidtype(String mechanismidtype) {
        this.mechanismidtype = mechanismidtype == null ? null : mechanismidtype.trim();
    }

    public String getMechanismidnumber() {
        return mechanismidnumber;
    }

    public void setMechanismidnumber(String mechanismidnumber) {
        this.mechanismidnumber = mechanismidnumber == null ? null : mechanismidnumber.trim();
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }
}