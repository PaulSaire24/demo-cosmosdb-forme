package com.example.democosmosdb.solid.correctofiguras;

import lombok.Setter;

@Setter
public class Cuadrado implements Forma {
    private double lado;

    @Override
    public double getArea() {
        return lado * lado;
    }
}
