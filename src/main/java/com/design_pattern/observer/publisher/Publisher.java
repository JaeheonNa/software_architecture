package com.design_pattern.observer.publisher;

import com.design_pattern.observer.subscriber.ForecastDisplay;
import com.design_pattern.observer.subscriber.Subscriber;

public interface Publisher {
    void removeSubscriber(Subscriber subscriber);
    void addSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
