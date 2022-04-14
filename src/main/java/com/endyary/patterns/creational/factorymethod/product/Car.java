package com.endyary.patterns.creational.factorymethod.product;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
