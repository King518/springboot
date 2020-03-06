package com.zjledu.test20200211.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * author: King Long
 * date: 2020/2/18 16:09
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("1")
    public String test(String hello){
        System.out.println("-------------1---------------");

        if("hello".equals(hello)){
            throw new RuntimeException();
        }else if("success".equals(hello)) {

        }else{
            throw new NullPointerException();
        }

        return "nihao";

    }

    @RequestMapping("2")
    public String test1(String hello){
        System.out.println("-------------1---------------");

        if("hello".equals(hello)){
            throw new ArithmeticException();
        }else if("success".equals(hello)) {

        }else{
            throw new IndexOutOfBoundsException();
        }

        return "nihao";

    }

    /*@ExceptionHandler
    public String test(Exception e) {
        System.out.println("-------------exception---------------");
        System.err.println(e.getClass().getName());
        return "exception";
    }*/
}
