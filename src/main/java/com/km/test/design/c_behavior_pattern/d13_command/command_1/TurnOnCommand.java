package com.km.test.design.c_behavior_pattern.d13_command.command_1;

/**
 * @Author: coming
 * @Date: 2020/7/8 17:53
 */
public class TurnOnCommand implements Command {
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.turnOn();
    }
}
