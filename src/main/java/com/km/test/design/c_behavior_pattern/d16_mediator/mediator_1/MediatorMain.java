package com.km.test.design.c_behavior_pattern.d16_mediator.mediator_1;

/**
 * @author: coming
 * @date: 2020/7/14 10:12
 */
public class MediatorMain {
    public static void main(String[] args) {
        Mediator mediator = new ConcreateMediator();
        Font font = new Font(mediator);
        font.changeFont();
    }
}
