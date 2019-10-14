package com.zxjk.credit2query.pojo;

import java.util.Date;

public class Crt2CReportmain {
    private String reportid;

    private String creditcode;

    private String loancardno;

    private String corpno;

    private String registertype;

    private String registerno;

    private String gsregino;

    private String dsregino;

    private String reporttype;

    private Date reportacquiretime;

    private String parsestatus;

    private String islatest;

    private String reportcontent;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode == null ? null : creditcode.trim();
    }

    public String getLoancardno() {
        return loancardno;
    }

    public void setLoancardno(String loancardno) {
        this.loancardno = loancardno == null ? null : loancardno.trim();
    }

    public String getCorpno() {
        return corpno;
    }

    public void setCorpno(String corpno) {
        this.corpno = corpno == null ? null : corpno.trim();
    }

    public String getRegistertype() {
        return registertype;
    }

    public void setRegistertype(String registertype) {
        this.registertype = registertype == null ? null : registertype.trim();
    }

    public String getRegisterno() {
        return registerno;
    }

    public void setRegisterno(String registerno) {
        this.registerno = registerno == null ? null : registerno.trim();
    }

    public String getGsregino() {
        return gsregino;
    }

    public void setGsregino(String gsregino) {
        this.gsregino = gsregino == null ? null : gsregino.trim();
    }

    public String getDsregino() {
        return dsregino;
    }

    public void setDsregino(String dsregino) {
        this.dsregino = dsregino == null ? null : dsregino.trim();
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype == null ? null : reporttype.trim();
    }

    public Date getReportacquiretime() {
        return reportacquiretime;
    }

    public void setReportacquiretime(Date reportacquiretime) {
        this.reportacquiretime = reportacquiretime;
    }

    public String getParsestatus() {
        return parsestatus;
    }

    public void setParsestatus(String parsestatus) {
        this.parsestatus = parsestatus == null ? null : parsestatus.trim();
    }

    public String getIslatest() {
        return islatest;
    }

    public void setIslatest(String islatest) {
        this.islatest = islatest == null ? null : islatest.trim();
    }

    public String getReportcontent() {
        return reportcontent;
    }

    public void setReportcontent(String reportcontent) {
        this.reportcontent = reportcontent == null ? null : reportcontent.trim();
    }
}