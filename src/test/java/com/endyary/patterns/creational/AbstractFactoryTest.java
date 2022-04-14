package com.endyary.patterns.creational;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.CargoTransport;
import com.endyary.patterns.creational.abstractfactory.abstractproduct.PersonalTransport;
import com.endyary.patterns.creational.abstractfactory.factory.FactoryMaker;
import com.endyary.patterns.creational.abstractfactory.factory.TransporterFactory;
import com.endyary.patterns.creational.abstractfactory.product.Boat;
import com.endyary.patterns.creational.abstractfactory.product.Truck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    void transporterFactoryTest() {
        TransporterFactory factoryRoad = FactoryMaker.getFactory(FactoryMaker.Surface.ROAD);
        TransporterFactory factoryWater = FactoryMaker.getFactory(FactoryMaker.Surface.WATER);

        CargoTransport roadCargo = factoryRoad.createCargoTransport();
        PersonalTransport waterPersonal = factoryWater.createPersonalTransport();

        Assertions.assertTrue(roadCargo instanceof Truck);
        Assertions.assertTrue(waterPersonal instanceof Boat);
    }
}
