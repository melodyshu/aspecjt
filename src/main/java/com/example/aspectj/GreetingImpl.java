package com.example.aspectj;

import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("hello! "+name);
    }

    public void goodMorning(String name){
        System.out.println("Good Morning! "+name);
    }

    public void goodNight(String name){
        System.out.println("Good Night! "+name);
    }
}
