package com.example.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingAspect {

    @Around("execution(* com.example.aspectj.GreetingImpl.*(..))")
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
