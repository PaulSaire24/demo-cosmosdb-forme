package com.example.democosmosdb.pattern.chainResponsibility;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = createChain();
        atm.dispense(request);
    }

    private static ATM createChain() {
        var euroATM = new EuroATM(null);
        var usDollarATM = new UsDollarATM(euroATM);
        return usDollarATM;
    }
}
