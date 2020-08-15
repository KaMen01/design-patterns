package com.km.test.design.b_structure_pattern.d11_flyweight.flyweight_1;

import java.util.HashMap;

/**简单享元模式
 * @Author: coming
 * @Date: 2020/7/6 16:42
 */
public class FlyWeightFactory {
    private static  FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

    private HashMap<String,FlyWeight> flyWeightHashMap = new HashMap<String, FlyWeight>();

    public static FlyWeightFactory getFlyWeightFactory(){
        return flyWeightFactory;
    }

    public FlyWeight getFlyWeight(String key){
        FlyWeight flyWeight = flyWeightHashMap.get(key);
        if(flyWeight == null){
            this.flyWeightHashMap.put(key,new ConcreteFlyWeight(key));
        }
        return flyWeightHashMap.get(key);
    }
}
