package com.example.democosmosdb.pattern.template;

public class MeatFeastPizza extends MakePizza {

    @Override
    public void addToppings() {
        System.out.println("Add pepperoni, ham and chicken" );
    }

}
