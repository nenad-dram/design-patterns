package com.endyary.patterns.structural.decorator;

public class ParingLot extends RoomDecorator {

    public ParingLot(Room room) {
        this.room = room;
    }

    @Override
    public String description() {
        return this.room.description() + ", Parking Lot";
    }

    @Override
    public double cost() {
        return this.room.cost() + 20;
    }
}
