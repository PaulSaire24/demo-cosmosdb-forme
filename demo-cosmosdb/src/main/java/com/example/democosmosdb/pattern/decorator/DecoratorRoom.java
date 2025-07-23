package com.example.democosmosdb.pattern.decorator;

public abstract class DecoratorRoom implements Room {
    private final Room room;

    protected DecoratorRoom(Room room) {
        this.room = room;
    }

    @Override
    public void printFurniture() {
        this.room.printFurniture();
    }
}
