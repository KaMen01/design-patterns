package com.km.test.design.c_behavior_pattern.d12_chain_of_responsibility.chain_1;

/**
 * @Author: coming
 * @Date: 2020/7/7 17:02
 */
public class DepartmentManager extends Handler {
    public DepartmentManager(String name) {
        super(name);
    }

    @Override
    public void operation(Integer price) {
        if(price<1000){
            System.out.println("DepartmentManager process...name:"+this.name);
        }else{
            successor.operation(price);
        }
    }
}
