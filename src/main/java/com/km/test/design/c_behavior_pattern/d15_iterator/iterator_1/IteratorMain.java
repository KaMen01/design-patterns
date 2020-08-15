package com.km.test.design.c_behavior_pattern.d15_iterator.iterator_1;

/**
 * @author: coming
 * @date: 2020/7/13 11:09
 */
public class IteratorMain {
    public static void main(String[] args) {
        Object[] objects = {1,"2",3};
        System.out.println(objects.length);
        Aggregate aggregate = new ConcreateAggregate(objects);
        Iterator iterator = aggregate.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getClass());
        }
    }
}
