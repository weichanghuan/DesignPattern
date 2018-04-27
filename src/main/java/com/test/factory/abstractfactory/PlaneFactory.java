package com.test.factory.abstractfactory;


import com.test.factory.factorymethod.Car;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class PlaneFactory extends AbstractFactory {

    @Override
    public Car createCar(String carType) {
        return null;
    }

    @Override
    public Plane createPlane(String planeType) {
        if(planeType.equals("big")){
            return new BigPlane();
        }else {
            return new SmallPlane();
        }

    }
}
