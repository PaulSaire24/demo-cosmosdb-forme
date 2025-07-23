package com.example.democosmosdb.pattern.abstractfactory;

public class CreateBlueUserInterface implements UserInterfaceFactory{
    @Override
    public Button getButton() {
        return new BlueButton();
    }

    @Override
    public ScrollBar getScrollBar() {
        return new BlueScrollBar();
    }
}
