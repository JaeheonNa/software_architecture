package com.design_pattern.observer.subscriber;

import com.design_pattern.observer.publisher.Publisher;
import com.design_pattern.observer.publisher.WeatherData;

public class CurrentConditionDisplay implements Subscriber, Display{
    private Publisher weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public CurrentConditionDisplay(Publisher weatherData){
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
        System.out.println("Current Temperature: [" + this.temperature + "F] degrees and Humidity: [" + this.humidity + "%]");
    }
}
