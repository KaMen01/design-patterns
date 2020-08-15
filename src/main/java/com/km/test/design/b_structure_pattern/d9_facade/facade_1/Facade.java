package com.km.test.design.b_structure_pattern.d9_facade.facade_1;

/**
 * @Author: coming
 * @Date: 2020/7/5 21:45
 */
public class Facade {
    //个人认为在使用这个模式时，这些类对象可以通过注入的方式来创建

    private Light light = new Light();
    private Window window = new Window();
    private Water water = new Water();

    public void close(){
        light.close();
        window.close();
        water.close();
    }

}
