package com.example.democosmosdb.patternexercises.exercises5;

public class OpenGLAdapter implements Draw {
    private OpenGL openGL;

    public OpenGLAdapter() {
        this.openGL = new OpenGL();
    }

    @Override
    public void DrawGraph() {
        openGL.DrawGraphWithglDrawMesh();
    }
}
