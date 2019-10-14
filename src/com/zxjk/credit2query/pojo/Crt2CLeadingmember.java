package com.zxjk.credit2query.pojo;

public class Crt2CLeadingmember {
    private String reportid;

    private String principalmembers;

    private String name;

    private String documenttype;

    private String documentnumber;

    private String position;

    private String updatedate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getPrincipalmembers() {
        return principalmembers;
    }

    public void setPrincipalmembers(String principalmembers) {
        this.principalmembers = principalmembers == null ? null : principalmembers.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(String documenttype) {
        this.documenttype = documenttype == null ? null : documenttype.trim();
    }

    public String getDocumentnumber() {
        return documentnumber;
    }

    public void setDocumentnumber(String documentnumber) {
        this.documentnumber = documentnumber == null ? null : documentnumber.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }
}