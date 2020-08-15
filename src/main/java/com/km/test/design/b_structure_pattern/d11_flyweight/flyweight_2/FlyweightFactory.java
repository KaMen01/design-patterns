package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_2;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: coming
 * @Date: 2020/7/7 16:08
 */
public class FlyweightFactory {
    private static FlyweightFactory  flyweightFactory= new FlyweightFactory();
    private HashMap<String,Flyweight> flyweightHashMap = new HashMap();
    private FlyweightFactory(){}

    public static FlyweightFactory getFlyweightFactory(){
        return flyweightFactory;
    }

    /**
     * 获得不共享的混合享元对象
     * @param compositeState
     * @return
     */
    public Flyweight getFlyweight(List<String> compositeState){
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for (String s : compositeState) {
            concreteCompositeFlyweight.add(getFlyweight(s));
        }
        return concreteCompositeFlyweight;
    }

    /**
     * 获得简单共享的享元对象
     * @param innerState
     * @return
     */
    public Flyweight getFlyweight(String innerState){
        if(flyweightHashMap.get(innerState) == null){
            System.out.println("没有内部状态为"+innerState+"的Flyweight");
            flyweightHashMap.put(innerState,new ConcreteFlyweight(innerState));
        }
        return flyweightHashMap.get(innerState);
    }
}
