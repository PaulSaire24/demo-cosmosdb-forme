package com.example.democosmosdb.functionalprogramming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> original = List.of(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> even = original.stream()
                                    .filter(isEven).collect(Collectors.toList());

        System.out.println(even);

        //ahora vemos lo que siempre hacemos y veremos la diferencia
        List<Integer> even2 = original.stream()
                .filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println(even2);


        // otro ejemplo
        List<String> original2 = List.of("hello","functional","programming","is","cool");
        List<String> even3 = original2.stream()
                .filter(x -> x.length()>5).collect(Collectors.toList());

        System.out.println(even3);

        //veamos como personalizar nuestro predicate para hacerlo dinamico

        Function<Integer, Predicate<String>> teens = miLegth -> x -> x.length() > miLegth;

        List<String> even4 = original2.stream()
                .filter(teens.apply(4)).collect(Collectors.toList());

        System.out.println(even4);

        //o tambien, que seria lo mismo

        Predicate<String> apply4 = teens.apply(4);
        List<String> even5 = original2.stream()
                .filter(apply4).collect(Collectors.toList());

        System.out.println(even5);
    }
}
