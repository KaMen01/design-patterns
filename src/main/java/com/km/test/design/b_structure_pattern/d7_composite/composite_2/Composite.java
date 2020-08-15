package com.km.test.design.b_structure_pattern.d7_composite.composite_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: coming
 * @date: 2020/7/31 10:12
 */
public class Composite extends BaseComponent{

    private List<BaseComponent> childComponents = null;

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(BaseComponent child) {
        if(childComponents==null){
            childComponents = new ArrayList<BaseComponent>();
        }
        childComponents.add(child);
    }

    @Override
    public void printStruct(String preStr) {
        //先把自己输出去
        System.out.println(preStr+"+"+this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if(childComponents !=null){
            preStr += " ";
            for (BaseComponent c : childComponents) {
                c.printStruct(preStr);
            }
        }

    }
}
