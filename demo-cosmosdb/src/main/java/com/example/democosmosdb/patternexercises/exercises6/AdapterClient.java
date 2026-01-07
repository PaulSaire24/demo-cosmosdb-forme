package com.example.democosmosdb.patternexercises.exercises6;

public class AdapterClient {
    private Pay pay;

    public AdapterClient(Pay pay) {
        this.pay = pay;
    }

    public void procesarPago(double monto, String datos) {
        pay.procesarPago(monto,datos);
    }
}
