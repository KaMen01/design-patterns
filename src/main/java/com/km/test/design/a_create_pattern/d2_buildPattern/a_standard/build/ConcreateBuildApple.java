package com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.build;

import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product.*;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:48
 */
public class ConcreateBuildApple implements ComputerBuild {
    private Computer computer = new Computer();

    public void assembleMainBoard() {
        computer.setMainBoard(new AppleMainBoard());
    }

    public void assembleDisplayDevice() {
        computer.setDisplayDevice(new AppleDisplayBoard());
    }

    public Computer createComputer() {
        return computer;
    }
}
