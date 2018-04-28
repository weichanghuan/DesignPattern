package com.test.structuraltype.proxy.dynamicproxy.cglibdynamicproxy;

import com.test.structuraltype.proxy.SourceImpl;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class TestCglibDynnamicProxy {
    public static void main(String[] args) {
        SourceImpl proxyObject =(SourceImpl) new CglibProxy().getProxyObject(new SourceImpl());
        proxyObject.queryUser(0);
        System.out.println();
        SourceImpl proxyObject1 =(SourceImpl)new CglibProxy().getCglibProxy(SourceImpl.class);
        proxyObject1.queryUser(0);
        System.out.println();
    }
}
