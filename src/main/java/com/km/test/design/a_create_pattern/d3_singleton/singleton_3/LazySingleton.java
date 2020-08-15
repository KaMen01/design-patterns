package com.km.test.design.a_create_pattern.d3_singleton.singleton_3;

/**
 * @author: coming
 * @date: 2020/7/29 15:00
 */
public class LazySingleton {

    private volatile LazySingleton lazySingleton = null;

    private LazySingleton(){};

    public LazySingleton getLazySingleton(){
        if(lazySingleton == null){
            synchronized (this){
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
