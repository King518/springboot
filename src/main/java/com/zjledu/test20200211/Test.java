package com.zjledu.test20200211;

import com.zjledu.test20200211.entity.Dog;

/**
 * author: King Long
 * date: 2020/3/3 16:07
 */
public class Test {

    public static void main(String[] args) {

        Dog dog = new Dog("zhangsan",17);
        Dog dog1 =  new Dog("zhangsan",17);

        System.out.println(dog);

        System.out.println(dog==dog1);
        System.out.println("骚年");


    }
}
