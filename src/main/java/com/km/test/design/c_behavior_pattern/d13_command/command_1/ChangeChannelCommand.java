package com.km.test.design.c_behavior_pattern.d13_command.command_1;

/**
 * @Author: coming
 * @Date: 2020/7/8 17:55
 */
public class ChangeChannelCommand implements Command {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
