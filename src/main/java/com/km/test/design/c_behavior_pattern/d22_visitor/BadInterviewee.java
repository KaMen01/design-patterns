package com.km.test.design.c_behavior_pattern.d22_visitor;

/** 做过坏事的掌门人
 * @author: coming
 * @date: 2020/7/15 9:53
 */
public class BadInterviewee extends Interviewee {

    @Override
    void interviewed(Visitor visitor) {
        visitor.visit(this);
    }
}
