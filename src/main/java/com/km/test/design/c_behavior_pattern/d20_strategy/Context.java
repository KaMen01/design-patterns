package com.km.test.design.c_behavior_pattern.d20_strategy;

/**
 * @author: coming
 * @date: 2020/7/15 9:14
 */
public class Context {
    private SortStrategy sortStrategy;

    public Context(SortStrategy sortStrategy){
        this.sortStrategy = sortStrategy;
    }
    public void sort(){
        if(sortStrategy !=null){
            sortStrategy.sort();
        }
    }

    public SortStrategy getSortStrategy() {
        return sortStrategy;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
}
