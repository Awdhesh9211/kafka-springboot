package com.learn.producer.functions;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FunctionsClass {


    @Bean
    public Function<String, String> uppercase(){
        System.out.println("HHH");
        return value -> value.toUpperCase();
    }
}
