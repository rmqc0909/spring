package com.github.spring.event_transfer;

import org.springframework.context.ApplicationEvent;

/**
 * Created by xiedan11 on 2016/12/27.
 */
public class DemoEvent extends ApplicationEvent {
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
