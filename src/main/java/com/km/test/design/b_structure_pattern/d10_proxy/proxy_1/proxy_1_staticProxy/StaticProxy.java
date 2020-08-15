package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_1_staticProxy;

/**
 * @Author: coming
 * @Date: 2020/7/6 9:03
 */
public class StaticProxy implements Subject {
    private Subject realSubject;

    public StaticProxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void doSth() {
        pre();
        realSubject.doSth();
        after();
    }

    private void pre(){
        System.out.println("方法执行前做的事");
    }

    private void after(){
        System.out.println("方法执行后做的事");
    }
}
