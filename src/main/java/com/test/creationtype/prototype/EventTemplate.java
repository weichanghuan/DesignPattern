package com.test.creationtype.prototype;

import java.io.Serializable;

/**
 * @Author: 危常焕
 * @Description:
 * @Date 2018/4/28
 */
public class EventTemplate implements Serializable {
    public EventTemplate() {
    }

    public EventTemplate(String eventSubject, String eventContent) {
        this.eventSubject = eventSubject;
        this.eventContent = eventContent;
    }

    private String eventSubject;
    private String eventContent;

    public String getEventSubject() {
        return eventSubject;
    }

    public void setEventSubject(String eventSubject) {
        this.eventSubject = eventSubject;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }
}
