package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.*;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.PurchaseorderHService;
import com.szjc.OrderManag.service.baseinfo.SaleorderBService;
import com.szjc.OrderManag.service.baseinfo.SaleorderHService;
import com.szjc.OrderManag.service.baseinfo.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class PurchaseController {
    @Autowired
    private SaleorderHService saleorderHService;

    @Autowired
    private SaleorderBService saleorderBService;

    @Autowired
    private PurchaseorderHService purchaseorderHService;


    // 开单页面查询主表
    @RequestMapping(value = "/searchpurchase", method = RequestMethod.POST)
    @ResponseBody
    public Result  searchpurchase(@RequestBody Map<String,Object> map) {

        String quickSearch = (String) map.get("quickSearch");
//        String objectName = (String) map.get("objectName");
//        String state = (String) map.get("state");
        List list = saleorderHService.searchpurchase(quickSearch);

        return Result.successResult(list);

    }

    // 开单页面查询子表
    @RequestMapping(value = "/searchorderb", method = RequestMethod.POST)
    @ResponseBody
    public Result  searchorderb(@RequestBody Map<String,Object> map) {
        String HID = (String) map.get("hid");
        List list = saleorderBService.searchorderb(HID);
        return Result.successResult(list);

    }

    // 新增数据
    @RequestMapping(value = "/addpurchase", method = RequestMethod.POST)
    @ResponseBody
    public Result  addpurchase(HttpServletRequest request, @RequestBody SaleorderH staff) {
      Userinfo user = (Userinfo) request.getAttribute("user");
        String userId = user.getUid();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setHid(uuid);
       staff.setPurchaseno("1");
        staff.setStatus("1");
        staff.setCustoms("1");
        staff.setCreatuser(userId);
        int list = saleorderHService.insert(staff);

        return Result.successResult(list);

    }


    // 采购单主表查询
    @RequestMapping(value = "/searchpurchaseorderh", method = RequestMethod.POST)
    @ResponseBody
    public Result  searchpurchaseorderh(@RequestBody Map<String,Object> map) {

        String quickSearch = (String) map.get("quickSearch");
//        String objectName = (String) map.get("objectName");
//        String state = (String) map.get("state");
        List list = purchaseorderHService.searchpurchaseorderh(quickSearch);

        return Result.successResult(list);

    }

    // 开单页面查询子表
    @RequestMapping(value = "/searchpurchaseorderb", method = RequestMethod.POST)
    @ResponseBody
    public Result  searchpurchaseorderb(@RequestBody Map<String,Object> map) {
        String HID = (String) map.get("hid");
        List list = saleorderBService.searchorderb(HID);
        return Result.successResult(list);
    }

}
