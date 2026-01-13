package com.example.democosmosdb.solid.incorrectoBird;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("the penguin can´t fly");
    }
}
