package com.example.democosmosdb.patternexercises.exercises1;

import java.util.List;
import java.util.stream.Collectors;

public class FIlterGreaterThan10 implements FilterStrategy {

    @Override
    public List<Integer> getfilter(List<Integer> data) {
        return data.stream().filter(p -> p>10).collect(Collectors.toList());
    }
}
