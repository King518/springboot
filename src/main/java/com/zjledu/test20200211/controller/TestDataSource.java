package com.zjledu.test20200211.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import com.zjledu.test20200211.dao.PetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * author: King Long
 * date: 2020/2/21 22:17
 */
@RestController
public class TestDataSource {

    @Autowired
    DataSource ds;

    @Autowired
    PetDao dao;

    @GetMapping("/datasource")
    public String test(){
        System.out.println(ds.getClass());
        System.out.println(dao.getPetById(1));
        System.out.println(dao.getAllPet());
        System.out.println(((DruidDataSource)ds).getValidationQuery());
        return "success";
    }
}
