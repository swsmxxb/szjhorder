package com.szjc.OrderManag.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseinfoController {


    @GetMapping("/suppliers")
    public String suppliers(Model model) {
        return "supplierpage";
    }

    @GetMapping("/suppliertype")
    public String suppliertype(Model model) {
        return "suppliertypepage";
    }
}
