package com.example.democosmosdb.patternexercises.builder;

public class App {

    public static void main(String[] args) {
        Person p =  new Person.Builder()
                .name("Paul")
                .lastName("Saire")
                .build();
        System.out.println(p);

    }
}
