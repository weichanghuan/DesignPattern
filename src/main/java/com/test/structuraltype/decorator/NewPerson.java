package com.test.structuraltype.decorator;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public class NewPerson extends PersonDecorator {

    public NewPerson() {
    }

    public NewPerson(Person person) {
        super(person);
    }

    @Override
    public void eat() {
        person.eat();
        doOtherthing();
    }

    public void doOtherthing() {
        System.out.println("可以做其他事情");
    }

}
