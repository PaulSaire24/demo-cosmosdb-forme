package com.example.democosmosdb.patternexercises.exercises2;

public class App {
    public static void main(String[] args) {

        /*Debes crear un sistema de notificaciones donde cada notificación puede ser enviada por múltiples medios (email, SMS, Slack, etc.), y estos medios pueden combinarse (ej: email + SMS).
        Requisitos:

        Cada medio de notificación debe poder añadirse o removerse dinámicamente.

        El costo total de la notificación debe calcularse sumando los costos individuales de cada medio.

        Pregunta clave: ¿Cómo manejarías la combinación flexible de medios?*/

        SendNotification sendNotification = new Slack(new Sms(new EmptyNotifier()));
        sendNotification.sent("UNI");
        System.out.println(sendNotification.getPrice());
        System.out.println();

        SendNotification sendNotification1 =  new Email(new Sms(new Slack(new EmptyNotifier())));
        sendNotification1.sent("SOAINT");
        System.out.println(sendNotification1.getPrice());
    }
}
