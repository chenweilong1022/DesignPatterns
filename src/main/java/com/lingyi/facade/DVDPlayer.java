package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:26
 */
public class DVDPlayer {


    public static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstanc() {
        return instance;
    }


    public void on() {
        System.out.println("dvd 开机 ");
    }

    public void off() {
        System.out.println("dvd 关机 ");
    }

    public void play() {
        System.out.println("dvd 播放 ");
    }

    public void pause() {
        System.out.println("dvd 暂停 ");
    }

}
