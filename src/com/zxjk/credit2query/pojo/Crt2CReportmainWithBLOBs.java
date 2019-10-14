package com.zxjk.credit2query.pojo;

public class Crt2CReportmainWithBLOBs extends Crt2CReportmain {
    private String reportcontent;

    private String htmlcontent;

    public String getReportcontent() {
        return reportcontent;
    }

    public void setReportcontent(String reportcontent) {
        this.reportcontent = reportcontent == null ? null : reportcontent.trim();
    }

    public String getHtmlcontent() {
        return htmlcontent;
    }

    public void setHtmlcontent(String htmlcontent) {
        this.htmlcontent = htmlcontent == null ? null : htmlcontent.trim();
    }
}