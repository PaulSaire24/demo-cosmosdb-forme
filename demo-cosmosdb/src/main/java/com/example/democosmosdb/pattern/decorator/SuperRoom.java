package com.example.democosmosdb.pattern.decorator;

public class SuperRoom extends DecoratorRoom{
    protected SuperRoom(Room room) {
        super(room);
    }

    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("table");
    }
}
