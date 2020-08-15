package com.km.test.design.c_behavior_pattern.d22_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: coming
 * @date: 2020/7/15 10:04
 */
public class XiaKeDao {
    List<Interviewee> intervieweeArrayList = new ArrayList<Interviewee>();

    public void addInterviewee(Interviewee interviewee){
        intervieweeArrayList.add(interviewee);
    }

    /**
     * 精妙的反转控制
     * @param visitor
     */
    public void visit(Visitor visitor){
        for (Interviewee interviewee : intervieweeArrayList) {
            interviewee.interviewed(visitor);
        }
    }

}
