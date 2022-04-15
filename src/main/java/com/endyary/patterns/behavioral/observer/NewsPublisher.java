package com.endyary.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private final List<Subscriber> subscribers;

    public NewsPublisher() {
        subscribers = new ArrayList<Subscriber>();
    }

    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unregisterSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifyAll(String news) {
        subscribers.forEach(s -> s.update(news));
    }

    public void publishNew(String news) {
        System.out.println("Publishing: " + news);
        notifyAll(news);
    }

}
