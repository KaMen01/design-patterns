package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1;

/**装饰器
 * @Author: coming
 * @Date: 2020/7/3 17:22
 */
public abstract class Decorator implements HandPancake{

    private HandPancake handPancake;

    public Decorator(HandPancake handPancake){
        this.handPancake=handPancake;
    }

    @Override
    public String offerHandPancake() {
        return handPancake.offerHandPancake();
    }

    @Override
    public int calcCost() {
        return handPancake.calcCost();
    }
}
