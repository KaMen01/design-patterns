package com.km.test.design.b_structure_pattern.d8_bridge.bridge_1;

/**
 * @Author: coming
 * @Date: 2020/7/3 22:21
 */
public class BridgeMain {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new LinuxSys());
        textEditor.doEdit();

        TextEditor textEditor1 = new TextEditor(new WindowsSys());
        textEditor1.doEdit();

        VideoEditor videoEditor = new VideoEditor(new LinuxSys());
        videoEditor.doEdit();
    }
}
