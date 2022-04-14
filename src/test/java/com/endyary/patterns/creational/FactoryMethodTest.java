package com.endyary.patterns.creational;

import com.endyary.patterns.creational.factorymethod.creator.CarFactory;
import com.endyary.patterns.creational.factorymethod.creator.TruckFactory;
import com.endyary.patterns.creational.factorymethod.creator.VehicleFactory;
import com.endyary.patterns.creational.factorymethod.product.Car;
import com.endyary.patterns.creational.factorymethod.product.Truck;
import com.endyary.patterns.creational.factorymethod.product.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    void vehicleFactoryTest() {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();

        Vehicle car = carFactory.createAndDrive();
        Vehicle truck = truckFactory.createAndDrive();

        Assertions.assertTrue(car instanceof Car);
        Assertions.assertTrue(truck instanceof Truck);
    }
}
