package com.km.test.design.b_structure_pattern.d8_bridge.bridge_2;

/**
 * @author: coming
 * @date: 2020/7/30 17:34
 */
public interface MessageImplementor {

    /**
     * 发送信息
     * @param message 信息
     * @param username 接收用户的用户名
     */
    public void send(String message,String username);
}
