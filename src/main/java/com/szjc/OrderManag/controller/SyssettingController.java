package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Roleinfo;
import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.common.Encryption;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.RoleinfoService;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    public  Result  adduserinfo(HttpServletRequest request,@RequestBody Userinfo staff) {
        Userinfo user = (Userinfo) request.getAttribute("user");
        String userId = user.getUid();
        Encryption encryption = new Encryption();
        String psw = encryption.getMD5(staff.getPassword());
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setUid(uuid);
        staff.setPassword(psw);
        staff.setCreatuser(userId);
        int list = userinfoService.insert(staff);

        return Result.successResult(list);

    }

    // 编辑用户
    @RequestMapping(value = "/edituserinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result  edituserinfo(@RequestBody Userinfo staff) {
        Encryption encryption = new Encryption();
        String psw = encryption.getMD5(staff.getPassword());
        staff.setPassword(psw);
        int i = userinfoService.updateByPrimaryKeySelective(staff);
        return Result.successResult(i);
    }

    // 新增角色信息
    @RequestMapping(value = "/addroleinfo", method = RequestMethod.POST)
    @ResponseBody
    public Result  addroleinfo(HttpServletRequest request, @RequestBody Roleinfo staff) {
        Userinfo user = (Userinfo) request.getAttribute("user");
        String userId = user.getUid();
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        staff.setRid(uuid);
        staff.setCreatuser(userId);
        int list = roleinfoService.insert(staff);
        return Result.successResult(list);
    }
}
