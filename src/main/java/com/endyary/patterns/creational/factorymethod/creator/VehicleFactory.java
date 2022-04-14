package com.endyary.patterns.creational.factorymethod.creator;

import com.endyary.patterns.creational.factorymethod.product.Vehicle;

public abstract class VehicleFactory {
    public abstract Vehicle create();

    public Vehicle createAndDrive() {
        System.out.println("First create...");
        Vehicle vehicle = create();

        System.out.println("then sell, and now...");
        vehicle.drive();

        return vehicle;
    }
}
