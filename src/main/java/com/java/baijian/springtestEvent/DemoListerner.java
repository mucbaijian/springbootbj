package com.java.baijian.springtestEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听类
 * Created by baijian on 16-9-3.
 */
@Component
public class DemoListerner implements ApplicationListener<DemoEvent> {


    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我是事件监听类-->DemoListerner,我见听到内容："+msg);
    }
}
