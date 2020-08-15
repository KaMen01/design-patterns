package com.km.test.design.c_behavior_pattern.d22_visitor;

/**
 * @author: coming
 * @date: 2020/7/15 10:07
 */
public class VisitorMain {
    public static void main(String[] args) {
        BadInterviewee badInterviewee1 = new BadInterviewee();
        BadInterviewee badInterviewee2 = new BadInterviewee();

        GoodInterviewee goodInterviewee1 = new GoodInterviewee();
        GoodInterviewee goodInterviewee2 = new GoodInterviewee();

        ZhangSanVisitor zhangSanVisitor = new ZhangSanVisitor();
        LiSiVisitor liSiVisitor = new LiSiVisitor();
        XiaKeDao xiaKeDao = new XiaKeDao();
        xiaKeDao.addInterviewee(badInterviewee1);
        xiaKeDao.addInterviewee(badInterviewee2);
        xiaKeDao.addInterviewee(goodInterviewee1);
        xiaKeDao.addInterviewee(goodInterviewee2);
        xiaKeDao.addInterviewee(goodInterviewee2);

        xiaKeDao.visit(zhangSanVisitor);
        System.out.println("--------------------");
        xiaKeDao.visit(liSiVisitor);
    }
}
