package com.km.test.design.c_behavior_pattern.d16_mediator.mediator_1;

/**
 * @author: coming
 * @date: 2020/7/14 9:45
 */
public class Font extends Colleague {
    private String fontName;

    public String getFontName() {
        return fontName;
    }

    Font(Mediator mediator) {
        super(mediator);
    }

    public void changeFont(){
        System.out.println("设置字体");
        fontName="微软雅黑";
        notifyEvent();
    }



}
