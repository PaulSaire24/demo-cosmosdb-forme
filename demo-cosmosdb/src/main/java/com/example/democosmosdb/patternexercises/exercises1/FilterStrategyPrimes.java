package com.example.democosmosdb.patternexercises.exercises1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrategyPrimes implements FilterStrategy {

    @Override
    public List<Integer> getfilter(List<Integer> data) {
        return data.stream().filter(this::isPrime).collect(Collectors.toList());
    }

    private boolean isPrime(Integer num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
