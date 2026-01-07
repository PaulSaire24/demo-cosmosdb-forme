package com.example.democosmosdb.patternexercises.exercises7;

public class Button implements UIComponent {

    @Override
    public void render() {
        System.out.println("Button method render");
    }

    @Override
    public void handleClick() {
        System.out.println("Button method handleClick");
    }
}
