package com.example.democosmosdb.generics;

public class AppGeneric {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Book("Effective Java", "Joshua Bloch", 15));
        bookBox.addItem(new Book("cold war", "Joshua Bloch", 6));
        System.out.println(bookBox.getLastItem());
        System.out.println("number of items in bookBox: " + BoxUtil.getCountItem(bookBox));
        System.out.println("total weight of bookBox: " + bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Apple", "Red", 2));
        fruitBox.addItem(new Fruit("banana", "yellow", 4));
        System.out.println(fruitBox.getLastItem());
        System.out.println("number of items in fruitBox: " + BoxUtil.getCountItem(fruitBox));
        System.out.println("total weight of fruitBox: " + fruitBox.getTotalWeight());


    }
}
