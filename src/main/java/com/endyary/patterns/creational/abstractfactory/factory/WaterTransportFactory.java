package com.endyary.patterns.creational.abstractfactory.factory;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.CargoTransport;
import com.endyary.patterns.creational.abstractfactory.abstractproduct.PersonalTransport;
import com.endyary.patterns.creational.abstractfactory.product.Boat;
import com.endyary.patterns.creational.abstractfactory.product.CargoShip;

public class WaterTransportFactory implements TransporterFactory {

    private WaterTransportFactory() {
    }

    public static WaterTransportFactory create() {
        return new WaterTransportFactory();
    }

    @Override
    public CargoTransport createCargoTransport() {
        return CargoShip.create();
    }

    @Override
    public PersonalTransport createPersonalTransport() {
        return Boat.create();
    }
}
