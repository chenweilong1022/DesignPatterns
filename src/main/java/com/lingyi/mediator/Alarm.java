package com.lingyi.mediator;


/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 11:05
 */
public class Alarm extends Colleague {


    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(this,name);
    }


    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange,this.getName());
    }

    public void noise() {
        System.out.println("闹钟发出响声");
    }

    public void close() {
        System.out.println("闹钟关闭");
    }
}
