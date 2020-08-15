package com.km.test.design.b_structure_pattern.d5_adapter.adapter_2;

/**
 * @author: coming
 * @date: 2020/7/30 16:05
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * 圆孔的半径是否大于圆钉的半径
     * @param roundPeg 圆钉
     * @return 布尔值
     */
    public boolean fit(RoundPeg roundPeg){
        return (this.radius >= roundPeg.getRadius());
    }

}
