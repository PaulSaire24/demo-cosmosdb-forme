package com.example.democosmosdb.patternexercises.exercises6;

public class App {
    public static void main(String[] args) {


      AdapterClient adapterClient1 =  new AdapterClient(new AdapterBancaLocal());
      adapterClient1.procesarPago(12.3, "primerpago1");

        AdapterClient adapterClient2 =  new AdapterClient(new AdapterPaypal());
        adapterClient2.procesarPago(12.3, "primerpago2");

        AdapterClient adapterClient3 =  new AdapterClient(new AdapterStripe());
        adapterClient3.procesarPago(12.3, "primerpago3");
    }
}
