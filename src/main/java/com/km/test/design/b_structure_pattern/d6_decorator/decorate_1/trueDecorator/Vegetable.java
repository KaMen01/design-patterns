package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.HandPancake;

/**
 * @Author: coming
 * @Date: 2020/7/3 17:32
 */
public class Vegetable extends Decorator {

    public Vegetable(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake()+" 加青菜";
    }

    @Override
    public int calcCost() {
        return super.calcCost()+1;
    }
}
