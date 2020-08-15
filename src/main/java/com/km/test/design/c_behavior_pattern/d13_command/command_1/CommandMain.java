package com.km.test.design.c_behavior_pattern.d13_command.command_1;

/**
 * @Author: coming
 * @Date: 2020/7/8 17:58
 */
public class CommandMain {

    public static void main(String[] args) {
        TV myTv = new TV();

//        这一段是否可以用构建者模式来封装创建对象的过程
        TurnOnCommand openCommand = new TurnOnCommand(myTv);
        TurnOffCommand turnOffCommand = new TurnOffCommand(myTv);
        ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(myTv);
        Controller controller = new Controller(openCommand, turnOffCommand, changeChannelCommand);

        controller.turnON();
        controller.turnOff();
        controller.changeChannel();
    }
}
