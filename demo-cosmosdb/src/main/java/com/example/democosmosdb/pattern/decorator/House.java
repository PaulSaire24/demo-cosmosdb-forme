package com.example.democosmosdb.pattern.decorator;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        // create a room with a carpet and a couch
        EsencialRoom esencialRoom = new EsencialRoom(room);
        esencialRoom.printFurniture();

        System.out.println();

        // create a room with a carpet, a couch and a table

        SuperRoom superRoom =  new SuperRoom(esencialRoom);
        superRoom.printFurniture();

    }

}
