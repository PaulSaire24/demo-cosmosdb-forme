package com.example.democosmosdb.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> { // esto delimita que T debe ser un tipo que implemente la interfaz Boxable

    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public void addItem(T item) { //METODO generico dentro de la clase generica
        this.items.add(item);
    }

    public T getLastItem() { // METODO generico dentro de la clase generica
        return this.items.get(items.size()-1);
    }

    public Integer getTotalWeight() {
        return items.stream().mapToInt(Boxable::getWeight).sum();// el mapToInt es un metodo de la interfaz Stream que permite transformar los elementos de la lista en enteros
    }

    public static <T extends Boxable> Box<T> of(T t) { // declaras el bounded <T extends Boxable>  ya que el metodo es estatico
        Box<T> box =  new Box<>();
        box.addItem(t);
        return box;
    }

    public static Double getAverageWeightOfFruit(Box<? extends Fruit> box){
        return box.getItems().stream().mapToDouble(Boxable::getWeight).sum()/BoxUtil.getCountItem(box);
    }

    public static void addAppleToBox(Box<? super Apple> box){
        box.addItem(new Apple("green","apple any",45 ));
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}
