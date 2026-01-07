package com.example.democosmosdb.patternexercises.exercises7;

public class Text implements UIComponent {

    @Override
    public void render() {
        System.out.println("Text method handleClick");
    }

    @Override
    public void handleClick() {
        System.out.println("Text method handleClick");
    }
}
