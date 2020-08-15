package com.km.test.design.b_structure_pattern.d8_bridge.bridge_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 21:36
 */
public abstract class Editor {
    protected OperatingSystem system;
    public Editor(OperatingSystem system){
        this.system = system;
    }
    public abstract void doEdit();
}
