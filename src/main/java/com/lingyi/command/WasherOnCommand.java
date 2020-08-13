package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:50
 */
public class WasherOnCommand implements Command {

    WasherReceiver washerReceiver;

    public WasherOnCommand(WasherReceiver washerReceiver) {
        this.washerReceiver = washerReceiver;
    }

    @Override
    public void execute() {
        washerReceiver.on();
    }

    @Override
    public void undo() {
        washerReceiver.off();
    }
}
