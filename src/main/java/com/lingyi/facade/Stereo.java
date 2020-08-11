package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:26
 */
public class Stereo {


    public static Stereo instance = new Stereo();

    public static Stereo getInstanc() {
        return instance;
    }


    public void on() {
        System.out.println("Stereo 开机 ");
    }

    public void off() {
        System.out.println("Stereo 关机 ");
    }

    public void up() {
        System.out.println("Stereo up ");
    }


}
