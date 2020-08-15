package com.lingyi.mediator;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 11:28
 */
public class App {


    public static void main(String[] args) {


        Mediator mediator = new ConcreteMediator();


        Alarm alarm = new Alarm(mediator,"Alarm");



        alarm.sendMsg(0);
        alarm.sendMsg(1);
    }


}
