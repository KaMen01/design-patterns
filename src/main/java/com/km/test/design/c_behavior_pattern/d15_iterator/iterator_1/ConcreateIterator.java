package com.km.test.design.c_behavior_pattern.d15_iterator.iterator_1;

/**
 * @author: coming
 * @date: 2020/7/13 10:56
 */
public class ConcreateIterator implements Iterator {
    /**
     * 集合对象
     */
    private Aggregate aggregate;
    /**
     * 迭代器指向的未知
     */
    private int index = 0;

    /**
     * 集合的大小
     */
    private int size = 0;

    public ConcreateIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
        this.size = aggregate.size();
    }

    public Boolean hasNext() {
        return index < size;
    }

    public Object next() {
        Object value = aggregate.get(index);
        index++;
        return value;
    }
}
