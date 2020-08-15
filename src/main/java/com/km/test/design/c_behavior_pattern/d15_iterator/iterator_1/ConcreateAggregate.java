package com.km.test.design.c_behavior_pattern.d15_iterator.iterator_1;

/**
 * @author: coming
 * @date: 2020/7/13 11:07
 */
public class ConcreateAggregate extends Aggregate {
   private Object[] objects;

    public ConcreateAggregate(Object[] objects) {
        this.objects = objects;
    }

    @Override
    Iterator iterator() {
        return new ConcreateIterator(this);
    }

    @Override
    Object get(int index) {
        return objects[index];
    }

    @Override
    int size() {
        return objects.length;
    }
}
