package com.test.structuraltype.adapte;

/**
 * @Author: 危常焕
 * @Description: 对象适配器模式
 * @Date 2018/4/28
 */
public class Adaper2 implements Target {
    private Source Source;

    public Adaper2() {
    }

    public Adaper2(Source source) {
        this.Source = source;
    }

    public void specificRequest() {
        Source.specificRequest();
    }
}
