package com.test.Singleton;

/**
 * @Author: 危常焕
 * @Description:目前最为安全的实现单例的方法是通过内部静态enum的方法来实现，因为JVM会保证enum不能被反射并且构造器方法只执行一次。
 * @Date 2018/4/27
 */
public class EnumSingleton {
    //定义私有构造
    private EnumSingleton() {
    }
    //定义静态的获取单例的方法
    public static EnumSingleton getEnumSingleton(){
        return Singleton.INSTANCE.getEnumSingleton();

    }
    private static enum  Singleton{
        INSTANCE;
        //jvm保证次方法只被调用一次
        private EnumSingleton enumSingleton;

        private Singleton(){
            enumSingleton=new EnumSingleton();

        }
        public EnumSingleton getEnumSingleton(){
            return enumSingleton;
        }

    }

}
