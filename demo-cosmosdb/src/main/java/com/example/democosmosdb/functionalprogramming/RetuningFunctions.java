package com.example.democosmosdb.functionalprogramming;

import java.util.function.Function;

public class RetuningFunctions {
    public static class MyMath {
        public static Integer timeTwo(Integer x) {
            return x*2;
        }

        public static Integer timeThree(Integer x) {
            return x*3;
        }

        public static Integer timeFour(Integer x) {
            return x*4;
        }

        public static Function<Integer, Integer> createMultiplier(Integer x) { //aqui espera como retorno una funcion
            return (Integer y) -> x*y; //justo aqui estas devolviendo una funcion
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> two = MyMath.createMultiplier(2); // asignas la funcion
        Function<Integer, Integer> three = MyMath.createMultiplier(3);
        Function<Integer, Integer> four = MyMath.createMultiplier(4);

        System.out.println(two.apply(6)); // aplicas la funcion recibida arriba y lo aplicas con el argumento 6
        System.out.println(three.apply(6));
        System.out.println(four.apply(6));

        /// ///////////

        NoArgFunction<NoArgFunction<String>> gree = () -> () -> "hello Paul";

        NoArgFunction<String> getGree =  gree.apply();

        System.out.println(getGree.apply());
    }
}
