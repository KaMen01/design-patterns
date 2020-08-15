package com.km.test.design.test;

/**
 * @Author: coming
 * @Date: 2020/7/6 16:07
 */
public class User {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name:"+name+";age:"+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
