package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.HandPancake;

/**
 * @author: coming
 * @date: 2020/7/31 11:12
 */
public class AddHotDog extends Decorator {
    public AddHotDog(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake()+" 加热狗";
    }

    @Override
    public int calcCost() {
        return super.calcCost()+3;
    }
}
