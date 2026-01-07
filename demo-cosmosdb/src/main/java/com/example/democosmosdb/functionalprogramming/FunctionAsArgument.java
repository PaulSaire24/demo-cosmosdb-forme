package com.example.democosmosdb.functionalprogramming;

import java.util.function.BiFunction;

public class FunctionAsArgument {
    public static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }

        public static Integer subtract(Integer x, Integer y) {
            return x - y;
        }

        public static Integer ap2and3(BiFunction<Integer,Integer,Integer> funcArg) {
            return funcArg.apply(2,3);
        }
    }

    public static void main(String[] args) {

        System.out.println(MyMath.ap2and3(MyMath::add));
        System.out.println(MyMath.ap2and3(MyMath::subtract));
        System.out.println(MyMath.ap2and3((x , y) -> x*2 + y* 3));
    }
}
