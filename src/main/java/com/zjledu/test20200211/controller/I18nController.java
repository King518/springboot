package com.zjledu.test20200211.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * author: King Long
 * date: 2020/2/16 20:58
 */
@Controller
@RequestMapping("/login")
public class I18nController {

    @RequestMapping
    public ModelAndView login2(String locale, Map<String,Object> map,Locale language){
        System.out.println(language);
        map.put("username","zhangsan");
        map.put("date",new Date());
        Locale l = Locale.CHINA;
        if(locale!=null){
            String[] info = locale.split("_");
            l =  new Locale(info[0],info[1]);
        }
        System.out.println(messageSource.getMessage("home.welcome",new Object[]{"张三",new Date()},l));
        return new ModelAndView("login");
    }

    @Autowired
    private MessageSource messageSource;
    @RequestMapping(produces = {"text/html"})
    public ModelAndView login1(String locale, Map<String,Object> map,Locale language){
        System.out.println(language);
        map.put("username","zhangsan");
        map.put("date",new Date());
        Locale l = Locale.CHINA;
        if(locale!=null){
            String[] info = locale.split("_");
            l =  new Locale(info[0],info[1]);
        }
        System.out.println(messageSource.getMessage("home.welcome",new Object[]{"张三",new Date()},l));
        return new ModelAndView("login");
    }


}
