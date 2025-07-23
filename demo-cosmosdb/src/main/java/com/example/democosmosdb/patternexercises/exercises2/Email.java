package com.example.democosmosdb.patternexercises.exercises2;

public class Email implements SendNotification {

    private final SendNotification sendNotification;

    public Email(SendNotification sendNotification) {
        this.sendNotification = sendNotification;
    }

    @Override
    public void sent(String message) {
        sendNotification.sent(message);
        System.out.println("Message by email: " + message);
    }

    @Override
    public Integer getPrice(){
        return sendNotification.getPrice() + 10;
    }
}
