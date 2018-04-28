package com.test.creationtype.factory.factorymethod;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class BmwFactory implements Factory{

    public Car createCar() {
        return new BmwCar();
    }
}
