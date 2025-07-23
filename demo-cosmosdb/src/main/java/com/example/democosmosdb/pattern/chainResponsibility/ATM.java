package com.example.democosmosdb.pattern.chainResponsibility;

public abstract class ATM {

    public final ATM nextATM;

    public ATM(ATM nextATM) {
        this.nextATM = nextATM;
    }

    public abstract void dispense(WithdrawalRequest request);
}
