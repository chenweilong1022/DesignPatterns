package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:29
 */
public class RemoteController {

    Command[] onCommand;

    Command[] offCommand;

    Command undoCommand;

    public RemoteController() {

        onCommand = new Command[5];
        offCommand = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    public void setCommand(int index,Command onCommand,Command offCommand) {
        this.onCommand[index] = onCommand;
        this.offCommand[index] = offCommand;
    }

    public void buttonOnCommand(Integer index) {
        this.onCommand[index].execute();
        this.undoCommand = this.onCommand[index];
    }

    public void buttonOffCommand(Integer index) {
        this.offCommand[index].execute();
        this.undoCommand = this.offCommand[index];
    }

    public void buttonUndoCommand() {
        this.undoCommand.undo();
    }


}
