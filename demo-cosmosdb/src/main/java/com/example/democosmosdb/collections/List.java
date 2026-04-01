package com.example.democosmosdb.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        // los arraylist son rapido para consulta (for, forEach,etc) pero lento con las inserciones
        //permite elementos duplicados
        java.util.List<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Paul");
        names.remove(1); // al eliminar este se corre noma todo, juana ahora seria del indice 1
        names.add("Juana");
        names.add("Remino");

//        for (int i = 0; i<names.size(); i++) {
//            System.out.println(i + ": " + names.get(i));
//        }

        //muy rapido para eliminar y guardar elementos, lento en las consultas
        // permite elementos repetidos
        LinkedList<String> namesLinked = new LinkedList<>();

        namesLinked.add("Juan");
        namesLinked.add("Remiro");
        namesLinked.add("Max");
        namesLinked.addFirst("Pedro");
        namesLinked.addLast("Gillian");
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

        System.out.println(urls.getFirst());
        System.out.println(urls.getLast());
    }
}
