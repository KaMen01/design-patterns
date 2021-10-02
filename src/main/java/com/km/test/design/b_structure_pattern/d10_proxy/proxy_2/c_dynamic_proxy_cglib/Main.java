package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.c_dynamic_proxy_cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author coming
 * @date 2020/8/19 17:54
 */
public class Main {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        Object o = Enhancer.create(MySubject.class, new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("之前做些事");
                Object invoke = method.invoke(mySubject, objects);
                System.out.println("之后做些事情");
                return invoke;
            }
        });
        ((MySubject)o).doSth("嘿嘿");
    }
}
