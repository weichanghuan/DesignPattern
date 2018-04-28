package com.test.creationtype.factory.staticfactory;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class SimpleFactory  {
    private SimpleFactory(){}

    public static  Car createCar() {
        return new Car();
    }

    public static void main(String[] args) {
        Car car = SimpleFactory.createCar();
        car.run();

    }
}
