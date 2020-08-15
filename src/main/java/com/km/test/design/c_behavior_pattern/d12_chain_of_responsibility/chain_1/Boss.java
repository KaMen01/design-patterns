package com.km.test.design.c_behavior_pattern.d12_chain_of_responsibility.chain_1;

/**
 * @Author: coming
 * @Date: 2020/7/7 17:04
 */
public class Boss extends Handler {

    public Boss(String name) {
        super(name);
    }

    @Override
    public void operation(Integer price) {
        System.out.println("Boss process...name:"+name);
    }
}
