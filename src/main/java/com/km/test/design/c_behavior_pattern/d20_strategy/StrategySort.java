package com.km.test.design.c_behavior_pattern.d20_strategy;

/**
 * @author: coming
 * @date: 2020/7/15 9:20
 */
public class StrategySort {
    public static void main(String[] args) {
        SortStrategy sortStrategy = new BubbleSort();
        SortStrategy sortStrategy1 =new QuickSort();
        Context context = new Context(sortStrategy);
        context.sort();
        context.setSortStrategy(sortStrategy1);
        context.sort();
    }
}
