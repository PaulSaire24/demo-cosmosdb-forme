package com.example.democosmosdb.patternexercises.exercises5;

public class App {


    public static void main(String[] args) {

       /* Estás desarrollando un motor de renderizado que debe funcionar con diferentes APIs gráficas (OpenGL, DirectX, Vulkan). Cada API tiene sus propias funciones para dibujar formas geométricas, pero los nombres y parámetros son distintos. Por ejemplo:

        OpenGL usa glDrawMesh(...)

        DirectX usa device->RenderMesh(...)

        Vulkan usa vkCmdDrawMesh(...)

        Tu sistema debe permitir que el código cliente dibuje formas sin preocuparse por la API subyacente. ¿Cómo estructurarías las clases/interfaces para unificar el acceso a estas funciones dispares?

*/
        Draw draw = new OpenGLAdapter();
        var drawClient = new DrawClient(draw);
        drawClient.drawImage();

        Draw directX = new AdapterDirectX();
        var drawClient2 = new DrawClient(directX);
        drawClient2.drawImage();
    }
}
