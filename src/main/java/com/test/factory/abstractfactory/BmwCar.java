package com.test.factory.abstractfactory;

import com.test.factory.factorymethod.Car;

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
