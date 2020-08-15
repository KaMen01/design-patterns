package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_1;

/**单纯的享元模式
 * @Author: coming
 * @Date: 2020/7/6 16:46
 */
public class FlyWeightMain {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = FlyWeightFactory.getFlyWeightFactory();
        FlyWeight c1 = flyWeightFactory.getFlyWeight("卡");
        c1.operation("红色");

        FlyWeight c2 = flyWeightFactory.getFlyWeight("门");
        c2.operation("蓝色");
        FlyWeight c3 = flyWeightFactory.getFlyWeight("卡");
        c3.operation("绿色");

        System.out.println(c3==c1);



    }
}
