package com.km.test.design.c_behavior_pattern.d15_iterator.iterator_1;

/**
 * @author: coming
 * @date: 2020/7/13 10:54
 */
public abstract class Aggregate {
    /**
     * 获得集合的迭代器
     * @return 迭代器
     */
    abstract Iterator iterator();

    /**
     * 得到index位置的对象
     * @param index int值
     * @return 具体对象
     */
    abstract Object get(int index);

    /**
     * 获得该集合的大小
     * @return int值
     */
    abstract int size();
}
