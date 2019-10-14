package com.zxjk.credit2query.pojo;

public class Crt2CInvestor {
    private String reportid;

    private String registerdesc;

    private String maincontributor;

    private String contributortype;

    private String categoryinvestor;

    private String contributorname;

    private String contributoridtype;

    private String contributorid;

    private String investmentrate;

    private String updatedate;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getRegisterdesc() {
        return registerdesc;
    }

    public void setRegisterdesc(String registerdesc) {
        this.registerdesc = registerdesc == null ? null : registerdesc.trim();
    }

    public String getMaincontributor() {
        return maincontributor;
    }

    public void setMaincontributor(String maincontributor) {
        this.maincontributor = maincontributor == null ? null : maincontributor.trim();
    }

    public String getContributortype() {
        return contributortype;
    }

    public void setContributortype(String contributortype) {
        this.contributortype = contributortype == null ? null : contributortype.trim();
    }

    public String getCategoryinvestor() {
        return categoryinvestor;
    }

    public void setCategoryinvestor(String categoryinvestor) {
        this.categoryinvestor = categoryinvestor == null ? null : categoryinvestor.trim();
    }

    public String getContributorname() {
        return contributorname;
    }

    public void setContributorname(String contributorname) {
        this.contributorname = contributorname == null ? null : contributorname.trim();
    }

    public String getContributoridtype() {
        return contributoridtype;
    }

    public void setContributoridtype(String contributoridtype) {
        this.contributoridtype = contributoridtype == null ? null : contributoridtype.trim();
    }

    public String getContributorid() {
        return contributorid;
    }

    public void setContributorid(String contributorid) {
        this.contributorid = contributorid == null ? null : contributorid.trim();
    }

    public String getInvestmentrate() {
        return investmentrate;
    }

    public void setInvestmentrate(String investmentrate) {
        this.investmentrate = investmentrate == null ? null : investmentrate.trim();
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate == null ? null : updatedate.trim();
    }
}