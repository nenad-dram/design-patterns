package com.endyary.patterns.creational.singleton;

public class Singleton {
    private final double value;
    private static volatile Singleton instance;

    private Singleton(double value) {
        this.value = value;
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(Math.random());
            }
        }
        return instance;
    }

    public double getValue() {
        return value;
    }
}
