package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.*;
import com.szjc.OrderManag.service.baseinfo.SupplierinfoService;
import com.szjc.OrderManag.service.baseinfo.SuppliersinventroyService;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.InventoryinfoService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class BaseinfoController {

    @Autowired
    private InventoryinfoService inventoryinfoService;

    @Autowired
    private SupplierinfoService supplierinfoService;

   @Autowired
   private SuppliersinventroyService suppliersinventroyService;


     // 查询物料数据
    @RequestMapping(value = "/searchInventory", method = RequestMethod.POST)
    public Result searchInventory(HttpServletRequest request,@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
//        Userinfo user = (Userinfo) request.getAttribute("user");
//        String userId = user.getUid();
//        System.out.println(userId);
        List list = inventoryinfoService.searchInventory(quickSearch);
        return Result.successResult(list);
    }

    // 新增物料数据
    @RequestMapping(value = "/addinventoryinfo", method = RequestMethod.POST)
    public Result  addinventoryinfo(HttpServletRequest request,@RequestBody Inventoryinfo staff) {
        Userinfo user = (Userinfo) request.getAttribute("user");
        String userId = user.getUid();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setId(uuid);
//        staff.setOrderno((String) map.get("orderno"));
//        staff.setDrwno((String) map.get("drwno"));
//        staff.setSendtime(new Date());
        staff.setCreatuser(userId);
        int list = inventoryinfoService.insert(staff);
        return Result.successResult(list);
    }



    // 编辑物料
    @RequestMapping(value = "/editinventoryinfo", method = RequestMethod.POST)
    public Result  editinventoryinfo(@RequestBody Inventoryinfo staff) {
        int i = inventoryinfoService.updateByPrimaryKeySelective(staff);
        return Result.successResult(i);
    }


    // 编辑供应商
    @RequestMapping(value = "/editsupplierinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result  editsupplierinfo(@RequestBody  Supplierinfo staff) {
        int i = supplierinfoService.updateByPrimaryKeySelective(staff);
        return Result.successResult(i);
    }


    // 新增供应商数据
    @RequestMapping(value = "/addsupplierinfo", method = RequestMethod.POST)
    public Result  addsupplierinfo(@RequestBody Supplierinfo staff) {
//        Saleorder staff = new Saleorder();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setId(uuid);
//        staff.setOrderno((String) map.get("orderno"));
//        staff.setDrwno((String) map.get("drwno"));
//        staff.setSendtime(new Date());
        staff.setCreatuser("admin");
        int list = supplierinfoService.insert(staff);
        return Result.successResult(list);
    }





    // 查询供应商数据
    @RequestMapping(value = "/searchSupplier", method = RequestMethod.POST)
    public Result searchSupplier(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = supplierinfoService.searchSupplier(quickSearch);
        return Result.successResult(list);
    }


    // 查询供货信息
    @RequestMapping(value = "/searchSuppliersinventroy", method = RequestMethod.POST)
    public Result searchSuppliersinventroy(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = suppliersinventroyService.searchsuppliersinventroy(quickSearch);
        return Result.successResult(list);
    }


}
