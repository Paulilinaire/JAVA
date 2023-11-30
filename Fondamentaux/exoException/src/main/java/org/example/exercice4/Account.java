package org.example.exercice4;

public class Account {
    private float balance;
    public void deposit(float amount){
        balance=balance+amount;
    }
    public void withdraw(float amount)throws InsufficentBalanceException{
        if(amount>balance) throw new InsufficentBalanceException("Solde Insuffisant !");
        balance=balance-amount;
    }
    public float getSolde(){
        return balance;
    }
}
