package com.km.test.design.c_behavior_pattern.d22_visitor;

/** 做过好事的掌门人
 * @author: coming
 * @date: 2020/7/15 9:55
 */
public class GoodInterviewee extends Interviewee {
    @Override
    void interviewed(Visitor visitor) {
        visitor.visit(this);
    }
}
