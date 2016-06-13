package com.flyingsh4rk.com;

import com.flyingsh4rk.com.config.Config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pthanhtrung on 6/13/2016.
 */

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(applicationContext.getBean("hello"));

    }
}
