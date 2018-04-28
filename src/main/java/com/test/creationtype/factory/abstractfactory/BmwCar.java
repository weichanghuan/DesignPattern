package com.test.creationtype.factory.abstractfactory;

import com.test.creationtype.factory.factorymethod.Car;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class BmwCar implements Car {

    public void run() {
        System.out.println("bmw running");
    }
}
