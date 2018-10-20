package com.szjc.OrderManag.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.eis.MemorySessionDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by yangqj on 2017/4/23.
 */
@Configuration
public class ShiroConfig {

    /**
     * 管理shiro bean生命周期
     */
    @Bean
    public static LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * ShiroFilterFactoryBean 处理拦截资源文件问题。
     * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，因为在初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
     *
     * Filter Chain定义说明
     * 1、一个URL可以配置多个Filter，使用逗号分隔
     * 2、当设置多个过滤器时，第一个通过 就都通过了
     * 3、部分过滤器可指定参数，如perms，roles
     */
    @Bean
    public ShiroFilterFactoryBean shirFilter(){
        System.out.println("ShiroConfiguration.shirFilter()初始化");
        //过滤器工厂
        ShiroFilterFactoryBean shiroFilterFactoryBean  = new ShiroFilterFactoryBean();
        //添加自定义的认证过滤器

        // 必须设置 SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面
        //没有认证跳转的界面
        shiroFilterFactoryBean.setLoginUrl("/toLogin"); //配置的是接口路径
        // 登录成功后要跳转的链接
        shiroFilterFactoryBean.setSuccessUrl("/index");

        Map filterMap = shiroFilterFactoryBean.getFilters();
        filterMap.put("myauthc", new MyAuthenticationFilter()); //自定义过滤器
        shiroFilterFactoryBean.setFilters(filterMap);
        // 如果自己写login登录，成功了也实现跳转到这个接口。统一登录路径。
//        shiroFilterFactoryBean.setSuccessUrl("/usersPage");//配置的是接口路径
        //未授权界面;如果写了未授权异常捕捉，请求走的还是捕捉异常的/exh接口
        shiroFilterFactoryBean.setUnauthorizedUrl("/unAuthorized");//配置的是接口路径
        //拦截器.
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String,String>();
        //配置退出 过滤器,其中的具体的退出代码Shiro已经替我们实现了，只需在前台写/logout就能使用。


        filterChainDefinitionMap.put("/logout", "logout");
        filterChainDefinitionMap.put("/login", "anon");
        filterChainDefinitionMap.put("/v2/**", "anon");
        filterChainDefinitionMap.put("/scanner/**", "anon");
        filterChainDefinitionMap.put("/ss", "anon");

        filterChainDefinitionMap.put("/css/*", "anon");
        filterChainDefinitionMap.put("/js/*", "anon");
        filterChainDefinitionMap.put("/js/*/*", "anon");
        filterChainDefinitionMap.put("/js/*/*/*", "anon");
        filterChainDefinitionMap.put("/img/*/**", "anon");
        filterChainDefinitionMap.put("/fonts/*/**", "anon");
        filterChainDefinitionMap.put("/inventroypic/**", "anon");
        //自定义加载权限资源关系 配置perms权限过滤器
//        List<SysPermission> list = sysPermissionService.getAllPermission();
//        for(SysPermission sysPermission : list){
//            if (StringUtil.isNotEmpty(sysPermission.getUri())) {
//                String permission = "perms[" + sysPermission.getUri()+ "]";
//                filterChainDefinitionMap.put(sysPermission.getUri(), permission);
//            }
//        }
        filterChainDefinitionMap.put("/**", "myauthc");
//        filterChainDefinitionMap.put("/**", "anon");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }
    /**
     * sessionManager即会话管理
     */
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();
        //设置realm.
        securityManager.setRealm(myShiroRealm());
        // 自定义缓存实现 使用redis,ecache等等
//        securityManager.setCacheManager(cacheManager());
        // 自定义session管理
        securityManager.setSessionManager(sessionManager());
        return securityManager;
    }

    /**
     * 配置自己的realm获取数据库数据
     */
    @Bean
    public MyShiroRealm myShiroRealm(){
        MyShiroRealm myShiroRealm = new MyShiroRealm();
        //配置凭证匹配器
//        myShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
        return myShiroRealm;
    }

    /**
     * 凭证匹配器
     * 由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了，所以我们需要修改下doGetAuthenticationInfo中的代码;
     */
    @Bean
    public HashedCredentialsMatcher hashedCredentialsMatcher(){
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列算法:这里使用MD5算法;
        hashedCredentialsMatcher.setHashIterations(2);//散列的次数，比如散列两次，相当于 md5(md5(""));
        return hashedCredentialsMatcher;
    }


    /**
     *  开启shiro aop注解支持.
     *  使得可在controller方法中使用shiro注解配置权限 @RequiresPermissions 等
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }

    /**
     * shiro 自定义session的管理
     */
    @Bean
    public DefaultWebSessionManager sessionManager() {
        MySessionManager mySessionManager = new MySessionManager();
        //删除失效的session
        mySessionManager.setDeleteInvalidSessions(Boolean.TRUE);
        //设置session的失效时间
        mySessionManager.setGlobalSessionTimeout(30 * 60 * 1000);
        //设置sessionDao用于访问服务器session，获取访问服务器并且连接成功的所有对象以用于其他操作
        mySessionManager.setSessionDAO(sessionDao());
        return mySessionManager;
    }

    /**
     * 配置访问服务器本地session的类
     */
    @Bean
    public MemorySessionDAO sessionDao() {
        MemorySessionDAO dao = new MemorySessionDAO();
        return dao;
    }

    /**
     * 配置缓存,防止授权信息是频繁访问数据库。
     */
//    要被调用的方法不能打@Bean！
//    public EhCacheManager cacheManager() {
//        EhCacheManager ehCacheManager = new EhCacheManager();
//        ehCacheManager.setCacheManagerConfigFile("classpath:shiro-ehcache.xml");
//        return ehCacheManager;
//    }
}
