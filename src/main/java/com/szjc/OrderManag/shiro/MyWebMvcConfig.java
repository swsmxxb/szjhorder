package com.szjc.OrderManag.shiro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     *
     * @描述：在Spring添加拦截器之前先创建拦截器对象，这样就能在Spring映射这个拦截器前，把拦截器中的依赖注入的对象给初始化完成了。

     */
    @Bean
    public UserActionInterceptor userActionInterceptor(){
        return new UserActionInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 路径根据后期项目的扩展，进行调整
        registry.addInterceptor(userActionInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login","/tlogin","/unAuthorized","/loginSuccess");
        super.addInterceptors(registry);
    }

    /**
     *
     * @描述：将错误页面注册到servlet容器中
     */
	/*@Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return new EmbeddedServletContainerCustomizer(){
            @Override
            public void customize(ConfigurableEmbeddedServletContainer container) {
                container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404"));
                container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500"));
                container.addErrorPages(new ErrorPage(java.lang.Throwable.class,"/error/500"));
            }
        };
    }*/
}
