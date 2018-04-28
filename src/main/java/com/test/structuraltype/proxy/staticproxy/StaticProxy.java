package com.test.structuraltype.proxy.staticproxy;

import com.test.structuraltype.proxy.Source;
import com.test.structuraltype.proxy.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: 危常焕
 * @Description:静态代理
 * @Date 2018/4/28
 */
public class StaticProxy implements Source{

    private final static Logger logger = LoggerFactory.getLogger(StaticProxy.class);

    private Source source;

    public StaticProxy() {
    }

    public StaticProxy(Source source) {

        this.source = source;
    }

    public User queryUser(Integer id) {
        logger.info("operation is start ,user.id={}",id);
        User user=source.queryUser(id);
        logger.info("operation is end ,user.name={}",user.getName());
        return user;
    }




}
