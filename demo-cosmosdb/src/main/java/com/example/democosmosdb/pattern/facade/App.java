package com.example.democosmosdb.pattern.facade;

public class App {
    public static void main(String[] args) {

       /* var client = new Client();
        client.connectToServer();

        var clientServer = new ClientServer();
        clientServer.authenticateClient();
        clientServer.routeToRecipient();

        var recipientServer = new RecipientServer();
        recipientServer.authenticateRecipient();
        recipientServer.sendMessage();

        var recipient = new Recipient();
        recipient.receiveMessage();*/

        FacadeAppRunner.runner(); // tambien podria no ser estatic, ya dependiendo de como se quiera usar

    }
}
