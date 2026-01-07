package com.example.democosmosdb.patternexercises.exercises6;

public class AdapterBancaLocal extends BancaLocal implements Pay {

    @Override
    public void procesarPago(double monto, String datos) {
        super.requestXML(monto, datos);
    }
}
