package com.km.test.design.c_behavior_pattern.d16_mediator.mediator_1;

/**
 * @author: coming
 * @date: 2020/7/14 9:42
 */
public abstract class Colleague {
    private Mediator mediator;

    Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public void notifyEvent(){
        mediator.operaton(this);
    }
}
