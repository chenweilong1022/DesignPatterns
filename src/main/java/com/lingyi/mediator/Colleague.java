package com.lingyi.mediator;

/**
 * 同事抽象类
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 11:05
 */
public abstract class Colleague {


    private Mediator mediator;

    private String name;

    public Colleague() {
    }

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sendMsg(int stateChange);
}
