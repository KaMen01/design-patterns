package com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.adapter;

import com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.adaptee.AdapteeChinaMainlandInterface;
import com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.target.TargetHongkongInterface;

/**
 * @Author: coming
 * @Date: 2020/7/2 21:00
 */
public class Adapter implements TargetHongkongInterface {
    private AdapteeChinaMainlandInterface adapteeChinaMainland;

    public Adapter(AdapteeChinaMainlandInterface adapteeChinaMainland){
        this.adapteeChinaMainland = adapteeChinaMainland;
    }

    public void offerHongkongElectricity() {
        System.out.println("进行特殊处理");
        adapteeChinaMainland.offerChinaMainlandElectricity();
    }
}
