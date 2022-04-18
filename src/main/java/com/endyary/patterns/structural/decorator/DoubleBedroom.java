package com.endyary.patterns.structural.decorator;

public class DoubleBedroom extends Room {
    @Override
    public String description() {
        return "Double Bedroom";
    }

    @Override
    public double cost() {
        return 80;
    }
}
