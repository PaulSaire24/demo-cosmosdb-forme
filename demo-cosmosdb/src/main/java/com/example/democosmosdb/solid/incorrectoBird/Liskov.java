package com.example.democosmosdb.solid.incorrectoBird;

public class Liskov {
    public static void main(String[] args) {
        Bird b = new Penguin();
        b.fly(); // error en a aplicacion de Liskov, porque penguin no puede comportase como un Bird que vuela

    }
}
