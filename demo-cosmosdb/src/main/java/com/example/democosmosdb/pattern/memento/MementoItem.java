package com.example.democosmosdb.pattern.memento;

public class MementoItem {
    private int price;

    public MementoItem(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
