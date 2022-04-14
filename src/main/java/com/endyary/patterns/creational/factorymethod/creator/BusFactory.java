package com.endyary.patterns.creational.factorymethod.creator;

import com.endyary.patterns.creational.factorymethod.product.Bus;
import com.endyary.patterns.creational.factorymethod.product.Vehicle;

public class BusFactory extends VehicleFactory {
    @Override
    public Vehicle create() {
        return new Bus();
    }
}
