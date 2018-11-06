package com.szjc.OrderManag.shiro;

import com.szjc.OrderManag.bean.Userinfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserActionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
     //   Userinfo user = (Userinfo) SecurityUtils.getSubject().getSession().getAttribute("userSession");
        Userinfo user = new Userinfo();
       user.setUid("bd64766be9934e4c8d9586dd224cece3");
        System.out.println(user);
        request.setAttribute("user", user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

}
