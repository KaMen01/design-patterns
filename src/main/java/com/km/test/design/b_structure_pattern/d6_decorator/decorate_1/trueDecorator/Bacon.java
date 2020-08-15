package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.HandPancake;

/**培根
 * @Author: coming
 * @Date: 2020/7/3 17:27
 */
public class Bacon extends Decorator {

    public Bacon(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake()+" 加培根";
    }

    @Override
    public int calcCost() {
        return super.calcCost()+4;
    }
}
