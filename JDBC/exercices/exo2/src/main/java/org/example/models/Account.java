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

    public void withdrawl(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            operations.add(new Operation(amount, OperationStatus.WITHDRAWL));
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void showBalanceAndOperations() {
        System.out.println("Solde: " + balance);
        System.out.println("Opérations:");
        for (Operation operation : operations) {
            System.out.println(operation);
        }
    }
}
