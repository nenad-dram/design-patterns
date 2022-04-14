package com.endyary.patterns.creational.factorymethod.product;

public class Bus implements Vehicle {
    
    @Override
    public void drive() {
        System.out.println("Driving a bus...");
    }
}
