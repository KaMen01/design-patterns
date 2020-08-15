package com.km.test.design.b_structure_pattern.d8_bridge.bridge_2;

/**
 * @author: coming
 * @date: 2020/7/30 17:39
 */
public class MessageEmail implements MessageImplementor{
    @Override
    public void send(String message, String username) {
        System.out.println("发送Email消息:["+message+"]给"+username);
    }
}
