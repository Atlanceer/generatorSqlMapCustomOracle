package com.zxjk.credit2query.pojo;

public class Crt2CLoanspecific {
    private String reportid;

    private String specifictransactionnumber;

    private String typetransaction;

    private String datetransaction;

    private String transactionamount;

    private String changethemonth;

    private String transactiondetails;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getSpecifictransactionnumber() {
        return specifictransactionnumber;
    }

    public void setSpecifictransactionnumber(String specifictransactionnumber) {
        this.specifictransactionnumber = specifictransactionnumber == null ? null : specifictransactionnumber.trim();
    }

    public String getTypetransaction() {
        return typetransaction;
    }

    public void setTypetransaction(String typetransaction) {
        this.typetransaction = typetransaction == null ? null : typetransaction.trim();
    }

    public String getDatetransaction() {
        return datetransaction;
    }

    public void setDatetransaction(String datetransaction) {
        this.datetransaction = datetransaction == null ? null : datetransaction.trim();
    }

    public String getTransactionamount() {
        return transactionamount;
    }

    public void setTransactionamount(String transactionamount) {
        this.transactionamount = transactionamount == null ? null : transactionamount.trim();
    }

    public String getChangethemonth() {
        return changethemonth;
    }

    public void setChangethemonth(String changethemonth) {
        this.changethemonth = changethemonth == null ? null : changethemonth.trim();
    }

    public String getTransactiondetails() {
        return transactiondetails;
    }

    public void setTransactiondetails(String transactiondetails) {
        this.transactiondetails = transactiondetails == null ? null : transactiondetails.trim();
    }
}