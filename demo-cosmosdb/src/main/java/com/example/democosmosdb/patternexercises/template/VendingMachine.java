package com.example.democosmosdb.patternexercises.template;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    public static final Map<String, Supplier<MakePizza>> MAP = new HashMap<>();

    static {
        MAP.put("vegetarian", () -> new VegetarianPizza());
        MAP.put("hawai", HawaiPizza::new);
    }

    public void purchasePizza(String pizzaType) {
        if(MAP.get(pizzaType) != null) {
            MakePizza pizza =  MAP.get(pizzaType).get();
            pizza.preparePizza();
        } else {
            throw new IllegalArgumentException("the pizza type dont exist");
        }
    }
}
