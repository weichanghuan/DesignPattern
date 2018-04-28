package com.test.creationtype.factory.simplefactory;


/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/27
 */
public class SimpleFactory {

    public Car createCar(String carType){
        if (carType.equals("Bmw")) {
            return new BmwCar();
        } else {
            return new BzCar();
        }
    }
}
