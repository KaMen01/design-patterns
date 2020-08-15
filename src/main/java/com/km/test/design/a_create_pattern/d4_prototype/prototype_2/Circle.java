package com.km.test.design.a_create_pattern.d4_prototype.prototype_2;

/**
 * @author: coming
 * @date: 2020/7/29 16:00
 */
public class Circle extends Shape{

    public int radius;

    public Circle(){

    }


    public Circle(Circle target){
        super(target);
        if(target!=null){
            this.radius = target.radius;
        }
    }

    @Override
    public Shape cloneShape() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)){
            return false;
        }
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
