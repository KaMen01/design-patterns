package com.km.test.design.b_structure_pattern.d5_adapter.adapter_2;

/**
 * @author: coming
 * @date: 2020/7/30 16:23
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(8);
        if(roundHole.fit(roundPeg)){
            System.out.println("第一组适合");
        }else{
            System.out.println("第一组不适合");
        }

        SquarePeg squarePeg = new SquarePeg(10);
        if(roundHole.fit(new Square2RoundAdapter(squarePeg))){
            System.out.println("第二组方钉转换适合");
        }else{
            System.out.println("第二组方钉转换后不适合");
        }

        squarePeg.setWidth(15);
//        roundHole.setRadius(1);
        if(roundHole.fit(new Square2RoundAdapter(squarePeg))){
            System.out.println(new Square2RoundAdapter(squarePeg).getRadius());
            System.out.println("第3组方钉转换适合");
        }else{
            System.out.println(new Square2RoundAdapter(squarePeg).getRadius());
            System.out.println("第3组方钉转换后不适合");
        }
    }
}
