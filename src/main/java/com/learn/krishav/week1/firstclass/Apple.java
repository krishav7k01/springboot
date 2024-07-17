package com.learn.krishav.week1.firstclass;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

// @Component - here we are declaring it a sterotype annotation
public class Apple {

    void eatApple(){
        System.out.println("I am eating a apple");
    }

    @PostConstruct
    void callThisMethodBeforeAppleIsUsed(){
        System.out.println(("Creating the apple before Use"));
    }

    @PreDestroy
    void callThisMethodAfterAppleDestroy(){
        System.out.println(("Creating the apple before Use"));
    }
}
