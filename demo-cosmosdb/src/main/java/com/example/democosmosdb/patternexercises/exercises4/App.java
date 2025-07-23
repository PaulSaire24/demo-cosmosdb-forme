package com.example.democosmosdb.patternexercises.exercises4;

public class App {

    public static void main(String[] args) {

        /*Problema 4: Personalización de Café
        En una aplicación de cafetería, los clientes pueden personalizar su café con añadidos (leche, azúcar, crema, canela, etc.). Cada añadido incrementa el precio y modifica la descripción del café.
        Requisitos:

        Los añadidos deben poder combinarse en cualquier orden.

        La descripción final debe reflejar todos los añadidos (ej: "Café negro + leche + azúcar").

        El precio debe calcularse dinámicamente según los añadidos.

        Pregunta clave: ¿Qué patrón permite añadir funcionalidades de forma modular?*/

        CoffeDecoration coffe = new Cream(new Milk(new Sugar(new BaseCoffe())));
        System.out.println(coffe.getDescription());
        System.out.println(coffe.getPrice());
    }
}
