package com.km.test.design.c_behavior_pattern.d22_visitor;

/**
 * @author: coming
 * @date: 2020/7/15 9:49
 */
public abstract class Visitor {
    /**
     * 侠客岛岛上的访问者去拜访做过好事的掌门人
     * @param goodInterviewee 做过好事的掌门
     */
    abstract void visit(GoodInterviewee goodInterviewee);

    /**
     * 侠客岛岛上的访问者去拜访做过坏事的掌门人
     * @param badInterviewee 过坏事的掌门
     */
    abstract void visit(BadInterviewee badInterviewee);
}
