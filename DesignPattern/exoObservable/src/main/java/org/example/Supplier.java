package org.example;

public class Supplier implements Observer {
    @Override
    public void update(int newStockLevel) {
        System.out.println("Supplier notify with new stock level " + newStockLevel);
    }
}
