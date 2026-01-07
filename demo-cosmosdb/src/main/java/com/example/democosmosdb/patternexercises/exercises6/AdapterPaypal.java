package com.example.democosmosdb.patternexercises.exercises6;

public class AdapterPaypal implements Pay {

    private Paypal paypal;

    public AdapterPaypal() {
        this.paypal = new Paypal();
    }

    @Override
    public void procesarPago(double monto, String datos) {
        paypal.processPayment(monto,datos);
    }
}
