package com.example.democosmosdb.pattern.memento;

public class Item {

    private int price;
    private MementoItem mementoItem =  new MementoItem(price);

    public Item(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void save() {
        mementoItem.setPrice(price);
    }

    public void undo() {
        setPrice(mementoItem.getPrice());
    }

}
