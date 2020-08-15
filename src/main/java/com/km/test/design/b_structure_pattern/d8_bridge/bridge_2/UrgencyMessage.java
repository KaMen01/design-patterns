package com.km.test.design.b_structure_pattern.d8_bridge.bridge_2;


/**
 * @author LEGION
 */
public class UrgencyMessage extends AbstractMessage{
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    /**
     * 发送消息时，做一些紧急的操作再发送
     * @param message 要发送的消息内容
     * @param toUser 消息发送的目的人员
     */
    @Override
    public void sendMessage(String message, String toUser) {
        message="!紧急消息发送:"+message;
        super.sendMessage(message, toUser);
    }
}
