package com.learn.krishav.week1.firstclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // creating our own bean -
public class AppConfig {

    @Bean
    Apple getApple(){  // this method can be of any name

        return new Apple();

    }


}
