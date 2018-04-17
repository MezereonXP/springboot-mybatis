package org.spring.springboot.interceptor;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.spring.springboot.controller.TeamRestController;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan(basePackages={"org.spring.springboot.interceptor"})
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {

    /**日志*/
    private static Logger logger = LogManager.getLogger(WebConfiguration.class);

    public WebConfiguration() {
        logger.info("开启系统登录拦截");
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        this.excludeUserLogin(registry.addInterceptor(new LoginInterceptor()));
    }


    public void excludeUserLogin(InterceptorRegistration registration){
        registration.addPathPatterns("/api/*");
        registration.excludePathPatterns("/api/checkAuth");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/cors", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

}