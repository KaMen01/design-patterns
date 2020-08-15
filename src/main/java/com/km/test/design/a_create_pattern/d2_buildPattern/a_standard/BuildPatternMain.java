package com.km.test.design.a_create_pattern.d2_buildPattern.a_standard;

import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.build.ConcreateBuildApple;
import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.build.ConcreateBuildAsus;
import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.director.AssembleComputerRefactor;

/**
 * @Author: coming
 * @Date: 2020/7/1 23:00
 */
public class BuildPatternMain {
    public static void main(String[] args) {
        new AssembleComputerRefactor(new ConcreateBuildApple()).getComputer().start();
        new AssembleComputerRefactor(new ConcreateBuildAsus()).getComputer().start();
    }
}
