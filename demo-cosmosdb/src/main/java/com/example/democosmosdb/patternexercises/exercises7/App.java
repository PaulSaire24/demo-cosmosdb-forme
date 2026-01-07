package com.example.democosmosdb.patternexercises.exercises7;

public class App {
    public static void main(String[] args) {

        /*Debes implementar un sistema de interfaz de usuario (UI) donde algunos elementos sean contenedores (como un Panel) y otros sean elementos simples (como un Botón o un Texto).
                Todos deben compartir métodos comunes como render() y handleClick(), pero los contenedores deben poder agregar y gestionar hijos
        (que pueden ser otros contenedores o elementos simples).
        ¿Cómo diseñarías la jerarquía de clases para que el cliente pueda tratar a todos los elementos de manera uniforme,
                incluso cuando son estructuras anidadas complejas?*/


        Button button = new Button();
        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();
        Button button4 = new Button();
        Button button5 = new Button();

        
        Text text = new Text();
        Text text2 = new Text();
        Text text3 = new Text();
        Text text4 = new Text();
        Text text5 = new Text();
        Text text6 = new Text();

        Panel panel1 = new Panel();
        panel1.add(button);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(text);
        panel1.add(text2);
        panel1.add(text3);

        Panel panel2 = new Panel();
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(text4);
        panel2.add(text5);
        panel2.add(text6);

        Panel panel3 = new Panel();
        panel3.add(panel1);
        panel3.add(panel2);

        panel3.handleClick();
        panel3.render();


    }
}
