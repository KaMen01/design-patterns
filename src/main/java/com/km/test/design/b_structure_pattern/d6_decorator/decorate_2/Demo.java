package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2;

import com.km.test.design.b_structure_pattern.d6_decorator.decorate_2.trueDecorator.AddBacon;

/**
 * @author: coming
 * @date: 2020/7/31 11:15
 */
public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("小铭");
        customer.buy(new AddBacon(new ComingHandPancake()));

    }
}
