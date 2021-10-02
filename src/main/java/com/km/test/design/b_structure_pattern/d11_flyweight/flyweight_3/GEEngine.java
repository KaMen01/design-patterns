package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_3;

/**
 * @author coming | 2020/8/26 21:59
 */
public class GEEngine implements Engine {
    @Override
    public void providePower() {
        System.out.println("通用电气的发动起启动，并提供动力");
    }
}
