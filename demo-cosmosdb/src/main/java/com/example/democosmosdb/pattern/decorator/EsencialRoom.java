package com.example.democosmosdb.pattern.decorator;

public class EsencialRoom extends DecoratorRoom{
    protected EsencialRoom(Room room) {
        super(room);
    }

    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("couch");
    }
}
