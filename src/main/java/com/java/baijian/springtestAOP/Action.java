package com.java.baijian.springtestAOP;

import java.lang.annotation.*;

/**
 * 拦截规则注解
 * Created by baijian on 16-9-2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
