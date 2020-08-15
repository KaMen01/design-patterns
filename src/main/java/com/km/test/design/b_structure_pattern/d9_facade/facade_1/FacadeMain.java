package com.km.test.design.b_structure_pattern.d9_facade.facade_1;

/**
 * @Author: coming
 * @Date: 2020/7/5 21:47
 */
public class FacadeMain {
    public static void main(String[] args) {
        //离开家时，可以直接用这个
        Facade facade = new Facade();
        facade.close();
    }
}
