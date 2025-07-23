package com.example.democosmosdb.pattern.strategy;

public class App {
    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();
        checkoutPage.payWithPaymentMethod(Payment.paymentByCard);
        checkoutPage.payWithPaymentMethod(Payment.paymentByBankTransfer);

    }
}
