package com.design_pattern.observer;

import com.design_pattern.observer.subscriber.CurrentConditionDisplay;
import com.design_pattern.observer.subscriber.ForecastDisplay;
import com.design_pattern.observer.subscriber.StatisticsDisplay;
import com.design_pattern.observer.publisher.WeatherData;

public class ObserverPattern {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay staticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        System.out.println();
        weatherData.removeSubscriber(forecastDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(88, 70, 29.2f);
        weatherData.setMeasurements(70, 90, 29.2f);

        System.out.println();
        weatherData.removeSubscriber(staticsDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(88, 70, 29.2f);
        weatherData.setMeasurements(70, 90, 29.2f);
    }
}
