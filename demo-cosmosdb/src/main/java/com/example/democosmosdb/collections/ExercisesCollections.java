package com.example.democosmosdb.collections;

import java.util.*;

public class ExercisesCollections {
    public static void main(String[] args) {
        //aqui veremos la diferencia entre las busquedas de cada una

        // Creamos un millón de datos
        List<String> listaArrayList = new ArrayList<>();
        Set<String> conjuntoHashSet = new HashSet<>();

        for (int i = 0; i < 1000000; i++) {
            String id = "ID-" + i;
            listaArrayList.add(id);
            conjuntoHashSet.add(id);
        }

        String objetivo = "ID-999999"; // El último elemento

        // --- Búsqueda en ArrayList ---
        long inicioAL = System.nanoTime();
        listaArrayList.contains(objetivo);
        long finAL = System.nanoTime();
        System.out.println("ArrayList tardó: " + (finAL - inicioAL) + " nanosegundos");

        // --- Búsqueda en HashSet ---
        long inicioHS = System.nanoTime();
        conjuntoHashSet.contains(objetivo);// mas rapido ya que usa el HashCode
        long finHS = System.nanoTime();
        System.out.println("HashSet tardó:   " + (finHS - inicioHS) + " nanosegundos");



        //como es bueno sobreescribir el equal y el hashCode porque van de la mano
        // veamos un ejemplo con HashSet

        Set<Person> club = new HashSet<>();
        Person p1 = new Person("70221978", "Paul Kyev");
        Person p2 = new Person("70221978", "Paul Kyev");

        club.add(p1);
        club.add(p2);

        System.out.println(club.size());// en teoria no deberia agregar el p2 ya que son lo mismo pero sin el EqualAndHashCode si lo agrega ya que compara instancias en memoria
        //agregando @EqualsAndHashCode veras que solo agregar una persona (p1)


        // ahora veremos como pasamos de O(n2) a O(n)
        // en una lista de numeros determinar si hay dos numeros que suman 10 (true o false)
        int[] lists = new int[]{1,2,3,10,5};
        System.out.println(sumaTenTrue(lists));

        //tienes un cojuntos de IDs, determinar si hay IDs duplicados
        int[] ids = new int[]{1,2,3,10,5,20,30,45,4,89,-9};
        System.out.println("yes or no?: "+ thereAreDuplicateIDs(ids));

        // Dada una cadena de texto (por ejemplo: "google"), debes encontrar el primer carácter que no se repite en todo el string.
        System.out.println(notRepit("vivido"));

        //int[] unorderedList = new int[]{5,1,3,4,7,9,6,8,14,35,68,11};
        List<Integer> unorderedList = List.of(5,1,3,4,7,9,6,8,14,35,68,11);
        List<Integer> nl = unorderedList.stream().sorted().toList();
        System.out.println(nl);
    }

    private static Boolean sumaTenTrue(int [] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int n : nums){
            int com = 10 - n;
            if (seen.contains(com)){ // este O(1)
                return true;
            }
            seen.add(n);
        }
        return false;
    }

    private static char notRepit(String word) {
        Map<Character,Integer> count = new HashMap<>();
        for (char w: word.toCharArray()){
            count.put(w,count.getOrDefault(w,0)+1);
        }
        for (char w: word.toCharArray()){
            if (count.get(w)==1){
                return w;
            }
        }
        return '_';
    }

    private static boolean thereAreDuplicateIDs(int[] ids) {
        Set<Integer> idsClean = new HashSet<>();
        for (int n : ids){
            if (idsClean.contains(n)){
                return true;
            }
            idsClean.add(n);
        }
        return false;
    }
}
