package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2;

/**
 * @author: coming
 * @date: 2020/7/31 11:06
 */
public class ComingHandPancake implements HandPancake{
    @Override
    public String offerHandPancake() {
        return "卡门家手抓饼";
    }

    /**
     * 卡门手抓饼，基础价4块钱
     * @return 4
     */
    @Override
    public int calcCost() {
        return 4;
    }
}
