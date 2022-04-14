package com.endyary.patterns.creational.abstractfactory.product;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.CargoTransport;

public class Truck implements CargoTransport {

    private Truck() {
    }

    public static Truck create() {
        return new Truck();
    }

    @Override
    public void transport() {
        System.out.println("Cargo transport by a truck");
    }
}
