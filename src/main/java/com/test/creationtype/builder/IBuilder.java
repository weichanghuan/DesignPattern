package com.test.creationtype.builder;

/**
 * @Author: 危常焕
 * @Description: 生成者接口，
 * @Date 2018/4/28
 */
public interface IBuilder {
    public void createPart1();
    public void createPart2();
    public void createPart3();
    public Product composite();
    public Product create();

}
