package com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:44
 */
public class Computer {
    private MainBoard mainBoard;
    private DisplayDevice displayDevice;

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public DisplayDevice getDisplayDevice() {
        return displayDevice;
    }

    public void setDisplayDevice(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void start(){
        System.out.println(mainBoard.run());
        System.out.println(displayDevice.run());
    }
}
