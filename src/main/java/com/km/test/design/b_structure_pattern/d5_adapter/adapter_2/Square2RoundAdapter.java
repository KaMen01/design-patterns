package com.km.test.design.b_structure_pattern.d5_adapter.adapter_2;

/** 方钉转换成圆钉的适配器
 * @author: coming
 * @date: 2020/7/30 16:14
 */
public class Square2RoundAdapter extends RoundPeg {
    private SquarePeg squarePeg;


    public Square2RoundAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        //Math.sqrt(Math.pow((squarePeg.getWidth()), 2) * 2) 直径，所以要除以2
        return (Math.sqrt(Math.pow((squarePeg.getWidth()), 2) * 2)/2);
    }
}
