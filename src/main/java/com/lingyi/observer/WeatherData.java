package com.lingyi.observer;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:18
 */
public class WeatherData {

    private double humidness;

    private double pressure;

    private double temperature;

    private CurrentWeather currentWeather;

    public WeatherData(double humidness, double pressure, double temperature) {
        this.humidness = humidness;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    public double getHumidness() {
        return humidness;
    }

    public void setHumidness(double humidness) {
        this.humidness = humidness;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public CurrentWeather getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    public WeatherData(CurrentWeather currentWeather) {
        this.currentWeather = currentWeather;
    }

    public void change() {
        currentWeather.update(this.humidness,this.pressure,this.temperature);
    }


    public void updateData(double humidness, double pressure, double temperature) {
        this.humidness = humidness;
        this.pressure = pressure;
        this.temperature = temperature;
        this.change();
    }



}
