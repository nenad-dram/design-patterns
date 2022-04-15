package com.endyary.patterns.behavioral.strategy;

public class PersonalDelivery implements DeliveryMethod {
    @Override
    public void deliver() {
        System.out.println("PersonalDelivery strategy");
    }
}
