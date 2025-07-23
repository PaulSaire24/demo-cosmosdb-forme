package com.example.democosmosdb.pattern.strategy;

public interface Payment {
    void pay();

    Payment paymentByCard = () -> System.out.println("Payment made with card");
    Payment paymentByBankTransfer = () -> System.out.println("Payment made by bank transfer");
}
