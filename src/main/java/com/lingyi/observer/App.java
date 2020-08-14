package com.lingyi.observer;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:20
 */
public class App {

    public static void main(String[] args) {


        CurrentWeather currentWeather = new CurrentWeather();

        WeatherData weatherData = new WeatherData(10,10,10);
        weatherData.setCurrentWeather(currentWeather);
        weatherData.change();


        weatherData.updateData(20,20,20);


    }
}
