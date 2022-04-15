package com.endyary.patterns.behavioral.strategy;

public class ShopPickup implements DeliveryMethod {
    @Override
    public void deliver() {
        System.out.println("ShopPickup strategy");
    }
}
