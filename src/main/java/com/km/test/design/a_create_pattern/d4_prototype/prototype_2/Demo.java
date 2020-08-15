package com.km.test.design.a_create_pattern.d4_prototype.prototype_2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: coming
 * @date: 2020/7/29 16:35
 */
public class Demo {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        List<Shape> shapesCopy = new ArrayList<Shape>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color="blue";
        shapes.add(circle);

        Circle anotherCircle =(Circle)circle.cloneShape();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.length = 15;
        rectangle.color="red";
        shapes.add(rectangle);

        cloneAndCompare(shapes,shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes,List<Shape> shapeCopy){
        for (Shape shape : shapes) {
            shapeCopy.add(shape.cloneShape());
        }
        shapeCopy.get(2).x=5;

        for (int i = 0; i < shapeCopy.size(); i++) {
            if(shapes.get(i)!=shapeCopy.get(i)){
                //他们指向的内存不同
                System.out.println(i + ": Shapes are different objects (yay!)");
                if(shapes.get(i).equals(shapeCopy.get(i))){
                    //并且他们的值相同
                    System.out.println(i + ": And they are identical (yay!)");
                }else{
                    System.out.println(i+":But they are not identical (booo!)");
                }

            }else{
                System.out.println(i+": Shape objects are the same (booo!)");
            }
        }
    }

}
