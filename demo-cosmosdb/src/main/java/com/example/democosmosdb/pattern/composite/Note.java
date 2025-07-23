package com.example.democosmosdb.pattern.composite;

public class Note implements MusicalCompositeService {

    private final char value;

    public Note(char value) {
        this.value = value;
    }

    @Override
    public void play() {
        System.out.println(value);
    }

}