package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_2;

/**可共享的享元对象------>不同的内部状态，可能相同，大部分不同的外部状态个体
 * @Author: coming
 * @Date: 2020/7/7 15:44
 */
public class ConcreteFlyweight implements Flyweight {
    /**
     * 内部状态
     */
    private String innerState;

    public ConcreteFlyweight(String innerState){
        this.innerState = innerState;
    }

    /**
     * 将外部参数作为方法的传入值
     * @param outState
     */
    public void operation(String outState) {
        System.out.println("内部状态:"+innerState+",外部状态:"+outState);
    }
}
