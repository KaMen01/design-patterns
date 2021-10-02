package com.km.test.design.a_create_pattern.d3_singleton.singleton_1;

/**饿汉单例模式
 * 其底层初始化有着java虚拟机的保证：类加载会确保类和对象的初始化方法在多线程场景下能够正确的同步加锁
 * 因此不会出现多线程而导致的多初始化导致的多例问题
 * @Author: coming
 * @Date: 2020/7/2 15:17
 */
public class EagerSingleton {
    private  final static  EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getEagerSingleton(){
        return EAGER_SINGLETON;
    }
}
