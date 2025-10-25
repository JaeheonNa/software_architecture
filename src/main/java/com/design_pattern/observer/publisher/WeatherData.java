package com.design_pattern.observer.publisher;

import com.design_pattern.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {
    private List<Subscriber> subscriberList;
    private float temperature;

    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData(){
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        int i = subscriberList.indexOf(subscriber);
        if(i>=0) {
            subscriberList.remove(i);
        }
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    public void setMeasurements(int temperature, int humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    private void measurementsChanged() {
        this.notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber : subscriberList) {
            subscriber.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
