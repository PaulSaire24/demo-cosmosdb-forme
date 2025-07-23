package com.example.democosmosdb.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class ExecuterOperationLight {

    private List<LightOperations> lightList =  new ArrayList<>();

    public void executeLight(LightOperations lightOperations) {
        lightOperations.execute();
    }

    /*public void queu(LightOperations lightOperations) {
        lightList.add(lightOperations);
    }

    public void executeLight() {
        lightList.forEach(LightOperations::execute);
        lightList.clear();
    }*/
}
