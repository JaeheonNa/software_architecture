package com.design_pattern.ex02_observer.subscriber;

public interface Subscriber {
    void update(float temperature, float humidity, float pressure);
}
