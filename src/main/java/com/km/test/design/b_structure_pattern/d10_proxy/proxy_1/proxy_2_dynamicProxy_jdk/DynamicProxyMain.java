package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_2_dynamicProxy_jdk;

import java.lang.reflect.Proxy;

/**
 * @Author: coming
 * @Date: 2020/7/6 14:49
 */
public class DynamicProxyMain {
    public static void main(String[] args) {
//        final Subject subject = new RealSubject();
//        Subject hh = (Subject)Proxy.newProxyInstance(DynamicProxyMain.class.getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("前面做的");
//                Object invoke = method.invoke(subject, args);
//                return invoke;
//            }
//        });
//        hh.doSth();

        Subject subject = new RealSubject();
        Subject o = (Subject)Proxy.newProxyInstance(DynamicProxyMain.class.getClassLoader(), subject.getClass().getInterfaces(), new DynamicProxyHandler(subject));
        o.doSth();
    }
}
