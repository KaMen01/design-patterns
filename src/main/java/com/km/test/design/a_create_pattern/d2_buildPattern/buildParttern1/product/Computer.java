package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.product;

/**
 * @Author: coming
 * @Date: 2020/7/2 14:29
 */
public class Computer {
    private MainBoard mainBoard;
    private DisplayDevice displayDevice;
    private Mouse mouse;
    private Keyboard keyboard;

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

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void start(){
        System.out.println(mainBoard.start());
        System.out.println(displayDevice.start());
        System.out.println(keyboard.start());
        System.out.println(mouse.start());
    }
}
