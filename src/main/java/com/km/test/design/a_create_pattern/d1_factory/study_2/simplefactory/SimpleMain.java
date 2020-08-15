package com.km.test.design.a_create_pattern.d1_factory.study_2.simplefactory;

/**
 * @author: coming
 * @date: 2020/7/15 10:26
 */
public class SimpleMain {
    public static void main(String[] args) {
        Api api = new SimpleFactory().createApi();
        api.show();

        new SimpleFactory().createApi("implA").show();
    }
}
