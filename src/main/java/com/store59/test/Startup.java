package com.store59.test;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration    
@ComponentScan    
@EnableAutoConfiguration    
public class Startup {  
    public static void main(String[] args) {  
//        SpringApplication app = new SpringApplication(Startup.class);  
//        app.setWebEnvironment(true);  
//        app.setShowBanner(false);  
//          
//        Set<Object> set = new HashSet<Object>();  
//        //set.add("classpath:applicationContext.xml");  
//        app.setSources(set);  
//        app.run(args);
    	SpringApplication.run(Startup.class, args);
    }    
}  