package com.test.creationtype.factory.abstractfactory;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new PlaneFactory();
        Plane plane = abstractFactory.createPlane("big");
        plane.flight();
    }
}
