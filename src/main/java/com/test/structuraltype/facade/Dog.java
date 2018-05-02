package com.test.structuraltype.facade;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public class Dog implements Animal {
    public void run() {
        System.out.println("🐶在蹦跑");
    }

    public void eat() {
        System.out.println("🐶在吃");
    }
}
