package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_2;

import java.util.ArrayList;

/**
 * @Author: coming
 * @Date: 2020/7/7 16:23
 */
public class FlyweightMain {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        FlyweightFactory flyweightFactory = FlyweightFactory.getFlyweightFactory();
        Flyweight compositeFlyweight = flyweightFactory.getFlyweight(strings);
        compositeFlyweight.operation("哈哈");

        Flyweight a = flyweightFactory.getFlyweight("a");
        a.operation("嘿嘿");
    }
}
