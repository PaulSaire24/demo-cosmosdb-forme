package com.example.democosmosdb.patternexercises.exercises3;

public class PdfDocument implements FactoryDocument {
    @Override
    public void execute() {
        System.out.println("is pdf");
    }
}
