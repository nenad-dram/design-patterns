package com.endyary.patterns.structural.decorator;

public class Suite extends Room {
    @Override
    public String description() {
        return "Suite";
    }

    @Override
    public double cost() {
        return 150;
    }
}
