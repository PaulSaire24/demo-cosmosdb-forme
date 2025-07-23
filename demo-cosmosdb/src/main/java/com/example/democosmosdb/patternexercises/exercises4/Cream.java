package com.example.democosmosdb.patternexercises.exercises4;

public class Cream implements CoffeDecoration{
    private final CoffeDecoration coffeDecoration;

    public Cream(CoffeDecoration coffeDecoration) {
        this.coffeDecoration = coffeDecoration;
    }


    @Override
    public String getDescription() {
        return coffeDecoration.getDescription() +" Cream";
    }

    @Override
    public Double getPrice() {
        return coffeDecoration.getPrice()+1.0;
    }
}
