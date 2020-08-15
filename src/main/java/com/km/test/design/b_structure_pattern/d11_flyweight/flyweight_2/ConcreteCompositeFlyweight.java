package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_2;

import java.util.ArrayList;
import java.util.List;

/**不可共享的 复合享元对象----->共同的内部状态 共同的外部状态 的一个组合体
 * @Author: coming
 * @Date: 2020/7/7 16:02
 */
public class ConcreteCompositeFlyweight implements Flyweight{

    private List<Flyweight> flyweightList = new ArrayList<Flyweight>();

    public void add(Flyweight flyweight){
        flyweightList.add(flyweight);
    }

    public void operation(String state) {
        for (Flyweight flyweight : flyweightList) {
            flyweight.operation(state);
        }
    }
}
