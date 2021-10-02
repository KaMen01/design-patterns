package com.km.test.design.b_structure_pattern.d7_composite.composite_2;

/**
 * @author: coming
 * @date: 2020/7/31 10:22
 */
public class Demo {
    public static void main(String[] args) {
//        BaseComponent root = new Composite("根节点");
//        BaseComponent composite1 = new Composite("子节点1");
//        BaseComponent composite2 = new Composite("子节点2");
//        BaseComponent composite3 = new Composite("子节点3");
//
//        BaseComponent leaf1 = new Leaf("叶子1");
//        BaseComponent leaf2 = new Leaf("叶子2");
//        BaseComponent leaf3 = new Leaf("叶子3");
//
//        composite1.addChild(leaf1);
//        composite2.addChild(leaf2);
//
//        root.addChild(composite1);
//        root.addChild(composite2);
//        root.addChild(leaf3);
//        root.addChild(composite3);
//
//        root.printStruct("");
//
        Leaf leaf = new Leaf("叶子");
        Leaf leaf1 = new Leaf("儿子");
        leaf.addChild(leaf1);
    }
}
