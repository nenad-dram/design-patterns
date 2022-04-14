package com.endyary.patterns.creational.abstractfactory.factory;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.CargoTransport;
import com.endyary.patterns.creational.abstractfactory.abstractproduct.PersonalTransport;
import com.endyary.patterns.creational.abstractfactory.product.Car;
import com.endyary.patterns.creational.abstractfactory.product.Truck;

public class RoadTransportFactory implements TransporterFactory {

    private RoadTransportFactory() {
    }

    public static RoadTransportFactory create() {
        return new RoadTransportFactory();
    }

    @Override
    public CargoTransport createCargoTransport() {
        return Truck.create();
    }

    @Override
    public PersonalTransport createPersonalTransport() {
        return Car.create();
    }
}
