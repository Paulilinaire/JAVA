package org.example;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        StockManager stockManager = new StockManager();
        Supplier supplier = new Supplier();

        product.registerObserver(stockManager);
        product.registerObserver(supplier);

        product.setStockLevel(50);

        product.setStockLevel(100);
        product.removeObserver(supplier);
        product.setStockLevel(70);
    }

}