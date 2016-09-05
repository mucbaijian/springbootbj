package com.java.baijian.springtestTask;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 组合注解
 * Created by baijian on 16-9-3.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfigration {
    String[] value() default {};
}
