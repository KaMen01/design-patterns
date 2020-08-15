package com.km.test.design.c_behavior_pattern.d13_command.command_1;

/**
 * @Author: coming
 * @Date: 2020/7/8 17:54
 */
public class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOff();
    }
}
