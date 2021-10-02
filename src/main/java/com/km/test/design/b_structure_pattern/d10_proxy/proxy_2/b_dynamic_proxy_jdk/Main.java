package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.b_dynamic_proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author coming
 * @date 2020/8/19 17:36
 */
public class Main {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        Object o = Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("之前做些事");
                Object invoke = method.invoke(subject, args);
                System.out.println("之后做些事");
                return invoke;
            }
        });
        ((Subject)o).doSth("哈哈");
    }
}
