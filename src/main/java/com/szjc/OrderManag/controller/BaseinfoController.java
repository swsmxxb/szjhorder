package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Inventoryinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.InventoryinfoService;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class BaseinfoController {

    @Autowired
    private InventoryinfoService inventoryinfoService;

    // 物料管理
    @GetMapping("/inventor")
    public String materiel(Model model) {
        return "baseinfo/inventorypage";
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



    @RequestMapping(value = "/searchInventory", method = RequestMethod.POST)
    @ResponseBody
    public Result searchInventory(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = inventoryinfoService.searchInventory(quickSearch);
        return Result.successResult(list);
    }

    // 新增数据
    @RequestMapping(value = "/addinventoryinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result  addinventoryinfo(@RequestBody Inventoryinfo staff) {
        //   System.out.println(staff);
//        Saleorder staff = new Saleorder();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setId(uuid);
//        staff.setOrderno((String) map.get("orderno"));
//        staff.setDrwno((String) map.get("drwno"));
//        staff.setSendtime(new Date());
        staff.setCreatuser("admin");
        int list = inventoryinfoService.insert(staff);

        return Result.successResult(list);

    }

}
