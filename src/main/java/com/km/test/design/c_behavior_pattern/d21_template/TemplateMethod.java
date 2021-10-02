package com.km.test.design.c_behavior_pattern.d21_template;

public class TemplateMethod {
    public final void print(String message){
        System.out.println("###################");
        wrapPrint(message);
        System.out.println("##################");
    }

    protected void wrapPrint(String message) {
    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod(){
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*"+message+"*");
            }
        };
        t1.print("这个就是模板模式，利用钩子函数，来控制一部风实现，总体实现由父类定义好");

    }

}
