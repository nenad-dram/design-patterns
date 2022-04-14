package com.endyary.patterns.creational.factorymethod.creator;

import com.endyary.patterns.creational.factorymethod.product.Truck;
import com.endyary.patterns.creational.factorymethod.product.Vehicle;

public class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Truck();
    }
}
