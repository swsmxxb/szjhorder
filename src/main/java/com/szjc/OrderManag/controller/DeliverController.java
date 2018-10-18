package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.PurchaseorderH;
import com.szjc.OrderManag.service.baseinfo.PurchaseorderHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.szjc.OrderManag.common.Result;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class DeliverController {

   @Autowired
   private PurchaseorderHService purchaseorderHService;


    // 验收
    @RequestMapping(value = "/editpurchase", method = RequestMethod.POST)
    @ResponseBody
    public Result  editpurchase(@RequestBody PurchaseorderH staff) {
        int i = purchaseorderHService.updateByPrimaryKeySelective(staff);
        return Result.successResult(i);
    }
}
