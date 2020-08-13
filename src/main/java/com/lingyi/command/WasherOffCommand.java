package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:50
 */
public class WasherOffCommand implements Command {

    WasherReceiver washerReceiver;

    public WasherOffCommand(WasherReceiver washerReceiver) {
        this.washerReceiver = washerReceiver;
    }

    @Override
    public void execute() {
        washerReceiver.off();
    }

    @Override
    public void undo() {
        washerReceiver.on();
    }
}
