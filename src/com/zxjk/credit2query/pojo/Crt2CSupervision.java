package com.zxjk.credit2query.pojo;

public class Crt2CSupervision {
    private String reportid;

    private String informationid;

    private String department;

    private String ruleoffice;

    private String wardshiplevel;

    private String inuredate;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getRuleoffice() {
        return ruleoffice;
    }

    public void setRuleoffice(String ruleoffice) {
        this.ruleoffice = ruleoffice == null ? null : ruleoffice.trim();
    }

    public String getWardshiplevel() {
        return wardshiplevel;
    }

    public void setWardshiplevel(String wardshiplevel) {
        this.wardshiplevel = wardshiplevel == null ? null : wardshiplevel.trim();
    }

    public String getInuredate() {
        return inuredate;
    }

    public void setInuredate(String inuredate) {
        this.inuredate = inuredate == null ? null : inuredate.trim();
    }

    public String getValiditydate() {
        return validitydate;
    }

    public void setValiditydate(String validitydate) {
        this.validitydate = validitydate == null ? null : validitydate.trim();
    }
}