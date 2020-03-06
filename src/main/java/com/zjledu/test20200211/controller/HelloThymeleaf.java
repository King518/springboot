package com.zjledu.test20200211.controller;

import com.zjledu.test20200211.entity.Dog;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.MessageUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * author: King Long
 * date: 2020/2/15 10:53
 */
@Controller
@RequestMapping("thymeleaf")
public class HelloThymeleaf {


    @RequestMapping("/hello")
    public String sayHello(Map params){
        params.put("hello","good days");
        return "success";
    }

    @RequestMapping("/test1")
    public String test1(Map params){
        params.put("username","张三");
        params.put("mytext","<span style='color:red'>hello world</span>");
        params.put("datetime",new Date());
        params.put("cssStyle","hehehehe");
        params.put("dog",new Dog("大黄",3));
        params.put("prods", Arrays.asList("a","b","c","d"));
        return "test1";
    }


}
