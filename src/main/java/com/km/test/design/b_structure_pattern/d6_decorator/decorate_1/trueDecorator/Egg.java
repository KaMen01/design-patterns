package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.trueDecorator;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.Decorator;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.HandPancake;

/**鸡蛋
 * @Author: coming
 * @Date: 2020/7/3 17:29
 */
public class Egg extends Decorator {
    public Egg(HandPancake handPancake) {
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
