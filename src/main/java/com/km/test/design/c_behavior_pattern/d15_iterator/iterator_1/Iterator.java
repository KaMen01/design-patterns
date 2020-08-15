package com.km.test.design.c_behavior_pattern.d15_iterator.iterator_1;

/**
 * @author: coming
 * @date: 2020/7/13 10:38
 */
public interface Iterator {
    /**
     * 是否存在下一个元素
     * @return 是否存在的布尔值
     */
    Boolean hasNext();

    /**
     * 获得当前迭代器指向的对象，并将迭代器后移
     * @return 对象
     */
    Object next();


}
