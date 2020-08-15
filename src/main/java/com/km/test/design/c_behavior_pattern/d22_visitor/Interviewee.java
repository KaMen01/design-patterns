package com.km.test.design.c_behavior_pattern.d22_visitor;

/**
 * @author: coming
 * @date: 2020/7/15 9:49
 */
public abstract class Interviewee {

    /**
     * 被访问者的各大掌门人接受访问者的访问
     * @param visitor
     */
    abstract void interviewed(Visitor visitor);
}
