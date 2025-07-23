package com.example.democosmosdb.generics.deepdive;

import com.example.democosmosdb.generics.Apple;
import com.example.democosmosdb.generics.Box;
import com.example.democosmosdb.generics.Fruit;

public class AppGenericInheritance {

    public static void main(String[] args) {
        CardboardBox<Fruit> cardboardBox = new CardboardBox<>();

        Box<Fruit> fruitBox = new Box<>();

        fruitBox = cardboardBox; // Upcasting: CardboardBox is a Box

        cardboardBox = (CardboardBox<Fruit>) fruitBox; // Downcasting: Box to CardboardBox

        //inheretance of generics

        Box<Apple> appleBox = new Box<>();

        // fruitBox = appleBox; // no puede hacer el cast de appleBox a fruitBox ya que los tipos deben ser exactament iguales, Apple != Fruit

    }
}
