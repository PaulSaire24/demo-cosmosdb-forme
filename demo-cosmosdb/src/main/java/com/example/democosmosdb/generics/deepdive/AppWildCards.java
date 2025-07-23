package com.example.democosmosdb.generics.deepdive;

//public class AppWildCards extends Box<?>{

import com.example.democosmosdb.generics.*;

public class AppWildCards {

    public static void main(String[] args) {

        //new Box<?>();
        //var box = BoxUtil<?>.emptyBox();

        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Effective Java", "Joshua Bloch", 15));
        bookBox.addItem(new Book("cold war", "Joshua Bloch", 6));
        //unbounded wildcards
        System.out.println("total of book: " + BoxUtil.getCountItem(bookBox));

        // upper bounded  wildcards

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Apple", "Red", 2));
        fruitBox.addItem(new Fruit("banana", "yellow", 4));
        System.out.println("average weight of fruits: " + Box.getAverageWeightOfFruit(fruitBox));
        Box<Boxable> boxableBox =  new Box<>();
        //Box.getAverageWeightOfFruit(boxableBox) // no se puede ya que debe ser la misma clase Fruit o una sub clase de ella

        //lower bounded  wildcards
        Box<Apple> appleBox =  new Box<>();
        Box.addAppleToBox(fruitBox);
        Box.addAppleToBox(appleBox);
        //Box.addAppleToBox(bookBox); // esto no es correcto
        

        

    }
}
