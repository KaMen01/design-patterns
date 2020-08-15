package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_2_dynamicProxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: coming
 * @Date: 2020/7/6 15:22
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Subject subject;

    public DynamicProxyHandler(Subject subject){
        this.subject=subject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("目标方法执行前做些事，比如开启事务");
        Object invoke = method.invoke(subject, args);
        System.out.println("目标方法执行后做些事，比如关闭事务");
        return invoke;
    }
}
