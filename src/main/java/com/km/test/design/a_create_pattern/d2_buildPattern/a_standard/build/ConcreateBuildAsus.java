package com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.build;

import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product.AsusDisplayDevice;
import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product.AsusMainBoard;
import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product.Computer;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:53
 */
public class ConcreateBuildAsus implements ComputerBuild {
    private Computer computer = new Computer();
    public void assembleMainBoard() {
        computer.setMainBoard(new AsusMainBoard());
    }

    public void assembleDisplayDevice() {
        computer.setDisplayDevice(new AsusDisplayDevice());
    }

    public Computer createComputer() {
        return computer;
    }
}
