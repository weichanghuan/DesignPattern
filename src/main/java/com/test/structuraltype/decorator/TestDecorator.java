package com.test.structuraltype.decorator;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/5/2
 */
public class TestDecorator {
    public static void main(String[] args) {
        Person person=new NewPerson(new OldPerson());
        person.eat();

    }
}
