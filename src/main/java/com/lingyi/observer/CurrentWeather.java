package com.lingyi.observer;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:16
 */
public class CurrentWeather {

    private double humidness;

    private double pressure;

    private double temperature;

    public void update(double humidness, double pressure, double temperature) {
        this.humidness = humidness;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }


    public void display() {
        System.out.printf("当前的温度为%s\n",this.temperature);
        System.out.printf("当前的湿度为%s\n",this.humidness);
        System.out.printf("当前的压强为%s\n",this.pressure);
    }


}
