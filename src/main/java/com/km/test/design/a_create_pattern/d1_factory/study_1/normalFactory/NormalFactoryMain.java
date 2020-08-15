package com.km.test.design.a_create_pattern.d1_factory.study_1.normalFactory;

/**
 * @Author: coming
 * @Date: 2020/6/30 21:44
 */
public class NormalFactoryMain {
    public static void main(String[] args) {
        NormalFactory appleFactory = new AppleFactory();
        Fruit fruit = appleFactory.create();
        System.out.println(fruit.description());

        NormalFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.create();
        System.out.println(orange.description());
    }
}
