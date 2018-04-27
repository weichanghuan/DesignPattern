package com.test.factory.abstractfactory;


import com.test.factory.factorymethod.Car;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class CarFactory extends AbstractFactory {
    @Override
    public Car createCar(String carType) {
        if (carType.equals("Bmw")) {
            return new BmwCar();
        } else {
            return new BzCar();
        }
    }


    @Override
    public Plane createPlane(String planeType) {
        return null;
    }
}
