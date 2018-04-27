package com.test.factory.factorymethod;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class BzFactory implements Factory{

    public Car createCar() {
        return new BzCar();
    }
}
