package com.test.creationtype.builder;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class Director {
    private IBuilder build;
    public Director(IBuilder build){
        this.build = build;
    }
    public Product build(){
        return build.create();
    }

    public static void main(String[] args) {
        IBuilder build = new Builder2();
        Director direcotr = new Director(build);
        Product p = direcotr.build();
    }

}
