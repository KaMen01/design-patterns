package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.build;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.product.*;

/**
 * @Author: coming
 * @Date: 2020/7/2 14:31
 */
public class AppleBuild implements Build{
    private Computer computer = new Computer();
    @Override
    public void assembleMainBoard() {
        computer.setMainBoard(new AppleMainBoard());
    }

    @Override
    public void assembleDisplayDevice() {
        computer.setDisplayDevice(new AppleDisplayDevice());
    }

    @Override
    public void assembleMouse() {
        computer.setMouse(new AppleMouse());
    }

    @Override
    public void assembleKeyboard() {
        computer.setKeyboard(new AppleKeyboard());
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
