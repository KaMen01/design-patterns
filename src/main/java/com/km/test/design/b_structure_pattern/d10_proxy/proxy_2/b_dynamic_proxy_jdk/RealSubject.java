package com.km.test.design.b_structure_pattern.d10_proxy.proxy_2.b_dynamic_proxy_jdk;

/**
 * @author coming
 * @date 2020/8/19 17:36
 */
public class RealSubject implements Subject {
    @Override
    public String doSth(String str) {
        System.out.println(str);
        return str;
    }
}
