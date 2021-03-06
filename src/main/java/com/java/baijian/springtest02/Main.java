package com.java.baijian.springtest02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by baijian on 16-8-28.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);
        UserFunctionService userFunctionService =
                context.getBean(UserFunctionService.class);
        System.out.println("userFunctionService.SayHelloe() = " + userFunctionService.SayHelloe());
        context.close();
    }
}
