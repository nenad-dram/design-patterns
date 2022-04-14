package com.endyary.patterns.creational;

import com.endyary.patterns.creational.singleton.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonTest {

    @Test
    void threadSafeTest() {
        try {
            class RunnableOne implements Runnable {
                private double value;

                public void run() {
                    value = Singleton.getInstance().getValue();
                }

                public double getValue() {
                    return value;
                }
            }
            
            RunnableOne runOne = new RunnableOne();
            RunnableOne runTwo = new RunnableOne();
            Thread threadOne = new Thread(runOne);
            Thread threadTwo = new Thread(runTwo);
            threadOne.start();
            threadTwo.start();
            threadOne.join();
            threadTwo.join();

            assertEquals(runOne.getValue(), runTwo.getValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
