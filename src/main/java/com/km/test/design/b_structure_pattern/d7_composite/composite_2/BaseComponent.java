package com.km.test.design.b_structure_pattern.d7_composite.composite_2;

/**
 * @author: coming
 * @date: 2020/7/31 10:08
 */
public abstract class BaseComponent {

    /**
     * 输出那啥
     * @param preStr 字符串
     */
    public abstract void printStruct(String preStr);

    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(BaseComponent child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 从组合对象中移出某个组件对象
     * @param child 被移出的组件对象
     */
    public void removeChild(BaseComponent child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 返回某个索引对应的组件对象
     * @param index 需要获取的组件对象的索引，索引从0开始
     * @return 索引对应的组件对象
     */
    public BaseComponent getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
