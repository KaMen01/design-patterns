package com.km.test.design.b_structure_pattern.d9_facade.facade_2;

/**
 * @author: coming
 * @date: 2020/8/4 16:51
 */
public class Facade {
    private Circle circle ;
    private Rectangle rectangle ;
    private Square square;

    public Facade(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
