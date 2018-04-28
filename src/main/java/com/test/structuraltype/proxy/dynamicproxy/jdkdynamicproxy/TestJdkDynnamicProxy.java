package com.test.structuraltype.proxy.dynamicproxy.jdkdynamicproxy;

import com.test.structuraltype.proxy.Source;
import com.test.structuraltype.proxy.SourceImpl;
import com.test.structuraltype.proxy.dynamicproxy.jdkdynamicproxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class TestJdkDynnamicProxy {
    public static void main(String[] args) {
        Source source = new SourceImpl();
        //得到代理处理类的实例
        DynamicProxy dynamicProxy = new DynamicProxy(source);
        //得到代理对象
        Source source1 = (Source) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Source.class}, dynamicProxy);
        source1.queryUser(0);
    }
}
