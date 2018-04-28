package com.test.structuraltype.proxy.staticproxy;

import com.test.structuraltype.proxy.Source;
import com.test.structuraltype.proxy.SourceImpl;
import com.test.structuraltype.proxy.bean.User;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class TestStaticProxy {
    public static void main(String[] args) {
        Source source=new StaticProxy(new SourceImpl());
        User user = source.queryUser(0);
    }
}
