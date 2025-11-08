package com.design_pattern.ex02_observer.subscriber;

import com.design_pattern.ex02_observer.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Subscriber, Display{

    private Publisher weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public ForecastDisplay(Publisher weatherData){
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
