package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.HandPancake;

/**
 * @author: coming
 * @date: 2020/7/31 11:11
 */
public class AddBacon extends Decorator {
    public AddBacon(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake()+" 加培根";
    }

    @Override
    public int calcCost() {
        return super.calcCost()+3;
    }
}
