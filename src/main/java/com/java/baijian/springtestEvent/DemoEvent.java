package com.java.baijian.springtestEvent;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类
 * Created by baijian on 16-9-3.
 */


public class DemoEvent extends ApplicationEvent{

    private String msg;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
