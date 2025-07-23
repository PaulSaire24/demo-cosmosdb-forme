package com.example.democosmosdb.patternexercises.exercises4;

public class Milk implements CoffeDecoration {
    private final CoffeDecoration coffeDecoration;

    public Milk(CoffeDecoration coffeDecoration) {
        this.coffeDecoration = coffeDecoration;
    }

    @Override
    public String getDescription() {
        return coffeDecoration.getDescription() +" Milk";
    }

    @Override
    public Double getPrice() {
        return coffeDecoration.getPrice()+1.0;
    }
}
