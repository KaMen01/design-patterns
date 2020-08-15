package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.HandPancake;

/** 加鸡蛋
 * @author: coming
 * @date: 2020/7/31 11:09
 */
public class AddEgg extends Decorator {
    public AddEgg(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake()+" 加鸡蛋";
    }

    @Override
    public int calcCost() {
        return super.calcCost()+2;
    }
}

