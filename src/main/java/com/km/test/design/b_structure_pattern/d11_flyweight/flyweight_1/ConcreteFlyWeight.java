package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_1;

/**
 * @Author: coming
 * @Date: 2020/7/6 16:40
 */
public class ConcreteFlyWeight extends FlyWeight {
    private String innerState;

    public ConcreteFlyWeight(String innerState) {
        this.innerState = innerState;
    }
    @Override
    public void operation(String outerState) {
        System.out.println("内部状态："+innerState+";外部状态："+outerState);
    }
}
