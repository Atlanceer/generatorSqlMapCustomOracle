package com.zxjk.credit2query.pojo;

public class Crt2CDiscountedacct {
    private String reportid;

    private String specifictransactionid;

    private String mechanismtype;

    private String mechanismcode;

    private String businesstypes;

    private String fivelevel;

    private String uncleared;

    private String balancetotal;

    private String totaloverdue;

    private String overdueprincipal;

    private String cloaedaccount;

    private String clearedcash;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getSpecifictransactionid() {
        return specifictransactionid;
    }

    public void setSpecifictransactionid(String specifictransactionid) {
        this.specifictransactionid = specifictransactionid == null ? null : specifictransactionid.trim();
    }

    public String getMechanismtype() {
        return mechanismtype;
    }

    public void setMechanismtype(String mechanismtype) {
        this.mechanismtype = mechanismtype == null ? null : mechanismtype.trim();
    }

    public String getMechanismcode() {
        return mechanismcode;
    }

    public void setMechanismcode(String mechanismcode) {
        this.mechanismcode = mechanismcode == null ? null : mechanismcode.trim();
    }

    public String getBusinesstypes() {
        return businesstypes;
    }

    public void setBusinesstypes(String businesstypes) {
        this.businesstypes = businesstypes == null ? null : businesstypes.trim();
    }

    public String getFivelevel() {
        return fivelevel;
    }

    public void setFivelevel(String fivelevel) {
        this.fivelevel = fivelevel == null ? null : fivelevel.trim();
    }

    public String getUncleared() {
        return uncleared;
    }

    public void setUncleared(String uncleared) {
        this.uncleared = uncleared == null ? null : uncleared.trim();
    }

    public String getBalancetotal() {
        return balancetotal;
    }

    public void setBalancetotal(String balancetotal) {
        this.balancetotal = balancetotal == null ? null : balancetotal.trim();
    }

    public String getTotaloverdue() {
        return totaloverdue;
    }

    public void setTotaloverdue(String totaloverdue) {
        this.totaloverdue = totaloverdue == null ? null : totaloverdue.trim();
    }

    public String getOverdueprincipal() {
        return overdueprincipal;
    }

    public void setOverdueprincipal(String overdueprincipal) {
        this.overdueprincipal = overdueprincipal == null ? null : overdueprincipal.trim();
    }

    public String getCloaedaccount() {
        return cloaedaccount;
    }

    public void setCloaedaccount(String cloaedaccount) {
        this.cloaedaccount = cloaedaccount == null ? null : cloaedaccount.trim();
    }

    public String getClearedcash() {
        return clearedcash;
    }

    public void setClearedcash(String clearedcash) {
        this.clearedcash = clearedcash == null ? null : clearedcash.trim();
    }
}