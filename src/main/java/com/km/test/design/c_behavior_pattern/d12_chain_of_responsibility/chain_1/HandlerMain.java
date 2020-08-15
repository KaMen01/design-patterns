package com.km.test.design.c_behavior_pattern.d12_chain_of_responsibility.chain_1;

/**
 * @Author: coming
 * @Date: 2020/7/7 17:06
 */
public class HandlerMain {
    public static void main(String[] args) {
        DepartmentManager departmentManager = new DepartmentManager("小卡");
        Boss boss = new Boss("小明");
        departmentManager.setSuccessor(boss);

        departmentManager.operation(999);

    }
}
