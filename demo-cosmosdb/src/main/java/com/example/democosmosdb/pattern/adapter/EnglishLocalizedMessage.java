package com.example.democosmosdb.pattern.adapter;

public class EnglishLocalizedMessage implements LocalizedMessage {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
