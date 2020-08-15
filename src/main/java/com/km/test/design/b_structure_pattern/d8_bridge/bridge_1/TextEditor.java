package com.km.test.design.b_structure_pattern.d8_bridge.bridge_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 22:11
 */
public class TextEditor extends Editor {

    public TextEditor(OperatingSystem system) {
        super(system);
    }

    public void doEdit() {
        system.environment();
        System.out.println("文本编辑器开启...");
    }
}
