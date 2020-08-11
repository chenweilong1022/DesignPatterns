package com.lingyi.facade;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-11 22:26
 */
public class Screen {


    public static Screen instance = new Screen();

    public static Screen getInstanc() {
        return instance;
    }


    public void up() {
        System.out.println("Screen up ");
    }

    public void down() {
        System.out.println("Screen down ");
    }


}
