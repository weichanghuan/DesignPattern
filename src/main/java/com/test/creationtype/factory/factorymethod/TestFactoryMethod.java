package com.test.creationtype.factory.factorymethod;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        Factory factory=new BmwFactory();
        Car car = factory.createCar();
        car.run();
        Factory factory1=new BzFactory();
        Car car1 = factory1.createCar();
        car1.run();
    }
}
