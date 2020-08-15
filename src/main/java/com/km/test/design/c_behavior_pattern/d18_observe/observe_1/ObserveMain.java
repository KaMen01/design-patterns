package com.km.test.design.c_behavior_pattern.d18_observe.observe_1;

/**
 * @author: coming
 * @date: 2020/7/14 11:11
 */
public class ObserveMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observe1 observe1 = new Observe1();
        Observe2 observe2 = new Observe2();
        subject.addObserver(observe1);
        subject.addObserver(observe2);

        subject.changeState();
        subject.changeState("卡门");
    }
}
