package com.km.test.design.b_structure_pattern.d8_bridge.bridge_2;

/** 以站内短信的方式发送消息
 * @author: coming
 * @date: 2020/7/30 17:37
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String username) {
        System.out.println("发送站内短消息:["+message+"]给"+username);
    }
}
