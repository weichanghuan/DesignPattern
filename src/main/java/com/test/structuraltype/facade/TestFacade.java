package com.test.structuraltype.facade;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public class TestFacade {
    public static void main(String[] args) {
        FacadeClass facadeClass=new FacadeClass(new Dog(),new YoungPerson());
        facadeClass.dothing();
    }
}
