package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:26
 */
public class TheaterLight {


    public static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstanc() {
        return instance;
    }


    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim() {
        System.out.println(" TheaterLight dim.. ");
    }

    public void bright() {
        System.out.println(" TheaterLight bright.. ");
    }

}
