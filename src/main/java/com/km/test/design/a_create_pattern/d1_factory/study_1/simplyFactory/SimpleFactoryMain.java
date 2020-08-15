package com.km.test.design.a_create_pattern.d1_factory.study_1.simplyFactory;

/**
 * @Author: coming
 * @Date: 2020/6/30 17:21
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Fruit fruit = simpleFactory.generateFruit(FruitType.Apple);
        System.out.println(fruit.description());
    }
}
