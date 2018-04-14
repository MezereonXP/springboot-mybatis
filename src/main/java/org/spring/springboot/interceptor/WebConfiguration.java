package org.spring.springboot.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan(basePackages={"org.spring.springboot.interceptor"})
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {

    /**日志*/
    private static final Log loger = LogFactory.getLog(WebConfiguration.class);


    public WebConfiguration() {
        loger.info("开启系统登录拦截");
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        this.excludeUserLogin(registry.addInterceptor(new LoginInterceptor()));
    }


    public void excludeUserLogin(InterceptorRegistration registration){
        registration.addPathPatterns("/api/*");
    }

}