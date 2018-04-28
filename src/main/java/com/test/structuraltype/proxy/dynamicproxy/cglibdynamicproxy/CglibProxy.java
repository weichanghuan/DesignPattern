package com.test.structuraltype.proxy.dynamicproxy.cglibdynamicproxy;

import com.test.structuraltype.proxy.SourceImpl;
import com.test.structuraltype.proxy.bean.User;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @Author: 危常焕
 * @Description:CGLIB动态代理
 * cglib是针对类来实现代理的，原理是对指定的业务类生成一个子类，并覆盖其中业务方法实现代理。因为采用的是继承，所以不能对final修饰的类进行代理。
 * @Date 2018/4/28
 */
public class CglibProxy implements MethodInterceptor {

    private final static Logger logger=LoggerFactory.getLogger(CglibProxy.class);

    // 被代理对象
    private Object targetObject;


    //动态生成一个新的类，使用父类的无参构造方法创建一个指定了特定回调的代理实例(该类是被代理对象的子类)
    public Object getProxyObject(Object object) {
        this.targetObject = object;
        //增强器，动态代码生成器
        Enhancer enhancer = new Enhancer();
        //回调方法
        enhancer.setCallback(this);
        //设置生成类的父类类型
        enhancer.setSuperclass(this.targetObject.getClass());
        //动态生成字节码并返回代理对象
        return enhancer.create();
    }

    //创建代理对象
    public  Object getCglibProxy(Class<?> clazz) {
        //创建一个织入器
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(clazz);
        //设置需要织入的逻辑
        enhancer.setCallback(this);
        // 创建代理对象  //使用织入器创建子类
        return enhancer.create();
    }
    //由于CGLIB可以不需要实现接口来实现动态代理,其原理是通过字节码生成类的一个子类来完成的,
    //那就有可能出现需要动态代理对象不存在一个无参构造函数,那么CGLIB在生成子类并实例化时将会产生错误。
    //创建带参数的代理对象
    public  Object getCglibProxy(Class<?> clazz, Class<?>[] argClazz, Object[] args) {
        //创建一个织入器
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(clazz);
        // 设置需要织入的逻辑
        enhancer.setCallback(this);
        // 创建带参数的代理对象  //使用织入器创建子类
        return enhancer.create(argClazz, args);
    }


    /**
     * Object表示要被代理对象的子类对象
     * Method表示拦截的方法
     * Object[]数组表示参数列表，基本数据类型需要传入其包装类型，如int-->Integer、long-Long、double-->Double
     * MethodProxy表示对方法的代理，invokeSuper方法表示对被代理对象方法的调用
     *
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        logger.info("Before Method Invoke objects：{}",objects);
        Object obj = methodProxy.invokeSuper(o, objects);
        logger.info("After Method Invoke user.name:{}",((User)obj).getName());
        return obj;
    }
}
