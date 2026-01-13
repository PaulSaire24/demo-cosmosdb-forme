package com.example.democosmosdb.patternexercises.template;

public abstract class MakePizza {

    public final void preparePizza() {
        makeBase();
        addToppin();
        cook();
    }

    public void makeBase() { // ojo este metodo podrias sobreescribir pero no es obligatorio
        System.out.println("make base of pizza");
    }

    public abstract void addToppin(); // este si o si debes sobreescribir

    public void cook() {
        System.out.println("cook the pizza");
    }
}
