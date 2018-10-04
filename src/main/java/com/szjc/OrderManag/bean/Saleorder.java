package com.szjc.OrderManag.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Saleorder {
    private String id;

    private String orderno;

    private String drwno;

    private String speci;

    private String color;

    private String num;

    private String price;

    private String supplierid;

    private String sendaddr;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date sendtime;

    private String specialremark;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creattaime;

    private String creatuser;

    private String inventoryname;  // inventoryinfo表

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getDrwno() {
        return drwno;
    }

    public void setDrwno(String drwno) {
        this.drwno = drwno == null ? null : drwno.trim();
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

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public String getSendaddr() {
        return sendaddr;
    }

    public void setSendaddr(String sendaddr) {
        this.sendaddr = sendaddr == null ? null : sendaddr.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public String getSpecialremark() {
        return specialremark;
    }

    public void setSpecialremark(String specialremark) {
        this.specialremark = specialremark == null ? null : specialremark.trim();
    }

    public Date getCreattaime() {
        return creattaime;
    }

    public void setCreattaime(Date creattaime) {
        this.creattaime = creattaime;
    }

    public String getCreatuser() {
        return creatuser;
    }

    public void setCreatuser(String creatuser) {
        this.creatuser = creatuser == null ? null : creatuser.trim();
    }

    public String getInventoryname() {
        return inventoryname;
    }

    public void setInventoryname(String inventoryname) {
        this.inventoryname = inventoryname == null ? null : inventoryname.trim();
    }
}