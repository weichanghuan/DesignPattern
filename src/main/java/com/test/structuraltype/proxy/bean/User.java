package com.test.structuraltype.proxy.bean;

import java.io.Serializable;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class User implements Serializable {
    public User() {
    }

    public User(Integer userId, String name, String desc) {
        this.userId = userId;
        this.name = name;
        this.desc = desc;
    }

    private Integer userId;
    private String name;
    private String desc;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
