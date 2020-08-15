package com.km.test.design.c_behavior_pattern.d17_memento.memento_1;

/**
 * @author: coming
 * @date: 2020/7/14 10:54
 */
public class MementoMain {
    public static void main(String[] args) {
        Memento memento = new Memento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);
        Originator originator = new Originator();
        originator.setState(1);
        Memento memento1 = originator.createMemento(careTaker.getMemento(), "版本1");
        originator.setState(2);
        System.out.println(originator);
        originator.recover(careTaker.getMemento(),"版本1");
        System.out.println(originator);

    }
}
