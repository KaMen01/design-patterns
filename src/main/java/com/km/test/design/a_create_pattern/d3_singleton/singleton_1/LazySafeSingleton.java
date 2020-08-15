package com.km.test.design.a_create_pattern.d3_singleton.singleton_1;

/**线程安全的懒汉式单例模式
 * @Author: coming
 * @Date: 2020/7/2 15:34
 */
public class LazySafeSingleton {
    private static volatile LazySafeSingleton lazySafeSingleton = null;

    private LazySafeSingleton (){
    }

    /**
     * 线程安全的保障是 volatile
     * volatile关键字的作用很简单，就是一个线程在对主内存的某一份数据进行更改时，改完之后会立刻刷新到主内存。
     * 并且会强制让缓存了该变量的线程中的数据清空，必须从主内存重新读取最新数据。这样一来就保证了可见性
     * @return
     */
    public LazySafeSingleton getLazySafeSingleton(){
        if(lazySafeSingleton ==null){
            synchronized (this){
                if(lazySafeSingleton ==null){
                    lazySafeSingleton = new LazySafeSingleton();
                }
            }
        }
        return lazySafeSingleton;
    }
}
