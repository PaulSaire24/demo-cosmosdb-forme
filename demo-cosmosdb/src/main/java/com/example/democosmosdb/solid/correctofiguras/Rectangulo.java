package com.example.democosmosdb.solid.correctofiguras;

import lombok.Setter;

@Setter
public class Rectangulo implements Forma{

    private double largo;
    private double ancho;

    @Override
    public double getArea() {
        return largo * ancho;
    }
}
