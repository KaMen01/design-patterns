package com.km.test.design.test;

/**
 * @Author: coming
 * @Date: 2020/7/6 16:07
 */
public class TestMain {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(20);
        user.setName("jkm");

        User user1 =user;

        user1.setName("哈哈哈");

        System.out.println(user);
    }
}
