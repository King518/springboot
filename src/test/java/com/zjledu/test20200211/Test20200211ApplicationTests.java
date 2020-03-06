package com.zjledu.test20200211;

import com.zjledu.test20200211.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
class Test20200211ApplicationTests {

    final Logger logger  = LoggerFactory.getLogger(getClass());

    @Autowired
    User user;

    @Test
    void contextLoads() {

        Date date = new Date();

        logger.trace("Hello {} {}","world",date);
        logger.debug("Hello {}  {}","world",date);
        logger.info("Hello {} {}","world",date);
        logger.warn("Hello {}  {}","world",date);
        logger.error("Hello {}  {}","world",date);


    }

}
