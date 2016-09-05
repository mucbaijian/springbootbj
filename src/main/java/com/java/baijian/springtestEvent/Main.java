package com.java.baijian.springtestEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by baijian on 16-9-3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext( EventConfig.class);
        DemoPublisher publisher = context.getBean(DemoPublisher.class);

        String[]  names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        context.close();
    }
}
