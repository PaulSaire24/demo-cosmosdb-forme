package com.example.democosmosdb.exercises;

import java.util.Arrays;
import java.util.List;

public class ParenthesisChallenge {

    public static void main(String[] args) {
        String parent = "(()))()))";
        isParenthesisValid(parent);
    }

    public static void isParenthesisValid (String parent) {
        List<String> arString = Arrays.stream(parent.split("")).toList();
        Long a = arString.stream().filter(s -> s.equals("(")).count();
        if(a == (parent.length())/2 ) {
            System.out.printf("cumple!");
        } else {
            System.out.printf("no cumple!");
        }
    }

}
