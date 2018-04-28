package com.test.creationtype.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class TestPrototype {
    public static void main(String[] args) {
        EventTemplate et =
                new EventTemplate("邀请函（不变）", "婚嫁生日啥的....（不变部分）");
        Email mail = new Email(et);
        List<String> list=new ArrayList<String>(64);
        list.add("Kent");
        list.add("Jack");
        mail.setReceivers(list);
        Email cloneMail = mail.clone();
        cloneMail.setContent("XXX先生（女士）（变化部分）"
                + mail.getTail());
        cloneMail.setReceiver("每个人的邮箱地址...com（变化部分）");
    }
}
