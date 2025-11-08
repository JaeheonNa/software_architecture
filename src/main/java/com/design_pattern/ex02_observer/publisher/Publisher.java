package com.design_pattern.ex02_observer.publisher;

import com.design_pattern.ex02_observer.subscriber.Subscriber;

public interface Publisher {
    void removeSubscriber(Subscriber subscriber);
    void addSubscriber(Subscriber subscriber);
    void notifySubscribers();
}
