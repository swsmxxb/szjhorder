package com.szjc.OrderManag.bean;

import java.util.Date;

public class Inventoryinfo {
    private String id;

    private String inventorycode;

    private String inventoryname;

    private String speci;

    private Date creattime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInventorycode() {
        return inventorycode;
    }

    public void setInventorycode(String inventorycode) {
        this.inventorycode = inventorycode == null ? null : inventorycode.trim();
    }

    public String getInventoryname() {
        return inventoryname;
    }

    public void setInventoryname(String inventoryname) {
        this.inventoryname = inventoryname == null ? null : inventoryname.trim();
    }

    public String getSpeci() {
        return speci;
    }

    public void setSpeci(String speci) {
        this.speci = speci == null ? null : speci.trim();
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }
}