package com.example.democosmosdb.pattern.command;

public class App {

    public static void main(String[] args) {
        var light = new Light();

        ExecuterOperationLight executerOperationLight =  new ExecuterOperationLight();
        /*executerOperationLight.executeLight(new TurnOnOperation(light));
        executerOperationLight.executeLight(new TurnOffOperation(light));

        executerOperationLight.executeLight();*/




        light.isOn();
        executerOperationLight.executeLight(new TurnOnOperation(light));
        light.isOn();
        executerOperationLight.executeLight(new TurnOffOperation(light));
        light.isOn();
    }

}
