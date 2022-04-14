package com.endyary.patterns.creational.abstractfactory.product;

import com.endyary.patterns.creational.abstractfactory.abstractproduct.PersonalTransport;

public class Car implements PersonalTransport {

    private Car() {
    }

    public static Car create() {
        return new Car();
    }

    @Override
    public void transport() {
        System.out.println("Personal transport by a car");
    }
}
