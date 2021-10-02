package com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.build;

import com.km.test.design.a_create_pattern.d2_buildPattern.buildParttern1.product.Computer;

/**
 * @Author: coming
 * @Date: 2020/7/2 14:25
 */
public interface Build {
    void assembleMainBoard();
    void assembleDisplayDevice();
    void assembleMouse();
    void assembleKeyboard();
    Computer getComputer();
}
