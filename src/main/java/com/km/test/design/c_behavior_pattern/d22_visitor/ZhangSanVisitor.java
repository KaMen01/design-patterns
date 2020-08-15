package com.km.test.design.c_behavior_pattern.d22_visitor;

/**张三只赏赐做过好事的掌门人，不管做过坏事的掌门人
 * @author: coming
 * @date: 2020/7/15 9:56
 */
public class ZhangSanVisitor extends Visitor{
    @Override
    void visit(BadInterviewee interviewee) {
        System.out.println("张三：不管做过坏事的掌门人");
    }

    @Override
    void visit(GoodInterviewee goodInterviewee) {
        System.out.println("张三：奖励做过好事的掌门人");
    }
}
