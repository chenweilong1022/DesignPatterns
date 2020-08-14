package com.lingyi.observer.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:52
 */
public class TenxunWebsite implements Observer {


    @Override
    public void update(double humidness, double pressure, double temperature) {
        this.display(humidness,pressure,temperature);
    }


    public void display(double humidness, double pressure, double temperature) {
        System.out.printf("腾讯天气:当前的温度为%s\n",temperature);
        System.out.printf("腾讯天气:当前的湿度为%s\n",humidness);
        System.out.printf("腾讯天气:当前的压强为%s\n",pressure);
    }
}
