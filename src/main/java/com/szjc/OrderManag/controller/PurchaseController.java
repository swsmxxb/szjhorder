package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Saleorder;
import com.szjc.OrderManag.bean.SaleorderExample;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class PurchaseController {
    @Autowired
    private SaleorderService<Saleorder, SaleorderExample> saleorderService;
    // 开单
    @GetMapping("/purchasepage")
    public String puchasepage(Model model) {
        return "purchaseorderinfo/purchasepage";
    }


    @RequestMapping(value = "/searchpurchase", method = RequestMethod.POST)
    @ResponseBody
    public Result  searchBdWarehouse(@RequestBody Map<String,Object> map) {

        String quickSearch = (String) map.get("quickSearch");
//        String objectName = (String) map.get("objectName");
//        String state = (String) map.get("state");
        List list = saleorderService.searchpurchase(quickSearch);

        return Result.successResult(list);

    }
}
