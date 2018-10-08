package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Saleorder;
import com.szjc.OrderManag.bean.SaleorderExample;
import com.szjc.OrderManag.bean.SaleorderH;
import com.szjc.OrderManag.bean.SaleorderHExample;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.SaleorderBService;
import com.szjc.OrderManag.service.baseinfo.SaleorderHService;
import com.szjc.OrderManag.service.baseinfo.SaleorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    // 开单页面
    @GetMapping("/purchasepage")
    public String puchasepage(Model model) {
        return "purchaseorderinfo/purchasepage";
    }

    // 开单页面查询主表
    @RequestMapping(value = "/searchpurchase", method = RequestMethod.POST)
    @ResponseBody
    public Result  searchBdWarehouse(@RequestBody Map<String,Object> map) {

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
    public Result  addpurchase(@RequestBody SaleorderH staff) {
     //   System.out.println(staff);
//        Saleorder staff = new Saleorder();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setHid(uuid);
//        staff.setOrderno((String) map.get("orderno"));
//        staff.setDrwno((String) map.get("drwno"));
//        staff.setSendtime(new Date());
        staff.setCreatuser("admin");
        int list = saleorderHService.insert(staff);

        return Result.successResult(list);

    }


    // 采购管理页面
    @GetMapping("/purchasemanapage")
    public String purchasemanapage(Model model) {
        return "purchaseorderinfo/purchasemanapage";
    }

}
