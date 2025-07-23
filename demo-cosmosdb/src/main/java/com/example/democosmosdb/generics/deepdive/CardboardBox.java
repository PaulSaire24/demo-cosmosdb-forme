package com.example.democosmosdb.generics.deepdive;

import com.example.democosmosdb.generics.Box;
import com.example.democosmosdb.generics.Boxable;

public class CardboardBox<T extends Boxable> extends Box<T> {

    @Override
    public Integer getTotalWeight() {
        return super.getTotalWeight() + 100;
    }

}
