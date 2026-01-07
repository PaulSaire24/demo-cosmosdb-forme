package com.example.democosmosdb.patternexercises.exercises1;

import java.util.List;

public class DataProcessor {
    private FilterStrategy filterStrategy;

    public void setFilterStrategy(FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public List<Integer>
    getFilter(List<Integer> data) {
        return filterStrategy.getfilter(data);
    }
}
