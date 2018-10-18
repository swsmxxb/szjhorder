package com.szjc.OrderManag.shiro;

//import com.wyait.manage.dao.UserMapper;
//import com.wyait.manage.pojo.Permission;
//import com.wyait.manage.pojo.Role;
//import com.wyait.manage.pojo.User;
//import com.wyait.manage.service.AuthService;
//import com.wyait.manage.service.UserServiceImpl;
import com.szjc.OrderManag.bean.*;
import com.szjc.OrderManag.dao.UserinfoMapper;
import com.szjc.OrderManag.service.baseinfo.UserinfoService;
import com.szjc.OrderManag.service.impl.baseinfo.UserinfoImpl;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.*;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @项目名称：wyait-manage
 * @包名：com.wyait.manage.shiro
 * @类描述：
 * @创建人：wyait
 * @创建时间：2017-12-13 13:53
 * @version：V1.0
 */
@Service
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserinfoService<Userinfo, UserinfoExample> userinfoService;
//    @Autowired
//    private AuthService authService;

    /**
     * 授予角色和权限
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principalCollection) {
        //授权
//        logger.debug("授予角色和权限");
        // 添加权限 和 角色信息
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 获取当前登陆用户
        Subject subject = SecurityUtils.getSubject();
        Userinfo user = (Userinfo) subject.getPrincipal();
        if (user.getUsername().equals("zhangliang")) {
            // 超级管理员，添加所有角色、添加所有权限
            authorizationInfo.addRole("*");
            authorizationInfo.addStringPermission("*");
        } else {
            // 普通用户，查询用户的角色，根据角色查询权限
            authorizationInfo.addRole("*");
            authorizationInfo.addStringPermission("*");
//            String userId = user.getUid();
//            List<Role> roles = this.authService.getRoleByUser(userId);
//            if (null != roles && roles.size() > 0) {
//                for (Role role : roles) {
//                    authorizationInfo.addRole(role.getCode());
//                    // 角色对应的权限数据
//                    List<Permission> perms = this.authService.findPermsByRoleId(role
//                            .getId());
//                    if (null != perms && perms.size() > 0) {
//                        // 授权角色下所有权限
//                        for (Permission perm : perms) {
//                            authorizationInfo.addStringPermission(perm
//                                    .getCode());
//                        }
//                    }
//                }
//            }
        }
        return authorizationInfo;
    }

    /**
     * 登录认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token)
            throws AuthenticationException {
           //获取用户的输入的账号.
        String username = (String) token.getPrincipal(); //token的getPrincipal()获得登录接口中token中的第一个参数username
        Object ss =  token.getCredentials();
        String password = String.valueOf((char[]) ss);
        List<Userinfo> list = userinfoService.selectUserByUserName(username);
        if (list.size() <= 0) {
            throw new UnknownAccountException();
        }
        Userinfo user = list.get(0);
        if ("2".equals(user.getStatus())) {
            throw new LockedAccountException();
        }
        if (!password.equals(user.getPassword())) {
            throw new LonginWrongPassword();
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user, //用户
                user.getPassword(), //密码
                ByteSource.Util.bytes(username),
                getName()  //realm nameA
        );
        // 当验证都通过后，把用户信息放在session里
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("userSession", user);
        session.setAttribute("userSessionId", user.getUid());
        return authenticationInfo;
    }

    /**
     * 清除所有缓存【实测无效】
     */
    public void clearCachedAuth(){
        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }
}
