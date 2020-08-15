package com.km.test.design.b_structure_pattern.d5_adapter.adapter_1;

import com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.adaptee.AdapteeChinaMainlandInterface;
import com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.adaptee.AdapteeChinaMainlandPanel;
import com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.adapter.Adapter;
import com.km.test.design.b_structure_pattern.d5_adapter.adapter_1.target.TargetHongkongInterface;

/**
 * @Author: coming
 * @Date: 2020/7/2 21:31
 */
public class SocketMain {

    /**
     * 将插座插入香港的面板 并获得香港电流
     * @param hongkongInterface
     */
    public void plugin(TargetHongkongInterface hongkongInterface){
        hongkongInterface.offerHongkongElectricity();
    }

    public static void main(String[] args) {
        //港版插座
        SocketMain socketMain = new SocketMain();

        //中国的插电板
        AdapteeChinaMainlandInterface adapteeChinaMainlandInterface = new AdapteeChinaMainlandPanel();

        //在中国，怎么可能有香港的插座面板？只能用转换器

        Adapter adapter = new Adapter(adapteeChinaMainlandInterface);

        //将港版插头插入适配器
        socketMain.plugin(adapter);
    }
}
