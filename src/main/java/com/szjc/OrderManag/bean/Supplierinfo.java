package com.szjc.OrderManag.bean;

import java.util.Date;

public class Supplierinfo {
    private String id;

    private String suppliercode;

    private String suppliername;

    private String suppliershotname;

    private String contenter;

    private String tels;

    private String faxs;

    private String email;

    private String address;

    private Date creattime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSuppliercode() {
        return suppliercode;
    }

    public void setSuppliercode(String suppliercode) {
        this.suppliercode = suppliercode == null ? null : suppliercode.trim();
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername == null ? null : suppliername.trim();
    }

    public String getSuppliershotname() {
        return suppliershotname;
    }

    public void setSuppliershotname(String suppliershotname) {
        this.suppliershotname = suppliershotname == null ? null : suppliershotname.trim();
    }

    public String getContenter() {
        return contenter;
    }

    public void setContenter(String contenter) {
        this.contenter = contenter == null ? null : contenter.trim();
    }

    public String getTels() {
        return tels;
    }

    public void setTels(String tels) {
        this.tels = tels == null ? null : tels.trim();
    }

    public String getFaxs() {
        return faxs;
    }

    public void setFaxs(String faxs) {
        this.faxs = faxs == null ? null : faxs.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}