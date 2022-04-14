package com.endyary.patterns.creational.abstractfactory.product;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.CargoTransport;

public class CargoShip implements CargoTransport {

    private CargoShip() {
    }

    public static CargoShip create() {
        return new CargoShip();
    }

    @Override
    public void transport() {
        System.out.println("Cargo transport by a truck");
    }
}
