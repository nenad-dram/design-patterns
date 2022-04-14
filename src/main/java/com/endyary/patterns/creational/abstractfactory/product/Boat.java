package com.endyary.patterns.creational.abstractfactory.product;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.PersonalTransport;

public class Boat implements PersonalTransport {

    private Boat() {
    }

    public static Boat create() {
        return new Boat();
    }

    @Override
    public void transport() {
        System.out.println("Personal transport by a boat");
    }
}
