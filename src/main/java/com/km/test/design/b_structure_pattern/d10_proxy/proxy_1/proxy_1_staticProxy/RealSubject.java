package com.km.test.design.b_structure_pattern.d10_proxy.proxy_1.proxy_1_staticProxy;

/**静态代理
 * @Author: coming
 * @Date: 2020/7/6 9:02
 */
public class RealSubject implements Subject {
    public void doSth() {
        System.out.println("我是要真正对象要执行的方法");
    }
}
