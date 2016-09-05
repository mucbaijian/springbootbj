package com.java.baijian.springtestAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop类配置
 * Created by baijian on 16-9-2.
 */
@Configuration
@ComponentScan("com.java.baijian.springtestAOP")
@EnableAspectJAutoProxy
public class AopConfig {

}
