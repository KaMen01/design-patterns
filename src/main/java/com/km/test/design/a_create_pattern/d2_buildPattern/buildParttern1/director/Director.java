package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.director;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.build.Build;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.product.Computer;

/**
 * @Author: coming
 * @Date: 2020/7/2 14:38
 */
public class Director {
    private Build build;

    public Director(Build build) {
        this.build = build;
    }

    public Computer getComputer(){
        build.assembleMainBoard();
        build.assembleDisplayDevice();
        build.assembleKeyboard();
        build.assembleMouse();
        return build.getComputer();
    }
}
