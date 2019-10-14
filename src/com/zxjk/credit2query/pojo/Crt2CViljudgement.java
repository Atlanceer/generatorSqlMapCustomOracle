package com.zxjk.credit2query.pojo;

public class Crt2CViljudgement {
    private String reportid;

    private String civiljudgmentid;

    private String registeredcourt;

    private String caseregistrationdate;

    private String registercause;

    private String lawsuittype;

    private String lawsuitno;

    private String caseprocess;

    private String lawsuitobject;

    private String lawsuitobjectamount;

    private String closedtype;

    private String validatedate;

    private String caseresult;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getCiviljudgmentid() {
        return civiljudgmentid;
    }

    public void setCiviljudgmentid(String civiljudgmentid) {
        this.civiljudgmentid = civiljudgmentid == null ? null : civiljudgmentid.trim();
    }

    public String getRegisteredcourt() {
        return registeredcourt;
    }

    public void setRegisteredcourt(String registeredcourt) {
        this.registeredcourt = registeredcourt == null ? null : registeredcourt.trim();
    }

    public String getCaseregistrationdate() {
        return caseregistrationdate;
    }

    public void setCaseregistrationdate(String caseregistrationdate) {
        this.caseregistrationdate = caseregistrationdate == null ? null : caseregistrationdate.trim();
    }

    public String getRegistercause() {
        return registercause;
    }

    public void setRegistercause(String registercause) {
        this.registercause = registercause == null ? null : registercause.trim();
    }

    public String getLawsuittype() {
        return lawsuittype;
    }

    public void setLawsuittype(String lawsuittype) {
        this.lawsuittype = lawsuittype == null ? null : lawsuittype.trim();
    }

    public String getLawsuitno() {
        return lawsuitno;
    }

    public void setLawsuitno(String lawsuitno) {
        this.lawsuitno = lawsuitno == null ? null : lawsuitno.trim();
    }

    public String getCaseprocess() {
        return caseprocess;
    }

    public void setCaseprocess(String caseprocess) {
        this.caseprocess = caseprocess == null ? null : caseprocess.trim();
    }

    public String getLawsuitobject() {
        return lawsuitobject;
    }

    public void setLawsuitobject(String lawsuitobject) {
        this.lawsuitobject = lawsuitobject == null ? null : lawsuitobject.trim();
    }

    public String getLawsuitobjectamount() {
        return lawsuitobjectamount;
    }

    public void setLawsuitobjectamount(String lawsuitobjectamount) {
        this.lawsuitobjectamount = lawsuitobjectamount == null ? null : lawsuitobjectamount.trim();
    }

    public String getClosedtype() {
        return closedtype;
    }

    public void setClosedtype(String closedtype) {
        this.closedtype = closedtype == null ? null : closedtype.trim();
    }

    public String getValidatedate() {
        return validatedate;
    }

    public void setValidatedate(String validatedate) {
        this.validatedate = validatedate == null ? null : validatedate.trim();
    }

    public String getCaseresult() {
        return caseresult;
    }

    public void setCaseresult(String caseresult) {
        this.caseresult = caseresult == null ? null : caseresult.trim();
    }
}