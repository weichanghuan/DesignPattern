package com.test.creationtype.factory.simplefactory;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class TestSimpleFactory {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        Car car = simpleFactory.createCar("bmw");
        car.run();
    }
}
