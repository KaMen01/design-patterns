package com.km.test.design.c_behavior_pattern.d17_memento.memento_1;

/**
 * @author: coming
 * @date: 2020/7/14 10:39
 */
public class Originator {
    /**
     * 用int值描述内部状态
     */
    private Integer state;

    public Memento createMemento(Memento memento,String banben){
        memento.addMemento(banben,state);
        return  memento;
    }

    public void recover(Memento memento,String banben){
        this.state  = memento.getMemento(banben);
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "内部状态："+String.valueOf(state);
    }
}
