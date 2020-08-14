package com.lingyi.bride;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 11:35
 */
public class XiaoMi extends Brand {

    @Override
    void open() {
        System.out.println("小米手机开机");
    }

    @Override
    void close() {
        System.out.println("小米手机关机");
    }

    @Override
    void call() {
        System.out.println("小米手机打电话");
    }
}
