package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:41
 */
public class TVOnCommand implements Command {


    TVReceiver tvReceiver;

    public TVOnCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on();
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
