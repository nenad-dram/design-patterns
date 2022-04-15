package com.endyary.patterns.behavioral.strategy;

public class Order {
    private DeliveryMethod delivery;

    public Order(DeliveryMethod delivery) {
        this.delivery = delivery;
    }

    public DeliveryMethod getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryMethod delivery) {
        this.delivery = delivery;
    }

    public void doDelivery() {
        delivery.deliver();
    }

}
