package com.test.creationtype.prototype;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: 危常焕
 * @Description: 原型类
 * @Date 2018/4/28
 */
public class Email implements Cloneable,Serializable {
    private String receiver;
    private String subject;
    private String content;
    private String tail;
    private List<String> receivers;

    public Email() {
    }

    public Email(EventTemplate et) {
        this.tail = et.getEventContent();
        this.subject = et.getEventSubject();
    }
    @Override
    public Email clone() {
        Email mail = null;
        try {
            //浅拷贝
            //mail = (Email) super.clone();
            //若需要深拷贝,针对引用类型的
            mail = (Email) super.clone();
            List<String> list=new ArrayList<String>();
            Iterator<String> iterator = receivers.iterator();
            while (iterator.hasNext()){
                list.add(iterator.next());
            }
            mail.setReceivers(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }
}
