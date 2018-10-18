package com.szjc.OrderManag.shiro;

import com.szjc.OrderManag.bean.Userinfo;
import com.szjc.OrderManag.bean.UserinfoExample;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: syj
 * @Date: create at 9:41 on 2018/3/19
 */
public class MyAuthenticationFilter extends FormAuthenticationFilter {
    @Autowired
    private UserinfoService<Userinfo, UserinfoExample> userinfoService;
    //原FormAuthenticationFilter的认证方法
    @Override
    protected boolean onAccessDenied(ServletRequest requestA, ServletResponse responseA) throws Exception {
        //在这里进行验证码的校验
        HttpServletRequest request = (HttpServletRequest) requestA;
        HttpServletResponse response = (HttpServletResponse) responseA;
        boolean flag = true;
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token,Authorization,Content-Disposition");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Max-Age", "1800");
        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            String u = request.getRequestURI();
            System.out.println(u);
            request.getRequestDispatcher(u).forward(request,response);
            return Boolean.parseBoolean(null);
        }else {
            return super.onAccessDenied(request, response);
        }

    }

    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) throws Exception {
        System.out.println("onsucess登录成功");
//        登陆成功重定向
        WebUtils.getAndClearSavedRequest(request);
        WebUtils.redirectToSavedRequest(request, response, "/loginSuccess");
//        直接处理成功重定向，防止连锁继续
        return false;
    }
}
