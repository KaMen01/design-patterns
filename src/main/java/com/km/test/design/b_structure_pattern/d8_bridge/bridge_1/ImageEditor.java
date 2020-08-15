package com.km.test.design.b_structure_pattern.d8_bridge.bridge_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 21:36
 */
public class ImageEditor extends Editor {
    public ImageEditor(OperatingSystem system) {
        super(system);
    }

    public void doEdit() {
        system.environment();
        System.out.println("图片编辑器开启...");
    }
}
