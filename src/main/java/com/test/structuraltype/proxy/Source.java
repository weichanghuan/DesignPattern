package com.test.structuraltype.proxy;

import com.test.structuraltype.proxy.bean.User;

/**
 * @Author: 危常焕
 * @Description:真实角色(Source)
 * @Date 2018/4/28
 */
public interface Source {

    public User queryUser(Integer id);


}
