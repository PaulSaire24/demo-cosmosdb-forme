package com.example.democosmosdb.patternexercises.exercises2;

public class EmptyNotifier implements SendNotification{
    @Override
    public void sent(String message) {
        System.out.println("base message: " + message);
    }

    @Override
    public Integer getPrice() {
        return 0;
    }
}
