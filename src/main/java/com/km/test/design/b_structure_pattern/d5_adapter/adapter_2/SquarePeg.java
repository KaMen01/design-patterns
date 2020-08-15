package com.km.test.design.b_structure_pattern.d5_adapter.adapter_2;

/** 方钉
 * @author: coming
 * @date: 2020/7/30 16:11
 */
public class SquarePeg {
    private double width;

    public SquarePeg(){}

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    /**
     * 获得方钉的面积
     * @return 面积
     */
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
