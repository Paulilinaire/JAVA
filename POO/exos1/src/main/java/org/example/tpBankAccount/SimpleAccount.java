package org.example.tpBankAccount;

public class SimpleAccount extends Account {
    int overdraftValue;

    public SimpleAccount(long code, double balance, int overdraftValue) {
        super(code, balance);
        this.overdraftValue = overdraftValue;
    }
}

