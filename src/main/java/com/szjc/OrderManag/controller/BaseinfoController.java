package com.szjc.OrderManag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseinfoController {

    // 供应商管理
    @GetMapping("/materiel")
    public String materiel(Model model) {
        return "baseinfo/materiealpage";
    }

    // 供应商管理
    @GetMapping("/suppliers")
    public String suppliers(Model model) {
        return "baseinfo/supplierpage";
    }

    // 供应商类型
    @GetMapping("/suppliertype")
    public String suppliertype(Model model) {
        return "baseinfo/suppliertypepage";
    }


}
