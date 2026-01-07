package com.example.democosmosdb.patternexercises.exercises5;

public class AdapterDirectX implements Draw {

    private DirectX directX;

    public AdapterDirectX() {
        this.directX = new DirectX();
    }

    @Override
    public void DrawGraph() {
        directX.DrawGraphWithRenderMesh();
    }
}
