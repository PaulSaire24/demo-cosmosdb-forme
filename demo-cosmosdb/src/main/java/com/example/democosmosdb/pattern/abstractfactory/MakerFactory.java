package com.example.democosmosdb.pattern.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MakerFactory {

    public static final Map<String , Supplier<UserInterfaceFactory>> MAP = new HashMap<>();

    static {
        MAP.put("RED",CreateRedUserInterface::new);
        MAP.put("BLUE",CreateBlueUserInterface::new);
    }

    public static UserInterfaceFactory getUser(String color) {
        if (MAP.get(color) != null) {
            return MAP.get(color).get();
        }
        throw new IllegalArgumentException("color not supported");
    }
}
