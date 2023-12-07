package org.example;

public class StockManager implements Observer{
    @Override
    public void update(int newStockLevel) {
        System.out.println("Stock Manager notify with new stock level : " + newStockLevel);
    }
}
