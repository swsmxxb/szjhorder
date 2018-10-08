package com.szjc.OrderManag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockController {

    // 开单页面
    @GetMapping("/stocklist")
    public String stocklistpage(Model model) {
        return "stockinfo/stockinfopage";
    }
}
