package com.endyary.patterns.creational.factorymethod.creator;

import com.endyary.patterns.creational.factorymethod.product.Car;
import com.endyary.patterns.creational.factorymethod.product.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Car();
    }
}
