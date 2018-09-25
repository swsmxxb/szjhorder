package com.szjc.OrderManag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.szjc.OrderManag.common.Result;

import java.util.List;
import java.util.Map;

@Controller
public class BaseinfoController {



    // 物料管理
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



    @RequestMapping(value = "/searchmateriel", method = RequestMethod.POST)
    public Result searchBdWarehouse(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        String objectCode = (String) map.get("objectCode");
        String objectName = (String) map.get("objectName");
        String state = (String) map.get("state");
      //  List<BdWarehouse> list = bdWarehouseService.selectWarehouseListByKey(quickSearch,objectCode,objectName,state);
        return Result.successResult("1");
    }
}
