package com.km.test.design.c_behavior_pattern.d17_memento.memento_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: coming
 * @date: 2020/7/14 10:39
 */
public class Memento {
    /**
     * String 表示版本 Integer表示我需要存储的状态，我也可以存对象挥着其它的什么值
     */
    private Map<String,Integer> map = new HashMap<String, Integer>();


    public void addMemento(String string,Integer integer){
        map.put(string,integer);
    }
    public Integer getMemento(String string){
        return map.get(string);
    }
}
