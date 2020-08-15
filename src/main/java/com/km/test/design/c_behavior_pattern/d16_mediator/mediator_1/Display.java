package com.km.test.design.c_behavior_pattern.d16_mediator.mediator_1;

/**
 * @author: coming
 * @date: 2020/7/14 10:11
 */
public class Display  extends Colleague {
    Display(Mediator mediator) {
        super(mediator);
    }

    public void reDisplay(){
        System.out.println("重新展示字体");
    }
}
