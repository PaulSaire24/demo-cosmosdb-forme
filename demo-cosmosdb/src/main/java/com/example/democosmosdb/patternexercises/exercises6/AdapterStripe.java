package com.example.democosmosdb.patternexercises.exercises6;

public class AdapterStripe extends Stripe implements Pay {

    @Override
    public void procesarPago(double monto, String datos) {
        super.charge(monto,datos);
    }
}
