package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.enums.OperationStatus;

@Data
@AllArgsConstructor
public class Operation {
    private int id;
    private double amount;
    private OperationStatus status;

    public Operation(double amount, OperationStatus status) {
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Opération #" + id + ": Montant = " + amount + ", Statut = " + status;
    }

}
