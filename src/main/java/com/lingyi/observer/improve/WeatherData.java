package com.lingyi.observer.improve;

import com.lingyi.observer.CurrentWeather;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenweilong
 * @email 1433471850@qq.com
 * @date 2020-08-14 15:18
 */
public class WeatherData implements Observable{

    private double humidness;

    private double pressure;

    private double temperature;

    private List<Observer> observers = new ArrayList<>();


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

    public void updateData(double humidness, double pressure, double temperature) {
        this.humidness = humidness;
        this.pressure = pressure;
        this.temperature = temperature;
        this.notifyObs();
    }


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {

        observers.remove(observer);

    }

    @Override
    public void notifyObs() {
        for (Observer observer : observers) {
            observer.update(this.getHumidness(),this.getPressure(),this.getTemperature());
        }
    }
}
