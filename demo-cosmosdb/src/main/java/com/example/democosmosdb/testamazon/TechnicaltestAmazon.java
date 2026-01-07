package com.example.democosmosdb.testamazon;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class TechnicaltestAmazon {

    public static void main(String[] args) {

        List<Integer> movieDuraton = List.of(10,25,35,40,51,66,81);
        System.out.println(foo(120,movieDuraton));
    }

    public static List<Integer> foo(Integer flighDuration, List<Integer> movieDuration) {

        List<Integer> listFinal =  new ArrayList<>();
        Integer realmovieDuration =  flighDuration - 30;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<movieDuration.size(); i++) {
            for (int j=i+1; j<movieDuration.size(); j++){
                if(movieDuration.get(i) + movieDuration.get(j) == realmovieDuration) {
                    result.add(i);
                    result.add(j);
                }
            }
        }

        if (result.isEmpty()) {
            listFinal.add(-1);
            listFinal.add(-1);
            return listFinal;
        }

        List<Integer> sumaValue = new ArrayList<>();
        if (result.size()>=4) {
            for(int i = 0; i<=result.size()-2; i+=2) {
                sumaValue.add(Math.abs(movieDuration.get(result.get(i))-movieDuration.get(result.get(i+1))));
            }

            OptionalInt value = sumaValue.stream().mapToInt(p->p).max();


            for(int i = 0; i<sumaValue.size(); i++) {
                if (value.getAsInt() == sumaValue.get(i)) {
                    listFinal.add(result.get(i*2));
                    listFinal.add(result.get(i*2+1));
                    return listFinal;
                }
            }
        }

        listFinal.add(result.get(0));
        listFinal.add(result.get(1));
        return listFinal;
    }
}
