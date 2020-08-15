package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_1_staticProxy;

/** 静态代理模式
 * @Author: coming
 * @Date: 2020/7/6 9:06
 */
public class StaticMain {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        StaticProxy staticProxy = new StaticProxy(realSubject);
        staticProxy.doSth();
    }
}
