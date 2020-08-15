package com.km.test.design.c_behavior_pattern.d19_state;

/**
 * @author: coming
 * @date: 2020/7/14 11:27
 */
public class Context {
    private State state1 = new ConcreateState1();
    private State state2 = new ConcreateState2();

    private State state = state1;

    public void action(){
        state.handle();
    }

    public void  changeState(int x){
        if(x == 1){
            state = state1;
        }else if(x == 2){
            state = state2;
        }else {
            state = state1;
        }
    }

}
