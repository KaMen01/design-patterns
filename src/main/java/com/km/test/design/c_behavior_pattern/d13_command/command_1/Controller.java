package com.km.test.design.c_behavior_pattern.d13_command.command_1;

/**
 * 遥控器
 * @Author: coming
 * @Date: 2020/7/8 17:55
 */
public class Controller {
    private Command turnOn;
    private Command turnOff;
    private Command changeChannel;

    public Controller(Command turnOn, Command turnOff, Command changeChannel) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.changeChannel = changeChannel;
    }

    public void turnON(){turnOn.execute();}
    public void turnOff(){turnOff.execute();}
    public void changeChannel(){changeChannel.execute();}
}
