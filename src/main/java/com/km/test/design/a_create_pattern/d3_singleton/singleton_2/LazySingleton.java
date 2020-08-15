package com.km.test.design.a_create_pattern.d3_singleton.singleton_2;

/** 懒惰单例
 * @author: coming
 * @date: 2020/7/22 13:08
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized (this){
                if(lazySingleton==null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
