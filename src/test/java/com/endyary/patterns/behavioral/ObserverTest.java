package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.observer.AppSubscriber;
import com.endyary.patterns.behavioral.observer.EmailSubscriber;
import com.endyary.patterns.behavioral.observer.NewsPublisher;
import com.endyary.patterns.behavioral.observer.Subscriber;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void newsPublisherTest() {
        Subscriber emailSubscriber = new EmailSubscriber();
        Subscriber appSubscriber = new AppSubscriber();

        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.registerSubscriber(emailSubscriber);
        newsPublisher.registerSubscriber(appSubscriber);

        newsPublisher.publishNew("We have something new to publish...");
    }
}
