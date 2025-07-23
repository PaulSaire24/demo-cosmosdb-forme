package com.example.democosmosdb.pattern.abstractfactory;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        UserInterfaceFactory user = MakerFactory.getUser(color);
        return new UserInterface(user.getButton(),user.getScrollBar());
    }

}
