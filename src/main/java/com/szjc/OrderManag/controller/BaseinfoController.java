package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Inventoryinfo;
import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.service.baseinfo.SupplierinfoService;
import com.szjc.OrderManag.service.baseinfo.SuppliersinventroyService;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
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

    @Autowired
    private SupplierinfoService supplierinfoService;

   @Autowired
   private UserinfoService userinfoService;

   @Autowired
   private SuppliersinventroyService suppliersinventroyService;

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

    // 用户信息
    @GetMapping("/userinfo")
    public String userinfo(Model model) {
        return "baseinfo/userinfopage";
    }

    // 供货管理
    @GetMapping("/suppliersinventroy")
    public String suppliersinventroy(Model model) {
        return "baseinfo/suppliersinventroypage";
    }

    // 查询用户信息
    @RequestMapping(value = "/searchuserinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result searchuserinfo(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = userinfoService.searchuserinfo(quickSearch);
        return Result.successResult(list);
    }

    // 新增用户信息
    @RequestMapping(value = "/adduserinfo", method = RequestMethod.POST)
    @ResponseBody
    Result  adduserinfo(@RequestBody Userinfo staff) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setUid(uuid);
        staff.setCreatuser("admin");
        int list = userinfoService.insert(staff);

        return Result.successResult(list);

    }

     // 查询物料数据
    @RequestMapping(value = "/searchInventory", method = RequestMethod.POST)
    @ResponseBody
    public Result searchInventory(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = inventoryinfoService.searchInventory(quickSearch);
        return Result.successResult(list);
    }

    // 新增物料数据
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

    // 查询供应商数据
    @RequestMapping(value = "/searchSupplier", method = RequestMethod.POST)
    @ResponseBody
    public Result searchSupplier(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = supplierinfoService.searchSupplier(quickSearch);
        return Result.successResult(list);
    }


    // 查询供货信息
    @RequestMapping(value = "/searchSuppliersinventroy", method = RequestMethod.POST)
    @ResponseBody
    public Result searchSuppliersinventroy(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = suppliersinventroyService.searchsuppliersinventroy(quickSearch);
        return Result.successResult(list);
    }
}
