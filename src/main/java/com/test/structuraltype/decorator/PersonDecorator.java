package com.test.structuraltype.decorator;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public abstract class PersonDecorator implements Person {

    public PersonDecorator() {
    }

    protected Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    public void eat() {
        person.eat();
    }
}
