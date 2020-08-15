package com.km.test.design.a_create_pattern.d4_prototype.prototype_2;

/**
 * @author: coming
 * @date: 2020/7/29 16:06
 */
public class Rectangle extends Shape {
    public int width;
    public int length;

    public Rectangle(){}

    public Rectangle(Rectangle target){
        super(target);
        if(target !=null){
            this.width = target.width;
            this.length = target.length;
        }
    }

    @Override
    public Shape cloneShape() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if(!(object instanceof Rectangle)||!(super.equals(object))){
            return false;
        }
        Rectangle rectangle = (Rectangle)object;
        return rectangle.length == length && rectangle.width == width;
    }

}
