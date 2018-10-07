package com.szjc.OrderManag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.szjc.OrderManag.common.Result;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class DeliverController {

    // 收货管理
    @GetMapping("/delivermanage")
    public String suppliertype(Model model) {
        return "delivermanage/delivermanagepage";
    }
}
