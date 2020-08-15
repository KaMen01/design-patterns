package com.km.test.design.a_create_pattern.d1_factory.study_1.normalFactory;

/**
 * @Author: coming
 * @Date: 2020/6/30 21:43
 */
public class OrangeFactory implements NormalFactory {
    @Override
    public Fruit create() {
        return new Orange();
    }
}
