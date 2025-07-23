package com.example.democosmosdb.pattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    private static final Map<String, Supplier<Snack>> MAP = new HashMap<>();

    static {
        MAP.put("Drink",Drink::new);
        MAP.put("Chips",() -> new Chips());
        MAP.put("ChocolateBar",ChocolateBar::new);
    }

    Snack getSnack(String snackType) {
        if (MAP.get(snackType) != null){
            return MAP.get(snackType).get();
        }
        throw new IllegalArgumentException("illegal snack type");
    }


}
