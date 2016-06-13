package com.flyingsh4rk.com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public String hello(){
        return "Hello java logging";
    }

}
