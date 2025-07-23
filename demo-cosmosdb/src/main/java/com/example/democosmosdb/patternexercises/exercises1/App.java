package com.example.democosmosdb.patternexercises.exercises1;

import java.util.List;

public class App {
    public static void main(String[] args) {
       /* Tienes una clase DataProcessor que procesa una lista de números enteros. Según los requisitos, debe aplicar diferentes filtros (ej: filtrar pares, mayores que 10, primos, etc.).
        Requisitos:

        El filtrado debe poder cambiarse en tiempo de ejecución.

        Evitar usar if-else o switch para seleccionar el filtro.

        Debe ser fácil añadir nuevos filtros sin modificar DataProcessor.*/

        //se aplico para la solucion el patron strategy
        List<Integer> lis =  List.of(1,2,3,4,5,6,7,8,9,10,11);
        DataProcessor dataProcessor =  new DataProcessor();
        dataProcessor.setFilterStrategy(new FilterStrategyPairs()); //asigno la estrategia
        System.out.println(dataProcessor.getFilter(lis));

        dataProcessor.setFilterStrategy(new FilterStrategyPrimes()); // cambio la estrategia
        System.out.println(dataProcessor.getFilter(lis));

        dataProcessor.setFilterStrategy(new FIlterGreaterThan10()); // cambio la estrategia
        System.out.println(dataProcessor.getFilter(lis));
    }
}
