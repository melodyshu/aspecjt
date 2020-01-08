package com.example.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingAspect {

    /**
     * annotation表达式拦截方法
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("@annotation(com.example.annotation.MyTat)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        before();
        Object result = joinPoint.proceed();
        after();
        return result;
    }

    private void after() {
        System.out.println("after...");
    }

    private void before() {
        System.out.println("before...");
    }
}
