package com.km.test.design.b_structure_pattern.d9_facade.facade_2;

/**
 * @author: coming
 * @date: 2020/8/4 16:51
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("一个正方形被画在了纸上");
    }
}
