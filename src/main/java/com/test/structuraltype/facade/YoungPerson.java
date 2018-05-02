package com.test.structuraltype.facade;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public class YoungPerson implements Person {
    public void run() {
        System.out.println("年轻人在跑步");
    }

    public void eat() {
        System.out.println("年轻人在吃");
    }
}
