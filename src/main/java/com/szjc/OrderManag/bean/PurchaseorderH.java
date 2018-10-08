package com.szjc.OrderManag.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PurchaseorderH {
    private String hid;

    private String supplierid;

    private String orderno;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date sendtime;

    private String creatuser;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creattime;

    private String status;

    private String picaddr;

    private String problemtype;

    private String problemremark;

    private String suppliershotname;  //供应商表

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid == null ? null : hid.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getCreatuser() {
        return creatuser;
    }

    public void setCreatuser(String creatuser) {
        this.creatuser = creatuser == null ? null : creatuser.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPicaddr() {
        return picaddr;
    }

    public void setPicaddr(String picaddr) {
        this.picaddr = picaddr == null ? null : picaddr.trim();
    }

    public String getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype == null ? null : problemtype.trim();
    }

    public String getProblemremark() {
        return problemremark;
    }

    public void setProblemremark(String problemremark) {
        this.problemremark = problemremark == null ? null : problemremark.trim();
    }

    public String getSuppliershotname() {
        return suppliershotname;
    }

    public void setSuppliershotname(String suppliershotname) {
        this.suppliershotname = suppliershotname == null ? null : suppliershotname.trim();
    }
}