package com.zjledu.test20200211.controller;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariPool;
import com.zjledu.test20200211.dao.PetDao;
import com.zjledu.test20200211.dao.PetMapper;
import com.zjledu.test20200211.entity.Pet;
import com.zjledu.test20200211.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.xml.crypto.Data;

/**
 * author: King Long
 * date: 2020/2/12 20:32
 */
@RestController
public class HelloController {

    @Autowired
    User user;

    @Autowired
    DataSource ds;

    @Autowired
    PetDao petDao;

    @Autowired
    PetMapper mapper;

    @GetMapping("/hello")
    public void sayHello(User user, HttpServletRequest req, HttpServletResponse resp) throws Exception{

        System.out.println(req.getParameter("name"));
        System.out.println(req.getParameter("age"));
        System.out.println(req.getParameter("borndate"));
        System.out.println(user);
        resp.getWriter().write("<h1>show you a new world</h1>");
        resp.getWriter().close();
    }

    @GetMapping("/jdbc")
    public String test(){
        System.out.println(ds.getClass());
        System.out.println(((HikariDataSource)ds).getConnectionTimeout());
        return "success";
    }

    @GetMapping("/mybatis")
    public String testMybatis(){
        int i = mapper.save(new Pet("mybatis",100,100,"mybatis"));
        return "success"+i;
    }
}
