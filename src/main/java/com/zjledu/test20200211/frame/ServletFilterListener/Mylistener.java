package com.zjledu.test20200211.frame.ServletFilterListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * author: King Long
 * date: 2020/2/20 8:00
 */
//@WebListener
public class Mylistener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context ===== initial=======");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context ===== destroy=======");
    }

}
