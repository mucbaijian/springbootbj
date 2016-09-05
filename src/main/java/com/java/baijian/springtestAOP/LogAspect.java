package com.java.baijian.springtestAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面类
 * Created by baijian on 16-9-2.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.java.baijian.springtestAOP.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解拦截："+action.name());
    }

    @Before("execution(* com.java.baijian.springtestAOP.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法拦截："+method.getName());
    }
}
