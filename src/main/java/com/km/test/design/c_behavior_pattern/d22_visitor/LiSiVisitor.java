package com.km.test.design.c_behavior_pattern.d22_visitor;

/**李四 只惩罚做过坏事的掌门人，不管没做过坏事的掌门人
 * @author: coming
 * @date: 2020/7/15 10:02
 */
public class LiSiVisitor extends Visitor{
    @Override
    void visit(GoodInterviewee goodInterviewee) {
        System.out.println("李四：不管做过好事的掌门人");
    }

    @Override
    void visit(BadInterviewee badInterviewee) {
        System.out.println("李四：惩罚做过坏事的掌门人");
    }
}
