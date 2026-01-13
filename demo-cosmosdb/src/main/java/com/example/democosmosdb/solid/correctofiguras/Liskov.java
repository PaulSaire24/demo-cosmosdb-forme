package com.example.democosmosdb.solid.correctofiguras;

public class Liskov {

    public static void main(String[] args) {
        //aqui vemos la correcta aplicacion de Liskov, crear una interface que calcule el area
        // no debes hacer herencia entre cuadrado y rectangulo ya que la forma de calcular el area
        //se comporta de manera diferente

        Cuadrado c = new Cuadrado();
        c.setLado(4);
        System.out.println(c.getArea());

        Rectangulo r = new Rectangulo();
        r.setAncho(4);
        r.setLargo(7);
        System.out.println(r.getArea());
    }
}
