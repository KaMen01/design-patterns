package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.build.AppleBuild;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.director.Director;
import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.product.Computer;

/**
 * @Author: coming
 * @Date: 2020/7/2 14:15
 */
public class BuildPatternMain2 {
    public static void main(String[] args) {
        Director director = new Director(new AppleBuild());
        Computer computer = director.getComputer();
        computer.start();
    }
}
