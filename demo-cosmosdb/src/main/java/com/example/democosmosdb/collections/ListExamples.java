package com.example.democosmosdb.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExamples {
    public static void main(String[] args) {
        //importa la posicion y permite elementos duplicdos

        //arraylist:
        // los arraylist son rapido para leer (ojo leer por posicion, osea por indice) datos rápidamente(for, forEach,etc) pero lento con las inserciones y eliminaciones
        List<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Paul");
        names.remove(1); // al eliminar este se corre noma todo, juana ahora seria del indice 1
        names.add("Juana");
        names.add("Remino");

        for (int i = 0; i<names.size(); i++) {
            if (names.get(i).equals("Juana")){
                names.remove(i);
            }
        } // este seria eliminar con un for

//        List<String> newNames = names.stream().filter(p -> !"Juana".equals(p)).toList(); //este seria la forma de eliminar con stream
//        System.out.println(newNames);



        //LinkedList:
        //muy rapido para eliminar y guardar elementos, lento para buscar un dato en especifico, usan punteros internamente
        LinkedList<String> namesLinked = new LinkedList<>();

        namesLinked.add("Juan");
        namesLinked.add("Remiro");
        namesLinked.add("Max");
        namesLinked.addFirst("Pedro"); // este metodo solo lo tiene el linkedList
        namesLinked.addLast("Gillian"); // este metodo solo lo tiene el linkedList
        namesLinked.add("Julian");

//        for (int i = 0; i<namesLinked.size(); i++) {
//            System.out.println(i + ": " + namesLinked.get(i));
//        }

        //exercises

        LinkedList<String> urls = new LinkedList<>();
        urls.add("https://www.google.com/search?q=google.com");
        urls.add("github.com");
        urls.add("stackoverflow.com");
        urls.addFirst("youtube.com");

//        System.out.println(urls.getFirst());
//        System.out.println(urls.getLast());
    }
}
