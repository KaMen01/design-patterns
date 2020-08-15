package com.km.test.design.c_behavior_pattern.d18_observe.observe_1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: coming
 * @date: 2020/7/14 11:11
 */
public class Observe2 implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("被观察者："+o+",参数："+arg+",观察者2号在此");
    }
}
