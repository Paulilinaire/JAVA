package org.example.exercice4;

public class Exercice4 {
    public static void insufficientBalance() {
        Account account = new Account();
        try {
            account.withdraw(3000);
        }catch (InsufficentBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
