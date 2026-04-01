package com.example.democosmosdb.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TypeMaps {

    public static void main(String[] args) {
        //maneja el clave valor (key-value)

        //HashMap
        //mas rapido
        //laves unicas (key)
        //si puede haber valores repetidos (value)
        Map<String,Double> carrito = new HashMap<>();
        carrito.put("Manzanas", 2.50);
        carrito.put("Pan", 1.20);
        carrito.put("Café", 5.00);

        //intertar repetir una llave

        carrito.put("Pan", 3.4); // sobreescribe el precio o lo chanca

        if (carrito.containsKey("Pan")){ //verificar si existe la llave
            System.out.println("Si hay pan!: " + carrito.get("Pan"));
        }

        //System.out.println(carrito);

        //TreeMap
        //Ordena las llaves de forma natural (ej: de la A a la Z o de menor a mayor)
        //mas lento

        //exercises
        //Map<String, Integer> mapLeng =  new HashMap<>();
        List<String> lenguages = List.of("java", "python", "java", "c++", "java", "python");

        Map<String, Long> mapLeng = lenguages.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        System.out.println(mapLeng);
    }
}
