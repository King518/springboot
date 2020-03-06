package com.zjledu.test20200211.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * author: King Long
 * date: 2020/2/11 8:51
 */
@Component
public class User {

    private String name;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    private Date borndate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBorndate() {
        return borndate;
    }

    public void setBorndate(Date borndate) {
        this.borndate = borndate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", borndate=" + borndate +
                '}';
    }
}
