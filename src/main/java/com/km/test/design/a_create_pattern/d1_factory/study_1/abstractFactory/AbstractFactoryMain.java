package com.km.test.design.a_create_pattern.d1_factory.study_1.abstractFactory;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:21
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        System.out.println(appleFactory.createNetBook().netBookDescription());
        System.out.println(appleFactory.createPhone().phoneDescription());

        LenovoFactory lenovoFactory = new LenovoFactory();
        System.out.println(lenovoFactory.createNetBook().netBookDescription());
        System.out.println(lenovoFactory.createPhone().phoneDescription());

    }
}
