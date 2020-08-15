package com.km.test.design.b_structure_pattern.d6_decorator.decorate_1;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.trueDecorator.Egg;
import com.km.test.design.b_structure_pattern.d6_decorator.decorate_1.trueDecorator.Sausage;

/**
 * @Author: coming
 * @Date: 2020/7/3 17:36
 */
public class decoratorMain {
    public static void main(String[] args) {
        Customer kamen = new Customer("小卡");
        kamen.buy(new ComingHandPancake());

        Customer pener = new Customer("盆儿");
        pener.buy(new Egg(new Sausage(new ComingHandPancake())));
    }
}
