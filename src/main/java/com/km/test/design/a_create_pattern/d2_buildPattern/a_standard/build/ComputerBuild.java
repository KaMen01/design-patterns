package com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.build;

import com.km.test.design.a_create_pattern.d2_buildPattern.a_standard.product.Computer;

/**
 * @Author: coming
 * @Date: 2020/7/1 22:36
 */
public interface ComputerBuild {
    void assembleMainBoard();
    void assembleDisplayDevice();
    Computer createComputer();
}
