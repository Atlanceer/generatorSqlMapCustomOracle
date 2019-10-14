package com.zxjk.credit2query.pojo;

import java.util.Date;

public class Crt2CReportparsefail {
    private String reportid;

    private String failtablename;

    private Date failtime;

    private String remark;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getFailtablename() {
        return failtablename;
    }

    public void setFailtablename(String failtablename) {
        this.failtablename = failtablename == null ? null : failtablename.trim();
    }

    public Date getFailtime() {
        return failtime;
    }

    public void setFailtime(Date failtime) {
        this.failtime = failtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}