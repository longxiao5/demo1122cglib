package com.example.demo1122cglib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;

@SpringBootApplication
public class Demo1122cglibApplication {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGsubject.class);
        enhancer.setCallback((Callback) new HelloInterceptor());
        CGsubject cGsubject = (CGsubject) enhancer.create();
        cGsubject.sayHello();
    }


}
