package com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.target;

/**我的插座时港版插座，需要港版电源
 * @Author: coming
 * @Date: 2020/7/2 20:55
 */
public class TargetHongkongPanel implements TargetHongkongInterface {
    public void offerHongkongElectricity(){
        System.out.println("提供香港的电流");
    }
}
