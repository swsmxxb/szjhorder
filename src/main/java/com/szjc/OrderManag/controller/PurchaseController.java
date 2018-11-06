package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.*;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.PurchaseorderHService;
import com.szjc.OrderManag.service.baseinfo.SaleorderBService;
import com.szjc.OrderManag.service.baseinfo.SaleorderHService;
import com.szjc.OrderManag.service.baseinfo.SaleorderService;

import net.sf.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
    public Result  addpurchase(HttpServletRequest request, @RequestBody Map<String,String> map) {
      Userinfo user = (Userinfo) request.getAttribute("user");
        String userId = user.getUid();

        JSONArray json = JSONArray.fromObject((String) map.get("detail"));  //  子表 信息转换
        List<SaleorderB> detaillist= (List<SaleorderB>)JSONArray.toCollection(json, SaleorderB.class);

       SaleorderH staff= new SaleorderH();
        Date adddate = new Date();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();  // 主表 ID

        String custommanag = (String) map.get("custommanag");
        String orderno = (String) map.get("orderno");
        staff.setHid(uuid);
       staff.setPurchaseno("1");
        staff.setStatus("1");
        staff.setCustoms("1");
        staff.setCustommanag(custommanag);  // 客户担当
        staff.setOrderno(orderno);
        staff.setCreatuser(userId);
        staff.setCreattime(adddate);
        int list = saleorderHService.insert(staff);
        for (SaleorderB group : detaillist) {
            String buuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
            group.setBid(buuid);
            group.setHid(uuid);
            group.setCreatuser(userId);
            group.setCreattaime(adddate);
            int listb =   saleorderBService.insert(group);
        }

        return Result.successResult(1);

    }

    // 开单/ 更新订单数据
    @RequestMapping(value = "/updatepurchase", method = RequestMethod.POST)
    @ResponseBody
    public Result  updatepurchase(HttpServletRequest request, @RequestBody Map<String,String> map) {
        Userinfo user = (Userinfo) request.getAttribute("user");
        String userId = user.getUid();
        Date adddate = new Date();
        String hid=(String) map.get("getid");
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();  // 主表 ID

        JSONArray json = JSONArray.fromObject((String) map.get("detail"));  //  子表 信息转换
        List<SaleorderB> detaillist= (List<SaleorderB>)JSONArray.toCollection(json, SaleorderB.class);


      for (SaleorderB group : detaillist) {

          int listb =   saleorderBService.updateByPrimaryKeySelective(group);
      }
        List<SaleorderB> list = saleorderBService.searchorderbgroup(hid);  //  查询去掉重复的供应商

        PurchaseorderH purchaseorderh= new PurchaseorderH();


        for (int i=0;i<list.size();i++) {
            String phuuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();  // 主表 IDph
            purchaseorderh.setHid(phuuid);
            purchaseorderh.setStatus("1");
            purchaseorderh.setCreatuser(userId);
            purchaseorderh.setCreattime(adddate);
            purchaseorderh.setSendtime(adddate);
            purchaseorderh.setOrderno((String) map.get("orderno"));
            purchaseorderh.setSupplierid(list.get(i).getSupplierid());
            purchaseorderHService.insert(purchaseorderh);
        }
        return Result.successResult(1);

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

    public static List<String> jsonToList(String s){
        List<String> list =new ArrayList<>();
        try {
            JSONArray jsonArray = JSONArray.fromObject(s);
            for (int i=0;i<jsonArray.size();i++){
                list.add((String) jsonArray.get(i));
            }
        } catch (JSONException e1) {
            e1.printStackTrace();
        }
        return list;
    }

}
