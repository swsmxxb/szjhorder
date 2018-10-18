package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Roleinfo;
import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.RoleinfoService;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class SyssettingController {

    @Autowired
    private UserinfoService userinfoService;

    @Autowired
    private RoleinfoService roleinfoService;


    // 查询用户信息
    @RequestMapping(value = "/searchuserinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result searchuserinfo(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = userinfoService.searchuserinfo(quickSearch);
        return Result.successResult(list);
    }

    // 查询角色信息
    @RequestMapping(value = "/searchroleinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result searchroleinfo(@RequestBody Map<String,Object> map) {
        String quickSearch = (String) map.get("quickSearch");
        List list = roleinfoService.searchroleinfo(quickSearch);
        return Result.successResult(list);
    }

    // 新增用户信息
    @RequestMapping(value = "/adduserinfo", method = RequestMethod.POST)
    @ResponseBody
    public  Result  adduserinfo(@RequestBody Userinfo staff) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setUid(uuid);
        staff.setCreatuser("admin");
        int list = userinfoService.insert(staff);

        return Result.successResult(list);

    }

    // 新增角色信息
    @RequestMapping(value = "/addroleinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result  addroleinfo(@RequestBody Roleinfo staff) {
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setRid(uuid);
        staff.setCreatuser("bd64766be9934e4c8d9586dd224cece3");
        int list = roleinfoService.insert(staff);
        return Result.successResult(list);
    }
}
