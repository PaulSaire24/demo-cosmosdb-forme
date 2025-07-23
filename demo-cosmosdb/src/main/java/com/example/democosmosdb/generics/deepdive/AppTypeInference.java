package com.example.democosmosdb.generics.deepdive;

import com.example.democosmosdb.generics.*;

public class AppTypeInference {

    public static void main(String[] args) {

        //Double number = pickOne(1, 1.25); // este falla porque no se puede inferir el tipo de dato, ya que 1 es un Integer y 1.25 es un Double
        //Integer number2 = pickOne(1, 1.25); // este falla porque no se puede inferir el tipo de dato, ya que 1 es un Integer y 1.25 es un Double
        Number number3 = pickOne(1, 1.25); // este funciona porque Number es el supertipo de Integer y Double

        Apple apple = new Apple("red", "apple", 100);
        Fruit fruit = new Fruit("green", "banana", 150);

        Fruit fruit2 = pickOne(apple, fruit); // funciona porque Apple es un subtipo de Fruit, puede predecir el tipo de dato como Fruit

        Boxable fruitPicked = pickOne(apple, fruit); // funciona porque Fruit implementan la interfaz Boxable, puede predecir el tipo de dato como Boxable

        // type inference with instantiation

        Box<Fruit> fruitBox = new Box<>(); // el compilador infiere que T es Fruit, no es necesario especificar el tipo de dato

        // type inference with method arguments

        var box = Box.of(fruit);
        var anotherBox =  Box.of(apple);

        // type inference with target type
        var emptyBox = BoxUtil.emptyBox(); // en este caso emptyBox es de tipo Box<Boxable>
        Box<Fruit> fruitBox1 =  BoxUtil.emptyBox(); // es de tipo Box<Fruit>, ya que es como poner: new Box<>(), ya que es eso lo que devuelve BoxUtil.emptyBox()


    }

    public static <T> T pickOne(T t1, T t2) {
        if (Math.random()>0.5) {
            return t1;
        }
        return t2;
    }
}
