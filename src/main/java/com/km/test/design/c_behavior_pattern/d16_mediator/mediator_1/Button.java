package com.km.test.design.c_behavior_pattern.d16_mediator.mediator_1;

/**
 * @author: coming
 * @date: 2020/7/14 10:10
 */
public class Button extends Colleague{
    Button(Mediator mediator) {
        super(mediator);
    }

    public void applyButton(){
        System.out.println("点击按钮");
    }
}
