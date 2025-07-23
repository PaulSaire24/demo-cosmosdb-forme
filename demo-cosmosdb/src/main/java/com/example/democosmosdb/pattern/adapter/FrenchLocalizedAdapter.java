package com.example.democosmosdb.pattern.adapter;

public class FrenchLocalizedAdapter extends FrenchLocalizedMessage implements LocalizedMessage{

    @Override
    public void sayHello() {
        sayBonjour();
    }
    @Override
    public void sayBonjour() {
        System.out.println("Bonjour...");
    }
}
