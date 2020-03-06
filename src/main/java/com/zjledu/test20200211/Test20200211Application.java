package com.zjledu.test20200211;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.Date;

//@ServletComponentScan
@SpringBootApplication
public class Test20200211Application {

    final static Logger logger  = LoggerFactory.getLogger(Test20200211Application.class);

    public static void main(String[] args) {
        Date date = new Date();

        logger.trace("Hello {} {}","world",date);
        logger.debug("Hello {}  {}","world",date);
        logger.info("Hello {} {}","world",date);
        logger.warn("Hello {}  {}","world",date);
        logger.error("Hello {}  {}","world",date);
        System.out.println("你好");
        SpringApplication.run(Test20200211Application.class, args);
    }

}
