package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:26
 */
public class Popcorn {


    public static Popcorn instance = new Popcorn();

    public static Popcorn getInstanc() {
        return instance;
    }


    public void on() {
        System.out.println("Popcorn 开机 ");
    }

    public void off() {
        System.out.println("Popcorn 关机 ");
    }

    public void pop() {
        System.out.println("dvd 工作 ");
    }


}
