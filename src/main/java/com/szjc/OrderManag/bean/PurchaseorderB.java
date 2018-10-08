package com.szjc.OrderManag.bean;

import java.math.BigDecimal;

public class PurchaseorderB {
    private String bid;

    private String hid;

    private String inventoryid;

    private BigDecimal num;

    private String speci;

    private String color;

    private BigDecimal price;

    private String specialremark;

    private String sendaddr;

    private String addrcontenter;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid == null ? null : bid.trim();
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid == null ? null : hid.trim();
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid == null ? null : inventoryid.trim();
    }

    public BigDecimal getNum() {
        return num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public String getSpeci() {
        return speci;
    }

    public void setSpeci(String speci) {
        this.speci = speci == null ? null : speci.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSpecialremark() {
        return specialremark;
    }

    public void setSpecialremark(String specialremark) {
        this.specialremark = specialremark == null ? null : specialremark.trim();
    }

    public String getSendaddr() {
        return sendaddr;
    }

    public void setSendaddr(String sendaddr) {
        this.sendaddr = sendaddr == null ? null : sendaddr.trim();
    }

    public String getAddrcontenter() {
        return addrcontenter;
    }

    public void setAddrcontenter(String addrcontenter) {
        this.addrcontenter = addrcontenter == null ? null : addrcontenter.trim();
    }
}