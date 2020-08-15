package com.km.test.design.a_create_pattern.d1_factory.study_1.simplyFactory;

/**
 * @Author: coming
 * @Date: 2020/6/30 17:21
 */
public class SimpleFactory {

    public Fruit generateFruit(FruitType fruitType){
        if (fruitType.equals(FruitType.Apple)) {
            return new Apple();
        }else if(fruitType.equals(FruitType.Orange)){
            return new Orange();
        }
        return null;
    }
}
