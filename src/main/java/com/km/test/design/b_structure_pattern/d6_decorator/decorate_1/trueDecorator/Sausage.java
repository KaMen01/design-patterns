package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.HandPancake;

/**烤肠
 * @Author: coming
 * @Date: 2020/7/3 17:31
 */
public class Sausage extends Decorator {

    public Sausage(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake()+" 加烤肠";
    }

    @Override
    public int calcCost() {
        return super.calcCost()+5;
    }
}
