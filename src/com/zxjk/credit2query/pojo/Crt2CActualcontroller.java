package com.zxjk.credit2query.pojo;

public class Crt2CActualcontroller {
    private String reportid;

    private String actualcontrolnumber;

    private String actualcontrollertype;

    private String actualcontrollername;

    private String actualcontrolleridtype;

    private String actualcontrolleridnumber;

    private String updatedate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getActualcontrolnumber() {
        return actualcontrolnumber;
    }

    public void setActualcontrolnumber(String actualcontrolnumber) {
        this.actualcontrolnumber = actualcontrolnumber == null ? null : actualcontrolnumber.trim();
    }

    public String getActualcontrollertype() {
        return actualcontrollertype;
    }

    public void setActualcontrollertype(String actualcontrollertype) {
        this.actualcontrollertype = actualcontrollertype == null ? null : actualcontrollertype.trim();
    }

    public String getActualcontrollername() {
        return actualcontrollername;
    }

    public void setActualcontrollername(String actualcontrollername) {
        this.actualcontrollername = actualcontrollername == null ? null : actualcontrollername.trim();
    }

    public String getActualcontrolleridtype() {
        return actualcontrolleridtype;
    }

    public void setActualcontrolleridtype(String actualcontrolleridtype) {
        this.actualcontrolleridtype = actualcontrolleridtype == null ? null : actualcontrolleridtype.trim();
    }

    public String getActualcontrolleridnumber() {
        return actualcontrolleridnumber;
    }

    public void setActualcontrolleridnumber(String actualcontrolleridnumber) {
        this.actualcontrolleridnumber = actualcontrolleridnumber == null ? null : actualcontrolleridnumber.trim();
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }
}