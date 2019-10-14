package com.zxjk.credit2query.pojo;

public class Crt2CCertification {
    private String reportid;

    private String authenticationid;

    private String certificateorg;

    private String certificatetype;

    private String certificatedate;

    private String enddate;

    private String content;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getAuthenticationid() {
        return authenticationid;
    }

    public void setAuthenticationid(String authenticationid) {
        this.authenticationid = authenticationid == null ? null : authenticationid.trim();
    }

    public String getCertificateorg() {
        return certificateorg;
    }

    public void setCertificateorg(String certificateorg) {
        this.certificateorg = certificateorg == null ? null : certificateorg.trim();
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype == null ? null : certificatetype.trim();
    }

    public String getCertificatedate() {
        return certificatedate;
    }

    public void setCertificatedate(String certificatedate) {
        this.certificatedate = certificatedate == null ? null : certificatedate.trim();
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