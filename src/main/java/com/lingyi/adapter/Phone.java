package com.lingyi.adapter;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 17:05
 */
public class Phone {


    public void recharge(VoltageAdapter voltageAdapter) {

        if (voltageAdapter.output5V() == 5) {
            System.out.println(" 手机开始充电了 ");
        }else {
            System.out.println(" 手机不能充电 ");
        }


    }

}
