package com.example.democosmosdb.pattern.adapter;

public class App {
    public static void main(String[] args) {
        var englishLocalizedMessage = new EnglishLocalizedMessage();
        var englishGreeting = new Greeting(englishLocalizedMessage);
        englishGreeting.print();


        LocalizedMessageAdapter localizedMessageAdapter =  new LocalizedMessageAdapter();
        var englishGreeting2 = new Greeting(localizedMessageAdapter);
        englishGreeting2.print();

        FrenchLocalizedAdapter fre =  new FrenchLocalizedAdapter();
        var englishGreeting3 = new Greeting(fre);
        englishGreeting3.print();


    }
}
