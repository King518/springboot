package com.zjledu.test20200211.frame.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * author: King Long
 * date: 2020/2/18 16:06
 */
@ControllerAdvice
public class AppException {

    @ExceptionHandler(value=NullPointerException.class)
    public ModelAndView hello(Exception e){
        System.out.println("------------controller Advice-------------");
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        return new ModelAndView("success");
    }
}
