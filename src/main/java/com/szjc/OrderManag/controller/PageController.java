package com.szjc.OrderManag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // 物料管理
    @GetMapping("/inventor")
    public String materiel(Model model) {
        return "baseinfo/inventorypage";
    }

    // 供应商管理
    @GetMapping("/suppliers")
    public String suppliers(Model model) {
        return "baseinfo/supplierpage";
    }

    // 供货管理
    @GetMapping("/suppliersinventroy")
    public String suppliersinventroy(Model model) {
        return "baseinfo/suppliersinventroypage";
    }

    // 收货管理
    @GetMapping("/delivermanage")
    public String delivermanage(Model model) {
        return "delivermanage/delivermanagepage";
    }

    // 开单页面
    @GetMapping("/purchasepage")
    public String puchasepage(Model model) {
        return "purchaseorderinfo/purchasepage";
    }

    // 采购管理页面
    @GetMapping("/purchasemanapage")
    public String purchasemanapage(Model model) {
        return "purchaseorderinfo/purchasemanapage";
    }

    // 结算页面
    @GetMapping("/statementpage")
    public String statementpage(Model model) {
        return "statement/statementpage";
    }

    // 库存管理页面
    @GetMapping("/stocklist")
    public String stocklistpage(Model model) {
        return "stockinfo/stockinfopage";
    }

    // 库存查询页面
    @GetMapping("/stocksearch")
    public String stocksearch(Model model) {
        return "stockinfo/stocksearchpage";
    }

    // 用户信息
    @GetMapping("/userinfo")
    public String userinfo(Model model) {
        return "baseinfo/userinfopage";
    }

    // 角色信息
    @GetMapping("/roleinfo")
    public String roleinfo(Model model) {
        return "baseinfo/roleinfopage";
    }

}
