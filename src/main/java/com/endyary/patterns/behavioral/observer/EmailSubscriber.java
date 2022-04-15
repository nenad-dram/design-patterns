package com.endyary.patterns.behavioral.observer;

public class EmailSubscriber implements Subscriber {
    @Override
    public void update(String news) {
        System.out.println("EmailSubscriber updated with: " + news);
    }
}
