package com.zxjk.credit2query.pojo;

public class Crt2CRewardinfo {
    private String reportid;

    private String rewardid;

    private String awardunit;

    private String encouragement;

    private String awarddate;

    private String validitydate;

    private String fact;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getRewardid() {
        return rewardid;
    }

    public void setRewardid(String rewardid) {
        this.rewardid = rewardid == null ? null : rewardid.trim();
    }

    public String getAwardunit() {
        return awardunit;
    }

    public void setAwardunit(String awardunit) {
        this.awardunit = awardunit == null ? null : awardunit.trim();
    }

    public String getEncouragement() {
        return encouragement;
    }

    public void setEncouragement(String encouragement) {
        this.encouragement = encouragement == null ? null : encouragement.trim();
    }

    public String getAwarddate() {
        return awarddate;
    }

    public void setAwarddate(String awarddate) {
        this.awarddate = awarddate == null ? null : awarddate.trim();
    }

    public String getValiditydate() {
        return validitydate;
    }

    public void setValiditydate(String validitydate) {
        this.validitydate = validitydate == null ? null : validitydate.trim();
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact == null ? null : fact.trim();
    }
}