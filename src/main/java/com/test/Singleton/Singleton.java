package com.test.Singleton;

/**
 * @Author: 危常焕
 * @Description:双重锁校验
 * @Date 2018/4/27
 */
public class Singleton {
    //定义私有构造
    private Singleton (){}
    //推荐尽量定义私有成员变量 使用volatile保证其可见性和有序性
    private static volatile Singleton singleton;
    //定义公有的静态的方法
    public static Singleton getSingleton(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton ==null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }


}
