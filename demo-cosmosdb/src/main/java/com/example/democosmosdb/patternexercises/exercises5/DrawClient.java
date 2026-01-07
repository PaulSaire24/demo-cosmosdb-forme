package com.example.democosmosdb.patternexercises.exercises5;

public class DrawClient {
    private Draw draw;

    public DrawClient(Draw draw) {
        this.draw = draw;
    }

    public void drawImage() {
        draw.DrawGraph();
    }
}
