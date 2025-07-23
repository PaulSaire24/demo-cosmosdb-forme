package com.example.democosmosdb.pattern.template;

public class VegetarianPizza extends MakePizza{

    @Override
    public void addToppings() {
        System.out.println("Add cheese, tomato, mushrooms, peppers and olives" );
    }

}
