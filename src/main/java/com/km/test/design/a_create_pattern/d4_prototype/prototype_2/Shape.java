package com.km.test.design.a_create_pattern.d4_prototype.prototype_2;

import java.util.Objects;

/**
 * @author: coming
 * @date: 2020/7/29 15:53
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){};

    public Shape(Shape target){
        if(target!=null){
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }

    }

    /**
     * 克隆
     * @return
     */
    public abstract Shape cloneShape();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)){
            return false;
        }
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
