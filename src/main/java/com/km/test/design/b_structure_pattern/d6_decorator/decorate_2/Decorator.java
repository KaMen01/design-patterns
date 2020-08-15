package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2;

/**
 * @author: coming
 * @date: 2020/7/31 11:07
 */
public abstract class Decorator implements HandPancake{

    private HandPancake handPancake;

    public Decorator(HandPancake handPancake) {
        this.handPancake = handPancake;
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
