package com.endyary.patterns.creational.factorymethod.product;

public class Truck implements Vehicle {
    
    @Override
    public void drive() {
        System.out.println("Driving a truck...");
    }
}
