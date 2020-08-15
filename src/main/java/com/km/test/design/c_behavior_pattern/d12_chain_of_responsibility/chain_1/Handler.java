package com.km.test.design.c_behavior_pattern.d12_chain_of_responsibility.chain_1;

/**抽象处理
 * @Author: coming
 * @Date: 2020/7/7 16:57
 */
public abstract class Handler {
    protected String name;
    protected Handler successor;

    public Handler(String name){
        this.name = name;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void operation(Integer price);

}
