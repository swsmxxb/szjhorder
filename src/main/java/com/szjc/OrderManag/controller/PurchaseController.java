package com.szjc.OrderManag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PurchaseController {

    // 开单
    @GetMapping("/purchasepage")
    public String puchasepage(Model model) {
        return "purchaseorderinfo/purchasepage";
    }
}
