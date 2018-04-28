package com.test.structuraltype.proxy.dynamicproxy.jdkdynamicproxy;

import com.test.structuraltype.proxy.Source;
import com.test.structuraltype.proxy.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: 危常焕
 * @Description: 动态代理处理类，使用jdk动态代理,是代理同一个接口下的不同实现，若该类，没有接口则无法进行jdk动态代理
 * @Date 2018/4/28
 */
public class DynamicProxy implements InvocationHandler {

    private final static Logger logger=LoggerFactory.getLogger(DynamicProxy.class);

    private Source source;

    public DynamicProxy() {
    }

    public DynamicProxy(Source source) {
        this.source = source;
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 方法实体
     * @param args 形参
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        //方法开始前做一些事情
        logger.info("operation is start ,user.id={}",args[0]);
        if (method.getName().equals("queryUser")) {
            object = method.invoke(source, args);
            //激活调用的方法
        }
        //方法结束后做一些事情
        logger.info("operation is end ,user.name={}",((User)object).getName());
        return object;
    }
}
