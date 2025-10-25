package com.design_pattern.observer.subscriber;

import com.design_pattern.observer.publisher.WeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ForecastDisplay implements Subscriber, Display{

    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.addSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        List<String> forecastList = new ArrayList<>();
        forecastList.add("Improving weather on the day!");
        forecastList.add("Watch out for cooler, rainy weather!");
        forecastList.add("More of the same!");
        int i = (int) (Math.random() * forecastList.size());
        System.out.println("Forcast: [ " + forecastList.get(i) + "]");
    }
}
