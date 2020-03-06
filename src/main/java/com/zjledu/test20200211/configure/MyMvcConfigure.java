package com.zjledu.test20200211.configure;

import com.zjledu.test20200211.frame.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * author: King Long
 * date: 2020/2/15 9:08
 * 
 */
@Configuration
public class MyMvcConfigure implements WebMvcConfigurer {

    /**
     * 默认解析器 其中locale表示默认语言
     * localeResolver bean的名字不可以变
     */
    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.CHINA);
        return localeResolver;
    }
    /**
     * 默认拦截器 其中lang表示切换语言的参数名
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LocaleChangeInterceptor()).addPathPatterns("/login");
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","/thymeleaf/**").order(1);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/view/ok").setViewName("success");
    }

    /*public MyMvcConfigure(){
        System.out.println("------------------------initial myMVC Configure ----------------");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/helloWorld/**")) {
            registry.addResourceHandler("/helloWorld/**").addResourceLocations(new String[]{"classpath:/helloWorld/"});
        }
    }*/
}
