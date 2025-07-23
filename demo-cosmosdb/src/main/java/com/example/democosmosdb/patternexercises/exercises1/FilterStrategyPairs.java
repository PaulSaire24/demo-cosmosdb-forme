package com.example.democosmosdb.patternexercises.exercises1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrategyPairs implements FilterStrategy {

    @Override
    public List<Integer> getfilter(List<Integer> data) {
        return data.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
    }
}
