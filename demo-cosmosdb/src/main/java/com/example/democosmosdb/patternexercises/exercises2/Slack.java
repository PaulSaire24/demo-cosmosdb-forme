package com.example.democosmosdb.patternexercises.exercises2;

public class Slack implements SendNotification{

    private SendNotification sendNotification;

    public Slack(SendNotification sendNotification) {
        this.sendNotification = sendNotification;
    }

    @Override
    public void sent(String message) {
        sendNotification.sent(message);
        System.out.println("message sent by slack: " + message);
    }

    @Override
    public Integer getPrice() {
        return sendNotification.getPrice() + 15;
    }
}
