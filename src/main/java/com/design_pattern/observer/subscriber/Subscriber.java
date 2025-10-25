package com.design_pattern.observer.subscriber;

public interface Subscriber {
    void update(float temperature, float humidity, float pressure);
}
