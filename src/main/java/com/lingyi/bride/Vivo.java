package com.lingyi.bride;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 11:35
 */
public class Vivo extends Brand {

    @Override
    void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    void close() {
        System.out.println("Vivo手机关机");
    }

    @Override
    void call() {
        System.out.println("Vivo手机打电话");
    }
}
