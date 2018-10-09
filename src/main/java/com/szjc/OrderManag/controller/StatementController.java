package com.szjc.OrderManag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatementController {

      // 结算页面
    @GetMapping("/statementpage")
    public String suppliertype(Model model) {
        return "statement/statementpage";
    }
}
