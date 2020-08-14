package com.lingyi.adapter.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 17:11
 */
public class App {

    public static void main(String[] args) {

        Voltage220V voltage220V = new Voltage220V();

        VoltageAdapter voltageAdapter = new VoltageAdapter();
        voltageAdapter.setVoltage220V(voltage220V);

        Phone phone = new Phone();
        phone.recharge(voltageAdapter);


    }
}
