package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_3_dynamicProxy_cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**相比于jdk的方式，可以不用让被代理的对象实现接口
 * @Author: coming
 * @Date: 2020/7/6 15:47
 */
public class CglibMain {
    public static void main(String[] args) {
        final Subject subject =  new RealSubject();
        Subject o =(Subject) Enhancer.create(Subject.class, new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("代理前要做的事情");
                Object invoke = methodProxy.invoke(subject, objects);
                System.out.println("代理后一支烟");
                return invoke;
            }
        });
        o.doSth();
    }
}
