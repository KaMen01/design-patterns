package com.km.test.design.a_create_pattern.d3_singleton.singleton_2;

/**饥饿单例
 * @author: coming
 * @date: 2020/7/22 13:06
 */
public class EagerSingleton {
    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return EAGER_SINGLETON;
    }
}
