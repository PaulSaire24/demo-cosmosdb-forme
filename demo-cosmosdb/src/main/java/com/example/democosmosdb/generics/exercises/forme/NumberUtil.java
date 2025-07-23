package com.example.democosmosdb.generics.exercises.forme;

import java.util.List;
import java.util.stream.Collectors;

public class NumberUtil {

    public static <T extends Number> List<T> sortedList(OperationNumbers<T> op) {
        return op.getNumbers().stream().sorted().collect(Collectors.toList());
    }

    public static <T extends Number> Long maxValue(OperationNumbers<T> op) {
        return op.getNumbers().stream()
                .mapToLong(Number::longValue) // Convertimos cada Number a double
                .max()
                .orElseThrow(() -> new IllegalArgumentException("La lista está vacía")); // Lanzamos una excepción si la lista está vacía
    }
}
