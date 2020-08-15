package com.km.test.design.b_structure_pattern.d5_adapter.adapter_2;

/** 圆钉
 * @author: coming
 * @date: 2020/7/30 16:07
 */
public class RoundPeg {
    private double radius;

    public RoundPeg(){}

    public RoundPeg(double radius){
        this.radius = radius;
    }


    public double getRadius(){
        return this.radius;
    }
}
