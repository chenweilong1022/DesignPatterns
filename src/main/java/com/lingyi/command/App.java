package com.lingyi.command;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-13 17:35
 */
public class App {

    public static void main(String[] args) {

        LightReceiver lightReceiver = new LightReceiver();

        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("开始按下开灯按钮");
        remoteController.buttonOnCommand(0);

        System.out.println("按下撤销按钮");

        remoteController.buttonUndoCommand();

        System.out.println("开始按下关灯按钮");
        remoteController.buttonOffCommand(0);


        System.out.println("按下撤销按钮");

        remoteController.buttonUndoCommand();


        System.out.println("~~~~~~~~~~~~~~~~~~电视机开始~~~~~~~~~~~~~~~~");



        TVReceiver tvReceiver = new TVReceiver();

        Command tvOffCommand = new TVOffCommand(tvReceiver);
        Command tvOnCommand = new TVOnCommand(tvReceiver);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);



        System.out.println("开始按下开启电视按钮");
        remoteController.buttonOnCommand(1);

        System.out.println("按下撤销按钮");

        remoteController.buttonUndoCommand();

        System.out.println("开始按下关闭电视按钮");
        remoteController.buttonOffCommand(1);


        System.out.println("按下撤销按钮");

        remoteController.buttonUndoCommand();



        System.out.println("~~~~~~~~~~~~~~~~~~洗衣机开始~~~~~~~~~~~~~~~~");

        WasherReceiver washerReceiver = new WasherReceiver();

        Command washerOnCommand = new WasherOnCommand(washerReceiver);
        Command washerOffCommand = new WasherOffCommand(washerReceiver);
        remoteController.setCommand(2,washerOnCommand,washerOffCommand);


        System.out.println("开始按下开启洗衣机按钮");
        remoteController.buttonOnCommand(2);

        System.out.println("按下撤销按钮");

        remoteController.buttonUndoCommand();

        System.out.println("开始按下关闭洗衣机按钮");
        remoteController.buttonOffCommand(2);


        System.out.println("按下撤销按钮");

        remoteController.buttonUndoCommand();
    }
}
