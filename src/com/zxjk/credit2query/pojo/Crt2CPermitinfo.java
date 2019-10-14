package com.zxjk.credit2query.pojo;

public class Crt2CPermitinfo {
    private String reportid;

    private String licenseid;

    private String permitorgname;

    private String permittype;

    private String permitdate;

    private String validitydate;

    private String permitcontent;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getLicenseid() {
        return licenseid;
    }

    public void setLicenseid(String licenseid) {
        this.licenseid = licenseid == null ? null : licenseid.trim();
    }

    public String getPermitorgname() {
        return permitorgname;
    }

    public void setPermitorgname(String permitorgname) {
        this.permitorgname = permitorgname == null ? null : permitorgname.trim();
    }

    public String getPermittype() {
        return permittype;
    }

    public void setPermittype(String permittype) {
        this.permittype = permittype == null ? null : permittype.trim();
    }

    public String getPermitdate() {
        return permitdate;
    }

    public void setPermitdate(String permitdate) {
        this.permitdate = permitdate == null ? null : permitdate.trim();
    }

    public String getValiditydate() {
        return validitydate;
    }

    public void setValiditydate(String validitydate) {
        this.validitydate = validitydate == null ? null : validitydate.trim();
    }

    public String getPermitcontent() {
        return permitcontent;
    }

    public void setPermitcontent(String permitcontent) {
        this.permitcontent = permitcontent == null ? null : permitcontent.trim();
    }
}