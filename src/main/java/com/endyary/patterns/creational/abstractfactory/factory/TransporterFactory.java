package com.endyary.patterns.creational.abstractfactory.factory;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.CargoTransport;
import com.endyary.patterns.creational.abstractfactory.abstractproduct.PersonalTransport;

public interface TransporterFactory {

    CargoTransport createCargoTransport();

    PersonalTransport createPersonalTransport();
}
