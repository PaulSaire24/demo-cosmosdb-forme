package com.example.democosmosdb.generics;

public class BoxUtil {

    /*public static <T extends Boxable> int getCountItem(Box<T> box) { // metodo genérico declara fuera de la clase generica
        return box.getItems().size();
    }*/

    public static int getCountItem(Box<?> box){ // aqui si puedes usar wildcards porque no se usa directamente el tipo de parametro
        return box.getItems().size();
    }

    public static <T extends Boxable> Box<T> emptyBox(){
        return new Box<>();
    }
}
