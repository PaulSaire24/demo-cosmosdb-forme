package com.example.democosmosdb.pattern.command;

public class TurnOffOperation implements LightOperations {
    private final Light light;

    public TurnOffOperation(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOffLight();
    }
}
