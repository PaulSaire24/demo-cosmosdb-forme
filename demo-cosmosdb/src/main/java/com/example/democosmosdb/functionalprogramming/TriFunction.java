package com.example.democosmosdb.functionalprogramming;

public interface TriFunction<R, S, T, V> {
    V apply(R r, S s, T t);
}
