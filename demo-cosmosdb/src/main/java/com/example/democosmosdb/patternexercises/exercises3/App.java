package com.example.democosmosdb.patternexercises.exercises3;

public class App {
    public static void main(String[] args) {
        FactoryDocument factoryDocument = FactoryApplication.getDocument("pdf");
        factoryDocument.execute();

        FactoryDocument factoryDocument1 = FactoryApplication.getDocument("html");
        factoryDocument1.execute();

        FactoryDocument factoryDocument2 = FactoryApplication.getDocument("markdown");
        factoryDocument2.execute();
    }
}
