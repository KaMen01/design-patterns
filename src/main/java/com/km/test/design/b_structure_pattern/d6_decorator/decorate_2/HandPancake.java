package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2;

/**
 * @author: coming
 * @date: 2020/7/31 11:03
 */
public interface HandPancake {

    /**
     * 制作手抓饼
     * @return 手抓饼的名字
     */
    String offerHandPancake();

    /**
     * 计算手抓饼总价
     * @return 总价
     */
    int calcCost();
}
