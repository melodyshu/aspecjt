package com.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application2.xml");
        Greeting greeting = (Greeting) context.getBean("greetingImpl");
        greeting.sayHello("张三");
        greeting.goodMorning("张三");
        greeting.goodNight("张三");
    }
}
