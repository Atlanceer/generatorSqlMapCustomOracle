package com.zxjk.credit2query.pojo;

public class Crt2CAdminpunishment {
    private String reportid;

    private String penaltyid;

    private String punishmentauthority;

    private String punishmentdocumentnum;

    private String illegalaction;

    private String punishdecide;

    private String punishmentdate;

    private String punishmentamount;

    private String punishmentimplementation;

    private String result;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    public String getPenaltyid() {
        return penaltyid;
    }

    public void setPenaltyid(String penaltyid) {
        this.penaltyid = penaltyid == null ? null : penaltyid.trim();
    }

    public String getPunishmentauthority() {
        return punishmentauthority;
    }

    public void setPunishmentauthority(String punishmentauthority) {
        this.punishmentauthority = punishmentauthority == null ? null : punishmentauthority.trim();
    }

    public String getPunishmentdocumentnum() {
        return punishmentdocumentnum;
    }

    public void setPunishmentdocumentnum(String punishmentdocumentnum) {
        this.punishmentdocumentnum = punishmentdocumentnum == null ? null : punishmentdocumentnum.trim();
    }

    public String getIllegalaction() {
        return illegalaction;
    }

    public void setIllegalaction(String illegalaction) {
        this.illegalaction = illegalaction == null ? null : illegalaction.trim();
    }

    public String getPunishdecide() {
        return punishdecide;
    }

    public void setPunishdecide(String punishdecide) {
        this.punishdecide = punishdecide == null ? null : punishdecide.trim();
    }

    public String getPunishmentdate() {
        return punishmentdate;
    }

    public void setPunishmentdate(String punishmentdate) {
        this.punishmentdate = punishmentdate == null ? null : punishmentdate.trim();
    }

    public String getPunishmentamount() {
        return punishmentamount;
    }

    public void setPunishmentamount(String punishmentamount) {
        this.punishmentamount = punishmentamount == null ? null : punishmentamount.trim();
    }

    public String getPunishmentimplementation() {
        return punishmentimplementation;
    }

    public void setPunishmentimplementation(String punishmentimplementation) {
        this.punishmentimplementation = punishmentimplementation == null ? null : punishmentimplementation.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}