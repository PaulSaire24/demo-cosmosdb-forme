package com.example.democosmosdb.generics.exercises.forme;

import java.util.List;

public class AppGenericNumberOperations {
    public static void main(String[] args) {

        List<Long> longNumbers = List.of(40L, 21L, 3L, 17L, 45L);

        OperationNumbers<Long> operationNumbers = new OperationNumbers<>();

        operationNumbers.setNumbers(longNumbers);

        System.out.println("list of numeber sorted: " + NumberUtil.sortedList(operationNumbers));
        System.out.println("max value of number: " + NumberUtil.maxValue(operationNumbers));

    }
}
