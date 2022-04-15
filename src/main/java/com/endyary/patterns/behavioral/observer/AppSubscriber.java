package com.endyary.patterns.behavioral.observer;

public class AppSubscriber implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("AppSubscriber updated with: " + news);
    }
}
