package com.test.factory.abstractfactory;

import com.test.factory.factorymethod.Car;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public abstract class  AbstractFactory {

    public abstract Car createCar(String carType);
    public abstract Plane createPlane(String planeType);



}
