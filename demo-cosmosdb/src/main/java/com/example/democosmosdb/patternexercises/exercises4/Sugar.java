package com.example.democosmosdb.patternexercises.exercises4;

public class Sugar implements CoffeDecoration {
    private final CoffeDecoration coffeDecoration;

    public Sugar(CoffeDecoration coffeDecoration) {
        this.coffeDecoration = coffeDecoration;
    }

    @Override
    public String getDescription() {
        return coffeDecoration.getDescription() +" sugar";
    }

    @Override
    public Double getPrice() {
        return coffeDecoration.getPrice()+1.5;
    }
}
