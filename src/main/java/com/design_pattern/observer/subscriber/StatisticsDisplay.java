package com.design_pattern.observer.subscriber;

import com.design_pattern.observer.publisher.Publisher;
import com.design_pattern.observer.publisher.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Subscriber, Display{

    private List<Float> temperatureList;
    private float humidity;
    private float pressure;
    private Publisher weatherData;
    public StatisticsDisplay(Publisher weatherData){
        this.weatherData = weatherData;
        this.temperatureList = new ArrayList<>();
        this.weatherData.addSubscriber(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatureList.add(temperature);
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        float max = temperatureList.get(0);
        float min = temperatureList.get(0);
        float sum = 0;
        for(Float temp : temperatureList){
            if (temp > max) max = temp;
            if (temp < min) min = temp;
            sum += temp;
        }
        float avg = sum / temperatureList.size();

        System.out.println("Avg/Max/Min Temperature : [" + avg + "/" + max + "/" + min +"]");
    }
}
