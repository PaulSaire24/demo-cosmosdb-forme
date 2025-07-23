package com.example.democosmosdb.patternexercises.exercises2;

public class Sms implements SendNotification{

    private SendNotification sendNotification;

    public Sms(SendNotification sendNotification) {
        this.sendNotification = sendNotification;
    }

    @Override
    public void sent(String message) {
        sendNotification.sent(message);
        System.out.println("message sent by sms: " + message);
    }

    @Override
    public Integer getPrice() {

        return sendNotification.getPrice() + 20;
    }
}
