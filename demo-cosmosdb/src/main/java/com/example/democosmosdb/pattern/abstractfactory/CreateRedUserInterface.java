package com.example.democosmosdb.pattern.abstractfactory;

public class CreateRedUserInterface implements UserInterfaceFactory{
    @Override
    public Button getButton() {
        return new RedButton();
    }

    @Override
    public ScrollBar getScrollBar() {
        return new RedScrollBar();
    }
}
