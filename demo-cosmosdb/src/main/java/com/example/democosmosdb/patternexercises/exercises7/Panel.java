package com.example.democosmosdb.patternexercises.exercises7;

import java.util.ArrayList;
import java.util.List;

public class Panel implements UIComponent {

    private List<UIComponent> listElement = new ArrayList<>();

    public void add(UIComponent UIComponent) {
        listElement.add(UIComponent);
    }

    @Override
    public void render() {
        listElement.forEach(UIComponent::render);
    }

    @Override
    public void handleClick() {
        listElement.forEach(UIComponent::handleClick);
    }
}
