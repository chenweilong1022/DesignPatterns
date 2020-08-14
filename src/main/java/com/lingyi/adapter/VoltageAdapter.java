package com.lingyi.adapter;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 17:04
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int src = output220V();
        int des = src / 44;
        return des;
    }
}
