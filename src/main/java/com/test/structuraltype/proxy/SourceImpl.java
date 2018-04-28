package com.test.structuraltype.proxy;

import com.test.structuraltype.proxy.bean.User;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class SourceImpl implements Source{
    private  ConcurrentHashMap<Integer,User> concurrentHashMap=new ConcurrentHashMap<Integer,User>(16);

   private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User queryUser(Integer id) {
        addUser();
        return concurrentHashMap.get(id);
    }

    private void addUser(){
        concurrentHashMap.put(0,new User(0,"Kent","STUDENT"));
    }
}