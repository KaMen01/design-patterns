package com.km.test.design.b_structure_pattern.d9_facade.facade_2;

/**
 * @author: coming
 * @date: 2020/8/4 17:23
 */
public class Demo {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();

    }
}
