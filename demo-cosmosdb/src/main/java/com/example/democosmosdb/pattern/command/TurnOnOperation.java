package com.example.democosmosdb.pattern.command;

public class TurnOnOperation implements LightOperations {

    private final Light light;

    public  TurnOnOperation(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOnLight();
    }
}
