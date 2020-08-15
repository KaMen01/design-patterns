package com.km.test.design.c_behavior_pattern.d19_state;

/**
 * @author: coming
 * @date: 2020/7/14 11:30
 */
public class stateMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.action();
        context.changeState(2);
        context.action();
    }
}
