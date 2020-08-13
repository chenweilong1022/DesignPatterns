package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:26
 */
public class LightOffCommand implements Command {

    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }

}
