package com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.adaptee;

/**
 * @Author: coming
 * @Date: 2020/7/2 20:57
 */
public class AdapteeChinaMainlandPanel implements AdapteeChinaMainlandInterface {
    public void offerChinaMainlandElectricity() {
        System.out.println("提供大陆电流");
    }
}
