package com.lingyi.mediator;

/**
 * 中介者
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-15 11:05
 */
public interface Mediator {

    void register(Colleague colleague,String name);

    void getMsg(int stateChange, String colleagueName);

    void sendMsg();

}
