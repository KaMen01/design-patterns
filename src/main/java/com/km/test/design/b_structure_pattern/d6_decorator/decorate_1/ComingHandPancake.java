package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1;

/**手抓饼，被装饰的对象
 * @Author: coming
 * @Date: 2020/7/3 17:21
 */
public class ComingHandPancake implements HandPancake {
    public String offerHandPancake() {
        return "卡门家的手抓饼";
    }

    public int calcCost() {
        return 3;
    }
}
