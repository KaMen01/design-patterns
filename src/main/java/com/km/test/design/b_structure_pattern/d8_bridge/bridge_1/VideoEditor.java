package com.km.test.design.b_structure_pattern.d8_bridge.bridge_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 22:09
 */
public class VideoEditor extends Editor {
    public VideoEditor(OperatingSystem system) {
        super(system);
    }

    public void doEdit() {
        system.environment();
        System.out.println("视频编辑器开启...");
    }
}
