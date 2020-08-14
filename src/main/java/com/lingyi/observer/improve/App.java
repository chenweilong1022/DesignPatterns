package com.lingyi.observer.improve;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:56
 */
public class App {

    public static void main(String[] args) {

        BaiduWebsite baiduWebsite = new BaiduWebsite();

        TenxunWebsite tenxunWebsite = new TenxunWebsite();


        WeatherData weatherData = new WeatherData(10,10,10);
        weatherData.register(baiduWebsite);
        weatherData.notifyObs();

        weatherData.updateData(20,20,20);
        weatherData.register(tenxunWebsite);
        weatherData.notifyObs();






    }
}
