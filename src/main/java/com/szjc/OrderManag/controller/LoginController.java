package com.szjc.OrderManag.controller;

import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.common.Encryption;
import com.szjc.OrderManag.common.Result;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import com.szjc.OrderManag.shiro.LonginWrongPassword;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserinfoService userinfoService;
    private Result loginResult = null;

    // 查询用户信息
    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
    public String login(@RequestBody Map<String,String> map) {
        String username = map.get("username");
        String password = map.get("password");
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            loginResult = new Result("1", "用户名或密码不能为空！", null);
            return "redirect:tlogin";
        }
        Encryption encryption = new Encryption();
        String psw = encryption.getMD5(password);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, psw);
//        List list = userinfoService.searchuserinfo(quickSearch);
        try {
            subject.login(token);
            return "redirect:loginSuccess";
        } catch (UnknownAccountException une) {
            token.clear();
//            une.printStackTrace();
            loginResult =  new Result("2", "此用户不存在！", null);
            return "redirect:tlogin";
        }catch (LockedAccountException lae) {
            token.clear();
//            lae.printStackTrace();
            loginResult =  new Result("3", "用户已失效！", null);
            return "redirect:tlogin";
        } catch (LonginWrongPassword e) {
            token.clear();
//            e.printStackTrace();
            loginResult = new Result("4", "密码不正确！", null);
            return "redirect:tlogin";
        } catch (AuthenticationException e) {
            token.clear();
//            e.printStackTrace();
            loginResult = new Result("9", "系统异常，请与管理员联系！", null);
            return "redirect:tlogin";
        }
    }

    @RequestMapping(value = "/tlogin", method = RequestMethod.GET)
    @ResponseBody
    public Result tlogin(HttpServletRequest request, HttpServletResponse response) {
     //   System.out.println("return:"+loginResult);
        if (loginResult != null && loginResult.getMessage() != null && loginResult.getMessage() != "") {
            Result loginResultCopy = loginResult;
            loginResult = null;
            return loginResultCopy;
        } else {
           // response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);//401
            return new Result("10", "用户还未被认证，跳转到登录界面！", null);
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public Result logout(){
//        Userinfo user = (Userinfo) SecurityUtils.getSubject().getPrincipal();
        SecurityUtils.getSubject().logout();

        return new Result("11", "退出成功！", null);
    }



    @RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
    @ResponseBody
    public Result loginSuccess(HttpServletRequest request) {
        Userinfo user = (Userinfo) SecurityUtils.getSubject().getPrincipal();
//        user.setLastLoginTime(new Date());
//        sysUserService.updateByPrimaryKeySelective(user);
        user.setPassword(null);
        Map resultMap = new HashMap();
        resultMap.put("user", user);
        resultMap.put("Authorization", SecurityUtils.getSubject().getSession().getId());
//        Result r = sysUserService.getPermissionPageAndButton(user.getUserName());
//        Map rMap = (Map) r.getData();
//        resultMap.putAll(rMap);
        return new Result("0", "登录成功！", resultMap);
    }

    @RequestMapping(value = "/unAuthorized", method = RequestMethod.GET)
    @ResponseBody
    public Result unAuthorized(HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);//403
        return new Result("11", "登录成功但是权限不足！", null);
    }
}
