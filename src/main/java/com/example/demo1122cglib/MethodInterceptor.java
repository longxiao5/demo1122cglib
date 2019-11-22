package com.example.demo1122cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class HelloInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("这是执行方法的前置语句");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("这是执行方法的后置语句");
        return o1;
    }
}
