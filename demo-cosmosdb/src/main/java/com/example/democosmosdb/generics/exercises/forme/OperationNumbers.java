package com.example.democosmosdb.generics.exercises.forme;

import java.util.ArrayList;
import java.util.List;

public class OperationNumbers<T extends Number> {
    private List<T> numbers;

    public OperationNumbers() {
        this.numbers = new ArrayList<>();
    }

    public List<T> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<T> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "OperationNumbers{" +
                "numbers=" + numbers +
                '}';
    }
}
