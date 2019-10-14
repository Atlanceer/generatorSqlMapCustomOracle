package com.zxjk.credit2query.pojo;

import java.util.Date;

public class Crt2COrder {
    private String orderid;

    private String applyserino;

    private Date applytime;

    private String sysid;

    private String sysqueryorgid;

    private String sysqueryuserid;

    private String orgcode;

    private String userid;

    private String password;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getApplyserino() {
        return applyserino;
    }

    public void setApplyserino(String applyserino) {
        this.applyserino = applyserino == null ? null : applyserino.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getSysqueryorgid() {
        return sysqueryorgid;
    }

    public void setSysqueryorgid(String sysqueryorgid) {
        this.sysqueryorgid = sysqueryorgid == null ? null : sysqueryorgid.trim();
    }

    public String getSysqueryuserid() {
        return sysqueryuserid;
    }

    public void setSysqueryuserid(String sysqueryuserid) {
        this.sysqueryuserid = sysqueryuserid == null ? null : sysqueryuserid.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}