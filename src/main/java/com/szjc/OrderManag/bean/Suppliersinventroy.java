package com.szjc.OrderManag.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Suppliersinventroy {
    private String id;

    private String inventoryid;

    private String supplierid;

    private BigDecimal unitprice;

    private String unit;

    private String specialremark;

    private String creatuser;

    // 物料信息
    private String inventorycode;

    private String inventoryname;

    private String speci;

    private String material;

    private String color;

    // 供应商信息

    private String suppliercode;

    private String suppliername;

    private String suppliershotname;

    //
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creattime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid == null ? null : inventoryid.trim();
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid == null ? null : supplierid.trim();
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getSpecialremark() {
        return specialremark;
    }

    public void setSpecialremark(String specialremark) {
        this.specialremark = specialremark == null ? null : specialremark.trim();
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
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
}