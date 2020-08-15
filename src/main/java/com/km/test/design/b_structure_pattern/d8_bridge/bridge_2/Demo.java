package com.km.test.design.b_structure_pattern.d8_bridge.bridge_2;

/**
 * @author: coming
 * @date: 2020/7/30 17:43
 */
public class Demo {
    public static void main(String[] args) {
        MessageImplementor impl = new MessageSMS();
        AbstractMessage abs = new CommonMessage(impl);
        abs.sendMessage("走吧，艾博","落在了门口");

        abs = new UrgencyMessage(impl);
        abs.sendMessage("快点，要吃饭了","卡在了门里");
    }
}
