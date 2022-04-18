package com.endyary.patterns.structural.decorator;

public class PetFee extends RoomDecorator {

    public PetFee(Room room) {
        this.room = room;
    }

    @Override
    public String description() {
        return this.room.description() + ", Pet Fee";
    }

    @Override
    public double cost() {
        return this.room.cost() + 15;
    }
}
