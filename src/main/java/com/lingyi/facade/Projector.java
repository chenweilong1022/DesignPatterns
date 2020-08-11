package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:26
 */
public class Projector {


    public static Projector instance = new Projector();

    public static Projector getInstanc() {
        return instance;
    }


    public void on() {
        System.out.println("Projector 开机 ");
    }

    public void off() {
        System.out.println("Projector 关机 ");
    }

    public void focus() {
        System.out.println("Projector 聚焦 ");
    }


}
