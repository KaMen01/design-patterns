package com.km.test.design.b_structure_pattern.d8_bridge.bridge_2;

/**
 * @author: coming
 * @date: 2020/7/30 17:40
 */
public class CommonMessage extends AbstractMessage{
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    /**
     * CommonMessage不对消息进行处理就开始发送
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
