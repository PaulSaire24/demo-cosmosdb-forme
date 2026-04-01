package com.example.democosmosdb.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {

    public static void main(String[] args) {
    //los List es como una cola donde el orden importa
    // los Set es un club exclusivo donde no se permite duplicados (principal caracteristica) y donde no importa el orden de llegada

        //HashSet muy rapido para guardar eliminar y consultar
        Set<String> club =  new HashSet<>();

        club.add("Carlos");
        club.add("Ana");
        club.add("Beto");
        club.add("Ana"); // ¡Duplicado! Java simplemente lo ignorará.

        //System.out.println(club); //veras que imprime desordenado

        //TreeSet este ordena la collections ya se orden alfabetico o numero o uno personalizado
        //es mad lento que el hashSet porque tiene que acomodar todo en cada agregacion

        Set<String> gues =  new TreeSet<>();
        gues.add("pedro");
        gues.add("Juan");
        gues.add("Juan"); // veras como lo ignora por duplicidad
        gues.add("kyev");

        //System.out.println(gues); // veras como imprime en orden alfabetico

        //Exercises

        Set<Integer> nums =  new HashSet<>();
        nums.add(10);
        nums.add(25);
        nums.add(10);
        nums.add(5);
        nums.add(8);
        nums.add(25);
        nums.add(30);

        System.out.println(nums.size());
        System.out.println(nums); //veras que imprime en orden numero de menor a mayor

    }
}
