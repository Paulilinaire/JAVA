package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.enums.OperationStatus;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Account {
    private int id;
    private double balance;
    private Client client;
    private int idClient;
    private List<Operation> operations;

    public Account(int id, double balance, int idClient) {
        this.id = id;
        this.balance = balance;
        this.idClient = idClient;
    }

    public Account() {
    }

    public boolean deposit(Operation operation){
        if (operation.getAmount() < 0) {
            operations.add(operation);
            balance += operation.getAmount();
            return true;
        }
        return false;
    }

    public boolean withdrawl(Operation operation) {
       if (operation.getAmount() > 0 && getBalance() >= operation.getAmount()*-1) {
           operations.add(operation);
           balance -= operation.getAmount();
           return true;
       }
        return false;
    }

    public void showBalanceAndOperations() {
        System.out.println("Solde: " + balance);
        System.out.println("Opérations:");
        for (Operation operation : operations) {
            System.out.println(operation);
        }
    }
}
