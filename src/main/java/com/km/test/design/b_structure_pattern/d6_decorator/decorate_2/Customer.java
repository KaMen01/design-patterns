package com.km.test.design.b_structure_pattern.d6_decorator.decorate_2;

/**
 * @author: coming
 * @date: 2020/7/31 11:13
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void buy(HandPancake handPancake){
        System.out.println(name+"买了一份["+handPancake.offerHandPancake()+"]花了"+handPancake.calcCost()+"元钱");
    }
}
