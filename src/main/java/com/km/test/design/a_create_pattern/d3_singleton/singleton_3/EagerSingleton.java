package com.km.test.design.a_create_pattern.d3_singleton.singleton_3;

/**
 * @author: coming
 * @date: 2020/7/29 14:58
 */
public class EagerSingleton {
    private final  static EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private EagerSingleton(){};

    public EagerSingleton getEagerSingleton(){
        return  EAGER_SINGLETON;
    }
}
