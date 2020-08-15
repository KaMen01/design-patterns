package com.km.test.design.c_behavior_pattern.d18_observe.observe_1;

import java.util.Observable;

/**被观察者 继承Observable
 * @author: coming
 * @date: 2020/7/14 11:05
 */
public class Subject extends Observable {
    public void changeState(){
        System.out.println("无参数的状态改变，哈哈哈");
        setChanged();
        notifyObservers();
    }

    public void changeState(String state){
        System.out.println("参数为:"+state+"的状态改变");
        setChanged();
        //可以再通知观察者(消费者)时，带参数
        notifyObservers(state);
    }
}
