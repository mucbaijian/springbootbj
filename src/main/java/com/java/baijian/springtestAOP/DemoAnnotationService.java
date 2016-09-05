package com.java.baijian.springtestAOP;

import org.springframework.stereotype.Service;

/**
 * 注解拦截操作Service
 * Created by baijian on 16-9-2.
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add()操作！")
    public void add(){}
}
