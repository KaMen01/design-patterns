package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_2_dynamicProxy_jdk;

/**
 * @Author: coming
 * @Date: 2020/7/6 14:48
 */
public class RealSubject implements Subject {
    public void doSth() {
        System.out.println("做些事");
    }
}
