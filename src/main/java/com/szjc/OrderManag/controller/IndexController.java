package com.szjc.OrderManag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String mainpage(Model model) {
        return "index";
    }

    @GetMapping("/")
    public String defaultpage (Model model) {
        return "login";
    }

    @GetMapping("/tables")
    public String tables(Model model) {
        return "table_bootstrap";
    }

    @GetMapping("/pringtpage")
    public String pringtpage(Model model) {
        return "printtempl/printpage";
    }

    @GetMapping("/login")
    public String loginpage(Model model) {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "graph_echarts";
    }

    @GetMapping("/uplodpage")
    public String uplodpage(Model model) {
        return "form_webuploader";
    }

}
