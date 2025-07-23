package com.example.democosmosdb.pattern.strategy;

public class CheckoutPage {

    public void payWithPaymentMethod(Payment payment) {
        payment.pay();
    }
}
