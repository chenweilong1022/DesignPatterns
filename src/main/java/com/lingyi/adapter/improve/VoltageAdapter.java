package com.lingyi.adapter.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 17:04
 */
public class VoltageAdapter implements Voltage5V {


    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public VoltageAdapter() {
    }

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        int desc = 0;

        if (voltage220V != null) {

            int src = voltage220V.output220V();
            System.out.println("开始适配");
            desc = src / 44;
            System.out.println("适配成功电压为" + desc);
        }
        return desc;
    }
}
