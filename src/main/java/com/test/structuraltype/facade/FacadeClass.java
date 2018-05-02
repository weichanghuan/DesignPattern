package com.test.structuraltype.facade;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public class FacadeClass {
    private Animal dog;
    private  Person youngPerson;

    public FacadeClass(Animal dog, Person youngPerson) {
        this.dog = dog;
        this.youngPerson = youngPerson;
    }

    public FacadeClass() {
    }

    public void dothing(){
        dog.eat();
        youngPerson.run();
    }
}
