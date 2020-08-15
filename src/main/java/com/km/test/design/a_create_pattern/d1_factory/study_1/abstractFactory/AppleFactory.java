package com.km.test.design.a_create_pattern.d1_factory.study_1.abstractFactory;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:19
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public NetBook createNetBook() {
        return new AppleNetBook();
    }
}
