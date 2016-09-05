package com.java.baijian.springtestTask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by baijian on 16-9-3.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskSchedurlerConfig.class);
    }
}
