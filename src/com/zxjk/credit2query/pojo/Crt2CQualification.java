package com.zxjk.credit2query.pojo;

public class Crt2CQualification {
    private String reportid;

    private String qualificationid;

    private String identifyorg;

    private String qualificatetype;

    private String approvaldate;

    private String enddate;

    private String content;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getQualificationid() {
        return qualificationid;
    }

    public void setQualificationid(String qualificationid) {
        this.qualificationid = qualificationid == null ? null : qualificationid.trim();
    }

    public String getIdentifyorg() {
        return identifyorg;
    }

    public void setIdentifyorg(String identifyorg) {
        this.identifyorg = identifyorg == null ? null : identifyorg.trim();
    }

    public String getQualificatetype() {
        return qualificatetype;
    }

    public void setQualificatetype(String qualificatetype) {
        this.qualificatetype = qualificatetype == null ? null : qualificatetype.trim();
    }

    public String getApprovaldate() {
        return approvaldate;
    }

    public void setApprovaldate(String approvaldate) {
        this.approvaldate = approvaldate == null ? null : approvaldate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}