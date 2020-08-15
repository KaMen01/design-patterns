package com.km.test.design.a_create_pattern.d3_singleton.singleton_1;

/**懒汉式
 * 线程不安全，可能会多初始化，无法保证唯一实例
 * @Author: coming
 * @Date: 2020/7/2 15:20
 */
public class LazySingleton {
    private static LazySingleton LAZY_SINGLETON = null;

    private LazySingleton() {
    }

    /**
     * 线程不安全
     * @return
     */
    public LazySingleton getLazySingleton(){
        if(LAZY_SINGLETON ==null){
            LAZY_SINGLETON = new LazySingleton();
        }
        return LAZY_SINGLETON;
    }

    /**
     * 线程相对安全，实际并不安全，效率过于地下，每次获得该对象都需要加锁解锁
     * @return
     */
    public LazySingleton getSafeLazySingleton(){
        synchronized (LazySingleton.class){
            if(LAZY_SINGLETON==null){
                LAZY_SINGLETON = new LazySingleton();
            }
            return LAZY_SINGLETON;
        }
    }

    /**
     * 效率较高的线程较为安全的创建单例操作
     * 但实际上，线程其实还并不安全 原因：https://www.cnblogs.com/noteless/p/9982869.html
     * @return
     */
    public LazySingleton getSafeQuieckLazySingleton(){
        if(LAZY_SINGLETON ==null){
            synchronized (LazySingleton.class){
                if(LAZY_SINGLETON==null){
                    LAZY_SINGLETON = new LazySingleton();
                }
            }
        }
        return LAZY_SINGLETON;
    }
}
